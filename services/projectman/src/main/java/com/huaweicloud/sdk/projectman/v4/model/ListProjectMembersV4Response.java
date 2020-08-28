package com.huaweicloud.sdk.projectman.v4.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.projectman.v4.model.MemberListV4Members;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListProjectMembersV4Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="members")
    
    private List<MemberListV4Members> members = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public ListProjectMembersV4Response withMembers(List<MemberListV4Members> members) {
        this.members = members;
        return this;
    }

    
    public ListProjectMembersV4Response addMembersItem(MemberListV4Members membersItem) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        this.members.add(membersItem);
        return this;
    }

    public ListProjectMembersV4Response withMembers(Consumer<List<MemberListV4Members>> membersSetter) {
        if(this.members == null ){
            this.members = new ArrayList<>();
        }
        membersSetter.accept(this.members);
        return this;
    }

    /**
     * 项目成员列表
     * @return members
     */
    public List<MemberListV4Members> getMembers() {
        return members;
    }

    public void setMembers(List<MemberListV4Members> members) {
        this.members = members;
    }

    public ListProjectMembersV4Response withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProjectMembersV4Response listProjectMembersV4Response = (ListProjectMembersV4Response) o;
        return Objects.equals(this.members, listProjectMembersV4Response.members) &&
            Objects.equals(this.total, listProjectMembersV4Response.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(members, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectMembersV4Response {\n");
        sb.append("    members: ").append(toIndentedString(members)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

