package org.kevin;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import ecdmit.restdao.ext.internal.EcdmLoginInfoImpl;

@Configuration
@ComponentScan(
        {
                "ecdmit.restdao.ext.internal",
                "vmdmit.it.storages.internal"

        }
)
public class AppConfig {
}
