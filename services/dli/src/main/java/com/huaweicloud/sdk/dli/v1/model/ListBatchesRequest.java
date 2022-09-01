package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListBatchesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    @JacksonXmlProperty(localName = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    @JacksonXmlProperty(localName = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job-id")

    @JacksonXmlProperty(localName = "job-id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    @JacksonXmlProperty(localName = "from")

    private Integer from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    @JacksonXmlProperty(localName = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    @JacksonXmlProperty(localName = "state")

    private String state;

    public ListBatchesRequest withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * DLI队列名称，不填写则获取当前Project下所有批处理作业(不推荐使用)。
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ListBatchesRequest withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * Get queueName
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public ListBatchesRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Get jobId
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ListBatchesRequest withFrom(Integer from) {
        this.from = from;
        return this;
    }

    /**
     * 起始批处理作业的索引号，默认从0开始。
     * @return from
     */
    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public ListBatchesRequest withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 查询批处理作业的数量。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListBatchesRequest withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBatchesRequest listBatchesRequest = (ListBatchesRequest) o;
        return Objects.equals(this.clusterName, listBatchesRequest.clusterName)
            && Objects.equals(this.queueName, listBatchesRequest.queueName)
            && Objects.equals(this.jobId, listBatchesRequest.jobId)
            && Objects.equals(this.from, listBatchesRequest.from) && Objects.equals(this.size, listBatchesRequest.size)
            && Objects.equals(this.state, listBatchesRequest.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterName, queueName, jobId, from, size, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBatchesRequest {\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
