package io.micrc.core.annotations.application.derivations;

public enum TechnologyType {

    DMN,

    GROOVY,

    JSLT,

    ROUTE,

    /**
     * 认证
     * {username:xxx,permissions:[xxx,xxx]}
     */
    AUTHENTICATION,

    /**
     * 撤销认证
     * {username:xxx}
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
}
