package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 保护实例挂载复制对请求数据结构
 */
public class ProtectedInstanceAttachReplicationRequestParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_id")

    @JacksonXmlProperty(localName = "replication_id")

    private String replicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device")

    @JacksonXmlProperty(localName = "device")

    private String device;

    public ProtectedInstanceAttachReplicationRequestParams withReplicationId(String replicationId) {
        this.replicationId = replicationId;
        return this;
    }

    /**
     * 复制对的ID。
     * @return replicationId
     */
    public String getReplicationId() {
        return replicationId;
    }

    public void setReplicationId(String replicationId) {
        this.replicationId = replicationId;
    }

    public ProtectedInstanceAttachReplicationRequestParams withDevice(String device) {
        this.device = device;
        return this;
    }

    /**
     * 复制对中使用的磁盘挂载点。  说明:新增加的磁盘挂载点不能和已有的磁盘挂载点相同。 对于采用XEN虚拟化类型的弹性云服务器组成的保护实例，系统盘挂载点请指定/dev/sda；数据盘挂载点请按英文字母顺序依次指定，如/dev/sdb，/dev/sdc，如果指定了以“/dev/vd”开头的挂载点，系统默认改为“/dev/sd”。对于采用KVM虚拟化类型的弹性云服务器组成的保护实例，系统盘挂载点请指定/dev/vda；数据盘挂载点请按英文字母顺序依次指定，如/dev/vdb，/dev/vdc，如果指定了以“/dev/sd”开头的挂载点，系统默认改为“/dev/vd”。
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
        ProtectedInstanceAttachReplicationRequestParams protectedInstanceAttachReplicationRequestParams =
            (ProtectedInstanceAttachReplicationRequestParams) o;
        return Objects.equals(this.replicationId, protectedInstanceAttachReplicationRequestParams.replicationId)
            && Objects.equals(this.device, protectedInstanceAttachReplicationRequestParams.device);
    }

    @Override
    public int hashCode() {
        return Objects.hash(replicationId, device);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectedInstanceAttachReplicationRequestParams {\n");
        sb.append("    replicationId: ").append(toIndentedString(replicationId)).append("\n");
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
