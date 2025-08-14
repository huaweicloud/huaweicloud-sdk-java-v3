package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改个人文件夹。
 */
public class UpdateUserFolderReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_user_assignment_info")

    private UpdateUserAssignmentInfo updateUserAssignmentInfo;

    public UpdateUserFolderReq withUpdateUserAssignmentInfo(UpdateUserAssignmentInfo updateUserAssignmentInfo) {
        this.updateUserAssignmentInfo = updateUserAssignmentInfo;
        return this;
    }

    public UpdateUserFolderReq withUpdateUserAssignmentInfo(
        Consumer<UpdateUserAssignmentInfo> updateUserAssignmentInfoSetter) {
        if (this.updateUserAssignmentInfo == null) {
            this.updateUserAssignmentInfo = new UpdateUserAssignmentInfo();
            updateUserAssignmentInfoSetter.accept(this.updateUserAssignmentInfo);
        }

        return this;
    }

    /**
     * Get updateUserAssignmentInfo
     * @return updateUserAssignmentInfo
     */
    public UpdateUserAssignmentInfo getUpdateUserAssignmentInfo() {
        return updateUserAssignmentInfo;
    }

    public void setUpdateUserAssignmentInfo(UpdateUserAssignmentInfo updateUserAssignmentInfo) {
        this.updateUserAssignmentInfo = updateUserAssignmentInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateUserFolderReq that = (UpdateUserFolderReq) obj;
        return Objects.equals(this.updateUserAssignmentInfo, that.updateUserAssignmentInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updateUserAssignmentInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateUserFolderReq {\n");
        sb.append("    updateUserAssignmentInfo: ").append(toIndentedString(updateUserAssignmentInfo)).append("\n");
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
