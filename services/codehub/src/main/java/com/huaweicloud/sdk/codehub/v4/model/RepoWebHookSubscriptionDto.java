package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RepoWebHookSubscriptionDto
 */
public class RepoWebHookSubscriptionDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mention_users")

    private String mentionUsers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mention_phone")

    private String mentionPhone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_token")

    private Boolean hasToken;

    public RepoWebHookSubscriptionDto withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数解释：** webhook的url。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public RepoWebHookSubscriptionDto withMentionUsers(String mentionUsers) {
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

    public RepoWebHookSubscriptionDto withMentionPhone(String mentionPhone) {
        this.mentionPhone = mentionPhone;
        return this;
    }

    /**
     * **参数解释：** 手机号列表，提醒手机号对应的群成员（@某个成员），最长1000，每个最长30，“;”分隔符。
     * @return mentionPhone
     */
    public String getMentionPhone() {
        return mentionPhone;
    }

    public void setMentionPhone(String mentionPhone) {
        this.mentionPhone = mentionPhone;
    }

    public RepoWebHookSubscriptionDto withHasToken(Boolean hasToken) {
        this.hasToken = hasToken;
        return this;
    }

    /**
     * **参数解释：** 是否设置了token。
     * @return hasToken
     */
    public Boolean getHasToken() {
        return hasToken;
    }

    public void setHasToken(Boolean hasToken) {
        this.hasToken = hasToken;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepoWebHookSubscriptionDto that = (RepoWebHookSubscriptionDto) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.mentionUsers, that.mentionUsers)
            && Objects.equals(this.mentionPhone, that.mentionPhone) && Objects.equals(this.hasToken, that.hasToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, mentionUsers, mentionPhone, hasToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepoWebHookSubscriptionDto {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    mentionUsers: ").append(toIndentedString(mentionUsers)).append("\n");
        sb.append("    mentionPhone: ").append(toIndentedString(mentionPhone)).append("\n");
        sb.append("    hasToken: ").append(toIndentedString(hasToken)).append("\n");
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
