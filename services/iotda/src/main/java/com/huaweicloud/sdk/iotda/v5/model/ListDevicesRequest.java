package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListDevicesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Instance-Id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_id")

    private String gatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_cascade_query")

    private Boolean isCascadeQuery;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_name")

    private String deviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    public ListDevicesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数说明**：实例ID。物理多租下各实例的唯一标识，一般华为云租户无需携带该参数，仅在物理多租场景下从管理面访问API时需要携带该参数。您可以在IoTDA管理控制台界面，选择左侧导航栏“总览”页签查看当前实例的ID
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
     * **参数说明**：设备关联的产品ID，用于唯一标识一个产品模型，创建产品后获得。方法请参见 [[创建产品](https://support.huaweicloud.com/api-iothub/iot_06_v5_0050.html)](tag:hws)[[创建产品](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0050.html)](tag:hws_hk)。 **取值范围**：长度不超过36，只允许字母、数字、下划线（_）、连接符（-）的组合。
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
     * **参数说明**：网关ID，用于标识设备所属的父设备，即父设备的设备ID。携带该参数时，表示查询该设备下的子设备，默认查询下一级子设备，如果需要查询该设备下所有各级子设备，请同时携带is_cascade_query参数为true；不携带该参数时，表示查询用户下所有设备。 **取值范围**：长度不超过128，只允许字母、数字、下划线（_）、连接符（-）的组合。
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
     * **参数说明**：是否级联查询，该参数仅在同时携带gateway_id时生效。默认值为false。 **取值范围**： - true：表示查询设备ID等于gateway_id参数的设备下的所有各级子设备。 - false：表示查询设备ID等于gateway_id参数的设备下的一级子设备。
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
     * **参数说明**：设备标识码，通常使用IMEI、MAC地址或Serial No作为node_id。 **取值范围**：长度不超过64，只允许字母、数字、下划线（_）、连接符（-）的组合。
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
     * **参数说明**：设备名称。 **取值范围**：长度不超过256，只允许中文、字母、数字、以及_?'#().,&%@!-等字符的组合。
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
     * **参数说明**：分页查询时每页显示的记录数。 **取值范围**：1-50的整数，默认值为10。
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
     * **参数说明**：上一次分页查询结果中最后一条记录的ID，在上一次分页查询时由物联网平台返回获得。分页查询时物联网平台是按marker也就是记录ID降序查询的，越新的数据记录ID也会越大。若填写marker，则本次只查询记录ID小于marker的数据记录。若不填写，则从记录ID最大也就是最新的一条数据开始查询。如果需要依次查询所有数据，则每次查询时必须填写上一次查询响应中的marker值。 **取值范围**：长度为24的十六进制字符串，默认值为ffffffffffffffffffffffff。
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
     * **参数说明**：表示从marker后偏移offset条记录开始查询。默认为0，取值范围为0-500的整数。当offset为0时，表示从marker后第一条记录开始输出。限制offset最大值是出于API性能考虑，您可以搭配marker使用该参数实现翻页，例如每页50条记录，1-11页内都可以直接使用offset跳转到指定页，但到11页后，由于offset限制为500，您需要使用第11页返回的marker作为下次查询的marker，以实现翻页到12-22页。 **取值范围**：0-500的整数，默认为0。
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
     * **参数说明**：查询设备注册时间在startTime之后的记录，格式：yyyyMMdd'T'HHmmss'Z'，如20151212T121212Z。
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
     * **参数说明**：查询设备注册时间在endTime之前的记录，格式：yyyyMMdd'T'HHmmss'Z'，如20151212T121212Z。
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
     * **参数说明**：资源空间ID。此参数为非必选参数，存在多资源空间的用户需要使用该接口时，可以携带该参数查询指定资源空间下的设备列表，不携带该参数则会查询该用户下所有设备列表。 **取值范围**：长度不超过36，只允许字母、数字、下划线（_）、连接符（-）的组合。
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
        return Objects.equals(this.instanceId, listDevicesRequest.instanceId)
            && Objects.equals(this.productId, listDevicesRequest.productId)
            && Objects.equals(this.gatewayId, listDevicesRequest.gatewayId)
            && Objects.equals(this.isCascadeQuery, listDevicesRequest.isCascadeQuery)
            && Objects.equals(this.nodeId, listDevicesRequest.nodeId)
            && Objects.equals(this.deviceName, listDevicesRequest.deviceName)
            && Objects.equals(this.limit, listDevicesRequest.limit)
            && Objects.equals(this.marker, listDevicesRequest.marker)
            && Objects.equals(this.offset, listDevicesRequest.offset)
            && Objects.equals(this.startTime, listDevicesRequest.startTime)
            && Objects.equals(this.endTime, listDevicesRequest.endTime)
            && Objects.equals(this.appId, listDevicesRequest.appId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId,
            productId,
            gatewayId,
            isCascadeQuery,
            nodeId,
            deviceName,
            limit,
            marker,
            offset,
            startTime,
            endTime,
            appId);
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
