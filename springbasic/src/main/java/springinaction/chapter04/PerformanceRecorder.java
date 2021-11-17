package springinaction.chapter04;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Aspect
public class PerformanceRecorder {
    private Map<Integer, Integer> trackCountMap = new HashMap<>();

    @Pointcut("execution(* springinaction.chapter04.Performance.play(int)) && args(track)")
    public void playTrack(int track) {
    }

    @Before("playTrack(track)")
    public void record(int track) {
        Integer savedCount = Optional.ofNullable(trackCountMap.get(track)).orElse(0);
        Integer updateCount = savedCount + 1;
        trackCountMap.put(track, updateCount);
        System.out.println("record track=" + track + " count=" + updateCount);
    }
}
