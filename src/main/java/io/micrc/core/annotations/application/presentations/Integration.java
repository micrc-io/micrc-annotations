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
     * @return string
     */
    String protocol();

    /**
     * 请求映射文件
     *
     * @return string
     */
    String requestMappingFile() default "";

    /**
     * 响应映射文件
     *
     * @return string
     */
    String responseMappingFile() default "";

    /**
     * 参数名称，即集成结果对应的存储名称
     *
     * @return string
     */
    String name();

    /**
     * 参数处理顺序,优化处理速度
     *
     * @return int
     */
    int order() default Integer.MAX_VALUE;

    /**
     * 参数不存在则忽略
     *
     * @return boolean
     */
    boolean ignoreIfParamAbsent() default false;
}
