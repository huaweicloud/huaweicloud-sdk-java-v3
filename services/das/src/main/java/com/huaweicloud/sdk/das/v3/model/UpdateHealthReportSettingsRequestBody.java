package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateHealthReportSettingsRequestBody
 */
public class UpdateHealthReportSettingsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "do_ai_anomaly_detection")

    private Boolean doAiAnomalyDetection;

    public UpdateHealthReportSettingsRequestBody withDoAiAnomalyDetection(Boolean doAiAnomalyDetection) {
        this.doAiAnomalyDetection = doAiAnomalyDetection;
        return this;
    }

    /**
     * 是否进行AI异常检测
     * @return doAiAnomalyDetection
     */
    public Boolean getDoAiAnomalyDetection() {
        return doAiAnomalyDetection;
    }

    public void setDoAiAnomalyDetection(Boolean doAiAnomalyDetection) {
        this.doAiAnomalyDetection = doAiAnomalyDetection;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateHealthReportSettingsRequestBody that = (UpdateHealthReportSettingsRequestBody) obj;
        return Objects.equals(this.doAiAnomalyDetection, that.doAiAnomalyDetection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doAiAnomalyDetection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHealthReportSettingsRequestBody {\n");
        sb.append("    doAiAnomalyDetection: ").append(toIndentedString(doAiAnomalyDetection)).append("\n");
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
