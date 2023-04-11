package io.micrc.core.annotations.integration.runner;

import java.lang.annotation.*;


/**
 * 程序执行器. 程序执行器run方法切面注解
 * 当其实现的接口的RunnerAdapter注解为非自定义实现时(default)，这个切面会执行由接口注解生成的路由而不执行方法逻辑
 *
 * @author xwyang
 * @date 2023-04-10 14:22
 * @since 0.0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface RunnerExecution {
}
