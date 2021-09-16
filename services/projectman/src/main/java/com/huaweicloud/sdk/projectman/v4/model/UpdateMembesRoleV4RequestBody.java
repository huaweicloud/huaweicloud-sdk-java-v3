package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** UpdateMembesRoleV4RequestBody */
public class UpdateMembesRoleV4RequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    private Integer roleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_ids")

    private List<String> userIds = null;

    public UpdateMembesRoleV4RequestBody withRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    /** 成员角色, -1 项目创建者, 3 项目经理, 4 开发人员, 5 测试经理, 6 测试人员, 7 参与者, 8 浏览者, 9 运维经理
     * 
     * @return roleId */
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public UpdateMembesRoleV4RequestBody withUserIds(List<String> userIds) {
        this.userIds = userIds;
        return this;
    }

    public UpdateMembesRoleV4RequestBody addUserIdsItem(String userIdsItem) {
        if (this.userIds == null) {
            this.userIds = new ArrayList<>();
        }
        this.userIds.add(userIdsItem);
        return this;
    }

    public UpdateMembesRoleV4RequestBody withUserIds(Consumer<List<String>> userIdsSetter) {
        if (this.userIds == null) {
            this.userIds = new ArrayList<>();
        }
        userIdsSetter.accept(this.userIds);
        return this;
    }

    /** 用户id
     * 
     * @return userIds */
    public List<String> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateMembesRoleV4RequestBody updateMembesRoleV4RequestBody = (UpdateMembesRoleV4RequestBody) o;
        return Objects.equals(this.roleId, updateMembesRoleV4RequestBody.roleId)
            && Objects.equals(this.userIds, updateMembesRoleV4RequestBody.userIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, userIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMembesRoleV4RequestBody {\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
