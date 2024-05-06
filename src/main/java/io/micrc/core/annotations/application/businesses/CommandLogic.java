package io.micrc.core.annotations.application.businesses;

import java.lang.annotation.*;

/**
 * 命令逻辑
 *
 * @author tengwang
 * @date 2022/8/31 14:28
 * @since 0.0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface CommandLogic {

    /**
     * 调用Logic时以Command为根的映射逻辑
     *
     * @return []
     */
    LogicMapping[] toLogicMappings();

    /**
     * 将Logic执行结果转换至Target的
     *
     * @return []
     */
    TargetMapping[] toTargetMappings();

    /**
     * 仓库完整类名称，用于获取ID值对象名称
     *
     * @return []
     */
    String repositoryFullClassName();

    /**
     * 逻辑执行类型,默认为DMN
     *
     * @return [
     */
    LogicType logicType() default LogicType.DMN;

    String logicPath() default "";
}
