package io.micrc.core.annotations.application.presentations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 展示服务
 *
 * @author hyosunghan
 * @date 2022/9/4 10:15
 * @since 0.0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface PresentationsService {

    /**
     * 查询逻辑，查询当前所在聚合
     *
     * @return
     */
    QueryLogic[] queryLogics() default {};

    /**
     * 集成，通过open-api查询其他聚合/上下文
     *
     * @return
     */
    Integration[] integrations() default {};

    /**
     * 汇编器，汇总查询结果返回
     *
     * @return
     */
    String assembler();

    /**
     * 自定义
     *
     * @return
     */
    boolean custom() default false;

    /**
     * 协议类型
     *
     * @return
     */
    String routeProtocol() default "presentations";
}
