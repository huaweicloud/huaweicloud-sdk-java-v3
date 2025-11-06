package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowGroupsInheritResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_setting")

    private String sourceSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upward_inherit_editable")

    private Boolean upwardInheritEditable;

    public ShowGroupsInheritResponse withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释：** 代码组id。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ShowGroupsInheritResponse withSourceSetting(String sourceSetting) {
        this.sourceSetting = sourceSetting;
        return this;
    }

    /**
     * **参数解释：** 资源类型设置。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return sourceSetting
     */
    public String getSourceSetting() {
        return sourceSetting;
    }

    public void setSourceSetting(String sourceSetting) {
        this.sourceSetting = sourceSetting;
    }

    public ShowGroupsInheritResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** 项目id。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowGroupsInheritResponse withUpwardInheritEditable(Boolean upwardInheritEditable) {
        this.upwardInheritEditable = upwardInheritEditable;
        return this;
    }

    /**
     * **参数解释：** 向上继承是否可编辑。
     * @return upwardInheritEditable
     */
    public Boolean getUpwardInheritEditable() {
        return upwardInheritEditable;
    }

    public void setUpwardInheritEditable(Boolean upwardInheritEditable) {
        this.upwardInheritEditable = upwardInheritEditable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowGroupsInheritResponse that = (ShowGroupsInheritResponse) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.sourceSetting, that.sourceSetting)
            && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.upwardInheritEditable, that.upwardInheritEditable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, sourceSetting, projectId, upwardInheritEditable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGroupsInheritResponse {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    sourceSetting: ").append(toIndentedString(sourceSetting)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    upwardInheritEditable: ").append(toIndentedString(upwardInheritEditable)).append("\n");
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
