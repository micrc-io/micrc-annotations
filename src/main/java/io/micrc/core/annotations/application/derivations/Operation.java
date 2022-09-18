package io.micrc.core.annotations.application.derivations;

/**
 * 运算逻辑
 *
 * @author hyosunghan
 * @date 2022/9/17 09:32
 * @since 0.0.1
 */
public @interface Operation {

    /**
     * 运算入参
     *
     * @return
     */
    OperateParam[] operateParams();

    /**
     * 参数名称，即运算结果对应的键名称
     *
     * @return
     */
    String name();

    /**
     * 参数处理顺序,优化处理速度
     *
     * @return
     */
    int order() default 0;
}
