package io.micrc.core.annotations.application.businesses;

import java.lang.annotation.*;

/**
 * 业务服务适配器注解
 *
 * @author tengwang
 * @version 1.0.0
 * @date 2022/9/5 10:45
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface CommandAdapter {

    /**
     * 应用服务名称 - 类简写名(SimpleName)
     *
     * @return
     */
    String serviceName();

    /**
     * 执行根实体
     *
     * @return
     */
    String rootEntityName();

    /**
     * 该业务服务适配时所含概念
     *
     * @return
     */
    Conception[] conceptions() default {};

    /**
     * 对外提供服务的协议文件
     *
     * @return
     */
    String protocolPath();
}
