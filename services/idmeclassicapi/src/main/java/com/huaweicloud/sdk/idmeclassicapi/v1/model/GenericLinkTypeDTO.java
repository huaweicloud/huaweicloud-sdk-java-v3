package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GenericLinkTypeDTO
 */
public class GenericLinkTypeDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sourceId")

    private String sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetType")

    private String targetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latestOnly")

    private Boolean latestOnly;

    public GenericLinkTypeDTO withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * **参数解释：**  源模型数据实例的ID，用于查询该实例关联的目标模型数据实例。  **约束限制：**  如不传入，将查询该源模型下所有实例与目标模型的关联关系，返回数据量可能较大。  **取值范围：**  -9223372036854775808到9223372036854775807的整数。  **默认取值：**  不涉及。
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
     * **参数解释：**  目标模型的英文名称，用于限定查询源实例与哪个目标模型的关联关系。  **约束限制：**  如不传入，将查询源实例与所有目标模型的关联关系。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return targetType
     */
    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public GenericLinkTypeDTO withLatestOnly(Boolean latestOnly) {
        this.latestOnly = latestOnly;
        return this;
    }

    /**
     * **参数解释：**  是否仅返回源实例关联的最新版本目标模型数据实例。此参数仅当源模型或目标模型为M-V模型实体时生效。  **约束限制：**  仅对M-V模型实体有效。  **取值范围：**  - true：仅返回源实例关联的最新版本目标模型数据实例。 - false：返回源实例关联的所有版本目标模型数据实例。  **默认取值：**  false。
     * @return latestOnly
     */
    public Boolean getLatestOnly() {
        return latestOnly;
    }

    public void setLatestOnly(Boolean latestOnly) {
        this.latestOnly = latestOnly;
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
        return Objects.equals(this.sourceId, that.sourceId) && Objects.equals(this.targetType, that.targetType)
            && Objects.equals(this.latestOnly, that.latestOnly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceId, targetType, latestOnly);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenericLinkTypeDTO {\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
        sb.append("    latestOnly: ").append(toIndentedString(latestOnly)).append("\n");
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
