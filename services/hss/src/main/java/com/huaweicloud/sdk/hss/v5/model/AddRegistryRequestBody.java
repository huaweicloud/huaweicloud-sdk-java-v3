package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 三方镜像仓信息
 */
public class AddRegistryRequestBody {

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
    @JsonProperty(value = "registry_password")

    private String registryPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_cluster_id")

    private String connectClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "get_scan_image_channel")

    private String getScanImageChannel;

    public AddRegistryRequestBody withRegistryName(String registryName) {
        this.registryName = registryName;
        return this;
    }

    /**
     * **参数解释**： 仓库名称 **约束限制**： 不涉及 **取值范围**： 字符长度1-128位 **默认取值**： 不涉及 
     * @return registryName
     */
    public String getRegistryName() {
        return registryName;
    }

    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }

    public AddRegistryRequestBody withRegistryType(String registryType) {
        this.registryType = registryType;
        return this;
    }

    /**
     * **参数解释**： 镜像仓类型 **约束限制**： 不涉及 **取值范围**：   - Harbor：Harbor镜像仓。   - Jfrog：Jfrog镜像仓。  **默认取值**： 不涉及 
     * @return registryType
     */
    public String getRegistryType() {
        return registryType;
    }

    public void setRegistryType(String registryType) {
        this.registryType = registryType;
    }

    public AddRegistryRequestBody withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * **参数解释**： 镜像仓接口版本 **约束限制**： 不涉及 **取值范围**：   - V1：V1版本。   - V2：V2版本。  **默认取值**： 不涉及 
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public AddRegistryRequestBody withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * **参数解释**： 协议类型 **约束限制**： 不涉及 **取值范围**：   - http：http协议。   - https：https协议。  **默认取值**： 不涉及 
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public AddRegistryRequestBody withRegistryAddr(String registryAddr) {
        this.registryAddr = registryAddr;
        return this;
    }

    /**
     * **参数解释**： 镜像仓地址 **约束限制**： 网址/IP:端口。如：myharbor.com。 **取值范围**： 字符长度1-256位  **默认取值**： 不涉及 
     * @return registryAddr
     */
    public String getRegistryAddr() {
        return registryAddr;
    }

    public void setRegistryAddr(String registryAddr) {
        this.registryAddr = registryAddr;
    }

    public AddRegistryRequestBody withRegistryUsername(String registryUsername) {
        this.registryUsername = registryUsername;
        return this;
    }

    /**
     * **参数解释**： 用于登录镜像仓的用户名。 **约束限制**： 不涉及 **取值范围**： 字符长度1-128位  **默认取值**： 不涉及 
     * @return registryUsername
     */
    public String getRegistryUsername() {
        return registryUsername;
    }

    public void setRegistryUsername(String registryUsername) {
        this.registryUsername = registryUsername;
    }

    public AddRegistryRequestBody withRegistryPassword(String registryPassword) {
        this.registryPassword = registryPassword;
        return this;
    }

    /**
     * **参数解释**： 用于登录镜像仓的密码。仅用于访问镜像仓，HSS服务不会存储您的镜像仓密码。 **约束限制**： 不涉及 **取值范围**： 字符长度1-128位  **默认取值**： 不涉及 
     * @return registryPassword
     */
    public String getRegistryPassword() {
        return registryPassword;
    }

    public void setRegistryPassword(String registryPassword) {
        this.registryPassword = registryPassword;
    }

    public AddRegistryRequestBody withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**： 镜像仓项目,用来指定扫描组件要上传到的镜像仓目录。get_scan_image_channel为Other时需要填写。 **约束限制**： 不涉及 **取值范围**： 字符长度1-128位  **默认取值**： 不涉及 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public AddRegistryRequestBody withConnectClusterId(String connectClusterId) {
        this.connectClusterId = connectClusterId;
        return this;
    }

    /**
     * **参数解释**： 承载集群id。请选择一个已接入HSS的集群作为承载集群，镜像同步组件和扫描组件会以任务的方式运行在您所选的集群上，来帮助主机安全获取您的镜像数据和扫描镜像安全风险。 **约束限制**： 不涉及 **取值范围**： 字符长度1-64位  **默认取值**： 不涉及 
     * @return connectClusterId
     */
    public String getConnectClusterId() {
        return connectClusterId;
    }

    public void setConnectClusterId(String connectClusterId) {
        this.connectClusterId = connectClusterId;
    }

    public AddRegistryRequestBody withGetScanImageChannel(String getScanImageChannel) {
        this.getScanImageChannel = getScanImageChannel;
        return this;
    }

    /**
     * **参数解释**： 获取扫描组件的方式 **约束限制**： 不涉及 **取值范围**： - Swr：访问swr获取扫描组件。 - Other：手动上传扫描组件到承载集群。选择此方式，需要调用接口/v5/{project_id}/image/registries/image-upload-command 获取扫描组件镜像上传指令。  **默认取值**： 不涉及 
     * @return getScanImageChannel
     */
    public String getGetScanImageChannel() {
        return getScanImageChannel;
    }

    public void setGetScanImageChannel(String getScanImageChannel) {
        this.getScanImageChannel = getScanImageChannel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddRegistryRequestBody that = (AddRegistryRequestBody) obj;
        return Objects.equals(this.registryName, that.registryName)
            && Objects.equals(this.registryType, that.registryType) && Objects.equals(this.apiVersion, that.apiVersion)
            && Objects.equals(this.protocol, that.protocol) && Objects.equals(this.registryAddr, that.registryAddr)
            && Objects.equals(this.registryUsername, that.registryUsername)
            && Objects.equals(this.registryPassword, that.registryPassword)
            && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.connectClusterId, that.connectClusterId)
            && Objects.equals(this.getScanImageChannel, that.getScanImageChannel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registryName,
            registryType,
            apiVersion,
            protocol,
            registryAddr,
            registryUsername,
            registryPassword,
            namespace,
            connectClusterId,
            getScanImageChannel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddRegistryRequestBody {\n");
        sb.append("    registryName: ").append(toIndentedString(registryName)).append("\n");
        sb.append("    registryType: ").append(toIndentedString(registryType)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    registryAddr: ").append(toIndentedString(registryAddr)).append("\n");
        sb.append("    registryUsername: ").append(toIndentedString(registryUsername)).append("\n");
        sb.append("    registryPassword: ").append(toIndentedString(registryPassword)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    connectClusterId: ").append(toIndentedString(connectClusterId)).append("\n");
        sb.append("    getScanImageChannel: ").append(toIndentedString(getScanImageChannel)).append("\n");
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
