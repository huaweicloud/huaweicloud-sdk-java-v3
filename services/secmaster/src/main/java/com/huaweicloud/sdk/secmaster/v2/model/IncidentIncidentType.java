package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 事件分类，详细定义参考《告警事件类型定义》
 */
public class IncidentIncidentType {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_type")

    private String incidentType;

    public IncidentIncidentType withCategory(String category) {
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

    public IncidentIncidentType withIncidentType(String incidentType) {
        this.incidentType = incidentType;
        return this;
    }

    /**
     * 事件类型
     * @return incidentType
     */
    public String getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IncidentIncidentType that = (IncidentIncidentType) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.incidentType, that.incidentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, incidentType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IncidentIncidentType {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    incidentType: ").append(toIndentedString(incidentType)).append("\n");
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
