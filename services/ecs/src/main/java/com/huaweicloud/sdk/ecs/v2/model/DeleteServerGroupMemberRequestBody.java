package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class DeleteServerGroupMemberRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_member")

    @JacksonXmlProperty(localName = "remove_member")

    private ServerGroupMember removeMember;

    public DeleteServerGroupMemberRequestBody withRemoveMember(ServerGroupMember removeMember) {
        this.removeMember = removeMember;
        return this;
    }

    public DeleteServerGroupMemberRequestBody withRemoveMember(Consumer<ServerGroupMember> removeMemberSetter) {
        if (this.removeMember == null) {
            this.removeMember = new ServerGroupMember();
            removeMemberSetter.accept(this.removeMember);
        }

        return this;
    }

    /**
     * Get removeMember
     * @return removeMember
     */
    public ServerGroupMember getRemoveMember() {
        return removeMember;
    }

    public void setRemoveMember(ServerGroupMember removeMember) {
        this.removeMember = removeMember;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteServerGroupMemberRequestBody deleteServerGroupMemberRequestBody = (DeleteServerGroupMemberRequestBody) o;
        return Objects.equals(this.removeMember, deleteServerGroupMemberRequestBody.removeMember);
    }

    @Override
    public int hashCode() {
        return Objects.hash(removeMember);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteServerGroupMemberRequestBody {\n");
        sb.append("    removeMember: ").append(toIndentedString(removeMember)).append("\n");
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
