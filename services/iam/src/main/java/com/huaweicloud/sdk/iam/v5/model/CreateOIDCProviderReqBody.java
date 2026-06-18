package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateOIDCProviderReqBody
 */
public class CreateOIDCProviderReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ids")

    private List<String> clientIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thumbprints")

    private List<String> thumbprints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public CreateOIDCProviderReqBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数解释**： 身份提供商的 URL。该 URL 必须以 https:// 开头，并且应与提供商的 OpenID Connect ID 令牌中的 iss (issuer) 声明相对应。根据 OIDC 标准，URL 允许包含路径组件，但不允许包含查询参数。通常，该 URL 仅由一个主机名组成，不包含端口号，例如 https://www.oidc.com 或 https://oidc.com。  **约束限制**： 长度范围为[1,255]。  **取值范围**： 不涉及。  **默认取值**： 不涉及。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CreateOIDCProviderReqBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： OIDC 提供商的名称。  **约束限制**： 字符串长度在 1 到 64 之间，并且只能包含：字母、数字、下划线（_）、中划线（-）。  **取值范围**： 不涉及。  **默认取值**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateOIDCProviderReqBody withClientIds(List<String> clientIds) {
        this.clientIds = clientIds;
        return this;
    }

    public CreateOIDCProviderReqBody addClientIdsItem(String clientIdsItem) {
        if (this.clientIds == null) {
            this.clientIds = new ArrayList<>();
        }
        this.clientIds.add(clientIdsItem);
        return this;
    }

    public CreateOIDCProviderReqBody withClientIds(Consumer<List<String>> clientIdsSetter) {
        if (this.clientIds == null) {
            this.clientIds = new ArrayList<>();
        }
        clientIdsSetter.accept(this.clientIds);
        return this;
    }

    /**
     * **参数解释**： 客户端 ID 列表，客户端 ID 也称为受众 (Audiences)。您可以使用同一个提供商注册多个客户端 ID。  **约束限制**： 列表元素数量取值范围为[1,100]个，每个元素字符串长度取值范围为[1,255]。  **取值范围**： 不涉及。  **默认取值**： 不涉及。
     * @return clientIds
     */
    public List<String> getClientIds() {
        return clientIds;
    }

    public void setClientIds(List<String> clientIds) {
        this.clientIds = clientIds;
    }

    public CreateOIDCProviderReqBody withThumbprints(List<String> thumbprints) {
        this.thumbprints = thumbprints;
        return this;
    }

    public CreateOIDCProviderReqBody addThumbprintsItem(String thumbprintsItem) {
        if (this.thumbprints == null) {
            this.thumbprints = new ArrayList<>();
        }
        this.thumbprints.add(thumbprintsItem);
        return this;
    }

    public CreateOIDCProviderReqBody withThumbprints(Consumer<List<String>> thumbprintsSetter) {
        if (this.thumbprints == null) {
            this.thumbprints = new ArrayList<>();
        }
        thumbprintsSetter.accept(this.thumbprints);
        return this;
    }

    /**
     * **参数解释**： OIDC 身份提供商的服务器证书指纹列表，列表中的指纹是 X.509 证书的十六进制编码的 SHA-1 哈希值，它始终是一个 64 个字符的字符串。通常，此列表只包含一个指纹，然而 IAM 允许您为一个 OIDC 提供商设置最多五个指纹，这使得您可以对身份提供商的证书进行安全轮转。此参数是可选的，如果未包含此参数，IAM 将检索并使用 OIDC 身份提供商服务器证书的顶层中间证书颁发机构 (CA) 指纹。有关获取 OIDC 提供商指纹的更多信息，请参阅 IAM 用户指南中的**获取 OIDC 提供商的指纹**。  **约束限制**： 列表元素数量取值范围为[0,5]个，每个元素字符串长度为64。  **取值范围**： 不涉及。  **默认取值**： 不涉及。
     * @return thumbprints
     */
    public List<String> getThumbprints() {
        return thumbprints;
    }

    public void setThumbprints(List<String> thumbprints) {
        this.thumbprints = thumbprints;
    }

    public CreateOIDCProviderReqBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 身份提供商描述。  **约束限制**： 长度范围为[0,255]。  **取值范围**： 不能包含特定字符\"@\"、\"#\"、\"%\"、\"&\"、\"<\"、\">\"、\"\\\"、\"$\"、\"^\"和\"*\"的字符串。  **默认取值**： 不涉及。
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
        CreateOIDCProviderReqBody that = (CreateOIDCProviderReqBody) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.name, that.name)
            && Objects.equals(this.clientIds, that.clientIds) && Objects.equals(this.thumbprints, that.thumbprints)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, name, clientIds, thumbprints, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOIDCProviderReqBody {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    clientIds: ").append(toIndentedString(clientIds)).append("\n");
        sb.append("    thumbprints: ").append(toIndentedString(thumbprints)).append("\n");
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
