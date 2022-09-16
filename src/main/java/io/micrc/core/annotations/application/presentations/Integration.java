package io.micrc.core.annotations.application.presentations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 集成
 *
 * @author hyosunghan
 * @date 2022/9/4 11:39
 * @since 0.0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
@Documented
public @interface Integration {

    /**
     * openApi协议，集成场景专用协议，参数来源于x-integrate-mapping
     *
     * @return
     */
    String protocol();

    /**
     * 参数名称，即集成结果对应的存储名称
     *
     * @return
     */
    String name();
}
