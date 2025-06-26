package com.huaweicloud.sdk.dws.v2.model;

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
public class ListEventSpecsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_specs")

    private List<EventSpecResponse> eventSpecs = null;

    public ListEventSpecsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 事件配置总数。 **取值范围**： 大于等于0。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListEventSpecsResponse withEventSpecs(List<EventSpecResponse> eventSpecs) {
        this.eventSpecs = eventSpecs;
        return this;
    }

    public ListEventSpecsResponse addEventSpecsItem(EventSpecResponse eventSpecsItem) {
        if (this.eventSpecs == null) {
            this.eventSpecs = new ArrayList<>();
        }
        this.eventSpecs.add(eventSpecsItem);
        return this;
    }

    public ListEventSpecsResponse withEventSpecs(Consumer<List<EventSpecResponse>> eventSpecsSetter) {
        if (this.eventSpecs == null) {
            this.eventSpecs = new ArrayList<>();
        }
        eventSpecsSetter.accept(this.eventSpecs);
        return this;
    }

    /**
     * **参数解释**： 事件配置列表。 **取值范围**： 不涉及。
     * @return eventSpecs
     */
    public List<EventSpecResponse> getEventSpecs() {
        return eventSpecs;
    }

    public void setEventSpecs(List<EventSpecResponse> eventSpecs) {
        this.eventSpecs = eventSpecs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEventSpecsResponse that = (ListEventSpecsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.eventSpecs, that.eventSpecs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, eventSpecs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEventSpecsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    eventSpecs: ").append(toIndentedString(eventSpecs)).append("\n");
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
