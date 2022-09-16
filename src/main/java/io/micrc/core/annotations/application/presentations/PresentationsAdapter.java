package io.micrc.core.annotations.application.presentations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

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
     * 服务名称，指定提供服务的类名
     *
     * @return
     */
    String serviceName();
}
