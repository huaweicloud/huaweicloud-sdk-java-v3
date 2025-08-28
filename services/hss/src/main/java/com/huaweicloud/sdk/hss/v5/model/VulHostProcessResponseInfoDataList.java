package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VulHostProcessResponseInfoDataList
 */
public class VulHostProcessResponseInfoDataList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pid")

    private String pid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_protocol")

    private String portProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependency_package")

    private String dependencyPackage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_use_rate")

    private String cpuUseRate;

    public VulHostProcessResponseInfoDataList withPid(String pid) {
        this.pid = pid;
        return this;
    }

    /**
     * **参数解释**： 进程id **取值范围**： 字符长度0-256位 
     * @return pid
     */
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public VulHostProcessResponseInfoDataList withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * **参数解释**： 绑定ip **取值范围**： 字符长度0-128位 
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public VulHostProcessResponseInfoDataList withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释**： 自启动项的路径 **取值范围**： 字符长度0-256位 
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public VulHostProcessResponseInfoDataList withPortProtocol(String portProtocol) {
        this.portProtocol = portProtocol;
        return this;
    }

    /**
     * **参数解释**： 端口/协议 **取值范围**： 字符长度0-32位 
     * @return portProtocol
     */
    public String getPortProtocol() {
        return portProtocol;
    }

    public void setPortProtocol(String portProtocol) {
        this.portProtocol = portProtocol;
    }

    public VulHostProcessResponseInfoDataList withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**： 版本 **取值范围**： 字符长度0-256位 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public VulHostProcessResponseInfoDataList withDependencyPackage(String dependencyPackage) {
        this.dependencyPackage = dependencyPackage;
        return this;
    }

    /**
     * **参数解释**： 依赖包 **取值范围**： 字符长度0-256位 
     * @return dependencyPackage
     */
    public String getDependencyPackage() {
        return dependencyPackage;
    }

    public void setDependencyPackage(String dependencyPackage) {
        this.dependencyPackage = dependencyPackage;
    }

    public VulHostProcessResponseInfoDataList withCpuUseRate(String cpuUseRate) {
        this.cpuUseRate = cpuUseRate;
        return this;
    }

    /**
     * **参数解释**： cpu使用率 **取值范围**： 字符长度0-32位 
     * @return cpuUseRate
     */
    public String getCpuUseRate() {
        return cpuUseRate;
    }

    public void setCpuUseRate(String cpuUseRate) {
        this.cpuUseRate = cpuUseRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VulHostProcessResponseInfoDataList that = (VulHostProcessResponseInfoDataList) obj;
        return Objects.equals(this.pid, that.pid) && Objects.equals(this.hostIp, that.hostIp)
            && Objects.equals(this.path, that.path) && Objects.equals(this.portProtocol, that.portProtocol)
            && Objects.equals(this.version, that.version)
            && Objects.equals(this.dependencyPackage, that.dependencyPackage)
            && Objects.equals(this.cpuUseRate, that.cpuUseRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pid, hostIp, path, portProtocol, version, dependencyPackage, cpuUseRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulHostProcessResponseInfoDataList {\n");
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    portProtocol: ").append(toIndentedString(portProtocol)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    dependencyPackage: ").append(toIndentedString(dependencyPackage)).append("\n");
        sb.append("    cpuUseRate: ").append(toIndentedString(cpuUseRate)).append("\n");
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
