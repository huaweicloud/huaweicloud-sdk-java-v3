package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListPropertyActiveControlsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private String deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property")

    private String property;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_controls")

    private List<ActiveControlRspDTO> activeControls = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_code")

    private Integer resultCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_desc")

    private String resultDesc;

    public ListPropertyActiveControlsResponse withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * 设备id
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public ListPropertyActiveControlsResponse withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 设备的服务id
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public ListPropertyActiveControlsResponse withProperty(String property) {
        this.property = property;
        return this;
    }

    /**
     * 设备的属性
     * @return property
     */
    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public ListPropertyActiveControlsResponse withActiveControls(List<ActiveControlRspDTO> activeControls) {
        this.activeControls = activeControls;
        return this;
    }

    public ListPropertyActiveControlsResponse addActiveControlsItem(ActiveControlRspDTO activeControlsItem) {
        if (this.activeControls == null) {
            this.activeControls = new ArrayList<>();
        }
        this.activeControls.add(activeControlsItem);
        return this;
    }

    public ListPropertyActiveControlsResponse withActiveControls(
        Consumer<List<ActiveControlRspDTO>> activeControlsSetter) {
        if (this.activeControls == null) {
            this.activeControls = new ArrayList<>();
        }
        activeControlsSetter.accept(this.activeControls);
        return this;
    }

    /**
     * 正在执行中的控制列表
     * @return activeControls
     */
    public List<ActiveControlRspDTO> getActiveControls() {
        return activeControls;
    }

    public void setActiveControls(List<ActiveControlRspDTO> activeControls) {
        this.activeControls = activeControls;
    }

    public ListPropertyActiveControlsResponse withResultCode(Integer resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    /**
     * 结果响应码，大于等于400表示失败，小于400表示成功
     * @return resultCode
     */
    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public ListPropertyActiveControlsResponse withResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
        return this;
    }

    /**
     * 结果描述
     * @return resultDesc
     */
    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPropertyActiveControlsResponse that = (ListPropertyActiveControlsResponse) obj;
        return Objects.equals(this.deviceId, that.deviceId) && Objects.equals(this.serviceId, that.serviceId)
            && Objects.equals(this.property, that.property) && Objects.equals(this.activeControls, that.activeControls)
            && Objects.equals(this.resultCode, that.resultCode) && Objects.equals(this.resultDesc, that.resultDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceId, serviceId, property, activeControls, resultCode, resultDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPropertyActiveControlsResponse {\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    property: ").append(toIndentedString(property)).append("\n");
        sb.append("    activeControls: ").append(toIndentedString(activeControls)).append("\n");
        sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
        sb.append("    resultDesc: ").append(toIndentedString(resultDesc)).append("\n");
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
