package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CollectedWdrSnapshotInfoResult
 */
public class CollectedWdrSnapshotInfoResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wdr_type")

    private String wdrType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private Integer fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "download_url")

    private String downloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notes")

    private String notes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_create_time")

    private String jobCreateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_snapshot_id")

    private String startSnapshotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_snapshot_id")

    private String endSnapshotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket")

    private CollectedWdrSnapshotInfoResultObsBucket obsBucket;

    public CollectedWdrSnapshotInfoResult withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**： 任务ID。 **取值范围**： 不涉及。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public CollectedWdrSnapshotInfoResult withWdrType(String wdrType) {
        this.wdrType = wdrType;
        return this;
    }

    /**
     * **参数解释**： 采集类型。 **取值范围**： - 实例级则为cluster。 - 组件级则为component。
     * @return wdrType
     */
    public String getWdrType() {
        return wdrType;
    }

    public void setWdrType(String wdrType) {
        this.wdrType = wdrType;
    }

    public CollectedWdrSnapshotInfoResult withFileSize(Integer fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * **参数解释**： 文件大小单位kb。当status为SUCCESS时，该值不为空。 **取值范围**： 不涉及。
     * @return fileSize
     */
    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public CollectedWdrSnapshotInfoResult withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 下发采集时填写的开始snapshot时间。格式为“yyyy-mm-ddThh:mm:ssZ”。其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。 **取值范围**： 不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public CollectedWdrSnapshotInfoResult withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**： 下发采集时填写的结束snapshot时间。格式为“yyyy-mm-ddThh:mm:ssZ”。其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。 **取值范围**： 不涉及。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public CollectedWdrSnapshotInfoResult withDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    /**
     * **参数解释**： 报告下载链接，有效时间为30分钟。当status为SUCCESS时，该值不为空。 **取值范围**： 不涉及。
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public CollectedWdrSnapshotInfoResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 采集状态。 **取值范围**: - SUCCESS：采集成功。 - FAILED：采集失败。 - EXPORTING：采集中。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CollectedWdrSnapshotInfoResult withNotes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * **参数解释**： 备注。采集类型为组件级时，内容包括采集的组件ID。 **取值范围**： 不涉及。
     * @return notes
     */
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public CollectedWdrSnapshotInfoResult withJobCreateTime(String jobCreateTime) {
        this.jobCreateTime = jobCreateTime;
        return this;
    }

    /**
     * **参数解释**： WDR报告生成任务的创建时间。格式为“yyyy-mm-ddThh:mm:ssZ”。其中，T指某个时间的开始，Z指时区偏移量，当前时间固定为+0时区。例如，\"2025-07-08T10:57:59+0000\"。 **取值范围**： 不涉及。
     * @return jobCreateTime
     */
    public String getJobCreateTime() {
        return jobCreateTime;
    }

    public void setJobCreateTime(String jobCreateTime) {
        this.jobCreateTime = jobCreateTime;
    }

    public CollectedWdrSnapshotInfoResult withStartSnapshotId(String startSnapshotId) {
        this.startSnapshotId = startSnapshotId;
        return this;
    }

    /**
     * **参数解释**： 用于生成WDR报告的第一个对比快照ID。例如：\"20024\"。只针对使用报告生成模式为对比快照ID（mode=snapshot_id）的采集任务生效；如果该任务使用的是时间区间查询方式（mode=time_range），则该字段为空。 **取值范围**： 不涉及。
     * @return startSnapshotId
     */
    public String getStartSnapshotId() {
        return startSnapshotId;
    }

    public void setStartSnapshotId(String startSnapshotId) {
        this.startSnapshotId = startSnapshotId;
    }

    public CollectedWdrSnapshotInfoResult withEndSnapshotId(String endSnapshotId) {
        this.endSnapshotId = endSnapshotId;
        return this;
    }

    /**
     * **参数解释**： 用于生成WDR报告的第二个对比快照ID。例如：\"20025\"。只针对使用报告生成模式为对比快照ID（mode=snapshot_id）的采集任务生效；如果该任务使用的是时间区间查询方式（mode=time_range）来生成的，则该字段为空。 **取值范围**： 不涉及。
     * @return endSnapshotId
     */
    public String getEndSnapshotId() {
        return endSnapshotId;
    }

    public void setEndSnapshotId(String endSnapshotId) {
        this.endSnapshotId = endSnapshotId;
    }

    public CollectedWdrSnapshotInfoResult withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * **参数解释**： WDR报告临时文件名称。 **取值范围**： 不涉及。
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public CollectedWdrSnapshotInfoResult withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * **参数解释**： WDR报告临时文件保存路径。 **取值范围**： 不涉及。
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public CollectedWdrSnapshotInfoResult withObsBucket(CollectedWdrSnapshotInfoResultObsBucket obsBucket) {
        this.obsBucket = obsBucket;
        return this;
    }

    public CollectedWdrSnapshotInfoResult withObsBucket(
        Consumer<CollectedWdrSnapshotInfoResultObsBucket> obsBucketSetter) {
        if (this.obsBucket == null) {
            this.obsBucket = new CollectedWdrSnapshotInfoResultObsBucket();
            obsBucketSetter.accept(this.obsBucket);
        }

        return this;
    }

    /**
     * Get obsBucket
     * @return obsBucket
     */
    public CollectedWdrSnapshotInfoResultObsBucket getObsBucket() {
        return obsBucket;
    }

    public void setObsBucket(CollectedWdrSnapshotInfoResultObsBucket obsBucket) {
        this.obsBucket = obsBucket;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CollectedWdrSnapshotInfoResult that = (CollectedWdrSnapshotInfoResult) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.wdrType, that.wdrType)
            && Objects.equals(this.fileSize, that.fileSize) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.downloadUrl, that.downloadUrl)
            && Objects.equals(this.status, that.status) && Objects.equals(this.notes, that.notes)
            && Objects.equals(this.jobCreateTime, that.jobCreateTime)
            && Objects.equals(this.startSnapshotId, that.startSnapshotId)
            && Objects.equals(this.endSnapshotId, that.endSnapshotId) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.filePath, that.filePath) && Objects.equals(this.obsBucket, that.obsBucket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            wdrType,
            fileSize,
            startTime,
            endTime,
            downloadUrl,
            status,
            notes,
            jobCreateTime,
            startSnapshotId,
            endSnapshotId,
            fileName,
            filePath,
            obsBucket);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollectedWdrSnapshotInfoResult {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    wdrType: ").append(toIndentedString(wdrType)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    jobCreateTime: ").append(toIndentedString(jobCreateTime)).append("\n");
        sb.append("    startSnapshotId: ").append(toIndentedString(startSnapshotId)).append("\n");
        sb.append("    endSnapshotId: ").append(toIndentedString(endSnapshotId)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    obsBucket: ").append(toIndentedString(obsBucket)).append("\n");
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
