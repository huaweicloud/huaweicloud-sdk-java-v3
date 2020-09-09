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
public class ListDevicesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Instance-Id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    
    private String productId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="gateway_id")
    
    private String gatewayId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_cascade_query")
    
    private Boolean isCascadeQuery = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_id")
    
    private String nodeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_name")
    
    private String deviceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit = 10;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker = "ffffffffffffffffffffffff";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset = 0;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;

    public ListDevicesRequest withInstanceId(String instanceId) {
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

    public ListDevicesRequest withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    


    /**
     * Get productId
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ListDevicesRequest withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    


    /**
     * Get gatewayId
     * @return gatewayId
     */
    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public ListDevicesRequest withIsCascadeQuery(Boolean isCascadeQuery) {
        this.isCascadeQuery = isCascadeQuery;
        return this;
    }

    


    /**
     * Get isCascadeQuery
     * @return isCascadeQuery
     */
    public Boolean getIsCascadeQuery() {
        return isCascadeQuery;
    }

    public void setIsCascadeQuery(Boolean isCascadeQuery) {
        this.isCascadeQuery = isCascadeQuery;
    }

    public ListDevicesRequest withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    


    /**
     * Get nodeId
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ListDevicesRequest withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    


    /**
     * Get deviceName
     * @return deviceName
     */
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public ListDevicesRequest withLimit(Integer limit) {
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

    public ListDevicesRequest withMarker(String marker) {
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

    public ListDevicesRequest withOffset(Integer offset) {
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

    public ListDevicesRequest withStartTime(String startTime) {
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

    public ListDevicesRequest withEndTime(String endTime) {
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

    public ListDevicesRequest withAppId(String appId) {
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDevicesRequest listDevicesRequest = (ListDevicesRequest) o;
        return Objects.equals(this.instanceId, listDevicesRequest.instanceId) &&
            Objects.equals(this.productId, listDevicesRequest.productId) &&
            Objects.equals(this.gatewayId, listDevicesRequest.gatewayId) &&
            Objects.equals(this.isCascadeQuery, listDevicesRequest.isCascadeQuery) &&
            Objects.equals(this.nodeId, listDevicesRequest.nodeId) &&
            Objects.equals(this.deviceName, listDevicesRequest.deviceName) &&
            Objects.equals(this.limit, listDevicesRequest.limit) &&
            Objects.equals(this.marker, listDevicesRequest.marker) &&
            Objects.equals(this.offset, listDevicesRequest.offset) &&
            Objects.equals(this.startTime, listDevicesRequest.startTime) &&
            Objects.equals(this.endTime, listDevicesRequest.endTime) &&
            Objects.equals(this.appId, listDevicesRequest.appId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, productId, gatewayId, isCascadeQuery, nodeId, deviceName, limit, marker, offset, startTime, endTime, appId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDevicesRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
        sb.append("    isCascadeQuery: ").append(toIndentedString(isCascadeQuery)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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

