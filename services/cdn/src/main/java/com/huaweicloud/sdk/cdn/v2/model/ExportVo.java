package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据导出
 */
public class ExportVo {

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
    @JsonProperty(value = "service_area")

    private String serviceArea;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_type")

    private String statType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    private String country;

    public ExportVo withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释：** 规则行为 **约束限制：** 不涉及
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ExportVo withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 域名列表，支持同时输入多个域名，多个域名用半角逗号（,）分隔；说明：如果该参数为all，则为账号下的所有域名报表。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ExportVo withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 查询起始时间，相对于UTC 1970-01-01到当前时间相隔的毫秒数。
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ExportVo withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 查询结束时间，相对于UTC 1970-01-01到当前时间相隔的毫秒数。
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ExportVo withGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /**
     * 数据分组方式
     * @return groupBy
     */
    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    public ExportVo withServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
        return this;
    }

    /**
     * **参数解释：** 域名服务范围 **约束限制：** 服务范围为中国大陆或全球时，加速域名需要到工信部备案 **取值范围：** - mainland_china: 中国大陆 - outside_mainland_china: 中国大陆境外 - global: 全球 **默认取值：** mainland_china: 中国大陆
     * @return serviceArea
     */
    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }

    public ExportVo withStatType(String statType) {
        this.statType = statType;
        return this;
    }

    /**
     * 参数类型支持：flux(流量)，req_num(请求总数)。
     * @return statType
     */
    public String getStatType() {
        return statType;
    }

    public void setStatType(String statType) {
        this.statType = statType;
    }

    public ExportVo withCountry(String country) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportVo that = (ExportVo) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.groupBy, that.groupBy) && Objects.equals(this.serviceArea, that.serviceArea)
            && Objects.equals(this.statType, that.statType) && Objects.equals(this.country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, domainName, startTime, endTime, groupBy, serviceArea, statType, country);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportVo {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
        sb.append("    serviceArea: ").append(toIndentedString(serviceArea)).append("\n");
        sb.append("    statType: ").append(toIndentedString(statType)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
