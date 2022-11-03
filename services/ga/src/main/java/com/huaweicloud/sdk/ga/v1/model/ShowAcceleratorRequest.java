package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowAcceleratorRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accelerator_id")

    private String acceleratorId;

    public ShowAcceleratorRequest withAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }

    /**
     * 全球加速器ID。
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return acceleratorId;
    }

    public void setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAcceleratorRequest showAcceleratorRequest = (ShowAcceleratorRequest) o;
        return Objects.equals(this.acceleratorId, showAcceleratorRequest.acceleratorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acceleratorId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAcceleratorRequest {\n");
        sb.append("    acceleratorId: ").append(toIndentedString(acceleratorId)).append("\n");
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
