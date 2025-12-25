package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 告警批量转事件body体
 */
public class OrderAlert {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<String> ids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_content")

    private OrderAlertIncidentContent incidentContent;

    public OrderAlert withIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public OrderAlert addIdsItem(String idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public OrderAlert withIds(Consumer<List<String>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * 转事件的告警id列表
     * @return ids
     */
    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public OrderAlert withIncidentContent(OrderAlertIncidentContent incidentContent) {
        this.incidentContent = incidentContent;
        return this;
    }

    public OrderAlert withIncidentContent(Consumer<OrderAlertIncidentContent> incidentContentSetter) {
        if (this.incidentContent == null) {
            this.incidentContent = new OrderAlertIncidentContent();
            incidentContentSetter.accept(this.incidentContent);
        }

        return this;
    }

    /**
     * Get incidentContent
     * @return incidentContent
     */
    public OrderAlertIncidentContent getIncidentContent() {
        return incidentContent;
    }

    public void setIncidentContent(OrderAlertIncidentContent incidentContent) {
        this.incidentContent = incidentContent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrderAlert that = (OrderAlert) obj;
        return Objects.equals(this.ids, that.ids) && Objects.equals(this.incidentContent, that.incidentContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids, incidentContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderAlert {\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    incidentContent: ").append(toIndentedString(incidentContent)).append("\n");
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
