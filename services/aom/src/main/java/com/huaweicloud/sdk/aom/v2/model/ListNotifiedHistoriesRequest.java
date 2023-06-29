package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListNotifiedHistoriesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_sn")

    private String eventSn;

    public ListNotifiedHistoriesRequest withEventSn(String eventSn) {
        this.eventSn = eventSn;
        return this;
    }

    /**
     * 告警流水号
     * @return eventSn
     */
    public String getEventSn() {
        return eventSn;
    }

    public void setEventSn(String eventSn) {
        this.eventSn = eventSn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNotifiedHistoriesRequest that = (ListNotifiedHistoriesRequest) obj;
        return Objects.equals(this.eventSn, that.eventSn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventSn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNotifiedHistoriesRequest {\n");
        sb.append("    eventSn: ").append(toIndentedString(eventSn)).append("\n");
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
