package com.huaweicloud.sdk.ief.v1.model;

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
public class ListSystemEventsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "systemevents")

    private List<Event> systemevents = null;

    public ListSystemEventsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 数目
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListSystemEventsResponse withSystemevents(List<Event> systemevents) {
        this.systemevents = systemevents;
        return this;
    }

    public ListSystemEventsResponse addSystemeventsItem(Event systemeventsItem) {
        if (this.systemevents == null) {
            this.systemevents = new ArrayList<>();
        }
        this.systemevents.add(systemeventsItem);
        return this;
    }

    public ListSystemEventsResponse withSystemevents(Consumer<List<Event>> systemeventsSetter) {
        if (this.systemevents == null) {
            this.systemevents = new ArrayList<>();
        }
        systemeventsSetter.accept(this.systemevents);
        return this;
    }

    /**
     * 系统订阅详情列表
     * @return systemevents
     */
    public List<Event> getSystemevents() {
        return systemevents;
    }

    public void setSystemevents(List<Event> systemevents) {
        this.systemevents = systemevents;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSystemEventsResponse that = (ListSystemEventsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.systemevents, that.systemevents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, systemevents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSystemEventsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    systemevents: ").append(toIndentedString(systemevents)).append("\n");
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
