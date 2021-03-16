package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 录制信息
 */
public class RecordResultDO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="confUUID")
    
    private String confUUID;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="confID")
    
    private String confID;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private List<String> url = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rcdTime")
    
    private Integer rcdTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rcdSize")
    
    private Integer rcdSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subject")
    
    private String subject;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scheduserName")
    
    private String scheduserName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="startTime")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isDecodeFinish")
    
    private Boolean isDecodeFinish;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="decodeEndTime")
    
    private Long decodeEndTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="available")
    
    private Boolean available;

    public RecordResultDO withConfUUID(String confUUID) {
        this.confUUID = confUUID;
        return this;
    }

    


    /**
     * 会议UUID。
     * @return confUUID
     */
    public String getConfUUID() {
        return confUUID;
    }

    public void setConfUUID(String confUUID) {
        this.confUUID = confUUID;
    }

    

    public RecordResultDO withConfID(String confID) {
        this.confID = confID;
        return this;
    }

    


    /**
     * 会议ID。
     * @return confID
     */
    public String getConfID() {
        return confID;
    }

    public void setConfID(String confID) {
        this.confID = confID;
    }

    

    public RecordResultDO withUrl(List<String> url) {
        this.url = url;
        return this;
    }

    
    public RecordResultDO addUrlItem(String urlItem) {
        this.url.add(urlItem);
        return this;
    }

    public RecordResultDO withUrl(Consumer<List<String>> urlSetter) {
        if(this.url == null ){
            this.url = new ArrayList<>();
        }
        urlSetter.accept(this.url);
        return this;
    }

    /**
     * 点播地址。
     * @return url
     */
    public List<String> getUrl() {
        return url;
    }

    public void setUrl(List<String> url) {
        this.url = url;
    }

    

    public RecordResultDO withRcdTime(Integer rcdTime) {
        this.rcdTime = rcdTime;
        return this;
    }

    


    /**
     * 录制时长（单位秒）。
     * @return rcdTime
     */
    public Integer getRcdTime() {
        return rcdTime;
    }

    public void setRcdTime(Integer rcdTime) {
        this.rcdTime = rcdTime;
    }

    

    public RecordResultDO withRcdSize(Integer rcdSize) {
        this.rcdSize = rcdSize;
        return this;
    }

    


    /**
     * 录制文件大小（MB）。
     * @return rcdSize
     */
    public Integer getRcdSize() {
        return rcdSize;
    }

    public void setRcdSize(Integer rcdSize) {
        this.rcdSize = rcdSize;
    }

    

    public RecordResultDO withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    


    /**
     * 会议主题。
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    

    public RecordResultDO withScheduserName(String scheduserName) {
        this.scheduserName = scheduserName;
        return this;
    }

    


    /**
     * 会议预订者。
     * @return scheduserName
     */
    public String getScheduserName() {
        return scheduserName;
    }

    public void setScheduserName(String scheduserName) {
        this.scheduserName = scheduserName;
    }

    

    public RecordResultDO withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 会议开始时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public RecordResultDO withIsDecodeFinish(Boolean isDecodeFinish) {
        this.isDecodeFinish = isDecodeFinish;
        return this;
    }

    


    /**
     * 录制文件是否转码完成。
     * @return isDecodeFinish
     */
    public Boolean getIsDecodeFinish() {
        return isDecodeFinish;
    }

    public void setIsDecodeFinish(Boolean isDecodeFinish) {
        this.isDecodeFinish = isDecodeFinish;
    }

    

    public RecordResultDO withDecodeEndTime(Long decodeEndTime) {
        this.decodeEndTime = decodeEndTime;
        return this;
    }

    


    /**
     * 录制文件预计转码完成时间。
     * @return decodeEndTime
     */
    public Long getDecodeEndTime() {
        return decodeEndTime;
    }

    public void setDecodeEndTime(Long decodeEndTime) {
        this.decodeEndTime = decodeEndTime;
    }

    

    public RecordResultDO withAvailable(Boolean available) {
        this.available = available;
        return this;
    }

    


    /**
     * 录播文件是否可观看。
     * @return available
     */
    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecordResultDO recordResultDO = (RecordResultDO) o;
        return Objects.equals(this.confUUID, recordResultDO.confUUID) &&
            Objects.equals(this.confID, recordResultDO.confID) &&
            Objects.equals(this.url, recordResultDO.url) &&
            Objects.equals(this.rcdTime, recordResultDO.rcdTime) &&
            Objects.equals(this.rcdSize, recordResultDO.rcdSize) &&
            Objects.equals(this.subject, recordResultDO.subject) &&
            Objects.equals(this.scheduserName, recordResultDO.scheduserName) &&
            Objects.equals(this.startTime, recordResultDO.startTime) &&
            Objects.equals(this.isDecodeFinish, recordResultDO.isDecodeFinish) &&
            Objects.equals(this.decodeEndTime, recordResultDO.decodeEndTime) &&
            Objects.equals(this.available, recordResultDO.available);
    }
    @Override
    public int hashCode() {
        return Objects.hash(confUUID, confID, url, rcdTime, rcdSize, subject, scheduserName, startTime, isDecodeFinish, decodeEndTime, available);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecordResultDO {\n");
        sb.append("    confUUID: ").append(toIndentedString(confUUID)).append("\n");
        sb.append("    confID: ").append(toIndentedString(confID)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    rcdTime: ").append(toIndentedString(rcdTime)).append("\n");
        sb.append("    rcdSize: ").append(toIndentedString(rcdSize)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    scheduserName: ").append(toIndentedString(scheduserName)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    isDecodeFinish: ").append(toIndentedString(isDecodeFinish)).append("\n");
        sb.append("    decodeEndTime: ").append(toIndentedString(decodeEndTime)).append("\n");
        sb.append("    available: ").append(toIndentedString(available)).append("\n");
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

