package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListImageLocalRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version")

    private String imageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_status")

    private String scanStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_image_type")

    private String localImageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_size")

    private Long imageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_latest_update_time")

    private Long startLatestUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_latest_update_time")

    private Long endLatestUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_latest_scan_time")

    private Long startLatestScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_latest_scan_time")

    private Long endLatestScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_vul")

    private Boolean hasVul;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_id")

    private String containerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_id")

    private String podId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_name")

    private String podName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_container")

    private Boolean hasContainer;

    public ListImageLocalRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**: 企业项目ID，用于过滤不同企业项目下的资产。获取方式请参见[获取企业项目ID](hss_02_0027.xml)。 如需查询所有企业项目下的资产请传参“all_granted_eps”。 **约束限制**: 开通企业项目功能后才需要配置企业项目ID参数。 **取值范围**: 字符长度1-256位 **默认取值**: 0，表示默认企业项目（default）。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListImageLocalRequest withOffset(Integer offset) {
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

    public ListImageLocalRequest withLimit(Integer limit) {
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

    public ListImageLocalRequest withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * **参数解释** 本地镜像的名称，用于模糊筛选指定名称的本地镜像列表 **约束限制** 支持部分匹配（如传入'web'可匹配所有名称含'web'的镜像），区分大小写 **取值范围** 字符长度1-256位，支持字母、数字、短横线、下划线、点号，禁止含@#$%等特殊字符 **默认取值** 无 
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public ListImageLocalRequest withImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }

    /**
     * **参数解释** 本地镜像的版本标识，用于筛选指定版本的本地镜像，需与image_name配合使用 **约束限制** 仅当指定image_name时传参有效，否则筛选条件不生效 **取值范围** 字符长度1-128位，支持字母、数字、短横线、下划线、点号、冒号 **默认取值** 无 
     * @return imageVersion
     */
    public String getImageVersion() {
        return imageVersion;
    }

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    public ListImageLocalRequest withScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
        return this;
    }

    /**
     * **参数解释** 本地镜像的安全扫描状态，用于筛选指定扫描状态的镜像列表 **约束限制** 取值必须在指定范围内，否则返回空结果，区分大小写 **取值范围**   - unscan : 未扫描   - success : 扫描完成   - scanning : 扫描中   - failed : 扫描失败   - waiting_for_scan : 等待扫描 **默认取值** 无 
     * @return scanStatus
     */
    public String getScanStatus() {
        return scanStatus;
    }

    public void setScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
    }

    public ListImageLocalRequest withLocalImageType(String localImageType) {
        this.localImageType = localImageType;
        return this;
    }

    /**
     * **参数解释** 本地镜像的存储来源类型，用于筛选不同来源的本地镜像 **约束限制** 取值必须在指定范围内，否则返回空结果，区分大小写 **取值范围**  - other_image : 非SWR镜像  - swr_image : SWR镜像 **默认取值** 无 
     * @return localImageType
     */
    public String getLocalImageType() {
        return localImageType;
    }

    public void setLocalImageType(String localImageType) {
        this.localImageType = localImageType;
    }

    public ListImageLocalRequest withImageSize(Long imageSize) {
        this.imageSize = imageSize;
        return this;
    }

    /**
     * **参数解释** 本地镜像的大小（单位字节），用于筛选指定大小的镜像（精确匹配） **约束限制** 仅支持精确匹配，如需范围筛选需结合业务层处理 **取值范围** 取值0-9223372036854775807（约9EB） **默认取值** 无 
     * minimum: 0
     * maximum: 2147483547
     * @return imageSize
     */
    public Long getImageSize() {
        return imageSize;
    }

    public void setImageSize(Long imageSize) {
        this.imageSize = imageSize;
    }

    public ListImageLocalRequest withStartLatestUpdateTime(Long startLatestUpdateTime) {
        this.startLatestUpdateTime = startLatestUpdateTime;
        return this;
    }

    /**
     * **参数解释** 本地镜像版本最后更新时间的查询起始值（Unix时间戳，单位ms），与end_latest_update_time配合筛选时间范围 **时间格式** Unix时间戳（如1697509433000表示2023-10-16 10:23:53） **约束限制** 需与end_latest_update_time同时使用，且小于end_latest_update_time，否则筛选无效 **取值范围** 取值0-9223372036854775807 **默认取值** 无 
     * minimum: 0
     * maximum: 2147483547
     * @return startLatestUpdateTime
     */
    public Long getStartLatestUpdateTime() {
        return startLatestUpdateTime;
    }

    public void setStartLatestUpdateTime(Long startLatestUpdateTime) {
        this.startLatestUpdateTime = startLatestUpdateTime;
    }

    public ListImageLocalRequest withEndLatestUpdateTime(Long endLatestUpdateTime) {
        this.endLatestUpdateTime = endLatestUpdateTime;
        return this;
    }

    /**
     * **参数解释** 本地镜像版本最后更新时间的查询结束值（Unix时间戳，单位ms），与start_latest_update_time配合筛选时间范围 **时间格式** Unix时间戳（如1709973506292表示2024-03-08 15:18:26） **约束限制** 需与start_latest_update_time同时使用，且大于start_latest_update_time，否则筛选无效 **取值范围** 取值0-9223372036854775807 **默认取值** 无 
     * minimum: 0
     * maximum: 2147483547
     * @return endLatestUpdateTime
     */
    public Long getEndLatestUpdateTime() {
        return endLatestUpdateTime;
    }

    public void setEndLatestUpdateTime(Long endLatestUpdateTime) {
        this.endLatestUpdateTime = endLatestUpdateTime;
    }

    public ListImageLocalRequest withStartLatestScanTime(Long startLatestScanTime) {
        this.startLatestScanTime = startLatestScanTime;
        return this;
    }

    /**
     * **参数解释** 本地镜像最近一次扫描完成时间的查询起始值（Unix时间戳，单位ms），与end_latest_scan_time配合筛选时间范围 **时间格式** Unix时间戳（精确到毫秒） **约束限制** 仅对scan_status为success的镜像有效，需与end_latest_scan_time同时使用 **取值范围** 取值0-9223372036854775807 **默认取值** 无 
     * minimum: 0
     * maximum: 2147483547
     * @return startLatestScanTime
     */
    public Long getStartLatestScanTime() {
        return startLatestScanTime;
    }

    public void setStartLatestScanTime(Long startLatestScanTime) {
        this.startLatestScanTime = startLatestScanTime;
    }

    public ListImageLocalRequest withEndLatestScanTime(Long endLatestScanTime) {
        this.endLatestScanTime = endLatestScanTime;
        return this;
    }

    /**
     * **参数解释** 本地镜像最近一次扫描完成时间的查询结束值（Unix时间戳，单位ms），与start_latest_scan_time配合筛选时间范围 **时间格式** Unix时间戳（精确到毫秒） **约束限制** 仅对scan_status为success的镜像有效，且需大于start_latest_scan_time **取值范围** 取值0-9223372036854775807 **默认取值** 无 
     * minimum: 0
     * maximum: 2147483547
     * @return endLatestScanTime
     */
    public Long getEndLatestScanTime() {
        return endLatestScanTime;
    }

    public void setEndLatestScanTime(Long endLatestScanTime) {
        this.endLatestScanTime = endLatestScanTime;
    }

    public ListImageLocalRequest withHasVul(Boolean hasVul) {
        this.hasVul = hasVul;
        return this;
    }

    /**
     * **参数解释** 用于筛选是否存在软件漏洞的本地镜像，true表示筛选有漏洞的镜像，false表示筛选无漏洞的镜像 **约束限制** 仅对scan_status为success的镜像有效，未扫描镜像不会被筛选 **取值范围** true（存在漏洞）、false（不存在漏洞） **默认取值** 无（不筛选漏洞状态） 
     * @return hasVul
     */
    public Boolean getHasVul() {
        return hasVul;
    }

    public void setHasVul(Boolean hasVul) {
        this.hasVul = hasVul;
    }

    public ListImageLocalRequest withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释** 本地镜像所关联的云服务器名称，用于筛选关联指定服务器的本地镜像 **约束限制** 支持模糊匹配，区分大小写，仅对关联了服务器的镜像有效 **取值范围** 字符长度1-64位，支持中文、英文、数字、短横线、下划线，禁止含特殊字符 **默认取值** 无 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ListImageLocalRequest withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释** 本地镜像所关联的云服务器唯一标识（ECS实例ID），用于精准筛选关联指定服务器的本地镜像 **约束限制** 精确匹配，仅对关联了该服务器的镜像有效 **取值范围** 字符长度1-64位，支持字母、数字、短横线 **默认取值** 无 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ListImageLocalRequest withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * **参数解释** 本地镜像所关联服务器的公网或私网IP地址，用于筛选关联指定IP服务器的本地镜像 **约束限制** 支持IPv4格式，精确匹配，多个IP需通过业务层分批查询 **取值范围** 符合IPv4格式的字符串（如 **默认取值** 无 
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public ListImageLocalRequest withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * **参数解释** 本地镜像所关联的容器唯一标识（Docker容器ID），用于精准筛选关联指定容器的本地镜像 **约束限制** 精确匹配，仅对关联了容器的镜像有效 **取值范围** 字符长度1-64位，支持字母、数字、短横线、下划线 **默认取值** 无 
     * @return containerId
     */
    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public ListImageLocalRequest withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * **参数解释** 本地镜像所关联的容器名称，用于筛选关联指定名称容器的本地镜像 **约束限制** 支持模糊匹配，区分大小写，仅对关联了容器的镜像有效 **取值范围** 字符长度1-64位，支持字母、数字、短横线、下划线、点号 **默认取值** 无 
     * @return containerName
     */
    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public ListImageLocalRequest withPodId(String podId) {
        this.podId = podId;
        return this;
    }

    /**
     * **参数解释** 本地镜像所关联的Kubernetes Pod唯一标识，用于精准筛选关联指定Pod的本地镜像 **约束限制** 精确匹配，仅对K8s环境中关联了Pod的镜像有效 **取值范围** 字符长度1-64位，支持字母、数字、短横线 **默认取值** 无 
     * @return podId
     */
    public String getPodId() {
        return podId;
    }

    public void setPodId(String podId) {
        this.podId = podId;
    }

    public ListImageLocalRequest withPodName(String podName) {
        this.podName = podName;
        return this;
    }

    /**
     * **参数解释** 本地镜像所关联的Kubernetes Pod名称，用于筛选关联指定名称Pod的本地镜像 **约束限制** 支持模糊匹配，区分大小写，仅对K8s环境中关联了Pod的镜像有效 **取值范围** 字符长度1-63位，支持字母、数字、短横线，不能以短横线开头或结尾 **默认取值** 无 
     * @return podName
     */
    public String getPodName() {
        return podName;
    }

    public void setPodName(String podName) {
        this.podName = podName;
    }

    public ListImageLocalRequest withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * **参数解释** 本地镜像中部署的应用软件名称（如Nginx、MySQL），用于筛选包含指定应用的本地镜像 **约束限制** 支持模糊匹配，区分大小写，仅对已识别应用的镜像有效 **取值范围** 字符长度1-64位，支持中文、英文、数字、短横线、下划线 **默认取值** 无 
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public ListImageLocalRequest withHasContainer(Boolean hasContainer) {
        this.hasContainer = hasContainer;
        return this;
    }

    /**
     * **参数解释** 用于筛选是否关联了容器的本地镜像 **取值范围**: - true：关联容器的镜像 - false：未关联容器的镜像 **默认取值** 无（不筛选容器关联状态） 
     * @return hasContainer
     */
    public Boolean getHasContainer() {
        return hasContainer;
    }

    public void setHasContainer(Boolean hasContainer) {
        this.hasContainer = hasContainer;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListImageLocalRequest that = (ListImageLocalRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.imageName, that.imageName) && Objects.equals(this.imageVersion, that.imageVersion)
            && Objects.equals(this.scanStatus, that.scanStatus)
            && Objects.equals(this.localImageType, that.localImageType)
            && Objects.equals(this.imageSize, that.imageSize)
            && Objects.equals(this.startLatestUpdateTime, that.startLatestUpdateTime)
            && Objects.equals(this.endLatestUpdateTime, that.endLatestUpdateTime)
            && Objects.equals(this.startLatestScanTime, that.startLatestScanTime)
            && Objects.equals(this.endLatestScanTime, that.endLatestScanTime)
            && Objects.equals(this.hasVul, that.hasVul) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.hostId, that.hostId) && Objects.equals(this.hostIp, that.hostIp)
            && Objects.equals(this.containerId, that.containerId)
            && Objects.equals(this.containerName, that.containerName) && Objects.equals(this.podId, that.podId)
            && Objects.equals(this.podName, that.podName) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.hasContainer, that.hasContainer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId,
            offset,
            limit,
            imageName,
            imageVersion,
            scanStatus,
            localImageType,
            imageSize,
            startLatestUpdateTime,
            endLatestUpdateTime,
            startLatestScanTime,
            endLatestScanTime,
            hasVul,
            hostName,
            hostId,
            hostIp,
            containerId,
            containerName,
            podId,
            podName,
            appName,
            hasContainer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListImageLocalRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    scanStatus: ").append(toIndentedString(scanStatus)).append("\n");
        sb.append("    localImageType: ").append(toIndentedString(localImageType)).append("\n");
        sb.append("    imageSize: ").append(toIndentedString(imageSize)).append("\n");
        sb.append("    startLatestUpdateTime: ").append(toIndentedString(startLatestUpdateTime)).append("\n");
        sb.append("    endLatestUpdateTime: ").append(toIndentedString(endLatestUpdateTime)).append("\n");
        sb.append("    startLatestScanTime: ").append(toIndentedString(startLatestScanTime)).append("\n");
        sb.append("    endLatestScanTime: ").append(toIndentedString(endLatestScanTime)).append("\n");
        sb.append("    hasVul: ").append(toIndentedString(hasVul)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
        sb.append("    podId: ").append(toIndentedString(podId)).append("\n");
        sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    hasContainer: ").append(toIndentedString(hasContainer)).append("\n");
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
