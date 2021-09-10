package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** RestScheduleCycleConfDTO */
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

    /** 会议ID，长度限制为不超过32个字符
     * 
     * @return cycleSubConfID */
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

    /** 会议的媒体类型 由1个或多个枚举String组成，多个枚举时，每个枚举值之间通过”,”逗号分隔，枚举值如下： “Voice”：语音 “Video”：标清视频
     * “HDVideo”：高清视频（与Video互斥，如果同时选择Video、HDVideo，则系统默认选择Video）
     * “Telepresence”：智真(与HDVideo、Video互斥，如果同时选择，系统使用Telepresence)—暂不支持 “Data”：多媒体（AS会根据系统配置决定是否自动添加Data）
     * 
     * @return mediaTypes */
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

    /** 会议开始时间，使用UTC时间 预定创建会议时，如果没有指定开始时间，或填空串，则表示会议马上开始 格式：YYYY-MM-DD HH:MM
     * 
     * @return startTime */
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

    /** 会议持续时长，单位分钟，最长1440，最短15 minimum: 15 maximum: 1440
     * 
     * @return length */
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

    /** 会议是否自动启动录制，在录播类型为:录播、直播+录播时有效。 1 :true：自动启动录制 0 :false：不自动启动录制 minimum: 0 maximum: 1
     * 
     * @return isAutoRecord */
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

    /** Get confConfigInfo
     * 
     * @return confConfigInfo */
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

    /** 录播鉴权方式，在录播类型为:录播、直播+录播时有效。 0为老的鉴权方式，url中携带token鉴权，1为企业内会议用户鉴权，2为会议内会议用户鉴权 minimum: 0 maximum: 2
     * 
     * @return recordAuthType */
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

    /** 会议描述，长度限制为200个字符
     * 
     * @return description */
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
        RestScheduleCycleConfDTO restScheduleCycleConfDTO = (RestScheduleCycleConfDTO) o;
        return Objects.equals(this.cycleSubConfID, restScheduleCycleConfDTO.cycleSubConfID)
            && Objects.equals(this.mediaTypes, restScheduleCycleConfDTO.mediaTypes)
            && Objects.equals(this.startTime, restScheduleCycleConfDTO.startTime)
            && Objects.equals(this.length, restScheduleCycleConfDTO.length)
            && Objects.equals(this.isAutoRecord, restScheduleCycleConfDTO.isAutoRecord)
            && Objects.equals(this.confConfigInfo, restScheduleCycleConfDTO.confConfigInfo)
            && Objects.equals(this.recordAuthType, restScheduleCycleConfDTO.recordAuthType)
            && Objects.equals(this.description, restScheduleCycleConfDTO.description);
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
