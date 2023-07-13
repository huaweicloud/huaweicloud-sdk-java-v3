package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 关联的资源分组
 */
public class AssociationResourceGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_application_type")

    private TemplateApplicationType templateApplicationType;

    public AssociationResourceGroup withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 资源分组ID，以rg开头，后跟22位由字母或数字组成的字符串
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public AssociationResourceGroup withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 资源分组名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public AssociationResourceGroup withTemplateApplicationType(TemplateApplicationType templateApplicationType) {
        this.templateApplicationType = templateApplicationType;
        return this;
    }

    /**
     * Get templateApplicationType
     * @return templateApplicationType
     */
    public TemplateApplicationType getTemplateApplicationType() {
        return templateApplicationType;
    }

    public void setTemplateApplicationType(TemplateApplicationType templateApplicationType) {
        this.templateApplicationType = templateApplicationType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssociationResourceGroup that = (AssociationResourceGroup) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.templateApplicationType, that.templateApplicationType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, groupName, templateApplicationType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociationResourceGroup {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    templateApplicationType: ").append(toIndentedString(templateApplicationType)).append("\n");
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
