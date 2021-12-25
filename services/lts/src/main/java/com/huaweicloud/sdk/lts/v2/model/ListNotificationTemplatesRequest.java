package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListNotificationTemplatesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListNotificationTemplatesRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /** 账号id，获取方式请参见：获取账号ID、项目ID、日志组ID、日志流ID（https://support.huaweicloud.com/api-lts/lts_api_0006.html）。
     * 
     * @return domainId */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ListNotificationTemplatesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 查询游标，初始传入0，后续从上一次的返回值中获取 minimum: 0 maximum: 1024
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListNotificationTemplatesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每页数据量，最大值为100 minimum: 0 maximum: 100
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
        ListNotificationTemplatesRequest listNotificationTemplatesRequest = (ListNotificationTemplatesRequest) o;
        return Objects.equals(this.domainId, listNotificationTemplatesRequest.domainId)
            && Objects.equals(this.offset, listNotificationTemplatesRequest.offset)
            && Objects.equals(this.limit, listNotificationTemplatesRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNotificationTemplatesRequest {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
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
