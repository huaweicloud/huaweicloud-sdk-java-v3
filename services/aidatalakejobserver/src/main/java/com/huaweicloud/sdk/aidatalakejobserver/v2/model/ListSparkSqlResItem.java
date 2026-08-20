package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：SparkSql作业的响应参数详情。
 */
public class ListSparkSqlResItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statement_id")

    private String statementId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_token")

    private String clientToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_name")

    private String endpointName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_context")

    private SparkSqlCatalogContextResponse catalogContext;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statement")

    private String statement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private List<SparkSqlParameter> parameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statement_type")

    private String statementType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private SparkSqlErrorDto error;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private SparkSqlResultResponse result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_statistics")

    private SparkSqlMetricStatisticsResponse metricStatistics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_url")

    private String logUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private SparkCreateUser createUser;

    public ListSparkSqlResItem withStatementId(String statementId) {
        this.statementId = statementId;
        return this;
    }

    /**
     * **参数解释**：SparkSql作业的ID，用于唯一标识一次SparkSql作业执行。 **取值范围**：采用UUID格式，长度为36个字符，例如：80ceaaff-3cfc-4162-a56f-70031ea4fa91。
     * @return statementId
     */
    public String getStatementId() {
        return statementId;
    }

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    public ListSparkSqlResItem withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * **参数解释**：SparkSql作业事务ID，用于防止重复提交。 **取值范围**：采用UUID格式，长度为36个字符，例如：xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx。
     * @return clientToken
     */
    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public ListSparkSqlResItem withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * **参数解释**：端点名称，用于指定SparkSql执行环境。 **取值范围**：只能由英文小写字母、数字及中划线组成，以英文小写字母开头，以英文小写字母或数字结尾，且长度为1~63个字符。
     * @return endpointName
     */
    public String getEndpointName() {
        return endpointName;
    }

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    public ListSparkSqlResItem withCatalogContext(SparkSqlCatalogContextResponse catalogContext) {
        this.catalogContext = catalogContext;
        return this;
    }

    public ListSparkSqlResItem withCatalogContext(Consumer<SparkSqlCatalogContextResponse> catalogContextSetter) {
        if (this.catalogContext == null) {
            this.catalogContext = new SparkSqlCatalogContextResponse();
            catalogContextSetter.accept(this.catalogContext);
        }

        return this;
    }

    /**
     * Get catalogContext
     * @return catalogContext
     */
    public SparkSqlCatalogContextResponse getCatalogContext() {
        return catalogContext;
    }

    public void setCatalogContext(SparkSqlCatalogContextResponse catalogContext) {
        this.catalogContext = catalogContext;
    }

    public ListSparkSqlResItem withStatement(String statement) {
        this.statement = statement;
        return this;
    }

    /**
     * **参数解释**：用户SQL语句，用于执行数据查询、数据操作等任务。 **取值范围**：长度不超过500000个字符。
     * @return statement
     */
    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public ListSparkSqlResItem withParameters(List<SparkSqlParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    public ListSparkSqlResItem addParametersItem(SparkSqlParameter parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public ListSparkSqlResItem withParameters(Consumer<List<SparkSqlParameter>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * **参数解释**：用户SQL内容的占位符参数列表，用于动态替换SQL中的参数。
     * @return parameters
     */
    public List<SparkSqlParameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<SparkSqlParameter> parameters) {
        this.parameters = parameters;
    }

    public ListSparkSqlResItem withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释**：SparkSql作业的状态，用于标识作业的执行状态。 **取值范围**： - QUEUED：排队中。 - RUNNING：运行中。 - CANCELING：取消中。 - CANCELED：已取消。 - FAILED：运行失败。 - QUEUED_TIMEOUT：排队超时。 - RUNNING_TIMEOUT：运行超时。 - SUCCEED：运行成功。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ListSparkSqlResItem withStatementType(String statementType) {
        this.statementType = statementType;
        return this;
    }

    /**
     * **参数解释**：SQL作业类型，用于标识作业的类型。 **取值范围**： - DDL：创建修改删除元数据类型的作业、DESC/SHOW等语句。 - DCL：权限授权与回收类型的作业。 - DQL：查询语句SELECT。 - DML：向表追加、删除、更新新数据类型的作业。
     * @return statementType
     */
    public String getStatementType() {
        return statementType;
    }

    public void setStatementType(String statementType) {
        this.statementType = statementType;
    }

    public ListSparkSqlResItem withError(SparkSqlErrorDto error) {
        this.error = error;
        return this;
    }

    public ListSparkSqlResItem withError(Consumer<SparkSqlErrorDto> errorSetter) {
        if (this.error == null) {
            this.error = new SparkSqlErrorDto();
            errorSetter.accept(this.error);
        }

        return this;
    }

    /**
     * Get error
     * @return error
     */
    public SparkSqlErrorDto getError() {
        return error;
    }

    public void setError(SparkSqlErrorDto error) {
        this.error = error;
    }

    public ListSparkSqlResItem withResult(SparkSqlResultResponse result) {
        this.result = result;
        return this;
    }

    public ListSparkSqlResItem withResult(Consumer<SparkSqlResultResponse> resultSetter) {
        if (this.result == null) {
            this.result = new SparkSqlResultResponse();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public SparkSqlResultResponse getResult() {
        return result;
    }

    public void setResult(SparkSqlResultResponse result) {
        this.result = result;
    }

    public ListSparkSqlResItem withMetricStatistics(SparkSqlMetricStatisticsResponse metricStatistics) {
        this.metricStatistics = metricStatistics;
        return this;
    }

    public ListSparkSqlResItem withMetricStatistics(Consumer<SparkSqlMetricStatisticsResponse> metricStatisticsSetter) {
        if (this.metricStatistics == null) {
            this.metricStatistics = new SparkSqlMetricStatisticsResponse();
            metricStatisticsSetter.accept(this.metricStatistics);
        }

        return this;
    }

    /**
     * Get metricStatistics
     * @return metricStatistics
     */
    public SparkSqlMetricStatisticsResponse getMetricStatistics() {
        return metricStatistics;
    }

    public void setMetricStatistics(SparkSqlMetricStatisticsResponse metricStatistics) {
        this.metricStatistics = metricStatistics;
    }

    public ListSparkSqlResItem withLogUrl(String logUrl) {
        this.logUrl = logUrl;
        return this;
    }

    /**
     * **参数解释**：日志OBS归档路径，用于存储作业执行日志。 **取值范围**：采用OBS路径格式，例如：obs://bucket/aidatalake/workspace_xxx/spark/endpoint_xxx/jobs/logs/2026_04_27/sql-engine-{statement_id}/spark.log。
     * @return logUrl
     */
    public String getLogUrl() {
        return logUrl;
    }

    public void setLogUrl(String logUrl) {
        this.logUrl = logUrl;
    }

    public ListSparkSqlResItem withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**：作业创建时间，采用unix时间戳格式。 **取值范围**：单位为毫秒。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ListSparkSqlResItem withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**：作业开始运行时间，采用unix时间戳格式。 **取值范围**：单位为毫秒。
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListSparkSqlResItem withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**：作业结束时间，采用unix时间戳格式。 **取值范围**：单位为毫秒。
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListSparkSqlResItem withCreateUser(SparkCreateUser createUser) {
        this.createUser = createUser;
        return this;
    }

    public ListSparkSqlResItem withCreateUser(Consumer<SparkCreateUser> createUserSetter) {
        if (this.createUser == null) {
            this.createUser = new SparkCreateUser();
            createUserSetter.accept(this.createUser);
        }

        return this;
    }

    /**
     * Get createUser
     * @return createUser
     */
    public SparkCreateUser getCreateUser() {
        return createUser;
    }

    public void setCreateUser(SparkCreateUser createUser) {
        this.createUser = createUser;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSparkSqlResItem that = (ListSparkSqlResItem) obj;
        return Objects.equals(this.statementId, that.statementId) && Objects.equals(this.clientToken, that.clientToken)
            && Objects.equals(this.endpointName, that.endpointName)
            && Objects.equals(this.catalogContext, that.catalogContext)
            && Objects.equals(this.statement, that.statement) && Objects.equals(this.parameters, that.parameters)
            && Objects.equals(this.state, that.state) && Objects.equals(this.statementType, that.statementType)
            && Objects.equals(this.error, that.error) && Objects.equals(this.result, that.result)
            && Objects.equals(this.metricStatistics, that.metricStatistics) && Objects.equals(this.logUrl, that.logUrl)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.createUser, that.createUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statementId,
            clientToken,
            endpointName,
            catalogContext,
            statement,
            parameters,
            state,
            statementType,
            error,
            result,
            metricStatistics,
            logUrl,
            createTime,
            startTime,
            endTime,
            createUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSparkSqlResItem {\n");
        sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
        sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
        sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
        sb.append("    catalogContext: ").append(toIndentedString(catalogContext)).append("\n");
        sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    statementType: ").append(toIndentedString(statementType)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    metricStatistics: ").append(toIndentedString(metricStatistics)).append("\n");
        sb.append("    logUrl: ").append(toIndentedString(logUrl)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
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
