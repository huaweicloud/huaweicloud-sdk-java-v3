package com.huaweicloud.sdk.roma.v2.model;





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
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit = 10;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset = 0;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    
    private Integer productId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_name")
    
    private String productName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_name")
    
    private String deviceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="client_id")
    
    private String clientId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_id")
    
    private String nodeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_type")
    
    private Integer nodeType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="online_status")
    
    private String onlineStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_date_start")
    
    private Long createdDateStart;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_date_end")
    
    private Long createdDateEnd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tag")
    
    private String tag;

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

    public ListDevicesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 0
     * maximum: 999
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListDevicesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * minimum: 0
     * maximum: 999999
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
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

    public ListDevicesRequest withProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    


    /**
     * Get productId
     * minimum: 1
     * maximum: 999999999999999999
     * @return productId
     */
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public ListDevicesRequest withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    


    /**
     * Get productName
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    public ListDevicesRequest withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    


    /**
     * Get clientId
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
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

    public ListDevicesRequest withNodeType(Integer nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    


    /**
     * Get nodeType
     * minimum: 0
     * maximum: 10
     * @return nodeType
     */
    public Integer getNodeType() {
        return nodeType;
    }

    public void setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
    }

    public ListDevicesRequest withOnlineStatus(String onlineStatus) {
        this.onlineStatus = onlineStatus;
        return this;
    }

    


    /**
     * Get onlineStatus
     * @return onlineStatus
     */
    public String getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(String onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public ListDevicesRequest withCreatedDateStart(Long createdDateStart) {
        this.createdDateStart = createdDateStart;
        return this;
    }

    


    /**
     * Get createdDateStart
     * minimum: 1
     * maximum: 999999999999999999
     * @return createdDateStart
     */
    public Long getCreatedDateStart() {
        return createdDateStart;
    }

    public void setCreatedDateStart(Long createdDateStart) {
        this.createdDateStart = createdDateStart;
    }

    public ListDevicesRequest withCreatedDateEnd(Long createdDateEnd) {
        this.createdDateEnd = createdDateEnd;
        return this;
    }

    


    /**
     * Get createdDateEnd
     * minimum: 1
     * maximum: 999999999999999999
     * @return createdDateEnd
     */
    public Long getCreatedDateEnd() {
        return createdDateEnd;
    }

    public void setCreatedDateEnd(Long createdDateEnd) {
        this.createdDateEnd = createdDateEnd;
    }

    public ListDevicesRequest withTag(String tag) {
        this.tag = tag;
        return this;
    }

    


    /**
     * Get tag
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
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
            Objects.equals(this.limit, listDevicesRequest.limit) &&
            Objects.equals(this.offset, listDevicesRequest.offset) &&
            Objects.equals(this.appId, listDevicesRequest.appId) &&
            Objects.equals(this.productId, listDevicesRequest.productId) &&
            Objects.equals(this.productName, listDevicesRequest.productName) &&
            Objects.equals(this.deviceName, listDevicesRequest.deviceName) &&
            Objects.equals(this.clientId, listDevicesRequest.clientId) &&
            Objects.equals(this.nodeId, listDevicesRequest.nodeId) &&
            Objects.equals(this.nodeType, listDevicesRequest.nodeType) &&
            Objects.equals(this.onlineStatus, listDevicesRequest.onlineStatus) &&
            Objects.equals(this.createdDateStart, listDevicesRequest.createdDateStart) &&
            Objects.equals(this.createdDateEnd, listDevicesRequest.createdDateEnd) &&
            Objects.equals(this.tag, listDevicesRequest.tag);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, limit, offset, appId, productId, productName, deviceName, clientId, nodeId, nodeType, onlineStatus, createdDateStart, createdDateEnd, tag);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDevicesRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    onlineStatus: ").append(toIndentedString(onlineStatus)).append("\n");
        sb.append("    createdDateStart: ").append(toIndentedString(createdDateStart)).append("\n");
        sb.append("    createdDateEnd: ").append(toIndentedString(createdDateEnd)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

