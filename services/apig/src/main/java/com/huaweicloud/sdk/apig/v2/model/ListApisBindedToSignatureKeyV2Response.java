package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListApisBindedToSignatureKeyV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    @JacksonXmlProperty(localName = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bindings")

    @JacksonXmlProperty(localName = "bindings")

    private List<SignApiBindingBase> bindings = null;

    public ListApisBindedToSignatureKeyV2Response withSize(Integer size) {
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

    public ListApisBindedToSignatureKeyV2Response withTotal(Long total) {
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

    public ListApisBindedToSignatureKeyV2Response withBindings(List<SignApiBindingBase> bindings) {
        this.bindings = bindings;
        return this;
    }

    public ListApisBindedToSignatureKeyV2Response addBindingsItem(SignApiBindingBase bindingsItem) {
        if (this.bindings == null) {
            this.bindings = new ArrayList<>();
        }
        this.bindings.add(bindingsItem);
        return this;
    }

    public ListApisBindedToSignatureKeyV2Response withBindings(Consumer<List<SignApiBindingBase>> bindingsSetter) {
        if (this.bindings == null) {
            this.bindings = new ArrayList<>();
        }
        bindingsSetter.accept(this.bindings);
        return this;
    }

    /**
     * 本次查询到的签名密钥和API绑定关系列表
     * @return bindings
     */
    public List<SignApiBindingBase> getBindings() {
        return bindings;
    }

    public void setBindings(List<SignApiBindingBase> bindings) {
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
        ListApisBindedToSignatureKeyV2Response listApisBindedToSignatureKeyV2Response =
            (ListApisBindedToSignatureKeyV2Response) o;
        return Objects.equals(this.size, listApisBindedToSignatureKeyV2Response.size)
            && Objects.equals(this.total, listApisBindedToSignatureKeyV2Response.total)
            && Objects.equals(this.bindings, listApisBindedToSignatureKeyV2Response.bindings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, total, bindings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApisBindedToSignatureKeyV2Response {\n");
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
