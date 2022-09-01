package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class UpdateMemberRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member")

    @JacksonXmlProperty(localName = "member")

    private UpdateMemberReq member;

    public UpdateMemberRequestBody withMember(UpdateMemberReq member) {
        this.member = member;
        return this;
    }

    public UpdateMemberRequestBody withMember(Consumer<UpdateMemberReq> memberSetter) {
        if (this.member == null) {
            this.member = new UpdateMemberReq();
            memberSetter.accept(this.member);
        }

        return this;
    }

    /**
     * Get member
     * @return member
     */
    public UpdateMemberReq getMember() {
        return member;
    }

    public void setMember(UpdateMemberReq member) {
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
        UpdateMemberRequestBody updateMemberRequestBody = (UpdateMemberRequestBody) o;
        return Objects.equals(this.member, updateMemberRequestBody.member);
    }

    @Override
    public int hashCode() {
        return Objects.hash(member);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMemberRequestBody {\n");
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
