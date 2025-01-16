package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TagOperationDTO
 */
public class TagOperationDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "objectId")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tagId")

    private String tagId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier")

    private String modifier;

    public TagOperationDTO withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * **参数解释：**  数据实例ID。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public TagOperationDTO withTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }

    /**
     * **参数解释：**  标签ID。  **约束限制：**  不涉及。  **取值范围：**  -9223372036854775808到9223372036854775807的整数。  **默认取值：**  不涉及。 
     * @return tagId
     */
    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public TagOperationDTO withModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    /**
     * **参数解释：**  修改人。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
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
        TagOperationDTO that = (TagOperationDTO) obj;
        return Objects.equals(this.objectId, that.objectId) && Objects.equals(this.tagId, that.tagId)
            && Objects.equals(this.modifier, that.modifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId, tagId, modifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagOperationDTO {\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
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
