package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListReportSettingsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_settings")

    private List<ReportSettingEntity> reportSettings = null;

    public ListReportSettingsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 报告配置总条数
     * minimum: 0
     * maximum: 32
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListReportSettingsResponse withReportSettings(List<ReportSettingEntity> reportSettings) {
        this.reportSettings = reportSettings;
        return this;
    }

    public ListReportSettingsResponse addReportSettingsItem(ReportSettingEntity reportSettingsItem) {
        if (this.reportSettings == null) {
            this.reportSettings = new ArrayList<>();
        }
        this.reportSettings.add(reportSettingsItem);
        return this;
    }

    public ListReportSettingsResponse withReportSettings(Consumer<List<ReportSettingEntity>> reportSettingsSetter) {
        if (this.reportSettings == null) {
            this.reportSettings = new ArrayList<>();
        }
        reportSettingsSetter.accept(this.reportSettings);
        return this;
    }

    /**
     * 配置列表
     * @return reportSettings
     */
    public List<ReportSettingEntity> getReportSettings() {
        return reportSettings;
    }

    public void setReportSettings(List<ReportSettingEntity> reportSettings) {
        this.reportSettings = reportSettings;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListReportSettingsResponse that = (ListReportSettingsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.reportSettings, that.reportSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, reportSettings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListReportSettingsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    reportSettings: ").append(toIndentedString(reportSettings)).append("\n");
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
