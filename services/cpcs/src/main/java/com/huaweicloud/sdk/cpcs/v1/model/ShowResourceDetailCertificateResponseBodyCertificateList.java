package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowResourceDetailCertificateResponseBodyCertificateList
 */
public class ShowResourceDetailCertificateResponseBodyCertificateList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

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

    private String certificateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_type")

    private String algorithmType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm")

    private String algorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expired_time")

    private Long expiredTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuer")

    private String issuer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    public ShowResourceDetailCertificateResponseBodyCertificateList withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 证书名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowResourceDetailCertificateResponseBodyCertificateList withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 证书ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowResourceDetailCertificateResponseBodyCertificateList withTenantId(String tenantId) {
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

    public ShowResourceDetailCertificateResponseBodyCertificateList withClusterId(String clusterId) {
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

    public ShowResourceDetailCertificateResponseBodyCertificateList withServerType(String serverType) {
        this.serverType = serverType;
        return this;
    }

    /**
     * 密码服务类型
     * @return serverType
     */
    public String getServerType() {
        return serverType;
    }

    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    public ShowResourceDetailCertificateResponseBodyCertificateList withCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }

    /**
     * 证书类型，0：根证书，1：业务证书
     * @return certificateType
     */
    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public ShowResourceDetailCertificateResponseBodyCertificateList withAlgorithmType(String algorithmType) {
        this.algorithmType = algorithmType;
        return this;
    }

    /**
     * 算法类型，0：国密，1：国际
     * @return algorithmType
     */
    public String getAlgorithmType() {
        return algorithmType;
    }

    public void setAlgorithmType(String algorithmType) {
        this.algorithmType = algorithmType;
    }

    public ShowResourceDetailCertificateResponseBodyCertificateList withAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * 算法名称
     * @return algorithm
     */
    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public ShowResourceDetailCertificateResponseBodyCertificateList withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间，UNIX时间戳，单位毫秒
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowResourceDetailCertificateResponseBodyCertificateList withExpiredTime(Long expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    /**
     * 过期时间，UNIX时间戳，单位毫秒
     * @return expiredTime
     */
    public Long getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Long expiredTime) {
        this.expiredTime = expiredTime;
    }

    public ShowResourceDetailCertificateResponseBodyCertificateList withIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * 签发者
     * @return issuer
     */
    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public ShowResourceDetailCertificateResponseBodyCertificateList withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * 用户
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public ShowResourceDetailCertificateResponseBodyCertificateList withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 证书状态，0：正常，2：过期，3：即将过期
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ShowResourceDetailCertificateResponseBodyCertificateList withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowResourceDetailCertificateResponseBodyCertificateList that =
            (ShowResourceDetailCertificateResponseBodyCertificateList) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.id, that.id)
            && Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.serverType, that.serverType)
            && Objects.equals(this.certificateType, that.certificateType)
            && Objects.equals(this.algorithmType, that.algorithmType) && Objects.equals(this.algorithm, that.algorithm)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.expiredTime, that.expiredTime)
            && Objects.equals(this.issuer, that.issuer) && Objects.equals(this.user, that.user)
            && Objects.equals(this.status, that.status) && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            id,
            tenantId,
            clusterId,
            serverType,
            certificateType,
            algorithmType,
            algorithm,
            startTime,
            expiredTime,
            issuer,
            user,
            status,
            createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourceDetailCertificateResponseBodyCertificateList {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
        sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
        sb.append("    algorithmType: ").append(toIndentedString(algorithmType)).append("\n");
        sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    expiredTime: ").append(toIndentedString(expiredTime)).append("\n");
        sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
