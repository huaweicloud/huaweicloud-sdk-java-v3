package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 增强型跨源连接各个授权项目的信息。
 */
public class ProjectPrivilege {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object")

    private String _object;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applicant_project_id")

    private String applicantProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privileges")

    private List<String> privileges = null;

    public ProjectPrivilege withObject(String _object) {
        this._object = _object;
        return this;
    }

    /**
     * 授权时object的信息。
     * @return _object
     */
    public String getObject() {
        return _object;
    }

    public void setObject(String _object) {
        this._object = _object;
    }

    public ProjectPrivilege withApplicantProjectId(String applicantProjectId) {
        this.applicantProjectId = applicantProjectId;
        return this;
    }

    /**
     * 授权的项目ID。
     * @return applicantProjectId
     */
    public String getApplicantProjectId() {
        return applicantProjectId;
    }

    public void setApplicantProjectId(String applicantProjectId) {
        this.applicantProjectId = applicantProjectId;
    }

    public ProjectPrivilege withPrivileges(List<String> privileges) {
        this.privileges = privileges;
        return this;
    }

    public ProjectPrivilege addPrivilegesItem(String privilegesItem) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        this.privileges.add(privilegesItem);
        return this;
    }

    public ProjectPrivilege withPrivileges(Consumer<List<String>> privilegesSetter) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        privilegesSetter.accept(this.privileges);
        return this;
    }

    /**
     * 授权操作信息。
     * @return privileges
     */
    public List<String> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<String> privileges) {
        this.privileges = privileges;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProjectPrivilege that = (ProjectPrivilege) obj;
        return Objects.equals(this._object, that._object)
            && Objects.equals(this.applicantProjectId, that.applicantProjectId)
            && Objects.equals(this.privileges, that.privileges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_object, applicantProjectId, privileges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectPrivilege {\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    applicantProjectId: ").append(toIndentedString(applicantProjectId)).append("\n");
        sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
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
