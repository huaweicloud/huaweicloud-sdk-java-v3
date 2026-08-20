package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DownloadStatisticsExcelRequest {

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
    @JsonProperty(value = "excel_language")

    private String excelLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_area")

    private String serviceArea;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private Long interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "excel_type")

    private String excelType;

    public DownloadStatisticsExcelRequest withStartTime(Long startTime) {
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

    public DownloadStatisticsExcelRequest withEndTime(Long endTime) {
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

    public DownloadStatisticsExcelRequest withDomainName(String domainName) {
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

    public DownloadStatisticsExcelRequest withExcelLanguage(String excelLanguage) {
        this.excelLanguage = excelLanguage;
        return this;
    }

    /**
     * **参数解释：** 创建表格语言 **约束限制：** 不涉及 **取值范围：** - zh：中文 - en：英文 **默认取值：** zh：中文
     * @return excelLanguage
     */
    public String getExcelLanguage() {
        return excelLanguage;
    }

    public void setExcelLanguage(String excelLanguage) {
        this.excelLanguage = excelLanguage;
    }

    public DownloadStatisticsExcelRequest withServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
        return this;
    }

    /**
     * **参数解释：** 服务范围 **约束限制：** 当查询回源类指标时，该参数无效 **取值范围：** - mainland_china：中国大陆 - outside_mainland_china：中国大陆境外 **默认取值：** - mainland_china：中国大陆
     * @return serviceArea
     */
    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }

    public DownloadStatisticsExcelRequest withInterval(Long interval) {
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

    public DownloadStatisticsExcelRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    public DownloadStatisticsExcelRequest withExcelType(String excelType) {
        this.excelType = excelType;
        return this;
    }

    /**
     * 统计数据表格类型,目前支持 - 用量统计数据(excel_type_usage) - 访问情况统计数据(excel_type_access) - 回源情况统计数据（excel_type_origin） - http_code统计数据(excel_type_http_code)
     * @return excelType
     */
    public String getExcelType() {
        return excelType;
    }

    public void setExcelType(String excelType) {
        this.excelType = excelType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadStatisticsExcelRequest that = (DownloadStatisticsExcelRequest) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.excelLanguage, that.excelLanguage)
            && Objects.equals(this.serviceArea, that.serviceArea) && Objects.equals(this.interval, that.interval)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.excelType, that.excelType);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(startTime, endTime, domainName, excelLanguage, serviceArea, interval, enterpriseProjectId, excelType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadStatisticsExcelRequest {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    excelLanguage: ").append(toIndentedString(excelLanguage)).append("\n");
        sb.append("    serviceArea: ").append(toIndentedString(serviceArea)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    excelType: ").append(toIndentedString(excelType)).append("\n");
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
