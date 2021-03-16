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
public class ListApisBindedToSignatureKeyV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bindings")
    
    private List<SignBindingApiResp> bindings = null;
    
    public ListApisBindedToSignatureKeyV2Response withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 本次查询满足条件的总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    public ListApisBindedToSignatureKeyV2Response withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 本次查询返回的列表长度
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    

    public ListApisBindedToSignatureKeyV2Response withBindings(List<SignBindingApiResp> bindings) {
        this.bindings = bindings;
        return this;
    }

    
    public ListApisBindedToSignatureKeyV2Response addBindingsItem(SignBindingApiResp bindingsItem) {
        this.bindings.add(bindingsItem);
        return this;
    }

    public ListApisBindedToSignatureKeyV2Response withBindings(Consumer<List<SignBindingApiResp>> bindingsSetter) {
        if(this.bindings == null ){
            this.bindings = new ArrayList<>();
        }
        bindingsSetter.accept(this.bindings);
        return this;
    }

    /**
     * 本次查询返回的列表
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
        ListApisBindedToSignatureKeyV2Response listApisBindedToSignatureKeyV2Response = (ListApisBindedToSignatureKeyV2Response) o;
        return Objects.equals(this.total, listApisBindedToSignatureKeyV2Response.total) &&
            Objects.equals(this.size, listApisBindedToSignatureKeyV2Response.size) &&
            Objects.equals(this.bindings, listApisBindedToSignatureKeyV2Response.bindings);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, size, bindings);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApisBindedToSignatureKeyV2Response {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

