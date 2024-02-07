package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DrugJobDto
 */
public class DrugJobDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_time")

    private String finishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_message")

    private String failedMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_dir")

    private String outputDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expect_charge_num")

    private Double expectChargeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_charge_num")

    private Double realChargeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Progress progress;

    public DrugJobDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 作业id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DrugJobDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业的名称，取值范围：[1,63]，允许大小写字母、数字、以及特殊字符中划线(-)
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DrugJobDto withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public DrugJobDto addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public DrugJobDto withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 作业标签
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public DrugJobDto withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 作业状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DrugJobDto withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 作业类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DrugJobDto withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 作业创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public DrugJobDto withFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * 作业结束时间
     * @return finishTime
     */
    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public DrugJobDto withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 作业开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public DrugJobDto withFailedMessage(String failedMessage) {
        this.failedMessage = failedMessage;
        return this;
    }

    /**
     * 失败提示，当作业执行失败时会返回
     * @return failedMessage
     */
    public String getFailedMessage() {
        return failedMessage;
    }

    public void setFailedMessage(String failedMessage) {
        this.failedMessage = failedMessage;
    }

    public DrugJobDto withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 创建任务的用户名称
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public DrugJobDto withOutputDir(String outputDir) {
        this.outputDir = outputDir;
        return this;
    }

    /**
     * 作业结果输出目录
     * @return outputDir
     */
    public String getOutputDir() {
        return outputDir;
    }

    public void setOutputDir(String outputDir) {
        this.outputDir = outputDir;
    }

    public DrugJobDto withExpectChargeNum(Double expectChargeNum) {
        this.expectChargeNum = expectChargeNum;
        return this;
    }

    /**
     * 预估功能调用消耗次数
     * @return expectChargeNum
     */
    public Double getExpectChargeNum() {
        return expectChargeNum;
    }

    public void setExpectChargeNum(Double expectChargeNum) {
        this.expectChargeNum = expectChargeNum;
    }

    public DrugJobDto withRealChargeNum(Double realChargeNum) {
        this.realChargeNum = realChargeNum;
        return this;
    }

    /**
     * 实际功能调用消耗次数
     * @return realChargeNum
     */
    public Double getRealChargeNum() {
        return realChargeNum;
    }

    public void setRealChargeNum(Double realChargeNum) {
        this.realChargeNum = realChargeNum;
    }

    public DrugJobDto withProgress(Progress progress) {
        this.progress = progress;
        return this;
    }

    public DrugJobDto withProgress(Consumer<Progress> progressSetter) {
        if (this.progress == null) {
            this.progress = new Progress();
            progressSetter.accept(this.progress);
        }

        return this;
    }

    /**
     * Get progress
     * @return progress
     */
    public Progress getProgress() {
        return progress;
    }

    public void setProgress(Progress progress) {
        this.progress = progress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DrugJobDto that = (DrugJobDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.status, that.status)
            && Objects.equals(this.type, that.type) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.finishTime, that.finishTime) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.failedMessage, that.failedMessage) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.outputDir, that.outputDir)
            && Objects.equals(this.expectChargeNum, that.expectChargeNum)
            && Objects.equals(this.realChargeNum, that.realChargeNum) && Objects.equals(this.progress, that.progress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            labels,
            status,
            type,
            createTime,
            finishTime,
            startTime,
            failedMessage,
            userName,
            outputDir,
            expectChargeNum,
            realChargeNum,
            progress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DrugJobDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    failedMessage: ").append(toIndentedString(failedMessage)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    outputDir: ").append(toIndentedString(outputDir)).append("\n");
        sb.append("    expectChargeNum: ").append(toIndentedString(expectChargeNum)).append("\n");
        sb.append("    realChargeNum: ").append(toIndentedString(realChargeNum)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
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
