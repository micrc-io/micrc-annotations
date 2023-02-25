package io.micrc.core.annotations.application.derivations;

public enum TechnologyType {

    DMN("dynamic-dmn://execute"),

    GROOVY("dynamic-groovy://execute"),

    JSLT("dynamic-jslt://execute");

    private String protocol;

    public String getProtocol() {
        return protocol;
    }

    TechnologyType(String protocol) {
        this.protocol = protocol;
    }
}
