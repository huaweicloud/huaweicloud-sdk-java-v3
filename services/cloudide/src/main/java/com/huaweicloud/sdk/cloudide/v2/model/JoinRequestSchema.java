package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * the request body of join-request
 */
public class JoinRequestSchema {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization")

    private String organization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_number")

    private String phoneNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invitation_code")

    private String invitationCode;

    public JoinRequestSchema withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * the region of user
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public JoinRequestSchema withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * the name of user
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JoinRequestSchema withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * the email of user
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public JoinRequestSchema withOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * the organization of user
     * @return organization
     */
    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public JoinRequestSchema withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * the phone_number of user
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public JoinRequestSchema withInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
        return this;
    }

    /**
     * the invitation_code
     * @return invitationCode
     */
    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JoinRequestSchema joinRequestSchema = (JoinRequestSchema) o;
        return Objects.equals(this.region, joinRequestSchema.region)
            && Objects.equals(this.name, joinRequestSchema.name) && Objects.equals(this.email, joinRequestSchema.email)
            && Objects.equals(this.organization, joinRequestSchema.organization)
            && Objects.equals(this.phoneNumber, joinRequestSchema.phoneNumber)
            && Objects.equals(this.invitationCode, joinRequestSchema.invitationCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region, name, email, organization, phoneNumber, invitationCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JoinRequestSchema {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
        sb.append("    invitationCode: ").append(toIndentedString(invitationCode)).append("\n");
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
