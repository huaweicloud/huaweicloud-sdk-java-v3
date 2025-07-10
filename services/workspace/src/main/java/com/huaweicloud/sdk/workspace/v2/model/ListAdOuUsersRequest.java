package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAdOuUsersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ou_dn")

    private String ouDn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_existed")

    private Boolean hasExisted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListAdOuUsersRequest withOuDn(String ouDn) {
        this.ouDn = ouDn;
        return this;
    }

    /**
     * OU的域名地址。
     * @return ouDn
     */
    public String getOuDn() {
        return ouDn;
    }

    public void setOuDn(String ouDn) {
        this.ouDn = ouDn;
    }

    public ListAdOuUsersRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名，支持模糊查询。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ListAdOuUsersRequest withHasExisted(Boolean hasExisted) {
        this.hasExisted = hasExisted;
        return this;
    }

    /**
     * 用户是否已存在。
     * @return hasExisted
     */
    public Boolean getHasExisted() {
        return hasExisted;
    }

    public void setHasExisted(Boolean hasExisted) {
        this.hasExisted = hasExisted;
    }

    public ListAdOuUsersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 用于分页查询，返回桌面数量限制。如果不指定，则返回所有符合条件的桌面。
     * minimum: 0
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAdOuUsersRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 用于分页查询，查询的起始记录序号，从0开始。
     * minimum: 0
     * maximum: 10000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAdOuUsersRequest that = (ListAdOuUsersRequest) obj;
        return Objects.equals(this.ouDn, that.ouDn) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.hasExisted, that.hasExisted) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ouDn, userName, hasExisted, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAdOuUsersRequest {\n");
        sb.append("    ouDn: ").append(toIndentedString(ouDn)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    hasExisted: ").append(toIndentedString(hasExisted)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
