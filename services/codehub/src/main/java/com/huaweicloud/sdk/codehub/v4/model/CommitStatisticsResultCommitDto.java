package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CommitStatisticsResultCommitDto
 */
public class CommitStatisticsResultCommitDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_name")

    private String authorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_name")

    private String tenantName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_merge")

    private Boolean isMerge;

    public CommitStatisticsResultCommitDto withAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    /**
     * **参数解释：** 作者名称。
     * @return authorName
     */
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public CommitStatisticsResultCommitDto withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * **参数解释：** 提交日期。
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public CommitStatisticsResultCommitDto withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * **参数解释：** 昵称。
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public CommitStatisticsResultCommitDto withTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }

    /**
     * **参数解释：** 租户名。
     * @return tenantName
     */
    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public CommitStatisticsResultCommitDto withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释：** 用户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public CommitStatisticsResultCommitDto withIsMerge(Boolean isMerge) {
        this.isMerge = isMerge;
        return this;
    }

    /**
     * **参数解释：** 是否通过merge合入。 **取值范围：** - true，通过merge合入。 - false，非通过merge合入。
     * @return isMerge
     */
    public Boolean getIsMerge() {
        return isMerge;
    }

    public void setIsMerge(Boolean isMerge) {
        this.isMerge = isMerge;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommitStatisticsResultCommitDto that = (CommitStatisticsResultCommitDto) obj;
        return Objects.equals(this.authorName, that.authorName) && Objects.equals(this.date, that.date)
            && Objects.equals(this.nickName, that.nickName) && Objects.equals(this.tenantName, that.tenantName)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.isMerge, that.isMerge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, date, nickName, tenantName, userName, isMerge);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommitStatisticsResultCommitDto {\n");
        sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    isMerge: ").append(toIndentedString(isMerge)).append("\n");
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
