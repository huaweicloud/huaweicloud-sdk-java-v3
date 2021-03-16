package com.huaweicloud.sdk.live.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListSingleStreamFramerateRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    private String domain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app")
    
    private String app;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stream")
    
    private String stream;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;

    public ListSingleStreamFramerateRequest withDomain(String domain) {
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

    

    public ListSingleStreamFramerateRequest withApp(String app) {
        this.app = app;
        return this;
    }

    


    /**
     * Get app
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    

    public ListSingleStreamFramerateRequest withStream(String stream) {
        this.stream = stream;
        return this;
    }

    


    /**
     * Get stream
     * @return stream
     */
    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    

    public ListSingleStreamFramerateRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * Get startTime
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public ListSingleStreamFramerateRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * Get endTime
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSingleStreamFramerateRequest listSingleStreamFramerateRequest = (ListSingleStreamFramerateRequest) o;
        return Objects.equals(this.domain, listSingleStreamFramerateRequest.domain) &&
            Objects.equals(this.app, listSingleStreamFramerateRequest.app) &&
            Objects.equals(this.stream, listSingleStreamFramerateRequest.stream) &&
            Objects.equals(this.startTime, listSingleStreamFramerateRequest.startTime) &&
            Objects.equals(this.endTime, listSingleStreamFramerateRequest.endTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domain, app, stream, startTime, endTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSingleStreamFramerateRequest {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

