package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** This is a auto create Body Object */
public class CreateMemberRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member")

    private CreateMemberReq member;

    public CreateMemberRequestBody withMember(CreateMemberReq member) {
        this.member = member;
        return this;
    }

    public CreateMemberRequestBody withMember(Consumer<CreateMemberReq> memberSetter) {
        if (this.member == null) {
            this.member = new CreateMemberReq();
            memberSetter.accept(this.member);
        }

        return this;
    }

    /** Get member
     * 
     * @return member */
    public CreateMemberReq getMember() {
        return member;
    }

    public void setMember(CreateMemberReq member) {
        this.member = member;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateMemberRequestBody createMemberRequestBody = (CreateMemberRequestBody) o;
        return Objects.equals(this.member, createMemberRequestBody.member);
    }

    @Override
    public int hashCode() {
        return Objects.hash(member);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMemberRequestBody {\n");
        sb.append("    member: ").append(toIndentedString(member)).append("\n");
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
