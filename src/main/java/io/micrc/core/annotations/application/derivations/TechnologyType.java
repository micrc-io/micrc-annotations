package io.micrc.core.annotations.application.derivations;

public enum TechnologyType {

    DMN,

    GROOVY,

    JSLT,

    ROUTE,

    /**
     * 认证
     * {username:{username:xxx},permissions:[xxx,xxx]}
     */
    AUTHENTICATION,

    /**
     * 撤销认证
     * {username:{username:xxx}}
     */
    DECERTIFICATION,

    /**
     * PBKDF2加密
     * {password:{password:xxx},salt:{salt:xxx}}
     */
    PBKDF2_ENCRYPT,

    /**
     * 生成盐
     */
    GENERATE_SALT,
}
