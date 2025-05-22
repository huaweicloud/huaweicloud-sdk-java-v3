package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateMemberHealthCheckJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_check")

    private MemberCheckJob memberCheck;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public CreateMemberHealthCheckJobResponse withMemberCheck(MemberCheckJob memberCheck) {
        this.memberCheck = memberCheck;
        return this;
    }

    public CreateMemberHealthCheckJobResponse withMemberCheck(Consumer<MemberCheckJob> memberCheckSetter) {
        if (this.memberCheck == null) {
            this.memberCheck = new MemberCheckJob();
            memberCheckSetter.accept(this.memberCheck);
        }

        return this;
    }

    /**
     * Get memberCheck
     * @return memberCheck
     */
    public MemberCheckJob getMemberCheck() {
        return memberCheck;
    }

    public void setMemberCheck(MemberCheckJob memberCheck) {
        this.memberCheck = memberCheck;
    }

    public CreateMemberHealthCheckJobResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 参数解释：请求ID。  注：自动生成 。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateMemberHealthCheckJobResponse that = (CreateMemberHealthCheckJobResponse) obj;
        return Objects.equals(this.memberCheck, that.memberCheck) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberCheck, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMemberHealthCheckJobResponse {\n");
        sb.append("    memberCheck: ").append(toIndentedString(memberCheck)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
