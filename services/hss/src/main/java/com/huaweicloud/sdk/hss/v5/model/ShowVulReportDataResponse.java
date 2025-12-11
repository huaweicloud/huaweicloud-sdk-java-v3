package com.huaweicloud.sdk.hss.v5.model;

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
public class ShowVulReportDataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sumary")

    private ShowVulReportDataResponseInfoSumary sumary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary")

    private ShowVulReportDataResponseInfoSummary summary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    private List<ShowVulReportDataResponseInfoHosts> hosts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vulnerabilities")

    private List<ShowVulReportDataResponseInfoVulnerabilities> vulnerabilities = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_create_time")

    private Long reportCreateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vulnerability_total_count")

    private Integer vulnerabilityTotalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_total_count")

    private Integer hostTotalCount;

    public ShowVulReportDataResponse withSumary(ShowVulReportDataResponseInfoSumary sumary) {
        this.sumary = sumary;
        return this;
    }

    public ShowVulReportDataResponse withSumary(Consumer<ShowVulReportDataResponseInfoSumary> sumarySetter) {
        if (this.sumary == null) {
            this.sumary = new ShowVulReportDataResponseInfoSumary();
            sumarySetter.accept(this.sumary);
        }

        return this;
    }

    /**
     * Get sumary
     * @return sumary
     */
    public ShowVulReportDataResponseInfoSumary getSumary() {
        return sumary;
    }

    public void setSumary(ShowVulReportDataResponseInfoSumary sumary) {
        this.sumary = sumary;
    }

    public ShowVulReportDataResponse withSummary(ShowVulReportDataResponseInfoSummary summary) {
        this.summary = summary;
        return this;
    }

    public ShowVulReportDataResponse withSummary(Consumer<ShowVulReportDataResponseInfoSummary> summarySetter) {
        if (this.summary == null) {
            this.summary = new ShowVulReportDataResponseInfoSummary();
            summarySetter.accept(this.summary);
        }

        return this;
    }

    /**
     * Get summary
     * @return summary
     */
    public ShowVulReportDataResponseInfoSummary getSummary() {
        return summary;
    }

    public void setSummary(ShowVulReportDataResponseInfoSummary summary) {
        this.summary = summary;
    }

    public ShowVulReportDataResponse withHosts(List<ShowVulReportDataResponseInfoHosts> hosts) {
        this.hosts = hosts;
        return this;
    }

    public ShowVulReportDataResponse addHostsItem(ShowVulReportDataResponseInfoHosts hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public ShowVulReportDataResponse withHosts(Consumer<List<ShowVulReportDataResponseInfoHosts>> hostsSetter) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /**
     * 主机列表
     * @return hosts
     */
    public List<ShowVulReportDataResponseInfoHosts> getHosts() {
        return hosts;
    }

    public void setHosts(List<ShowVulReportDataResponseInfoHosts> hosts) {
        this.hosts = hosts;
    }

    public ShowVulReportDataResponse withVulnerabilities(
        List<ShowVulReportDataResponseInfoVulnerabilities> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
        return this;
    }

    public ShowVulReportDataResponse addVulnerabilitiesItem(
        ShowVulReportDataResponseInfoVulnerabilities vulnerabilitiesItem) {
        if (this.vulnerabilities == null) {
            this.vulnerabilities = new ArrayList<>();
        }
        this.vulnerabilities.add(vulnerabilitiesItem);
        return this;
    }

    public ShowVulReportDataResponse withVulnerabilities(
        Consumer<List<ShowVulReportDataResponseInfoVulnerabilities>> vulnerabilitiesSetter) {
        if (this.vulnerabilities == null) {
            this.vulnerabilities = new ArrayList<>();
        }
        vulnerabilitiesSetter.accept(this.vulnerabilities);
        return this;
    }

    /**
     * 漏洞列表
     * @return vulnerabilities
     */
    public List<ShowVulReportDataResponseInfoVulnerabilities> getVulnerabilities() {
        return vulnerabilities;
    }

    public void setVulnerabilities(List<ShowVulReportDataResponseInfoVulnerabilities> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }

    public ShowVulReportDataResponse withReportCreateTime(Long reportCreateTime) {
        this.reportCreateTime = reportCreateTime;
        return this;
    }

    /**
     * **参数解释**： 报告生成时间 **取值范围**： 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return reportCreateTime
     */
    public Long getReportCreateTime() {
        return reportCreateTime;
    }

    public void setReportCreateTime(Long reportCreateTime) {
        this.reportCreateTime = reportCreateTime;
    }

    public ShowVulReportDataResponse withVulnerabilityTotalCount(Integer vulnerabilityTotalCount) {
        this.vulnerabilityTotalCount = vulnerabilityTotalCount;
        return this;
    }

    /**
     * **参数解释**： 漏洞总数量 **取值范围**： 最小值0，最大值10000000 
     * minimum: 0
     * maximum: 10000000
     * @return vulnerabilityTotalCount
     */
    public Integer getVulnerabilityTotalCount() {
        return vulnerabilityTotalCount;
    }

    public void setVulnerabilityTotalCount(Integer vulnerabilityTotalCount) {
        this.vulnerabilityTotalCount = vulnerabilityTotalCount;
    }

    public ShowVulReportDataResponse withHostTotalCount(Integer hostTotalCount) {
        this.hostTotalCount = hostTotalCount;
        return this;
    }

    /**
     * **参数解释**： 主机总数量 **取值范围**： 最小值0，最大值20000 
     * minimum: 0
     * maximum: 20000
     * @return hostTotalCount
     */
    public Integer getHostTotalCount() {
        return hostTotalCount;
    }

    public void setHostTotalCount(Integer hostTotalCount) {
        this.hostTotalCount = hostTotalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVulReportDataResponse that = (ShowVulReportDataResponse) obj;
        return Objects.equals(this.sumary, that.sumary) && Objects.equals(this.summary, that.summary)
            && Objects.equals(this.hosts, that.hosts) && Objects.equals(this.vulnerabilities, that.vulnerabilities)
            && Objects.equals(this.reportCreateTime, that.reportCreateTime)
            && Objects.equals(this.vulnerabilityTotalCount, that.vulnerabilityTotalCount)
            && Objects.equals(this.hostTotalCount, that.hostTotalCount);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(sumary, summary, hosts, vulnerabilities, reportCreateTime, vulnerabilityTotalCount, hostTotalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVulReportDataResponse {\n");
        sb.append("    sumary: ").append(toIndentedString(sumary)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    vulnerabilities: ").append(toIndentedString(vulnerabilities)).append("\n");
        sb.append("    reportCreateTime: ").append(toIndentedString(reportCreateTime)).append("\n");
        sb.append("    vulnerabilityTotalCount: ").append(toIndentedString(vulnerabilityTotalCount)).append("\n");
        sb.append("    hostTotalCount: ").append(toIndentedString(hostTotalCount)).append("\n");
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
