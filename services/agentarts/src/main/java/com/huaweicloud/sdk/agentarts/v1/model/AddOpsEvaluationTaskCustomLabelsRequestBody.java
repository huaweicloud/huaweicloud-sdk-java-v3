package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 为评估任务添加自定义标签的请求体。 **约束限制：** tag_id和tag_type为必填项。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class AddOpsEvaluationTaskCustomLabelsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_id")

    private String tagId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_type")

    private String tagType;

    public AddOpsEvaluationTaskCustomLabelsRequestBody withTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }

    /**
     * **参数解释：** 标签的唯一标识符（ID）。 **约束限制：** 字符串长度为0到100个字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return tagId
     */
    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public AddOpsEvaluationTaskCustomLabelsRequestBody withTagType(String tagType) {
        this.tagType = tagType;
        return this;
    }

    /**
     * **参数解释：** 标签的类型，用于业务逻辑中区分不同属性。 **约束限制：** 字符串长度为0到100个字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
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
        AddOpsEvaluationTaskCustomLabelsRequestBody that = (AddOpsEvaluationTaskCustomLabelsRequestBody) obj;
        return Objects.equals(this.tagId, that.tagId) && Objects.equals(this.tagType, that.tagType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagId, tagType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddOpsEvaluationTaskCustomLabelsRequestBody {\n");
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
