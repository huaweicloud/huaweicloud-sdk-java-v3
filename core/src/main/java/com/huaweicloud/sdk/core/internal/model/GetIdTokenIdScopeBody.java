package com.huaweicloud.sdk.core.internal.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.function.Consumer;

public class GetIdTokenIdScopeBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private GetIdTokenScopeDomainOrProjectBody domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")

    private GetIdTokenScopeDomainOrProjectBody project;

    public GetIdTokenIdScopeBody withDomain(GetIdTokenScopeDomainOrProjectBody domain) {
        this.domain = domain;
        return this;
    }

    public GetIdTokenIdScopeBody withDomain(Consumer<GetIdTokenScopeDomainOrProjectBody> domainSetter) {
        if (this.domain == null) {
            this.domain = new GetIdTokenScopeDomainOrProjectBody();
            domainSetter.accept(this.domain);
        }

        return this;
    }

    public GetIdTokenScopeDomainOrProjectBody getDomain() {
        return domain;
    }

    public void setDomain(GetIdTokenScopeDomainOrProjectBody domain) {
        this.domain = domain;
    }

    public GetIdTokenIdScopeBody withProject(GetIdTokenScopeDomainOrProjectBody project) {
        this.project = project;
        return this;
    }

    public GetIdTokenIdScopeBody withProject(Consumer<GetIdTokenScopeDomainOrProjectBody> projectSetter) {
        if (this.project == null) {
            this.project = new GetIdTokenScopeDomainOrProjectBody();
            projectSetter.accept(this.project);
        }

        return this;
    }

    public GetIdTokenScopeDomainOrProjectBody getProject() {
        return project;
    }

    public void setProject(GetIdTokenScopeDomainOrProjectBody project) {
        this.project = project;
    }
}
