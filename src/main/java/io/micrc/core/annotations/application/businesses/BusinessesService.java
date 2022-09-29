package io.micrc.core.annotations.application.businesses;

import java.lang.annotation.*;

/**
 * 业务服务支撑
 *
 * @author weiguan
 * @date 2022-08-23 21:02
 * @since 0.0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface BusinessesService {

    /**
     * 仓库完整类名称，用于获取ID值对象名称
     *
     * @return
     */
    String repositoryFullClassName();

    /**
     * 是否启用自定义实现
     *
     * @return
     */
    boolean custom() default false;

    /**
     * 协议类型
     *
     * @return
     */
    String routeProtocol() default "businesses";
}
