package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListJobsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_ids")

    private String requestIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListJobsRequest withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 任务下发请求时响应的request_id。 request_id和request_ids必须指定其中一个。request_id和request_ids同时指定的时候，以request_ids为准。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListJobsRequest withRequestIds(String requestIds) {
        this.requestIds = requestIds;
        return this;
    }

    /**
     * 任务下发请求时响应的多个request_id，用逗号分隔，最多不能超过20个。 request_id和request_ids必须指定其中一个。request_id和request_ids同时指定的时候，以request_ids为准。
     * @return requestIds
     */
    public String getRequestIds() {
        return requestIds;
    }

    public void setRequestIds(String requestIds) {
        this.requestIds = requestIds;
    }

    public ListJobsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量为一个大于0小于资源总个数的整数，表示查询该偏移量后面的所有的资源数，默认值为0。
     * minimum: 0
     * maximum: 8096
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListJobsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页返回的资源个数。取值范围：1~100（默认值为100），一般设置为10、20、50。
     * minimum: 0
     * maximum: 8096
     * @return limit
     */
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
        ListJobsRequest listJobsRequest = (ListJobsRequest) o;
        return Objects.equals(this.requestId, listJobsRequest.requestId)
            && Objects.equals(this.requestIds, listJobsRequest.requestIds)
            && Objects.equals(this.offset, listJobsRequest.offset) && Objects.equals(this.limit, listJobsRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, requestIds, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJobsRequest {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    requestIds: ").append(toIndentedString(requestIds)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
