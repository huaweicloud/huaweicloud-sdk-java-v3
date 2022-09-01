package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowDomainItemLocationDetailsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    @JacksonXmlProperty(localName = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    @JacksonXmlProperty(localName = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    @JacksonXmlProperty(localName = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    @JacksonXmlProperty(localName = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_type")

    @JacksonXmlProperty(localName = "stat_type")

    private String statType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    @JacksonXmlProperty(localName = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isp")

    @JacksonXmlProperty(localName = "isp")

    private String isp;

    public ShowDomainItemLocationDetailsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 当用户开启企业项目功能时，该参数生效，表示查询资源所属项目，不传表示查询默认项目。注意：当使用子账号调用接口时，该参数必传。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowDomainItemLocationDetailsRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 查询开始时间戳，必须设为5分钟整时刻点
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowDomainItemLocationDetailsRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 查询结束时间戳，必须设为5分钟整时刻点
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ShowDomainItemLocationDetailsRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 域名列表，多个域名以逗号（半角）分隔，如：www.test1.com,www.test2.com，all表示查询名下全部域名
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ShowDomainItemLocationDetailsRequest withStatType(String statType) {
        this.statType = statType;
        return this;
    }

    /**
     * 指标类型列表 网络资源消耗：bw（带宽），flux（流量），ipv6_bw(ipv6带宽)，ipv6_flux(ipv6流量), https_bw(https带宽)，https_flux(https流量) 访问情况：req_num（请求总数），hit_num（请求命中次数），req_time(请求时长) HTTP状态码（组合指标）：status_code_2xx(状态码2xx)，status_code_3xx(状态码3xx)，status_code_4xx(状态码4xx)，status_code_5xx(状态码5xx)
     * @return statType
     */
    public String getStatType() {
        return statType;
    }

    public void setStatType(String statType) {
        this.statType = statType;
    }

    public ShowDomainItemLocationDetailsRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域列表，以逗号分隔，all表示查询全部区域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ShowDomainItemLocationDetailsRequest withIsp(String isp) {
        this.isp = isp;
        return this;
    }

    /**
     * 运营商列表，以逗号分隔，all表示查询全部运营商
     * @return isp
     */
    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDomainItemLocationDetailsRequest showDomainItemLocationDetailsRequest =
            (ShowDomainItemLocationDetailsRequest) o;
        return Objects.equals(this.enterpriseProjectId, showDomainItemLocationDetailsRequest.enterpriseProjectId)
            && Objects.equals(this.startTime, showDomainItemLocationDetailsRequest.startTime)
            && Objects.equals(this.endTime, showDomainItemLocationDetailsRequest.endTime)
            && Objects.equals(this.domainName, showDomainItemLocationDetailsRequest.domainName)
            && Objects.equals(this.statType, showDomainItemLocationDetailsRequest.statType)
            && Objects.equals(this.region, showDomainItemLocationDetailsRequest.region)
            && Objects.equals(this.isp, showDomainItemLocationDetailsRequest.isp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, startTime, endTime, domainName, statType, region, isp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainItemLocationDetailsRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    statType: ").append(toIndentedString(statType)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    isp: ").append(toIndentedString(isp)).append("\n");
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
