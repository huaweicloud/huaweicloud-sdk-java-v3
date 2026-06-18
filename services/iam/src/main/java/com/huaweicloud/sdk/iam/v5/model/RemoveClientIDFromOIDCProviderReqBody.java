package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RemoveClientIDFromOIDCProviderReqBody
 */
public class RemoveClientIDFromOIDCProviderReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_id")

    private String clientId;

    public RemoveClientIDFromOIDCProviderReqBody withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * **参数解释**： 要从 OIDC 提供商移除的客户端 ID。  **约束限制**： 长度范围为[1,255]。  **取值范围**： 不涉及。  **默认取值**： 不涉及。
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RemoveClientIDFromOIDCProviderReqBody that = (RemoveClientIDFromOIDCProviderReqBody) obj;
        return Objects.equals(this.clientId, that.clientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveClientIDFromOIDCProviderReqBody {\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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
