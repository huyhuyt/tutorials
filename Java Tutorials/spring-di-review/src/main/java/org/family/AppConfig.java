package org.family;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
//@EnableAsync
@ComponentScan({
        "org",
        "org.kevin",
        "org.common",
        "org.albert"
})
public class AppConfig {
}
