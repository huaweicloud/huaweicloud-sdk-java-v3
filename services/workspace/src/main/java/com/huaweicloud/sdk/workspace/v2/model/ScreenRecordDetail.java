package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ScreenRecordDetail
 */
public class ScreenRecordDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_id")

    private String desktopId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_name")

    private String desktopName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_pool_id")

    private String desktopPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket")

    private String obsBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_directory")

    private String fileDirectory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_filename")

    private String videoFilename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_file_sha256")

    private String videoFileSha256;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_filename")

    private String eventFilename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_file_sha256")

    private String eventFileSha256;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    public ScreenRecordDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 主键UUID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ScreenRecordDetail withDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }

    /**
     * 桌面ID。
     * @return desktopId
     */
    public String getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(String desktopId) {
        this.desktopId = desktopId;
    }

    public ScreenRecordDetail withDesktopName(String desktopName) {
        this.desktopName = desktopName;
        return this;
    }

    /**
     * 桌面名称。
     * @return desktopName
     */
    public String getDesktopName() {
        return desktopName;
    }

    public void setDesktopName(String desktopName) {
        this.desktopName = desktopName;
    }

    public ScreenRecordDetail withDesktopPoolId(String desktopPoolId) {
        this.desktopPoolId = desktopPoolId;
        return this;
    }

    /**
     * 桌面池ID。
     * @return desktopPoolId
     */
    public String getDesktopPoolId() {
        return desktopPoolId;
    }

    public void setDesktopPoolId(String desktopPoolId) {
        this.desktopPoolId = desktopPoolId;
    }

    public ScreenRecordDetail withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * 用户名称。
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ScreenRecordDetail withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 文件大小（Byte）。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ScreenRecordDetail withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 录屏类型。 - FULL：全程录屏。 - INTERVAL：间隔录屏。 - OPERATION：用户操作录屏。 - SESSION：监听会话生命周期录屏。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ScreenRecordDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 录屏状态。 - RECORDING：录制中。 - REC_COMPLETED：录制完成。 - REC_FAILED：录制失败。 - UPLOADING：上传中。 - UPLOAD_COMPLETED：上传完成。 - UPLOAD_FAILED：上传失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ScreenRecordDetail withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 策略ID。
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public ScreenRecordDetail withObsBucket(String obsBucket) {
        this.obsBucket = obsBucket;
        return this;
    }

    /**
     * OBS桶名称。
     * @return obsBucket
     */
    public String getObsBucket() {
        return obsBucket;
    }

    public void setObsBucket(String obsBucket) {
        this.obsBucket = obsBucket;
    }

    public ScreenRecordDetail withFileDirectory(String fileDirectory) {
        this.fileDirectory = fileDirectory;
        return this;
    }

    /**
     * 文件目录。
     * @return fileDirectory
     */
    public String getFileDirectory() {
        return fileDirectory;
    }

    public void setFileDirectory(String fileDirectory) {
        this.fileDirectory = fileDirectory;
    }

    public ScreenRecordDetail withVideoFilename(String videoFilename) {
        this.videoFilename = videoFilename;
        return this;
    }

    /**
     * 录屏文件名称。
     * @return videoFilename
     */
    public String getVideoFilename() {
        return videoFilename;
    }

    public void setVideoFilename(String videoFilename) {
        this.videoFilename = videoFilename;
    }

    public ScreenRecordDetail withVideoFileSha256(String videoFileSha256) {
        this.videoFileSha256 = videoFileSha256;
        return this;
    }

    /**
     * 录屏文件sha256。
     * @return videoFileSha256
     */
    public String getVideoFileSha256() {
        return videoFileSha256;
    }

    public void setVideoFileSha256(String videoFileSha256) {
        this.videoFileSha256 = videoFileSha256;
    }

    public ScreenRecordDetail withEventFilename(String eventFilename) {
        this.eventFilename = eventFilename;
        return this;
    }

    /**
     * 事件文件名称。
     * @return eventFilename
     */
    public String getEventFilename() {
        return eventFilename;
    }

    public void setEventFilename(String eventFilename) {
        this.eventFilename = eventFilename;
    }

    public ScreenRecordDetail withEventFileSha256(String eventFileSha256) {
        this.eventFileSha256 = eventFileSha256;
        return this;
    }

    /**
     * 事件文件sha256。
     * @return eventFileSha256
     */
    public String getEventFileSha256() {
        return eventFileSha256;
    }

    public void setEventFileSha256(String eventFileSha256) {
        this.eventFileSha256 = eventFileSha256;
    }

    public ScreenRecordDetail withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间（2024-10-15T10:04:41.263Z）。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ScreenRecordDetail withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间（2024-10-15T11:04:41.263Z）。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ScreenRecordDetail withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间（2024-10-15T11:04:41.263Z）。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ScreenRecordDetail withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 视频时长（秒）。
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScreenRecordDetail that = (ScreenRecordDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.desktopId, that.desktopId)
            && Objects.equals(this.desktopName, that.desktopName)
            && Objects.equals(this.desktopPoolId, that.desktopPoolId) && Objects.equals(this.username, that.username)
            && Objects.equals(this.size, that.size) && Objects.equals(this.type, that.type)
            && Objects.equals(this.status, that.status) && Objects.equals(this.policyId, that.policyId)
            && Objects.equals(this.obsBucket, that.obsBucket) && Objects.equals(this.fileDirectory, that.fileDirectory)
            && Objects.equals(this.videoFilename, that.videoFilename)
            && Objects.equals(this.videoFileSha256, that.videoFileSha256)
            && Objects.equals(this.eventFilename, that.eventFilename)
            && Objects.equals(this.eventFileSha256, that.eventFileSha256)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.duration, that.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            desktopId,
            desktopName,
            desktopPoolId,
            username,
            size,
            type,
            status,
            policyId,
            obsBucket,
            fileDirectory,
            videoFilename,
            videoFileSha256,
            eventFilename,
            eventFileSha256,
            startTime,
            endTime,
            updateTime,
            duration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScreenRecordDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    desktopId: ").append(toIndentedString(desktopId)).append("\n");
        sb.append("    desktopName: ").append(toIndentedString(desktopName)).append("\n");
        sb.append("    desktopPoolId: ").append(toIndentedString(desktopPoolId)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    obsBucket: ").append(toIndentedString(obsBucket)).append("\n");
        sb.append("    fileDirectory: ").append(toIndentedString(fileDirectory)).append("\n");
        sb.append("    videoFilename: ").append(toIndentedString(videoFilename)).append("\n");
        sb.append("    videoFileSha256: ").append(toIndentedString(videoFileSha256)).append("\n");
        sb.append("    eventFilename: ").append(toIndentedString(eventFilename)).append("\n");
        sb.append("    eventFileSha256: ").append(toIndentedString(eventFileSha256)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
