package io.micrc.core.annotations.application.businesses;

import java.lang.annotation.*;

/**
 * 衍生集成注解
 *
 * @author tengwang
 * @date 2022/8/31 14:28
 * @since 0.0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface DeriveIntegration {

    /**
     * openApi协议
     *
     * @return
     */
    String protocolPath();

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
     * 批处理标记
     *
     */
    boolean batchFlag() default false;

    /**
     * 参数处理顺序,优化处理速度
     *
     * @return
     */
    int order() default Integer.MAX_VALUE;
}
