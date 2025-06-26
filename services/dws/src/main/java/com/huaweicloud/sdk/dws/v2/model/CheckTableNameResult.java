package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 表名检查结果。 **取值范围**： 不涉及。
 */
public class CheckTableNameResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_table_list")

    private List<String> restoreTableList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_table_list")

    private List<String> targetTableList = null;

    public CheckTableNameResult withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * **参数解释**： 数据库名称。 **取值范围**： 不涉及。
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public CheckTableNameResult withRestoreTableList(List<String> restoreTableList) {
        this.restoreTableList = restoreTableList;
        return this;
    }

    public CheckTableNameResult addRestoreTableListItem(String restoreTableListItem) {
        if (this.restoreTableList == null) {
            this.restoreTableList = new ArrayList<>();
        }
        this.restoreTableList.add(restoreTableListItem);
        return this;
    }

    public CheckTableNameResult withRestoreTableList(Consumer<List<String>> restoreTableListSetter) {
        if (this.restoreTableList == null) {
            this.restoreTableList = new ArrayList<>();
        }
        restoreTableListSetter.accept(this.restoreTableList);
        return this;
    }

    /**
     * **参数解释**： 恢复源表信息。 **取值范围**： 不涉及。
     * @return restoreTableList
     */
    public List<String> getRestoreTableList() {
        return restoreTableList;
    }

    public void setRestoreTableList(List<String> restoreTableList) {
        this.restoreTableList = restoreTableList;
    }

    public CheckTableNameResult withTargetTableList(List<String> targetTableList) {
        this.targetTableList = targetTableList;
        return this;
    }

    public CheckTableNameResult addTargetTableListItem(String targetTableListItem) {
        if (this.targetTableList == null) {
            this.targetTableList = new ArrayList<>();
        }
        this.targetTableList.add(targetTableListItem);
        return this;
    }

    public CheckTableNameResult withTargetTableList(Consumer<List<String>> targetTableListSetter) {
        if (this.targetTableList == null) {
            this.targetTableList = new ArrayList<>();
        }
        targetTableListSetter.accept(this.targetTableList);
        return this;
    }

    /**
     * **参数解释**： 恢复目的表信息。 **取值范围**： 不涉及。
     * @return targetTableList
     */
    public List<String> getTargetTableList() {
        return targetTableList;
    }

    public void setTargetTableList(List<String> targetTableList) {
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
        CheckTableNameResult that = (CheckTableNameResult) obj;
        return Objects.equals(this.database, that.database)
            && Objects.equals(this.restoreTableList, that.restoreTableList)
            && Objects.equals(this.targetTableList, that.targetTableList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(database, restoreTableList, targetTableList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckTableNameResult {\n");
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
