package vmdmit.it.recovery;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Lazy
@PropertySource(value="classpath:recovery/Configs.properties", ignoreResourceNotFound = true)
@ComponentScan(
        {
                "vmdmit.it.vmdmrecovery.internal",
                "vmdmit.it.vmdmapi.internal",
                "vmdmit.it.coreecdmapi.utils.internal",
                "vmdmit.it.coreecdmapi.internal",
                "vmdmit.it.protection.internal",
                "vmdmit.it.vsphere.rest.utils.internal"
        }
)
public class RecoveryConfig {
}
