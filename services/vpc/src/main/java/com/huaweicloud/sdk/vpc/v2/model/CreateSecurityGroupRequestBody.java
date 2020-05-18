package com.huaweicloud.sdk.vpc.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.CreateSecurityGroupOption;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class CreateSecurityGroupRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group")
    
    private CreateSecurityGroupOption securityGroup = null;

    public CreateSecurityGroupRequestBody withSecurityGroup(CreateSecurityGroupOption securityGroup) {
        this.securityGroup = securityGroup;
        return this;
    }

    public CreateSecurityGroupRequestBody withSecurityGroup(Consumer<CreateSecurityGroupOption> securityGroupSetter) {
        if(this.securityGroup == null ){
            this.securityGroup = new CreateSecurityGroupOption();
        }
        securityGroupSetter.accept(this.securityGroup);
        return this;
    }


    /**
     * Get securityGroup
     * @return securityGroup
     */
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

