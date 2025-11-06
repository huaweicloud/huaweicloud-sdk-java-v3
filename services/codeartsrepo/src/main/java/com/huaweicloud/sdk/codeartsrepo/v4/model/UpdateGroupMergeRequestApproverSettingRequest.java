package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateGroupMergeRequestApproverSettingRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private Integer groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "setting_id")

    private Integer settingId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateMergeRequestApproverSettingDto body;

    public UpdateGroupMergeRequestApproverSettingRequest withGroupId(Integer groupId) {
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

    public UpdateGroupMergeRequestApproverSettingRequest withSettingId(Integer settingId) {
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

    public UpdateGroupMergeRequestApproverSettingRequest withBody(CreateMergeRequestApproverSettingDto body) {
        this.body = body;
        return this;
    }

    public UpdateGroupMergeRequestApproverSettingRequest withBody(
        Consumer<CreateMergeRequestApproverSettingDto> bodySetter) {
        if (this.body == null) {
            this.body = new CreateMergeRequestApproverSettingDto();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateMergeRequestApproverSettingDto getBody() {
        return body;
    }

    public void setBody(CreateMergeRequestApproverSettingDto body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateGroupMergeRequestApproverSettingRequest that = (UpdateGroupMergeRequestApproverSettingRequest) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.settingId, that.settingId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, settingId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGroupMergeRequestApproverSettingRequest {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    settingId: ").append(toIndentedString(settingId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
