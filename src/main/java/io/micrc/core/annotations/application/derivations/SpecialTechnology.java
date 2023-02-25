package io.micrc.core.annotations.application.derivations;

/**
 * 专用技术
 */
public @interface SpecialTechnology {

    /**
     * 执行入参
     *
     * @return
     */
    TechnologyParam[] technologyParams() default {};

    TechnologyParam[] technologyHeaders() default {};

    /**
     * 技术类型
     *
     * @return
     */
    TechnologyType technologyType();

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