package com.huaweicloud.sdk.apig.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.apig.v2.model.SignBindingApiResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class AssociateSignatureKeyV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bindings")
    
    private List<SignBindingApiResp> bindings = null;
    
    public AssociateSignatureKeyV2Response withBindings(List<SignBindingApiResp> bindings) {
        this.bindings = bindings;
        return this;
    }

    
    public AssociateSignatureKeyV2Response addBindingsItem(SignBindingApiResp bindingsItem) {
        if (this.bindings == null) {
            this.bindings = new ArrayList<>();
        }
        this.bindings.add(bindingsItem);
        return this;
    }

    public AssociateSignatureKeyV2Response withBindings(Consumer<List<SignBindingApiResp>> bindingsSetter) {
        if(this.bindings == null ){
            this.bindings = new ArrayList<>();
        }
        bindingsSetter.accept(this.bindings);
        return this;
    }

    /**
     * API与签名密钥的绑定关系列表
     * @return bindings
     */
    public List<SignBindingApiResp> getBindings() {
        return bindings;
    }

    public void setBindings(List<SignBindingApiResp> bindings) {
        this.bindings = bindings;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssociateSignatureKeyV2Response associateSignatureKeyV2Response = (AssociateSignatureKeyV2Response) o;
        return Objects.equals(this.bindings, associateSignatureKeyV2Response.bindings);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bindings);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateSignatureKeyV2Response {\n");
        sb.append("    bindings: ").append(toIndentedString(bindings)).append("\n");
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

