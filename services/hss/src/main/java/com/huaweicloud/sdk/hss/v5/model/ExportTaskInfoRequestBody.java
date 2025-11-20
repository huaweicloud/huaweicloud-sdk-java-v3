package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExportTaskInfoRequestBody
 */
public class ExportTaskInfoRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operational_report_data")

    private ExportTaskInfoRequestBodyOperationalReportData operationalReportData;

    public ExportTaskInfoRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**: 导出的类型 **约束限制**: 不涉及 **取值范围**: - operational-report：月度运营报告  **默认取值**: 不涉及 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ExportTaskInfoRequestBody withOperationalReportData(
        ExportTaskInfoRequestBodyOperationalReportData operationalReportData) {
        this.operationalReportData = operationalReportData;
        return this;
    }

    public ExportTaskInfoRequestBody withOperationalReportData(
        Consumer<ExportTaskInfoRequestBodyOperationalReportData> operationalReportDataSetter) {
        if (this.operationalReportData == null) {
            this.operationalReportData = new ExportTaskInfoRequestBodyOperationalReportData();
            operationalReportDataSetter.accept(this.operationalReportData);
        }

        return this;
    }

    /**
     * Get operationalReportData
     * @return operationalReportData
     */
    public ExportTaskInfoRequestBodyOperationalReportData getOperationalReportData() {
        return operationalReportData;
    }

    public void setOperationalReportData(ExportTaskInfoRequestBodyOperationalReportData operationalReportData) {
        this.operationalReportData = operationalReportData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportTaskInfoRequestBody that = (ExportTaskInfoRequestBody) obj;
        return Objects.equals(this.type, that.type)
            && Objects.equals(this.operationalReportData, that.operationalReportData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, operationalReportData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportTaskInfoRequestBody {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    operationalReportData: ").append(toIndentedString(operationalReportData)).append("\n");
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
