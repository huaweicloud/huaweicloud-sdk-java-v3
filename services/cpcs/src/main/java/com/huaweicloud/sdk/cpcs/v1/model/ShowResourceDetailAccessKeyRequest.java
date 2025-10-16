package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowResourceDetailAccessKeyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_type")

    private String algorithmType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_type")

    private String certificateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_num")

    private Integer pageNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private Long from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private String to;

    public ShowResourceDetailAccessKeyRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群id，默认空字符串，默认查询所有集群
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ShowResourceDetailAccessKeyRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用id，默认空字符串，默认查询所有的应用
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ShowResourceDetailAccessKeyRequest withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 密码服务类型，默认空字符串，默认查询所有密码服务类型
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public ShowResourceDetailAccessKeyRequest withAlgorithmType(String algorithmType) {
        this.algorithmType = algorithmType;
        return this;
    }

    /**
     * 算法类型，默认空字符串，0：国密，1：国际
     * @return algorithmType
     */
    public String getAlgorithmType() {
        return algorithmType;
    }

    public void setAlgorithmType(String algorithmType) {
        this.algorithmType = algorithmType;
    }

    public ShowResourceDetailAccessKeyRequest withCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }

    /**
     * 证书类型，默认空字符串，0：根证书，1：业务证书
     * @return certificateType
     */
    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public ShowResourceDetailAccessKeyRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 页面大小，不超过1500
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ShowResourceDetailAccessKeyRequest withPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * 页数，默认1
     * @return pageNum
     */
    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public ShowResourceDetailAccessKeyRequest withFrom(Long from) {
        this.from = from;
        return this;
    }

    /**
     * 查询起始时间戳，毫秒级时间戳，默认为0，默认从三天前查询
     * @return from
     */
    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public ShowResourceDetailAccessKeyRequest withTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * 查询终止时间戳，毫秒级时间戳，默认为0，默认查询到当前时间
     * @return to
     */
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowResourceDetailAccessKeyRequest that = (ShowResourceDetailAccessKeyRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.appId, that.appId)
            && Objects.equals(this.serviceType, that.serviceType)
            && Objects.equals(this.algorithmType, that.algorithmType)
            && Objects.equals(this.certificateType, that.certificateType)
            && Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.pageNum, that.pageNum)
            && Objects.equals(this.from, that.from) && Objects.equals(this.to, that.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, appId, serviceType, algorithmType, certificateType, pageSize, pageNum, from, to);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourceDetailAccessKeyRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    algorithmType: ").append(toIndentedString(algorithmType)).append("\n");
        sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
