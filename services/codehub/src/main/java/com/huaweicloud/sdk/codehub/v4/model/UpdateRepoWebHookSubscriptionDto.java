package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateRepoWebHookSubscriptionDto
 */
public class UpdateRepoWebHookSubscriptionDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    private String token;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mention_users")

    private String mentionUsers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mention_phone")

    private String mentionPhone;

    public UpdateRepoWebHookSubscriptionDto withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数解释：** webhook的url (需要base64编码)。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public UpdateRepoWebHookSubscriptionDto withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * **参数解释：** 密钥。
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public UpdateRepoWebHookSubscriptionDto withMentionUsers(String mentionUsers) {
        this.mentionUsers = mentionUsers;
        return this;
    }

    /**
     * **参数解释：** userid列表，提醒群中的指定成员（@某个成员），最长1000，每个最长100，“;”分隔符。
     * @return mentionUsers
     */
    public String getMentionUsers() {
        return mentionUsers;
    }

    public void setMentionUsers(String mentionUsers) {
        this.mentionUsers = mentionUsers;
    }

    public UpdateRepoWebHookSubscriptionDto withMentionPhone(String mentionPhone) {
        this.mentionPhone = mentionPhone;
        return this;
    }

    /**
     * **参数解释：** 手机号列表(需要base64编码)，提醒手机号对应的群成员（@某个成员），最长1000，每个最长30，“;”分隔符。
     * @return mentionPhone
     */
    public String getMentionPhone() {
        return mentionPhone;
    }

    public void setMentionPhone(String mentionPhone) {
        this.mentionPhone = mentionPhone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateRepoWebHookSubscriptionDto that = (UpdateRepoWebHookSubscriptionDto) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.token, that.token)
            && Objects.equals(this.mentionUsers, that.mentionUsers)
            && Objects.equals(this.mentionPhone, that.mentionPhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, token, mentionUsers, mentionPhone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRepoWebHookSubscriptionDto {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    mentionUsers: ").append(toIndentedString(mentionUsers)).append("\n");
        sb.append("    mentionPhone: ").append(toIndentedString(mentionPhone)).append("\n");
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
