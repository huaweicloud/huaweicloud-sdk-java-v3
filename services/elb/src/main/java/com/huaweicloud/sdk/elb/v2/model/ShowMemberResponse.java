package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowMemberResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member")

    private MemberResp member;

    public ShowMemberResponse withMember(MemberResp member) {
        this.member = member;
        return this;
    }

    public ShowMemberResponse withMember(Consumer<MemberResp> memberSetter) {
        if (this.member == null) {
            this.member = new MemberResp();
            memberSetter.accept(this.member);
        }

        return this;
    }

    /** Get member
     * 
     * @return member */
    public MemberResp getMember() {
        return member;
    }

    public void setMember(MemberResp member) {
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
        ShowMemberResponse showMemberResponse = (ShowMemberResponse) o;
        return Objects.equals(this.member, showMemberResponse.member);
    }

    @Override
    public int hashCode() {
        return Objects.hash(member);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMemberResponse {\n");
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
