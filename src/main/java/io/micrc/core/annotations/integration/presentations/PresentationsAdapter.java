package io.micrc.core.annotations.integration.presentations;

import java.lang.annotation.*;

/**
 * 展示适配器
 *
 * @author hyosunghan
 * @date 2022/9/14 11:16
 * @since 0.0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface PresentationsAdapter {

    /**
     * 请求映射文件
     *
     * @return String
     */
    String requestMappingFile() default "";

    /**
     * 响应映射文件
     *
     * @return String
     */
    String responseMappingFile() default "";

    /**
     * 服务名称，指定提供服务的类名
     *
     * @return String
     */
    String serviceName();

    /**
     * 协议类型 - 适配器路由
     *
     * @return String
     */
    String routeProtocol() default "query";

    /**
     * 自定义
     *
     * @return boolean
     */
    boolean custom() default false;

    /**
     * 对外提供服务的协议文件
     *
     * @return String
     */
    String protocolPath();
}
