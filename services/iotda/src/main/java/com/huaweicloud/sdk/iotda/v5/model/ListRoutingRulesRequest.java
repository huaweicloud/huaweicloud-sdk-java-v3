package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListRoutingRulesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Instance-Id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private String resource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event")

    private String event;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_type")

    private String appType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListRoutingRulesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** **参数说明**：实例ID。物理多租下各实例的唯一标识，一般华为云租户无需携带该参数，仅在物理多租场景下从管理面访问API时需要携带该参数。
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListRoutingRulesRequest withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /** **参数说明**：订阅的资源名称。 **取值范围**： - device：设备。 - device.property：设备属性。 - device.message：设备消息。 -
     * device.message.status：设备消息状态。 - device.status：设备状态。 - batchtask：批量任务。 - product：产品。 -
     * device.command.status：设备异步命令状态。
     * 
     * @return resource */
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public ListRoutingRulesRequest withEvent(String event) {
        this.event = event;
        return this;
    }

    /** **参数说明**：订阅的资源事件。 **取值范围**：与资源有关，不同的资源，事件不同。 event需要与resource关联使用，具体的“resource：event”映射关系如下： -
     * device：create（设备添加） - device：delete（设备删除） - device：update（设备更新） - device.status：update （设备状态变更） -
     * device.property：report（设备属性上报） - device.message：report（设备消息上报） - device.message.status：update（设备消息状态变更） -
     * batchtask：update （批量任务状态变更） - product：create（产品添加） - product：delete（产品删除） - product：update（产品更新） -
     * device.command.status：update（设备异步命令状态更新）。
     * 
     * @return event */
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public ListRoutingRulesRequest withAppType(String appType) {
        this.appType = appType;
        return this;
    }

    /** **参数说明**：租户规则的生效范围。 **取值范围**： - GLOBAL：生效范围为租户级。 -
     * APP：生效范围为资源空间级。如果类型为APP，可携带app_id查询指定资源空间下的规则动作列表，不携带app_id则查询[默认资源空间](https://support.huaweicloud.com/usermanual-iothub/iot_01_0006.html#section0)下的规则列表。
     * 
     * @return appType */
    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public ListRoutingRulesRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /** **参数说明**：资源空间ID。此参数为非必选参数，携带app_id查询指定资源空间下的规则动作列表，不携带app_id则查询[默认资源空间](https://support.huaweicloud.com/usermanual-iothub/iot_01_0006.html#section0)下的规则动作列表。
     * **取值范围**：长度不超过36，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * 
     * @return appId */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ListRoutingRulesRequest withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /** **参数说明**：用户自定义的规则名称
     * 
     * @return ruleName */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public ListRoutingRulesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** **参数说明**：分页查询时每页显示的记录数。默认每页10条记录，最大设定每页50条记录。 **取值范围**：1-50的整数，默认值为10。 minimum: 1 maximum: 50
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListRoutingRulesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /** **参数说明**：上一次分页查询结果中最后一条记录的ID，在上一次分页查询时由物联网平台返回获得。分页查询时物联网平台是按marker也就是记录ID降序查询的，越新的数据记录ID也会越大。若填写marker，则本次只查询记录ID小于marker的数据记录。若不填写，则从记录ID最大也就是最新的一条数据开始查询。如果需要依次查询所有数据，则每次查询时必须填写上一次查询响应中的marker值。
     * **取值范围**：长度为24的十六进制字符串，默认值为ffffffffffffffffffffffff。
     * 
     * @return marker */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListRoutingRulesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** **参数说明**：表示从marker后偏移offset条记录开始查询。默认为0，取值范围为0-500的整数。当offset为0时，表示从marker后第一条记录开始输出。 -
     * 限制offset最大值是出于API性能考虑，您可以搭配marker使用该参数实现翻页，例如每页50条记录，1-11页内都可以直接使用offset跳转到指定页，但到11页后，由于offset限制为500，您需要使用第11页返回的marker作为下次查询的marker，以实现翻页到12-22页。
     * **取值范围**：0-500的整数，默认为0。 minimum: 0 maximum: 500
     * 
     * @return offset */
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
        ListRoutingRulesRequest listRoutingRulesRequest = (ListRoutingRulesRequest) o;
        return Objects.equals(this.instanceId, listRoutingRulesRequest.instanceId)
            && Objects.equals(this.resource, listRoutingRulesRequest.resource)
            && Objects.equals(this.event, listRoutingRulesRequest.event)
            && Objects.equals(this.appType, listRoutingRulesRequest.appType)
            && Objects.equals(this.appId, listRoutingRulesRequest.appId)
            && Objects.equals(this.ruleName, listRoutingRulesRequest.ruleName)
            && Objects.equals(this.limit, listRoutingRulesRequest.limit)
            && Objects.equals(this.marker, listRoutingRulesRequest.marker)
            && Objects.equals(this.offset, listRoutingRulesRequest.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, resource, event, appType, appId, ruleName, limit, marker, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRoutingRulesRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
