package cf.demo.restservice;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@Configuration
//@EnableAutoConfiguration
////@EnableEurekaClient
//@EnableDiscoveryClient
@RestController
public class GreetingService {


  @Value("${app.name}")
  private String app;
  @Value("${db.nameType}")
  private String dbName;
  @Value("${alias.name}")
  private String aliasName;

  @RequestMapping("/api/greeting")
  public String greeting() {
    return "App-profile: @" + app + " [db-name]: @" + dbName + " [config]: @" + aliasName;
  }
}
