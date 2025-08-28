package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建交互助手对话请求。
 */
public class CreateInteractiveChatReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    private String roleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private LanguageEnum language;

    public CreateInteractiveChatReq withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * 角色ID。
     * @return roleId
     */
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public CreateInteractiveChatReq withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 问题
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CreateInteractiveChatReq withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * 当前对话的唯一标识，用于关联对话上下文内容。
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public CreateInteractiveChatReq withLanguage(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /**
     * Get language
     * @return language
     */
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateInteractiveChatReq that = (CreateInteractiveChatReq) obj;
        return Objects.equals(this.roleId, that.roleId) && Objects.equals(this.message, that.message)
            && Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.language, that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, message, sessionId, language);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInteractiveChatReq {\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
