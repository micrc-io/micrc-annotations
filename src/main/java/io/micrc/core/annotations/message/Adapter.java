package io.micrc.core.annotations.message;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Adapter {

    /**
     * 业务服务全路径
     *
     * @return string
     */
    String commandServicePath();

    /**
     * 事件名称
     *
     * @return string
     */
    String eventName();

    /**
     * 主题名称
     *
     * @return string
     */
    String topicName();
}
