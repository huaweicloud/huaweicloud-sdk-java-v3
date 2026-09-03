package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 工作负载统计
 */
public class WorkloadStatisticsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "infer")

    private Integer infer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notebook")

    private Integer notebook;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "train")

    private Integer train;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "warmUpTask")

    private Integer warmUpTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-infer")

    private Integer xInfer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum")

    private Integer sum;

    public WorkloadStatisticsInfo withInfer(Integer infer) {
        this.infer = infer;
        return this;
    }

    /**
     * 旧版模型部署作业数量。
     * @return infer
     */
    public Integer getInfer() {
        return infer;
    }

    public void setInfer(Integer infer) {
        this.infer = infer;
    }

    public WorkloadStatisticsInfo withNotebook(Integer notebook) {
        this.notebook = notebook;
        return this;
    }

    /**
     * 开发环境作业数量。
     * @return notebook
     */
    public Integer getNotebook() {
        return notebook;
    }

    public void setNotebook(Integer notebook) {
        this.notebook = notebook;
    }

    public WorkloadStatisticsInfo withTrain(Integer train) {
        this.train = train;
        return this;
    }

    /**
     * 训练作业数量。
     * @return train
     */
    public Integer getTrain() {
        return train;
    }

    public void setTrain(Integer train) {
        this.train = train;
    }

    public WorkloadStatisticsInfo withWarmUpTask(Integer warmUpTask) {
        this.warmUpTask = warmUpTask;
        return this;
    }

    /**
     * 权重预热作业数量。
     * @return warmUpTask
     */
    public Integer getWarmUpTask() {
        return warmUpTask;
    }

    public void setWarmUpTask(Integer warmUpTask) {
        this.warmUpTask = warmUpTask;
    }

    public WorkloadStatisticsInfo withXInfer(Integer xInfer) {
        this.xInfer = xInfer;
        return this;
    }

    /**
     * 模型部署作业数量。
     * @return xInfer
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-infer")
    public Integer getXInfer() {
        return xInfer;
    }

    public void setXInfer(Integer xInfer) {
        this.xInfer = xInfer;
    }

    public WorkloadStatisticsInfo withSum(Integer sum) {
        this.sum = sum;
        return this;
    }

    /**
     * 所有作业总和。
     * @return sum
     */
    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkloadStatisticsInfo that = (WorkloadStatisticsInfo) obj;
        return Objects.equals(this.infer, that.infer) && Objects.equals(this.notebook, that.notebook)
            && Objects.equals(this.train, that.train) && Objects.equals(this.warmUpTask, that.warmUpTask)
            && Objects.equals(this.xInfer, that.xInfer) && Objects.equals(this.sum, that.sum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infer, notebook, train, warmUpTask, xInfer, sum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkloadStatisticsInfo {\n");
        sb.append("    infer: ").append(toIndentedString(infer)).append("\n");
        sb.append("    notebook: ").append(toIndentedString(notebook)).append("\n");
        sb.append("    train: ").append(toIndentedString(train)).append("\n");
        sb.append("    warmUpTask: ").append(toIndentedString(warmUpTask)).append("\n");
        sb.append("    xInfer: ").append(toIndentedString(xInfer)).append("\n");
        sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
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
