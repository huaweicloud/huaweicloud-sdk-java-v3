package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListCustomAuthorizersV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorizer_list")

    private List<AuthorizerResp> authorizerList = null;

    public ListCustomAuthorizersV2Response withSize(Integer size) {
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

    public ListCustomAuthorizersV2Response withTotal(Long total) {
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

    public ListCustomAuthorizersV2Response withAuthorizerList(List<AuthorizerResp> authorizerList) {
        this.authorizerList = authorizerList;
        return this;
    }

    public ListCustomAuthorizersV2Response addAuthorizerListItem(AuthorizerResp authorizerListItem) {
        if (this.authorizerList == null) {
            this.authorizerList = new ArrayList<>();
        }
        this.authorizerList.add(authorizerListItem);
        return this;
    }

    public ListCustomAuthorizersV2Response withAuthorizerList(Consumer<List<AuthorizerResp>> authorizerListSetter) {
        if (this.authorizerList == null) {
            this.authorizerList = new ArrayList<>();
        }
        authorizerListSetter.accept(this.authorizerList);
        return this;
    }

    /** 自定义认证列表
     * 
     * @return authorizerList */
    public List<AuthorizerResp> getAuthorizerList() {
        return authorizerList;
    }

    public void setAuthorizerList(List<AuthorizerResp> authorizerList) {
        this.authorizerList = authorizerList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCustomAuthorizersV2Response listCustomAuthorizersV2Response = (ListCustomAuthorizersV2Response) o;
        return Objects.equals(this.size, listCustomAuthorizersV2Response.size)
            && Objects.equals(this.total, listCustomAuthorizersV2Response.total)
            && Objects.equals(this.authorizerList, listCustomAuthorizersV2Response.authorizerList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, total, authorizerList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomAuthorizersV2Response {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    authorizerList: ").append(toIndentedString(authorizerList)).append("\n");
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
