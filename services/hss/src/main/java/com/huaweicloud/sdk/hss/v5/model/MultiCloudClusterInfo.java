package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 多云集群的集群信息
 */
public class MultiCloudClusterInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

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
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_expiration_date")

    private Long currentExpirationDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_expiration_date")

    private Long certificateExpirationDate;

    public MultiCloudClusterInfo withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群id
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public MultiCloudClusterInfo withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名称
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public MultiCloudClusterInfo withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 集群服务商
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public MultiCloudClusterInfo withServer(String server) {
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

    public MultiCloudClusterInfo withImageRepo(String imageRepo) {
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

    public MultiCloudClusterInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * anp-agent的连接状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public MultiCloudClusterInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * anp-agent的版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public MultiCloudClusterInfo withCurrentExpirationDate(Long currentExpirationDate) {
        this.currentExpirationDate = currentExpirationDate;
        return this;
    }

    /**
     * 当前有效期结束时间
     * minimum: 0
     * maximum: 4071095999000
     * @return currentExpirationDate
     */
    public Long getCurrentExpirationDate() {
        return currentExpirationDate;
    }

    public void setCurrentExpirationDate(Long currentExpirationDate) {
        this.currentExpirationDate = currentExpirationDate;
    }

    public MultiCloudClusterInfo withCertificateExpirationDate(Long certificateExpirationDate) {
        this.certificateExpirationDate = certificateExpirationDate;
        return this;
    }

    /**
     * 证书有效期结束时间
     * minimum: 0
     * maximum: 4071095999000
     * @return certificateExpirationDate
     */
    public Long getCertificateExpirationDate() {
        return certificateExpirationDate;
    }

    public void setCertificateExpirationDate(Long certificateExpirationDate) {
        this.certificateExpirationDate = certificateExpirationDate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MultiCloudClusterInfo that = (MultiCloudClusterInfo) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.provider, that.provider) && Objects.equals(this.server, that.server)
            && Objects.equals(this.imageRepo, that.imageRepo) && Objects.equals(this.status, that.status)
            && Objects.equals(this.version, that.version)
            && Objects.equals(this.currentExpirationDate, that.currentExpirationDate)
            && Objects.equals(this.certificateExpirationDate, that.certificateExpirationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId,
            clusterName,
            provider,
            server,
            imageRepo,
            status,
            version,
            currentExpirationDate,
            certificateExpirationDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiCloudClusterInfo {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
        sb.append("    imageRepo: ").append(toIndentedString(imageRepo)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    currentExpirationDate: ").append(toIndentedString(currentExpirationDate)).append("\n");
        sb.append("    certificateExpirationDate: ").append(toIndentedString(certificateExpirationDate)).append("\n");
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
