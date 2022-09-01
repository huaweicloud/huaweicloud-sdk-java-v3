package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * HandleNotificationInvitor
 */
public class HandleNotificationInvitor {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invitor_bcs_id")

    @JacksonXmlProperty(localName = "invitor_bcs_id")

    private String invitorBcsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invitor_bcs_name")

    @JacksonXmlProperty(localName = "invitor_bcs_name")

    private String invitorBcsName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invitor_project_id")

    @JacksonXmlProperty(localName = "invitor_project_id")

    private String invitorProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invitor_user_id")

    @JacksonXmlProperty(localName = "invitor_user_id")

    private String invitorUserId;

    public HandleNotificationInvitor withInvitorBcsId(String invitorBcsId) {
        this.invitorBcsId = invitorBcsId;
        return this;
    }

    /**
     * 邀请方BCS服务实例ID
     * @return invitorBcsId
     */
    public String getInvitorBcsId() {
        return invitorBcsId;
    }

    public void setInvitorBcsId(String invitorBcsId) {
        this.invitorBcsId = invitorBcsId;
    }

    public HandleNotificationInvitor withInvitorBcsName(String invitorBcsName) {
        this.invitorBcsName = invitorBcsName;
        return this;
    }

    /**
     * 邀请方BCS服务实例名称
     * @return invitorBcsName
     */
    public String getInvitorBcsName() {
        return invitorBcsName;
    }

    public void setInvitorBcsName(String invitorBcsName) {
        this.invitorBcsName = invitorBcsName;
    }

    public HandleNotificationInvitor withInvitorProjectId(String invitorProjectId) {
        this.invitorProjectId = invitorProjectId;
        return this;
    }

    /**
     * 邀请方project id
     * @return invitorProjectId
     */
    public String getInvitorProjectId() {
        return invitorProjectId;
    }

    public void setInvitorProjectId(String invitorProjectId) {
        this.invitorProjectId = invitorProjectId;
    }

    public HandleNotificationInvitor withInvitorUserId(String invitorUserId) {
        this.invitorUserId = invitorUserId;
        return this;
    }

    /**
     * 邀请方租户id。控制台->邀请方账号->我的凭证->API凭证->账号ID
     * @return invitorUserId
     */
    public String getInvitorUserId() {
        return invitorUserId;
    }

    public void setInvitorUserId(String invitorUserId) {
        this.invitorUserId = invitorUserId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HandleNotificationInvitor handleNotificationInvitor = (HandleNotificationInvitor) o;
        return Objects.equals(this.invitorBcsId, handleNotificationInvitor.invitorBcsId)
            && Objects.equals(this.invitorBcsName, handleNotificationInvitor.invitorBcsName)
            && Objects.equals(this.invitorProjectId, handleNotificationInvitor.invitorProjectId)
            && Objects.equals(this.invitorUserId, handleNotificationInvitor.invitorUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invitorBcsId, invitorBcsName, invitorProjectId, invitorUserId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HandleNotificationInvitor {\n");
        sb.append("    invitorBcsId: ").append(toIndentedString(invitorBcsId)).append("\n");
        sb.append("    invitorBcsName: ").append(toIndentedString(invitorBcsName)).append("\n");
        sb.append("    invitorProjectId: ").append(toIndentedString(invitorProjectId)).append("\n");
        sb.append("    invitorUserId: ").append(toIndentedString(invitorUserId)).append("\n");
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
