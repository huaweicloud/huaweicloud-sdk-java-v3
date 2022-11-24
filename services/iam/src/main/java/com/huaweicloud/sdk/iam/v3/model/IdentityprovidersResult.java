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
public class IdentityprovidersResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sso_type")

    private String ssoType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_ids")

    private List<String> remoteIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private IdentityprovidersLinks links;

    public IdentityprovidersResult withSsoType(String ssoType) {
        this.ssoType = ssoType;
        return this;
    }

    /**
     * 身份提供商类型。当前支持virtual_user_sso和iam_user_sso两种。当返回为空字符串或者null时，默认为缺省类型virtual_user_sso类型。
     * @return ssoType
     */
    public String getSsoType() {
        return ssoType;
    }

    public void setSsoType(String ssoType) {
        this.ssoType = ssoType;
    }

    public IdentityprovidersResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 身份提供商ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IdentityprovidersResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 身份提供商描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IdentityprovidersResult withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 身份提供商是否启用，true为启用，false为停用，默认为false。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public IdentityprovidersResult withRemoteIds(List<String> remoteIds) {
        this.remoteIds = remoteIds;
        return this;
    }

    public IdentityprovidersResult addRemoteIdsItem(String remoteIdsItem) {
        if (this.remoteIds == null) {
            this.remoteIds = new ArrayList<>();
        }
        this.remoteIds.add(remoteIdsItem);
        return this;
    }

    public IdentityprovidersResult withRemoteIds(Consumer<List<String>> remoteIdsSetter) {
        if (this.remoteIds == null) {
            this.remoteIds = new ArrayList<>();
        }
        remoteIdsSetter.accept(this.remoteIds);
        return this;
    }

    /**
     * 身份提供商的联邦用户ID列表。
     * @return remoteIds
     */
    public List<String> getRemoteIds() {
        return remoteIds;
    }

    public void setRemoteIds(List<String> remoteIds) {
        this.remoteIds = remoteIds;
    }

    public IdentityprovidersResult withLinks(IdentityprovidersLinks links) {
        this.links = links;
        return this;
    }

    public IdentityprovidersResult withLinks(Consumer<IdentityprovidersLinks> linksSetter) {
        if (this.links == null) {
            this.links = new IdentityprovidersLinks();
            linksSetter.accept(this.links);
        }

        return this;
    }

    /**
     * Get links
     * @return links
     */
    public IdentityprovidersLinks getLinks() {
        return links;
    }

    public void setLinks(IdentityprovidersLinks links) {
        this.links = links;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IdentityprovidersResult identityprovidersResult = (IdentityprovidersResult) o;
        return Objects.equals(this.ssoType, identityprovidersResult.ssoType)
            && Objects.equals(this.id, identityprovidersResult.id)
            && Objects.equals(this.description, identityprovidersResult.description)
            && Objects.equals(this.enabled, identityprovidersResult.enabled)
            && Objects.equals(this.remoteIds, identityprovidersResult.remoteIds)
            && Objects.equals(this.links, identityprovidersResult.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ssoType, id, description, enabled, remoteIds, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdentityprovidersResult {\n");
        sb.append("    ssoType: ").append(toIndentedString(ssoType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    remoteIds: ").append(toIndentedString(remoteIds)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
