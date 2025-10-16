package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowResourceDetailCertificateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_list")

    private List<ShowResourceDetailCertificateResponseBodyCertificateList> certificateList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expired_count")

    private Integer expiredCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiring_count")

    private Integer expiringCount;

    public ShowResourceDetailCertificateResponse withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * 资源名称
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public ShowResourceDetailCertificateResponse withCertificateList(
        List<ShowResourceDetailCertificateResponseBodyCertificateList> certificateList) {
        this.certificateList = certificateList;
        return this;
    }

    public ShowResourceDetailCertificateResponse addCertificateListItem(
        ShowResourceDetailCertificateResponseBodyCertificateList certificateListItem) {
        if (this.certificateList == null) {
            this.certificateList = new ArrayList<>();
        }
        this.certificateList.add(certificateListItem);
        return this;
    }

    public ShowResourceDetailCertificateResponse withCertificateList(
        Consumer<List<ShowResourceDetailCertificateResponseBodyCertificateList>> certificateListSetter) {
        if (this.certificateList == null) {
            this.certificateList = new ArrayList<>();
        }
        certificateListSetter.accept(this.certificateList);
        return this;
    }

    /**
     * 证书详情列表
     * @return certificateList
     */
    public List<ShowResourceDetailCertificateResponseBodyCertificateList> getCertificateList() {
        return certificateList;
    }

    public void setCertificateList(List<ShowResourceDetailCertificateResponseBodyCertificateList> certificateList) {
        this.certificateList = certificateList;
    }

    public ShowResourceDetailCertificateResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 证书总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ShowResourceDetailCertificateResponse withExpiredCount(Integer expiredCount) {
        this.expiredCount = expiredCount;
        return this;
    }

    /**
     * 证书过期数量
     * @return expiredCount
     */
    public Integer getExpiredCount() {
        return expiredCount;
    }

    public void setExpiredCount(Integer expiredCount) {
        this.expiredCount = expiredCount;
    }

    public ShowResourceDetailCertificateResponse withExpiringCount(Integer expiringCount) {
        this.expiringCount = expiringCount;
        return this;
    }

    /**
     * 证书即将过期数量
     * @return expiringCount
     */
    public Integer getExpiringCount() {
        return expiringCount;
    }

    public void setExpiringCount(Integer expiringCount) {
        this.expiringCount = expiringCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowResourceDetailCertificateResponse that = (ShowResourceDetailCertificateResponse) obj;
        return Objects.equals(this.metricName, that.metricName)
            && Objects.equals(this.certificateList, that.certificateList)
            && Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.expiredCount, that.expiredCount)
            && Objects.equals(this.expiringCount, that.expiringCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricName, certificateList, totalCount, expiredCount, expiringCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourceDetailCertificateResponse {\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    certificateList: ").append(toIndentedString(certificateList)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    expiredCount: ").append(toIndentedString(expiredCount)).append("\n");
        sb.append("    expiringCount: ").append(toIndentedString(expiringCount)).append("\n");
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
