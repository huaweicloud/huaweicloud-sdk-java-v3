package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：Flink作业的状态。 
 */
public class FlinkJobStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private FlinkJobState state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state_message")

    private String stateMessage;

    public FlinkJobStatus withState(FlinkJobState state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    public FlinkJobState getState() {
        return state;
    }

    public void setState(FlinkJobState state) {
        this.state = state;
    }

    public FlinkJobStatus withStateMessage(String stateMessage) {
        this.stateMessage = stateMessage;
        return this;
    }

    /**
     * **参数解释**：状态消息详情，包含状态变更的补充说明或错误信息。 **取值范围**：0~1024个字符。 
     * @return stateMessage
     */
    public String getStateMessage() {
        return stateMessage;
    }

    public void setStateMessage(String stateMessage) {
        this.stateMessage = stateMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlinkJobStatus that = (FlinkJobStatus) obj;
        return Objects.equals(this.state, that.state) && Objects.equals(this.stateMessage, that.stateMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, stateMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlinkJobStatus {\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    stateMessage: ").append(toIndentedString(stateMessage)).append("\n");
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
