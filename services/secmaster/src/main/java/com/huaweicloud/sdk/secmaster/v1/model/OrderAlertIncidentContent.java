package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 事件内容
 */
public class OrderAlertIncidentContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_type")

    private OrderAlertIncidentContentIncidentType incidentType;

    public OrderAlertIncidentContent withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 事件名称
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public OrderAlertIncidentContent withIncidentType(OrderAlertIncidentContentIncidentType incidentType) {
        this.incidentType = incidentType;
        return this;
    }

    public OrderAlertIncidentContent withIncidentType(
        Consumer<OrderAlertIncidentContentIncidentType> incidentTypeSetter) {
        if (this.incidentType == null) {
            this.incidentType = new OrderAlertIncidentContentIncidentType();
            incidentTypeSetter.accept(this.incidentType);
        }

        return this;
    }

    /**
     * Get incidentType
     * @return incidentType
     */
    public OrderAlertIncidentContentIncidentType getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(OrderAlertIncidentContentIncidentType incidentType) {
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
        OrderAlertIncidentContent that = (OrderAlertIncidentContent) obj;
        return Objects.equals(this.title, that.title) && Objects.equals(this.incidentType, that.incidentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, incidentType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderAlertIncidentContent {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
