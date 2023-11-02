package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 告警分类，详细定义参考《告警类型定义》
 */
public class AlertAlertType {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_type")

    private String alertType;

    public AlertAlertType withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 类别
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public AlertAlertType withAlertType(String alertType) {
        this.alertType = alertType;
        return this;
    }

    /**
     * 告警类型
     * @return alertType
     */
    public String getAlertType() {
        return alertType;
    }

    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlertAlertType that = (AlertAlertType) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.alertType, that.alertType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, alertType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlertAlertType {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
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
