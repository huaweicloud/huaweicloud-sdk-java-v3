package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 复制对挂载信息数据结构
 */
public class ReplicationAttachment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_instance")

    private String protectedInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device")

    private String device;

    public ReplicationAttachment withProtectedInstance(String protectedInstance) {
        this.protectedInstance = protectedInstance;
        return this;
    }

    /**
     * 该复制对挂载的保护实例ID。
     * @return protectedInstance
     */
    public String getProtectedInstance() {
        return protectedInstance;
    }

    public void setProtectedInstance(String protectedInstance) {
        this.protectedInstance = protectedInstance;
    }

    public ReplicationAttachment withDevice(String device) {
        this.device = device;
        return this;
    }

    /**
     * 挂载点。
     * @return device
     */
    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReplicationAttachment that = (ReplicationAttachment) obj;
        return Objects.equals(this.protectedInstance, that.protectedInstance)
            && Objects.equals(this.device, that.device);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectedInstance, device);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplicationAttachment {\n");
        sb.append("    protectedInstance: ").append(toIndentedString(protectedInstance)).append("\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
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
