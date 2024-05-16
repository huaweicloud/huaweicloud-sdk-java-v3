package com.huaweicloud.sdk.dli.v1.model;

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
 * 提交SQL作业
 */
public class CreateSqlJobRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private String sql;

    /**
     * 待提交作业的队列引擎名称，名称只能包含英文字母。
     */
    public static final class EngineTypeEnum {

        /**
         * Enum TRINO for value: "trino"
         */
        public static final EngineTypeEnum TRINO = new EngineTypeEnum("trino");

        /**
         * Enum SPARK for value: "spark"
         */
        public static final EngineTypeEnum SPARK = new EngineTypeEnum("spark");

        private static final Map<String, EngineTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineTypeEnum> createStaticFields() {
            Map<String, EngineTypeEnum> map = new HashMap<>();
            map.put("trino", TRINO);
            map.put("spark", SPARK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EngineTypeEnum(String value) {
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
        public static EngineTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EngineTypeEnum(value));
        }

        public static EngineTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EngineTypeEnum) {
                return this.value.equals(((EngineTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private EngineTypeEnum engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_catalog")

    private String currentCatalog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currentdb")

    private String currentdb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conf")

    private List<String> conf = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    public CreateSqlJobRequestBody withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * 待执行的SQL语句。
     * @return sql
     */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public CreateSqlJobRequestBody withEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 待提交作业的队列引擎名称，名称只能包含英文字母。
     * @return engineType
     */
    public EngineTypeEnum getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
    }

    public CreateSqlJobRequestBody withCurrentCatalog(String currentCatalog) {
        this.currentCatalog = currentCatalog;
        return this;
    }

    /**
     * 待提交作业的表默认catalog。
     * @return currentCatalog
     */
    public String getCurrentCatalog() {
        return currentCatalog;
    }

    public void setCurrentCatalog(String currentCatalog) {
        this.currentCatalog = currentCatalog;
    }

    public CreateSqlJobRequestBody withCurrentdb(String currentdb) {
        this.currentdb = currentdb;
        return this;
    }

    /**
     * SQL语句执行所在的数据库。当创建新数据库时，不需要提供此参数。
     * @return currentdb
     */
    public String getCurrentdb() {
        return currentdb;
    }

    public void setCurrentdb(String currentdb) {
        this.currentdb = currentdb;
    }

    public CreateSqlJobRequestBody withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 待提交作业的队列名称，名称只能包含数字、英文字母和下划线，但不能是纯数字，且不能以下划线开头。
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public CreateSqlJobRequestBody withConf(List<String> conf) {
        this.conf = conf;
        return this;
    }

    public CreateSqlJobRequestBody addConfItem(String confItem) {
        if (this.conf == null) {
            this.conf = new ArrayList<>();
        }
        this.conf.add(confItem);
        return this;
    }

    public CreateSqlJobRequestBody withConf(Consumer<List<String>> confSetter) {
        if (this.conf == null) {
            this.conf = new ArrayList<>();
        }
        confSetter.accept(this.conf);
        return this;
    }

    /**
     * 用户以“key/value”的形式设置用于此作业的配置参数。目前支持的配置项请参考表3。
     * @return conf
     */
    public List<String> getConf() {
        return conf;
    }

    public void setConf(List<String> conf) {
        this.conf = conf;
    }

    public CreateSqlJobRequestBody withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateSqlJobRequestBody addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateSqlJobRequestBody withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 作业标签
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSqlJobRequestBody that = (CreateSqlJobRequestBody) obj;
        return Objects.equals(this.sql, that.sql) && Objects.equals(this.engineType, that.engineType)
            && Objects.equals(this.currentCatalog, that.currentCatalog)
            && Objects.equals(this.currentdb, that.currentdb) && Objects.equals(this.queueName, that.queueName)
            && Objects.equals(this.conf, that.conf) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sql, engineType, currentCatalog, currentdb, queueName, conf, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSqlJobRequestBody {\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    currentCatalog: ").append(toIndentedString(currentCatalog)).append("\n");
        sb.append("    currentdb: ").append(toIndentedString(currentdb)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    conf: ").append(toIndentedString(conf)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
