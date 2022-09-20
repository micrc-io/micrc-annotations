package io.micrc.core.annotations.application.derivations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

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
     * 自定义
     *
     * @return
     */
    boolean custom() default false;
}
