package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 转事件
 */
public class OrderAlert {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<String> ids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_id")

    private String incidentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_content")

    private OrderAlertEventContent eventContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_content")

    private OrderAlertIncidentContent incidentContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marked_evidence")

    private Boolean markedEvidence;

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
     * 转事件的ID列表
     * @return ids
     */
    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public OrderAlert withIncidentId(String incidentId) {
        this.incidentId = incidentId;
        return this;
    }

    /**
     * 事件id
     * @return incidentId
     */
    public String getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    public OrderAlert withEventContent(OrderAlertEventContent eventContent) {
        this.eventContent = eventContent;
        return this;
    }

    public OrderAlert withEventContent(Consumer<OrderAlertEventContent> eventContentSetter) {
        if (this.eventContent == null) {
            this.eventContent = new OrderAlertEventContent();
            eventContentSetter.accept(this.eventContent);
        }

        return this;
    }

    /**
     * Get eventContent
     * @return eventContent
     */
    public OrderAlertEventContent getEventContent() {
        return eventContent;
    }

    public void setEventContent(OrderAlertEventContent eventContent) {
        this.eventContent = eventContent;
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

    public OrderAlert withMarkedEvidence(Boolean markedEvidence) {
        this.markedEvidence = markedEvidence;
        return this;
    }

    /**
     * 标记为证据
     * @return markedEvidence
     */
    public Boolean getMarkedEvidence() {
        return markedEvidence;
    }

    public void setMarkedEvidence(Boolean markedEvidence) {
        this.markedEvidence = markedEvidence;
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
        return Objects.equals(this.ids, that.ids) && Objects.equals(this.incidentId, that.incidentId)
            && Objects.equals(this.eventContent, that.eventContent)
            && Objects.equals(this.incidentContent, that.incidentContent)
            && Objects.equals(this.markedEvidence, that.markedEvidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids, incidentId, eventContent, incidentContent, markedEvidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderAlert {\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
        sb.append("    eventContent: ").append(toIndentedString(eventContent)).append("\n");
        sb.append("    incidentContent: ").append(toIndentedString(incidentContent)).append("\n");
        sb.append("    markedEvidence: ").append(toIndentedString(markedEvidence)).append("\n");
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
