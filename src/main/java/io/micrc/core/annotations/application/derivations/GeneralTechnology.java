package io.micrc.core.annotations.application.derivations;

/**
 * 通用技术
 */
public @interface GeneralTechnology {

    /**
     * 变量映射文件
     *
     * @return
     */
    String variableMappingFile() default "";

    /**
     * 参数映射文件
     *
     * @return
     */
    String paramMappingFile();

    /**
     * 路由内容路径
     *
     * @return
     */
    String routeContentPath() default "";

    /**
     * 路由文件路径
     * @return
     */
    String routeXmlFilePath() default "";

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
