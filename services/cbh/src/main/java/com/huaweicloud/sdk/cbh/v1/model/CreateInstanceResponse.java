package com.huaweicloud.sdk.cbh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_key")

    private Integer instanceKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_instance_key")

    private Integer slaveInstanceKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_info")

    private Integer requestInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private Integer jobId;

    public CreateInstanceResponse withInstanceKey(Integer instanceKey) {
        this.instanceKey = instanceKey;
        return this;
    }

    /**
     * 云堡垒机实例key。
     * @return instanceKey
     */
    public Integer getInstanceKey() {
        return instanceKey;
    }

    public void setInstanceKey(Integer instanceKey) {
        this.instanceKey = instanceKey;
    }

    public CreateInstanceResponse withSlaveInstanceKey(Integer slaveInstanceKey) {
        this.slaveInstanceKey = slaveInstanceKey;
        return this;
    }

    /**
     * 云堡垒机备机实例key。（当前字段未启用，返回默认值null）
     * @return slaveInstanceKey
     */
    public Integer getSlaveInstanceKey() {
        return slaveInstanceKey;
    }

    public void setSlaveInstanceKey(Integer slaveInstanceKey) {
        this.slaveInstanceKey = slaveInstanceKey;
    }

    public CreateInstanceResponse withRequestInfo(Integer requestInfo) {
        this.requestInfo = requestInfo;
        return this;
    }

    /**
     * 返回创建云堡垒机实例信息。
     * @return requestInfo
     */
    public Integer getRequestInfo() {
        return requestInfo;
    }

    public void setRequestInfo(Integer requestInfo) {
        this.requestInfo = requestInfo;
    }

    public CreateInstanceResponse withJobId(Integer jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * job任务ID。（当前字段未启用，返回默认值null）
     * @return jobId
     */
    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInstanceResponse createInstanceResponse = (CreateInstanceResponse) o;
        return Objects.equals(this.instanceKey, createInstanceResponse.instanceKey)
            && Objects.equals(this.slaveInstanceKey, createInstanceResponse.slaveInstanceKey)
            && Objects.equals(this.requestInfo, createInstanceResponse.requestInfo)
            && Objects.equals(this.jobId, createInstanceResponse.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceKey, slaveInstanceKey, requestInfo, jobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceResponse {\n");
        sb.append("    instanceKey: ").append(toIndentedString(instanceKey)).append("\n");
        sb.append("    slaveInstanceKey: ").append(toIndentedString(slaveInstanceKey)).append("\n");
        sb.append("    requestInfo: ").append(toIndentedString(requestInfo)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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
