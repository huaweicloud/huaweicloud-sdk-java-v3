package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDeviceShadowResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    @JacksonXmlProperty(localName = "device_id")

    private String deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shadow")

    @JacksonXmlProperty(localName = "shadow")

    private List<DeviceShadowData> shadow = null;

    public ShowDeviceShadowResponse withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * 设备ID，用于唯一标识一个设备。在注册设备时直接指定，或者由物联网平台分配获得。由物联网平台分配时，生成规则为\"product_id\" + \"_\" + \"node_id\"拼接而成。
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public ShowDeviceShadowResponse withShadow(List<DeviceShadowData> shadow) {
        this.shadow = shadow;
        return this;
    }

    public ShowDeviceShadowResponse addShadowItem(DeviceShadowData shadowItem) {
        if (this.shadow == null) {
            this.shadow = new ArrayList<>();
        }
        this.shadow.add(shadowItem);
        return this;
    }

    public ShowDeviceShadowResponse withShadow(Consumer<List<DeviceShadowData>> shadowSetter) {
        if (this.shadow == null) {
            this.shadow = new ArrayList<>();
        }
        shadowSetter.accept(this.shadow);
        return this;
    }

    /**
     * 设备影子数据结构体。
     * @return shadow
     */
    public List<DeviceShadowData> getShadow() {
        return shadow;
    }

    public void setShadow(List<DeviceShadowData> shadow) {
        this.shadow = shadow;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDeviceShadowResponse showDeviceShadowResponse = (ShowDeviceShadowResponse) o;
        return Objects.equals(this.deviceId, showDeviceShadowResponse.deviceId)
            && Objects.equals(this.shadow, showDeviceShadowResponse.shadow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceId, shadow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDeviceShadowResponse {\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    shadow: ").append(toIndentedString(shadow)).append("\n");
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
