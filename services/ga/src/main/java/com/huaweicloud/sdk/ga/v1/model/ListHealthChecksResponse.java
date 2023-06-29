package com.huaweicloud.sdk.ga.v1.model;

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
public class ListHealthChecksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health_checks")

    private List<HealthCheckDetail> healthChecks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListHealthChecksResponse withHealthChecks(List<HealthCheckDetail> healthChecks) {
        this.healthChecks = healthChecks;
        return this;
    }

    public ListHealthChecksResponse addHealthChecksItem(HealthCheckDetail healthChecksItem) {
        if (this.healthChecks == null) {
            this.healthChecks = new ArrayList<>();
        }
        this.healthChecks.add(healthChecksItem);
        return this;
    }

    public ListHealthChecksResponse withHealthChecks(Consumer<List<HealthCheckDetail>> healthChecksSetter) {
        if (this.healthChecks == null) {
            this.healthChecks = new ArrayList<>();
        }
        healthChecksSetter.accept(this.healthChecks);
        return this;
    }

    /**
     * 健康检查列表。
     * @return healthChecks
     */
    public List<HealthCheckDetail> getHealthChecks() {
        return healthChecks;
    }

    public void setHealthChecks(List<HealthCheckDetail> healthChecks) {
        this.healthChecks = healthChecks;
    }

    public ListHealthChecksResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListHealthChecksResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListHealthChecksResponse withRequestId(String requestId) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHealthChecksResponse that = (ListHealthChecksResponse) obj;
        return Objects.equals(this.healthChecks, that.healthChecks) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(healthChecks, pageInfo, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHealthChecksResponse {\n");
        sb.append("    healthChecks: ").append(toIndentedString(healthChecks)).append("\n");
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
