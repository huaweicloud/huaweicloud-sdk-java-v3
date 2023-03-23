package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAuthInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_info_name")

    private String authInfoName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListAuthInfoRequest withAuthInfoName(String authInfoName) {
        this.authInfoName = authInfoName;
        return this;
    }

    /**
     * 认证信息名称
     * @return authInfoName
     */
    public String getAuthInfoName() {
        return authInfoName;
    }

    public void setAuthInfoName(String authInfoName) {
        this.authInfoName = authInfoName;
    }

    public ListAuthInfoRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 默认为0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListAuthInfoRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 默认为100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAuthInfoRequest listAuthInfoRequest = (ListAuthInfoRequest) o;
        return Objects.equals(this.authInfoName, listAuthInfoRequest.authInfoName)
            && Objects.equals(this.offset, listAuthInfoRequest.offset)
            && Objects.equals(this.limit, listAuthInfoRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authInfoName, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuthInfoRequest {\n");
        sb.append("    authInfoName: ").append(toIndentedString(authInfoName)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
