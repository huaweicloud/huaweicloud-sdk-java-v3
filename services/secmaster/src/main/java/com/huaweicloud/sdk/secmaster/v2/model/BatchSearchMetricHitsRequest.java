package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchSearchMetricHitsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timespan")

    private String timespan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cache")

    private Boolean cache;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchSearchMetricHitsRequestBody body;

    public BatchSearchMetricHitsRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public BatchSearchMetricHitsRequest withTimespan(String timespan) {
        this.timespan = timespan;
        return this;
    }

    /**
     * 查询指标的时间范围，ISO8601格式，例如：2007-03-01T13:00:00Z/2008-05-11T15:30:00Z或2007-03-01T13:00:00Z/P1Y2M10DT2H30M或P1Y2M10DT2H30M/2008-05-11T15:30:00Z
     * @return timespan
     */
    public String getTimespan() {
        return timespan;
    }

    public void setTimespan(String timespan) {
        this.timespan = timespan;
    }

    public BatchSearchMetricHitsRequest withCache(Boolean cache) {
        this.cache = cache;
        return this;
    }

    /**
     * 是否启用缓存，默认true, 禁用缓存 false
     * @return cache
     */
    public Boolean getCache() {
        return cache;
    }

    public void setCache(Boolean cache) {
        this.cache = cache;
    }

    public BatchSearchMetricHitsRequest withBody(BatchSearchMetricHitsRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchSearchMetricHitsRequest withBody(Consumer<BatchSearchMetricHitsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchSearchMetricHitsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchSearchMetricHitsRequestBody getBody() {
        return body;
    }

    public void setBody(BatchSearchMetricHitsRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchSearchMetricHitsRequest that = (BatchSearchMetricHitsRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.timespan, that.timespan)
            && Objects.equals(this.cache, that.cache) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, timespan, cache, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchSearchMetricHitsRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    timespan: ").append(toIndentedString(timespan)).append("\n");
        sb.append("    cache: ").append(toIndentedString(cache)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
