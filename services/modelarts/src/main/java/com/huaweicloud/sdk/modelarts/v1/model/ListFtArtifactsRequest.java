package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListFtArtifactsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "training_job_id")

    private String trainingJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "steps")

    private Integer steps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "epoch")

    private Integer epoch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loss")

    private Double loss;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by_create_time_asc")

    private Boolean orderByCreateTimeAsc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListFtArtifactsRequest withTrainingJobId(String trainingJobId) {
        this.trainingJobId = trainingJobId;
        return this;
    }

    /**
     * 训练作业ID。获取方法请参见[查询训练作业列表](ListTrainingJobs.xml)。
     * @return trainingJobId
     */
    public String getTrainingJobId() {
        return trainingJobId;
    }

    public void setTrainingJobId(String trainingJobId) {
        this.trainingJobId = trainingJobId;
    }

    public ListFtArtifactsRequest withSteps(Integer steps) {
        this.steps = steps;
        return this;
    }

    /**
     * 步数。
     * minimum: 1
     * maximum: 2147483647
     * @return steps
     */
    public Integer getSteps() {
        return steps;
    }

    public void setSteps(Integer steps) {
        this.steps = steps;
    }

    public ListFtArtifactsRequest withEpoch(Integer epoch) {
        this.epoch = epoch;
        return this;
    }

    /**
     * 轮数。
     * minimum: 1
     * maximum: 2147483647
     * @return epoch
     */
    public Integer getEpoch() {
        return epoch;
    }

    public void setEpoch(Integer epoch) {
        this.epoch = epoch;
    }

    public ListFtArtifactsRequest withLoss(Double loss) {
        this.loss = loss;
        return this;
    }

    /**
     * loss值。
     * minimum: 0.0
     * maximum: 2147483647
     * @return loss
     */
    public Double getLoss() {
        return loss;
    }

    public void setLoss(Double loss) {
        this.loss = loss;
    }

    public ListFtArtifactsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListFtArtifactsRequest withOrderByCreateTimeAsc(Boolean orderByCreateTimeAsc) {
        this.orderByCreateTimeAsc = orderByCreateTimeAsc;
        return this;
    }

    /**
     * 是否按照创建时间排序。
     * @return orderByCreateTimeAsc
     */
    public Boolean getOrderByCreateTimeAsc() {
        return orderByCreateTimeAsc;
    }

    public void setOrderByCreateTimeAsc(Boolean orderByCreateTimeAsc) {
        this.orderByCreateTimeAsc = orderByCreateTimeAsc;
    }

    public ListFtArtifactsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 返回的数据条目数。
     * minimum: 0
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListFtArtifactsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 数据条目偏移量。
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFtArtifactsRequest that = (ListFtArtifactsRequest) obj;
        return Objects.equals(this.trainingJobId, that.trainingJobId) && Objects.equals(this.steps, that.steps)
            && Objects.equals(this.epoch, that.epoch) && Objects.equals(this.loss, that.loss)
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.orderByCreateTimeAsc, that.orderByCreateTimeAsc)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainingJobId, steps, epoch, loss, status, orderByCreateTimeAsc, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFtArtifactsRequest {\n");
        sb.append("    trainingJobId: ").append(toIndentedString(trainingJobId)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
        sb.append("    epoch: ").append(toIndentedString(epoch)).append("\n");
        sb.append("    loss: ").append(toIndentedString(loss)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    orderByCreateTimeAsc: ").append(toIndentedString(orderByCreateTimeAsc)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
