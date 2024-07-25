package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListOrchestrationsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orchestration_name")

    private String orchestrationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "precise_search")

    private String preciseSearch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orchestration_id")

    private String orchestrationId;

    public ListOrchestrationsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID，在API网关控制台的“实例信息”中获取。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListOrchestrationsRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询，偏移量小于0时，自动转换为0
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListOrchestrationsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量，条目数量小于等于0时，自动转换为20，条目数量大于500时，自动转换为500
     * minimum: 1
     * maximum: 500
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListOrchestrationsRequest withOrchestrationName(String orchestrationName) {
        this.orchestrationName = orchestrationName;
        return this;
    }

    /**
     * 编排规则名称。
     * @return orchestrationName
     */
    public String getOrchestrationName() {
        return orchestrationName;
    }

    public void setOrchestrationName(String orchestrationName) {
        this.orchestrationName = orchestrationName;
    }

    public ListOrchestrationsRequest withPreciseSearch(String preciseSearch) {
        this.preciseSearch = preciseSearch;
        return this;
    }

    /**
     * 指定需要精确匹配查找的参数名称，多个参数需要支持精确匹配时参数之间使用“,”隔开。当前仅支持orchestration_name。
     * @return preciseSearch
     */
    public String getPreciseSearch() {
        return preciseSearch;
    }

    public void setPreciseSearch(String preciseSearch) {
        this.preciseSearch = preciseSearch;
    }

    public ListOrchestrationsRequest withOrchestrationId(String orchestrationId) {
        this.orchestrationId = orchestrationId;
        return this;
    }

    /**
     * 编排规则编号。  支持指定多个编号作为查询条件，多个参数之间使用“,”隔开，支持的查询参数个数与api允许绑定的参数规则上限保持一致，具体请参考产品介绍的“配额说明”章节。
     * @return orchestrationId
     */
    public String getOrchestrationId() {
        return orchestrationId;
    }

    public void setOrchestrationId(String orchestrationId) {
        this.orchestrationId = orchestrationId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOrchestrationsRequest that = (ListOrchestrationsRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.orchestrationName, that.orchestrationName)
            && Objects.equals(this.preciseSearch, that.preciseSearch)
            && Objects.equals(this.orchestrationId, that.orchestrationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, offset, limit, orchestrationName, preciseSearch, orchestrationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOrchestrationsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    orchestrationName: ").append(toIndentedString(orchestrationName)).append("\n");
        sb.append("    preciseSearch: ").append(toIndentedString(preciseSearch)).append("\n");
        sb.append("    orchestrationId: ").append(toIndentedString(orchestrationId)).append("\n");
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
