package io.micrc.core.annotations.message;

import io.micrc.core.annotations.message.rabbit.RabbitEvent;

import java.lang.annotation.*;

/**
 * 所需发送领域事件
 *
 * @author tengwang
 * @date 2022/8/31 14:28
 * @since 0.0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface DomainEvents {

    /**
     * 完成后会发出的事件类型
     *
     * @return event[]
     */
    Event[] events() default {};

}
