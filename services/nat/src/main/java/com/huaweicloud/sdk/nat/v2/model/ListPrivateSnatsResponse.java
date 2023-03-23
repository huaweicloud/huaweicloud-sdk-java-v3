package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListPrivateSnatsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snat_rules")

    private List<PrivateSnat> snatRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListPrivateSnatsResponse withSnatRules(List<PrivateSnat> snatRules) {
        this.snatRules = snatRules;
        return this;
    }

    public ListPrivateSnatsResponse addSnatRulesItem(PrivateSnat snatRulesItem) {
        if (this.snatRules == null) {
            this.snatRules = new ArrayList<>();
        }
        this.snatRules.add(snatRulesItem);
        return this;
    }

    public ListPrivateSnatsResponse withSnatRules(Consumer<List<PrivateSnat>> snatRulesSetter) {
        if (this.snatRules == null) {
            this.snatRules = new ArrayList<>();
        }
        snatRulesSetter.accept(this.snatRules);
        return this;
    }

    /**
     * 查询SNAT规则列表的响应体。
     * @return snatRules
     */
    public List<PrivateSnat> getSnatRules() {
        return snatRules;
    }

    public void setSnatRules(List<PrivateSnat> snatRules) {
        this.snatRules = snatRules;
    }

    public ListPrivateSnatsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListPrivateSnatsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ListPrivateSnatsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPrivateSnatsResponse listPrivateSnatsResponse = (ListPrivateSnatsResponse) o;
        return Objects.equals(this.snatRules, listPrivateSnatsResponse.snatRules)
            && Objects.equals(this.pageInfo, listPrivateSnatsResponse.pageInfo)
            && Objects.equals(this.requestId, listPrivateSnatsResponse.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snatRules, pageInfo, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPrivateSnatsResponse {\n");
        sb.append("    snatRules: ").append(toIndentedString(snatRules)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
