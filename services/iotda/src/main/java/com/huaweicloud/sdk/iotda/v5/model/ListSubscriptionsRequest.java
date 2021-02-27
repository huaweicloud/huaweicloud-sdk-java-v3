package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListSubscriptionsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Instance-Id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource")
    
    private String resource;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="event")
    
    private String event;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="callbackurl")
    
    private String callbackurl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="channel")
    
    private String channel;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit = 10;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker = "ffffffffffffffffffffffff";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset = 0;

    public ListSubscriptionsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * Get instanceId
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListSubscriptionsRequest withResource(String resource) {
        this.resource = resource;
        return this;
    }

    


    /**
     * Get resource
     * @return resource
     */
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public ListSubscriptionsRequest withEvent(String event) {
        this.event = event;
        return this;
    }

    


    /**
     * Get event
     * @return event
     */
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public ListSubscriptionsRequest withCallbackurl(String callbackurl) {
        this.callbackurl = callbackurl;
        return this;
    }

    


    /**
     * Get callbackurl
     * @return callbackurl
     */
    public String getCallbackurl() {
        return callbackurl;
    }

    public void setCallbackurl(String callbackurl) {
        this.callbackurl = callbackurl;
    }

    public ListSubscriptionsRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * Get appId
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ListSubscriptionsRequest withChannel(String channel) {
        this.channel = channel;
        return this;
    }

    


    /**
     * Get channel
     * @return channel
     */
    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public ListSubscriptionsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 1
     * maximum: 50
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSubscriptionsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    


    /**
     * Get marker
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListSubscriptionsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * minimum: 0
     * maximum: 500
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSubscriptionsRequest listSubscriptionsRequest = (ListSubscriptionsRequest) o;
        return Objects.equals(this.instanceId, listSubscriptionsRequest.instanceId) &&
            Objects.equals(this.resource, listSubscriptionsRequest.resource) &&
            Objects.equals(this.event, listSubscriptionsRequest.event) &&
            Objects.equals(this.callbackurl, listSubscriptionsRequest.callbackurl) &&
            Objects.equals(this.appId, listSubscriptionsRequest.appId) &&
            Objects.equals(this.channel, listSubscriptionsRequest.channel) &&
            Objects.equals(this.limit, listSubscriptionsRequest.limit) &&
            Objects.equals(this.marker, listSubscriptionsRequest.marker) &&
            Objects.equals(this.offset, listSubscriptionsRequest.offset);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, resource, event, callbackurl, appId, channel, limit, marker, offset);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubscriptionsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    callbackurl: ").append(toIndentedString(callbackurl)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

