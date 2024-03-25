package io.micrc.core.annotations.application.derivations;

public enum TechnologyType {

    DMN,

    GROOVY,

    JSLT,

    XPATH,

    ROUTE,

    /**
     * 认证
     * {identity:xxx,permissions:[xxx,xxx]}
     */
    AUTHENTICATION,

    /**
     * 撤销认证
     * {identity:xxx}
     */
    DECERTIFICATION,

    /**
     * PBKDF2加密
     * {password:xxx,salt:xxx}
     */
    PBKDF2_ENCRYPT,

    /**
     * 生成盐
     */
    GENERATE_SALT,

    /**
     * 生成验证码
     */
    GENERATE_VERIFY_CODE,

    /**
     * 比较验证码
     * {key:xxx,value:xxx}
     */
    COMPARE_VERIFY_CODE,

    /**
     * 获取激活配置
     */
    GET_ACTIVE_PROFILES,

    /**
     * 替换模板key
     * {template:xxx,value:{xxx:xxx}}
     */
    REPLACE_TEMPLATE_KEY
}
