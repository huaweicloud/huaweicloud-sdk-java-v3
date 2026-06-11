package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListEventCategoriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event-categories")

    private List<EventCategoriesResp> eventCategories = null;

    public ListEventCategoriesResponse withEventCategories(List<EventCategoriesResp> eventCategories) {
        this.eventCategories = eventCategories;
        return this;
    }

    public ListEventCategoriesResponse addEventCategoriesItem(EventCategoriesResp eventCategoriesItem) {
        if (this.eventCategories == null) {
            this.eventCategories = new ArrayList<>();
        }
        this.eventCategories.add(eventCategoriesItem);
        return this;
    }

    public ListEventCategoriesResponse withEventCategories(Consumer<List<EventCategoriesResp>> eventCategoriesSetter) {
        if (this.eventCategories == null) {
            this.eventCategories = new ArrayList<>();
        }
        eventCategoriesSetter.accept(this.eventCategories);
        return this;
    }

    /**
     * **参数解释**：事件类型。
     * @return eventCategories
     */
    public List<EventCategoriesResp> getEventCategories() {
        return eventCategories;
    }

    public void setEventCategories(List<EventCategoriesResp> eventCategories) {
        this.eventCategories = eventCategories;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEventCategoriesResponse that = (ListEventCategoriesResponse) obj;
        return Objects.equals(this.eventCategories, that.eventCategories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventCategories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEventCategoriesResponse {\n");
        sb.append("    eventCategories: ").append(toIndentedString(eventCategories)).append("\n");
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
