package com.huaweicloud.sdk.elb.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.MemberResp;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateMemberResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="member")
    
    private MemberResp member;

    public CreateMemberResponse withMember(MemberResp member) {
        this.member = member;
        return this;
    }

    public CreateMemberResponse withMember(Consumer<MemberResp> memberSetter) {
        if(this.member == null ){
            this.member = new MemberResp();
            memberSetter.accept(this.member);
        }
        
        return this;
    }


    /**
     * Get member
     * @return member
     */
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
        CreateMemberResponse createMemberResponse = (CreateMemberResponse) o;
        return Objects.equals(this.member, createMemberResponse.member);
    }
    @Override
    public int hashCode() {
        return Objects.hash(member);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMemberResponse {\n");
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

