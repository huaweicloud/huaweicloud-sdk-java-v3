package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IssueConfigFieldsResponseBodyResultConfigFields
 */
public class IssueConfigFieldsResponseBodyResultConfigFields {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show")

    private Boolean show;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_editable")

    private Boolean showEditable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optional")

    private Boolean optional;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "controlled")

    private Boolean controlled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_roles")

    private List<String> issueRoles = null;

    public IssueConfigFieldsResponseBodyResultConfigFields withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 查询结果
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public IssueConfigFieldsResponseBodyResultConfigFields withShow(Boolean show) {
        this.show = show;
        return this;
    }

    /**
     * 是否显示
     * @return show
     */
    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public IssueConfigFieldsResponseBodyResultConfigFields withShowEditable(Boolean showEditable) {
        this.showEditable = showEditable;
        return this;
    }

    /**
     * 是否可编辑
     * @return showEditable
     */
    public Boolean getShowEditable() {
        return showEditable;
    }

    public void setShowEditable(Boolean showEditable) {
        this.showEditable = showEditable;
    }

    public IssueConfigFieldsResponseBodyResultConfigFields withOptional(Boolean optional) {
        this.optional = optional;
        return this;
    }

    /**
     * 是否必填
     * @return optional
     */
    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    public IssueConfigFieldsResponseBodyResultConfigFields withControlled(Boolean controlled) {
        this.controlled = controlled;
        return this;
    }

    /**
     * 是否受控
     * @return controlled
     */
    public Boolean getControlled() {
        return controlled;
    }

    public void setControlled(Boolean controlled) {
        this.controlled = controlled;
    }

    public IssueConfigFieldsResponseBodyResultConfigFields withIssueRoles(List<String> issueRoles) {
        this.issueRoles = issueRoles;
        return this;
    }

    public IssueConfigFieldsResponseBodyResultConfigFields addIssueRolesItem(String issueRolesItem) {
        if (this.issueRoles == null) {
            this.issueRoles = new ArrayList<>();
        }
        this.issueRoles.add(issueRolesItem);
        return this;
    }

    public IssueConfigFieldsResponseBodyResultConfigFields withIssueRoles(Consumer<List<String>> issueRolesSetter) {
        if (this.issueRoles == null) {
            this.issueRoles = new ArrayList<>();
        }
        issueRolesSetter.accept(this.issueRoles);
        return this;
    }

    /**
     * 可编辑的角色
     * @return issueRoles
     */
    public List<String> getIssueRoles() {
        return issueRoles;
    }

    public void setIssueRoles(List<String> issueRoles) {
        this.issueRoles = issueRoles;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IssueConfigFieldsResponseBodyResultConfigFields that = (IssueConfigFieldsResponseBodyResultConfigFields) obj;
        return Objects.equals(this.displayName, that.displayName) && Objects.equals(this.show, that.show)
            && Objects.equals(this.showEditable, that.showEditable) && Objects.equals(this.optional, that.optional)
            && Objects.equals(this.controlled, that.controlled) && Objects.equals(this.issueRoles, that.issueRoles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayName, show, showEditable, optional, controlled, issueRoles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueConfigFieldsResponseBodyResultConfigFields {\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    show: ").append(toIndentedString(show)).append("\n");
        sb.append("    showEditable: ").append(toIndentedString(showEditable)).append("\n");
        sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
        sb.append("    controlled: ").append(toIndentedString(controlled)).append("\n");
        sb.append("    issueRoles: ").append(toIndentedString(issueRoles)).append("\n");
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
