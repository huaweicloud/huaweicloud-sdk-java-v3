package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 参数解释：创建后端服务器检测任务请求body体。
 */
public class CreateMemberHealthCheckJobRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_check")

    private CreateMemberHealthCheckJobOption memberCheck;

    public CreateMemberHealthCheckJobRequestBody withMemberCheck(CreateMemberHealthCheckJobOption memberCheck) {
        this.memberCheck = memberCheck;
        return this;
    }

    public CreateMemberHealthCheckJobRequestBody withMemberCheck(
        Consumer<CreateMemberHealthCheckJobOption> memberCheckSetter) {
        if (this.memberCheck == null) {
            this.memberCheck = new CreateMemberHealthCheckJobOption();
            memberCheckSetter.accept(this.memberCheck);
        }

        return this;
    }

    /**
     * Get memberCheck
     * @return memberCheck
     */
    public CreateMemberHealthCheckJobOption getMemberCheck() {
        return memberCheck;
    }

    public void setMemberCheck(CreateMemberHealthCheckJobOption memberCheck) {
        this.memberCheck = memberCheck;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateMemberHealthCheckJobRequestBody that = (CreateMemberHealthCheckJobRequestBody) obj;
        return Objects.equals(this.memberCheck, that.memberCheck);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberCheck);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMemberHealthCheckJobRequestBody {\n");
        sb.append("    memberCheck: ").append(toIndentedString(memberCheck)).append("\n");
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
