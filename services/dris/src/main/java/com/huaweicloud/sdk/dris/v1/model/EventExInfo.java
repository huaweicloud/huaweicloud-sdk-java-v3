package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 交通事件扩展信息
 */
public class EventExInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "participants")

    private List<EventParticipant> participants = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "congestion_info")

    private CongestionInfo congestionInfo;

    public EventExInfo withParticipants(List<EventParticipant> participants) {
        this.participants = participants;
        return this;
    }

    public EventExInfo addParticipantsItem(EventParticipant participantsItem) {
        if (this.participants == null) {
            this.participants = new ArrayList<>();
        }
        this.participants.add(participantsItem);
        return this;
    }

    public EventExInfo withParticipants(Consumer<List<EventParticipant>> participantsSetter) {
        if (this.participants == null) {
            this.participants = new ArrayList<>();
        }
        participantsSetter.accept(this.participants);
        return this;
    }

    /**
     * **参数说明**：识别出交通事件时所对应的交通参与者。
     * @return participants
     */
    public List<EventParticipant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<EventParticipant> participants) {
        this.participants = participants;
    }

    public EventExInfo withCongestionInfo(CongestionInfo congestionInfo) {
        this.congestionInfo = congestionInfo;
        return this;
    }

    public EventExInfo withCongestionInfo(Consumer<CongestionInfo> congestionInfoSetter) {
        if (this.congestionInfo == null) {
            this.congestionInfo = new CongestionInfo();
            congestionInfoSetter.accept(this.congestionInfo);
        }

        return this;
    }

    /**
     * Get congestionInfo
     * @return congestionInfo
     */
    public CongestionInfo getCongestionInfo() {
        return congestionInfo;
    }

    public void setCongestionInfo(CongestionInfo congestionInfo) {
        this.congestionInfo = congestionInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventExInfo eventExInfo = (EventExInfo) o;
        return Objects.equals(this.participants, eventExInfo.participants)
            && Objects.equals(this.congestionInfo, eventExInfo.congestionInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(participants, congestionInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventExInfo {\n");
        sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
        sb.append("    congestionInfo: ").append(toIndentedString(congestionInfo)).append("\n");
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
