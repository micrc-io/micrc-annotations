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
public @interface EventMapping {

    /**
     * 映射转换Key - 以对端用例英文名做key
     *
     * @return
     */
    String mappingKey();

    /**
     * 对端映射文件地址
     *
     * @return
     */
    String mappingPath();

    /**
     * 接收方地址
     *
     * @return
     */
    String receiverAddress();

    /**
     * 批量模型
     *
     * @return
     */
    String batchModel() default "";
}
