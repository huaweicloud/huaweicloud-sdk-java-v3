package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * This feature was introduced in  9.0
 */
public class ImpersonationToken {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "revoked")

    private Boolean revoked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scopes")

    private List<String> scopes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active")

    private Boolean active;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expires_at")

    private String expiresAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "impersonation")

    private Boolean impersonation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ImpersonationToken withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 唯一标识id。
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ImpersonationToken withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImpersonationToken withRevoked(Boolean revoked) {
        this.revoked = revoked;
        return this;
    }

    /**
     * **参数解释：** 是否撤销。
     * @return revoked
     */
    public Boolean getRevoked() {
        return revoked;
    }

    public void setRevoked(Boolean revoked) {
        this.revoked = revoked;
    }

    public ImpersonationToken withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ImpersonationToken withScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    public ImpersonationToken addScopesItem(String scopesItem) {
        if (this.scopes == null) {
            this.scopes = new ArrayList<>();
        }
        this.scopes.add(scopesItem);
        return this;
    }

    public ImpersonationToken withScopes(Consumer<List<String>> scopesSetter) {
        if (this.scopes == null) {
            this.scopes = new ArrayList<>();
        }
        scopesSetter.accept(this.scopes);
        return this;
    }

    /**
     * **参数解释：** scope权限。 **取值范围：** 字符串长度不少于0，不超过1000。
     * @return scopes
     */
    public List<String> getScopes() {
        return scopes;
    }

    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }

    public ImpersonationToken withActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * **参数解释：** 是否可用。
     * @return active
     */
    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public ImpersonationToken withExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     * **参数解释：** 过期时间。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return expiresAt
     */
    public String getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    public ImpersonationToken withImpersonation(Boolean impersonation) {
        this.impersonation = impersonation;
        return this;
    }

    /**
     * **参数解释：** 是否为个人token。
     * @return impersonation
     */
    public Boolean getImpersonation() {
        return impersonation;
    }

    public void setImpersonation(Boolean impersonation) {
        this.impersonation = impersonation;
    }

    public ImpersonationToken withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 描述。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImpersonationToken that = (ImpersonationToken) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.revoked, that.revoked) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.scopes, that.scopes) && Objects.equals(this.active, that.active)
            && Objects.equals(this.expiresAt, that.expiresAt) && Objects.equals(this.impersonation, that.impersonation)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, revoked, createdAt, scopes, active, expiresAt, impersonation, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImpersonationToken {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    revoked: ").append(toIndentedString(revoked)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
        sb.append("    impersonation: ").append(toIndentedString(impersonation)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
