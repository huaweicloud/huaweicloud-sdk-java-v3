package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 与会者记录
 */
public class ConfAttendeeRecordInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="displayName")
    
    private String displayName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="callNumber")
    
    private String callNumber;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deviceType")
    
    private String deviceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="joinTime")
    
    private Long joinTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="leftTime")
    
    private Long leftTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mediaType")
    
    private String mediaType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deptName")
    
    private String deptName;

    public ConfAttendeeRecordInfo withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    


    /**
     * 名称。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    

    public ConfAttendeeRecordInfo withCallNumber(String callNumber) {
        this.callNumber = callNumber;
        return this;
    }

    


    /**
     * 号码。
     * @return callNumber
     */
    public String getCallNumber() {
        return callNumber;
    }

    public void setCallNumber(String callNumber) {
        this.callNumber = callNumber;
    }

    

    public ConfAttendeeRecordInfo withDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    


    /**
     * 设备类型。
     * @return deviceType
     */
    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    

    public ConfAttendeeRecordInfo withJoinTime(Long joinTime) {
        this.joinTime = joinTime;
        return this;
    }

    


    /**
     * 入会时间（UTC时间，单位毫秒）。
     * @return joinTime
     */
    public Long getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Long joinTime) {
        this.joinTime = joinTime;
    }

    

    public ConfAttendeeRecordInfo withLeftTime(Long leftTime) {
        this.leftTime = leftTime;
        return this;
    }

    


    /**
     * 离会时间（UTC时间，单位毫秒）。
     * @return leftTime
     */
    public Long getLeftTime() {
        return leftTime;
    }

    public void setLeftTime(Long leftTime) {
        this.leftTime = leftTime;
    }

    

    public ConfAttendeeRecordInfo withMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    


    /**
     * 媒体类型。
     * @return mediaType
     */
    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    

    public ConfAttendeeRecordInfo withDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    


    /**
     * 部门名称。
     * @return deptName
     */
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfAttendeeRecordInfo confAttendeeRecordInfo = (ConfAttendeeRecordInfo) o;
        return Objects.equals(this.displayName, confAttendeeRecordInfo.displayName) &&
            Objects.equals(this.callNumber, confAttendeeRecordInfo.callNumber) &&
            Objects.equals(this.deviceType, confAttendeeRecordInfo.deviceType) &&
            Objects.equals(this.joinTime, confAttendeeRecordInfo.joinTime) &&
            Objects.equals(this.leftTime, confAttendeeRecordInfo.leftTime) &&
            Objects.equals(this.mediaType, confAttendeeRecordInfo.mediaType) &&
            Objects.equals(this.deptName, confAttendeeRecordInfo.deptName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(displayName, callNumber, deviceType, joinTime, leftTime, mediaType, deptName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfAttendeeRecordInfo {\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    callNumber: ").append(toIndentedString(callNumber)).append("\n");
        sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
        sb.append("    joinTime: ").append(toIndentedString(joinTime)).append("\n");
        sb.append("    leftTime: ").append(toIndentedString(leftTime)).append("\n");
        sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
        sb.append("    deptName: ").append(toIndentedString(deptName)).append("\n");
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

