package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateAdhocQueryRequestBody
 */
public class CreateAdhocQueryRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_type")

    private String queryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private Long from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private Long to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_params")

    private List<ScriptParam> scriptParams = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_render_from")

    private Long sqlRenderFrom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_render_to")

    private Long sqlRenderTo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_page")

    private String sourcePage;

    public CreateAdhocQueryRequestBody withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * UUID
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public CreateAdhocQueryRequestBody withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * 具体查询
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public CreateAdhocQueryRequestBody withQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }

    /**
     * 查询类型
     * @return queryType
     */
    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public CreateAdhocQueryRequestBody withFrom(Long from) {
        this.from = from;
        return this;
    }

    /**
     * 起始范围
     * minimum: 0
     * maximum: -9223372036854775616
     * @return from
     */
    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public CreateAdhocQueryRequestBody withTo(Long to) {
        this.to = to;
        return this;
    }

    /**
     * 终止范围
     * minimum: 0
     * maximum: -9223372036854775616
     * @return to
     */
    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    public CreateAdhocQueryRequestBody withScriptParams(List<ScriptParam> scriptParams) {
        this.scriptParams = scriptParams;
        return this;
    }

    public CreateAdhocQueryRequestBody addScriptParamsItem(ScriptParam scriptParamsItem) {
        if (this.scriptParams == null) {
            this.scriptParams = new ArrayList<>();
        }
        this.scriptParams.add(scriptParamsItem);
        return this;
    }

    public CreateAdhocQueryRequestBody withScriptParams(Consumer<List<ScriptParam>> scriptParamsSetter) {
        if (this.scriptParams == null) {
            this.scriptParams = new ArrayList<>();
        }
        scriptParamsSetter.accept(this.scriptParams);
        return this;
    }

    /**
     * 脚本参数列表
     * @return scriptParams
     */
    public List<ScriptParam> getScriptParams() {
        return scriptParams;
    }

    public void setScriptParams(List<ScriptParam> scriptParams) {
        this.scriptParams = scriptParams;
    }

    public CreateAdhocQueryRequestBody withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * 时区
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public CreateAdhocQueryRequestBody withSqlRenderFrom(Long sqlRenderFrom) {
        this.sqlRenderFrom = sqlRenderFrom;
        return this;
    }

    /**
     * 起始范围
     * minimum: 0
     * maximum: -9223372036854775616
     * @return sqlRenderFrom
     */
    public Long getSqlRenderFrom() {
        return sqlRenderFrom;
    }

    public void setSqlRenderFrom(Long sqlRenderFrom) {
        this.sqlRenderFrom = sqlRenderFrom;
    }

    public CreateAdhocQueryRequestBody withSqlRenderTo(Long sqlRenderTo) {
        this.sqlRenderTo = sqlRenderTo;
        return this;
    }

    /**
     * 终止范围
     * minimum: 0
     * maximum: -9223372036854775616
     * @return sqlRenderTo
     */
    public Long getSqlRenderTo() {
        return sqlRenderTo;
    }

    public void setSqlRenderTo(Long sqlRenderTo) {
        this.sqlRenderTo = sqlRenderTo;
    }

    public CreateAdhocQueryRequestBody withSourcePage(String sourcePage) {
        this.sourcePage = sourcePage;
        return this;
    }

    /**
     * 源页
     * @return sourcePage
     */
    public String getSourcePage() {
        return sourcePage;
    }

    public void setSourcePage(String sourcePage) {
        this.sourcePage = sourcePage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAdhocQueryRequestBody that = (CreateAdhocQueryRequestBody) obj;
        return Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.query, that.query)
            && Objects.equals(this.queryType, that.queryType) && Objects.equals(this.from, that.from)
            && Objects.equals(this.to, that.to) && Objects.equals(this.scriptParams, that.scriptParams)
            && Objects.equals(this.timeZone, that.timeZone) && Objects.equals(this.sqlRenderFrom, that.sqlRenderFrom)
            && Objects.equals(this.sqlRenderTo, that.sqlRenderTo) && Objects.equals(this.sourcePage, that.sourcePage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionId,
            query,
            queryType,
            from,
            to,
            scriptParams,
            timeZone,
            sqlRenderFrom,
            sqlRenderTo,
            sourcePage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAdhocQueryRequestBody {\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    scriptParams: ").append(toIndentedString(scriptParams)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    sqlRenderFrom: ").append(toIndentedString(sqlRenderFrom)).append("\n");
        sb.append("    sqlRenderTo: ").append(toIndentedString(sqlRenderTo)).append("\n");
        sb.append("    sourcePage: ").append(toIndentedString(sourcePage)).append("\n");
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
