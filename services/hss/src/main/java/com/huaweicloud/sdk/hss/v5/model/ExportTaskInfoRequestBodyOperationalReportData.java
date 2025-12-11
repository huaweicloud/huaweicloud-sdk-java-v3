package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**: 导出的报告参数数据 **约束限制**: 不涉及 
 */
public class ExportTaskInfoRequestBodyOperationalReportData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_id")

    private String reportId;

    public ExportTaskInfoRequestBodyOperationalReportData withReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }

    /**
     * **参数解释**: 导出的报告的id **约束限制**: 不涉及 **取值范围**: 字符长度1-32位 **默认取值**: 不涉及 
     * @return reportId
     */
    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportTaskInfoRequestBodyOperationalReportData that = (ExportTaskInfoRequestBodyOperationalReportData) obj;
        return Objects.equals(this.reportId, that.reportId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportTaskInfoRequestBodyOperationalReportData {\n");
        sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
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
