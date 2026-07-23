package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 更新评估任务自定义标签值的请求体。 **约束限制：** 所有属性均为必填项。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class UpdateOpsEvaluationTaskCustomLabelValuesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_id")

    private String tagId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_id")

    private String itemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "annotated_value")

    private String annotatedValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_type")

    private String tagType;

    public UpdateOpsEvaluationTaskCustomLabelValuesRequestBody withTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }

    /**
     * **参数解释：** 需要更新的标签唯一标识符（ID）。 **约束限制：** 字符串长度为0到100个字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return tagId
     */
    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public UpdateOpsEvaluationTaskCustomLabelValuesRequestBody withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * **参数解释：** 对应数据条目的唯一标识符（ID）。 **约束限制：** 字符串长度为0到100个字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return itemId
     */
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public UpdateOpsEvaluationTaskCustomLabelValuesRequestBody withAnnotatedValue(String annotatedValue) {
        this.annotatedValue = annotatedValue;
        return this;
    }

    /**
     * **参数解释：** 更新后的标注值。 **约束限制：** 字符串长度为0到100个字符，支持中英文、数字及特殊字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return annotatedValue
     */
    public String getAnnotatedValue() {
        return annotatedValue;
    }

    public void setAnnotatedValue(String annotatedValue) {
        this.annotatedValue = annotatedValue;
    }

    public UpdateOpsEvaluationTaskCustomLabelValuesRequestBody withTagType(String tagType) {
        this.tagType = tagType;
        return this;
    }

    /**
     * **参数解释：** 标签类型，建议保持与创建时一致。 **约束限制：** 字符串长度为0到100个字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
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
        UpdateOpsEvaluationTaskCustomLabelValuesRequestBody that =
            (UpdateOpsEvaluationTaskCustomLabelValuesRequestBody) obj;
        return Objects.equals(this.tagId, that.tagId) && Objects.equals(this.itemId, that.itemId)
            && Objects.equals(this.annotatedValue, that.annotatedValue) && Objects.equals(this.tagType, that.tagType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagId, itemId, annotatedValue, tagType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOpsEvaluationTaskCustomLabelValuesRequestBody {\n");
        sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    annotatedValue: ").append(toIndentedString(annotatedValue)).append("\n");
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
