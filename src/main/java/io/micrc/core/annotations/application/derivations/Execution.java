package io.micrc.core.annotations.application.derivations;

/**
 * 执行逻辑
 *
 * @author hyosunghan
 * @date 2022/10/24 14:32
 * @since 0.0.1
 */
public @interface Execution {

    /**
     * 执行入参
     *
     * @return
     */
    ExecuteParam[] executeParams();

    /**
     * 执行路由
     *
     * @return
     */
    String routePath();

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
    int order() default Integer.MAX_VALUE;
}
