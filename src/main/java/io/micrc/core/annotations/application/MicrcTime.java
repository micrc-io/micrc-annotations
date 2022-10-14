package io.micrc.core.annotations.application;

import java.lang.annotation.*;

/**
 * Long时间字段标识
 *
 * @author tengwang
 * @date 2022/10/11 16:56
 * @since 0.0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface MicrcTime {
}
