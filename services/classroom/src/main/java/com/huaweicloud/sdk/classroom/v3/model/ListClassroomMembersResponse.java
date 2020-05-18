package com.huaweicloud.sdk.classroom.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.classroom.v3.model.ClassroomMember;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListClassroomMembersResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="members")
    
    private List<ClassroomMember> members = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public ListClassroomMembersResponse withMembers(List<ClassroomMember> members) {
        this.members = members;
        return this;
    }

    
    public ListClassroomMembersResponse addMembersItem(ClassroomMember membersItem) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        this.members.add(membersItem);
        return this;
    }

    public ListClassroomMembersResponse withMembers(Consumer<List<ClassroomMember>> membersSetter) {
        if(this.members == null ){
            this.members = new ArrayList<>();
        }
        membersSetter.accept(this.members);
        return this;
    }

    /**
     * 课堂成员列表
     * @return members
     */
    public List<ClassroomMember> getMembers() {
        return members;
    }

    public void setMembers(List<ClassroomMember> members) {
        this.members = members;
    }

    public ListClassroomMembersResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 课堂成员总数
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
        ListClassroomMembersResponse listClassroomMembersResponse = (ListClassroomMembersResponse) o;
        return Objects.equals(this.members, listClassroomMembersResponse.members) &&
            Objects.equals(this.total, listClassroomMembersResponse.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(members, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClassroomMembersResponse {\n");
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

