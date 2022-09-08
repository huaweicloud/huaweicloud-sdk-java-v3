package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class AgencyTokenResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "methods")

    private List<String> methods = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expires_at")

    private String expiresAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issued_at")

    private String issuedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assumed_by")

    private AgencyAssumedby assumedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog")

    private List<TokenCatalog> catalog = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private AgencyTokenDomain domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")

    private AgencyTokenProject project;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roles")

    private List<TokenRole> roles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private AgencyTokenUser user;

    public AgencyTokenResult withMethods(List<String> methods) {
        this.methods = methods;
        return this;
    }

    public AgencyTokenResult addMethodsItem(String methodsItem) {
        if (this.methods == null) {
            this.methods = new ArrayList<>();
        }
        this.methods.add(methodsItem);
        return this;
    }

    public AgencyTokenResult withMethods(Consumer<List<String>> methodsSetter) {
        if (this.methods == null) {
            this.methods = new ArrayList<>();
        }
        methodsSetter.accept(this.methods);
        return this;
    }

    /**
     * 获取token的方式。
     * @return methods
     */
    public List<String> getMethods() {
        return methods;
    }

    public void setMethods(List<String> methods) {
        this.methods = methods;
    }

    public AgencyTokenResult withExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     * token到期时间。
     * @return expiresAt
     */
    public String getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    public AgencyTokenResult withIssuedAt(String issuedAt) {
        this.issuedAt = issuedAt;
        return this;
    }

    /**
     * token下发时间。
     * @return issuedAt
     */
    public String getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(String issuedAt) {
        this.issuedAt = issuedAt;
    }

    public AgencyTokenResult withAssumedBy(AgencyAssumedby assumedBy) {
        this.assumedBy = assumedBy;
        return this;
    }

    public AgencyTokenResult withAssumedBy(Consumer<AgencyAssumedby> assumedBySetter) {
        if (this.assumedBy == null) {
            this.assumedBy = new AgencyAssumedby();
            assumedBySetter.accept(this.assumedBy);
        }

        return this;
    }

    /**
     * Get assumedBy
     * @return assumedBy
     */
    public AgencyAssumedby getAssumedBy() {
        return assumedBy;
    }

    public void setAssumedBy(AgencyAssumedby assumedBy) {
        this.assumedBy = assumedBy;
    }

    public AgencyTokenResult withCatalog(List<TokenCatalog> catalog) {
        this.catalog = catalog;
        return this;
    }

    public AgencyTokenResult addCatalogItem(TokenCatalog catalogItem) {
        if (this.catalog == null) {
            this.catalog = new ArrayList<>();
        }
        this.catalog.add(catalogItem);
        return this;
    }

    public AgencyTokenResult withCatalog(Consumer<List<TokenCatalog>> catalogSetter) {
        if (this.catalog == null) {
            this.catalog = new ArrayList<>();
        }
        catalogSetter.accept(this.catalog);
        return this;
    }

    /**
     * 服务目录信息。
     * @return catalog
     */
    public List<TokenCatalog> getCatalog() {
        return catalog;
    }

    public void setCatalog(List<TokenCatalog> catalog) {
        this.catalog = catalog;
    }

    public AgencyTokenResult withDomain(AgencyTokenDomain domain) {
        this.domain = domain;
        return this;
    }

    public AgencyTokenResult withDomain(Consumer<AgencyTokenDomain> domainSetter) {
        if (this.domain == null) {
            this.domain = new AgencyTokenDomain();
            domainSetter.accept(this.domain);
        }

        return this;
    }

    /**
     * Get domain
     * @return domain
     */
    public AgencyTokenDomain getDomain() {
        return domain;
    }

    public void setDomain(AgencyTokenDomain domain) {
        this.domain = domain;
    }

    public AgencyTokenResult withProject(AgencyTokenProject project) {
        this.project = project;
        return this;
    }

    public AgencyTokenResult withProject(Consumer<AgencyTokenProject> projectSetter) {
        if (this.project == null) {
            this.project = new AgencyTokenProject();
            projectSetter.accept(this.project);
        }

        return this;
    }

    /**
     * Get project
     * @return project
     */
    public AgencyTokenProject getProject() {
        return project;
    }

    public void setProject(AgencyTokenProject project) {
        this.project = project;
    }

    public AgencyTokenResult withRoles(List<TokenRole> roles) {
        this.roles = roles;
        return this;
    }

    public AgencyTokenResult addRolesItem(TokenRole rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    public AgencyTokenResult withRoles(Consumer<List<TokenRole>> rolesSetter) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        rolesSetter.accept(this.roles);
        return this;
    }

    /**
     * 委托token的权限信息。
     * @return roles
     */
    public List<TokenRole> getRoles() {
        return roles;
    }

    public void setRoles(List<TokenRole> roles) {
        this.roles = roles;
    }

    public AgencyTokenResult withUser(AgencyTokenUser user) {
        this.user = user;
        return this;
    }

    public AgencyTokenResult withUser(Consumer<AgencyTokenUser> userSetter) {
        if (this.user == null) {
            this.user = new AgencyTokenUser();
            userSetter.accept(this.user);
        }

        return this;
    }

    /**
     * Get user
     * @return user
     */
    public AgencyTokenUser getUser() {
        return user;
    }

    public void setUser(AgencyTokenUser user) {
        this.user = user;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AgencyTokenResult agencyTokenResult = (AgencyTokenResult) o;
        return Objects.equals(this.methods, agencyTokenResult.methods)
            && Objects.equals(this.expiresAt, agencyTokenResult.expiresAt)
            && Objects.equals(this.issuedAt, agencyTokenResult.issuedAt)
            && Objects.equals(this.assumedBy, agencyTokenResult.assumedBy)
            && Objects.equals(this.catalog, agencyTokenResult.catalog)
            && Objects.equals(this.domain, agencyTokenResult.domain)
            && Objects.equals(this.project, agencyTokenResult.project)
            && Objects.equals(this.roles, agencyTokenResult.roles) && Objects.equals(this.user, agencyTokenResult.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(methods, expiresAt, issuedAt, assumedBy, catalog, domain, project, roles, user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgencyTokenResult {\n");
        sb.append("    methods: ").append(toIndentedString(methods)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
        sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
        sb.append("    assumedBy: ").append(toIndentedString(assumedBy)).append("\n");
        sb.append("    catalog: ").append(toIndentedString(catalog)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
