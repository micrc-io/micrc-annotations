package io.micrc.core.annotations.integration.derivation;

import java.lang.annotation.*;

/**
 * 衍生适配器
 *
 * @author hyosunghan
 * @date 2022/9/20 09:30
 * @since 0.0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface DerivationsAdapter {

    /**
     * 服务名称，指定提供服务的类名
     *
     * @return
     */
    String serviceName();

    /**
     * 协议类型
     *
     * @return
     */
    String routeProtocol() default "derivations";

    /**
     * 自定义
     *
     * @return
     */
    boolean custom() default false;

    /**
     * 对外提供服务的协议文件
     *
     * @return
     */
    String protocolPath();
}
