package io.micrc.core.annotations.application.derivations;

/**
 * 运算参数
 *
 * @author hyosunghan
 * @date 2022/9/16 18:15
 * @since 0.0.1
 */
public @interface OperateParam {

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
