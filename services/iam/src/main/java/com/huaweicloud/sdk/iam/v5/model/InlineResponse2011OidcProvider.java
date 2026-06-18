package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： OIDC 提供商。  **取值范围**： 不涉及。
 */
public class InlineResponse2011OidcProvider {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_id")

    private String providerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn")

    private String urn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ids")

    private List<String> clientIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thumbprints")

    private List<String> thumbprints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    public InlineResponse2011OidcProvider withProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    /**
     * **参数解释**： OIDC 身份提供商的 ID。  **取值范围**： 字符串长度在 1 到 64 之间，并且只能包含：字母、数字、中划线（-）。
     * @return providerId
     */
    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public InlineResponse2011OidcProvider withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： OIDC 身份提供商的名称。  **取值范围**： 字符串长度在 1 到 64 之间，并且只能包含：字母、数字、下划线（_）、中划线（-）。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InlineResponse2011OidcProvider withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 身份提供商描述。  **取值范围**： 字符串长度不超过 255，并且不能包含特定字符\"@\"、\"#\"、\"%\"、\"&\"、\"<\"、\">\"、\"\\\"、\"$\"、\"^\"和\"*\"。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InlineResponse2011OidcProvider withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数解释**： OIDC 身份提供商的 URL。  **取值范围**： 字符串长度在 1 到 255 之间。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public InlineResponse2011OidcProvider withUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * **参数解释**： 统一资源名称。  **取值范围**： 字符串长度在 16 到 1500 之间，并且只能包含：字母、数字、字符\"/\"、\"=\"、\"_\"、\":\"、\"-\"。
     * @return urn
     */
    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public InlineResponse2011OidcProvider withClientIds(List<String> clientIds) {
        this.clientIds = clientIds;
        return this;
    }

    public InlineResponse2011OidcProvider addClientIdsItem(String clientIdsItem) {
        if (this.clientIds == null) {
            this.clientIds = new ArrayList<>();
        }
        this.clientIds.add(clientIdsItem);
        return this;
    }

    public InlineResponse2011OidcProvider withClientIds(Consumer<List<String>> clientIdsSetter) {
        if (this.clientIds == null) {
            this.clientIds = new ArrayList<>();
        }
        clientIdsSetter.accept(this.clientIds);
        return this;
    }

    /**
     * **参数解释**： 客户端 ID 列表。  **取值范围**： 数组长度在 1 到 100 之间；数组元素为字符串，长度在 1 到 255 之间。
     * @return clientIds
     */
    public List<String> getClientIds() {
        return clientIds;
    }

    public void setClientIds(List<String> clientIds) {
        this.clientIds = clientIds;
    }

    public InlineResponse2011OidcProvider withThumbprints(List<String> thumbprints) {
        this.thumbprints = thumbprints;
        return this;
    }

    public InlineResponse2011OidcProvider addThumbprintsItem(String thumbprintsItem) {
        if (this.thumbprints == null) {
            this.thumbprints = new ArrayList<>();
        }
        this.thumbprints.add(thumbprintsItem);
        return this;
    }

    public InlineResponse2011OidcProvider withThumbprints(Consumer<List<String>> thumbprintsSetter) {
        if (this.thumbprints == null) {
            this.thumbprints = new ArrayList<>();
        }
        thumbprintsSetter.accept(this.thumbprints);
        return this;
    }

    /**
     * **参数解释**： OIDC 身份提供商的服务器证书指纹列表。  **取值范围**： 数组长度在 1 到 5 之间；数组元素为长度为 64 的字符串，并且只能包含字母、数字。
     * @return thumbprints
     */
    public List<String> getThumbprints() {
        return thumbprints;
    }

    public void setThumbprints(List<String> thumbprints) {
        this.thumbprints = thumbprints;
    }

    public InlineResponse2011OidcProvider withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释**： 提供商创建时间。  **取值范围**： 不涉及
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InlineResponse2011OidcProvider that = (InlineResponse2011OidcProvider) obj;
        return Objects.equals(this.providerId, that.providerId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.url, that.url)
            && Objects.equals(this.urn, that.urn) && Objects.equals(this.clientIds, that.clientIds)
            && Objects.equals(this.thumbprints, that.thumbprints) && Objects.equals(this.createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerId, name, description, url, urn, clientIds, thumbprints, createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineResponse2011OidcProvider {\n");
        sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
        sb.append("    clientIds: ").append(toIndentedString(clientIds)).append("\n");
        sb.append("    thumbprints: ").append(toIndentedString(thumbprints)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
