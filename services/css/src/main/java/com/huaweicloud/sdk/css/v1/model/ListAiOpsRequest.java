package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAiOpsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private Integer start;

    public ListAiOpsRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 指定待查询的集群ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ListAiOpsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页参数，列表当前分页的数量限制。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAiOpsRequest withStart(Integer start) {
        this.start = start;
        return this;
    }

    /**
     * 偏移量。 偏移量为一个大于0小于终端节点服务总个数的整数， 表示从偏移量后面的终端节点服务开始查询。
     * @return start
     */
    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAiOpsRequest that = (ListAiOpsRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.start, that.start);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, limit, start);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAiOpsRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
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
