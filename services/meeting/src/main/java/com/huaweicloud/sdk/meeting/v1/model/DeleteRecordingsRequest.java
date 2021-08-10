package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class DeleteRecordingsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confUUIDs")

    private String confUUIDs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userUUID")

    private String userUUID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Authorization-Type")

    private String xAuthorizationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Site-Id")

    private String xSiteId;

    public DeleteRecordingsRequest withConfUUIDs(String confUUIDs) {
        this.confUUIDs = confUUIDs;
        return this;
    }

    /** 会议UUID列表，多个会议UUID之间以英文逗号隔开。
     * 
     * @return confUUIDs */
    public String getConfUUIDs() {
        return confUUIDs;
    }

    public void setConfUUIDs(String confUUIDs) {
        this.confUUIDs = confUUIDs;
    }

    public DeleteRecordingsRequest withUserUUID(String userUUID) {
        this.userUUID = userUUID;
        return this;
    }

    /** 用户的UUID（已在USG注册过的）。
     * 
     * @return userUUID */
    public String getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(String userUUID) {
        this.userUUID = userUUID;
    }

    public DeleteRecordingsRequest withXAuthorizationType(String xAuthorizationType) {
        this.xAuthorizationType = xAuthorizationType;
        return this;
    }

    /** 标识是否为第三方portal过来的请求。
     * 
     * @return xAuthorizationType */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Authorization-Type")
    public String getXAuthorizationType() {
        return xAuthorizationType;
    }

    public void setXAuthorizationType(String xAuthorizationType) {
        this.xAuthorizationType = xAuthorizationType;
    }

    public DeleteRecordingsRequest withXSiteId(String xSiteId) {
        this.xSiteId = xSiteId;
        return this;
    }

    /** 用于区分到哪个HCSO站点鉴权。
     * 
     * @return xSiteId */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Site-Id")
    public String getXSiteId() {
        return xSiteId;
    }

    public void setXSiteId(String xSiteId) {
        this.xSiteId = xSiteId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteRecordingsRequest deleteRecordingsRequest = (DeleteRecordingsRequest) o;
        return Objects.equals(this.confUUIDs, deleteRecordingsRequest.confUUIDs)
            && Objects.equals(this.userUUID, deleteRecordingsRequest.userUUID)
            && Objects.equals(this.xAuthorizationType, deleteRecordingsRequest.xAuthorizationType)
            && Objects.equals(this.xSiteId, deleteRecordingsRequest.xSiteId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(confUUIDs, userUUID, xAuthorizationType, xSiteId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteRecordingsRequest {\n");
        sb.append("    confUUIDs: ").append(toIndentedString(confUUIDs)).append("\n");
        sb.append("    userUUID: ").append(toIndentedString(userUUID)).append("\n");
        sb.append("    xAuthorizationType: ").append(toIndentedString(xAuthorizationType)).append("\n");
        sb.append("    xSiteId: ").append(toIndentedString(xSiteId)).append("\n");
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
