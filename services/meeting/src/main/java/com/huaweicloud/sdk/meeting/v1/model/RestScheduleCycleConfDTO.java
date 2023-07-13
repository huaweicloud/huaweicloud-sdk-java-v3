package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RestScheduleCycleConfDTO
 */
public class RestScheduleCycleConfDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cycleSubConfID")

    private String cycleSubConfID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mediaTypes")

    private String mediaTypes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "length")

    private Integer length;

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

    public RestScheduleCycleConfDTO withCycleSubConfID(String cycleSubConfID) {
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

    public RestScheduleCycleConfDTO withMediaTypes(String mediaTypes) {
        this.mediaTypes = mediaTypes;
        return this;
    }

    /**
     * 会议的媒体类型。 * Voice：语音会议 * HDVideo：视频会议 
     * @return mediaTypes
     */
    public String getMediaTypes() {
        return mediaTypes;
    }

    public void setMediaTypes(String mediaTypes) {
        this.mediaTypes = mediaTypes;
    }

    public RestScheduleCycleConfDTO withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 会议开始时间（UTC时间）。格式：yyyy-MM-dd HH:mm。 > * 如果没有指定开始时间或填空串，则表示会议马上开始 > * 时间是UTC时间，即0时区的时间 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public RestScheduleCycleConfDTO withLength(Integer length) {
        this.length = length;
        return this;
    }

    /**
     * 会议持续时长，单位分钟。默认30分钟。最大1440分钟（24小时），最小15分钟。 
     * minimum: 15
     * maximum: 1440
     * @return length
     */
    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public RestScheduleCycleConfDTO withIsAutoRecord(Integer isAutoRecord) {
        this.isAutoRecord = isAutoRecord;
        return this;
    }

    /**
     * 会议是否自动启动录制，在录播类型为：录播、录播+直播时才生效。默认为不自动启动。 * 1：自动启动录制 * 0：不自动启动录制 
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

    public RestScheduleCycleConfDTO withConfConfigInfo(CycleSubConfConfigDTO confConfigInfo) {
        this.confConfigInfo = confConfigInfo;
        return this;
    }

    public RestScheduleCycleConfDTO withConfConfigInfo(Consumer<CycleSubConfConfigDTO> confConfigInfoSetter) {
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

    public RestScheduleCycleConfDTO withRecordAuthType(Integer recordAuthType) {
        this.recordAuthType = recordAuthType;
        return this;
    }

    /**
     * 录播观看鉴权方式，在录播类型为:录播、直播+录播时有效。 * 0：可通过链接观看/下载 * 1：企业用户可观看/下载 * 2：与会者可观看/下载 
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

    public RestScheduleCycleConfDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 会议描述，长度限制为200个字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestScheduleCycleConfDTO that = (RestScheduleCycleConfDTO) obj;
        return Objects.equals(this.cycleSubConfID, that.cycleSubConfID)
            && Objects.equals(this.mediaTypes, that.mediaTypes) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.length, that.length) && Objects.equals(this.isAutoRecord, that.isAutoRecord)
            && Objects.equals(this.confConfigInfo, that.confConfigInfo)
            && Objects.equals(this.recordAuthType, that.recordAuthType)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cycleSubConfID,
            mediaTypes,
            startTime,
            length,
            isAutoRecord,
            confConfigInfo,
            recordAuthType,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestScheduleCycleConfDTO {\n");
        sb.append("    cycleSubConfID: ").append(toIndentedString(cycleSubConfID)).append("\n");
        sb.append("    mediaTypes: ").append(toIndentedString(mediaTypes)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    length: ").append(toIndentedString(length)).append("\n");
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
