package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释** 内核模块服务器列表 
 */
public class KernelModuleHostInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kernel_module_info")

    private KernelModuleInfo kernelModuleInfo;

    public KernelModuleHostInfo withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * **参数解释** agent id **取值范围** 字符长度1-64 
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public KernelModuleHostInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释** 主机id **取值范围** 字符长度1-64 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public KernelModuleHostInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释** 服务器名称 **取值范围** 字符长度1-64 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public KernelModuleHostInfo withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * **参数解释** 服务器ip **取值范围** 字符长度1-64 
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public KernelModuleHostInfo withKernelModuleInfo(KernelModuleInfo kernelModuleInfo) {
        this.kernelModuleInfo = kernelModuleInfo;
        return this;
    }

    public KernelModuleHostInfo withKernelModuleInfo(Consumer<KernelModuleInfo> kernelModuleInfoSetter) {
        if (this.kernelModuleInfo == null) {
            this.kernelModuleInfo = new KernelModuleInfo();
            kernelModuleInfoSetter.accept(this.kernelModuleInfo);
        }

        return this;
    }

    /**
     * Get kernelModuleInfo
     * @return kernelModuleInfo
     */
    public KernelModuleInfo getKernelModuleInfo() {
        return kernelModuleInfo;
    }

    public void setKernelModuleInfo(KernelModuleInfo kernelModuleInfo) {
        this.kernelModuleInfo = kernelModuleInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KernelModuleHostInfo that = (KernelModuleHostInfo) obj;
        return Objects.equals(this.agentId, that.agentId) && Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.hostIp, that.hostIp)
            && Objects.equals(this.kernelModuleInfo, that.kernelModuleInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId, hostId, hostName, hostIp, kernelModuleInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KernelModuleHostInfo {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    kernelModuleInfo: ").append(toIndentedString(kernelModuleInfo)).append("\n");
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
