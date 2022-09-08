package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateConsumerGroupOrBatchDeleteConsumerGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public CreateConsumerGroupOrBatchDeleteConsumerGroupResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 删除消费组的任务ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public CreateConsumerGroupOrBatchDeleteConsumerGroupResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 创建成功的消费组名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateConsumerGroupOrBatchDeleteConsumerGroupResponse createConsumerGroupOrBatchDeleteConsumerGroupResponse =
            (CreateConsumerGroupOrBatchDeleteConsumerGroupResponse) o;
        return Objects.equals(this.jobId, createConsumerGroupOrBatchDeleteConsumerGroupResponse.jobId)
            && Objects.equals(this.name, createConsumerGroupOrBatchDeleteConsumerGroupResponse.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateConsumerGroupOrBatchDeleteConsumerGroupResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
