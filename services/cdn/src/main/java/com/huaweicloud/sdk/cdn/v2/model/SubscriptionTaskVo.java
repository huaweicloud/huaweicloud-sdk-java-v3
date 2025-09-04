package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 订阅任务
 */
public class SubscriptionTaskVo {

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

    public SubscriptionTaskVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * - 订阅任务的名称 - [单词字符] [减号] [中文字符] 长度不超过32
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubscriptionTaskVo withPeriodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * - 订阅任务类型，类型如下： - 0：日报 - 1：周报 - 2：月报
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

    public SubscriptionTaskVo withEmails(String emails) {
        this.emails = emails;
        return this;
    }

    /**
     * 接收运营报表的邮箱地址。支持同时输入多个邮箱地址，多个邮箱地址用英文逗号（,）分隔。
     * @return emails
     */
    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public SubscriptionTaskVo withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 订阅的域名列表，支持同时输入多个域名，多个域名用半角逗号（,）分隔；说明：如果该参数为all，则为账号下的所有域名订阅运营报表。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public SubscriptionTaskVo withReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }

    /**
     * - 运营报表类型。支持同时输入多个报表类型，多个报表类型以英文逗号（,）分隔。 - 0：访问区域分布 - 1：国家分布 - 2：运营商分布 - 3：域名排行（按流量排序） - 4：热门URL（按流量排序） - 5：热门URL（按请求数排序） - 6：热门Referer（按流量排序） - 7：热门Referer（按请求数排序） - 10：回源热门URL（按流量排序） - 11：回源热门URL（按请求数排序） - 13：热门UA（按流量排序） - 14：热门UA（按请求数排序）
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
        SubscriptionTaskVo that = (SubscriptionTaskVo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.periodType, that.periodType)
            && Objects.equals(this.emails, that.emails) && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.reportType, that.reportType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, periodType, emails, domainName, reportType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionTaskVo {\n");
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
