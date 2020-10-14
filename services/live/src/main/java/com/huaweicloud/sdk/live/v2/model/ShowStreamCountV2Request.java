package com.huaweicloud.sdk.live.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowStreamCountV2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publish_domains")
    
    private List<String> publishDomains = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;

    public ShowStreamCountV2Request withPublishDomains(List<String> publishDomains) {
        this.publishDomains = publishDomains;
        return this;
    }

    
    public ShowStreamCountV2Request addPublishDomainsItem(String publishDomainsItem) {
        this.publishDomains.add(publishDomainsItem);
        return this;
    }

    public ShowStreamCountV2Request withPublishDomains(Consumer<List<String>> publishDomainsSetter) {
        if(this.publishDomains == null ){
            this.publishDomains = new ArrayList<>();
        }
        publishDomainsSetter.accept(this.publishDomains);
        return this;
    }

    /**
     * Get publishDomains
     * @return publishDomains
     */
    public List<String> getPublishDomains() {
        return publishDomains;
    }

    public void setPublishDomains(List<String> publishDomains) {
        this.publishDomains = publishDomains;
    }

    public ShowStreamCountV2Request withStartTime(String startTime) {
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

    public ShowStreamCountV2Request withEndTime(String endTime) {
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
        ShowStreamCountV2Request showStreamCountV2Request = (ShowStreamCountV2Request) o;
        return Objects.equals(this.publishDomains, showStreamCountV2Request.publishDomains) &&
            Objects.equals(this.startTime, showStreamCountV2Request.startTime) &&
            Objects.equals(this.endTime, showStreamCountV2Request.endTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(publishDomains, startTime, endTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStreamCountV2Request {\n");
        sb.append("    publishDomains: ").append(toIndentedString(publishDomains)).append("\n");
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

