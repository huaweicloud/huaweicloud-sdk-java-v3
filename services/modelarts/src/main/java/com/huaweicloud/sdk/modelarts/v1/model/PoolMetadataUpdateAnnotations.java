package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：资源池的注释信息。
 */
public class PoolMetadataUpdateAnnotations {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/description")

    private String osModelartsDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/order.id")

    private String osModelartsOrderId;

    public PoolMetadataUpdateAnnotations withOsModelartsDescription(String osModelartsDescription) {
        this.osModelartsDescription = osModelartsDescription;
        return this;
    }

    /**
     * **参数解释**：资源池描述信息，用于说明资源池用于某种指定场景。不能包含特殊字符!<>=&\"'。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return osModelartsDescription
     */
    public String getOsModelartsDescription() {
        return osModelartsDescription;
    }

    public void setOsModelartsDescription(String osModelartsDescription) {
        this.osModelartsDescription = osModelartsDescription;
    }

    public PoolMetadataUpdateAnnotations withOsModelartsOrderId(String osModelartsOrderId) {
        this.osModelartsOrderId = osModelartsOrderId;
        return this;
    }

    /**
     * **参数解释**：订单id，包周期创建和变更的时候需要传递该参数。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return osModelartsOrderId
     */
    public String getOsModelartsOrderId() {
        return osModelartsOrderId;
    }

    public void setOsModelartsOrderId(String osModelartsOrderId) {
        this.osModelartsOrderId = osModelartsOrderId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolMetadataUpdateAnnotations that = (PoolMetadataUpdateAnnotations) obj;
        return Objects.equals(this.osModelartsDescription, that.osModelartsDescription)
            && Objects.equals(this.osModelartsOrderId, that.osModelartsOrderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osModelartsDescription, osModelartsOrderId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolMetadataUpdateAnnotations {\n");
        sb.append("    osModelartsDescription: ").append(toIndentedString(osModelartsDescription)).append("\n");
        sb.append("    osModelartsOrderId: ").append(toIndentedString(osModelartsOrderId)).append("\n");
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
