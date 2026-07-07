package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListDevServerImagesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_type")

    private String serverType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_name")

    private String flavorName;

    public ListDevServerImagesRequest withServerType(String serverType) {
        this.serverType = serverType;
        return this;
    }

    /**
     * **参数解释**：server_type。 **约束限制**：不涉及。 **取值范围**：  - BMS  - ECS  - HPS **默认取值**：不涉及。
     * @return serverType
     */
    public String getServerType() {
        return serverType;
    }

    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    public ListDevServerImagesRequest withFlavorName(String flavorName) {
        this.flavorName = flavorName;
        return this;
    }

    /**
     * **参数解释**：规格名称。 **约束限制**：^.{1,128}$。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return flavorName
     */
    public String getFlavorName() {
        return flavorName;
    }

    public void setFlavorName(String flavorName) {
        this.flavorName = flavorName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDevServerImagesRequest that = (ListDevServerImagesRequest) obj;
        return Objects.equals(this.serverType, that.serverType) && Objects.equals(this.flavorName, that.flavorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverType, flavorName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDevServerImagesRequest {\n");
        sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
        sb.append("    flavorName: ").append(toIndentedString(flavorName)).append("\n");
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
