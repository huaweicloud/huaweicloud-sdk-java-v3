package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListLogtanksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_reverse")

    private Boolean pageReverse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private List<String> enterpriseProjectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_id")

    private List<String> loadbalancerId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private List<String> logGroupId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_topic_id")

    private List<String> logTopicId = null;

    public ListLogtanksRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页返回的个数。
     * minimum: 0
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListLogtanksRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 上一页最后一条记录的ID。  使用说明： - 必须与limit一起使用。 - 不指定时表示查询第一页。 - 该字段不允许为空或无效的ID。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListLogtanksRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    /**
     * 是否反向查询。取值： - true：查询上一页。 - false：查询下一页，默认。  使用说明： - 必须与limit一起使用。 - 当page_reverse=true时，若要查询上一页，marker取值为当前页返回值的previous_marker
     * @return pageReverse
     */
    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    public ListLogtanksRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public ListLogtanksRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListLogtanksRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        enterpriseProjectIdSetter.accept(this.enterpriseProjectId);
        return this;
    }

    /**
     * 企业项目ID。 支持多值查询，查询条件格式：enterprise_project_id=xxx&enterprise_project_id=xxx。  [不支持该字段，请勿使用。](tag:dt,dt_test,hcso_dt)
     * @return enterpriseProjectId
     */
    public List<String> getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListLogtanksRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListLogtanksRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListLogtanksRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 云日志记录ID。 支持多值查询，查询条件格式：id=xxx&id=xxx。
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListLogtanksRequest withLoadbalancerId(List<String> loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    public ListLogtanksRequest addLoadbalancerIdItem(String loadbalancerIdItem) {
        if (this.loadbalancerId == null) {
            this.loadbalancerId = new ArrayList<>();
        }
        this.loadbalancerId.add(loadbalancerIdItem);
        return this;
    }

    public ListLogtanksRequest withLoadbalancerId(Consumer<List<String>> loadbalancerIdSetter) {
        if (this.loadbalancerId == null) {
            this.loadbalancerId = new ArrayList<>();
        }
        loadbalancerIdSetter.accept(this.loadbalancerId);
        return this;
    }

    /**
     * 负载均衡器ID。 支持多值查询，查询条件格式：loadbalancer_id=xxx&loadbalancer_id=xxx。
     * @return loadbalancerId
     */
    public List<String> getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(List<String> loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    public ListLogtanksRequest withLogGroupId(List<String> logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    public ListLogtanksRequest addLogGroupIdItem(String logGroupIdItem) {
        if (this.logGroupId == null) {
            this.logGroupId = new ArrayList<>();
        }
        this.logGroupId.add(logGroupIdItem);
        return this;
    }

    public ListLogtanksRequest withLogGroupId(Consumer<List<String>> logGroupIdSetter) {
        if (this.logGroupId == null) {
            this.logGroupId = new ArrayList<>();
        }
        logGroupIdSetter.accept(this.logGroupId);
        return this;
    }

    /**
     * 云日志分组ID。 支持多值查询，查询条件格式：log_group_id=xxx&log_group_id=xxx。
     * @return logGroupId
     */
    public List<String> getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(List<String> logGroupId) {
        this.logGroupId = logGroupId;
    }

    public ListLogtanksRequest withLogTopicId(List<String> logTopicId) {
        this.logTopicId = logTopicId;
        return this;
    }

    public ListLogtanksRequest addLogTopicIdItem(String logTopicIdItem) {
        if (this.logTopicId == null) {
            this.logTopicId = new ArrayList<>();
        }
        this.logTopicId.add(logTopicIdItem);
        return this;
    }

    public ListLogtanksRequest withLogTopicId(Consumer<List<String>> logTopicIdSetter) {
        if (this.logTopicId == null) {
            this.logTopicId = new ArrayList<>();
        }
        logTopicIdSetter.accept(this.logTopicId);
        return this;
    }

    /**
     * 云日志主题ID 支持多值查询，查询条件格式：log_topic_id=xxx&log_topic_id=xxx。
     * @return logTopicId
     */
    public List<String> getLogTopicId() {
        return logTopicId;
    }

    public void setLogTopicId(List<String> logTopicId) {
        this.logTopicId = logTopicId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLogtanksRequest listLogtanksRequest = (ListLogtanksRequest) o;
        return Objects.equals(this.limit, listLogtanksRequest.limit)
            && Objects.equals(this.marker, listLogtanksRequest.marker)
            && Objects.equals(this.pageReverse, listLogtanksRequest.pageReverse)
            && Objects.equals(this.enterpriseProjectId, listLogtanksRequest.enterpriseProjectId)
            && Objects.equals(this.id, listLogtanksRequest.id)
            && Objects.equals(this.loadbalancerId, listLogtanksRequest.loadbalancerId)
            && Objects.equals(this.logGroupId, listLogtanksRequest.logGroupId)
            && Objects.equals(this.logTopicId, listLogtanksRequest.logTopicId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(limit, marker, pageReverse, enterpriseProjectId, id, loadbalancerId, logGroupId, logTopicId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLogtanksRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logTopicId: ").append(toIndentedString(logTopicId)).append("\n");
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
