package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteGroupMergeRequestApproverSettingRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private Integer groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "setting_id")

    private Integer settingId;

    public DeleteGroupMergeRequestApproverSettingRequest withGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释：** 代码组id，代码组首页，Group ID后的数字Id
     * minimum: 1
     * maximum: 2147483647
     * @return groupId
     */
    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public DeleteGroupMergeRequestApproverSettingRequest withSettingId(Integer settingId) {
        this.settingId = settingId;
        return this;
    }

    /**
     * **参数解释：** 合并请求审核设置id。
     * minimum: 1
     * maximum: 2147483647
     * @return settingId
     */
    public Integer getSettingId() {
        return settingId;
    }

    public void setSettingId(Integer settingId) {
        this.settingId = settingId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteGroupMergeRequestApproverSettingRequest that = (DeleteGroupMergeRequestApproverSettingRequest) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.settingId, that.settingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, settingId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteGroupMergeRequestApproverSettingRequest {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    settingId: ").append(toIndentedString(settingId)).append("\n");
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
