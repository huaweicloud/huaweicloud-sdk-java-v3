package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.AclApiBindingInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateApiAclBindingV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="acl_bindings")
    
    private List<AclApiBindingInfo> aclBindings = null;
    
    public CreateApiAclBindingV2Response withAclBindings(List<AclApiBindingInfo> aclBindings) {
        this.aclBindings = aclBindings;
        return this;
    }

    
    public CreateApiAclBindingV2Response addAclBindingsItem(AclApiBindingInfo aclBindingsItem) {
        if (this.aclBindings == null) {
            this.aclBindings = new ArrayList<>();
        }
        this.aclBindings.add(aclBindingsItem);
        return this;
    }

    public CreateApiAclBindingV2Response withAclBindings(Consumer<List<AclApiBindingInfo>> aclBindingsSetter) {
        if(this.aclBindings == null ){
            this.aclBindings = new ArrayList<>();
        }
        aclBindingsSetter.accept(this.aclBindings);
        return this;
    }

    /**
     * API与ACL的绑定关系列表
     * @return aclBindings
     */
    public List<AclApiBindingInfo> getAclBindings() {
        return aclBindings;
    }

    public void setAclBindings(List<AclApiBindingInfo> aclBindings) {
        this.aclBindings = aclBindings;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateApiAclBindingV2Response createApiAclBindingV2Response = (CreateApiAclBindingV2Response) o;
        return Objects.equals(this.aclBindings, createApiAclBindingV2Response.aclBindings);
    }
    @Override
    public int hashCode() {
        return Objects.hash(aclBindings);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateApiAclBindingV2Response {\n");
        sb.append("    aclBindings: ").append(toIndentedString(aclBindings)).append("\n");
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

