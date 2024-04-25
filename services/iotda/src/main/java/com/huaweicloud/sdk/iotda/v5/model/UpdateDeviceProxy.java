package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 添加设备代理结构体。
 */
public class UpdateDeviceProxy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_name")

    private String proxyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_devices")

    private List<String> proxyDevices = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_time_range")

    private EffectiveTimeRange effectiveTimeRange;

    public UpdateDeviceProxy withProxyName(String proxyName) {
        this.proxyName = proxyName;
        return this;
    }

    /**
     * **参数说明**：设备代理名称
     * @return proxyName
     */
    public String getProxyName() {
        return proxyName;
    }

    public void setProxyName(String proxyName) {
        this.proxyName = proxyName;
    }

    public UpdateDeviceProxy withProxyDevices(List<String> proxyDevices) {
        this.proxyDevices = proxyDevices;
        return this;
    }

    public UpdateDeviceProxy addProxyDevicesItem(String proxyDevicesItem) {
        if (this.proxyDevices == null) {
            this.proxyDevices = new ArrayList<>();
        }
        this.proxyDevices.add(proxyDevicesItem);
        return this;
    }

    public UpdateDeviceProxy withProxyDevices(Consumer<List<String>> proxyDevicesSetter) {
        if (this.proxyDevices == null) {
            this.proxyDevices = new ArrayList<>();
        }
        proxyDevicesSetter.accept(this.proxyDevices);
        return this;
    }

    /**
     * **参数说明**：代理设备列表，列表内所有设备共享网关权限，即列表内任意一个网关下的子设备可以通过组里任意一个网关上线然后进行数据上报。 **取值范围**：列表内填写设备id，列表内最少有2个设备id，最多有10个设备id，设备id取值范围：长度不超过128，只允许字母、数字、下划线（_）、连接符（-）的组合，建议不少于4个字符。
     * @return proxyDevices
     */
    public List<String> getProxyDevices() {
        return proxyDevices;
    }

    public void setProxyDevices(List<String> proxyDevices) {
        this.proxyDevices = proxyDevices;
    }

    public UpdateDeviceProxy withEffectiveTimeRange(EffectiveTimeRange effectiveTimeRange) {
        this.effectiveTimeRange = effectiveTimeRange;
        return this;
    }

    public UpdateDeviceProxy withEffectiveTimeRange(Consumer<EffectiveTimeRange> effectiveTimeRangeSetter) {
        if (this.effectiveTimeRange == null) {
            this.effectiveTimeRange = new EffectiveTimeRange();
            effectiveTimeRangeSetter.accept(this.effectiveTimeRange);
        }

        return this;
    }

    /**
     * Get effectiveTimeRange
     * @return effectiveTimeRange
     */
    public EffectiveTimeRange getEffectiveTimeRange() {
        return effectiveTimeRange;
    }

    public void setEffectiveTimeRange(EffectiveTimeRange effectiveTimeRange) {
        this.effectiveTimeRange = effectiveTimeRange;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDeviceProxy that = (UpdateDeviceProxy) obj;
        return Objects.equals(this.proxyName, that.proxyName) && Objects.equals(this.proxyDevices, that.proxyDevices)
            && Objects.equals(this.effectiveTimeRange, that.effectiveTimeRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proxyName, proxyDevices, effectiveTimeRange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDeviceProxy {\n");
        sb.append("    proxyName: ").append(toIndentedString(proxyName)).append("\n");
        sb.append("    proxyDevices: ").append(toIndentedString(proxyDevices)).append("\n");
        sb.append("    effectiveTimeRange: ").append(toIndentedString(effectiveTimeRange)).append("\n");
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
