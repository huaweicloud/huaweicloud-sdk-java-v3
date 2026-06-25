package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 通过挂载网卡方式打通网络参数模型。
 */
public class SfsTurboConnectionStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sfsId")

    private String sfsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connectionType")

    private String connectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipAddr")

    private String ipAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public SfsTurboConnectionStatus withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：sfsTurbo实例的名称。 **取值范围**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SfsTurboConnectionStatus withSfsId(String sfsId) {
        this.sfsId = sfsId;
        return this;
    }

    /**
     * **参数解释**：sfsTurbo实例的ID。 **取值范围**：不涉及。
     * @return sfsId
     */
    public String getSfsId() {
        return sfsId;
    }

    public void setSfsId(String sfsId) {
        this.sfsId = sfsId;
    }

    public SfsTurboConnectionStatus withConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * **参数解释**：关联方式。 **取值范围**：可选值如下： - VpcPort：通过挂载网卡直通 - Peering：通过对等连接打通
     * @return connectionType
     */
    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public SfsTurboConnectionStatus withIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
        return this;
    }

    /**
     * **参数解释**：SFS Turbo的访问地址。 **取值范围**：不涉及。
     * @return ipAddr
     */
    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public SfsTurboConnectionStatus withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：与SFS Turbo的连接状态信息。 **取值范围**：可选值如下： - Active：SFS连通状态正常 - Abnormal：SFS连通状态异常 - Creating：SFS连通状态创建关联中 - Deleting：SFS连通状态解除关联中
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SfsTurboConnectionStatus that = (SfsTurboConnectionStatus) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.sfsId, that.sfsId)
            && Objects.equals(this.connectionType, that.connectionType) && Objects.equals(this.ipAddr, that.ipAddr)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sfsId, connectionType, ipAddr, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SfsTurboConnectionStatus {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sfsId: ").append(toIndentedString(sfsId)).append("\n");
        sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
        sb.append("    ipAddr: ").append(toIndentedString(ipAddr)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
