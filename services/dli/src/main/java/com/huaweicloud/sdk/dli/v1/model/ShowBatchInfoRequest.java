package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowBatchInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_id")

    @JacksonXmlProperty(localName = "batch_id")

    private String batchId;

    public ShowBatchInfoRequest withBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }

    /**
     * 批处理作业的ID。
     * @return batchId
     */
    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowBatchInfoRequest showBatchInfoRequest = (ShowBatchInfoRequest) o;
        return Objects.equals(this.batchId, showBatchInfoRequest.batchId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBatchInfoRequest {\n");
        sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
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
