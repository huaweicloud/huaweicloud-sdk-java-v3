package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * - **参数解释**：Oidc配置信息。 - **约束限制**：不涉及。 - **取值范围**：不涉及。 - **默认取值**：不涉及。
 */
public class OidcConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_oidc")

    private Boolean enableOidc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_id")

    private String clientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    public OidcConfig withEnableOidc(Boolean enableOidc) {
        this.enableOidc = enableOidc;
        return this;
    }

    /**
     * - **参数解释**：是否开启oidc功能。 - **约束限制**：不涉及。 - **取值范围**：开启true，关闭false。 - **默认取值**：false。 
     * @return enableOidc
     */
    public Boolean getEnableOidc() {
        return enableOidc;
    }

    public void setEnableOidc(Boolean enableOidc) {
        this.enableOidc = enableOidc;
    }

    public OidcConfig withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * - **参数解释**：客户端ID。 - **约束限制**：不涉及。 - **取值范围**：长度为[1,64]的字母、数字、下划线(_)、中划线(-)、点(.)的组合。 - **默认取值**：null。 
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public OidcConfig withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * - **参数解释**：RayService命名空间。 - **约束限制**：不涉及。 - **取值范围**：长度为16位，均为ray-svc-xxx格式。 - **默认取值**：null。 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OidcConfig that = (OidcConfig) obj;
        return Objects.equals(this.enableOidc, that.enableOidc) && Objects.equals(this.clientId, that.clientId)
            && Objects.equals(this.namespace, that.namespace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableOidc, clientId, namespace);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OidcConfig {\n");
        sb.append("    enableOidc: ").append(toIndentedString(enableOidc)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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
