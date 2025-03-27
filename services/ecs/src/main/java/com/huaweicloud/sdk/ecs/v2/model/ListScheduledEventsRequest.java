package com.huaweicloud.sdk.ecs.v2.model;

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
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private List<String> instanceId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private List<String> type = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private List<String> state = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_since")

    private String publishSince;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_until")

    private String publishUntil;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListScheduledEventsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 从marker指定的事件的下一条数据开始查询。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListScheduledEventsRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 事件ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListScheduledEventsRequest withInstanceId(List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public ListScheduledEventsRequest addInstanceIdItem(String instanceIdItem) {
        if (this.instanceId == null) {
            this.instanceId = new ArrayList<>();
        }
        this.instanceId.add(instanceIdItem);
        return this;
    }

    public ListScheduledEventsRequest withInstanceId(Consumer<List<String>> instanceIdSetter) {
        if (this.instanceId == null) {
            this.instanceId = new ArrayList<>();
        }
        instanceIdSetter.accept(this.instanceId);
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public List<String> getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(List<String> instanceId) {
        this.instanceId = instanceId;
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
     * 事件类型
     * @return type
     */
    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
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
     * 事件状态
     * @return state
     */
    public List<String> getState() {
        return state;
    }

    public void setState(List<String> state) {
        this.state = state;
    }

    public ListScheduledEventsRequest withPublishSince(String publishSince) {
        this.publishSince = publishSince;
        return this;
    }

    /**
     * 事件发布开始时间
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
     * 事件发布截至时间
     * @return publishUntil
     */
    public String getPublishUntil() {
        return publishUntil;
    }

    public void setPublishUntil(String publishUntil) {
        this.publishUntil = publishUntil;
    }

    public ListScheduledEventsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
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
        return Objects.equals(this.marker, that.marker) && Objects.equals(this.id, that.id)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.state, that.state) && Objects.equals(this.publishSince, that.publishSince)
            && Objects.equals(this.publishUntil, that.publishUntil) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marker, id, instanceId, type, state, publishSince, publishUntil, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScheduledEventsRequest {\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    publishSince: ").append(toIndentedString(publishSince)).append("\n");
        sb.append("    publishUntil: ").append(toIndentedString(publishUntil)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
