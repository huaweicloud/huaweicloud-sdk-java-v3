package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowHealthReportSettingsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private Long updateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "do_ai_anomaly_detection")

    private Boolean doAiAnomalyDetection;

    public ShowHealthReportSettingsResponse withUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * 更新时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return updateAt
     */
    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public ShowHealthReportSettingsResponse withDoAiAnomalyDetection(Boolean doAiAnomalyDetection) {
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
        ShowHealthReportSettingsResponse that = (ShowHealthReportSettingsResponse) obj;
        return Objects.equals(this.updateAt, that.updateAt)
            && Objects.equals(this.doAiAnomalyDetection, that.doAiAnomalyDetection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updateAt, doAiAnomalyDetection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHealthReportSettingsResponse {\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
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
