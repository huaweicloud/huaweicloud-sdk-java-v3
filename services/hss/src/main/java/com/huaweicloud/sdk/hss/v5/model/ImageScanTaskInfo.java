package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 镜像扫描任务列表
 */
public class ImageScanTaskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private Long beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remain_min")

    private Long remainMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private Integer taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_scope")

    private Integer scanScope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rate_limit")

    private Integer rateLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_all")

    private Boolean isAll;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_num")

    private Integer failedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_num")

    private Integer successNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risky_num")

    private Integer riskyNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_task_type")

    private String syncTaskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reason")

    private String failedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_images")

    private List<ImageScanTaskInfoFailedImages> failedImages = null;

    public ImageScanTaskInfo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释**： 任务ID **取值范围**： 字符长度1-256位 
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ImageScanTaskInfo withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * **参数解释**： 策略ID **取值范围**： 字符长度1-256位 
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public ImageScanTaskInfo withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * **参数解释**： 任务名称 **取值范围**： 字符长度1-256位 
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ImageScanTaskInfo withBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * **参数解释**： 任务开始时间 **取值范围**： 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return beginTime
     */
    public Long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    public ImageScanTaskInfo withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**： 任务结束时间 **取值范围**： 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ImageScanTaskInfo withRemainMin(Long remainMin) {
        this.remainMin = remainMin;
        return this;
    }

    /**
     * **参数解释**： 任务剩余时间 **取值范围**： 最小值0，最大值2147483547 
     * minimum: 0
     * maximum: 2147483547
     * @return remainMin
     */
    public Long getRemainMin() {
        return remainMin;
    }

    public void setRemainMin(Long remainMin) {
        this.remainMin = remainMin;
    }

    public ImageScanTaskInfo withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * **参数解释**： 任务细分类型 **取值范围**： - cycle：定时扫描。 - manual：手动扫描。 - autoSync：定时同步。 - manualSync：手动同步。 
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public ImageScanTaskInfo withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * **参数解释**： 镜像类型 **取值范围**： - local：本地镜像。 - registry：仓库镜像。 
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public ImageScanTaskInfo withTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * **参数解释**： 扫描进度状态 **取值范围**： - 100：扫描完成。 - 0-100：扫描进度。 - -1：扫描终止。 - -2：扫描超时。 - -3：扫描异常。 
     * minimum: -3
     * maximum: 100
     * @return taskStatus
     */
    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    public ImageScanTaskInfo withScanScope(Integer scanScope) {
        this.scanScope = scanScope;
        return this;
    }

    /**
     * **参数解释**： 扫描风险类型 **取值范围**: - 0：none。 - 0x7fffffff：全部。 - 0x000f0000：漏洞。 - 0x0000f000：基线检查。 - 0x00000f00：恶意文件。 - 0x000000f0：敏感信息。 - 0x0000000f：软件合规。 
     * minimum: 0
     * maximum: 2147483547
     * @return scanScope
     */
    public Integer getScanScope() {
        return scanScope;
    }

    public void setScanScope(Integer scanScope) {
        this.scanScope = scanScope;
    }

    public ImageScanTaskInfo withRateLimit(Integer rateLimit) {
        this.rateLimit = rateLimit;
        return this;
    }

    /**
     * **参数解释**： 扫描限速 单位：个/h **取值范围**： 最小值0，最大值1000 
     * minimum: 0
     * maximum: 1000
     * @return rateLimit
     */
    public Integer getRateLimit() {
        return rateLimit;
    }

    public void setRateLimit(Integer rateLimit) {
        this.rateLimit = rateLimit;
    }

    public ImageScanTaskInfo withIsAll(Boolean isAll) {
        this.isAll = isAll;
        return this;
    }

    /**
     * **参数解释**： 扫描全部镜像 **取值范围**： - true：扫描全部镜像。 - false：指定镜像扫描。 
     * @return isAll
     */
    public Boolean getIsAll() {
        return isAll;
    }

    public void setIsAll(Boolean isAll) {
        this.isAll = isAll;
    }

    public ImageScanTaskInfo withFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
        return this;
    }

    /**
     * **参数解释**： 扫描失败镜像数量 **取值范围**： 最小值0，最大值2147483547 
     * minimum: 0
     * maximum: 2147483547
     * @return failedNum
     */
    public Integer getFailedNum() {
        return failedNum;
    }

    public void setFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
    }

    public ImageScanTaskInfo withSuccessNum(Integer successNum) {
        this.successNum = successNum;
        return this;
    }

    /**
     * **参数解释**： 扫描成功镜像数量 **取值范围**： 最小值0，最大值2147483547 
     * minimum: 0
     * maximum: 2147483547
     * @return successNum
     */
    public Integer getSuccessNum() {
        return successNum;
    }

    public void setSuccessNum(Integer successNum) {
        this.successNum = successNum;
    }

    public ImageScanTaskInfo withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * **参数解释**： 任务关联的镜像总数 **取值范围**： 最小值0，最大值2147483547 
     * minimum: 0
     * maximum: 2147483547
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public ImageScanTaskInfo withRiskyNum(Integer riskyNum) {
        this.riskyNum = riskyNum;
        return this;
    }

    /**
     * **参数解释**： 有漏洞风险、基线风险、恶意文件的镜像总数 **取值范围**： 最小值0，最大值2147483547 
     * minimum: 0
     * maximum: 2147483547
     * @return riskyNum
     */
    public Integer getRiskyNum() {
        return riskyNum;
    }

    public void setRiskyNum(Integer riskyNum) {
        this.riskyNum = riskyNum;
    }

    public ImageScanTaskInfo withSyncTaskType(String syncTaskType) {
        this.syncTaskType = syncTaskType;
        return this;
    }

    /**
     * **参数解释**： 同步任务类型 **取值范围**： 字符长度1-256位 
     * @return syncTaskType
     */
    public String getSyncTaskType() {
        return syncTaskType;
    }

    public void setSyncTaskType(String syncTaskType) {
        this.syncTaskType = syncTaskType;
    }

    public ImageScanTaskInfo withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /**
     * **参数解释**： 失败原因 **取值范围**： 字符长度0-128位 
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public ImageScanTaskInfo withFailedImages(List<ImageScanTaskInfoFailedImages> failedImages) {
        this.failedImages = failedImages;
        return this;
    }

    public ImageScanTaskInfo addFailedImagesItem(ImageScanTaskInfoFailedImages failedImagesItem) {
        if (this.failedImages == null) {
            this.failedImages = new ArrayList<>();
        }
        this.failedImages.add(failedImagesItem);
        return this;
    }

    public ImageScanTaskInfo withFailedImages(Consumer<List<ImageScanTaskInfoFailedImages>> failedImagesSetter) {
        if (this.failedImages == null) {
            this.failedImages = new ArrayList<>();
        }
        failedImagesSetter.accept(this.failedImages);
        return this;
    }

    /**
     * **参数解释**： 失败镜像列表 **取值范围**： 最小值0，最大值2147483547 
     * @return failedImages
     */
    public List<ImageScanTaskInfoFailedImages> getFailedImages() {
        return failedImages;
    }

    public void setFailedImages(List<ImageScanTaskInfoFailedImages> failedImages) {
        this.failedImages = failedImages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageScanTaskInfo that = (ImageScanTaskInfo) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.policyId, that.policyId)
            && Objects.equals(this.taskName, that.taskName) && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.remainMin, that.remainMin)
            && Objects.equals(this.taskType, that.taskType) && Objects.equals(this.imageType, that.imageType)
            && Objects.equals(this.taskStatus, that.taskStatus) && Objects.equals(this.scanScope, that.scanScope)
            && Objects.equals(this.rateLimit, that.rateLimit) && Objects.equals(this.isAll, that.isAll)
            && Objects.equals(this.failedNum, that.failedNum) && Objects.equals(this.successNum, that.successNum)
            && Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.riskyNum, that.riskyNum)
            && Objects.equals(this.syncTaskType, that.syncTaskType)
            && Objects.equals(this.failedReason, that.failedReason)
            && Objects.equals(this.failedImages, that.failedImages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            policyId,
            taskName,
            beginTime,
            endTime,
            remainMin,
            taskType,
            imageType,
            taskStatus,
            scanScope,
            rateLimit,
            isAll,
            failedNum,
            successNum,
            totalNum,
            riskyNum,
            syncTaskType,
            failedReason,
            failedImages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageScanTaskInfo {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    remainMin: ").append(toIndentedString(remainMin)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    scanScope: ").append(toIndentedString(scanScope)).append("\n");
        sb.append("    rateLimit: ").append(toIndentedString(rateLimit)).append("\n");
        sb.append("    isAll: ").append(toIndentedString(isAll)).append("\n");
        sb.append("    failedNum: ").append(toIndentedString(failedNum)).append("\n");
        sb.append("    successNum: ").append(toIndentedString(successNum)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    riskyNum: ").append(toIndentedString(riskyNum)).append("\n");
        sb.append("    syncTaskType: ").append(toIndentedString(syncTaskType)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
        sb.append("    failedImages: ").append(toIndentedString(failedImages)).append("\n");
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
