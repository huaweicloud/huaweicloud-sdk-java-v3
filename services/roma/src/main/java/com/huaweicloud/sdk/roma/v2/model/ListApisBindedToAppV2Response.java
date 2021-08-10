package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListApisBindedToAppV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auths")

    private List<ApiAuthInfo> auths = null;

    public ListApisBindedToAppV2Response withSize(Integer size) {
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

    public ListApisBindedToAppV2Response withTotal(Long total) {
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

    public ListApisBindedToAppV2Response withAuths(List<ApiAuthInfo> auths) {
        this.auths = auths;
        return this;
    }

    public ListApisBindedToAppV2Response addAuthsItem(ApiAuthInfo authsItem) {
        if (this.auths == null) {
            this.auths = new ArrayList<>();
        }
        this.auths.add(authsItem);
        return this;
    }

    public ListApisBindedToAppV2Response withAuths(Consumer<List<ApiAuthInfo>> authsSetter) {
        if (this.auths == null) {
            this.auths = new ArrayList<>();
        }
        authsSetter.accept(this.auths);
        return this;
    }

    /** 本次返回的API列表
     * 
     * @return auths */
    public List<ApiAuthInfo> getAuths() {
        return auths;
    }

    public void setAuths(List<ApiAuthInfo> auths) {
        this.auths = auths;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListApisBindedToAppV2Response listApisBindedToAppV2Response = (ListApisBindedToAppV2Response) o;
        return Objects.equals(this.size, listApisBindedToAppV2Response.size)
            && Objects.equals(this.total, listApisBindedToAppV2Response.total)
            && Objects.equals(this.auths, listApisBindedToAppV2Response.auths);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, total, auths);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApisBindedToAppV2Response {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    auths: ").append(toIndentedString(auths)).append("\n");
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
