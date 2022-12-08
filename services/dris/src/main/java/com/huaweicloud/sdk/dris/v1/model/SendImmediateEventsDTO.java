package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SendImmediateEventsDTO
 */
public class SendImmediateEventsDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_config")

    private SendConfig sendConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "immediate_event")

    private ImmediateEventDTO immediateEvent;

    public SendImmediateEventsDTO withSendConfig(SendConfig sendConfig) {
        this.sendConfig = sendConfig;
        return this;
    }

    public SendImmediateEventsDTO withSendConfig(Consumer<SendConfig> sendConfigSetter) {
        if (this.sendConfig == null) {
            this.sendConfig = new SendConfig();
            sendConfigSetter.accept(this.sendConfig);
        }

        return this;
    }

    /**
     * Get sendConfig
     * @return sendConfig
     */
    public SendConfig getSendConfig() {
        return sendConfig;
    }

    public void setSendConfig(SendConfig sendConfig) {
        this.sendConfig = sendConfig;
    }

    public SendImmediateEventsDTO withImmediateEvent(ImmediateEventDTO immediateEvent) {
        this.immediateEvent = immediateEvent;
        return this;
    }

    public SendImmediateEventsDTO withImmediateEvent(Consumer<ImmediateEventDTO> immediateEventSetter) {
        if (this.immediateEvent == null) {
            this.immediateEvent = new ImmediateEventDTO();
            immediateEventSetter.accept(this.immediateEvent);
        }

        return this;
    }

    /**
     * Get immediateEvent
     * @return immediateEvent
     */
    public ImmediateEventDTO getImmediateEvent() {
        return immediateEvent;
    }

    public void setImmediateEvent(ImmediateEventDTO immediateEvent) {
        this.immediateEvent = immediateEvent;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SendImmediateEventsDTO sendImmediateEventsDTO = (SendImmediateEventsDTO) o;
        return Objects.equals(this.sendConfig, sendImmediateEventsDTO.sendConfig)
            && Objects.equals(this.immediateEvent, sendImmediateEventsDTO.immediateEvent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sendConfig, immediateEvent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendImmediateEventsDTO {\n");
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
