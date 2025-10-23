package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowReportSettingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_setting")

    private ReportSettingEntity reportSetting;

    public ShowReportSettingResponse withReportSetting(ReportSettingEntity reportSetting) {
        this.reportSetting = reportSetting;
        return this;
    }

    public ShowReportSettingResponse withReportSetting(Consumer<ReportSettingEntity> reportSettingSetter) {
        if (this.reportSetting == null) {
            this.reportSetting = new ReportSettingEntity();
            reportSettingSetter.accept(this.reportSetting);
        }

        return this;
    }

    /**
     * Get reportSetting
     * @return reportSetting
     */
    public ReportSettingEntity getReportSetting() {
        return reportSetting;
    }

    public void setReportSetting(ReportSettingEntity reportSetting) {
        this.reportSetting = reportSetting;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowReportSettingResponse that = (ShowReportSettingResponse) obj;
        return Objects.equals(this.reportSetting, that.reportSetting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportSetting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowReportSettingResponse {\n");
        sb.append("    reportSetting: ").append(toIndentedString(reportSetting)).append("\n");
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
