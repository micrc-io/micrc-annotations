package io.micrc.core.annotations.application.derivations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 衍生服务
 *
 * @author hyosunghan
 * @date 2022/9/16 14:21
 * @since 0.0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface DerivationsService {

    /**
     * 查询逻辑，查询当前所在聚合
     *
     * @return
     */
    QueryLogic[] queryLogics() default {};

    /**
     * 运算操作
     *
     * @return
     */
    Operation[] operations() default {};

    /**
     * 执行操作
     *
     * @return
     */
    Execution[] executions() default {};

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
    String routeProtocol() default "derivations";
}
