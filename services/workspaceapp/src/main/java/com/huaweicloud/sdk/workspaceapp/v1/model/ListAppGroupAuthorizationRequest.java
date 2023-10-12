package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAppGroupAuthorizationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_group_id")

    private String appGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account")

    private String account;

    public ListAppGroupAuthorizationRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 单次查询的大小[1-100]
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAppGroupAuthorizationRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询的偏移量
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListAppGroupAuthorizationRequest withAppGroupId(String appGroupId) {
        this.appGroupId = appGroupId;
        return this;
    }

    /**
     * 应用组ID
     * @return appGroupId
     */
    public String getAppGroupId() {
        return appGroupId;
    }

    public void setAppGroupId(String appGroupId) {
        this.appGroupId = appGroupId;
    }

    public ListAppGroupAuthorizationRequest withAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * 应用授权的用户(组)，精确查询。
     * @return account
     */
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAppGroupAuthorizationRequest that = (ListAppGroupAuthorizationRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.appGroupId, that.appGroupId) && Objects.equals(this.account, that.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, appGroupId, account);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAppGroupAuthorizationRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    appGroupId: ").append(toIndentedString(appGroupId)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
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
