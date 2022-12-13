package io.micrc.core.annotations.message;

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
public @interface Event {

    /**
     * 主题名称
     *
     * @return
     */
    String topicName();

    /**
     * 事件名称
     *
     * @return
     */
    String eventName();

    EventMapping[] mappings();

}
