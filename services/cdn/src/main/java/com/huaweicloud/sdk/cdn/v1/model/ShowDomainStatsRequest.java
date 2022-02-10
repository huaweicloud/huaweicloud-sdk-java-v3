package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ShowDomainStatsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private Long interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_type")

    private String statType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_by")

    private String groupBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    private String country;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "district")

    private String district;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isp")

    private String isp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public ShowDomainStatsRequest withAction(String action) {
        this.action = action;
        return this;
    }

    /** 查询类型，可选location_summary,location_detail location_summary：查询汇总数据 location_detail：查询数据详情
     * 
     * @return action */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ShowDomainStatsRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 查询起始时间戳， 时间戳应设置需为整5分钟或整小时时刻点，设置方式如下 interval为300时，start_time设置为整5分钟时刻点，如：1631240100000(对应2021-09-10 10:15:00)
     * interval大于等于3600时，start_time设置为整小时时刻点，如：1631239200000(对应2021-09-10 10:00:00)
     * 
     * @return startTime */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowDomainStatsRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 查询结束时间戳， 时间戳应设置需为整5分钟或整小时时刻点，设置方式如下 interval为300时，end_time设置为整5分钟时刻点，如：1631243700000(对应2021-09-11 10:15:00)
     * interval大于等于3600时，end_time设置为整小时时刻点，如：1631325600000(对应2021-09-11 10:00:00)
     * 
     * @return endTime */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ShowDomainStatsRequest withInterval(Long interval) {
        this.interval = interval;
        return this;
    }

    /** 查询时间间隔，单位为秒，可设置值300(5分钟),3600(1小时),14400(4小时)等
     * 
     * @return interval */
    public Long getInterval() {
        return interval;
    }

    public void setInterval(Long interval) {
        this.interval = interval;
    }

    public ShowDomainStatsRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /** 域名列表，多个域名以逗号（半角）分隔，如：www.test1.com,www.test2.com，all表示查询名下全部域名
     * 
     * @return domainName */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ShowDomainStatsRequest withStatType(String statType) {
        this.statType = statType;
        return this;
    }

    /** 网络资源消耗： - bw（带宽） - flux（流量） HTTP状态码（组合指标）： - status_code_2xx（状态码详情2xx） - status_code_3xx（状态码详情3xx） -
     * status_code_4xx（状态码详情4xx） - status_code_5xx（状态码详情5xx）
     * 
     * @return statType */
    public String getStatType() {
        return statType;
    }

    public void setStatType(String statType) {
        this.statType = statType;
    }

    public ShowDomainStatsRequest withGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /** 数据分组方式，多个以英文逗号分隔，可选domain,country,district,isp，默认不分组
     * 
     * @return groupBy */
    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    public ShowDomainStatsRequest withCountry(String country) {
        this.country = country;
        return this;
    }

    /** 需要过滤的国家编码，多个以英文逗号分隔，all表示全部
     * 
     * @return country */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ShowDomainStatsRequest withDistrict(String district) {
        this.district = district;
        return this;
    }

    /** 需要过滤的地区编码，多个以英文逗号分隔，all表示全部，仅仅country字段为cn时设置才合法
     * 
     * @return district */
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public ShowDomainStatsRequest withIsp(String isp) {
        this.isp = isp;
        return this;
    }

    /** 需要过滤的运营商编码，多个以英文逗号分隔，all表示全部
     * 
     * @return isp */
    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public ShowDomainStatsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** 当用户开启企业项目功能时，该参数生效，表示查询资源所属项目，不传表示查询默认项目。注意：当使用子账号调用接口时，该参数必传。
     * 
     * @return enterpriseProjectId */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDomainStatsRequest showDomainStatsRequest = (ShowDomainStatsRequest) o;
        return Objects.equals(this.action, showDomainStatsRequest.action)
            && Objects.equals(this.startTime, showDomainStatsRequest.startTime)
            && Objects.equals(this.endTime, showDomainStatsRequest.endTime)
            && Objects.equals(this.interval, showDomainStatsRequest.interval)
            && Objects.equals(this.domainName, showDomainStatsRequest.domainName)
            && Objects.equals(this.statType, showDomainStatsRequest.statType)
            && Objects.equals(this.groupBy, showDomainStatsRequest.groupBy)
            && Objects.equals(this.country, showDomainStatsRequest.country)
            && Objects.equals(this.district, showDomainStatsRequest.district)
            && Objects.equals(this.isp, showDomainStatsRequest.isp)
            && Objects.equals(this.enterpriseProjectId, showDomainStatsRequest.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action,
            startTime,
            endTime,
            interval,
            domainName,
            statType,
            groupBy,
            country,
            district,
            isp,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainStatsRequest {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    statType: ").append(toIndentedString(statType)).append("\n");
        sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    district: ").append(toIndentedString(district)).append("\n");
        sb.append("    isp: ").append(toIndentedString(isp)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
