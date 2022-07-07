package com.huaweicloud.sdk.core.internal.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ScopedTokenInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expires_at")

    private String expiresAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "methods")

    private List<String> methods = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issued_at")

    private String issuedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private FederationUserBody user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private DomainInfo domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")

    private ProjectInfo project;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roles")

    private List<ScopedTokenInfoRoles> roles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog")

    private List<UnscopedTokenInfoCatalog> catalog = null;

    public ScopedTokenInfo withExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    public ScopedTokenInfo withMethods(List<String> methods) {
        this.methods = methods;
        return this;
    }

    public ScopedTokenInfo addMethodsItem(String methodsItem) {
        if (this.methods == null) {
            this.methods = new ArrayList<>();
        }
        this.methods.add(methodsItem);
        return this;
    }

    public ScopedTokenInfo withMethods(Consumer<List<String>> methodsSetter) {
        if (this.methods == null) {
            this.methods = new ArrayList<>();
        }
        methodsSetter.accept(this.methods);
        return this;
    }

    public List<String> getMethods() {
        return methods;
    }

    public void setMethods(List<String> methods) {
        this.methods = methods;
    }

    public ScopedTokenInfo withIssuedAt(String issuedAt) {
        this.issuedAt = issuedAt;
        return this;
    }

    public String getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(String issuedAt) {
        this.issuedAt = issuedAt;
    }

    public ScopedTokenInfo withUser(FederationUserBody user) {
        this.user = user;
        return this;
    }

    public ScopedTokenInfo withUser(Consumer<FederationUserBody> userSetter) {
        if (this.user == null) {
            this.user = new FederationUserBody();
            userSetter.accept(this.user);
        }

        return this;
    }

    public FederationUserBody getUser() {
        return user;
    }

    public void setUser(FederationUserBody user) {
        this.user = user;
    }

    public ScopedTokenInfo withDomain(DomainInfo domain) {
        this.domain = domain;
        return this;
    }

    public ScopedTokenInfo withDomain(Consumer<DomainInfo> domainSetter) {
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

    public ScopedTokenInfo withProject(ProjectInfo project) {
        this.project = project;
        return this;
    }

    public ScopedTokenInfo withProject(Consumer<ProjectInfo> projectSetter) {
        if (this.project == null) {
            this.project = new ProjectInfo();
            projectSetter.accept(this.project);
        }

        return this;
    }

    public ProjectInfo getProject() {
        return project;
    }

    public void setProject(ProjectInfo project) {
        this.project = project;
    }

    public ScopedTokenInfo withRoles(List<ScopedTokenInfoRoles> roles) {
        this.roles = roles;
        return this;
    }

    public ScopedTokenInfo addRolesItem(ScopedTokenInfoRoles rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    public ScopedTokenInfo withRoles(Consumer<List<ScopedTokenInfoRoles>> rolesSetter) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        rolesSetter.accept(this.roles);
        return this;
    }

    public List<ScopedTokenInfoRoles> getRoles() {
        return roles;
    }

    public void setRoles(List<ScopedTokenInfoRoles> roles) {
        this.roles = roles;
    }

    public ScopedTokenInfo withCatalog(List<UnscopedTokenInfoCatalog> catalog) {
        this.catalog = catalog;
        return this;
    }

    public ScopedTokenInfo addCatalogItem(UnscopedTokenInfoCatalog catalogItem) {
        if (this.catalog == null) {
            this.catalog = new ArrayList<>();
        }
        this.catalog.add(catalogItem);
        return this;
    }

    public ScopedTokenInfo withCatalog(Consumer<List<UnscopedTokenInfoCatalog>> catalogSetter) {
        if (this.catalog == null) {
            this.catalog = new ArrayList<>();
        }
        catalogSetter.accept(this.catalog);
        return this;
    }

    public List<UnscopedTokenInfoCatalog> getCatalog() {
        return catalog;
    }

    public void setCatalog(List<UnscopedTokenInfoCatalog> catalog) {
        this.catalog = catalog;
    }
}
