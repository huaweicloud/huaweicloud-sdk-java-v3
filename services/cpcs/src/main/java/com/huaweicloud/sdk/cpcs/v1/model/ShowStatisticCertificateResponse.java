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
public class ShowStatisticCertificateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_classified_counts")

    private List<VendorCertificateStatistic> certificateClassifiedCounts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_counts_by_server_type")

    private List<VendorCertificateStatistic> certificateCountsByServerType = null;

    public ShowStatisticCertificateResponse withMetricName(String metricName) {
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

    public ShowStatisticCertificateResponse withCertificateClassifiedCounts(
        List<VendorCertificateStatistic> certificateClassifiedCounts) {
        this.certificateClassifiedCounts = certificateClassifiedCounts;
        return this;
    }

    public ShowStatisticCertificateResponse addCertificateClassifiedCountsItem(
        VendorCertificateStatistic certificateClassifiedCountsItem) {
        if (this.certificateClassifiedCounts == null) {
            this.certificateClassifiedCounts = new ArrayList<>();
        }
        this.certificateClassifiedCounts.add(certificateClassifiedCountsItem);
        return this;
    }

    public ShowStatisticCertificateResponse withCertificateClassifiedCounts(
        Consumer<List<VendorCertificateStatistic>> certificateClassifiedCountsSetter) {
        if (this.certificateClassifiedCounts == null) {
            this.certificateClassifiedCounts = new ArrayList<>();
        }
        certificateClassifiedCountsSetter.accept(this.certificateClassifiedCounts);
        return this;
    }

    /**
     * 证书分布按算法和证书类型统计
     * @return certificateClassifiedCounts
     */
    public List<VendorCertificateStatistic> getCertificateClassifiedCounts() {
        return certificateClassifiedCounts;
    }

    public void setCertificateClassifiedCounts(List<VendorCertificateStatistic> certificateClassifiedCounts) {
        this.certificateClassifiedCounts = certificateClassifiedCounts;
    }

    public ShowStatisticCertificateResponse withCertificateCountsByServerType(
        List<VendorCertificateStatistic> certificateCountsByServerType) {
        this.certificateCountsByServerType = certificateCountsByServerType;
        return this;
    }

    public ShowStatisticCertificateResponse addCertificateCountsByServerTypeItem(
        VendorCertificateStatistic certificateCountsByServerTypeItem) {
        if (this.certificateCountsByServerType == null) {
            this.certificateCountsByServerType = new ArrayList<>();
        }
        this.certificateCountsByServerType.add(certificateCountsByServerTypeItem);
        return this;
    }

    public ShowStatisticCertificateResponse withCertificateCountsByServerType(
        Consumer<List<VendorCertificateStatistic>> certificateCountsByServerTypeSetter) {
        if (this.certificateCountsByServerType == null) {
            this.certificateCountsByServerType = new ArrayList<>();
        }
        certificateCountsByServerTypeSetter.accept(this.certificateCountsByServerType);
        return this;
    }

    /**
     * 证书分布按服务类型统计
     * @return certificateCountsByServerType
     */
    public List<VendorCertificateStatistic> getCertificateCountsByServerType() {
        return certificateCountsByServerType;
    }

    public void setCertificateCountsByServerType(List<VendorCertificateStatistic> certificateCountsByServerType) {
        this.certificateCountsByServerType = certificateCountsByServerType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStatisticCertificateResponse that = (ShowStatisticCertificateResponse) obj;
        return Objects.equals(this.metricName, that.metricName)
            && Objects.equals(this.certificateClassifiedCounts, that.certificateClassifiedCounts)
            && Objects.equals(this.certificateCountsByServerType, that.certificateCountsByServerType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricName, certificateClassifiedCounts, certificateCountsByServerType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStatisticCertificateResponse {\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    certificateClassifiedCounts: ")
            .append(toIndentedString(certificateClassifiedCounts))
            .append("\n");
        sb.append("    certificateCountsByServerType: ")
            .append(toIndentedString(certificateCountsByServerType))
            .append("\n");
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
