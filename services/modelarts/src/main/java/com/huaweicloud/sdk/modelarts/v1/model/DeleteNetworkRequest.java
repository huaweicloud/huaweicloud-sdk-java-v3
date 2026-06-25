package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteNetworkRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_name")

    private String networkName;

    public DeleteNetworkRequest withNetworkName(String networkName) {
        this.networkName = networkName;
        return this;
    }

    /**
     * **参数解释**：网络资源名称。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return networkName
     */
    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteNetworkRequest that = (DeleteNetworkRequest) obj;
        return Objects.equals(this.networkName, that.networkName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(networkName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteNetworkRequest {\n");
        sb.append("    networkName: ").append(toIndentedString(networkName)).append("\n");
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
