package scalaDemo.configuration

import javax.servlet.annotation.WebServlet
import org.springframework.boot.web.servlet.ServletRegistrationBean
import org.springframework.context.annotation.{Bean, Configuration}


@Configuration
class H2Config {
  @Bean def h2servletRegistration(): ServletRegistrationBean = {
    val registrationBean = new ServletRegistrationBean(new WebServlet)
    registrationBean.addUrlMappings("/console/*")
    return registrationBean
  }
}