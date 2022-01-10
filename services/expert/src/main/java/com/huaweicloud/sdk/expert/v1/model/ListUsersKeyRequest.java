package com.huaweicloud.sdk.expert.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListUsersKeyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applet_key")

    private String appletKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paper_id")

    private String paperId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListUsersKeyRequest withAppletKey(String appletKey) {
        this.appletKey = appletKey;
        return this;
    }

    /** 小程序标识
     * 
     * @return appletKey */
    public String getAppletKey() {
        return appletKey;
    }

    public void setAppletKey(String appletKey) {
        this.appletKey = appletKey;
    }

    public ListUsersKeyRequest withPaperId(String paperId) {
        this.paperId = paperId;
        return this;
    }

    /** 问卷ID
     * 
     * @return paperId */
    public String getPaperId() {
        return paperId;
    }

    public void setPaperId(String paperId) {
        this.paperId = paperId;
    }

    public ListUsersKeyRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 偏移量,表示从此偏移量开始查询， offset大于等于0
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListUsersKeyRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每页显示的条目数量
     * 
     * @return limit */
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
        ListUsersKeyRequest listUsersKeyRequest = (ListUsersKeyRequest) o;
        return Objects.equals(this.appletKey, listUsersKeyRequest.appletKey)
            && Objects.equals(this.paperId, listUsersKeyRequest.paperId)
            && Objects.equals(this.offset, listUsersKeyRequest.offset)
            && Objects.equals(this.limit, listUsersKeyRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appletKey, paperId, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUsersKeyRequest {\n");
        sb.append("    appletKey: ").append(toIndentedString(appletKey)).append("\n");
        sb.append("    paperId: ").append(toIndentedString(paperId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
