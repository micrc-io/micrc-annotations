package io.micrc.core.annotations.integration.command;

import java.lang.annotation.*;

/**
 * 业务服务适配器注解
 *
 * @author tengwang
 * @date 2022/9/5 10:45
 * @since 0.0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface CommandAdapter {

    /**
     * 请求映射文件
     *
     * @return
     */
    String requestMappingFile() default "";

    /**
     * 响应映射文件
     *
     * @return
     */
    String responseMappingFile() default "";

    /**
     * 是否启用自定义实现
     *
     * @return
     */
    boolean custom() default false;

    /**
     * 协议类型
     *
     * @return
     */
    String routeProtocol() default "command";

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

//    /**
//     * 该业务服务适配时所含概念
//     *
//     * @return
//     */
//    Conception[] conceptions() default {};

    /**
     * 对外提供服务的协议文件
     *
     * @return
     */
    String protocolPath();
}
