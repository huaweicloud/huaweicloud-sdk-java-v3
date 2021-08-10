package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** This is a auto create Body Object */
public class AddServerGroupMemberRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_member")

    private ServerGroupMember addMember;

    public AddServerGroupMemberRequestBody withAddMember(ServerGroupMember addMember) {
        this.addMember = addMember;
        return this;
    }

    public AddServerGroupMemberRequestBody withAddMember(Consumer<ServerGroupMember> addMemberSetter) {
        if (this.addMember == null) {
            this.addMember = new ServerGroupMember();
            addMemberSetter.accept(this.addMember);
        }

        return this;
    }

    /** Get addMember
     * 
     * @return addMember */
    public ServerGroupMember getAddMember() {
        return addMember;
    }

    public void setAddMember(ServerGroupMember addMember) {
        this.addMember = addMember;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddServerGroupMemberRequestBody addServerGroupMemberRequestBody = (AddServerGroupMemberRequestBody) o;
        return Objects.equals(this.addMember, addServerGroupMemberRequestBody.addMember);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addMember);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddServerGroupMemberRequestBody {\n");
        sb.append("    addMember: ").append(toIndentedString(addMember)).append("\n");
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
