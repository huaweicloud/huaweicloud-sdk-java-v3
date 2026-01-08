package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RecordAuditRule
 */
public class RecordAuditRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_type")

    private String recordType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval_record_start_time")

    private String intervalRecordStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval_record_end_time")

    private String intervalRecordEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "op_type")

    private String opType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_record")

    private Boolean audioRecord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fps")

    private String fps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private String duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolution")

    private String resolution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_enable")

    private Boolean eventEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_suffix")

    private String fileSuffix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regit_paths")

    private String regitPaths;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_filter_type")

    private String appFilterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_white_list")

    private String appWhiteList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_black_list")

    private String appBlackList;

    public RecordAuditRule withRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * 录制类型。取值为： whole：表示全程录屏。 interval：表示间隔录屏。 userOperations：表示用户操作录屏。 sessionMonitoring：监听会话生命周期录屏。
     * @return recordType
     */
    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public RecordAuditRule withIntervalRecordStartTime(String intervalRecordStartTime) {
        this.intervalRecordStartTime = intervalRecordStartTime;
        return this;
    }

    /**
     * 间隔录制开始时间，仅录制类型为interval时有效 \"hh:mm\"。
     * @return intervalRecordStartTime
     */
    public String getIntervalRecordStartTime() {
        return intervalRecordStartTime;
    }

    public void setIntervalRecordStartTime(String intervalRecordStartTime) {
        this.intervalRecordStartTime = intervalRecordStartTime;
    }

    public RecordAuditRule withIntervalRecordEndTime(String intervalRecordEndTime) {
        this.intervalRecordEndTime = intervalRecordEndTime;
        return this;
    }

    /**
     * 间隔录制结束时间，仅录制类型为interval时有效格式 \"hh:mm\"。
     * @return intervalRecordEndTime
     */
    public String getIntervalRecordEndTime() {
        return intervalRecordEndTime;
    }

    public void setIntervalRecordEndTime(String intervalRecordEndTime) {
        this.intervalRecordEndTime = intervalRecordEndTime;
    }

    public RecordAuditRule withOpType(String opType) {
        this.opType = opType;
        return this;
    }

    /**
     * 操作触发类型，仅录制类型为userOperations时有效。取值为： input：表示用户输入内容即启动录屏。 filecopy：表示用户拷贝文件即启动录屏。
     * @return opType
     */
    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    public RecordAuditRule withAudioRecord(Boolean audioRecord) {
        this.audioRecord = audioRecord;
        return this;
    }

    /**
     * 是否开启音频录制开关。取值为： false：表示关闭。 true：表示开启。
     * @return audioRecord
     */
    public Boolean getAudioRecord() {
        return audioRecord;
    }

    public void setAudioRecord(Boolean audioRecord) {
        this.audioRecord = audioRecord;
    }

    public RecordAuditRule withFps(String fps) {
        this.fps = fps;
        return this;
    }

    /**
     * 录制帧率。取值为：2/5/10/15。
     * @return fps
     */
    public String getFps() {
        return fps;
    }

    public void setFps(String fps) {
        this.fps = fps;
    }

    public RecordAuditRule withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 录制视频单文件时长（分钟）。取值为：10/20/30/60。
     * @return duration
     */
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public RecordAuditRule withResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }

    /**
     * 分辨率设置。取值为：720P/1080P/original。
     * @return resolution
     */
    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public RecordAuditRule withEventEnable(Boolean eventEnable) {
        this.eventEnable = eventEnable;
        return this;
    }

    /**
     * 是否启动关键事件审计。取值为： false：表示关闭。 true：表示开启。
     * @return eventEnable
     */
    public Boolean getEventEnable() {
        return eventEnable;
    }

    public void setEventEnable(Boolean eventEnable) {
        this.eventEnable = eventEnable;
    }

    public RecordAuditRule withFileSuffix(String fileSuffix) {
        this.fileSuffix = fileSuffix;
        return this;
    }

    /**
     * 文件后缀，多个用\"|\"分隔。
     * @return fileSuffix
     */
    public String getFileSuffix() {
        return fileSuffix;
    }

    public void setFileSuffix(String fileSuffix) {
        this.fileSuffix = fileSuffix;
    }

    public RecordAuditRule withRegitPaths(String regitPaths) {
        this.regitPaths = regitPaths;
        return this;
    }

    /**
     * 注册表路径，多个用\"|\"分隔。
     * @return regitPaths
     */
    public String getRegitPaths() {
        return regitPaths;
    }

    public void setRegitPaths(String regitPaths) {
        this.regitPaths = regitPaths;
    }

    public RecordAuditRule withAppFilterType(String appFilterType) {
        this.appFilterType = appFilterType;
        return this;
    }

    /**
     * 应用过滤类型，black（黑名单）或者white（白名单）二选一。
     * @return appFilterType
     */
    public String getAppFilterType() {
        return appFilterType;
    }

    public void setAppFilterType(String appFilterType) {
        this.appFilterType = appFilterType;
    }

    public RecordAuditRule withAppWhiteList(String appWhiteList) {
        this.appWhiteList = appWhiteList;
        return this;
    }

    /**
     * APP开启/关闭白名单，仅监控配置的白名单应用列表。
     * @return appWhiteList
     */
    public String getAppWhiteList() {
        return appWhiteList;
    }

    public void setAppWhiteList(String appWhiteList) {
        this.appWhiteList = appWhiteList;
    }

    public RecordAuditRule withAppBlackList(String appBlackList) {
        this.appBlackList = appBlackList;
        return this;
    }

    /**
     * APP开启/关闭黑名单，忽略黑名单里面的应用列表。
     * @return appBlackList
     */
    public String getAppBlackList() {
        return appBlackList;
    }

    public void setAppBlackList(String appBlackList) {
        this.appBlackList = appBlackList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecordAuditRule that = (RecordAuditRule) obj;
        return Objects.equals(this.recordType, that.recordType)
            && Objects.equals(this.intervalRecordStartTime, that.intervalRecordStartTime)
            && Objects.equals(this.intervalRecordEndTime, that.intervalRecordEndTime)
            && Objects.equals(this.opType, that.opType) && Objects.equals(this.audioRecord, that.audioRecord)
            && Objects.equals(this.fps, that.fps) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.resolution, that.resolution) && Objects.equals(this.eventEnable, that.eventEnable)
            && Objects.equals(this.fileSuffix, that.fileSuffix) && Objects.equals(this.regitPaths, that.regitPaths)
            && Objects.equals(this.appFilterType, that.appFilterType)
            && Objects.equals(this.appWhiteList, that.appWhiteList)
            && Objects.equals(this.appBlackList, that.appBlackList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordType,
            intervalRecordStartTime,
            intervalRecordEndTime,
            opType,
            audioRecord,
            fps,
            duration,
            resolution,
            eventEnable,
            fileSuffix,
            regitPaths,
            appFilterType,
            appWhiteList,
            appBlackList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecordAuditRule {\n");
        sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
        sb.append("    intervalRecordStartTime: ").append(toIndentedString(intervalRecordStartTime)).append("\n");
        sb.append("    intervalRecordEndTime: ").append(toIndentedString(intervalRecordEndTime)).append("\n");
        sb.append("    opType: ").append(toIndentedString(opType)).append("\n");
        sb.append("    audioRecord: ").append(toIndentedString(audioRecord)).append("\n");
        sb.append("    fps: ").append(toIndentedString(fps)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
        sb.append("    eventEnable: ").append(toIndentedString(eventEnable)).append("\n");
        sb.append("    fileSuffix: ").append(toIndentedString(fileSuffix)).append("\n");
        sb.append("    regitPaths: ").append(toIndentedString(regitPaths)).append("\n");
        sb.append("    appFilterType: ").append(toIndentedString(appFilterType)).append("\n");
        sb.append("    appWhiteList: ").append(toIndentedString(appWhiteList)).append("\n");
        sb.append("    appBlackList: ").append(toIndentedString(appBlackList)).append("\n");
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
