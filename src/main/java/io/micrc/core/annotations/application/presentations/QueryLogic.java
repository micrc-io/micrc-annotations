package io.micrc.core.annotations.application.presentations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 查询逻辑
 *
 * @author hyosunghan
 * @date 2022/9/4 10:15
 * @since 0.0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
@Documented
public @interface QueryLogic {

    /**
     * 查询聚合，用于拼接"xxxRepository"
     *
     * @return
     */
    String aggregation();

    /**
     * 查询参数，本次查询所需参数，包括参数名及参数路径
     *
     * @return
     */
    QueryParam[] params() default {};

    /**
     * 排序参数，查询时使用的排序参数，包括参数名和排序方式
     *
     * @return
     */
    SortParam[] sorts() default {};

    /**
     * 分页大小路径
     *
     * @return
     */
    String pageSizePath() default "/page/pageSize";

    /**
     * 分页页码路径
     *
     * @return
     */
    String pageNumberPath() default "/page/pageNumber";

    /**
     * 参数名称，即集成结果对应的键名称
     *
     * @return
     */
    String name();

    /**
     * 方法名
     *
     * @return
     */
    String methodName();

    /**
     * 参数处理顺序,优化处理速度
     *
     * @return
     */
    int order() default Integer.MAX_VALUE;
}
