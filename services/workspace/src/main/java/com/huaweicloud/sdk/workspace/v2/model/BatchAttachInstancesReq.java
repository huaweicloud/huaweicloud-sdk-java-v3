package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分配用户请求。
 */
public class BatchAttachInstancesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktops")

    private List<AttachInstancesDesktopInfo> desktops = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private List<AttachInstancesUserInfo> users = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assign_model")

    private AssignModelInfo assignModel;

    public BatchAttachInstancesReq withDesktops(List<AttachInstancesDesktopInfo> desktops) {
        this.desktops = desktops;
        return this;
    }

    public BatchAttachInstancesReq addDesktopsItem(AttachInstancesDesktopInfo desktopsItem) {
        if (this.desktops == null) {
            this.desktops = new ArrayList<>();
        }
        this.desktops.add(desktopsItem);
        return this;
    }

    public BatchAttachInstancesReq withDesktops(Consumer<List<AttachInstancesDesktopInfo>> desktopsSetter) {
        if (this.desktops == null) {
            this.desktops = new ArrayList<>();
        }
        desktopsSetter.accept(this.desktops);
        return this;
    }

    /**
     * 桌面信息列表。
     * @return desktops
     */
    public List<AttachInstancesDesktopInfo> getDesktops() {
        return desktops;
    }

    public void setDesktops(List<AttachInstancesDesktopInfo> desktops) {
        this.desktops = desktops;
    }

    public BatchAttachInstancesReq withUsers(List<AttachInstancesUserInfo> users) {
        this.users = users;
        return this;
    }

    public BatchAttachInstancesReq addUsersItem(AttachInstancesUserInfo usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public BatchAttachInstancesReq withUsers(Consumer<List<AttachInstancesUserInfo>> usersSetter) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * 用户信息列表。
     * @return users
     */
    public List<AttachInstancesUserInfo> getUsers() {
        return users;
    }

    public void setUsers(List<AttachInstancesUserInfo> users) {
        this.users = users;
    }

    public BatchAttachInstancesReq withAssignModel(AssignModelInfo assignModel) {
        this.assignModel = assignModel;
        return this;
    }

    public BatchAttachInstancesReq withAssignModel(Consumer<AssignModelInfo> assignModelSetter) {
        if (this.assignModel == null) {
            this.assignModel = new AssignModelInfo();
            assignModelSetter.accept(this.assignModel);
        }

        return this;
    }

    /**
     * Get assignModel
     * @return assignModel
     */
    public AssignModelInfo getAssignModel() {
        return assignModel;
    }

    public void setAssignModel(AssignModelInfo assignModel) {
        this.assignModel = assignModel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchAttachInstancesReq that = (BatchAttachInstancesReq) obj;
        return Objects.equals(this.desktops, that.desktops) && Objects.equals(this.users, that.users)
            && Objects.equals(this.assignModel, that.assignModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktops, users, assignModel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAttachInstancesReq {\n");
        sb.append("    desktops: ").append(toIndentedString(desktops)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    assignModel: ").append(toIndentedString(assignModel)).append("\n");
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
