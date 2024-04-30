package io.micrc.core.annotations.integration.runner;

import java.lang.annotation.*;

/**
 * 程序适配器
 *
 * @author hyosunghan
 * @date 2022/9/14 11:16
 * @since 0.0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface RunnerAdapter {

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
    String routeProtocol() default "runner";

    /**
     * 自定义
     *
     * @return boolean
     */
    boolean custom() default false;

    /**
     * 执行文件地址
     *
     * @return String
     */
    String executePath();
}
