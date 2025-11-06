package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateBranchNameResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_branch_name")

    private String oldBranchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_branch_commit_id")

    private String oldBranchCommitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_branch_name")

    private String newBranchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_branch_commit_id")

    private String newBranchCommitId;

    public UpdateBranchNameResponse withOldBranchName(String oldBranchName) {
        this.oldBranchName = oldBranchName;
        return this;
    }

    /**
     * **参数解释：** 旧分支名称。  **约束限制：** 不支持以 - . refs/heads/ refs/remotes/ 开头，不支持空格 [ \\ < ~ ^ : ? * ! ( ) ' \" | 等特殊字符，不支持以. / .lock结尾。  **取值范围：** 字符串长度不少于1，不超过200。 **默认取值：** 不涉及。
     * @return oldBranchName
     */
    public String getOldBranchName() {
        return oldBranchName;
    }

    public void setOldBranchName(String oldBranchName) {
        this.oldBranchName = oldBranchName;
    }

    public UpdateBranchNameResponse withOldBranchCommitId(String oldBranchCommitId) {
        this.oldBranchCommitId = oldBranchCommitId;
        return this;
    }

    /**
     * **参数解释：** 旧分支最新提交ID。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return oldBranchCommitId
     */
    public String getOldBranchCommitId() {
        return oldBranchCommitId;
    }

    public void setOldBranchCommitId(String oldBranchCommitId) {
        this.oldBranchCommitId = oldBranchCommitId;
    }

    public UpdateBranchNameResponse withNewBranchName(String newBranchName) {
        this.newBranchName = newBranchName;
        return this;
    }

    /**
     * **参数解释：** 新分支名称。  **约束限制：** 不支持以 - . refs/heads/ refs/remotes/ 开头，不支持空格 [ \\ < ~ ^ : ? * ! ( ) ' \" | 等特殊字符，不支持以. / .lock结尾。  **取值范围：** 字符串长度不少于1，不超过200。 **默认取值：** 不涉及。
     * @return newBranchName
     */
    public String getNewBranchName() {
        return newBranchName;
    }

    public void setNewBranchName(String newBranchName) {
        this.newBranchName = newBranchName;
    }

    public UpdateBranchNameResponse withNewBranchCommitId(String newBranchCommitId) {
        this.newBranchCommitId = newBranchCommitId;
        return this;
    }

    /**
     * **参数解释：** 新分支最新提交ID。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return newBranchCommitId
     */
    public String getNewBranchCommitId() {
        return newBranchCommitId;
    }

    public void setNewBranchCommitId(String newBranchCommitId) {
        this.newBranchCommitId = newBranchCommitId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateBranchNameResponse that = (UpdateBranchNameResponse) obj;
        return Objects.equals(this.oldBranchName, that.oldBranchName)
            && Objects.equals(this.oldBranchCommitId, that.oldBranchCommitId)
            && Objects.equals(this.newBranchName, that.newBranchName)
            && Objects.equals(this.newBranchCommitId, that.newBranchCommitId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oldBranchName, oldBranchCommitId, newBranchName, newBranchCommitId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBranchNameResponse {\n");
        sb.append("    oldBranchName: ").append(toIndentedString(oldBranchName)).append("\n");
        sb.append("    oldBranchCommitId: ").append(toIndentedString(oldBranchCommitId)).append("\n");
        sb.append("    newBranchName: ").append(toIndentedString(newBranchName)).append("\n");
        sb.append("    newBranchCommitId: ").append(toIndentedString(newBranchCommitId)).append("\n");
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
