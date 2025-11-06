package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UserBasicExternalDto
 */
public class UserBasicExternalDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avatar_url")

    private String avatarUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_url")

    private String webUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_name")

    private String tenantName;

    public UserBasicExternalDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 用户id
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserBasicExternalDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserBasicExternalDto withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * 用户名称
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserBasicExternalDto withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public UserBasicExternalDto withAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    /**
     * 头像url
     * @return avatarUrl
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public UserBasicExternalDto withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    /**
     * 主页url
     * @return webUrl
     */
    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public UserBasicExternalDto withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * 用户昵称
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public UserBasicExternalDto withTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }

    /**
     * 租户名称
     * @return tenantName
     */
    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserBasicExternalDto that = (UserBasicExternalDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.username, that.username) && Objects.equals(this.state, that.state)
            && Objects.equals(this.avatarUrl, that.avatarUrl) && Objects.equals(this.webUrl, that.webUrl)
            && Objects.equals(this.nickName, that.nickName) && Objects.equals(this.tenantName, that.tenantName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, username, state, avatarUrl, webUrl, nickName, tenantName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserBasicExternalDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
        sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
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
