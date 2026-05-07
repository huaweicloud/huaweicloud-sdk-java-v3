package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAiComponentDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalogue")

    private String catalogue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_name")

    private String serverName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ip")

    private String serverIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ai_application")

    private String aiApplication;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ai_tool")

    private String aiTool;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installation_path")

    private String installationPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_scan_time")

    private Long firstScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_scan_time")

    private Long latestScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_id")

    private String containerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    public ListAiComponentDetailRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**: 每页显示个数 **约束限制**: 不涉及 **取值范围**: 取值10-200 **默认取值**: 10 
     * minimum: 10
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAiComponentDetailRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**: 偏移量：指定返回记录的开始位置 **约束限制**: 不涉及 **取值范围**: 最小值0，最大值2000000 **默认取值**: 默认为0 
     * minimum: 0
     * maximum: 2000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListAiComponentDetailRequest withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**: 资产类别 **约束限制**: 不涉及 **取值范围**: - host：主机资产 - container：容器资产  **默认取值**: host 
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ListAiComponentDetailRequest withCatalogue(String catalogue) {
        this.catalogue = catalogue;
        return this;
    }

    /**
     * **参数解释**: AI组件类别 **约束限制**: 不涉及 **取值范围**: - app：应用 - tool：工具  **默认取值**: 不涉及
     * @return catalogue
     */
    public String getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(String catalogue) {
        this.catalogue = catalogue;
    }

    public ListAiComponentDetailRequest withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * **参数解释**: category==host时 表示服务器名称 category==container时 表示节点名称 category==serverless时 表示实例名称 **约束限制**: 不涉及 **取值范围**: 字符长度0-256位 **默认取值**: 不涉及 
     * @return serverName
     */
    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public ListAiComponentDetailRequest withServerIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }

    /**
     * **参数解释**: category==host时 表示服务器IP地址 category==container时 表示节点IP地址 category==serverless时 表示实例IP地址 **约束限制**: 不涉及 **取值范围**: 字符长度0-128位 **默认取值**: 不涉及 
     * @return serverIp
     */
    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public ListAiComponentDetailRequest withAiApplication(String aiApplication) {
        this.aiApplication = aiApplication;
        return this;
    }

    /**
     * **参数解释**: AI应用名称 **约束限制**: 不涉及 **取值范围**: 字符长度0-128位 **默认取值**: 不涉及 
     * @return aiApplication
     */
    public String getAiApplication() {
        return aiApplication;
    }

    public void setAiApplication(String aiApplication) {
        this.aiApplication = aiApplication;
    }

    public ListAiComponentDetailRequest withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**: 服务器ID **约束限制**: 不涉及 **取值范围**: 字符长度0-128位 **默认取值**: 不涉及 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ListAiComponentDetailRequest withAiTool(String aiTool) {
        this.aiTool = aiTool;
        return this;
    }

    /**
     * **参数解释**: AI工具名称 **约束限制**: 不涉及 **取值范围**: 字符长度0-128位 **默认取值**: 不涉及 
     * @return aiTool
     */
    public String getAiTool() {
        return aiTool;
    }

    public void setAiTool(String aiTool) {
        this.aiTool = aiTool;
    }

    public ListAiComponentDetailRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**: AI应用类型 **约束限制**: 不涉及 **取值范围**: 字符长度0-64位 **默认取值**: 不涉及 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListAiComponentDetailRequest withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**: AI版本 **约束限制**: 不涉及 **取值范围**: 字符长度0-32位 **默认取值**: 不涉及 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ListAiComponentDetailRequest withInstallationPath(String installationPath) {
        this.installationPath = installationPath;
        return this;
    }

    /**
     * **参数解释**: 安装路径 **约束限制**: 不涉及 **取值范围**: 字符长度0-512位 **默认取值**: 不涉及 
     * @return installationPath
     */
    public String getInstallationPath() {
        return installationPath;
    }

    public void setInstallationPath(String installationPath) {
        this.installationPath = installationPath;
    }

    public ListAiComponentDetailRequest withFirstScanTime(Long firstScanTime) {
        this.firstScanTime = firstScanTime;
        return this;
    }

    /**
     * **参数解释**: 首次扫描时间，时间单位毫秒（ms） **约束限制**: 不涉及 **取值范围**: 取值0-9223372036854775807 **默认取值**: 不涉及 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return firstScanTime
     */
    public Long getFirstScanTime() {
        return firstScanTime;
    }

    public void setFirstScanTime(Long firstScanTime) {
        this.firstScanTime = firstScanTime;
    }

    public ListAiComponentDetailRequest withLatestScanTime(Long latestScanTime) {
        this.latestScanTime = latestScanTime;
        return this;
    }

    /**
     * **参数解释**: 最近扫描时间，时间单位毫秒（ms） **约束限制**: 不涉及 **取值范围**: 取值0-9223372036854775807 **默认取值**: 不涉及 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return latestScanTime
     */
    public Long getLatestScanTime() {
        return latestScanTime;
    }

    public void setLatestScanTime(Long latestScanTime) {
        this.latestScanTime = latestScanTime;
    }

    public ListAiComponentDetailRequest withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * **参数解释**: 容器名称 **约束限制**: 不涉及 **取值范围**: 字符长度0-256位 **默认取值**: 不涉及 
     * @return containerName
     */
    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public ListAiComponentDetailRequest withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * **参数解释**: 容器ID **约束限制**: 不涉及 **取值范围**: 字符长度0-128位 **默认取值**: 不涉及 
     * @return containerId
     */
    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public ListAiComponentDetailRequest withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * **参数解释**: 镜像名称 **约束限制**: 不涉及 **取值范围**: 字符长度0-256位 **默认取值**: 不涉及 
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAiComponentDetailRequest that = (ListAiComponentDetailRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.category, that.category) && Objects.equals(this.catalogue, that.catalogue)
            && Objects.equals(this.serverName, that.serverName) && Objects.equals(this.serverIp, that.serverIp)
            && Objects.equals(this.aiApplication, that.aiApplication) && Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.aiTool, that.aiTool) && Objects.equals(this.type, that.type)
            && Objects.equals(this.version, that.version)
            && Objects.equals(this.installationPath, that.installationPath)
            && Objects.equals(this.firstScanTime, that.firstScanTime)
            && Objects.equals(this.latestScanTime, that.latestScanTime)
            && Objects.equals(this.containerName, that.containerName)
            && Objects.equals(this.containerId, that.containerId) && Objects.equals(this.imageName, that.imageName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit,
            offset,
            category,
            catalogue,
            serverName,
            serverIp,
            aiApplication,
            hostId,
            aiTool,
            type,
            version,
            installationPath,
            firstScanTime,
            latestScanTime,
            containerName,
            containerId,
            imageName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAiComponentDetailRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    catalogue: ").append(toIndentedString(catalogue)).append("\n");
        sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
        sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
        sb.append("    aiApplication: ").append(toIndentedString(aiApplication)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    aiTool: ").append(toIndentedString(aiTool)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    installationPath: ").append(toIndentedString(installationPath)).append("\n");
        sb.append("    firstScanTime: ").append(toIndentedString(firstScanTime)).append("\n");
        sb.append("    latestScanTime: ").append(toIndentedString(latestScanTime)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
        sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
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
