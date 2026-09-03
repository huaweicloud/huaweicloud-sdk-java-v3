package com.huaweicloud.sdk.das.v3.model;

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
public class SearchBinlogParseResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_list")

    private List<EventRowsVo> eventList = null;

    public SearchBinlogParseResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public SearchBinlogParseResponse withEventList(List<EventRowsVo> eventList) {
        this.eventList = eventList;
        return this;
    }

    public SearchBinlogParseResponse addEventListItem(EventRowsVo eventListItem) {
        if (this.eventList == null) {
            this.eventList = new ArrayList<>();
        }
        this.eventList.add(eventListItem);
        return this;
    }

    public SearchBinlogParseResponse withEventList(Consumer<List<EventRowsVo>> eventListSetter) {
        if (this.eventList == null) {
            this.eventList = new ArrayList<>();
        }
        eventListSetter.accept(this.eventList);
        return this;
    }

    /**
     * binlog详情信息列表
     * @return eventList
     */
    public List<EventRowsVo> getEventList() {
        return eventList;
    }

    public void setEventList(List<EventRowsVo> eventList) {
        this.eventList = eventList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchBinlogParseResponse that = (SearchBinlogParseResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.eventList, that.eventList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, eventList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchBinlogParseResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    eventList: ").append(toIndentedString(eventList)).append("\n");
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
