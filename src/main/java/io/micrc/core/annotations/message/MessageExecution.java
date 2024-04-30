package io.micrc.core.annotations.message;

import java.lang.annotation.*;

/**
 * 消息监听执行器. 消息监听实现类执行方法切面注解
 * io.micrc.core.application.message.MessageConsumeRouterExecution切面的自定义注解.
 *
 * @author tengwang
 * @date 2022-09-18 21:22
 * @since 0.0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface MessageExecution {
    String value();
}
