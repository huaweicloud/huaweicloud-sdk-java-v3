package com.huaweicloud.sdk.vpc.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v3.model.SecurityGroupInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateSecurityGroupResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_id")
    
    private String requestId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group")
    
    private SecurityGroupInfo securityGroup;

    public UpdateSecurityGroupResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    


    /**
     * 请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    

    public UpdateSecurityGroupResponse withSecurityGroup(SecurityGroupInfo securityGroup) {
        this.securityGroup = securityGroup;
        return this;
    }

    public UpdateSecurityGroupResponse withSecurityGroup(Consumer<SecurityGroupInfo> securityGroupSetter) {
        if(this.securityGroup == null ){
            this.securityGroup = new SecurityGroupInfo();
            securityGroupSetter.accept(this.securityGroup);
        }
        
        return this;
    }


    /**
     * Get securityGroup
     * @return securityGroup
     */
    public SecurityGroupInfo getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(SecurityGroupInfo securityGroup) {
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
        UpdateSecurityGroupResponse updateSecurityGroupResponse = (UpdateSecurityGroupResponse) o;
        return Objects.equals(this.requestId, updateSecurityGroupResponse.requestId) &&
            Objects.equals(this.securityGroup, updateSecurityGroupResponse.securityGroup);
    }
    @Override
    public int hashCode() {
        return Objects.hash(requestId, securityGroup);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSecurityGroupResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

