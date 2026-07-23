package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GenericLinkTypeModifierDTO
 */
public class GenericLinkTypeModifierDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sourceId")

    private String sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetType")

    private String targetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latestOnly")

    private Boolean latestOnly;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier")

    private String modifier;

    public GenericLinkTypeModifierDTO withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * **参数解释：**  源模型数据实例的ID，用于指定删除哪个源实例与目标模型的关联关系。  **约束限制：**  如不传入，将删除该源模型下所有实例与目标模型的关联关系，请谨慎使用。  **取值范围：**  -9223372036854775808到9223372036854775807的整数。  **默认取值：**  不涉及。
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public GenericLinkTypeModifierDTO withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * **参数解释：**  目标模型的英文名称，用于指定删除源实例与哪个目标模型的关联关系。  **约束限制：**  如不传入，将删除源实例与所有目标模型的关联关系，请谨慎使用。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return targetType
     */
    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public GenericLinkTypeModifierDTO withLatestOnly(Boolean latestOnly) {
        this.latestOnly = latestOnly;
        return this;
    }

    /**
     * **参数解释：**  是否仅删除源实例关联的最新版本目标模型数据实例的关系。此参数仅当源模型或目标模型为M-V（Master-View）模型实体时生效。  **约束限制：**  仅对M-V模型实体有效。  **取值范围：**  - true：仅删除源实例关联的最新版本目标模型数据实例的关系。 - false：删除源实例关联的所有版本目标模型数据实例的关系。  **默认取值：**  false。
     * @return latestOnly
     */
    public Boolean getLatestOnly() {
        return latestOnly;
    }

    public void setLatestOnly(Boolean latestOnly) {
        this.latestOnly = latestOnly;
    }

    public GenericLinkTypeModifierDTO withModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    /**
     * **参数解释：**  更新者账号，用于记录删除操作执行者信息。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GenericLinkTypeModifierDTO that = (GenericLinkTypeModifierDTO) obj;
        return Objects.equals(this.sourceId, that.sourceId) && Objects.equals(this.targetType, that.targetType)
            && Objects.equals(this.latestOnly, that.latestOnly) && Objects.equals(this.modifier, that.modifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceId, targetType, latestOnly, modifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenericLinkTypeModifierDTO {\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
        sb.append("    latestOnly: ").append(toIndentedString(latestOnly)).append("\n");
        sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
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
