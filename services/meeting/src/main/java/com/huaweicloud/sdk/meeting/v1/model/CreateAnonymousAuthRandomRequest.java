package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class CreateAnonymousAuthRandomRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conferenceID")

    private String conferenceID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Password")

    private String xPassword;

    public CreateAnonymousAuthRandomRequest withConferenceID(String conferenceID) {
        this.conferenceID = conferenceID;
        return this;
    }

    /**
     * 会议ID。
     * @return conferenceID
     */
    public String getConferenceID() {
        return conferenceID;
    }

    public void setConferenceID(String conferenceID) {
        this.conferenceID = conferenceID;
    }

    public CreateAnonymousAuthRandomRequest withXPassword(String xPassword) {
        this.xPassword = xPassword;
        return this;
    }

    /**
     * 会议密码。
     * @return xPassword
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Password")
    public String getXPassword() {
        return xPassword;
    }

    public void setXPassword(String xPassword) {
        this.xPassword = xPassword;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAnonymousAuthRandomRequest that = (CreateAnonymousAuthRandomRequest) obj;
        return Objects.equals(this.conferenceID, that.conferenceID) && Objects.equals(this.xPassword, that.xPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conferenceID, xPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAnonymousAuthRandomRequest {\n");
        sb.append("    conferenceID: ").append(toIndentedString(conferenceID)).append("\n");
        sb.append("    xPassword: ").append(toIndentedString(xPassword)).append("\n");
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
