package io.micrc.core.annotations.application.derivations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 衍生服务执行器. 衍生服务实现类执行方法切面注解
 * io.micrc.core.application.derivations.DerivationsExecution切面的自定义注解.
 * 当其实现的接口的DerivationsService注解为非自定义实现时(default)，这个切面会执行由接口注解生成的路由而不执行方法逻辑
 *
 * @author hyosunghan
 * @date 2022-09-27 10:54
 * @since 0.0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface DerivationsExecution {
}
