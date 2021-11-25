package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListSignatureKeysV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signs")

    private List<SignatureWithBindNum> signs = null;

    public ListSignatureKeysV2Response withSize(Integer size) {
        this.size = size;
        return this;
    }

    /** 本次返回的列表长度
     * 
     * @return size */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListSignatureKeysV2Response withTotal(Long total) {
        this.total = total;
        return this;
    }

    /** 满足条件的记录数
     * 
     * @return total */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListSignatureKeysV2Response withSigns(List<SignatureWithBindNum> signs) {
        this.signs = signs;
        return this;
    }

    public ListSignatureKeysV2Response addSignsItem(SignatureWithBindNum signsItem) {
        if (this.signs == null) {
            this.signs = new ArrayList<>();
        }
        this.signs.add(signsItem);
        return this;
    }

    public ListSignatureKeysV2Response withSigns(Consumer<List<SignatureWithBindNum>> signsSetter) {
        if (this.signs == null) {
            this.signs = new ArrayList<>();
        }
        signsSetter.accept(this.signs);
        return this;
    }

    /** 本次查询到的签名密钥列表
     * 
     * @return signs */
    public List<SignatureWithBindNum> getSigns() {
        return signs;
    }

    public void setSigns(List<SignatureWithBindNum> signs) {
        this.signs = signs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSignatureKeysV2Response listSignatureKeysV2Response = (ListSignatureKeysV2Response) o;
        return Objects.equals(this.size, listSignatureKeysV2Response.size)
            && Objects.equals(this.total, listSignatureKeysV2Response.total)
            && Objects.equals(this.signs, listSignatureKeysV2Response.signs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, total, signs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSignatureKeysV2Response {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    signs: ").append(toIndentedString(signs)).append("\n");
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
