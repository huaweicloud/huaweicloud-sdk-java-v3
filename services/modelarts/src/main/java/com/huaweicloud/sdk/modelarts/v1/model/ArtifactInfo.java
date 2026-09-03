package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ArtifactInfo
 */
public class ArtifactInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact_type")

    private String artifactType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_best")

    private Boolean isBest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact_id")

    private String artifactId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "continue_train_nums")

    private Integer continueTrainNums;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_name")

    private String assetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "epoch")

    private Integer epoch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "steps")

    private Integer steps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loss")

    private Double loss;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_error_msg")

    private String publishErrorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_infos")

    private List<ContinueTrainTask> taskInfos = null;

    public ArtifactInfo withArtifactType(String artifactType) {
        this.artifactType = artifactType;
        return this;
    }

    /**
     * 产物类型，可选值：final(最终产物)、middle(中间产物)。
     * @return artifactType
     */
    public String getArtifactType() {
        return artifactType;
    }

    public void setArtifactType(String artifactType) {
        this.artifactType = artifactType;
    }

    public ArtifactInfo withIsBest(Boolean isBest) {
        this.isBest = isBest;
        return this;
    }

    /**
     * 是否最优。
     * @return isBest
     */
    public Boolean getIsBest() {
        return isBest;
    }

    public void setIsBest(Boolean isBest) {
        this.isBest = isBest;
    }

    public ArtifactInfo withArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }

    /**
     * 产物id。最终产物为模型ID，中间产物为断点ID。
     * @return artifactId
     */
    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public ArtifactInfo withContinueTrainNums(Integer continueTrainNums) {
        this.continueTrainNums = continueTrainNums;
        return this;
    }

    /**
     * 续训任务数量。
     * minimum: 0
     * maximum: 2147483647
     * @return continueTrainNums
     */
    public Integer getContinueTrainNums() {
        return continueTrainNums;
    }

    public void setContinueTrainNums(Integer continueTrainNums) {
        this.continueTrainNums = continueTrainNums;
    }

    public ArtifactInfo withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 产物发布成功后的资产id。
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public ArtifactInfo withAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    /**
     * 产物发布成功后的资产名称。
     * @return assetName
     */
    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public ArtifactInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 发布状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArtifactInfo withEpoch(Integer epoch) {
        this.epoch = epoch;
        return this;
    }

    /**
     * 轮数。
     * minimum: 0
     * maximum: 2147483647
     * @return epoch
     */
    public Integer getEpoch() {
        return epoch;
    }

    public void setEpoch(Integer epoch) {
        this.epoch = epoch;
    }

    public ArtifactInfo withSteps(Integer steps) {
        this.steps = steps;
        return this;
    }

    /**
     * 步数。
     * minimum: 0
     * maximum: 2147483647
     * @return steps
     */
    public Integer getSteps() {
        return steps;
    }

    public void setSteps(Integer steps) {
        this.steps = steps;
    }

    public ArtifactInfo withLoss(Double loss) {
        this.loss = loss;
        return this;
    }

    /**
     * loss值
     * minimum: 0
     * maximum: 2147483647
     * @return loss
     */
    public Double getLoss() {
        return loss;
    }

    public void setLoss(Double loss) {
        this.loss = loss;
    }

    public ArtifactInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ArtifactInfo withPublishErrorMsg(String publishErrorMsg) {
        this.publishErrorMsg = publishErrorMsg;
        return this;
    }

    /**
     * 产物发布失败的错误信息。
     * @return publishErrorMsg
     */
    public String getPublishErrorMsg() {
        return publishErrorMsg;
    }

    public void setPublishErrorMsg(String publishErrorMsg) {
        this.publishErrorMsg = publishErrorMsg;
    }

    public ArtifactInfo withTaskInfos(List<ContinueTrainTask> taskInfos) {
        this.taskInfos = taskInfos;
        return this;
    }

    public ArtifactInfo addTaskInfosItem(ContinueTrainTask taskInfosItem) {
        if (this.taskInfos == null) {
            this.taskInfos = new ArrayList<>();
        }
        this.taskInfos.add(taskInfosItem);
        return this;
    }

    public ArtifactInfo withTaskInfos(Consumer<List<ContinueTrainTask>> taskInfosSetter) {
        if (this.taskInfos == null) {
            this.taskInfos = new ArrayList<>();
        }
        taskInfosSetter.accept(this.taskInfos);
        return this;
    }

    /**
     * 相关任务信息
     * @return taskInfos
     */
    public List<ContinueTrainTask> getTaskInfos() {
        return taskInfos;
    }

    public void setTaskInfos(List<ContinueTrainTask> taskInfos) {
        this.taskInfos = taskInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ArtifactInfo that = (ArtifactInfo) obj;
        return Objects.equals(this.artifactType, that.artifactType) && Objects.equals(this.isBest, that.isBest)
            && Objects.equals(this.artifactId, that.artifactId)
            && Objects.equals(this.continueTrainNums, that.continueTrainNums)
            && Objects.equals(this.assetId, that.assetId) && Objects.equals(this.assetName, that.assetName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.epoch, that.epoch)
            && Objects.equals(this.steps, that.steps) && Objects.equals(this.loss, that.loss)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.publishErrorMsg, that.publishErrorMsg)
            && Objects.equals(this.taskInfos, that.taskInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artifactType,
            isBest,
            artifactId,
            continueTrainNums,
            assetId,
            assetName,
            status,
            epoch,
            steps,
            loss,
            createTime,
            publishErrorMsg,
            taskInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArtifactInfo {\n");
        sb.append("    artifactType: ").append(toIndentedString(artifactType)).append("\n");
        sb.append("    isBest: ").append(toIndentedString(isBest)).append("\n");
        sb.append("    artifactId: ").append(toIndentedString(artifactId)).append("\n");
        sb.append("    continueTrainNums: ").append(toIndentedString(continueTrainNums)).append("\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    epoch: ").append(toIndentedString(epoch)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
        sb.append("    loss: ").append(toIndentedString(loss)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    publishErrorMsg: ").append(toIndentedString(publishErrorMsg)).append("\n");
        sb.append("    taskInfos: ").append(toIndentedString(taskInfos)).append("\n");
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
