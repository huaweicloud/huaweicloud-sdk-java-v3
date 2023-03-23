package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 提交SQL作业
 */
public class CreateSqlJobRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private String sql;

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

    private List<TmsTagEntity> tags = null;

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

    public CreateSqlJobRequestBody withTags(List<TmsTagEntity> tags) {
        this.tags = tags;
        return this;
    }

    public CreateSqlJobRequestBody addTagsItem(TmsTagEntity tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateSqlJobRequestBody withTags(Consumer<List<TmsTagEntity>> tagsSetter) {
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
    public List<TmsTagEntity> getTags() {
        return tags;
    }

    public void setTags(List<TmsTagEntity> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSqlJobRequestBody createSqlJobRequestBody = (CreateSqlJobRequestBody) o;
        return Objects.equals(this.sql, createSqlJobRequestBody.sql)
            && Objects.equals(this.currentdb, createSqlJobRequestBody.currentdb)
            && Objects.equals(this.queueName, createSqlJobRequestBody.queueName)
            && Objects.equals(this.conf, createSqlJobRequestBody.conf)
            && Objects.equals(this.tags, createSqlJobRequestBody.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sql, currentdb, queueName, conf, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSqlJobRequestBody {\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
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
