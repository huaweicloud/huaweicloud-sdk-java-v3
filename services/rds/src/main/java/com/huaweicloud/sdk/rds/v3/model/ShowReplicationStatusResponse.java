package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowReplicationStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_status")

    private String replicationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_reason")

    private String abnormalReason;

    public ShowReplicationStatusResponse withReplicationStatus(String replicationStatus) {
        this.replicationStatus = replicationStatus;
        return this;
    }

    /**
     * 复制状态。
     * @return replicationStatus
     */
    public String getReplicationStatus() {
        return replicationStatus;
    }

    public void setReplicationStatus(String replicationStatus) {
        this.replicationStatus = replicationStatus;
    }

    public ShowReplicationStatusResponse withAbnormalReason(String abnormalReason) {
        this.abnormalReason = abnormalReason;
        return this;
    }

    /**
     * 复制异常原因。
     * @return abnormalReason
     */
    public String getAbnormalReason() {
        return abnormalReason;
    }

    public void setAbnormalReason(String abnormalReason) {
        this.abnormalReason = abnormalReason;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowReplicationStatusResponse showReplicationStatusResponse = (ShowReplicationStatusResponse) o;
        return Objects.equals(this.replicationStatus, showReplicationStatusResponse.replicationStatus)
            && Objects.equals(this.abnormalReason, showReplicationStatusResponse.abnormalReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(replicationStatus, abnormalReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowReplicationStatusResponse {\n");
        sb.append("    replicationStatus: ").append(toIndentedString(replicationStatus)).append("\n");
        sb.append("    abnormalReason: ").append(toIndentedString(abnormalReason)).append("\n");
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
