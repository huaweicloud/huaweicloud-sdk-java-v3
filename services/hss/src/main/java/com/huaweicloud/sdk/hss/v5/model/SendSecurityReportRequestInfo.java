package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 发送安全报告
 */
public class SendSecurityReportRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_id")

    private Integer reportId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_sub_id")

    private Integer reportSubId;

    public SendSecurityReportRequestInfo withReportId(Integer reportId) {
        this.reportId = reportId;
        return this;
    }

    /**
     * **参数解释**: 报告ID **取值范围**: 字符长度10-2147483647位 
     * minimum: 0
     * maximum: 2147483647
     * @return reportId
     */
    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public SendSecurityReportRequestInfo withReportSubId(Integer reportSubId) {
        this.reportSubId = reportSubId;
        return this;
    }

    /**
     * **参数解释**: 报告子ID **取值范围**: 字符长度10-2147483647位 
     * minimum: 0
     * maximum: 2147483647
     * @return reportSubId
     */
    public Integer getReportSubId() {
        return reportSubId;
    }

    public void setReportSubId(Integer reportSubId) {
        this.reportSubId = reportSubId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SendSecurityReportRequestInfo that = (SendSecurityReportRequestInfo) obj;
        return Objects.equals(this.reportId, that.reportId) && Objects.equals(this.reportSubId, that.reportSubId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportId, reportSubId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendSecurityReportRequestInfo {\n");
        sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
        sb.append("    reportSubId: ").append(toIndentedString(reportSubId)).append("\n");
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
