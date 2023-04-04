package io.micrc.core.annotations.application.derivations;

public enum TechnologyType {

    DMN,

    GROOVY,

    JSLT,

    ROUTE,

    TEST,

    /**
     * 认证
     * username:xxx,permissions:[xxx]
     */
    AUTHENTICATION,

    /**
     * 撤销认证
     * username:xxx
     */
    DECERTIFICATION
}
