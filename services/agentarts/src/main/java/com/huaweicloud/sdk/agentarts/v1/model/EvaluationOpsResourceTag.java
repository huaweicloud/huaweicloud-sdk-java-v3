package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 评估资源的标签键值对对象。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
 */
public class EvaluationOpsResourceTag {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_id")

    private String tagId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_type")

    private String tagType;

    public EvaluationOpsResourceTag withTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }

    /**
     * **参数解释：** 标签的键，标识类别。 **约束限制：** 字符串长度为1到256个字符，支持英文、数字、连字符（-）和下划线（_）。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return tagId
     */
    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public EvaluationOpsResourceTag withTagType(String tagType) {
        this.tagType = tagType;
        return this;
    }

    /**
     * **参数解释：** 标签的值，存储该标签键对应的具体内容或属性值。 **约束限制：** 字符串长度为1到512个字符，支持中英文、数字及特殊字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return tagType
     */
    public String getTagType() {
        return tagType;
    }

    public void setTagType(String tagType) {
        this.tagType = tagType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EvaluationOpsResourceTag that = (EvaluationOpsResourceTag) obj;
        return Objects.equals(this.tagId, that.tagId) && Objects.equals(this.tagType, that.tagType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagId, tagType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluationOpsResourceTag {\n");
        sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
        sb.append("    tagType: ").append(toIndentedString(tagType)).append("\n");
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
