package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新鉴权模板设备资源详情结构体。
 */
public class UpdateAuthenticationTemplateResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private Object deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private TimestampResource timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private Object password;

    public UpdateAuthenticationTemplateResource withDeviceId(Object deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * 设备ID，json对象只能使用FunctionDefinition下的函数从parameters中获取设备ID的取值。
     * @return deviceId
     */
    public Object getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Object deviceId) {
        this.deviceId = deviceId;
    }

    public UpdateAuthenticationTemplateResource withTimestamp(TimestampResource timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public UpdateAuthenticationTemplateResource withTimestamp(Consumer<TimestampResource> timestampSetter) {
        if (this.timestamp == null) {
            this.timestamp = new TimestampResource();
            timestampSetter.accept(this.timestamp);
        }

        return this;
    }

    /**
     * Get timestamp
     * @return timestamp
     */
    public TimestampResource getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(TimestampResource timestamp) {
        this.timestamp = timestamp;
    }

    public UpdateAuthenticationTemplateResource withPassword(Object password) {
        this.password = password;
        return this;
    }

    /**
     * mqtt认证密码，该字段只在设备认证方式为密码认证时生效，证书认证时无效，只能使用FunctionDefinition下的函数从parameters中编程密码的生成方式，平台比较函数解析结果与设备mqtt连接时携带的password是否相等，相等则认证通过。函数中必须包含设备原始秘钥参数${iotda::device::secret}，且只能在hash函数中使用，若想修改清空该字段则设置为空json:{}。
     * @return password
     */
    public Object getPassword() {
        return password;
    }

    public void setPassword(Object password) {
        this.password = password;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAuthenticationTemplateResource that = (UpdateAuthenticationTemplateResource) obj;
        return Objects.equals(this.deviceId, that.deviceId) && Objects.equals(this.timestamp, that.timestamp)
            && Objects.equals(this.password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceId, timestamp, password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAuthenticationTemplateResource {\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
