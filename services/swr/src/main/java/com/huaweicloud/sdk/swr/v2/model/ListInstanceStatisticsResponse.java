package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListInstanceStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_used")

    private Long storageUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_namespace_count")

    private Long totalNamespaceCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_image_count")

    private Long totalImageCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_quota")

    private Long namespaceQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_repo_quota")

    private Long imageRepoQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replica_policy_quota")

    private Long replicaPolicyQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_policy_quota")

    private Long retentionPolicyQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_policy_quota")

    private Long notifyPolicyQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replica_registry_quota")

    private Long replicaRegistryQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_policy_quota")

    private Long signPolicyQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replica_policy_count")

    private Long replicaPolicyCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_policy_count")

    private Long retentionPolicyCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_policy_count")

    private Long notifyPolicyCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replica_registry_count")

    private Long replicaRegistryCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intranet_endpoint_quota")

    private Integer intranetEndpointQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intranet_endpoint_count")

    private Integer intranetEndpointCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "long_term_quota")

    private Integer longTermQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_policy_count")

    private Long signPolicyCount;

    public ListInstanceStatisticsResponse withStorageUsed(Long storageUsed) {
        this.storageUsed = storageUsed;
        return this;
    }

    /**
     * 已用存储空间
     * @return storageUsed
     */
    public Long getStorageUsed() {
        return storageUsed;
    }

    public void setStorageUsed(Long storageUsed) {
        this.storageUsed = storageUsed;
    }

    public ListInstanceStatisticsResponse withTotalNamespaceCount(Long totalNamespaceCount) {
        this.totalNamespaceCount = totalNamespaceCount;
        return this;
    }

    /**
     * 命名空间的总数
     * @return totalNamespaceCount
     */
    public Long getTotalNamespaceCount() {
        return totalNamespaceCount;
    }

    public void setTotalNamespaceCount(Long totalNamespaceCount) {
        this.totalNamespaceCount = totalNamespaceCount;
    }

    public ListInstanceStatisticsResponse withTotalImageCount(Long totalImageCount) {
        this.totalImageCount = totalImageCount;
        return this;
    }

    /**
     * 镜像的总数
     * @return totalImageCount
     */
    public Long getTotalImageCount() {
        return totalImageCount;
    }

    public void setTotalImageCount(Long totalImageCount) {
        this.totalImageCount = totalImageCount;
    }

    public ListInstanceStatisticsResponse withNamespaceQuota(Long namespaceQuota) {
        this.namespaceQuota = namespaceQuota;
        return this;
    }

    /**
     * 命名空间的配额
     * @return namespaceQuota
     */
    public Long getNamespaceQuota() {
        return namespaceQuota;
    }

    public void setNamespaceQuota(Long namespaceQuota) {
        this.namespaceQuota = namespaceQuota;
    }

    public ListInstanceStatisticsResponse withImageRepoQuota(Long imageRepoQuota) {
        this.imageRepoQuota = imageRepoQuota;
        return this;
    }

    /**
     * 镜像的配额
     * @return imageRepoQuota
     */
    public Long getImageRepoQuota() {
        return imageRepoQuota;
    }

    public void setImageRepoQuota(Long imageRepoQuota) {
        this.imageRepoQuota = imageRepoQuota;
    }

    public ListInstanceStatisticsResponse withReplicaPolicyQuota(Long replicaPolicyQuota) {
        this.replicaPolicyQuota = replicaPolicyQuota;
        return this;
    }

    /**
     * 镜像同步策略的配额
     * @return replicaPolicyQuota
     */
    public Long getReplicaPolicyQuota() {
        return replicaPolicyQuota;
    }

    public void setReplicaPolicyQuota(Long replicaPolicyQuota) {
        this.replicaPolicyQuota = replicaPolicyQuota;
    }

    public ListInstanceStatisticsResponse withRetentionPolicyQuota(Long retentionPolicyQuota) {
        this.retentionPolicyQuota = retentionPolicyQuota;
        return this;
    }

    /**
     * 镜像老化策略的配额
     * @return retentionPolicyQuota
     */
    public Long getRetentionPolicyQuota() {
        return retentionPolicyQuota;
    }

    public void setRetentionPolicyQuota(Long retentionPolicyQuota) {
        this.retentionPolicyQuota = retentionPolicyQuota;
    }

    public ListInstanceStatisticsResponse withNotifyPolicyQuota(Long notifyPolicyQuota) {
        this.notifyPolicyQuota = notifyPolicyQuota;
        return this;
    }

    /**
     * 触发器的配额
     * @return notifyPolicyQuota
     */
    public Long getNotifyPolicyQuota() {
        return notifyPolicyQuota;
    }

    public void setNotifyPolicyQuota(Long notifyPolicyQuota) {
        this.notifyPolicyQuota = notifyPolicyQuota;
    }

    public ListInstanceStatisticsResponse withReplicaRegistryQuota(Long replicaRegistryQuota) {
        this.replicaRegistryQuota = replicaRegistryQuota;
        return this;
    }

    /**
     * 镜像同步的目标仓库配额
     * @return replicaRegistryQuota
     */
    public Long getReplicaRegistryQuota() {
        return replicaRegistryQuota;
    }

    public void setReplicaRegistryQuota(Long replicaRegistryQuota) {
        this.replicaRegistryQuota = replicaRegistryQuota;
    }

    public ListInstanceStatisticsResponse withSignPolicyQuota(Long signPolicyQuota) {
        this.signPolicyQuota = signPolicyQuota;
        return this;
    }

    /**
     * 镜像签名策略的配额
     * @return signPolicyQuota
     */
    public Long getSignPolicyQuota() {
        return signPolicyQuota;
    }

    public void setSignPolicyQuota(Long signPolicyQuota) {
        this.signPolicyQuota = signPolicyQuota;
    }

    public ListInstanceStatisticsResponse withReplicaPolicyCount(Long replicaPolicyCount) {
        this.replicaPolicyCount = replicaPolicyCount;
        return this;
    }

    /**
     * 镜像同步策略总数
     * @return replicaPolicyCount
     */
    public Long getReplicaPolicyCount() {
        return replicaPolicyCount;
    }

    public void setReplicaPolicyCount(Long replicaPolicyCount) {
        this.replicaPolicyCount = replicaPolicyCount;
    }

    public ListInstanceStatisticsResponse withRetentionPolicyCount(Long retentionPolicyCount) {
        this.retentionPolicyCount = retentionPolicyCount;
        return this;
    }

    /**
     * 镜像老化策略的总数
     * @return retentionPolicyCount
     */
    public Long getRetentionPolicyCount() {
        return retentionPolicyCount;
    }

    public void setRetentionPolicyCount(Long retentionPolicyCount) {
        this.retentionPolicyCount = retentionPolicyCount;
    }

    public ListInstanceStatisticsResponse withNotifyPolicyCount(Long notifyPolicyCount) {
        this.notifyPolicyCount = notifyPolicyCount;
        return this;
    }

    /**
     * 触发器的总数
     * @return notifyPolicyCount
     */
    public Long getNotifyPolicyCount() {
        return notifyPolicyCount;
    }

    public void setNotifyPolicyCount(Long notifyPolicyCount) {
        this.notifyPolicyCount = notifyPolicyCount;
    }

    public ListInstanceStatisticsResponse withReplicaRegistryCount(Long replicaRegistryCount) {
        this.replicaRegistryCount = replicaRegistryCount;
        return this;
    }

    /**
     * 镜像同步策略的目标仓库总数
     * @return replicaRegistryCount
     */
    public Long getReplicaRegistryCount() {
        return replicaRegistryCount;
    }

    public void setReplicaRegistryCount(Long replicaRegistryCount) {
        this.replicaRegistryCount = replicaRegistryCount;
    }

    public ListInstanceStatisticsResponse withIntranetEndpointQuota(Integer intranetEndpointQuota) {
        this.intranetEndpointQuota = intranetEndpointQuota;
        return this;
    }

    /**
     * 内网访问控制的配额
     * @return intranetEndpointQuota
     */
    public Integer getIntranetEndpointQuota() {
        return intranetEndpointQuota;
    }

    public void setIntranetEndpointQuota(Integer intranetEndpointQuota) {
        this.intranetEndpointQuota = intranetEndpointQuota;
    }

    public ListInstanceStatisticsResponse withIntranetEndpointCount(Integer intranetEndpointCount) {
        this.intranetEndpointCount = intranetEndpointCount;
        return this;
    }

    /**
     * 内网访问控制的总数
     * @return intranetEndpointCount
     */
    public Integer getIntranetEndpointCount() {
        return intranetEndpointCount;
    }

    public void setIntranetEndpointCount(Integer intranetEndpointCount) {
        this.intranetEndpointCount = intranetEndpointCount;
    }

    public ListInstanceStatisticsResponse withLongTermQuota(Integer longTermQuota) {
        this.longTermQuota = longTermQuota;
        return this;
    }

    /**
     * 长期登录指令的配额
     * @return longTermQuota
     */
    public Integer getLongTermQuota() {
        return longTermQuota;
    }

    public void setLongTermQuota(Integer longTermQuota) {
        this.longTermQuota = longTermQuota;
    }

    public ListInstanceStatisticsResponse withSignPolicyCount(Long signPolicyCount) {
        this.signPolicyCount = signPolicyCount;
        return this;
    }

    /**
     * 镜像签名策略的总数
     * @return signPolicyCount
     */
    public Long getSignPolicyCount() {
        return signPolicyCount;
    }

    public void setSignPolicyCount(Long signPolicyCount) {
        this.signPolicyCount = signPolicyCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceStatisticsResponse that = (ListInstanceStatisticsResponse) obj;
        return Objects.equals(this.storageUsed, that.storageUsed)
            && Objects.equals(this.totalNamespaceCount, that.totalNamespaceCount)
            && Objects.equals(this.totalImageCount, that.totalImageCount)
            && Objects.equals(this.namespaceQuota, that.namespaceQuota)
            && Objects.equals(this.imageRepoQuota, that.imageRepoQuota)
            && Objects.equals(this.replicaPolicyQuota, that.replicaPolicyQuota)
            && Objects.equals(this.retentionPolicyQuota, that.retentionPolicyQuota)
            && Objects.equals(this.notifyPolicyQuota, that.notifyPolicyQuota)
            && Objects.equals(this.replicaRegistryQuota, that.replicaRegistryQuota)
            && Objects.equals(this.signPolicyQuota, that.signPolicyQuota)
            && Objects.equals(this.replicaPolicyCount, that.replicaPolicyCount)
            && Objects.equals(this.retentionPolicyCount, that.retentionPolicyCount)
            && Objects.equals(this.notifyPolicyCount, that.notifyPolicyCount)
            && Objects.equals(this.replicaRegistryCount, that.replicaRegistryCount)
            && Objects.equals(this.intranetEndpointQuota, that.intranetEndpointQuota)
            && Objects.equals(this.intranetEndpointCount, that.intranetEndpointCount)
            && Objects.equals(this.longTermQuota, that.longTermQuota)
            && Objects.equals(this.signPolicyCount, that.signPolicyCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageUsed,
            totalNamespaceCount,
            totalImageCount,
            namespaceQuota,
            imageRepoQuota,
            replicaPolicyQuota,
            retentionPolicyQuota,
            notifyPolicyQuota,
            replicaRegistryQuota,
            signPolicyQuota,
            replicaPolicyCount,
            retentionPolicyCount,
            notifyPolicyCount,
            replicaRegistryCount,
            intranetEndpointQuota,
            intranetEndpointCount,
            longTermQuota,
            signPolicyCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceStatisticsResponse {\n");
        sb.append("    storageUsed: ").append(toIndentedString(storageUsed)).append("\n");
        sb.append("    totalNamespaceCount: ").append(toIndentedString(totalNamespaceCount)).append("\n");
        sb.append("    totalImageCount: ").append(toIndentedString(totalImageCount)).append("\n");
        sb.append("    namespaceQuota: ").append(toIndentedString(namespaceQuota)).append("\n");
        sb.append("    imageRepoQuota: ").append(toIndentedString(imageRepoQuota)).append("\n");
        sb.append("    replicaPolicyQuota: ").append(toIndentedString(replicaPolicyQuota)).append("\n");
        sb.append("    retentionPolicyQuota: ").append(toIndentedString(retentionPolicyQuota)).append("\n");
        sb.append("    notifyPolicyQuota: ").append(toIndentedString(notifyPolicyQuota)).append("\n");
        sb.append("    replicaRegistryQuota: ").append(toIndentedString(replicaRegistryQuota)).append("\n");
        sb.append("    signPolicyQuota: ").append(toIndentedString(signPolicyQuota)).append("\n");
        sb.append("    replicaPolicyCount: ").append(toIndentedString(replicaPolicyCount)).append("\n");
        sb.append("    retentionPolicyCount: ").append(toIndentedString(retentionPolicyCount)).append("\n");
        sb.append("    notifyPolicyCount: ").append(toIndentedString(notifyPolicyCount)).append("\n");
        sb.append("    replicaRegistryCount: ").append(toIndentedString(replicaRegistryCount)).append("\n");
        sb.append("    intranetEndpointQuota: ").append(toIndentedString(intranetEndpointQuota)).append("\n");
        sb.append("    intranetEndpointCount: ").append(toIndentedString(intranetEndpointCount)).append("\n");
        sb.append("    longTermQuota: ").append(toIndentedString(longTermQuota)).append("\n");
        sb.append("    signPolicyCount: ").append(toIndentedString(signPolicyCount)).append("\n");
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
