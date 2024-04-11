package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 数据库表过滤规则响应体
 */
public class DbObjectFilteringResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    /**
     * 对比的来源 - job 表示数据同步时的过滤 - compare 表示数据对比的过滤
     */
    public static final class SourceEnum {

        /**
         * Enum JOB for value: "job"
         */
        public static final SourceEnum JOB = new SourceEnum("job");

        /**
         * Enum COMPARE for value: "compare"
         */
        public static final SourceEnum COMPARE = new SourceEnum("compare");

        private static final Map<String, SourceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SourceEnum> createStaticFields() {
            Map<String, SourceEnum> map = new HashMap<>();
            map.put("job", JOB);
            map.put("compare", COMPARE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SourceEnum(String value) {
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
        public static SourceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SourceEnum(value));
        }

        public static SourceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SourceEnum) {
                return this.value.equals(((SourceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private SourceEnum source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_result")

    private String targetResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_result")

    private String sourceResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_message")

    private String targetMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_message")

    private String sourceMessage;

    public DbObjectFilteringResult withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据库库名。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public DbObjectFilteringResult withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * 数据库Schema名称。
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public DbObjectFilteringResult withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 数据库表名称。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public DbObjectFilteringResult withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 数据过滤校验结果。
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public DbObjectFilteringResult withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 当数据过滤校验结果是false，返回校验失败的原因。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DbObjectFilteringResult withSource(SourceEnum source) {
        this.source = source;
        return this;
    }

    /**
     * 对比的来源 - job 表示数据同步时的过滤 - compare 表示数据对比的过滤
     * @return source
     */
    public SourceEnum getSource() {
        return source;
    }

    public void setSource(SourceEnum source) {
        this.source = source;
    }

    public DbObjectFilteringResult withTargetResult(String targetResult) {
        this.targetResult = targetResult;
        return this;
    }

    /**
     * 校验目标库比对条件过滤的结果
     * @return targetResult
     */
    public String getTargetResult() {
        return targetResult;
    }

    public void setTargetResult(String targetResult) {
        this.targetResult = targetResult;
    }

    public DbObjectFilteringResult withSourceResult(String sourceResult) {
        this.sourceResult = sourceResult;
        return this;
    }

    /**
     * 校验源库比对条件过滤的结果
     * @return sourceResult
     */
    public String getSourceResult() {
        return sourceResult;
    }

    public void setSourceResult(String sourceResult) {
        this.sourceResult = sourceResult;
    }

    public DbObjectFilteringResult withTargetMessage(String targetMessage) {
        this.targetMessage = targetMessage;
        return this;
    }

    /**
     * 校验目标库比对条件过滤的失败原因
     * @return targetMessage
     */
    public String getTargetMessage() {
        return targetMessage;
    }

    public void setTargetMessage(String targetMessage) {
        this.targetMessage = targetMessage;
    }

    public DbObjectFilteringResult withSourceMessage(String sourceMessage) {
        this.sourceMessage = sourceMessage;
        return this;
    }

    /**
     * 校验源库比对条件过滤的失败原因
     * @return sourceMessage
     */
    public String getSourceMessage() {
        return sourceMessage;
    }

    public void setSourceMessage(String sourceMessage) {
        this.sourceMessage = sourceMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DbObjectFilteringResult that = (DbObjectFilteringResult) obj;
        return Objects.equals(this.dbName, that.dbName) && Objects.equals(this.schemaName, that.schemaName)
            && Objects.equals(this.tableName, that.tableName) && Objects.equals(this.isSuccess, that.isSuccess)
            && Objects.equals(this.message, that.message) && Objects.equals(this.source, that.source)
            && Objects.equals(this.targetResult, that.targetResult)
            && Objects.equals(this.sourceResult, that.sourceResult)
            && Objects.equals(this.targetMessage, that.targetMessage)
            && Objects.equals(this.sourceMessage, that.sourceMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbName,
            schemaName,
            tableName,
            isSuccess,
            message,
            source,
            targetResult,
            sourceResult,
            targetMessage,
            sourceMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DbObjectFilteringResult {\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    targetResult: ").append(toIndentedString(targetResult)).append("\n");
        sb.append("    sourceResult: ").append(toIndentedString(sourceResult)).append("\n");
        sb.append("    targetMessage: ").append(toIndentedString(targetMessage)).append("\n");
        sb.append("    sourceMessage: ").append(toIndentedString(sourceMessage)).append("\n");
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
