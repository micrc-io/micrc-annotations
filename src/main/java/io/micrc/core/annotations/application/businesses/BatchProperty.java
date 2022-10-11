package io.micrc.core.annotations.application.businesses;

import java.lang.annotation.*;

/**
 * 批量属性标识
 *
 * @author tengwang
 * @date 2022/10/11 16:56
 * @since 0.0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface BatchProperty {
}
