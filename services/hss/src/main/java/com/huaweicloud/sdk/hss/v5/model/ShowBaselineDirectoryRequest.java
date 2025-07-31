package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowBaselineDirectoryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_os")

    private String supportOs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "select_type")

    private String selectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    public ShowBaselineDirectoryRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**: 企业项目ID，用于过滤不同企业项目下的资产。获取方式请参见[获取企业项目ID](hss_02_0027.xml)。 如需查询所有企业项目下的资产请传参“all_granted_eps”。 **约束限制**: 开通企业项目功能后才需要配置企业项目ID参数。 **取值范围**: 字符长度1-256位 **默认取值**: 0，表示默认企业项目（default）。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowBaselineDirectoryRequest withSupportOs(String supportOs) {
        this.supportOs = supportOs;
        return this;
    }

    /**
     * **参数解释** 基线检查的操作系统 **约束限制** 不涉及 **取值范围** - Linux - Windows  **默认取值** Linux
     * @return supportOs
     */
    public String getSupportOs() {
        return supportOs;
    }

    public void setSupportOs(String supportOs) {
        this.supportOs = supportOs;
    }

    public ShowBaselineDirectoryRequest withSelectType(String selectType) {
        this.selectType = selectType;
        return this;
    }

    /**
     * **参数解释** 决定目录结构的顺序 **约束限制** 不涉及 **取值范围** - check_type : 二级目录为基线名称 - tag        : 二级目录为检查项的类型  **默认取值** 不涉及
     * @return selectType
     */
    public String getSelectType() {
        return selectType;
    }

    public void setSelectType(String selectType) {
        this.selectType = selectType;
    }

    public ShowBaselineDirectoryRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释** 展示该策略组选中哪些检查项 **约束限制** 不涉及 **取值范围** 字符长度0-64位 **默认取值** 不涉及
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBaselineDirectoryRequest that = (ShowBaselineDirectoryRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.supportOs, that.supportOs) && Objects.equals(this.selectType, that.selectType)
            && Objects.equals(this.groupId, that.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, supportOs, selectType, groupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBaselineDirectoryRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    supportOs: ").append(toIndentedString(supportOs)).append("\n");
        sb.append("    selectType: ").append(toIndentedString(selectType)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
