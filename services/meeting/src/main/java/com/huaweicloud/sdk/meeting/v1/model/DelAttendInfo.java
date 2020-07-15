package com.huaweicloud.sdk.meeting.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 待删除会场信息
 */
public class DelAttendInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="number")
    
    private String number;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="participantID")
    
    private String participantID;

    public DelAttendInfo withNumber(String number) {
        this.number = number;
        return this;
    }

    


    /**
     * 会场呼叫号码。
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public DelAttendInfo withParticipantID(String participantID) {
        this.participantID = participantID;
        return this;
    }

    


    /**
     * 与会者标识，已入会的必须填写该字段。
     * @return participantID
     */
    public String getParticipantID() {
        return participantID;
    }

    public void setParticipantID(String participantID) {
        this.participantID = participantID;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DelAttendInfo delAttendInfo = (DelAttendInfo) o;
        return Objects.equals(this.number, delAttendInfo.number) &&
            Objects.equals(this.participantID, delAttendInfo.participantID);
    }
    @Override
    public int hashCode() {
        return Objects.hash(number, participantID);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DelAttendInfo {\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    participantID: ").append(toIndentedString(participantID)).append("\n");
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

