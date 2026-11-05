package org;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        {

        "org.alice",
        "org.kim.albert"
        }
)
public class AppConfig {
}
