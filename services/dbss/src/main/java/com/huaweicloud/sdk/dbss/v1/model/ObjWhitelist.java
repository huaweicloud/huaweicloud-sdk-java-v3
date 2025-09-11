package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 添加白名单对象
 */
public class ObjWhitelist {

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
    @JsonProperty(value = "sql")

    private String sql;

    public ObjWhitelist withDbIds(List<String> dbIds) {
        this.dbIds = dbIds;
        return this;
    }

    public ObjWhitelist addDbIdsItem(String dbIdsItem) {
        if (this.dbIds == null) {
            this.dbIds = new ArrayList<>();
        }
        this.dbIds.add(dbIdsItem);
        return this;
    }

    public ObjWhitelist withDbIds(Consumer<List<String>> dbIdsSetter) {
        if (this.dbIds == null) {
            this.dbIds = new ArrayList<>();
        }
        dbIdsSetter.accept(this.dbIds);
        return this;
    }

    /**
     * 数据库ID
     * @return dbIds
     */
    public List<String> getDbIds() {
        return dbIds;
    }

    public void setDbIds(List<String> dbIds) {
        this.dbIds = dbIds;
    }

    public ObjWhitelist withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 描述信息
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ObjWhitelist withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 状态
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ObjWhitelist withSql(String sql) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObjWhitelist that = (ObjWhitelist) obj;
        return Objects.equals(this.dbIds, that.dbIds) && Objects.equals(this.desc, that.desc)
            && Objects.equals(this.enabled, that.enabled) && Objects.equals(this.sql, that.sql);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbIds, desc, enabled, sql);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObjWhitelist {\n");
        sb.append("    dbIds: ").append(toIndentedString(dbIds)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
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
