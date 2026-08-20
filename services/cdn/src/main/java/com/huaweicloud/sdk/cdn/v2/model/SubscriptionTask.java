package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 订阅任务
 */
public class SubscriptionTask {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private Integer periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "emails")

    private String emails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_type")

    private String reportType;

    public SubscriptionTask withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 订阅任务id **取值范围：** 不涉及
     * minimum: 0
     * maximum: 999999999
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SubscriptionTask withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释：** 创建时间 **取值范围：** 不涉及
     * minimum: 0
     * maximum: 4102416000000
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public SubscriptionTask withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释：** 最近更新时间 **取值范围：** 不涉及
     * minimum: 0
     * maximum: 4102416000000
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public SubscriptionTask withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 订阅任务的名称 **约束限制：** 长度不超过32个字符。 **取值范围：** 支持大小写字母、中文字符、“-”
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubscriptionTask withPeriodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * **参数解释：** 订阅任务类型 **取值范围：** - 0：日报 - 1：周报 - 2：月报
     * minimum: 0
     * maximum: 2
     * @return periodType
     */
    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public SubscriptionTask withEmails(String emails) {
        this.emails = emails;
        return this;
    }

    /**
     * **参数解释：** 接收运营报表的邮箱地址 > 支持同时输入多个邮箱地址  **取值范围：** 多个邮箱地址用英文逗号（,）分隔
     * @return emails
     */
    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public SubscriptionTask withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * **参数解释：** 订阅的域名列表 > 支持同时输入多个域名  **取值范围：** - 多个域名用半角逗号（,）分隔 - 如果该参数为all，则为账号下的所有域名订阅运营报表
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public SubscriptionTask withReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }

    /**
     * **参数解释：** 运营报表类型 > 支持同时输入多个报表类型  **取值范围：** - 多个报表类型以英文逗号（,）分隔 - 0：访问区域分布 - 1：国家分布 - 2：运营商分布 - 3：域名排行（按流量排序） - 4：热门URL（按流量排序） - 5：热门URL（按请求数排序） - 6：热门Referer（按流量排序） - 7：热门Referer（按请求数排序） - 10：回源热门URL（按流量排序） - 11：回源热门URL（按请求数排序） - 13：热门UA（按流量排序） - 14：热门UA（按请求数排序）
     * @return reportType
     */
    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubscriptionTask that = (SubscriptionTask) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.name, that.name)
            && Objects.equals(this.periodType, that.periodType) && Objects.equals(this.emails, that.emails)
            && Objects.equals(this.domainName, that.domainName) && Objects.equals(this.reportType, that.reportType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createTime, updateTime, name, periodType, emails, domainName, reportType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionTask {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
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
