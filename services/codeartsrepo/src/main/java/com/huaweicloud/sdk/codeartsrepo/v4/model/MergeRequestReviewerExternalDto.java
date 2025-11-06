package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MergeRequestReviewerExternalDto
 */
public class MergeRequestReviewerExternalDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private Boolean state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Integer score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_name")

    private String tenantName;

    public MergeRequestReviewerExternalDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 评审人id
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

    public MergeRequestReviewerExternalDto withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * 评审人名称
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public MergeRequestReviewerExternalDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 评审人名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MergeRequestReviewerExternalDto withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * 评审人昵称
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public MergeRequestReviewerExternalDto withState(Boolean state) {
        this.state = state;
        return this;
    }

    /**
     * 评审人状态
     * @return state
     */
    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public MergeRequestReviewerExternalDto withScore(Integer score) {
        this.score = score;
        return this;
    }

    /**
     * 打分
     * minimum: -2
     * maximum: 2
     * @return score
     */
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public MergeRequestReviewerExternalDto withTenantName(String tenantName) {
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
        MergeRequestReviewerExternalDto that = (MergeRequestReviewerExternalDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.username, that.username)
            && Objects.equals(this.name, that.name) && Objects.equals(this.nickName, that.nickName)
            && Objects.equals(this.state, that.state) && Objects.equals(this.score, that.score)
            && Objects.equals(this.tenantName, that.tenantName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, name, nickName, state, score, tenantName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeRequestReviewerExternalDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
