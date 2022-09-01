package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 密码信息
 */
public class PasswordEntry {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conferenceRole")

    @JacksonXmlProperty(localName = "conferenceRole")

    private String conferenceRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    @JacksonXmlProperty(localName = "password")

    private String password;

    public PasswordEntry withConferenceRole(String conferenceRole) {
        this.conferenceRole = conferenceRole;
        return this;
    }

    /**
     * 会议角色。 - chair: 会议主持人。 - general: 普通与会者。
     * @return conferenceRole
     */
    public String getConferenceRole() {
        return conferenceRole;
    }

    public void setConferenceRole(String conferenceRole) {
        this.conferenceRole = conferenceRole;
    }

    public PasswordEntry withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 会议中角色的密码（明文）。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PasswordEntry passwordEntry = (PasswordEntry) o;
        return Objects.equals(this.conferenceRole, passwordEntry.conferenceRole)
            && Objects.equals(this.password, passwordEntry.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conferenceRole, password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PasswordEntry {\n");
        sb.append("    conferenceRole: ").append(toIndentedString(conferenceRole)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
