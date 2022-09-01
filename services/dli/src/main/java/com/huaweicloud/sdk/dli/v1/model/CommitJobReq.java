package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 提交SQL作业
 */
public class CommitJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    @JacksonXmlProperty(localName = "sql")

    private String sql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currentdb")

    @JacksonXmlProperty(localName = "currentdb")

    private String currentdb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    @JacksonXmlProperty(localName = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conf")

    @JacksonXmlProperty(localName = "conf")

    private List<String> conf = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    @JacksonXmlProperty(localName = "tags")

    private List<JobsTags> tags = null;

    public CommitJobReq withSql(String sql) {
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

    public CommitJobReq withCurrentdb(String currentdb) {
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

    public CommitJobReq withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 待提交作业的队列名称，名称只能包含数字、英文字母和下划线，但不能是纯数字，且不能以下划线开头。长度限制：1~128个字符。 说明：  队列名称不区分大小写，系统会自动转换为小写。
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public CommitJobReq withConf(List<String> conf) {
        this.conf = conf;
        return this;
    }

    public CommitJobReq addConfItem(String confItem) {
        if (this.conf == null) {
            this.conf = new ArrayList<>();
        }
        this.conf.add(confItem);
        return this;
    }

    public CommitJobReq withConf(Consumer<List<String>> confSetter) {
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

    public CommitJobReq withTags(List<JobsTags> tags) {
        this.tags = tags;
        return this;
    }

    public CommitJobReq addTagsItem(JobsTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CommitJobReq withTags(Consumer<List<JobsTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 作业的标签。具体请参考表tags。
     * @return tags
     */
    public List<JobsTags> getTags() {
        return tags;
    }

    public void setTags(List<JobsTags> tags) {
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
        CommitJobReq commitJobReq = (CommitJobReq) o;
        return Objects.equals(this.sql, commitJobReq.sql) && Objects.equals(this.currentdb, commitJobReq.currentdb)
            && Objects.equals(this.queueName, commitJobReq.queueName) && Objects.equals(this.conf, commitJobReq.conf)
            && Objects.equals(this.tags, commitJobReq.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sql, currentdb, queueName, conf, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommitJobReq {\n");
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
