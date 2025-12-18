package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ApplicableInstance
 */
public class ApplicableInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity_id")

    private String entityId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_id")

    private String configId;

    public ApplicableInstance withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * **参数解释**：  实例ID，此参数是实例的唯一标识。  **约束限制**：  不涉及。  **取值范围**：  只能由英文字母、数字组成，后缀为in09，长度为36个字符。  **默认取值**：  不涉及。
     * @return entityId
     */
    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public ApplicableInstance withConfigId(String configId) {
        this.configId = configId;
        return this;
    }

    /**
     * **参数解释**：  参数组ID。  **约束限制**：  不涉及。  **取值范围**：  只能由英文字母、数字组成，长度为36个字符。  **默认取值**：  不涉及。
     * @return configId
     */
    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplicableInstance that = (ApplicableInstance) obj;
        return Objects.equals(this.entityId, that.entityId) && Objects.equals(this.configId, that.configId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entityId, configId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicableInstance {\n");
        sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
        sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
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
