package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ServerInfo
 */
public class ServerInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_name")

    private String serverName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_type")

    private String serverType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_volumes")

    private List<VolumeInfo> dataVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_volume")

    private VolumeInfo rootVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_type")

    private String cpuType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private String cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem")

    private String mem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internal_ip")

    private String internalIp;

    public ServerInfo withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 服务器ID。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public ServerInfo withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * 服务器名称。
     * @return serverName
     */
    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public ServerInfo withServerType(String serverType) {
        this.serverType = serverType;
        return this;
    }

    /**
     * ECS或者BMS。
     * @return serverType
     */
    public String getServerType() {
        return serverType;
    }

    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    public ServerInfo withDataVolumes(List<VolumeInfo> dataVolumes) {
        this.dataVolumes = dataVolumes;
        return this;
    }

    public ServerInfo addDataVolumesItem(VolumeInfo dataVolumesItem) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        this.dataVolumes.add(dataVolumesItem);
        return this;
    }

    public ServerInfo withDataVolumes(Consumer<List<VolumeInfo>> dataVolumesSetter) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        dataVolumesSetter.accept(this.dataVolumes);
        return this;
    }

    /**
     * 数据盘。
     * @return dataVolumes
     */
    public List<VolumeInfo> getDataVolumes() {
        return dataVolumes;
    }

    public void setDataVolumes(List<VolumeInfo> dataVolumes) {
        this.dataVolumes = dataVolumes;
    }

    public ServerInfo withRootVolume(VolumeInfo rootVolume) {
        this.rootVolume = rootVolume;
        return this;
    }

    public ServerInfo withRootVolume(Consumer<VolumeInfo> rootVolumeSetter) {
        if (this.rootVolume == null) {
            this.rootVolume = new VolumeInfo();
            rootVolumeSetter.accept(this.rootVolume);
        }

        return this;
    }

    /**
     * Get rootVolume
     * @return rootVolume
     */
    public VolumeInfo getRootVolume() {
        return rootVolume;
    }

    public void setRootVolume(VolumeInfo rootVolume) {
        this.rootVolume = rootVolume;
    }

    public ServerInfo withCpuType(String cpuType) {
        this.cpuType = cpuType;
        return this;
    }

    /**
     * CPU类型。x86或者ARM。
     * @return cpuType
     */
    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    public ServerInfo withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * CPU大小。
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public ServerInfo withMem(String mem) {
        this.mem = mem;
        return this;
    }

    /**
     * 内存大小。
     * @return mem
     */
    public String getMem() {
        return mem;
    }

    public void setMem(String mem) {
        this.mem = mem;
    }

    public ServerInfo withInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }

    /**
     * 内部IP。
     * @return internalIp
     */
    public String getInternalIp() {
        return internalIp;
    }

    public void setInternalIp(String internalIp) {
        this.internalIp = internalIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerInfo that = (ServerInfo) obj;
        return Objects.equals(this.serverId, that.serverId) && Objects.equals(this.serverName, that.serverName)
            && Objects.equals(this.serverType, that.serverType) && Objects.equals(this.dataVolumes, that.dataVolumes)
            && Objects.equals(this.rootVolume, that.rootVolume) && Objects.equals(this.cpuType, that.cpuType)
            && Objects.equals(this.cpu, that.cpu) && Objects.equals(this.mem, that.mem)
            && Objects.equals(this.internalIp, that.internalIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId, serverName, serverType, dataVolumes, rootVolume, cpuType, cpu, mem, internalIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerInfo {\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
        sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
        sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
        sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
        sb.append("    cpuType: ").append(toIndentedString(cpuType)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    mem: ").append(toIndentedString(mem)).append("\n");
        sb.append("    internalIp: ").append(toIndentedString(internalIp)).append("\n");
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
