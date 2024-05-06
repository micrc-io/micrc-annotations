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
     * @return queryLogic[]
     */
    QueryLogic[] queryLogics() default {};

    /**
     * 通用技术
     *
     * @return generalTechnology[]
     */
    GeneralTechnology[] generalTechnologies() default {};

    /**
     * 专用技术
     *
     * @return specialTechnology[]
     */
    SpecialTechnology[] specialTechnologies() default {};

    /**
     * 汇编器，汇总查询结果返回
     *
     * @return string
     */
    String assembler();

    /**
     * 自定义
     *
     * @return boolean
     */
    boolean custom() default false;

    /**
     * 协议类型
     *
     * @return string
     */
    String routeProtocol() default "derivations";
}
