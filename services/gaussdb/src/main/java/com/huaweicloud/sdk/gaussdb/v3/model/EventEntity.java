package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：  事件对象信息。
 */
public class EventEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_entity_id")

    private String eventEntityId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_entity_status")

    private String eventEntityStatus;

    public EventEntity withEventEntityId(String eventEntityId) {
        this.eventEntityId = eventEntityId;
        return this;
    }

    /**
     * **参数解释**：  事件对象ID。  **取值范围**：  实例ID或者节点ID。只能由英文字母、数字组成，后缀为in07或no07，长度为36个字符。
     * @return eventEntityId
     */
    public String getEventEntityId() {
        return eventEntityId;
    }

    public void setEventEntityId(String eventEntityId) {
        this.eventEntityId = eventEntityId;
    }

    public EventEntity withEventEntityStatus(String eventEntityStatus) {
        this.eventEntityStatus = eventEntityStatus;
        return this;
    }

    /**
     * **参数解释**：  事件对象的执行状态。  **取值范围**：    - inquiring：待授权。   - scheduled：待执行。   - executing：执行中。   - completed：执行完成。   - canceled：事件关闭。   - failed：执行失败。
     * @return eventEntityStatus
     */
    public String getEventEntityStatus() {
        return eventEntityStatus;
    }

    public void setEventEntityStatus(String eventEntityStatus) {
        this.eventEntityStatus = eventEntityStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventEntity that = (EventEntity) obj;
        return Objects.equals(this.eventEntityId, that.eventEntityId)
            && Objects.equals(this.eventEntityStatus, that.eventEntityStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventEntityId, eventEntityStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventEntity {\n");
        sb.append("    eventEntityId: ").append(toIndentedString(eventEntityId)).append("\n");
        sb.append("    eventEntityStatus: ").append(toIndentedString(eventEntityStatus)).append("\n");
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
