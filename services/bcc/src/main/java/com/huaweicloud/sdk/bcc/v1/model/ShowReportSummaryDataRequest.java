package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowReportSummaryDataRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_id")

    private String reportId;

    /**
     * 数据项名称，取值范围：task-status-pie,task-type-pie,task-status-region-column,task-trend-curve,resource-protection-pie,resource-compliance-pie,resource-protection-region-column,resource-compliance-region-column,resource-trend-curve
     */
    public static final class DataItemNameEnum {

        /**
         * Enum TASK_STATUS_PIE for value: "task-status-pie"
         */
        public static final DataItemNameEnum TASK_STATUS_PIE = new DataItemNameEnum("task-status-pie");

        /**
         * Enum TASK_TYPE_PIE for value: "task-type-pie"
         */
        public static final DataItemNameEnum TASK_TYPE_PIE = new DataItemNameEnum("task-type-pie");

        /**
         * Enum TASK_STATUS_REGION_COLUMN for value: "task-status-region-column"
         */
        public static final DataItemNameEnum TASK_STATUS_REGION_COLUMN =
            new DataItemNameEnum("task-status-region-column");

        /**
         * Enum TASK_TREND_CURVE for value: "task-trend-curve"
         */
        public static final DataItemNameEnum TASK_TREND_CURVE = new DataItemNameEnum("task-trend-curve");

        /**
         * Enum RESOURCE_PROTECTION_PIE for value: "resource-protection-pie"
         */
        public static final DataItemNameEnum RESOURCE_PROTECTION_PIE = new DataItemNameEnum("resource-protection-pie");

        /**
         * Enum RESOURCE_COMPLIANCE_PIE for value: "resource-compliance-pie"
         */
        public static final DataItemNameEnum RESOURCE_COMPLIANCE_PIE = new DataItemNameEnum("resource-compliance-pie");

        /**
         * Enum RESOURCE_PROTECTION_REGION_COLUMN for value: "resource-protection-region-column"
         */
        public static final DataItemNameEnum RESOURCE_PROTECTION_REGION_COLUMN =
            new DataItemNameEnum("resource-protection-region-column");

        /**
         * Enum RESOURCE_COMPLIANCE_REGION_COLUMN for value: "resource-compliance-region-column"
         */
        public static final DataItemNameEnum RESOURCE_COMPLIANCE_REGION_COLUMN =
            new DataItemNameEnum("resource-compliance-region-column");

        /**
         * Enum RESOURCE_TREND_CURVE for value: "resource-trend-curve"
         */
        public static final DataItemNameEnum RESOURCE_TREND_CURVE = new DataItemNameEnum("resource-trend-curve");

        private static final Map<String, DataItemNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DataItemNameEnum> createStaticFields() {
            Map<String, DataItemNameEnum> map = new HashMap<>();
            map.put("task-status-pie", TASK_STATUS_PIE);
            map.put("task-type-pie", TASK_TYPE_PIE);
            map.put("task-status-region-column", TASK_STATUS_REGION_COLUMN);
            map.put("task-trend-curve", TASK_TREND_CURVE);
            map.put("resource-protection-pie", RESOURCE_PROTECTION_PIE);
            map.put("resource-compliance-pie", RESOURCE_COMPLIANCE_PIE);
            map.put("resource-protection-region-column", RESOURCE_PROTECTION_REGION_COLUMN);
            map.put("resource-compliance-region-column", RESOURCE_COMPLIANCE_REGION_COLUMN);
            map.put("resource-trend-curve", RESOURCE_TREND_CURVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DataItemNameEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DataItemNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DataItemNameEnum(value));
        }

        public static DataItemNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DataItemNameEnum) {
                return this.value.equals(((DataItemNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_item_name")

    private DataItemNameEnum dataItemName;

    public ShowReportSummaryDataRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowReportSummaryDataRequest withReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }

    /**
     * 报告ID
     * @return reportId
     */
    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public ShowReportSummaryDataRequest withDataItemName(DataItemNameEnum dataItemName) {
        this.dataItemName = dataItemName;
        return this;
    }

    /**
     * 数据项名称，取值范围：task-status-pie,task-type-pie,task-status-region-column,task-trend-curve,resource-protection-pie,resource-compliance-pie,resource-protection-region-column,resource-compliance-region-column,resource-trend-curve
     * @return dataItemName
     */
    public DataItemNameEnum getDataItemName() {
        return dataItemName;
    }

    public void setDataItemName(DataItemNameEnum dataItemName) {
        this.dataItemName = dataItemName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowReportSummaryDataRequest that = (ShowReportSummaryDataRequest) obj;
        return Objects.equals(this.domainId, that.domainId) && Objects.equals(this.reportId, that.reportId)
            && Objects.equals(this.dataItemName, that.dataItemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, reportId, dataItemName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowReportSummaryDataRequest {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
        sb.append("    dataItemName: ").append(toIndentedString(dataItemName)).append("\n");
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
