package MVCConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration.class)
@ImportResource("classpath:Spring-servlet.xml")
public class SpringMvcApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcApplication.class, args);
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

    }
}