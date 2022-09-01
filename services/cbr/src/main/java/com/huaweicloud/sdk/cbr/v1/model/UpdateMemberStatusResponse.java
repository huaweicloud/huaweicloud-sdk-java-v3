package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateMemberStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member")

    @JacksonXmlProperty(localName = "member")

    private Member member;

    public UpdateMemberStatusResponse withMember(Member member) {
        this.member = member;
        return this;
    }

    public UpdateMemberStatusResponse withMember(Consumer<Member> memberSetter) {
        if (this.member == null) {
            this.member = new Member();
            memberSetter.accept(this.member);
        }

        return this;
    }

    /**
     * Get member
     * @return member
     */
    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
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
        UpdateMemberStatusResponse updateMemberStatusResponse = (UpdateMemberStatusResponse) o;
        return Objects.equals(this.member, updateMemberStatusResponse.member);
    }

    @Override
    public int hashCode() {
        return Objects.hash(member);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMemberStatusResponse {\n");
        sb.append("    member: ").append(toIndentedString(member)).append("\n");
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
