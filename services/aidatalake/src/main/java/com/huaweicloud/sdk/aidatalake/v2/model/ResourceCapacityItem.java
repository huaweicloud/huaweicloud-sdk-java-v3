package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：容量项与资源ID映射。 **取值范围**：不涉及。 
 */
public class ResourceCapacityItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private Integer capacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    public ResourceCapacityItem withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：资源类型。 **约束限制**：不涉及。 **取值范围**：   - CPU：中央处理器。   - GPU：图形处理器。   - NPU：神经网络处理器。 **默认取值**：不涉及。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ResourceCapacityItem withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * **参数解释**：资源容量数量。CPU资源单位为核，GPU/NPU资源单位为个。 **约束限制**：不涉及。 **取值范围**：0~48000。 **默认取值**：不涉及。 
     * minimum: 0
     * maximum: 48000
     * @return capacity
     */
    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public ResourceCapacityItem withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * **参数解释**：规格编码。 **取值范围**：长度为1~64的英文字母、数字、中划线和点号的组合。 
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public ResourceCapacityItem withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * **参数解释**：资源ID。 **取值范围**：长度为1~64的英文字母、数字、中划线和点号的组合。 
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceCapacityItem that = (ResourceCapacityItem) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.capacity, that.capacity)
            && Objects.equals(this.specCode, that.specCode) && Objects.equals(this.resourceId, that.resourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, capacity, specCode, resourceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceCapacityItem {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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
