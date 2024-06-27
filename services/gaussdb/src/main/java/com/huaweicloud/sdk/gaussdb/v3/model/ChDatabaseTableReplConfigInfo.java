package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 表配置信息。
 */
public class ChDatabaseTableReplConfigInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repl_type")

    private String replType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tables")

    private List<String> tables = null;

    public ChDatabaseTableReplConfigInfo withReplType(String replType) {
        this.replType = replType;
        return this;
    }

    /**
     * 表同步类型。 取值范围： - white_list：白名单，此时表范围不能为空。 - black_list：黑名单，此时表范围为空则选择所有表。
     * @return replType
     */
    public String getReplType() {
        return replType;
    }

    public void setReplType(String replType) {
        this.replType = replType;
    }

    public ChDatabaseTableReplConfigInfo withTables(List<String> tables) {
        this.tables = tables;
        return this;
    }

    public ChDatabaseTableReplConfigInfo addTablesItem(String tablesItem) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        this.tables.add(tablesItem);
        return this;
    }

    public ChDatabaseTableReplConfigInfo withTables(Consumer<List<String>> tablesSetter) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        tablesSetter.accept(this.tables);
        return this;
    }

    /**
     * 白名单或黑名单的表范围。
     * @return tables
     */
    public List<String> getTables() {
        return tables;
    }

    public void setTables(List<String> tables) {
        this.tables = tables;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChDatabaseTableReplConfigInfo that = (ChDatabaseTableReplConfigInfo) obj;
        return Objects.equals(this.replType, that.replType) && Objects.equals(this.tables, that.tables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(replType, tables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChDatabaseTableReplConfigInfo {\n");
        sb.append("    replType: ").append(toIndentedString(replType)).append("\n");
        sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
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
