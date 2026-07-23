package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**: 更新Ingress请求体。 
 */
public class UpdateIngressRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_public_network")

    private Boolean enablePublicNetwork;

    public UpdateIngressRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： Ingress描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateIngressRequestBody withEnablePublicNetwork(Boolean enablePublicNetwork) {
        this.enablePublicNetwork = enablePublicNetwork;
        return this;
    }

    /**
     * **参数解释**： 是否启用公网访问。
     * @return enablePublicNetwork
     */
    public Boolean getEnablePublicNetwork() {
        return enablePublicNetwork;
    }

    public void setEnablePublicNetwork(Boolean enablePublicNetwork) {
        this.enablePublicNetwork = enablePublicNetwork;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateIngressRequestBody that = (UpdateIngressRequestBody) obj;
        return Objects.equals(this.description, that.description)
            && Objects.equals(this.enablePublicNetwork, that.enablePublicNetwork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, enablePublicNetwork);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIngressRequestBody {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enablePublicNetwork: ").append(toIndentedString(enablePublicNetwork)).append("\n");
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
