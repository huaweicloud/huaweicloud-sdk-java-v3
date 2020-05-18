package com.huaweicloud.sdk.cts.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class ListTracesV2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tracker_name")
    
    private String trackerName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_type")
    
    private String serviceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user")
    
    private String user;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="from")
    
    private Long from;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="next")
    
    private String next;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_id")
    
    private String resourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_name")
    
    private String resourceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type")
    
    private String resourceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="to")
    
    private Long to;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trace_id")
    
    private String traceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trace_name")
    
    private String traceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trace_rating")
    
    private String traceRating;

    public ListTracesV2Request withTrackerName(String trackerName) {
        this.trackerName = trackerName;
        return this;
    }

    


    /**
     * Get trackerName
     * @return trackerName
     */
    public String getTrackerName() {
        return trackerName;
    }

    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    public ListTracesV2Request withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    


    /**
     * Get serviceType
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public ListTracesV2Request withUser(String user) {
        this.user = user;
        return this;
    }

    


    /**
     * Get user
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public ListTracesV2Request withFrom(Long from) {
        this.from = from;
        return this;
    }

    


    /**
     * Get from
     * minimum: 946656000000
     * maximum: 4102416000000
     * @return from
     */
    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public ListTracesV2Request withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 0
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListTracesV2Request withNext(String next) {
        this.next = next;
        return this;
    }

    


    /**
     * Get next
     * @return next
     */
    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public ListTracesV2Request withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    


    /**
     * Get resourceId
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ListTracesV2Request withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    


    /**
     * Get resourceName
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ListTracesV2Request withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    


    /**
     * Get resourceType
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ListTracesV2Request withTo(Long to) {
        this.to = to;
        return this;
    }

    


    /**
     * Get to
     * minimum: 946656000000
     * maximum: 4102416000000
     * @return to
     */
    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    public ListTracesV2Request withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    


    /**
     * Get traceId
     * @return traceId
     */
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public ListTracesV2Request withTraceName(String traceName) {
        this.traceName = traceName;
        return this;
    }

    


    /**
     * Get traceName
     * @return traceName
     */
    public String getTraceName() {
        return traceName;
    }

    public void setTraceName(String traceName) {
        this.traceName = traceName;
    }

    public ListTracesV2Request withTraceRating(String traceRating) {
        this.traceRating = traceRating;
        return this;
    }

    


    /**
     * Get traceRating
     * @return traceRating
     */
    public String getTraceRating() {
        return traceRating;
    }

    public void setTraceRating(String traceRating) {
        this.traceRating = traceRating;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTracesV2Request listTracesV2Request = (ListTracesV2Request) o;
        return Objects.equals(this.trackerName, listTracesV2Request.trackerName) &&
            Objects.equals(this.serviceType, listTracesV2Request.serviceType) &&
            Objects.equals(this.user, listTracesV2Request.user) &&
            Objects.equals(this.from, listTracesV2Request.from) &&
            Objects.equals(this.limit, listTracesV2Request.limit) &&
            Objects.equals(this.next, listTracesV2Request.next) &&
            Objects.equals(this.resourceId, listTracesV2Request.resourceId) &&
            Objects.equals(this.resourceName, listTracesV2Request.resourceName) &&
            Objects.equals(this.resourceType, listTracesV2Request.resourceType) &&
            Objects.equals(this.to, listTracesV2Request.to) &&
            Objects.equals(this.traceId, listTracesV2Request.traceId) &&
            Objects.equals(this.traceName, listTracesV2Request.traceName) &&
            Objects.equals(this.traceRating, listTracesV2Request.traceRating);
    }
    @Override
    public int hashCode() {
        return Objects.hash(trackerName, serviceType, user, from, limit, next, resourceId, resourceName, resourceType, to, traceId, traceName, traceRating);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTracesV2Request {\n");
            sb.append("    trackerName: ").append(toIndentedString(trackerName)).append("\n");
            sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
            sb.append("    user: ").append(toIndentedString(user)).append("\n");
            sb.append("    from: ").append(toIndentedString(from)).append("\n");
            sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
            sb.append("    next: ").append(toIndentedString(next)).append("\n");
            sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
            sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
            sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
            sb.append("    to: ").append(toIndentedString(to)).append("\n");
            sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
            sb.append("    traceName: ").append(toIndentedString(traceName)).append("\n");
            sb.append("    traceRating: ").append(toIndentedString(traceRating)).append("\n");
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

