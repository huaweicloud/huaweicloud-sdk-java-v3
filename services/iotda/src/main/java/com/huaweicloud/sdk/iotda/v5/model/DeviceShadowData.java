package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 设备影子数据结构体。
 */
public class DeviceShadowData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    @JacksonXmlProperty(localName = "service_id")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desired")

    @JacksonXmlProperty(localName = "desired")

    private DeviceShadowProperties desired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reported")

    @JacksonXmlProperty(localName = "reported")

    private DeviceShadowProperties reported;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    @JacksonXmlProperty(localName = "version")

    private Long version;

    public DeviceShadowData withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 设备的服务ID，在设备关联的产品模型中定义。
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public DeviceShadowData withDesired(DeviceShadowProperties desired) {
        this.desired = desired;
        return this;
    }

    public DeviceShadowData withDesired(Consumer<DeviceShadowProperties> desiredSetter) {
        if (this.desired == null) {
            this.desired = new DeviceShadowProperties();
            desiredSetter.accept(this.desired);
        }

        return this;
    }

    /**
     * Get desired
     * @return desired
     */
    public DeviceShadowProperties getDesired() {
        return desired;
    }

    public void setDesired(DeviceShadowProperties desired) {
        this.desired = desired;
    }

    public DeviceShadowData withReported(DeviceShadowProperties reported) {
        this.reported = reported;
        return this;
    }

    public DeviceShadowData withReported(Consumer<DeviceShadowProperties> reportedSetter) {
        if (this.reported == null) {
            this.reported = new DeviceShadowProperties();
            reportedSetter.accept(this.reported);
        }

        return this;
    }

    /**
     * Get reported
     * @return reported
     */
    public DeviceShadowProperties getReported() {
        return reported;
    }

    public void setReported(DeviceShadowProperties reported) {
        this.reported = reported;
    }

    public DeviceShadowData withVersion(Long version) {
        this.version = version;
        return this;
    }

    /**
     * 设备影子的版本，携带该参数时平台会校验值必须等于当前影子版本，初始从0开始。
     * @return version
     */
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeviceShadowData deviceShadowData = (DeviceShadowData) o;
        return Objects.equals(this.serviceId, deviceShadowData.serviceId)
            && Objects.equals(this.desired, deviceShadowData.desired)
            && Objects.equals(this.reported, deviceShadowData.reported)
            && Objects.equals(this.version, deviceShadowData.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceId, desired, reported, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceShadowData {\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    desired: ").append(toIndentedString(desired)).append("\n");
        sb.append("    reported: ").append(toIndentedString(reported)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
