package com.huaweicloud.sdk.live.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListHistoryStreamsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListHistoryStreamsRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /** 推流域名。
     * 
     * @return domain */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public ListHistoryStreamsRequest withApp(String app) {
        this.app = app;
        return this;
    }

    /** 应用名称。
     * 
     * @return app */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public ListHistoryStreamsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 分页编号，默认为0 minimum: 0 maximum: 2147483647
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListHistoryStreamsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每页记录数。 取值范围：[1,100] 默认值：10。 minimum: 1 maximum: 100
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
        ListHistoryStreamsRequest listHistoryStreamsRequest = (ListHistoryStreamsRequest) o;
        return Objects.equals(this.domain, listHistoryStreamsRequest.domain)
            && Objects.equals(this.app, listHistoryStreamsRequest.app)
            && Objects.equals(this.offset, listHistoryStreamsRequest.offset)
            && Objects.equals(this.limit, listHistoryStreamsRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, app, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHistoryStreamsRequest {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
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
