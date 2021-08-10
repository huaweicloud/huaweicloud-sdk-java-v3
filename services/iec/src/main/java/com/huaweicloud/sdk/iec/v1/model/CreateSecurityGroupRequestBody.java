package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 创建安全组请求体。 */
public class CreateSecurityGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group")

    private CreateSecurityGroupOption securityGroup;

    public CreateSecurityGroupRequestBody withSecurityGroup(CreateSecurityGroupOption securityGroup) {
        this.securityGroup = securityGroup;
        return this;
    }

    public CreateSecurityGroupRequestBody withSecurityGroup(Consumer<CreateSecurityGroupOption> securityGroupSetter) {
        if (this.securityGroup == null) {
            this.securityGroup = new CreateSecurityGroupOption();
            securityGroupSetter.accept(this.securityGroup);
        }

        return this;
    }

    /** Get securityGroup
     * 
     * @return securityGroup */
    public CreateSecurityGroupOption getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(CreateSecurityGroupOption securityGroup) {
        this.securityGroup = securityGroup;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSecurityGroupRequestBody createSecurityGroupRequestBody = (CreateSecurityGroupRequestBody) o;
        return Objects.equals(this.securityGroup, createSecurityGroupRequestBody.securityGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecurityGroupRequestBody {\n");
        sb.append("    securityGroup: ").append(toIndentedString(securityGroup)).append("\n");
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
