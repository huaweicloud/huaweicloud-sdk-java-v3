package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VendorCertificateStatistic
 */
public class VendorCertificateStatistic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_type")

    private String serverType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_type")

    private Integer certificateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_type")

    private Integer algorithmType;

    public VendorCertificateStatistic withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 总数量
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public VendorCertificateStatistic withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public VendorCertificateStatistic withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public VendorCertificateStatistic withServerType(String serverType) {
        this.serverType = serverType;
        return this;
    }

    /**
     * 服务类型
     * @return serverType
     */
    public String getServerType() {
        return serverType;
    }

    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    public VendorCertificateStatistic withCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
        return this;
    }

    /**
     * 证书类型
     * @return certificateType
     */
    public Integer getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
    }

    public VendorCertificateStatistic withAlgorithmType(Integer algorithmType) {
        this.algorithmType = algorithmType;
        return this;
    }

    /**
     * 算法类型
     * @return algorithmType
     */
    public Integer getAlgorithmType() {
        return algorithmType;
    }

    public void setAlgorithmType(Integer algorithmType) {
        this.algorithmType = algorithmType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VendorCertificateStatistic that = (VendorCertificateStatistic) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.serverType, that.serverType)
            && Objects.equals(this.certificateType, that.certificateType)
            && Objects.equals(this.algorithmType, that.algorithmType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, tenantId, clusterId, serverType, certificateType, algorithmType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VendorCertificateStatistic {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
        sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
        sb.append("    algorithmType: ").append(toIndentedString(algorithmType)).append("\n");
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
