package kumamon.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"kumamon.controller","kumamon.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
