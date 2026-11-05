package vmdmit.it.coreecdmapi.internal;

import jakarta.inject.Named;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import vmdmit.it.coreecdmapi.BaseService;

@Named("baseService")
@Primary
@Lazy
public class BaseServiceImpl implements BaseService {

}
