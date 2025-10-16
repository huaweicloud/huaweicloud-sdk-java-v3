package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowStatisticCertificateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private Long from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private Long to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private Integer period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private String filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm")

    private String algorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_type")

    private String algorithmType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_type")

    private String certificateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_type")

    private String serverType;

    public ShowStatisticCertificateRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群id，默认为空，默认查询所有集群
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ShowStatisticCertificateRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用id，默认为空，默认查询所有app
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ShowStatisticCertificateRequest withFrom(Long from) {
        this.from = from;
        return this;
    }

    /**
     * 查询的初始时间戳，毫秒级时间戳，默认查询前三天
     * @return from
     */
    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public ShowStatisticCertificateRequest withTo(Long to) {
        this.to = to;
        return this;
    }

    /**
     * 查询的终止时间戳，毫秒级时间戳，默认查询到当前时间
     * @return to
     */
    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    public ShowStatisticCertificateRequest withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * 统计周期，默认为1，五分钟为一个周期
     * @return period
     */
    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public ShowStatisticCertificateRequest withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * 统计值，默认为min:最小值
     * @return filter
     */
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public ShowStatisticCertificateRequest withAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * 算法，有：“sm2”,\"rsa\"
     * @return algorithm
     */
    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public ShowStatisticCertificateRequest withAlgorithmType(String algorithmType) {
        this.algorithmType = algorithmType;
        return this;
    }

    /**
     * 算法类型，0：国密算法，1：国际算法
     * @return algorithmType
     */
    public String getAlgorithmType() {
        return algorithmType;
    }

    public void setAlgorithmType(String algorithmType) {
        this.algorithmType = algorithmType;
    }

    public ShowStatisticCertificateRequest withCertificateType(String certificateType) {
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

    public ShowStatisticCertificateRequest withServerType(String serverType) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStatisticCertificateRequest that = (ShowStatisticCertificateRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.appId, that.appId)
            && Objects.equals(this.from, that.from) && Objects.equals(this.to, that.to)
            && Objects.equals(this.period, that.period) && Objects.equals(this.filter, that.filter)
            && Objects.equals(this.algorithm, that.algorithm) && Objects.equals(this.algorithmType, that.algorithmType)
            && Objects.equals(this.certificateType, that.certificateType)
            && Objects.equals(this.serverType, that.serverType);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(clusterId, appId, from, to, period, filter, algorithm, algorithmType, certificateType, serverType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStatisticCertificateRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
        sb.append("    algorithmType: ").append(toIndentedString(algorithmType)).append("\n");
        sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
        sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
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
