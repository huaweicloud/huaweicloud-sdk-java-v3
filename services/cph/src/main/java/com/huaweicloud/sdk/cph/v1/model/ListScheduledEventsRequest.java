package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListScheduledEventsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_id")

    private String eventId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_since")

    private String publishSince;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_until")

    private String publishUntil;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private List<String> state = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private List<String> type = null;

    public ListScheduledEventsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页返回的事件个数。取值范围：1~100（默认值为10）
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListScheduledEventsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页标记。从marker指定的下一条数据开始查询。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListScheduledEventsRequest withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * 计划事件id。
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public ListScheduledEventsRequest withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 云手机服务器的唯一标识。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public ListScheduledEventsRequest withPublishSince(String publishSince) {
        this.publishSince = publishSince;
        return this;
    }

    /**
     * 事件发布开始时间，按照时间范围过滤。
     * @return publishSince
     */
    public String getPublishSince() {
        return publishSince;
    }

    public void setPublishSince(String publishSince) {
        this.publishSince = publishSince;
    }

    public ListScheduledEventsRequest withPublishUntil(String publishUntil) {
        this.publishUntil = publishUntil;
        return this;
    }

    /**
     * 事件发布结束时间，按照时间范围过滤。
     * @return publishUntil
     */
    public String getPublishUntil() {
        return publishUntil;
    }

    public void setPublishUntil(String publishUntil) {
        this.publishUntil = publishUntil;
    }

    public ListScheduledEventsRequest withState(List<String> state) {
        this.state = state;
        return this;
    }

    public ListScheduledEventsRequest addStateItem(String stateItem) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(stateItem);
        return this;
    }

    public ListScheduledEventsRequest withState(Consumer<List<String>> stateSetter) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        stateSetter.accept(this.state);
        return this;
    }

    /**
     * 计划事件状态。支持多值查询过滤。 取值范围： inquiring: 待授权、 scheduled：待执行、 executing：执行中、 completed：执行成功、 failed：执行失败、 canceled：取消
     * @return state
     */
    public List<String> getState() {
        return state;
    }

    public void setState(List<String> state) {
        this.state = state;
    }

    public ListScheduledEventsRequest withType(List<String> type) {
        this.type = type;
        return this;
    }

    public ListScheduledEventsRequest addTypeItem(String typeItem) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        this.type.add(typeItem);
        return this;
    }

    public ListScheduledEventsRequest withType(Consumer<List<String>> typeSetter) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        typeSetter.accept(this.type);
        return this;
    }

    /**
     * 计划事件类型。支持多值查询过滤。取值范围： localdisk-recovery：本地盘换盘、 system-maintenance：系统维护
     * @return type
     */
    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListScheduledEventsRequest that = (ListScheduledEventsRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.eventId, that.eventId) && Objects.equals(this.serverId, that.serverId)
            && Objects.equals(this.publishSince, that.publishSince)
            && Objects.equals(this.publishUntil, that.publishUntil) && Objects.equals(this.state, that.state)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, eventId, serverId, publishSince, publishUntil, state, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScheduledEventsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    publishSince: ").append(toIndentedString(publishSince)).append("\n");
        sb.append("    publishUntil: ").append(toIndentedString(publishUntil)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
