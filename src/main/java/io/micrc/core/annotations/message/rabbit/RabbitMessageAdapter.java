package io.micrc.core.annotations.message.rabbit;

import java.lang.annotation.*;

/**
 * 消息适配器注解
 *
 * @author tengwang
 * @date 2022/9/5 10:45
 * @since 0.0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface RabbitMessageAdapter {

    /**
     * 是否启用自定义实现
     *
     * @return
     */
    boolean custom() default false;

    /**
     * 协议类型
     *
     * @return
     */
    String routeProtocol() default "message";

    /**
     * 交换区名称 - 发送方根实体名称
     *
     * @return
     */
    String exchangeName();

    /**
     * 逻辑名 - 应用服务类简写名(SimpleName)去除Service
     *
     * @return
     */
    String logicName();

    /**
     * 执行根实体
     *
     * @return
     */
    String rootEntityName();

    /**
     * 事件名称
     *
     * @return
     */
    String eventName();

    /**
     * 是否顺序消费
     *
     * @return
     */
    boolean ordered() default false;
}
