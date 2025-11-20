package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 插件详细信息
 */
public class PluginDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_version")

    private String agentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    private String arch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_description")

    private String versionDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private String size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_limit")

    private Integer cpuLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_limit")

    private Integer memoryLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    public PluginDetailInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 插件名称 **取值范围**: 不涉及 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PluginDetailInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 插件id **取值范围**: 不涉及 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PluginDetailInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**： 插件版本 **取值范围**: 不涉及 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public PluginDetailInfo withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * **参数解释**： 插件支持的最低Agent版本 **取值范围**: 不涉及 
     * @return agentVersion
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public PluginDetailInfo withArch(String arch) {
        this.arch = arch;
        return this;
    }

    /**
     * **参数解释**： 插件架构 **取值范围**: - x86_64：X86架构 - arm：ARM架构 
     * @return arch
     */
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public PluginDetailInfo withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * **参数解释**： 插件支持的操作系统类型 **取值范围**: - Linux：Linux操作系统 - Windows：Windows操作系统 
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public PluginDetailInfo withVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }

    /**
     * **参数解释**： 插件版本信息描述 **取值范围**: 不涉及 
     * @return versionDescription
     */
    public String getVersionDescription() {
        return versionDescription;
    }

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    public PluginDetailInfo withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释**： 插件安装包大小(MB) **取值范围**: 不涉及 
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public PluginDetailInfo withCpuLimit(Integer cpuLimit) {
        this.cpuLimit = cpuLimit;
        return this;
    }

    /**
     * **参数解释**： 运行插件所需单核CPU(0-100%) **取值范围**: 不涉及 
     * minimum: 0
     * maximum: 100
     * @return cpuLimit
     */
    public Integer getCpuLimit() {
        return cpuLimit;
    }

    public void setCpuLimit(Integer cpuLimit) {
        this.cpuLimit = cpuLimit;
    }

    public PluginDetailInfo withMemoryLimit(Integer memoryLimit) {
        this.memoryLimit = memoryLimit;
        return this;
    }

    /**
     * **参数解释**： 运行插件所需内存(MB) **取值范围**: 不涉及 
     * minimum: 0
     * maximum: 200
     * @return memoryLimit
     */
    public Integer getMemoryLimit() {
        return memoryLimit;
    }

    public void setMemoryLimit(Integer memoryLimit) {
        this.memoryLimit = memoryLimit;
    }

    public PluginDetailInfo withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**： 插件更新时间 **取值范围**: 不涉及 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PluginDetailInfo that = (PluginDetailInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.id, that.id)
            && Objects.equals(this.version, that.version) && Objects.equals(this.agentVersion, that.agentVersion)
            && Objects.equals(this.arch, that.arch) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.versionDescription, that.versionDescription) && Objects.equals(this.size, that.size)
            && Objects.equals(this.cpuLimit, that.cpuLimit) && Objects.equals(this.memoryLimit, that.memoryLimit)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            id,
            version,
            agentVersion,
            arch,
            osType,
            versionDescription,
            size,
            cpuLimit,
            memoryLimit,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginDetailInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    versionDescription: ").append(toIndentedString(versionDescription)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    cpuLimit: ").append(toIndentedString(cpuLimit)).append("\n");
        sb.append("    memoryLimit: ").append(toIndentedString(memoryLimit)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
