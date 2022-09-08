package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * token详细信息。
 */
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

    /**
     * 过期时间。
     * @return expiresAt
     */
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

    /**
     * 获取token的方式，联邦用户默认为mapped。
     * @return methods
     */
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

    /**
     * 生成时间。
     * @return issuedAt
     */
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

    /**
     * Get user
     * @return user
     */
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

    /**
     * Get domain
     * @return domain
     */
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

    /**
     * Get project
     * @return project
     */
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

    /**
     * roles信息。
     * @return roles
     */
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

    /**
     * catalog信息
     * @return catalog
     */
    public List<UnscopedTokenInfoCatalog> getCatalog() {
        return catalog;
    }

    public void setCatalog(List<UnscopedTokenInfoCatalog> catalog) {
        this.catalog = catalog;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScopedTokenInfo scopedTokenInfo = (ScopedTokenInfo) o;
        return Objects.equals(this.expiresAt, scopedTokenInfo.expiresAt)
            && Objects.equals(this.methods, scopedTokenInfo.methods)
            && Objects.equals(this.issuedAt, scopedTokenInfo.issuedAt)
            && Objects.equals(this.user, scopedTokenInfo.user) && Objects.equals(this.domain, scopedTokenInfo.domain)
            && Objects.equals(this.project, scopedTokenInfo.project)
            && Objects.equals(this.roles, scopedTokenInfo.roles)
            && Objects.equals(this.catalog, scopedTokenInfo.catalog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expiresAt, methods, issuedAt, user, domain, project, roles, catalog);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScopedTokenInfo {\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
        sb.append("    methods: ").append(toIndentedString(methods)).append("\n");
        sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("    catalog: ").append(toIndentedString(catalog)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
