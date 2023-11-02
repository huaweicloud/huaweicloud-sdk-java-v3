package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 恢复表请求体
 */
public class RestoreTableRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_sensitive")

    private Boolean caseSensitive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_table_list")

    private List<TableDetail> restoreTableList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_table_list")

    private List<TableDetail> targetTableList = null;

    public RestoreTableRequestBody withCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        return this;
    }

    /**
     * 名称是否区分大小写
     * @return caseSensitive
     */
    public Boolean getCaseSensitive() {
        return caseSensitive;
    }

    public void setCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }

    public RestoreTableRequestBody withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * 数据库名称
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public RestoreTableRequestBody withRestoreTableList(List<TableDetail> restoreTableList) {
        this.restoreTableList = restoreTableList;
        return this;
    }

    public RestoreTableRequestBody addRestoreTableListItem(TableDetail restoreTableListItem) {
        if (this.restoreTableList == null) {
            this.restoreTableList = new ArrayList<>();
        }
        this.restoreTableList.add(restoreTableListItem);
        return this;
    }

    public RestoreTableRequestBody withRestoreTableList(Consumer<List<TableDetail>> restoreTableListSetter) {
        if (this.restoreTableList == null) {
            this.restoreTableList = new ArrayList<>();
        }
        restoreTableListSetter.accept(this.restoreTableList);
        return this;
    }

    /**
     * 源表信息
     * @return restoreTableList
     */
    public List<TableDetail> getRestoreTableList() {
        return restoreTableList;
    }

    public void setRestoreTableList(List<TableDetail> restoreTableList) {
        this.restoreTableList = restoreTableList;
    }

    public RestoreTableRequestBody withTargetTableList(List<TableDetail> targetTableList) {
        this.targetTableList = targetTableList;
        return this;
    }

    public RestoreTableRequestBody addTargetTableListItem(TableDetail targetTableListItem) {
        if (this.targetTableList == null) {
            this.targetTableList = new ArrayList<>();
        }
        this.targetTableList.add(targetTableListItem);
        return this;
    }

    public RestoreTableRequestBody withTargetTableList(Consumer<List<TableDetail>> targetTableListSetter) {
        if (this.targetTableList == null) {
            this.targetTableList = new ArrayList<>();
        }
        targetTableListSetter.accept(this.targetTableList);
        return this;
    }

    /**
     * 目的表信息
     * @return targetTableList
     */
    public List<TableDetail> getTargetTableList() {
        return targetTableList;
    }

    public void setTargetTableList(List<TableDetail> targetTableList) {
        this.targetTableList = targetTableList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestoreTableRequestBody that = (RestoreTableRequestBody) obj;
        return Objects.equals(this.caseSensitive, that.caseSensitive) && Objects.equals(this.database, that.database)
            && Objects.equals(this.restoreTableList, that.restoreTableList)
            && Objects.equals(this.targetTableList, that.targetTableList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caseSensitive, database, restoreTableList, targetTableList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreTableRequestBody {\n");
        sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    restoreTableList: ").append(toIndentedString(restoreTableList)).append("\n");
        sb.append("    targetTableList: ").append(toIndentedString(targetTableList)).append("\n");
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
