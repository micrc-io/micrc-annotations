package io.micrc.core.annotations.application.businesses;

import java.lang.annotation.*;

/**
 * 命令逻辑
 *
 * @author tengwang
 * @version 1.0.0
 * @date 2022/8/31 14:28
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface CommandLogic {

    /**
     * 调用Logic时以Command为根的映射逻辑
     *
     * @return
     */
    LogicMapping[] toLogicMappings();

    /**
     * 将Logic执行结果转换至Target的
     *
     * @return
     */
    TargetMapping[] toTargetMappings();

    /**
     * command的target的集成Id的位置,根为command
     *
     * @return
     */
    String targetIdPath() default "";
}
