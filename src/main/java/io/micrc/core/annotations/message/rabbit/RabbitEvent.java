package io.micrc.core.annotations.message.rabbit;

import java.lang.annotation.*;

/**
 * 所需发送领域事件
 *
 * @author tengwang
 * @date 2022/8/31 14:28
 * @since 0.0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
@Documented
public @interface RabbitEvent {

    /**
     * 事件名称
     *
     * @return
     */
    String eventName();

    /**
     * 发送聚合名称-类简写名称-ExchangeName
     *
     * @return
     */
    String aggregationName();

    /**
     * 接收通道-channel-使用消费方LogicName
     *
     * @return
     */
    String channel();

    /**
     * 对端映射文件地址
     *
     * @return
     */
    String mappingPath();

    /**
     * 是否顺序发送
     *
     * @return
     */
    boolean ordered() default false;

}
