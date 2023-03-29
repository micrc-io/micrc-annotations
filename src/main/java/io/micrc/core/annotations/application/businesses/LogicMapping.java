package io.micrc.core.annotations.application.businesses;

import java.lang.annotation.*;

/**
 * 入逻辑参数转换
 *
 * @author tengwang
 * @date 2022/8/31 14:28
 * @since 0.0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
@Documented
public @interface LogicMapping {

    /**
     * 映射键
     *
     * @return
     */
    String name();

    /**
     * 映射文件
     *
     * @return
     */
    String paramMappingFile();
}
