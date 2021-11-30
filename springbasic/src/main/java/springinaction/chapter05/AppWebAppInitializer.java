//package springinaction.chapter05;
//
//import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//
//public class AppWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
//    @Override
//    protected String[] getServletMappings() {
//        return new String[]{"/"};
//    }
//
//    @Override
//    protected Class<?>[] getRootConfigClasses() {
//        // ContextLoaderListener Context 설정 사용
//        return new Class<?>[]{RootConfig.class};
//    }
//
//    @Override
//    protected Class<?>[] getServletConfigClasses() {
//        // DispatcherServlet App Context Pin 정의
//        return new Class<?>[]{WebConfig.class};
//    }
//}
