package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PermissionSetMemberBatchCreateDTO
 */
public class PermissionSetMemberBatchCreateDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "members")

    private List<PermissionSetMemberCreateDTO2> members = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_sync")

    private Boolean autoSync;

    public PermissionSetMemberBatchCreateDTO withMembers(List<PermissionSetMemberCreateDTO2> members) {
        this.members = members;
        return this;
    }

    public PermissionSetMemberBatchCreateDTO addMembersItem(PermissionSetMemberCreateDTO2 membersItem) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        this.members.add(membersItem);
        return this;
    }

    public PermissionSetMemberBatchCreateDTO withMembers(Consumer<List<PermissionSetMemberCreateDTO2>> membersSetter) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        membersSetter.accept(this.members);
        return this;
    }

    /**
     * 权限集成员创建参数列表
     * @return members
     */
    public List<PermissionSetMemberCreateDTO2> getMembers() {
        return members;
    }

    public void setMembers(List<PermissionSetMemberCreateDTO2> members) {
        this.members = members;
    }

    public PermissionSetMemberBatchCreateDTO withAutoSync(Boolean autoSync) {
        this.autoSync = autoSync;
        return this;
    }

    /**
     * 是否自动触发同步, 默认false
     * @return autoSync
     */
    public Boolean getAutoSync() {
        return autoSync;
    }

    public void setAutoSync(Boolean autoSync) {
        this.autoSync = autoSync;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PermissionSetMemberBatchCreateDTO that = (PermissionSetMemberBatchCreateDTO) obj;
        return Objects.equals(this.members, that.members) && Objects.equals(this.autoSync, that.autoSync);
    }

    @Override
    public int hashCode() {
        return Objects.hash(members, autoSync);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionSetMemberBatchCreateDTO {\n");
        sb.append("    members: ").append(toIndentedString(members)).append("\n");
        sb.append("    autoSync: ").append(toIndentedString(autoSync)).append("\n");
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
