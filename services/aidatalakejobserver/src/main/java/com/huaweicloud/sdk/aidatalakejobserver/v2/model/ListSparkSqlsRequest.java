package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListSparkSqlsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_reverse")

    private Boolean pageReverse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_name")

    private String endpointName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statement")

    private String statement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_after")

    private Long createTimeAfter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_before")

    private Long createTimeBefore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "states")

    private List<String> states = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statement_types")

    private List<String> statementTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statement_id")

    private String statementId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user_id")

    private String createUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user_name")

    private String createUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private String labels;

    public ListSparkSqlsRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**：工作空间的ID。 **约束限制**：不涉及。 **取值范围**：长度为1~36个字符，支持大小写英文字母、数字、连字符。 **默认取值**：不涉及。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ListSparkSqlsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * **参数解释**：作业ID游标位置，用于分页查询。 **约束限制**：不涉及。 **取值范围**：采用UUID格式，长度为36个字符。 **默认取值**：首次查询可不传或传空字符串，后续查询传入上次返回的next_marker值。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListSparkSqlsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**：查询记录数，用于指定返回的作业数量。 **约束限制**：不涉及。 **取值范围**：1~100。 **默认取值**：10。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSparkSqlsRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    /**
     * **参数解释**：是否反向分页查询。默认为false，表示正向分页查询。 当设置为true时，表示查询上一页数据，需要配合marker参数使用。
     * @return pageReverse
     */
    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    public ListSparkSqlsRequest withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * **参数解释**：端点名称，用于指定查询的SparkSql执行环境。 **约束限制**：不涉及。 **取值范围**：只能由英文小写字母、数字及中划线组成，以英文小写字母开头，以英文小写字母或数字结尾，且长度为1~63个字符。 **默认取值**：不涉及。
     * @return endpointName
     */
    public String getEndpointName() {
        return endpointName;
    }

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    public ListSparkSqlsRequest withStatement(String statement) {
        this.statement = statement;
        return this;
    }

    /**
     * **参数解释**：SQL片段，用于模糊查询包含指定SQL片段的作业。 **约束限制**：不涉及。 **取值范围**：长度为1~128个字符。 **默认取值**：不涉及。
     * @return statement
     */
    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public ListSparkSqlsRequest withCreateTimeAfter(Long createTimeAfter) {
        this.createTimeAfter = createTimeAfter;
        return this;
    }

    /**
     * **参数解释**：用于查询创建时间在该时间点之后的作业。 **约束限制**：不涉及。 **取值范围**：采用unix时间戳格式，单位为毫秒，最小值为1764061598000。 **默认取值**：不涉及。
     * minimum: 1764061598000
     * @return createTimeAfter
     */
    public Long getCreateTimeAfter() {
        return createTimeAfter;
    }

    public void setCreateTimeAfter(Long createTimeAfter) {
        this.createTimeAfter = createTimeAfter;
    }

    public ListSparkSqlsRequest withCreateTimeBefore(Long createTimeBefore) {
        this.createTimeBefore = createTimeBefore;
        return this;
    }

    /**
     * **参数解释**：用于查询创建时间在该时间点之前的作业。 **约束限制**：不涉及。 **取值范围**：采用unix时间戳格式，单位为毫秒，最小值为1764061598000。 **默认取值**：不涉及。
     * minimum: 1764061598000
     * @return createTimeBefore
     */
    public Long getCreateTimeBefore() {
        return createTimeBefore;
    }

    public void setCreateTimeBefore(Long createTimeBefore) {
        this.createTimeBefore = createTimeBefore;
    }

    public ListSparkSqlsRequest withStates(List<String> states) {
        this.states = states;
        return this;
    }

    public ListSparkSqlsRequest addStatesItem(String statesItem) {
        if (this.states == null) {
            this.states = new ArrayList<>();
        }
        this.states.add(statesItem);
        return this;
    }

    public ListSparkSqlsRequest withStates(Consumer<List<String>> statesSetter) {
        if (this.states == null) {
            this.states = new ArrayList<>();
        }
        statesSetter.accept(this.states);
        return this;
    }

    /**
     * **参数解释**：SparkSql作业的状态列表，用于按状态过滤作业。 **约束限制**：数组元素数量不能超过10个。
     * @return states
     */
    public List<String> getStates() {
        return states;
    }

    public void setStates(List<String> states) {
        this.states = states;
    }

    public ListSparkSqlsRequest withStatementTypes(List<String> statementTypes) {
        this.statementTypes = statementTypes;
        return this;
    }

    public ListSparkSqlsRequest addStatementTypesItem(String statementTypesItem) {
        if (this.statementTypes == null) {
            this.statementTypes = new ArrayList<>();
        }
        this.statementTypes.add(statementTypesItem);
        return this;
    }

    public ListSparkSqlsRequest withStatementTypes(Consumer<List<String>> statementTypesSetter) {
        if (this.statementTypes == null) {
            this.statementTypes = new ArrayList<>();
        }
        statementTypesSetter.accept(this.statementTypes);
        return this;
    }

    /**
     * **参数解释**：作业类型列表，用于按作业类型过滤作业。 **约束限制**：数组元素数量不能超过4个。
     * @return statementTypes
     */
    public List<String> getStatementTypes() {
        return statementTypes;
    }

    public void setStatementTypes(List<String> statementTypes) {
        this.statementTypes = statementTypes;
    }

    public ListSparkSqlsRequest withStatementId(String statementId) {
        this.statementId = statementId;
        return this;
    }

    /**
     * **参数解释**：SparkSql作业ID，用于查询指定作业。 **约束限制**：不涉及。 **取值范围**：只能由英文字母（不区分大小写）、数字、下划线及中划线组成，且长度为1~64个字符。 **默认取值**：不涉及。
     * @return statementId
     */
    public String getStatementId() {
        return statementId;
    }

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    public ListSparkSqlsRequest withCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }

    /**
     * **参数解释**：作业创建者ID，用于按创建者过滤作业。 **约束限制**：不涉及。 **取值范围**：长度为1~256个字符。 **默认取值**：不涉及。
     * @return createUserId
     */
    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public ListSparkSqlsRequest withCreateUserName(String createUserName) {
        this.createUserName = createUserName;
        return this;
    }

    /**
     * **参数解释**：作业创建者名称，用于按创建者精确过滤作业。 **约束限制**：不涉及。 **取值范围**：长度为1~256个字符。 **默认取值**：不涉及。 
     * @return createUserName
     */
    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public ListSparkSqlsRequest withLabels(String labels) {
        this.labels = labels;
        return this;
    }

    /**
     * **参数解释**：作业标签，用于按标签过滤作业。格式为“key=value”，其中“=”需要URL编码为“%3D”。 **约束限制**：不涉及。 **取值范围**：长度为1~1024个字符。 **默认取值**：不涉及。
     * @return labels
     */
    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSparkSqlsRequest that = (ListSparkSqlsRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.pageReverse, that.pageReverse)
            && Objects.equals(this.endpointName, that.endpointName) && Objects.equals(this.statement, that.statement)
            && Objects.equals(this.createTimeAfter, that.createTimeAfter)
            && Objects.equals(this.createTimeBefore, that.createTimeBefore) && Objects.equals(this.states, that.states)
            && Objects.equals(this.statementTypes, that.statementTypes)
            && Objects.equals(this.statementId, that.statementId)
            && Objects.equals(this.createUserId, that.createUserId)
            && Objects.equals(this.createUserName, that.createUserName) && Objects.equals(this.labels, that.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId,
            marker,
            limit,
            pageReverse,
            endpointName,
            statement,
            createTimeAfter,
            createTimeBefore,
            states,
            statementTypes,
            statementId,
            createUserId,
            createUserName,
            labels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSparkSqlsRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
        sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
        sb.append("    createTimeAfter: ").append(toIndentedString(createTimeAfter)).append("\n");
        sb.append("    createTimeBefore: ").append(toIndentedString(createTimeBefore)).append("\n");
        sb.append("    states: ").append(toIndentedString(states)).append("\n");
        sb.append("    statementTypes: ").append(toIndentedString(statementTypes)).append("\n");
        sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
        sb.append("    createUserId: ").append(toIndentedString(createUserId)).append("\n");
        sb.append("    createUserName: ").append(toIndentedString(createUserName)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
