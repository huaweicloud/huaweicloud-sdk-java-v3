package com.huaweicloud.sdk.elb.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.MemberV2Resp;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowMemberResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="member")
    
    private MemberV2Resp member = null;

    public ShowMemberResponse withMember(MemberV2Resp member) {
        this.member = member;
        return this;
    }

    public ShowMemberResponse withMember(Consumer<MemberV2Resp> memberSetter) {
        if(this.member == null ){
            this.member = new MemberV2Resp();
            memberSetter.accept(this.member);
        }
        
        return this;
    }


    /**
     * Get member
     * @return member
     */
    public MemberV2Resp getMember() {
        return member;
    }

    public void setMember(MemberV2Resp member) {
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

