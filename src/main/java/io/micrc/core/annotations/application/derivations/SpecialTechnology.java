package io.micrc.core.annotations.application.derivations;

/**
 * 专用技术
 */
public @interface SpecialTechnology {

    /**
     * 变量映射文件
     *
     * @return string
     */
    String variableMappingFile() default "";

    /**
     * 参数映射文件
     *
     * @return string
     */
    String paramMappingFile();

    /**
     * 路由内容路径
     *
     * @return string
     */
    String scriptContentPath() default "";

    /**
     * 路由文件路径
     * @return string
     */
    String scriptFilePath() default "";

    /**
     * 技术类型
     *
     * @return  technologyType
     */
    TechnologyType technologyType();

    /**
     * 参数名称，即运算结果对应的键名称
     *
     * @return string
     */
    String name();

    /**
     * 参数处理顺序,优化处理速度
     *
     * @return init
     */
    int order() default Integer.MAX_VALUE;
}
