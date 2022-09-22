package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CycleSubConf
 */
public class CycleSubConf {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cycleSubConfID")

    private String cycleSubConfID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conferenceID")

    private String conferenceID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mediaType")

    private String mediaType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endTime")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoRecord")

    private Integer isAutoRecord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confConfigInfo")

    private CycleSubConfConfigDTO confConfigInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recordAuthType")

    private Integer recordAuthType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public CycleSubConf withCycleSubConfID(String cycleSubConfID) {
        this.cycleSubConfID = cycleSubConfID;
        return this;
    }

    /**
     * 子会议UUID。
     * @return cycleSubConfID
     */
    public String getCycleSubConfID() {
        return cycleSubConfID;
    }

    public void setCycleSubConfID(String cycleSubConfID) {
        this.cycleSubConfID = cycleSubConfID;
    }

    public CycleSubConf withConferenceID(String conferenceID) {
        this.conferenceID = conferenceID;
        return this;
    }

    /**
     * 会议ID。
     * @return conferenceID
     */
    public String getConferenceID() {
        return conferenceID;
    }

    public void setConferenceID(String conferenceID) {
        this.conferenceID = conferenceID;
    }

    public CycleSubConf withMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    /**
     * 会议的媒体类型。 * Voice：语音 * Video：标清视频 * HDVideo：高清视频 * Data：数据 
     * @return mediaType
     */
    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public CycleSubConf withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 会议起始时间(格式：YYYY-MM-DD HH:MM)。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public CycleSubConf withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 会议结束时间(格式：YYYY-MM-DD HH:MM)。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public CycleSubConf withIsAutoRecord(Integer isAutoRecord) {
        this.isAutoRecord = isAutoRecord;
        return this;
    }

    /**
     * 是否自动开启云录制。 - 0: 不自动启动 - 1: 自动启动 
     * minimum: 0
     * maximum: 1
     * @return isAutoRecord
     */
    public Integer getIsAutoRecord() {
        return isAutoRecord;
    }

    public void setIsAutoRecord(Integer isAutoRecord) {
        this.isAutoRecord = isAutoRecord;
    }

    public CycleSubConf withConfConfigInfo(CycleSubConfConfigDTO confConfigInfo) {
        this.confConfigInfo = confConfigInfo;
        return this;
    }

    public CycleSubConf withConfConfigInfo(Consumer<CycleSubConfConfigDTO> confConfigInfoSetter) {
        if (this.confConfigInfo == null) {
            this.confConfigInfo = new CycleSubConfConfigDTO();
            confConfigInfoSetter.accept(this.confConfigInfo);
        }

        return this;
    }

    /**
     * Get confConfigInfo
     * @return confConfigInfo
     */
    public CycleSubConfConfigDTO getConfConfigInfo() {
        return confConfigInfo;
    }

    public void setConfConfigInfo(CycleSubConfConfigDTO confConfigInfo) {
        this.confConfigInfo = confConfigInfo;
    }

    public CycleSubConf withRecordAuthType(Integer recordAuthType) {
        this.recordAuthType = recordAuthType;
        return this;
    }

    /**
     * 观看/下载录播的鉴权方式。 - 0: 可通过链接观看/下载 - 1: 企业用户可观看/下载 - 2: 与会者可观看/下载 
     * minimum: 0
     * maximum: 2
     * @return recordAuthType
     */
    public Integer getRecordAuthType() {
        return recordAuthType;
    }

    public void setRecordAuthType(Integer recordAuthType) {
        this.recordAuthType = recordAuthType;
    }

    public CycleSubConf withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 会议描述。长度限制为200个字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CycleSubConf cycleSubConf = (CycleSubConf) o;
        return Objects.equals(this.cycleSubConfID, cycleSubConf.cycleSubConfID)
            && Objects.equals(this.conferenceID, cycleSubConf.conferenceID)
            && Objects.equals(this.mediaType, cycleSubConf.mediaType)
            && Objects.equals(this.startTime, cycleSubConf.startTime)
            && Objects.equals(this.endTime, cycleSubConf.endTime)
            && Objects.equals(this.isAutoRecord, cycleSubConf.isAutoRecord)
            && Objects.equals(this.confConfigInfo, cycleSubConf.confConfigInfo)
            && Objects.equals(this.recordAuthType, cycleSubConf.recordAuthType)
            && Objects.equals(this.description, cycleSubConf.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cycleSubConfID,
            conferenceID,
            mediaType,
            startTime,
            endTime,
            isAutoRecord,
            confConfigInfo,
            recordAuthType,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CycleSubConf {\n");
        sb.append("    cycleSubConfID: ").append(toIndentedString(cycleSubConfID)).append("\n");
        sb.append("    conferenceID: ").append(toIndentedString(conferenceID)).append("\n");
        sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    isAutoRecord: ").append(toIndentedString(isAutoRecord)).append("\n");
        sb.append("    confConfigInfo: ").append(toIndentedString(confConfigInfo)).append("\n");
        sb.append("    recordAuthType: ").append(toIndentedString(recordAuthType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
