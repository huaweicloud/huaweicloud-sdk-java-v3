package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 删除评估任务自定义标签值的请求体。 **约束限制：** item_id和tag_id为必填项。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class DeleteOpsEvaluationTaskCustomLabelValues {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_id")

    private String itemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_id")

    private String tagId;

    public DeleteOpsEvaluationTaskCustomLabelValues withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * **参数解释：** 评测集条目的唯一标识符（ID）。 **约束限制：** 字符串长度为0到100个字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return itemId
     */
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public DeleteOpsEvaluationTaskCustomLabelValues withTagId(String tagId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteOpsEvaluationTaskCustomLabelValues that = (DeleteOpsEvaluationTaskCustomLabelValues) obj;
        return Objects.equals(this.itemId, that.itemId) && Objects.equals(this.tagId, that.tagId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, tagId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteOpsEvaluationTaskCustomLabelValues {\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
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
