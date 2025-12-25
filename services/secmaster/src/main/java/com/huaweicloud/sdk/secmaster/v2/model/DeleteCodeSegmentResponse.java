package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class DeleteCodeSegmentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_segment_id")

    private String codeSegmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_time")

    private Long deleteTime;

    public DeleteCodeSegmentResponse withCodeSegmentId(String codeSegmentId) {
        this.codeSegmentId = codeSegmentId;
        return this;
    }

    /**
     * UUID
     * @return codeSegmentId
     */
    public String getCodeSegmentId() {
        return codeSegmentId;
    }

    public void setCodeSegmentId(String codeSegmentId) {
        this.codeSegmentId = codeSegmentId;
    }

    public DeleteCodeSegmentResponse withDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }

    /**
     * 毫秒时间戳
     * minimum: 0
     * maximum: 2366841600000
     * @return deleteTime
     */
    public Long getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteCodeSegmentResponse that = (DeleteCodeSegmentResponse) obj;
        return Objects.equals(this.codeSegmentId, that.codeSegmentId)
            && Objects.equals(this.deleteTime, that.deleteTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeSegmentId, deleteTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteCodeSegmentResponse {\n");
        sb.append("    codeSegmentId: ").append(toIndentedString(codeSegmentId)).append("\n");
        sb.append("    deleteTime: ").append(toIndentedString(deleteTime)).append("\n");
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
