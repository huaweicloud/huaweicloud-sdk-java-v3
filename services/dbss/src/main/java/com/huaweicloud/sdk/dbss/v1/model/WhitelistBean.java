package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * WhitelistBean
 */
public class WhitelistBean {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_timestamp_ms")

    private Long createTimestampMs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_ids")

    private List<String> dbIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private String sql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_timestamp_ms")

    private Long updateTimestampMs;

    public WhitelistBean withCreateTimestampMs(Long createTimestampMs) {
        this.createTimestampMs = createTimestampMs;
        return this;
    }

    /**
     * 创建时间
     * @return createTimestampMs
     */
    public Long getCreateTimestampMs() {
        return createTimestampMs;
    }

    public void setCreateTimestampMs(Long createTimestampMs) {
        this.createTimestampMs = createTimestampMs;
    }

    public WhitelistBean withDbIds(List<String> dbIds) {
        this.dbIds = dbIds;
        return this;
    }

    public WhitelistBean addDbIdsItem(String dbIdsItem) {
        if (this.dbIds == null) {
            this.dbIds = new ArrayList<>();
        }
        this.dbIds.add(dbIdsItem);
        return this;
    }

    public WhitelistBean withDbIds(Consumer<List<String>> dbIdsSetter) {
        if (this.dbIds == null) {
            this.dbIds = new ArrayList<>();
        }
        dbIdsSetter.accept(this.dbIds);
        return this;
    }

    /**
     * 数据库IDs
     * @return dbIds
     */
    public List<String> getDbIds() {
        return dbIds;
    }

    public void setDbIds(List<String> dbIds) {
        this.dbIds = dbIds;
    }

    public WhitelistBean withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 描述
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public WhitelistBean withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 状态 - true:启用 - false: 禁用
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public WhitelistBean withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 记录ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WhitelistBean withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * SQL语句
     * @return sql
     */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public WhitelistBean withUpdateTimestampMs(Long updateTimestampMs) {
        this.updateTimestampMs = updateTimestampMs;
        return this;
    }

    /**
     * 更新时间
     * @return updateTimestampMs
     */
    public Long getUpdateTimestampMs() {
        return updateTimestampMs;
    }

    public void setUpdateTimestampMs(Long updateTimestampMs) {
        this.updateTimestampMs = updateTimestampMs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WhitelistBean that = (WhitelistBean) obj;
        return Objects.equals(this.createTimestampMs, that.createTimestampMs) && Objects.equals(this.dbIds, that.dbIds)
            && Objects.equals(this.desc, that.desc) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.id, that.id) && Objects.equals(this.sql, that.sql)
            && Objects.equals(this.updateTimestampMs, that.updateTimestampMs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTimestampMs, dbIds, desc, enabled, id, sql, updateTimestampMs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WhitelistBean {\n");
        sb.append("    createTimestampMs: ").append(toIndentedString(createTimestampMs)).append("\n");
        sb.append("    dbIds: ").append(toIndentedString(dbIds)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
        sb.append("    updateTimestampMs: ").append(toIndentedString(updateTimestampMs)).append("\n");
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
