package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DownloadRegionCarrierExcelRequest {

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
    @JsonProperty(value = "interval")

    private Long interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    private String country;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "excel_language")

    private String excelLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "excel_type")

    private String excelType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "carrier")

    private String carrier;

    public DownloadRegionCarrierExcelRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * - 查询起始时间戳，时间戳应设置需为整5分钟，设置方式如下： - interval为300时，start_time设置为整5分钟时刻点，如：1631240100000(对应2021-09-10 10:15:00) - interval为3600时，start_time设置为整小时时刻点，如：1631239200000(对应2021-09-10 10:00:00) - interval为86400时，start_time设置为东8区零点时刻点，如：1631203200000(对应2021-09-10 00:00:00)
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

    public DownloadRegionCarrierExcelRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * - 查询结束时间戳，时间戳应设置需为整5分钟，设置方式如下： - interval为300时，end_time设置为整5分钟时刻点，如：1631243700000(对应2021-09-10 11:15:00) - interval为3600时，end_time设置为整小时时刻点，如：1631325600000(对应2021-09-11 10:00:00) - interval为86400时，end_time设置为东8区零点时刻点，如：1631376000000(对应2021-09-12 00:00:00)
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

    public DownloadRegionCarrierExcelRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 域名列表，多个域名以逗号（半角）分隔，如：www.test1.com,www.test2.com all表示查询名下全部域名
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public DownloadRegionCarrierExcelRequest withInterval(Long interval) {
        this.interval = interval;
        return this;
    }

    /**
     * - 查询时间间隔，单位：秒，取值说明： - 300(5分钟)：最大查询跨度2天 - 3600(1小时)：最大查询跨度7天 - 86400(1天)：最大查询跨度31天 - 如果不传，默认取对应时间跨度的最小间隔。
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

    public DownloadRegionCarrierExcelRequest withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * - 国家&地区编码，多个以英文逗号分隔，all表示全部，取值见附录 - 访问运营商统计数据时不能填写 - 访问top_url数据时不能填写 - 访问区域情况数据时只能填写cn(中国)
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public DownloadRegionCarrierExcelRequest withExcelLanguage(String excelLanguage) {
        this.excelLanguage = excelLanguage;
        return this;
    }

    /**
     * 创建表格语言，支持zh(中文)，en(英文)两种，如果不传默认为zh
     * @return excelLanguage
     */
    public String getExcelLanguage() {
        return excelLanguage;
    }

    public void setExcelLanguage(String excelLanguage) {
        this.excelLanguage = excelLanguage;
    }

    public DownloadRegionCarrierExcelRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 当用户开启企业项目功能时，该参数生效，表示查询资源所属项目，\"all\"表示所有项目。注意：当使用子账号调用接口时，该参数必传。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public DownloadRegionCarrierExcelRequest withExcelType(String excelType) {
        this.excelType = excelType;
        return this;
    }

    /**
     * 统计数据表格类型,目前支持 - 区域用量统计数据(excel_type_usage) - 区域访问情况统计数据(excel_type_access) - 区域情况统计数据（excel_type_region） - 区域运营商情况统计数据(excel_type_carrier) - 国家情况统计数据(excel_type_country) - top_url统计数据(excel_type_top_url)
     * @return excelType
     */
    public String getExcelType() {
        return excelType;
    }

    public void setExcelType(String excelType) {
        this.excelType = excelType;
    }

    public DownloadRegionCarrierExcelRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * - 地区区域,当country为cn（中国）时有效 - 访问运营商统计数据时不能填写 - 访问国家统计数据时不能填写 - 访问top_url数据时不能填写
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public DownloadRegionCarrierExcelRequest withCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }

    /**
     * - 运营商编码 - 访问区域统计数据时不能填写 - 访问国家统计数据时不能填写 - 访问top_url数据时不能填写
     * @return carrier
     */
    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DownloadRegionCarrierExcelRequest downloadRegionCarrierExcelRequest = (DownloadRegionCarrierExcelRequest) o;
        return Objects.equals(this.startTime, downloadRegionCarrierExcelRequest.startTime)
            && Objects.equals(this.endTime, downloadRegionCarrierExcelRequest.endTime)
            && Objects.equals(this.domainName, downloadRegionCarrierExcelRequest.domainName)
            && Objects.equals(this.interval, downloadRegionCarrierExcelRequest.interval)
            && Objects.equals(this.country, downloadRegionCarrierExcelRequest.country)
            && Objects.equals(this.excelLanguage, downloadRegionCarrierExcelRequest.excelLanguage)
            && Objects.equals(this.enterpriseProjectId, downloadRegionCarrierExcelRequest.enterpriseProjectId)
            && Objects.equals(this.excelType, downloadRegionCarrierExcelRequest.excelType)
            && Objects.equals(this.region, downloadRegionCarrierExcelRequest.region)
            && Objects.equals(this.carrier, downloadRegionCarrierExcelRequest.carrier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime,
            endTime,
            domainName,
            interval,
            country,
            excelLanguage,
            enterpriseProjectId,
            excelType,
            region,
            carrier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadRegionCarrierExcelRequest {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    excelLanguage: ").append(toIndentedString(excelLanguage)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    excelType: ").append(toIndentedString(excelType)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
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
