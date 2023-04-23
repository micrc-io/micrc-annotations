package io.micrc.core.annotations.application.derivations;

public enum TechnologyType {

    DMN,

    GROOVY,

    JSLT,

    ROUTE,

    /**
     * 认证
     * username:xxx,permissions:[xxx]
     */
    AUTHENTICATION,

    /**
     * 撤销认证
     * username:xxx
     */
    DECERTIFICATION,

    /**
     * PBKDF2加密
     * data:xxx,salt:xxx
     */
    PBKDF2_ENCRYPT,

    /**
     * 生成盐
     */
    GENERATE_SALT,
}
