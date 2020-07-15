package com.huaweicloud.sdk.meeting.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.meeting.v1.model.Attendee;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 邀请会场请求消息体。
 */
public class RestInviteReqBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="attendees")
    
    private List<Attendee> attendees = new ArrayList<>();
    
    public RestInviteReqBody withAttendees(List<Attendee> attendees) {
        this.attendees = attendees;
        return this;
    }

    
    public RestInviteReqBody addAttendeesItem(Attendee attendeesItem) {
        this.attendees.add(attendeesItem);
        return this;
    }

    public RestInviteReqBody withAttendees(Consumer<List<Attendee>> attendeesSetter) {
        if(this.attendees == null ){
            this.attendees = new ArrayList<>();
        }
        attendeesSetter.accept(this.attendees);
        return this;
    }

    /**
     * 邀请的与会者列表。
     * @return attendees
     */
    public List<Attendee> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<Attendee> attendees) {
        this.attendees = attendees;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestInviteReqBody restInviteReqBody = (RestInviteReqBody) o;
        return Objects.equals(this.attendees, restInviteReqBody.attendees);
    }
    @Override
    public int hashCode() {
        return Objects.hash(attendees);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestInviteReqBody {\n");
        sb.append("    attendees: ").append(toIndentedString(attendees)).append("\n");
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

