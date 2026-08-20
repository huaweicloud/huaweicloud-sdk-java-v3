package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowDomainLocationStatsRequest {

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
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_type")

    private String statType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private String ipVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private Long interval;

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
    @JsonProperty(value = "group_by")

    private String groupBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public ShowDomainLocationStatsRequest withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释：** 查询数据类型 **约束限制：** 不涉及 **取值范围：** - location_summary：查询汇总数据 - location_detail：查询明细数据 **默认取值：** 不涉及
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ShowDomainLocationStatsRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释：** 查询起始时间戳 **约束限制：** 需与结束时间戳同时指定，左闭右开 **取值范围：** - 若查询5分钟时间粒度（即interval为300）数据，start_time设置为整5分钟时刻点，如：1631240100000(对应2021-09-10 10:15:00) - 若查询1小时时间粒度（即interval为3600）数据，start_time设置为整小时时刻点，如：1631239200000(对应2021-09-10 10:00:00) - 若查询1天时间粒度（即interval为86400）数据，start_time设置为东8区零点时刻点，如：1631203200000(对应2021-09-10 00:00:00) **默认取值：** 不涉及
     * minimum: 0
     * maximum: 4102416000000
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowDomainLocationStatsRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释：** 查询结束时间戳 **约束限制：** 需与起始时间戳同时指定，左闭右开 **取值范围：** - 若查询5分钟时间粒度（即interval为300）数据，end_time设置为整5分钟时刻点，如：1631240100000）对应2021-09-10 10:15:00） - 若查询1小时时间粒度（即interval为3600）数据，end_time设置为整小时时刻点，如：1631239200000（对应2021-09-10 10:00:00） - 若查询1天时间粒度（即interval为86400）数据，end_time设置为东8区零点时刻点，如：1631203200000（对应2021-09-10 00:00:00） **默认取值：** 不涉及
     * minimum: 0
     * maximum: 4102416000000
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ShowDomainLocationStatsRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * **参数解释：** 域名列表 > 如果域名在查询时间段内无数据，结果将不返回该域名的信息  **约束限制：** 仅支持查询已经在CDN创建成功的域名 **取值范围：** - all表示查询名下全部域名 - 多个域名以逗号（半角）分隔，如：www.test1.com,www.test2.com **默认取值：** 不涉及
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ShowDomainLocationStatsRequest withStatType(String statType) {
        this.statType = statType;
        return this;
    }

    /**
     * **参数解释：** 统计指标类型 **约束限制：** 不涉及 **取值范围：** - 网络资源消耗   - bw：带宽   - flux：流量 - 访问情况   - req_num：请求总数 - HTTP状态码（组合指标）   - http_code_2xx：状态码汇总2xx   - http_code_3xx：状态码汇总3xx   - http_code_4xx：状态码汇总4xx   - http_code_5xx：状态码汇总5xx   - status_code_2xx：状态码详情2xx   - status_code_3xx：状态码详情3xx   - status_code_4xx：状态码详情4xx   - status_code_5xx：状态码详情5xx **默认取值：** 不涉及
     * @return statType
     */
    public String getStatType() {
        return statType;
    }

    public void setStatType(String statType) {
        this.statType = statType;
    }

    public ShowDomainLocationStatsRequest withIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * **参数解释：** 客户端传输协议 **约束限制：** 仅支持选择单一协议，不可同时配置IPv4、IPv6 **取值范围：** - IPv4 - IPv6 - 如果不传，默认查询全部 **默认取值：** 不涉及
     * @return ipVersion
     */
    public String getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
    }

    public ShowDomainLocationStatsRequest withInterval(Long interval) {
        this.interval = interval;
        return this;
    }

    /**
     * **参数解释：** 查询时间粒度 **约束限制：** - 查询跨度不超过1天时，支持5分钟粒度、1小时粒度 - 查询跨度不超过7天时，支持5分钟、1小时粒度、1天粒度 - 查询跨度不超过31天时，支持1小时粒度、1天粒度  **取值范围：** - 300：采样时间间隔为5分钟，单位：秒 - 3600：采样时间间隔为1小时，单位：秒 - 86400：采样时间间隔为1天，单位：秒 **默认取值：** 默认取对应查询时间跨度的最小时间间隔 > 时间跨度小于等于7天，最小时间间隔为300；时间跨度大于7天，最小时间间隔为3600
     * minimum: 0
     * maximum: 86400
     * @return interval
     */
    public Long getInterval() {
        return interval;
    }

    public void setInterval(Long interval) {
        this.interval = interval;
    }

    public ShowDomainLocationStatsRequest withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * **参数解释：** 国家&地区编码 **约束限制：** - 查询运营商统计数据时，不传该参数 - 查询top_url数据时，不传该参数 - 查询区域情况数据时，该参数只能传cn(中国)  **取值范围：** - 多个以英文逗号分隔 - all表示全部，取值见附录 **默认取值：** 不涉及
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ShowDomainLocationStatsRequest withProvince(String province) {
        this.province = province;
        return this;
    }

    /**
     * **参数解释：** 省份编码 **约束限制：** 当country为cn（中国）时，该参数生效 **取值范围：** - 多个以英文逗号分隔 - all表示全部，取值见附录 **默认取值：** 不涉及
     * @return province
     */
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public ShowDomainLocationStatsRequest withIsp(String isp) {
        this.isp = isp;
        return this;
    }

    /**
     * **参数解释：** 运营商编码 **约束限制：** 不涉及 **取值范围：** - 多个以英文逗号分隔 - all表示全部，取值见附录 **默认取值：** 不涉及
     * @return isp
     */
    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public ShowDomainLocationStatsRequest withGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /**
     * **参数解释：** 数据分组方式 **约束限制：** 不涉及 **取值范围：** - 多个以英文逗号分隔 - domain：按域名分组 - country：按国际&地区分组 - province：按省份分组 - isp：按运营商分组 **默认取值：** 默认不分组
     * @return groupBy
     */
    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    public ShowDomainLocationStatsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释：** 企业项目id > 您可以通过调用企业项目管理服务（EPS）的查询企业项目列表接口（ListEnterpriseProject）查询企业项目id  **约束限制：** - 当用户开启企业项目功能时，该参数生效，表示查询资源所属项目 - 当使用子账号调用接口时，该参数必传 **取值范围：** all表示所有项目 **默认取值：** 不涉及
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDomainLocationStatsRequest that = (ShowDomainLocationStatsRequest) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.statType, that.statType) && Objects.equals(this.ipVersion, that.ipVersion)
            && Objects.equals(this.interval, that.interval) && Objects.equals(this.country, that.country)
            && Objects.equals(this.province, that.province) && Objects.equals(this.isp, that.isp)
            && Objects.equals(this.groupBy, that.groupBy)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action,
            startTime,
            endTime,
            domainName,
            statType,
            ipVersion,
            interval,
            country,
            province,
            isp,
            groupBy,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainLocationStatsRequest {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    statType: ").append(toIndentedString(statType)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    province: ").append(toIndentedString(province)).append("\n");
        sb.append("    isp: ").append(toIndentedString(isp)).append("\n");
        sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
