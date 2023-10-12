package com.huaweicloud.sdk.vpc.v3.model;

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
public class ListTrafficMirrorFilterRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_filter_rules")

    private List<TrafficMirrorFilterRule> trafficMirrorFilterRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListTrafficMirrorFilterRulesResponse withTrafficMirrorFilterRules(
        List<TrafficMirrorFilterRule> trafficMirrorFilterRules) {
        this.trafficMirrorFilterRules = trafficMirrorFilterRules;
        return this;
    }

    public ListTrafficMirrorFilterRulesResponse addTrafficMirrorFilterRulesItem(
        TrafficMirrorFilterRule trafficMirrorFilterRulesItem) {
        if (this.trafficMirrorFilterRules == null) {
            this.trafficMirrorFilterRules = new ArrayList<>();
        }
        this.trafficMirrorFilterRules.add(trafficMirrorFilterRulesItem);
        return this;
    }

    public ListTrafficMirrorFilterRulesResponse withTrafficMirrorFilterRules(
        Consumer<List<TrafficMirrorFilterRule>> trafficMirrorFilterRulesSetter) {
        if (this.trafficMirrorFilterRules == null) {
            this.trafficMirrorFilterRules = new ArrayList<>();
        }
        trafficMirrorFilterRulesSetter.accept(this.trafficMirrorFilterRules);
        return this;
    }

    /**
     * 流量镜像筛选条件规则对象
     * @return trafficMirrorFilterRules
     */
    public List<TrafficMirrorFilterRule> getTrafficMirrorFilterRules() {
        return trafficMirrorFilterRules;
    }

    public void setTrafficMirrorFilterRules(List<TrafficMirrorFilterRule> trafficMirrorFilterRules) {
        this.trafficMirrorFilterRules = trafficMirrorFilterRules;
    }

    public ListTrafficMirrorFilterRulesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListTrafficMirrorFilterRulesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListTrafficMirrorFilterRulesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTrafficMirrorFilterRulesResponse that = (ListTrafficMirrorFilterRulesResponse) obj;
        return Objects.equals(this.trafficMirrorFilterRules, that.trafficMirrorFilterRules)
            && Objects.equals(this.pageInfo, that.pageInfo) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trafficMirrorFilterRules, pageInfo, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTrafficMirrorFilterRulesResponse {\n");
        sb.append("    trafficMirrorFilterRules: ").append(toIndentedString(trafficMirrorFilterRules)).append("\n");
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
