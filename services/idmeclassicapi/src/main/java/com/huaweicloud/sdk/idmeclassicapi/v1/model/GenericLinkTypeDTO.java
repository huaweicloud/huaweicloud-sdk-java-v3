package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GenericLinkTypeDTO
 */
public class GenericLinkTypeDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latestOnly")

    private Boolean latestOnly;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sourceId")

    private String sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetType")

    private String targetType;

    public GenericLinkTypeDTO withLatestOnly(Boolean latestOnly) {
        this.latestOnly = latestOnly;
        return this;
    }

    /**
     * **参数解释：**  是否返回源模型数据实例关联的最新版本目标模型数据实例。此参数仅对源/目标模型为M-V模型实体有效。  **约束限制：**  不涉及。  **取值范围：**  - true：返回源模型数据实例关联的最新版本的目标模型数据实例。 - false：返回源模型数据实例关联的所有版本的目标模型数据实例。默认为false。  **默认取值：**  false。 
     * @return latestOnly
     */
    public Boolean getLatestOnly() {
        return latestOnly;
    }

    public void setLatestOnly(Boolean latestOnly) {
        this.latestOnly = latestOnly;
    }

    public GenericLinkTypeDTO withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * **参数解释：**  源模型数据实例的ID。  **约束限制：**  不涉及。  **取值范围：**  -9223372036854775808到9223372036854775807的整数。  **默认取值：**  不涉及。 
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public GenericLinkTypeDTO withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * **参数解释：**  目标模型的英文名称。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return targetType
     */
    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GenericLinkTypeDTO that = (GenericLinkTypeDTO) obj;
        return Objects.equals(this.latestOnly, that.latestOnly) && Objects.equals(this.sourceId, that.sourceId)
            && Objects.equals(this.targetType, that.targetType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latestOnly, sourceId, targetType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenericLinkTypeDTO {\n");
        sb.append("    latestOnly: ").append(toIndentedString(latestOnly)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
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
