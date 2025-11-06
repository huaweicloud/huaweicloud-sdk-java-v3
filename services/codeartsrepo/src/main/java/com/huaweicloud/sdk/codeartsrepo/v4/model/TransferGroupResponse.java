package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class TransferGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_name")

    private String fullName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_path")

    private String fullPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "my_role")

    private GroupMyRoleDto myRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private Integer parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private Integer creatorId;

    public TransferGroupResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 代码组id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TransferGroupResponse withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * 代码组全名称
     * @return fullName
     */
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public TransferGroupResponse withFullPath(String fullPath) {
        this.fullPath = fullPath;
        return this;
    }

    /**
     * 代码组全路径
     * @return fullPath
     */
    public String getFullPath() {
        return fullPath;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }

    public TransferGroupResponse withMyRole(GroupMyRoleDto myRole) {
        this.myRole = myRole;
        return this;
    }

    public TransferGroupResponse withMyRole(Consumer<GroupMyRoleDto> myRoleSetter) {
        if (this.myRole == null) {
            this.myRole = new GroupMyRoleDto();
            myRoleSetter.accept(this.myRole);
        }

        return this;
    }

    /**
     * Get myRole
     * @return myRole
     */
    public GroupMyRoleDto getMyRole() {
        return myRole;
    }

    public void setMyRole(GroupMyRoleDto myRole) {
        this.myRole = myRole;
    }

    public TransferGroupResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 代码组名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TransferGroupResponse withParentId(Integer parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 代码组父级id
     * @return parentId
     */
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public TransferGroupResponse withCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * 代码组所有者id
     * @return creatorId
     */
    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TransferGroupResponse that = (TransferGroupResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.fullName, that.fullName)
            && Objects.equals(this.fullPath, that.fullPath) && Objects.equals(this.myRole, that.myRole)
            && Objects.equals(this.name, that.name) && Objects.equals(this.parentId, that.parentId)
            && Objects.equals(this.creatorId, that.creatorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, fullPath, myRole, name, parentId, creatorId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransferGroupResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
        sb.append("    fullPath: ").append(toIndentedString(fullPath)).append("\n");
        sb.append("    myRole: ").append(toIndentedString(myRole)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
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
