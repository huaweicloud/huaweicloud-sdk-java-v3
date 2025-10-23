package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 工作项关联的提交信息
 */
public class ItemCommitDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private Integer result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_id")

    private String itemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private String repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_name")

    private String branchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_id")

    private String commitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_short_id")

    private String commitShortId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_msg")

    private String commitMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_url")

    private String commitUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_id")

    private String iamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private String createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private String updateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_url")

    private String itemUrl;

    public ItemCommitDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 关联Id。 **取值范围：** 不涉及
     * minimum: 0
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ItemCommitDto withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * **参数解释：** 合并请求标题。 **取值范围：** 不涉及。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ItemCommitDto withResult(Integer result) {
        this.result = result;
        return this;
    }

    /**
     * **参数解释：** 仓库状态。 **取值范围：** - 1，关联成功。 - 2，关联失败。 - 3，流转成功。
     * minimum: 0
     * maximum: 10
     * @return result
     */
    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public ItemCommitDto withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 关联提交类型。 **取值范围：** - commit，提交。 - branch，分支。 - mergerequest，合并请求。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ItemCommitDto withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释：** 关联失败的失败原因。 **取值范围：** 不涉及。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ItemCommitDto withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * **参数解释：** 工作项Id。 **取值范围：** 不涉及。
     * @return itemId
     */
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public ItemCommitDto withRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释：** 仓库Id。 **取值范围：** 不涉及。
     * @return repositoryId
     */
    public String getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    public ItemCommitDto withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * **参数解释：** 分支名。 **取值范围：** 不涉及。
     * @return branchName
     */
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public ItemCommitDto withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释：** 用户名。 **取值范围：** 不涉及。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ItemCommitDto withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * **参数解释：** 提交Id。 **取值范围：** 不涉及。
     * @return commitId
     */
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public ItemCommitDto withCommitShortId(String commitShortId) {
        this.commitShortId = commitShortId;
        return this;
    }

    /**
     * **参数解释：** 提交短Id。 **取值范围：** 不涉及。
     * @return commitShortId
     */
    public String getCommitShortId() {
        return commitShortId;
    }

    public void setCommitShortId(String commitShortId) {
        this.commitShortId = commitShortId;
    }

    public ItemCommitDto withCommitMsg(String commitMsg) {
        this.commitMsg = commitMsg;
        return this;
    }

    /**
     * **参数解释：** 提交信息。 **取值范围：** 不涉及。            
     * @return commitMsg
     */
    public String getCommitMsg() {
        return commitMsg;
    }

    public void setCommitMsg(String commitMsg) {
        this.commitMsg = commitMsg;
    }

    public ItemCommitDto withCommitUrl(String commitUrl) {
        this.commitUrl = commitUrl;
        return this;
    }

    /**
     * **参数解释：** 提交访问地址。 **取值范围：** 不涉及。
     * @return commitUrl
     */
    public String getCommitUrl() {
        return commitUrl;
    }

    public void setCommitUrl(String commitUrl) {
        this.commitUrl = commitUrl;
    }

    public ItemCommitDto withIamId(String iamId) {
        this.iamId = iamId;
        return this;
    }

    /**
     * **参数解释：** iamId。 **取值范围：** 不涉及。
     * @return iamId
     */
    public String getIamId() {
        return iamId;
    }

    public void setIamId(String iamId) {
        this.iamId = iamId;
    }

    public ItemCommitDto withCreateAt(String createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间。 **取值范围：** 不涉及。
     * @return createAt
     */
    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public ItemCommitDto withUpdateAt(String updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * **参数解释：** 更新时间。 **取值范围：** 不涉及。  
     * @return updateAt
     */
    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public ItemCommitDto withItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
        return this;
    }

    /**
     * **参数解释：** 工作项访问地址。 **取值范围：** 不涉及。
     * @return itemUrl
     */
    public String getItemUrl() {
        return itemUrl;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ItemCommitDto that = (ItemCommitDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.title, that.title)
            && Objects.equals(this.result, that.result) && Objects.equals(this.type, that.type)
            && Objects.equals(this.message, that.message) && Objects.equals(this.itemId, that.itemId)
            && Objects.equals(this.repositoryId, that.repositoryId) && Objects.equals(this.branchName, that.branchName)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.commitId, that.commitId)
            && Objects.equals(this.commitShortId, that.commitShortId) && Objects.equals(this.commitMsg, that.commitMsg)
            && Objects.equals(this.commitUrl, that.commitUrl) && Objects.equals(this.iamId, that.iamId)
            && Objects.equals(this.createAt, that.createAt) && Objects.equals(this.updateAt, that.updateAt)
            && Objects.equals(this.itemUrl, that.itemUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            title,
            result,
            type,
            message,
            itemId,
            repositoryId,
            branchName,
            userName,
            commitId,
            commitShortId,
            commitMsg,
            commitUrl,
            iamId,
            createAt,
            updateAt,
            itemUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemCommitDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    commitShortId: ").append(toIndentedString(commitShortId)).append("\n");
        sb.append("    commitMsg: ").append(toIndentedString(commitMsg)).append("\n");
        sb.append("    commitUrl: ").append(toIndentedString(commitUrl)).append("\n");
        sb.append("    iamId: ").append(toIndentedString(iamId)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    itemUrl: ").append(toIndentedString(itemUrl)).append("\n");
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
