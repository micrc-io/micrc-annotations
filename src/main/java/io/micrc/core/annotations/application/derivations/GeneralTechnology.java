package io.micrc.core.annotations.application.derivations;

/**
 * 通用技术
 */
public @interface GeneralTechnology {

    /**
     * 执行入参
     *
     * @return
     */
    TechnologyParam[] technologyParams();

    /**
     * 脚本内容路径
     *
     * @return
     */
    String scriptContentPath() default "";

    /**
     * 脚本文件路径
     * @return
     */
    String scriptDocumentPath() default "";

    /**
     * 脚本类型
     *
     * @return
     */
    ScriptType scriptType() default ScriptType.ROUTE;

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
