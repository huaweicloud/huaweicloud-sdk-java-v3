package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**:  请求返回结果，接口不同，返回不同。 **取值范围**: 根据不同接口有不同范围。 
 */
public class PrivilegesResponseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operations")

    private String operations;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operationsIndex")

    private List<Integer> operationsIndex = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    private String roleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_name")

    private String roleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_chinese_name")

    private String roleChineseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area_service_id")

    private String areaServiceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "granted_object_path")

    private String grantedObjectPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "granted_object_type_id")

    private String grantedObjectTypeId;

    public PrivilegesResponseResult withOperations(String operations) {
        this.operations = operations;
        return this;
    }

    /**
     * **参数解释**:  操作列表。 **取值范围**: 英文字符串，使用英文逗号分隔。 
     * @return operations
     */
    public String getOperations() {
        return operations;
    }

    public void setOperations(String operations) {
        this.operations = operations;
    }

    public PrivilegesResponseResult withOperationsIndex(List<Integer> operationsIndex) {
        this.operationsIndex = operationsIndex;
        return this;
    }

    public PrivilegesResponseResult addOperationsIndexItem(Integer operationsIndexItem) {
        if (this.operationsIndex == null) {
            this.operationsIndex = new ArrayList<>();
        }
        this.operationsIndex.add(operationsIndexItem);
        return this;
    }

    public PrivilegesResponseResult withOperationsIndex(Consumer<List<Integer>> operationsIndexSetter) {
        if (this.operationsIndex == null) {
            this.operationsIndex = new ArrayList<>();
        }
        operationsIndexSetter.accept(this.operationsIndex);
        return this;
    }

    /**
     * **参数解释**:  操作序列号。 **取值范围**: 数字。 
     * @return operationsIndex
     */
    public List<Integer> getOperationsIndex() {
        return operationsIndex;
    }

    public void setOperationsIndex(List<Integer> operationsIndex) {
        this.operationsIndex = operationsIndex;
    }

    public PrivilegesResponseResult withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * **参数解释**:  角色id。 **取值范围**: 32位英文、数字随机字符串。 
     * @return roleId
     */
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public PrivilegesResponseResult withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * **参数解释**:  角色英文名称。 **取值范围**:   Project manager，Product manager，Test manager，Operation manager，System engineer，Committer，Developer，Testter，Participant，Viever及自定义角色。 
     * @return roleName
     */
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public PrivilegesResponseResult withRoleChineseName(String roleChineseName) {
        this.roleChineseName = roleChineseName;
        return this;
    }

    /**
     * **参数解释**:  角色中文名称。 **取值范围**: 项目经理，产品经理，测试经理，运维经理，系统工程师，Committer，开发人员，测试人员，参与者，浏览者及自定义角色。 
     * @return roleChineseName
     */
    public String getRoleChineseName() {
        return roleChineseName;
    }

    public void setRoleChineseName(String roleChineseName) {
        this.roleChineseName = roleChineseName;
    }

    public PrivilegesResponseResult withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id。 **取值范围**: 32位英文、数字随机字符串。 
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public PrivilegesResponseResult withAreaServiceId(String areaServiceId) {
        this.areaServiceId = areaServiceId;
        return this;
    }

    /**
     * **参数解释**:  服务。 **取值范围**: 32位英文、数字随机字符串。 
     * @return areaServiceId
     */
    public String getAreaServiceId() {
        return areaServiceId;
    }

    public void setAreaServiceId(String areaServiceId) {
        this.areaServiceId = areaServiceId;
    }

    public PrivilegesResponseResult withGrantedObjectPath(String grantedObjectPath) {
        this.grantedObjectPath = grantedObjectPath;
        return this;
    }

    /**
     * **参数解释**:  授权对象路径。 **取值范围**: 英文、数字、斜线（/）、星号（*）字符串 
     * @return grantedObjectPath
     */
    public String getGrantedObjectPath() {
        return grantedObjectPath;
    }

    public void setGrantedObjectPath(String grantedObjectPath) {
        this.grantedObjectPath = grantedObjectPath;
    }

    public PrivilegesResponseResult withGrantedObjectTypeId(String grantedObjectTypeId) {
        this.grantedObjectTypeId = grantedObjectTypeId;
        return this;
    }

    /**
     * **参数解释**:  授权对象类型id。 **取值范围**: 32位英文、数字随机字符串。 
     * @return grantedObjectTypeId
     */
    public String getGrantedObjectTypeId() {
        return grantedObjectTypeId;
    }

    public void setGrantedObjectTypeId(String grantedObjectTypeId) {
        this.grantedObjectTypeId = grantedObjectTypeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivilegesResponseResult that = (PrivilegesResponseResult) obj;
        return Objects.equals(this.operations, that.operations)
            && Objects.equals(this.operationsIndex, that.operationsIndex) && Objects.equals(this.roleId, that.roleId)
            && Objects.equals(this.roleName, that.roleName)
            && Objects.equals(this.roleChineseName, that.roleChineseName)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.areaServiceId, that.areaServiceId)
            && Objects.equals(this.grantedObjectPath, that.grantedObjectPath)
            && Objects.equals(this.grantedObjectTypeId, that.grantedObjectTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operations,
            operationsIndex,
            roleId,
            roleName,
            roleChineseName,
            projectId,
            areaServiceId,
            grantedObjectPath,
            grantedObjectTypeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivilegesResponseResult {\n");
        sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
        sb.append("    operationsIndex: ").append(toIndentedString(operationsIndex)).append("\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
        sb.append("    roleChineseName: ").append(toIndentedString(roleChineseName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    areaServiceId: ").append(toIndentedString(areaServiceId)).append("\n");
        sb.append("    grantedObjectPath: ").append(toIndentedString(grantedObjectPath)).append("\n");
        sb.append("    grantedObjectTypeId: ").append(toIndentedString(grantedObjectTypeId)).append("\n");
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
