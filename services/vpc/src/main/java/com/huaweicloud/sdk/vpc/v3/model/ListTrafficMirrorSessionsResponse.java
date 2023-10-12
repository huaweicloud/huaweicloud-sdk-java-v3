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
public class ListTrafficMirrorSessionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_sessions")

    private List<TrafficMirrorSession> trafficMirrorSessions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListTrafficMirrorSessionsResponse withTrafficMirrorSessions(
        List<TrafficMirrorSession> trafficMirrorSessions) {
        this.trafficMirrorSessions = trafficMirrorSessions;
        return this;
    }

    public ListTrafficMirrorSessionsResponse addTrafficMirrorSessionsItem(
        TrafficMirrorSession trafficMirrorSessionsItem) {
        if (this.trafficMirrorSessions == null) {
            this.trafficMirrorSessions = new ArrayList<>();
        }
        this.trafficMirrorSessions.add(trafficMirrorSessionsItem);
        return this;
    }

    public ListTrafficMirrorSessionsResponse withTrafficMirrorSessions(
        Consumer<List<TrafficMirrorSession>> trafficMirrorSessionsSetter) {
        if (this.trafficMirrorSessions == null) {
            this.trafficMirrorSessions = new ArrayList<>();
        }
        trafficMirrorSessionsSetter.accept(this.trafficMirrorSessions);
        return this;
    }

    /**
     * 流量镜像会话
     * @return trafficMirrorSessions
     */
    public List<TrafficMirrorSession> getTrafficMirrorSessions() {
        return trafficMirrorSessions;
    }

    public void setTrafficMirrorSessions(List<TrafficMirrorSession> trafficMirrorSessions) {
        this.trafficMirrorSessions = trafficMirrorSessions;
    }

    public ListTrafficMirrorSessionsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListTrafficMirrorSessionsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListTrafficMirrorSessionsResponse withRequestId(String requestId) {
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
        ListTrafficMirrorSessionsResponse that = (ListTrafficMirrorSessionsResponse) obj;
        return Objects.equals(this.trafficMirrorSessions, that.trafficMirrorSessions)
            && Objects.equals(this.pageInfo, that.pageInfo) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trafficMirrorSessions, pageInfo, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTrafficMirrorSessionsResponse {\n");
        sb.append("    trafficMirrorSessions: ").append(toIndentedString(trafficMirrorSessions)).append("\n");
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
