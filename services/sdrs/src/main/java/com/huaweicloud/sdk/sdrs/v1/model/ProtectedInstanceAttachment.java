package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 保护实例挂载信息结构
 */
public class ProtectedInstanceAttachment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication")

    @JacksonXmlProperty(localName = "replication")

    private String replication;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device")

    @JacksonXmlProperty(localName = "device")

    private String device;

    public ProtectedInstanceAttachment withReplication(String replication) {
        this.replication = replication;
        return this;
    }

    /**
     * 复制对ID。
     * @return replication
     */
    public String getReplication() {
        return replication;
    }

    public void setReplication(String replication) {
        this.replication = replication;
    }

    public ProtectedInstanceAttachment withDevice(String device) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProtectedInstanceAttachment protectedInstanceAttachment = (ProtectedInstanceAttachment) o;
        return Objects.equals(this.replication, protectedInstanceAttachment.replication)
            && Objects.equals(this.device, protectedInstanceAttachment.device);
    }

    @Override
    public int hashCode() {
        return Objects.hash(replication, device);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectedInstanceAttachment {\n");
        sb.append("    replication: ").append(toIndentedString(replication)).append("\n");
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
