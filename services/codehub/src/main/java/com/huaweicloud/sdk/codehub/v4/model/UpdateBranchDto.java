package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateBranchDto
 */
public class UpdateBranchDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_branch")

    private String newBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_branch")

    private String oldBranch;

    public UpdateBranchDto withNewBranch(String newBranch) {
        this.newBranch = newBranch;
        return this;
    }

    /**
     * **参数解释：** 新分支名称。  **约束限制：** 不支持以 - . refs/heads/ refs/remotes/ 开头，不支持空格 [ \\ < ~ ^ : ? * ! ( ) ' \" | 等特殊字符，不支持以. / .lock结尾。  **取值范围：** 字符串长度不少于1，不超过200。 **默认取值：** 不涉及。
     * @return newBranch
     */
    public String getNewBranch() {
        return newBranch;
    }

    public void setNewBranch(String newBranch) {
        this.newBranch = newBranch;
    }

    public UpdateBranchDto withOldBranch(String oldBranch) {
        this.oldBranch = oldBranch;
        return this;
    }

    /**
     * **参数解释：** 基于分支名称。  **约束限制：** 不支持以 - . refs/heads/ refs/remotes/ 开头，不支持空格 [ \\ < ~ ^ : ? * ! ( ) ' \" | 等特殊字符，不支持以. / .lock结尾。  **取值范围：** 字符串长度不少于1，不超过200。 **默认取值：** 不涉及。
     * @return oldBranch
     */
    public String getOldBranch() {
        return oldBranch;
    }

    public void setOldBranch(String oldBranch) {
        this.oldBranch = oldBranch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateBranchDto that = (UpdateBranchDto) obj;
        return Objects.equals(this.newBranch, that.newBranch) && Objects.equals(this.oldBranch, that.oldBranch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newBranch, oldBranch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBranchDto {\n");
        sb.append("    newBranch: ").append(toIndentedString(newBranch)).append("\n");
        sb.append("    oldBranch: ").append(toIndentedString(oldBranch)).append("\n");
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
