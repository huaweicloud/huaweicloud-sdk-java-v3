package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GenericLinkQueryDTO
 */
public class GenericLinkQueryDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "objectId")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latestOnly")

    private Boolean latestOnly;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isNeedTotal")

    private Boolean isNeedTotal;

    public GenericLinkQueryDTO withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * **参数解释：**  查询角色，用于指定按哪种角色维度查询关系实例。  **约束限制：**  必须与objectId配合使用。  **取值范围：**  - TARGET：目标模型。 - SOURCE：源模型。 - TARGET_TYPE：目标模型对应的英文名称。 - SOURCE_TYPE：源模型对应的英文名称。  **默认取值：**  不涉及。
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public GenericLinkQueryDTO withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * **参数解释：**  查询对象标识，与role参数配合使用。  **约束限制：**  - 当role为SOURCE或TARGET时，值为角色对应数据实例ID。 - 当role为SOURCE_TYPE或TARGET_TYPE时，值为角色对应的数据模型的英文名称。  **取值范围：**  - 当role为SOURCE或TARGET时，取值范围为：-9223372036854775808到9223372036854775807的整数。 - 当role为SOURCE_TYPE或TARGET_TYPE时，以大写字母开头，只能包含字母、数字、“_”，且长度为1-60个字符。  **默认取值：**  不涉及。
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public GenericLinkQueryDTO withLatestOnly(Boolean latestOnly) {
        this.latestOnly = latestOnly;
        return this;
    }

    /**
     * **参数解释：**  是否仅返回关联的最新版本目标模型数据实例。此参数仅当源模型或目标模型为M-V模型实体时生效。  **约束限制：**  仅对M-V模型实体有效。  **取值范围：**  - true：仅返回关联的最新版本目标模型数据实例。 - false：返回关联的所有版本目标模型数据实例。  **默认取值：**  false。
     * @return latestOnly
     */
    public Boolean getLatestOnly() {
        return latestOnly;
    }

    public void setLatestOnly(Boolean latestOnly) {
        this.latestOnly = latestOnly;
    }

    public GenericLinkQueryDTO withIsNeedTotal(Boolean isNeedTotal) {
        this.isNeedTotal = isNeedTotal;
        return this;
    }

    /**
     * **参数解释：**  是否需要查询总记录数。开启后响应中的pageInfo将包含准确的totalRows和totalPages，但可能影响查询性能。  **约束限制：**  不涉及。  **取值范围：**  - true：需要。 - false：不需要。  **默认取值：**  false。
     * @return isNeedTotal
     */
    public Boolean getIsNeedTotal() {
        return isNeedTotal;
    }

    public void setIsNeedTotal(Boolean isNeedTotal) {
        this.isNeedTotal = isNeedTotal;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GenericLinkQueryDTO that = (GenericLinkQueryDTO) obj;
        return Objects.equals(this.role, that.role) && Objects.equals(this.objectId, that.objectId)
            && Objects.equals(this.latestOnly, that.latestOnly) && Objects.equals(this.isNeedTotal, that.isNeedTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role, objectId, latestOnly, isNeedTotal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenericLinkQueryDTO {\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    latestOnly: ").append(toIndentedString(latestOnly)).append("\n");
        sb.append("    isNeedTotal: ").append(toIndentedString(isNeedTotal)).append("\n");
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
