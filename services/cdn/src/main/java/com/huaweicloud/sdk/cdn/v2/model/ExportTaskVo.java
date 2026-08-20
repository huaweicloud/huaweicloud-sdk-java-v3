package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 导出任务请求参数
 */
public class ExportTaskVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_by")

    private String groupBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private Long interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_area")

    private String serviceArea;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_type")

    private String statType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    private String country;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "province")

    private String province;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isp")

    private String isp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    public ExportTaskVo withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释：** 导出数据类型 **约束限制：** 不涉及 **取值范围：** - reports_detail：基础话单数据导出 - top_url_detail：TOP URL数据导出 - top_ua_detail：TOP UA数据导出 - top_referer_detail：TOP referer数据导出 - top_ip_detail：TOP IP数据导出 - isp_detail：运营商数据导出, - top_path_detail： TOP path数据导出, - uv：UV数据导出 **默认取值：** 不涉及
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ExportTaskVo withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * **参数解释：** 订阅的域名列表 > 支持同时输入多个域名  **约束限制：** 不涉及 **取值范围：** - 多个域名用半角逗号（,）分隔 - 如果该参数为all，则为账号下的所有域名订阅运营报表 **默认取值：** 不涉及
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ExportTaskVo withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释：** 导出起始时间 **约束限制：** 不涉及 **取值范围：** 相对于UTC 1970-01-01到当前时间相隔的毫秒数 **默认取值：** 不涉及
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ExportTaskVo withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释：** 导出结束时间 **约束限制：** 不涉及 **取值范围：** 相对于UTC 1970-01-01到当前时间相隔的毫秒数 **默认取值：** 不涉及
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ExportTaskVo withGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /**
     * **参数解释：** 数据分组方式 **约束限制：** 不涉及 **取值范围：** domain：按域名分组 **默认取值：** 默认不分组
     * @return groupBy
     */
    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    public ExportTaskVo withInterval(Long interval) {
        this.interval = interval;
        return this;
    }

    /**
     * **参数解释：** 查询时间粒度 **约束限制：** 当导出时间跨度超过90天时，仅支持1小时粒度（3600） **取值范围：** - 300：采样时间间隔为5分钟，单位：秒 - 3600：采样时间间隔为1小时，单位：秒 **默认取值：** 不涉及
     * @return interval
     */
    public Long getInterval() {
        return interval;
    }

    public void setInterval(Long interval) {
        this.interval = interval;
    }

    public ExportTaskVo withServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
        return this;
    }

    /**
     * **参数解释：** 服务范围 **约束限制：** 服务范围为中国大陆或全球时，加速域名需要到工信部备案 **取值范围：** - mainland_china：中国大陆 - outside_mainland_china：中国大陆境外 - global：全球 **默认取值：** mainland_china：中国大陆
     * @return serviceArea
     */
    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }

    public ExportTaskVo withStatType(String statType) {
        this.statType = statType;
        return this;
    }

    /**
     * **参数解释：** 统计指标类型 **约束限制：** 不涉及 **取值范围：** - flux：流量 - req_num：请求总数 **默认取值：** 不涉及
     * @return statType
     */
    public String getStatType() {
        return statType;
    }

    public void setStatType(String statType) {
        this.statType = statType;
    }

    public ExportTaskVo withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * **参数解释：** 国家&地区编码 **约束限制：** - 查询运营商统计数据时，不传该参数 - 查询top_url数据时，不传该参数 - 查询区域情况数据时，该参数传cn（中国） **取值范围：** - 多个以英文逗号分隔 - all表示全部，取值见附录 **默认取值：** 不涉及
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ExportTaskVo withProvince(String province) {
        this.province = province;
        return this;
    }

    /**
     * **参数解释：** 省份编码： **约束限制：** 当country为cn（中国）时，该参数有效 **取值范围：** all表示全部，取值见附录 **默认取值：** 不涉及
     * @return province
     */
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public ExportTaskVo withIsp(String isp) {
        this.isp = isp;
        return this;
    }

    /**
     * **参数解释：** 运营商名称 > 如果IP归属地未知，该字段返回null  **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return isp
     */
    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public ExportTaskVo withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * **参数解释：** 语言 **约束限制：** 不涉及 **取值范围：** - zh：中文 - en：英文 **默认取值：** zh：中文
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportTaskVo that = (ExportTaskVo) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.groupBy, that.groupBy) && Objects.equals(this.interval, that.interval)
            && Objects.equals(this.serviceArea, that.serviceArea) && Objects.equals(this.statType, that.statType)
            && Objects.equals(this.country, that.country) && Objects.equals(this.province, that.province)
            && Objects.equals(this.isp, that.isp) && Objects.equals(this.language, that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action,
            domainName,
            startTime,
            endTime,
            groupBy,
            interval,
            serviceArea,
            statType,
            country,
            province,
            isp,
            language);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportTaskVo {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    serviceArea: ").append(toIndentedString(serviceArea)).append("\n");
        sb.append("    statType: ").append(toIndentedString(statType)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    province: ").append(toIndentedString(province)).append("\n");
        sb.append("    isp: ").append(toIndentedString(isp)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
