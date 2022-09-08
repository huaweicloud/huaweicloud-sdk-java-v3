package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 重命名会场消息体。
 */
public class RestRenamePartReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "participantID")

    private String participantID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "newName")

    private String newName;

    public RestRenamePartReqBody withParticipantID(String participantID) {
        this.participantID = participantID;
        return this;
    }

    /**
     * 与会者标识。 已入会的必须填写该字段。
     * @return participantID
     */
    public String getParticipantID() {
        return participantID;
    }

    public void setParticipantID(String participantID) {
        this.participantID = participantID;
    }

    public RestRenamePartReqBody withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 与会者号码。
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public RestRenamePartReqBody withNewName(String newName) {
        this.newName = newName;
        return this;
    }

    /**
     * 新名字。
     * @return newName
     */
    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestRenamePartReqBody restRenamePartReqBody = (RestRenamePartReqBody) o;
        return Objects.equals(this.participantID, restRenamePartReqBody.participantID)
            && Objects.equals(this.number, restRenamePartReqBody.number)
            && Objects.equals(this.newName, restRenamePartReqBody.newName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(participantID, number, newName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestRenamePartReqBody {\n");
        sb.append("    participantID: ").append(toIndentedString(participantID)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
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
