package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateSqlRenderRequestBody
 */
public class CreateSqlRenderRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_params")

    private List<ScriptParam> scriptParams = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transform_query")

    private String transformQuery;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inter_active_params")

    private List<InterActiveParams> interActiveParams = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private Long from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private Long to;

    public CreateSqlRenderRequestBody withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * 查询语句
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public CreateSqlRenderRequestBody withScriptParams(List<ScriptParam> scriptParams) {
        this.scriptParams = scriptParams;
        return this;
    }

    public CreateSqlRenderRequestBody addScriptParamsItem(ScriptParam scriptParamsItem) {
        if (this.scriptParams == null) {
            this.scriptParams = new ArrayList<>();
        }
        this.scriptParams.add(scriptParamsItem);
        return this;
    }

    public CreateSqlRenderRequestBody withScriptParams(Consumer<List<ScriptParam>> scriptParamsSetter) {
        if (this.scriptParams == null) {
            this.scriptParams = new ArrayList<>();
        }
        scriptParamsSetter.accept(this.scriptParams);
        return this;
    }

    /**
     * 脚本参数
     * @return scriptParams
     */
    public List<ScriptParam> getScriptParams() {
        return scriptParams;
    }

    public void setScriptParams(List<ScriptParam> scriptParams) {
        this.scriptParams = scriptParams;
    }

    public CreateSqlRenderRequestBody withTransformQuery(String transformQuery) {
        this.transformQuery = transformQuery;
        return this;
    }

    /**
     * 查询语句
     * @return transformQuery
     */
    public String getTransformQuery() {
        return transformQuery;
    }

    public void setTransformQuery(String transformQuery) {
        this.transformQuery = transformQuery;
    }

    public CreateSqlRenderRequestBody withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Console会话ID
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public CreateSqlRenderRequestBody withTimeZone(String timeZone) {
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

    public CreateSqlRenderRequestBody withInterActiveParams(List<InterActiveParams> interActiveParams) {
        this.interActiveParams = interActiveParams;
        return this;
    }

    public CreateSqlRenderRequestBody addInterActiveParamsItem(InterActiveParams interActiveParamsItem) {
        if (this.interActiveParams == null) {
            this.interActiveParams = new ArrayList<>();
        }
        this.interActiveParams.add(interActiveParamsItem);
        return this;
    }

    public CreateSqlRenderRequestBody withInterActiveParams(Consumer<List<InterActiveParams>> interActiveParamsSetter) {
        if (this.interActiveParams == null) {
            this.interActiveParams = new ArrayList<>();
        }
        interActiveParamsSetter.accept(this.interActiveParams);
        return this;
    }

    /**
     * 交互参数列表
     * @return interActiveParams
     */
    public List<InterActiveParams> getInterActiveParams() {
        return interActiveParams;
    }

    public void setInterActiveParams(List<InterActiveParams> interActiveParams) {
        this.interActiveParams = interActiveParams;
    }

    public CreateSqlRenderRequestBody withFrom(Long from) {
        this.from = from;
        return this;
    }

    /**
     * 起始
     * minimum: 0
     * maximum: 1735689600000
     * @return from
     */
    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public CreateSqlRenderRequestBody withTo(Long to) {
        this.to = to;
        return this;
    }

    /**
     * 终止
     * minimum: 0
     * maximum: 1735689600000
     * @return to
     */
    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSqlRenderRequestBody that = (CreateSqlRenderRequestBody) obj;
        return Objects.equals(this.query, that.query) && Objects.equals(this.scriptParams, that.scriptParams)
            && Objects.equals(this.transformQuery, that.transformQuery)
            && Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.timeZone, that.timeZone)
            && Objects.equals(this.interActiveParams, that.interActiveParams) && Objects.equals(this.from, that.from)
            && Objects.equals(this.to, that.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(query, scriptParams, transformQuery, sessionId, timeZone, interActiveParams, from, to);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSqlRenderRequestBody {\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    scriptParams: ").append(toIndentedString(scriptParams)).append("\n");
        sb.append("    transformQuery: ").append(toIndentedString(transformQuery)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    interActiveParams: ").append(toIndentedString(interActiveParams)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
