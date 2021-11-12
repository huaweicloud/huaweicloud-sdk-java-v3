package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** token详细信息。 */
public class UnscopedTokenInfo {

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
    @JsonProperty(value = "roles")

    private List<UnscopedTokenInfoRoles> roles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog")

    private List<UnscopedTokenInfoCatalog> catalog = null;

    public UnscopedTokenInfo withExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /** 过期时间。
     * 
     * @return expiresAt */
    public String getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    public UnscopedTokenInfo withMethods(List<String> methods) {
        this.methods = methods;
        return this;
    }

    public UnscopedTokenInfo addMethodsItem(String methodsItem) {
        if (this.methods == null) {
            this.methods = new ArrayList<>();
        }
        this.methods.add(methodsItem);
        return this;
    }

    public UnscopedTokenInfo withMethods(Consumer<List<String>> methodsSetter) {
        if (this.methods == null) {
            this.methods = new ArrayList<>();
        }
        methodsSetter.accept(this.methods);
        return this;
    }

    /** token获取方式，联邦认证默认为mapped。
     * 
     * @return methods */
    public List<String> getMethods() {
        return methods;
    }

    public void setMethods(List<String> methods) {
        this.methods = methods;
    }

    public UnscopedTokenInfo withIssuedAt(String issuedAt) {
        this.issuedAt = issuedAt;
        return this;
    }

    /** 生成时间。
     * 
     * @return issuedAt */
    public String getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(String issuedAt) {
        this.issuedAt = issuedAt;
    }

    public UnscopedTokenInfo withUser(FederationUserBody user) {
        this.user = user;
        return this;
    }

    public UnscopedTokenInfo withUser(Consumer<FederationUserBody> userSetter) {
        if (this.user == null) {
            this.user = new FederationUserBody();
            userSetter.accept(this.user);
        }

        return this;
    }

    /** Get user
     * 
     * @return user */
    public FederationUserBody getUser() {
        return user;
    }

    public void setUser(FederationUserBody user) {
        this.user = user;
    }

    public UnscopedTokenInfo withRoles(List<UnscopedTokenInfoRoles> roles) {
        this.roles = roles;
        return this;
    }

    public UnscopedTokenInfo addRolesItem(UnscopedTokenInfoRoles rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    public UnscopedTokenInfo withRoles(Consumer<List<UnscopedTokenInfoRoles>> rolesSetter) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        rolesSetter.accept(this.roles);
        return this;
    }

    /** roles信息。
     * 
     * @return roles */
    public List<UnscopedTokenInfoRoles> getRoles() {
        return roles;
    }

    public void setRoles(List<UnscopedTokenInfoRoles> roles) {
        this.roles = roles;
    }

    public UnscopedTokenInfo withCatalog(List<UnscopedTokenInfoCatalog> catalog) {
        this.catalog = catalog;
        return this;
    }

    public UnscopedTokenInfo addCatalogItem(UnscopedTokenInfoCatalog catalogItem) {
        if (this.catalog == null) {
            this.catalog = new ArrayList<>();
        }
        this.catalog.add(catalogItem);
        return this;
    }

    public UnscopedTokenInfo withCatalog(Consumer<List<UnscopedTokenInfoCatalog>> catalogSetter) {
        if (this.catalog == null) {
            this.catalog = new ArrayList<>();
        }
        catalogSetter.accept(this.catalog);
        return this;
    }

    /** catalog信息。
     * 
     * @return catalog */
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
        UnscopedTokenInfo unscopedTokenInfo = (UnscopedTokenInfo) o;
        return Objects.equals(this.expiresAt, unscopedTokenInfo.expiresAt)
            && Objects.equals(this.methods, unscopedTokenInfo.methods)
            && Objects.equals(this.issuedAt, unscopedTokenInfo.issuedAt)
            && Objects.equals(this.user, unscopedTokenInfo.user) && Objects.equals(this.roles, unscopedTokenInfo.roles)
            && Objects.equals(this.catalog, unscopedTokenInfo.catalog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expiresAt, methods, issuedAt, user, roles, catalog);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnscopedTokenInfo {\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
        sb.append("    methods: ").append(toIndentedString(methods)).append("\n");
        sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("    catalog: ").append(toIndentedString(catalog)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
