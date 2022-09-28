package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteLabelRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_id")

    private String labelId;

    public DeleteLabelRequest withLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }

    /**
     * 标签id
     * @return labelId
     */
    public String getLabelId() {
        return labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteLabelRequest deleteLabelRequest = (DeleteLabelRequest) o;
        return Objects.equals(this.labelId, deleteLabelRequest.labelId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labelId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteLabelRequest {\n");
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
