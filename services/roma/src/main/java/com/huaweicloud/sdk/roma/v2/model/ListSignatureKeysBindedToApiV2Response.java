package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.BasePage;
import com.huaweicloud.sdk.roma.v2.model.SignApiBindingInfo;
import com.huaweicloud.sdk.roma.v2.model.SignApiBindingResult;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListSignatureKeysBindedToApiV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Long total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bindings")
    
    private List<SignApiBindingInfo> bindings = null;
    
    public ListSignatureKeysBindedToApiV2Response withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 本次返回的列表长度
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    

    public ListSignatureKeysBindedToApiV2Response withTotal(Long total) {
        this.total = total;
        return this;
    }

    


    /**
     * 满足条件的记录数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    

    public ListSignatureKeysBindedToApiV2Response withBindings(List<SignApiBindingInfo> bindings) {
        this.bindings = bindings;
        return this;
    }

    
    public ListSignatureKeysBindedToApiV2Response addBindingsItem(SignApiBindingInfo bindingsItem) {
        this.bindings.add(bindingsItem);
        return this;
    }

    public ListSignatureKeysBindedToApiV2Response withBindings(Consumer<List<SignApiBindingInfo>> bindingsSetter) {
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
    public List<SignApiBindingInfo> getBindings() {
        return bindings;
    }

    public void setBindings(List<SignApiBindingInfo> bindings) {
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
        ListSignatureKeysBindedToApiV2Response listSignatureKeysBindedToApiV2Response = (ListSignatureKeysBindedToApiV2Response) o;
        return Objects.equals(this.size, listSignatureKeysBindedToApiV2Response.size) &&
            Objects.equals(this.total, listSignatureKeysBindedToApiV2Response.total) &&
            Objects.equals(this.bindings, listSignatureKeysBindedToApiV2Response.bindings);
    }
    @Override
    public int hashCode() {
        return Objects.hash(size, total, bindings);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSignatureKeysBindedToApiV2Response {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

