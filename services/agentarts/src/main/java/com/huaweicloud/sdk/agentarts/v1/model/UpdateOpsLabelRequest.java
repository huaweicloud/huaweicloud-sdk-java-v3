package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateOpsLabelRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_id")

    private String labelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateOpsLabelRequestBody body;

    public UpdateOpsLabelRequest withLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }

    /**
     * **参数解释：** 需要被更新的标签唯一标识符（ID）。 **约束限制：** 字符串长度为0到100。 **取值范围：** 0-100字符。 **默认取值：** 不涉及。
     * @return labelId
     */
    public String getLabelId() {
        return labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    public UpdateOpsLabelRequest withBody(UpdateOpsLabelRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateOpsLabelRequest withBody(Consumer<UpdateOpsLabelRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateOpsLabelRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateOpsLabelRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateOpsLabelRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateOpsLabelRequest that = (UpdateOpsLabelRequest) obj;
        return Objects.equals(this.labelId, that.labelId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labelId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOpsLabelRequest {\n");
        sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
