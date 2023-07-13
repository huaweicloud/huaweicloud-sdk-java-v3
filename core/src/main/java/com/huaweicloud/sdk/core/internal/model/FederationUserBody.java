package com.huaweicloud.sdk.core.internal.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.function.Consumer;

public class FederationUserBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-FEDERATION")

    private OsFederationInfo osFederation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private DomainInfo domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public FederationUserBody withOsFederation(OsFederationInfo osFederation) {
        this.osFederation = osFederation;
        return this;
    }

    public FederationUserBody withOsFederation(Consumer<OsFederationInfo> osFederationSetter) {
        if (this.osFederation == null) {
            this.osFederation = new OsFederationInfo();
            osFederationSetter.accept(this.osFederation);
        }

        return this;
    }

    public OsFederationInfo getOsFederation() {
        return osFederation;
    }

    public void setOsFederation(OsFederationInfo osFederation) {
        this.osFederation = osFederation;
    }

    public FederationUserBody withDomain(DomainInfo domain) {
        this.domain = domain;
        return this;
    }

    public FederationUserBody withDomain(Consumer<DomainInfo> domainSetter) {
        if (this.domain == null) {
            this.domain = new DomainInfo();
            domainSetter.accept(this.domain);
        }

        return this;
    }

    public DomainInfo getDomain() {
        return domain;
    }

    public void setDomain(DomainInfo domain) {
        this.domain = domain;
    }

    public FederationUserBody withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FederationUserBody withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
