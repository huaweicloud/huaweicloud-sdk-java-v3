package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowOpsLabelRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_id")

    private String labelId;

    public ShowOpsLabelRequest withLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }

    /**
     * **参数解释：** 标签的唯一标识符（ID）。 **约束限制：** 字符串长度为0到100个字符。 **取值范围：** 0-100字符。 **默认取值：** 不涉及。
     * @return labelId
     */
    public String getLabelId() {
        return labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpsLabelRequest that = (ShowOpsLabelRequest) obj;
        return Objects.equals(this.labelId, that.labelId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labelId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsLabelRequest {\n");
        sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
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
