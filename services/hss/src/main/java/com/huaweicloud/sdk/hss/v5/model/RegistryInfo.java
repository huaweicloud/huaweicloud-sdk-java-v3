package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 镜像仓接入信息
 */
public class RegistryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_name")

    private String registryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_type")

    private String registryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_version")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_addr")

    private String registryAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_username")

    private String registryUsername;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_cluster_id")

    private String connectClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "get_scan_image_channel")

    private String getScanImageChannel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "images_num")

    private Integer imagesNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_sync_time")

    private Long latestSyncTime;

    public RegistryInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**: 镜像仓ID **取值范围**: 字符长度1-64位 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RegistryInfo withRegistryName(String registryName) {
        this.registryName = registryName;
        return this;
    }

    /**
     * **参数解释**: 仓库名称 **取值范围**: 字符长度1-128位 
     * @return registryName
     */
    public String getRegistryName() {
        return registryName;
    }

    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }

    public RegistryInfo withRegistryType(String registryType) {
        this.registryType = registryType;
        return this;
    }

    /**
     * **参数解释**: 镜像仓类型 **取值范围**: - Harbor harbor仓库 - Jfrog jfrog仓库 - SwrPrivate swr私有 - SwrShared  swr共享 - SwrEnterprise  swr企业 - Other  其他仓库 
     * @return registryType
     */
    public String getRegistryType() {
        return registryType;
    }

    public void setRegistryType(String registryType) {
        this.registryType = registryType;
    }

    public RegistryInfo withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * **参数解释**： 镜像仓接口版本 **取值范围**：   - V1：V1版本   - V2：V2版本 
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public RegistryInfo withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * **参数解释**： 协议类型 **取值范围**：   - http：http协议   - https：https协议 
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public RegistryInfo withRegistryAddr(String registryAddr) {
        this.registryAddr = registryAddr;
        return this;
    }

    /**
     * **参数解释**： 镜像仓地址 **取值范围**： 字符长度1-256位 
     * @return registryAddr
     */
    public String getRegistryAddr() {
        return registryAddr;
    }

    public void setRegistryAddr(String registryAddr) {
        this.registryAddr = registryAddr;
    }

    public RegistryInfo withRegistryUsername(String registryUsername) {
        this.registryUsername = registryUsername;
        return this;
    }

    /**
     * **参数解释**： 用于登录镜像仓的用户名。 **取值范围**： 字符长度1-128位 
     * @return registryUsername
     */
    public String getRegistryUsername() {
        return registryUsername;
    }

    public void setRegistryUsername(String registryUsername) {
        this.registryUsername = registryUsername;
    }

    public RegistryInfo withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**： 镜像仓项目,用来指定扫描组件要上传到的镜像仓目录。get_scan_image_channel为Other时返回此值。 **取值范围**： 字符长度1-128位 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public RegistryInfo withConnectClusterId(String connectClusterId) {
        this.connectClusterId = connectClusterId;
        return this;
    }

    /**
     * **参数解释**： 承载集群id **取值范围**： 字符长度1-64位 
     * @return connectClusterId
     */
    public String getConnectClusterId() {
        return connectClusterId;
    }

    public void setConnectClusterId(String connectClusterId) {
        this.connectClusterId = connectClusterId;
    }

    public RegistryInfo withGetScanImageChannel(String getScanImageChannel) {
        this.getScanImageChannel = getScanImageChannel;
        return this;
    }

    /**
     * **参数解释**： 获取扫描组件的方式 **取值范围**： - Swr：访问swr获取扫描组件 - Other：手动上传扫描组件到承载集群。 
     * @return getScanImageChannel
     */
    public String getGetScanImageChannel() {
        return getScanImageChannel;
    }

    public void setGetScanImageChannel(String getScanImageChannel) {
        this.getScanImageChannel = getScanImageChannel;
    }

    public RegistryInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 接入状态 **取值范围**： - success：接入成功 - fail：接入异常 - accessing：接入中 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RegistryInfo withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * **参数解释**: 失败原因 **取值范围**: - CREATE_JOB_FAILED：集群接入状态异常，请检查集群接入状态。 - REQUEST_API_ERROR：网络不通，访问镜像仓失败。请检查承载集群是否能正常访问镜像仓 ，或前往三方镜像仓页面重新接入。 - SERVER_ERROR：系统内部错误，请稍后重试。 
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public RegistryInfo withImagesNum(Integer imagesNum) {
        this.imagesNum = imagesNum;
        return this;
    }

    /**
     * **参数解释**： 镜像数量 **取值范围**： 0-20000 
     * minimum: 0
     * maximum: 20000
     * @return imagesNum
     */
    public Integer getImagesNum() {
        return imagesNum;
    }

    public void setImagesNum(Integer imagesNum) {
        this.imagesNum = imagesNum;
    }

    public RegistryInfo withLatestSyncTime(Long latestSyncTime) {
        this.latestSyncTime = latestSyncTime;
        return this;
    }

    /**
     * **参数解释**： 最近同步时间，时间单位 毫秒（ms） **取值范围**： 0-9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return latestSyncTime
     */
    public Long getLatestSyncTime() {
        return latestSyncTime;
    }

    public void setLatestSyncTime(Long latestSyncTime) {
        this.latestSyncTime = latestSyncTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RegistryInfo that = (RegistryInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.registryName, that.registryName)
            && Objects.equals(this.registryType, that.registryType) && Objects.equals(this.apiVersion, that.apiVersion)
            && Objects.equals(this.protocol, that.protocol) && Objects.equals(this.registryAddr, that.registryAddr)
            && Objects.equals(this.registryUsername, that.registryUsername)
            && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.connectClusterId, that.connectClusterId)
            && Objects.equals(this.getScanImageChannel, that.getScanImageChannel)
            && Objects.equals(this.status, that.status) && Objects.equals(this.failReason, that.failReason)
            && Objects.equals(this.imagesNum, that.imagesNum)
            && Objects.equals(this.latestSyncTime, that.latestSyncTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            registryName,
            registryType,
            apiVersion,
            protocol,
            registryAddr,
            registryUsername,
            namespace,
            connectClusterId,
            getScanImageChannel,
            status,
            failReason,
            imagesNum,
            latestSyncTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegistryInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    registryName: ").append(toIndentedString(registryName)).append("\n");
        sb.append("    registryType: ").append(toIndentedString(registryType)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    registryAddr: ").append(toIndentedString(registryAddr)).append("\n");
        sb.append("    registryUsername: ").append(toIndentedString(registryUsername)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    connectClusterId: ").append(toIndentedString(connectClusterId)).append("\n");
        sb.append("    getScanImageChannel: ").append(toIndentedString(getScanImageChannel)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
        sb.append("    imagesNum: ").append(toIndentedString(imagesNum)).append("\n");
        sb.append("    latestSyncTime: ").append(toIndentedString(latestSyncTime)).append("\n");
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
