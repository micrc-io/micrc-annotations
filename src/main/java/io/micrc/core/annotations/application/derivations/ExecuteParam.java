package io.micrc.core.annotations.application.derivations;

/**
 * 执行参数
 *
 * @author hyosunghan
 * @date 2022/10/24 14:32
 * @since 0.0.1
 */
public @interface ExecuteParam {

    /**
     * 字段名称
     *
     * @return
     */
    String name();

    /**
     * 字段路径 - 入参取值路径
     *
     * @return
     */
    String path();
}
