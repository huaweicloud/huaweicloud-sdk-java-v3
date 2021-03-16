package com.huaweicloud.sdk.live.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowOnlineUsersRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    private String domain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_name")
    
    private String appName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stream_name")
    
    private String streamName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private OffsetDateTime startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private OffsetDateTime endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="step")
    
    private Integer step;

    public ShowOnlineUsersRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    


    /**
     * Get domain
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    

    public ShowOnlineUsersRequest withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    


    /**
     * Get appName
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    

    public ShowOnlineUsersRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    


    /**
     * Get streamName
     * @return streamName
     */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    

    public ShowOnlineUsersRequest withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * Get startTime
     * @return startTime
     */
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    

    public ShowOnlineUsersRequest withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * Get endTime
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    

    public ShowOnlineUsersRequest withStep(Integer step) {
        this.step = step;
        return this;
    }

    


    /**
     * Get step
     * minimum: 1
     * maximum: 9223372036854775807
     * @return step
     */
    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowOnlineUsersRequest showOnlineUsersRequest = (ShowOnlineUsersRequest) o;
        return Objects.equals(this.domain, showOnlineUsersRequest.domain) &&
            Objects.equals(this.appName, showOnlineUsersRequest.appName) &&
            Objects.equals(this.streamName, showOnlineUsersRequest.streamName) &&
            Objects.equals(this.startTime, showOnlineUsersRequest.startTime) &&
            Objects.equals(this.endTime, showOnlineUsersRequest.endTime) &&
            Objects.equals(this.step, showOnlineUsersRequest.step);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domain, appName, streamName, startTime, endTime, step);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOnlineUsersRequest {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
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

