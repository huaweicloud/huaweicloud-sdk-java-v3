package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListHealthMonitorsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "healthmonitors")

    private List<HealthMonitor> healthmonitors = null;

    public ListHealthMonitorsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /** 请求ID。 注：自动生成 。
     * 
     * @return requestId */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListHealthMonitorsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListHealthMonitorsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /** Get pageInfo
     * 
     * @return pageInfo */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ListHealthMonitorsResponse withHealthmonitors(List<HealthMonitor> healthmonitors) {
        this.healthmonitors = healthmonitors;
        return this;
    }

    public ListHealthMonitorsResponse addHealthmonitorsItem(HealthMonitor healthmonitorsItem) {
        if (this.healthmonitors == null) {
            this.healthmonitors = new ArrayList<>();
        }
        this.healthmonitors.add(healthmonitorsItem);
        return this;
    }

    public ListHealthMonitorsResponse withHealthmonitors(Consumer<List<HealthMonitor>> healthmonitorsSetter) {
        if (this.healthmonitors == null) {
            this.healthmonitors = new ArrayList<>();
        }
        healthmonitorsSetter.accept(this.healthmonitors);
        return this;
    }

    /** 健康检查对象。
     * 
     * @return healthmonitors */
    public List<HealthMonitor> getHealthmonitors() {
        return healthmonitors;
    }

    public void setHealthmonitors(List<HealthMonitor> healthmonitors) {
        this.healthmonitors = healthmonitors;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListHealthMonitorsResponse listHealthMonitorsResponse = (ListHealthMonitorsResponse) o;
        return Objects.equals(this.requestId, listHealthMonitorsResponse.requestId)
            && Objects.equals(this.pageInfo, listHealthMonitorsResponse.pageInfo)
            && Objects.equals(this.healthmonitors, listHealthMonitorsResponse.healthmonitors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, pageInfo, healthmonitors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHealthMonitorsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    healthmonitors: ").append(toIndentedString(healthmonitors)).append("\n");
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
