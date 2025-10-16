package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteAlertNoticeConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_id")

    private String alertId;

    public DeleteAlertNoticeConfigRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * **参数解释：** zh-cn/en-us **约束限制：** 不涉及 **取值范围：** - zh-cn - en-us  **默认取值：** 不涉及
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public DeleteAlertNoticeConfigRequest withAlertId(String alertId) {
        this.alertId = alertId;
        return this;
    }

    /**
     * **参数解释：** 告警通知id **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return alertId
     */
    public String getAlertId() {
        return alertId;
    }

    public void setAlertId(String alertId) {
        this.alertId = alertId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteAlertNoticeConfigRequest that = (DeleteAlertNoticeConfigRequest) obj;
        return Objects.equals(this.xLanguage, that.xLanguage) && Objects.equals(this.alertId, that.alertId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, alertId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAlertNoticeConfigRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    alertId: ").append(toIndentedString(alertId)).append("\n");
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
