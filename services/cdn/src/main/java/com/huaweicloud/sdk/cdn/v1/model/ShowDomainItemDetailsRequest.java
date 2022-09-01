package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowDomainItemDetailsRequest {

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
    @JsonProperty(value = "service_area")

    @JacksonXmlProperty(localName = "service_area")

    private String serviceArea;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_type")

    @JacksonXmlProperty(localName = "stat_type")

    private String statType;

    public ShowDomainItemDetailsRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ShowDomainItemDetailsRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 查询起始时间戳，必须设为5分钟整时刻点
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowDomainItemDetailsRequest withEndTime(Long endTime) {
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

    public ShowDomainItemDetailsRequest withDomainName(String domainName) {
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

    public ShowDomainItemDetailsRequest withServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
        return this;
    }

    /**
     * mainland_china(中国大陆)，outside_mainland_china(中国大陆境外)，默认为mainland_china。
     * @return serviceArea
     */
    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }

    public ShowDomainItemDetailsRequest withStatType(String statType) {
        this.statType = statType;
        return this;
    }

    /**
     * 网络资源消耗： - bw（带宽） - flux（流量） - bs_bw(回源带宽) - bs_flux（回源流量）  访问情况： - req_num（请求总数） - hit_num（请求命中次数） - bs_num(回源总数) - bs_fail_num(回源失败数) - hit_flux（命中流量）  HTTP状态码（组合指标）： - http_code_2xx(状态码汇总2xx) - http_code_3xx(状态码汇总3xx) - http_code_4xx(状态码汇总4xx) - http_code_5xx(状态码汇总5xx) - bs_http_code_2xx（回源状态码汇总2xx） - bs_http_code_3xx（回源状态码汇总3xx） - bs_http_code_4xx（回源状态码汇总4xx） - bs_http_code_5xx（回源状态码汇总5xx） - status_code_2xx（状态码详情2xx） - status_code_3xx（状态码详情3xx） - status_code_4xx（状态码详情4xx） - status_code_5xx（状态码详情5xx） - bs_status_code_2xx（回源状态码详情2xx） - bs_status_code_3xx（回源状态码详情3xx） - bs_status_code_4xx（回源状态码详情4xx） - bs_status_code_5xx（回源状态码详情5xx） - status_code和bs_status_code不能一起查询，否则数据会不准确，status_code不支持指定服务区域
     * @return statType
     */
    public String getStatType() {
        return statType;
    }

    public void setStatType(String statType) {
        this.statType = statType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDomainItemDetailsRequest showDomainItemDetailsRequest = (ShowDomainItemDetailsRequest) o;
        return Objects.equals(this.enterpriseProjectId, showDomainItemDetailsRequest.enterpriseProjectId)
            && Objects.equals(this.startTime, showDomainItemDetailsRequest.startTime)
            && Objects.equals(this.endTime, showDomainItemDetailsRequest.endTime)
            && Objects.equals(this.domainName, showDomainItemDetailsRequest.domainName)
            && Objects.equals(this.serviceArea, showDomainItemDetailsRequest.serviceArea)
            && Objects.equals(this.statType, showDomainItemDetailsRequest.statType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, startTime, endTime, domainName, serviceArea, statType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainItemDetailsRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    serviceArea: ").append(toIndentedString(serviceArea)).append("\n");
        sb.append("    statType: ").append(toIndentedString(statType)).append("\n");
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
