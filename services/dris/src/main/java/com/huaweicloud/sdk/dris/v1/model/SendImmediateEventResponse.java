package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class SendImmediateEventResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_id")

    private String eventId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_config")

    private SendConfigResponse sendConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "immediate_event")

    private ImmediateEventResponseDTO immediateEvent;

    public SendImmediateEventResponse withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * **参数说明**：即时事件ID。
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public SendImmediateEventResponse withSendConfig(SendConfigResponse sendConfig) {
        this.sendConfig = sendConfig;
        return this;
    }

    public SendImmediateEventResponse withSendConfig(Consumer<SendConfigResponse> sendConfigSetter) {
        if (this.sendConfig == null) {
            this.sendConfig = new SendConfigResponse();
            sendConfigSetter.accept(this.sendConfig);
        }

        return this;
    }

    /**
     * Get sendConfig
     * @return sendConfig
     */
    public SendConfigResponse getSendConfig() {
        return sendConfig;
    }

    public void setSendConfig(SendConfigResponse sendConfig) {
        this.sendConfig = sendConfig;
    }

    public SendImmediateEventResponse withImmediateEvent(ImmediateEventResponseDTO immediateEvent) {
        this.immediateEvent = immediateEvent;
        return this;
    }

    public SendImmediateEventResponse withImmediateEvent(Consumer<ImmediateEventResponseDTO> immediateEventSetter) {
        if (this.immediateEvent == null) {
            this.immediateEvent = new ImmediateEventResponseDTO();
            immediateEventSetter.accept(this.immediateEvent);
        }

        return this;
    }

    /**
     * Get immediateEvent
     * @return immediateEvent
     */
    public ImmediateEventResponseDTO getImmediateEvent() {
        return immediateEvent;
    }

    public void setImmediateEvent(ImmediateEventResponseDTO immediateEvent) {
        this.immediateEvent = immediateEvent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SendImmediateEventResponse that = (SendImmediateEventResponse) obj;
        return Objects.equals(this.eventId, that.eventId) && Objects.equals(this.sendConfig, that.sendConfig)
            && Objects.equals(this.immediateEvent, that.immediateEvent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, sendConfig, immediateEvent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendImmediateEventResponse {\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    sendConfig: ").append(toIndentedString(sendConfig)).append("\n");
        sb.append("    immediateEvent: ").append(toIndentedString(immediateEvent)).append("\n");
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
