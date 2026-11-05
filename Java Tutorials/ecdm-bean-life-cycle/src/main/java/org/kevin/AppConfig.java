package org.kevin;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({
        "ecdmit.restdao.ext.internal"
})
public class AppConfig {
}
