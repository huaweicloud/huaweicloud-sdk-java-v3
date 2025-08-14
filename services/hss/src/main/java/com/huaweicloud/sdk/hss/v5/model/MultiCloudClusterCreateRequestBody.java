package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 多云集群的创建
 */
public class MultiCloudClusterCreateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server")

    private String server;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_repo")

    private String imageRepo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_repo_username")

    private String imageRepoUsername;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_repo_password")

    private String imageRepoPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization")

    private String organization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_repo_type")

    private String imageRepoType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_expiration_date")

    private Long currentExpirationDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_expiration_date")

    private Long certificateExpirationDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kube_config")

    private String kubeConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_arch")

    private String imageArch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "anp_proxy")

    private String anpProxy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostguard_proxy")

    private String hostguardProxy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dns_policy")

    private String dnsPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dns_config")

    private String dnsConfig;

    public MultiCloudClusterCreateRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 集群名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MultiCloudClusterCreateRequestBody withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * **参数解释** 集群服务商 **约束限制**   - ali：阿里。   - tencent：腾讯。   - azure：微软。   - aws：亚马逊。   - self_built_hw：华为自建。   - self_built_idc：IDC自建。  **取值范围** 字符长度范围0-64 **默认取值** 不涉及 
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public MultiCloudClusterCreateRequestBody withServer(String server) {
        this.server = server;
        return this;
    }

    /**
     * 集群apiserver地址
     * @return server
     */
    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public MultiCloudClusterCreateRequestBody withImageRepo(String imageRepo) {
        this.imageRepo = imageRepo;
        return this;
    }

    /**
     * 镜像仓地址
     * @return imageRepo
     */
    public String getImageRepo() {
        return imageRepo;
    }

    public void setImageRepo(String imageRepo) {
        this.imageRepo = imageRepo;
    }

    public MultiCloudClusterCreateRequestBody withImageRepoUsername(String imageRepoUsername) {
        this.imageRepoUsername = imageRepoUsername;
        return this;
    }

    /**
     * 镜像仓用户名
     * @return imageRepoUsername
     */
    public String getImageRepoUsername() {
        return imageRepoUsername;
    }

    public void setImageRepoUsername(String imageRepoUsername) {
        this.imageRepoUsername = imageRepoUsername;
    }

    public MultiCloudClusterCreateRequestBody withImageRepoPassword(String imageRepoPassword) {
        this.imageRepoPassword = imageRepoPassword;
        return this;
    }

    /**
     * 镜像仓密码
     * @return imageRepoPassword
     */
    public String getImageRepoPassword() {
        return imageRepoPassword;
    }

    public void setImageRepoPassword(String imageRepoPassword) {
        this.imageRepoPassword = imageRepoPassword;
    }

    public MultiCloudClusterCreateRequestBody withOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * 组织
     * @return organization
     */
    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public MultiCloudClusterCreateRequestBody withImageRepoType(String imageRepoType) {
        this.imageRepoType = imageRepoType;
        return this;
    }

    /**
     * **参数解释** 镜像仓类型 **约束限制** - harbor：Harbor镜像仓。 - quay：Quay镜像仓。 - jfrog：Jfrog镜像仓。 - other：其他镜像仓。  **取值范围** 字符长度范围0-64 **默认取值** 不涉及 
     * @return imageRepoType
     */
    public String getImageRepoType() {
        return imageRepoType;
    }

    public void setImageRepoType(String imageRepoType) {
        this.imageRepoType = imageRepoType;
    }

    public MultiCloudClusterCreateRequestBody withCurrentExpirationDate(Long currentExpirationDate) {
        this.currentExpirationDate = currentExpirationDate;
        return this;
    }

    /**
     * 当前有效期结束时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return currentExpirationDate
     */
    public Long getCurrentExpirationDate() {
        return currentExpirationDate;
    }

    public void setCurrentExpirationDate(Long currentExpirationDate) {
        this.currentExpirationDate = currentExpirationDate;
    }

    public MultiCloudClusterCreateRequestBody withCertificateExpirationDate(Long certificateExpirationDate) {
        this.certificateExpirationDate = certificateExpirationDate;
        return this;
    }

    /**
     * 证书有效期结束时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return certificateExpirationDate
     */
    public Long getCertificateExpirationDate() {
        return certificateExpirationDate;
    }

    public void setCertificateExpirationDate(Long certificateExpirationDate) {
        this.certificateExpirationDate = certificateExpirationDate;
    }

    public MultiCloudClusterCreateRequestBody withKubeConfig(String kubeConfig) {
        this.kubeConfig = kubeConfig;
        return this;
    }

    /**
     * kubeconfig文件
     * @return kubeConfig
     */
    public String getKubeConfig() {
        return kubeConfig;
    }

    public void setKubeConfig(String kubeConfig) {
        this.kubeConfig = kubeConfig;
    }

    public MultiCloudClusterCreateRequestBody withImageArch(String imageArch) {
        this.imageArch = imageArch;
        return this;
    }

    /**
     * 镜像架构类型： - x86 - arm
     * @return imageArch
     */
    public String getImageArch() {
        return imageArch;
    }

    public void setImageArch(String imageArch) {
        this.imageArch = imageArch;
    }

    public MultiCloudClusterCreateRequestBody withAnpProxy(String anpProxy) {
        this.anpProxy = anpProxy;
        return this;
    }

    /**
     * Anp代理地址
     * @return anpProxy
     */
    public String getAnpProxy() {
        return anpProxy;
    }

    public void setAnpProxy(String anpProxy) {
        this.anpProxy = anpProxy;
    }

    public MultiCloudClusterCreateRequestBody withHostguardProxy(String hostguardProxy) {
        this.hostguardProxy = hostguardProxy;
        return this;
    }

    /**
     * Hostguard代理地址
     * @return hostguardProxy
     */
    public String getHostguardProxy() {
        return hostguardProxy;
    }

    public void setHostguardProxy(String hostguardProxy) {
        this.hostguardProxy = hostguardProxy;
    }

    public MultiCloudClusterCreateRequestBody withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * 容器名称
     * @return containerName
     */
    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public MultiCloudClusterCreateRequestBody withDnsPolicy(String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
        return this;
    }

    /**
     * DNS策略： - default：继承集群节点的域名解析配置 - clusterfirst：查询集群内部的CoreDNS服务 - clusterfirstwithhostnet：强制在hostNetwork网络模式下使用ClusterFirst策略 - none：忽略集群的DNS策略，使用自定义DNS配置
     * @return dnsPolicy
     */
    public String getDnsPolicy() {
        return dnsPolicy;
    }

    public void setDnsPolicy(String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
    }

    public MultiCloudClusterCreateRequestBody withDnsConfig(String dnsConfig) {
        this.dnsConfig = dnsConfig;
        return this;
    }

    /**
     * 自定义DNS配置，一个或多个IP地址，以分号分隔
     * @return dnsConfig
     */
    public String getDnsConfig() {
        return dnsConfig;
    }

    public void setDnsConfig(String dnsConfig) {
        this.dnsConfig = dnsConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MultiCloudClusterCreateRequestBody that = (MultiCloudClusterCreateRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.provider, that.provider)
            && Objects.equals(this.server, that.server) && Objects.equals(this.imageRepo, that.imageRepo)
            && Objects.equals(this.imageRepoUsername, that.imageRepoUsername)
            && Objects.equals(this.imageRepoPassword, that.imageRepoPassword)
            && Objects.equals(this.organization, that.organization)
            && Objects.equals(this.imageRepoType, that.imageRepoType)
            && Objects.equals(this.currentExpirationDate, that.currentExpirationDate)
            && Objects.equals(this.certificateExpirationDate, that.certificateExpirationDate)
            && Objects.equals(this.kubeConfig, that.kubeConfig) && Objects.equals(this.imageArch, that.imageArch)
            && Objects.equals(this.anpProxy, that.anpProxy) && Objects.equals(this.hostguardProxy, that.hostguardProxy)
            && Objects.equals(this.containerName, that.containerName) && Objects.equals(this.dnsPolicy, that.dnsPolicy)
            && Objects.equals(this.dnsConfig, that.dnsConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            provider,
            server,
            imageRepo,
            imageRepoUsername,
            imageRepoPassword,
            organization,
            imageRepoType,
            currentExpirationDate,
            certificateExpirationDate,
            kubeConfig,
            imageArch,
            anpProxy,
            hostguardProxy,
            containerName,
            dnsPolicy,
            dnsConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiCloudClusterCreateRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
        sb.append("    imageRepo: ").append(toIndentedString(imageRepo)).append("\n");
        sb.append("    imageRepoUsername: ").append(toIndentedString(imageRepoUsername)).append("\n");
        sb.append("    imageRepoPassword: ").append(toIndentedString(imageRepoPassword)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    imageRepoType: ").append(toIndentedString(imageRepoType)).append("\n");
        sb.append("    currentExpirationDate: ").append(toIndentedString(currentExpirationDate)).append("\n");
        sb.append("    certificateExpirationDate: ").append(toIndentedString(certificateExpirationDate)).append("\n");
        sb.append("    kubeConfig: ").append(toIndentedString(kubeConfig)).append("\n");
        sb.append("    imageArch: ").append(toIndentedString(imageArch)).append("\n");
        sb.append("    anpProxy: ").append(toIndentedString(anpProxy)).append("\n");
        sb.append("    hostguardProxy: ").append(toIndentedString(hostguardProxy)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
        sb.append("    dnsPolicy: ").append(toIndentedString(dnsPolicy)).append("\n");
        sb.append("    dnsConfig: ").append(toIndentedString(dnsConfig)).append("\n");
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
