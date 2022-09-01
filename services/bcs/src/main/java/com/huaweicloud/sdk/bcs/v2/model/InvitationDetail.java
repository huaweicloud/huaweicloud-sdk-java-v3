package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 被邀请列表
 */
public class InvitationDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invited_user")

    @JacksonXmlProperty(localName = "invited_user")

    private String invitedUser;

    /**
     * 邀请状态，可选：已退出（quit），等待中（waiting），已拒绝（reject），已解散（released），其他状态不允许删除
     */
    public static final class StatusEnum {

        /**
         * Enum QUIT for value: "quit"
         */
        public static final StatusEnum QUIT = new StatusEnum("quit");

        /**
         * Enum WAITING for value: "waiting"
         */
        public static final StatusEnum WAITING = new StatusEnum("waiting");

        /**
         * Enum REJECT for value: "reject"
         */
        public static final StatusEnum REJECT = new StatusEnum("reject");

        /**
         * Enum RELEASED for value: "released"
         */
        public static final StatusEnum RELEASED = new StatusEnum("released");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("quit", QUIT);
            map.put("waiting", WAITING);
            map.put("reject", REJECT);
            map.put("released", RELEASED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invited_bcs_id")

    @JacksonXmlProperty(localName = "invited_bcs_id")

    private String invitedBcsId;

    public InvitationDetail withInvitedUser(String invitedUser) {
        this.invitedUser = invitedUser;
        return this;
    }

    /**
     * 被邀请方租户名，IAM用户名
     * @return invitedUser
     */
    public String getInvitedUser() {
        return invitedUser;
    }

    public void setInvitedUser(String invitedUser) {
        this.invitedUser = invitedUser;
    }

    public InvitationDetail withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 邀请状态，可选：已退出（quit），等待中（waiting），已拒绝（reject），已解散（released），其他状态不允许删除
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public InvitationDetail withInvitedBcsId(String invitedBcsId) {
        this.invitedBcsId = invitedBcsId;
        return this;
    }

    /**
     * 被邀请方bcs服务实例id
     * @return invitedBcsId
     */
    public String getInvitedBcsId() {
        return invitedBcsId;
    }

    public void setInvitedBcsId(String invitedBcsId) {
        this.invitedBcsId = invitedBcsId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InvitationDetail invitationDetail = (InvitationDetail) o;
        return Objects.equals(this.invitedUser, invitationDetail.invitedUser)
            && Objects.equals(this.status, invitationDetail.status)
            && Objects.equals(this.invitedBcsId, invitationDetail.invitedBcsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invitedUser, status, invitedBcsId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvitationDetail {\n");
        sb.append("    invitedUser: ").append(toIndentedString(invitedUser)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    invitedBcsId: ").append(toIndentedString(invitedBcsId)).append("\n");
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
