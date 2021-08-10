package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowRealTimeInfoOfMeetingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attendees")

    private List<RealTimeAttendee> attendees = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "participants")

    private List<RealTimeParticipant> participants = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confInfo")

    private RealTimeConfInfo confInfo;

    public ShowRealTimeInfoOfMeetingResponse withAttendees(List<RealTimeAttendee> attendees) {
        this.attendees = attendees;
        return this;
    }

    public ShowRealTimeInfoOfMeetingResponse addAttendeesItem(RealTimeAttendee attendeesItem) {
        if (this.attendees == null) {
            this.attendees = new ArrayList<>();
        }
        this.attendees.add(attendeesItem);
        return this;
    }

    public ShowRealTimeInfoOfMeetingResponse withAttendees(Consumer<List<RealTimeAttendee>> attendeesSetter) {
        if (this.attendees == null) {
            this.attendees = new ArrayList<>();
        }
        attendeesSetter.accept(this.attendees);
        return this;
    }

    /** 所有参加会议的与会者列表，包括未入会的以及在线的与会者信息。
     * 
     * @return attendees */
    public List<RealTimeAttendee> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<RealTimeAttendee> attendees) {
        this.attendees = attendees;
    }

    public ShowRealTimeInfoOfMeetingResponse withParticipants(List<RealTimeParticipant> participants) {
        this.participants = participants;
        return this;
    }

    public ShowRealTimeInfoOfMeetingResponse addParticipantsItem(RealTimeParticipant participantsItem) {
        if (this.participants == null) {
            this.participants = new ArrayList<>();
        }
        this.participants.add(participantsItem);
        return this;
    }

    public ShowRealTimeInfoOfMeetingResponse withParticipants(Consumer<List<RealTimeParticipant>> participantsSetter) {
        if (this.participants == null) {
            this.participants = new ArrayList<>();
        }
        participantsSetter.accept(this.participants);
        return this;
    }

    /** 在线会场列表，包括已进入会议、呼叫中、正在加入会议的与会者列表等。
     * 
     * @return participants */
    public List<RealTimeParticipant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<RealTimeParticipant> participants) {
        this.participants = participants;
    }

    public ShowRealTimeInfoOfMeetingResponse withConfInfo(RealTimeConfInfo confInfo) {
        this.confInfo = confInfo;
        return this;
    }

    public ShowRealTimeInfoOfMeetingResponse withConfInfo(Consumer<RealTimeConfInfo> confInfoSetter) {
        if (this.confInfo == null) {
            this.confInfo = new RealTimeConfInfo();
            confInfoSetter.accept(this.confInfo);
        }

        return this;
    }

    /** Get confInfo
     * 
     * @return confInfo */
    public RealTimeConfInfo getConfInfo() {
        return confInfo;
    }

    public void setConfInfo(RealTimeConfInfo confInfo) {
        this.confInfo = confInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowRealTimeInfoOfMeetingResponse showRealTimeInfoOfMeetingResponse = (ShowRealTimeInfoOfMeetingResponse) o;
        return Objects.equals(this.attendees, showRealTimeInfoOfMeetingResponse.attendees)
            && Objects.equals(this.participants, showRealTimeInfoOfMeetingResponse.participants)
            && Objects.equals(this.confInfo, showRealTimeInfoOfMeetingResponse.confInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attendees, participants, confInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRealTimeInfoOfMeetingResponse {\n");
        sb.append("    attendees: ").append(toIndentedString(attendees)).append("\n");
        sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
        sb.append("    confInfo: ").append(toIndentedString(confInfo)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
