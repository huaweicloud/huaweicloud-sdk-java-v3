package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 事件类型
 */
public class OrderAlertIncidentContentIncidentType {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_type")

    private String incidentType;

    public OrderAlertIncidentContentIncidentType withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 事件类型id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OrderAlertIncidentContentIncidentType withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 事件类型父类
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public OrderAlertIncidentContentIncidentType withIncidentType(String incidentType) {
        this.incidentType = incidentType;
        return this;
    }

    /**
     * 事件类型子类
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
        OrderAlertIncidentContentIncidentType that = (OrderAlertIncidentContentIncidentType) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.category, that.category)
            && Objects.equals(this.incidentType, that.incidentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, incidentType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderAlertIncidentContentIncidentType {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
