package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：执行查询请求体。 **约束限制**：不涉及。
 */
public class StatementExecuteRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statement")

    private String statement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bindings")

    private List<List<String>> bindings = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_sync")

    private Boolean isSync;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_maintain_statement")

    private Boolean isMaintainStatement;

    /**
     * **参数解释**：获取结果集的方式。 **约束限制**：不涉及。 **取值范围**：   - DEFAULT：直接返回结果集。   - READ_OBS：返回结果集在桶上的路径，而不是直接返回结果集。 **默认取值**：DEFAULT。
     */
    public static final class ResultsetFetchModeEnum {

        /**
         * Enum DEFAULT for value: "DEFAULT"
         */
        public static final ResultsetFetchModeEnum DEFAULT = new ResultsetFetchModeEnum("DEFAULT");

        /**
         * Enum READ_OBS for value: "READ_OBS"
         */
        public static final ResultsetFetchModeEnum READ_OBS = new ResultsetFetchModeEnum("READ_OBS");

        private static final Map<String, ResultsetFetchModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResultsetFetchModeEnum> createStaticFields() {
            Map<String, ResultsetFetchModeEnum> map = new HashMap<>();
            map.put("DEFAULT", DEFAULT);
            map.put("READ_OBS", READ_OBS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResultsetFetchModeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ResultsetFetchModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResultsetFetchModeEnum(value));
        }

        public static ResultsetFetchModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResultsetFetchModeEnum) {
                return this.value.equals(((ResultsetFetchModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resultset_fetch_mode")

    private ResultsetFetchModeEnum resultsetFetchMode;

    public StatementExecuteRequestBody withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * **参数解释**：Session的ID。 **取值范围**：长度为1~36个字符，支持大小写英文字母、数字、连字符。
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public StatementExecuteRequestBody withStatement(String statement) {
        this.statement = statement;
        return this;
    }

    /**
     * **参数解释**：SQL statement信息。 **约束限制**：不涉及。 **取值范围**：0~10000000。 **默认取值**：不涉及。
     * @return statement
     */
    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public StatementExecuteRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**：limit限制。 **约束限制**：不涉及。 **取值范围**：1~2147483647。 **默认取值**：不涉及。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public StatementExecuteRequestBody withBindings(List<List<String>> bindings) {
        this.bindings = bindings;
        return this;
    }

    public StatementExecuteRequestBody addBindingsItem(List<String> bindingsItem) {
        if (this.bindings == null) {
            this.bindings = new ArrayList<>();
        }
        this.bindings.add(bindingsItem);
        return this;
    }

    public StatementExecuteRequestBody withBindings(Consumer<List<List<String>>> bindingsSetter) {
        if (this.bindings == null) {
            this.bindings = new ArrayList<>();
        }
        bindingsSetter.accept(this.bindings);
        return this;
    }

    /**
     * **参数解释**：参数绑定列表。 **约束限制**：不涉及。 **取值范围**：0~10000。 **默认取值**：不涉及。
     * @return bindings
     */
    public List<List<String>> getBindings() {
        return bindings;
    }

    public void setBindings(List<List<String>> bindings) {
        this.bindings = bindings;
    }

    public StatementExecuteRequestBody withIsSync(Boolean isSync) {
        this.isSync = isSync;
        return this;
    }

    /**
     * **参数解释**：同步执行或异步执行。 **约束限制**：不涉及。 **取值范围**：   - true：同步。   - false：异步。 **默认取值**：不涉及。
     * @return isSync
     */
    public Boolean getIsSync() {
        return isSync;
    }

    public void setIsSync(Boolean isSync) {
        this.isSync = isSync;
    }

    public StatementExecuteRequestBody withIsMaintainStatement(Boolean isMaintainStatement) {
        this.isMaintainStatement = isMaintainStatement;
        return this;
    }

    /**
     * **参数解释**：是否来自运维通道。 **约束限制**：不涉及。 **取值范围**：  - true：运维通道语句。  - false：不是运维通道语句。 **默认取值**：不涉及。
     * @return isMaintainStatement
     */
    public Boolean getIsMaintainStatement() {
        return isMaintainStatement;
    }

    public void setIsMaintainStatement(Boolean isMaintainStatement) {
        this.isMaintainStatement = isMaintainStatement;
    }

    public StatementExecuteRequestBody withResultsetFetchMode(ResultsetFetchModeEnum resultsetFetchMode) {
        this.resultsetFetchMode = resultsetFetchMode;
        return this;
    }

    /**
     * **参数解释**：获取结果集的方式。 **约束限制**：不涉及。 **取值范围**：   - DEFAULT：直接返回结果集。   - READ_OBS：返回结果集在桶上的路径，而不是直接返回结果集。 **默认取值**：DEFAULT。
     * @return resultsetFetchMode
     */
    public ResultsetFetchModeEnum getResultsetFetchMode() {
        return resultsetFetchMode;
    }

    public void setResultsetFetchMode(ResultsetFetchModeEnum resultsetFetchMode) {
        this.resultsetFetchMode = resultsetFetchMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StatementExecuteRequestBody that = (StatementExecuteRequestBody) obj;
        return Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.statement, that.statement)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.bindings, that.bindings)
            && Objects.equals(this.isSync, that.isSync)
            && Objects.equals(this.isMaintainStatement, that.isMaintainStatement)
            && Objects.equals(this.resultsetFetchMode, that.resultsetFetchMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionId, statement, limit, bindings, isSync, isMaintainStatement, resultsetFetchMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatementExecuteRequestBody {\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    bindings: ").append(toIndentedString(bindings)).append("\n");
        sb.append("    isSync: ").append(toIndentedString(isSync)).append("\n");
        sb.append("    isMaintainStatement: ").append(toIndentedString(isMaintainStatement)).append("\n");
        sb.append("    resultsetFetchMode: ").append(toIndentedString(resultsetFetchMode)).append("\n");
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
