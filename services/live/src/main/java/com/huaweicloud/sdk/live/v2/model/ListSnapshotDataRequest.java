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
public class ListSnapshotDataRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publish_domain")
    
    private String publishDomain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;

    public ListSnapshotDataRequest withPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }

    


    /**
     * Get publishDomain
     * @return publishDomain
     */
    public String getPublishDomain() {
        return publishDomain;
    }

    public void setPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
    }

    public ListSnapshotDataRequest withStartTime(String startTime) {
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

    public ListSnapshotDataRequest withEndTime(String endTime) {
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
        ListSnapshotDataRequest listSnapshotDataRequest = (ListSnapshotDataRequest) o;
        return Objects.equals(this.publishDomain, listSnapshotDataRequest.publishDomain) &&
            Objects.equals(this.startTime, listSnapshotDataRequest.startTime) &&
            Objects.equals(this.endTime, listSnapshotDataRequest.endTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(publishDomain, startTime, endTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSnapshotDataRequest {\n");
        sb.append("    publishDomain: ").append(toIndentedString(publishDomain)).append("\n");
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

