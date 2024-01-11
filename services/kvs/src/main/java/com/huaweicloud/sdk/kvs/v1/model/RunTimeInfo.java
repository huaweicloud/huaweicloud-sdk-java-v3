package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RunTimeInfo
 */
public class RunTimeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_info")
    @BsonProperty(value = "table_info")

    private TableInfo tableInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_secondary_index_infos")
    @BsonProperty(value = "local_secondary_index_infos")

    private List<SecondaryIndexInfo> localSecondaryIndexInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_secondary_index_infos")
    @BsonProperty(value = "global_secondary_index_infos")

    private List<GlobalSecondaryIndexInfo> globalSecondaryIndexInfos = null;

    public RunTimeInfo withTableInfo(TableInfo tableInfo) {
        this.tableInfo = tableInfo;
        return this;
    }

    public RunTimeInfo withTableInfo(Consumer<TableInfo> tableInfoSetter) {
        if (this.tableInfo == null) {
            this.tableInfo = new TableInfo();
            tableInfoSetter.accept(this.tableInfo);
        }

        return this;
    }

    /**
     * Get tableInfo
     * @return tableInfo
     */
    public TableInfo getTableInfo() {
        return tableInfo;
    }

    public void setTableInfo(TableInfo tableInfo) {
        this.tableInfo = tableInfo;
    }

    public RunTimeInfo withLocalSecondaryIndexInfos(List<SecondaryIndexInfo> localSecondaryIndexInfos) {
        this.localSecondaryIndexInfos = localSecondaryIndexInfos;
        return this;
    }

    public RunTimeInfo addLocalSecondaryIndexInfosItem(SecondaryIndexInfo localSecondaryIndexInfosItem) {
        if (this.localSecondaryIndexInfos == null) {
            this.localSecondaryIndexInfos = new ArrayList<>();
        }
        this.localSecondaryIndexInfos.add(localSecondaryIndexInfosItem);
        return this;
    }

    public RunTimeInfo withLocalSecondaryIndexInfos(Consumer<List<SecondaryIndexInfo>> localSecondaryIndexInfosSetter) {
        if (this.localSecondaryIndexInfos == null) {
            this.localSecondaryIndexInfos = new ArrayList<>();
        }
        localSecondaryIndexInfosSetter.accept(this.localSecondaryIndexInfos);
        return this;
    }

    /**
     * 索引状态。
     * @return localSecondaryIndexInfos
     */
    public List<SecondaryIndexInfo> getLocalSecondaryIndexInfos() {
        return localSecondaryIndexInfos;
    }

    public void setLocalSecondaryIndexInfos(List<SecondaryIndexInfo> localSecondaryIndexInfos) {
        this.localSecondaryIndexInfos = localSecondaryIndexInfos;
    }

    public RunTimeInfo withGlobalSecondaryIndexInfos(List<GlobalSecondaryIndexInfo> globalSecondaryIndexInfos) {
        this.globalSecondaryIndexInfos = globalSecondaryIndexInfos;
        return this;
    }

    public RunTimeInfo addGlobalSecondaryIndexInfosItem(GlobalSecondaryIndexInfo globalSecondaryIndexInfosItem) {
        if (this.globalSecondaryIndexInfos == null) {
            this.globalSecondaryIndexInfos = new ArrayList<>();
        }
        this.globalSecondaryIndexInfos.add(globalSecondaryIndexInfosItem);
        return this;
    }

    public RunTimeInfo withGlobalSecondaryIndexInfos(
        Consumer<List<GlobalSecondaryIndexInfo>> globalSecondaryIndexInfosSetter) {
        if (this.globalSecondaryIndexInfos == null) {
            this.globalSecondaryIndexInfos = new ArrayList<>();
        }
        globalSecondaryIndexInfosSetter.accept(this.globalSecondaryIndexInfos);
        return this;
    }

    /**
     * 全局二级索引运行态。
     * @return globalSecondaryIndexInfos
     */
    public List<GlobalSecondaryIndexInfo> getGlobalSecondaryIndexInfos() {
        return globalSecondaryIndexInfos;
    }

    public void setGlobalSecondaryIndexInfos(List<GlobalSecondaryIndexInfo> globalSecondaryIndexInfos) {
        this.globalSecondaryIndexInfos = globalSecondaryIndexInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RunTimeInfo that = (RunTimeInfo) obj;
        return Objects.equals(this.tableInfo, that.tableInfo)
            && Objects.equals(this.localSecondaryIndexInfos, that.localSecondaryIndexInfos)
            && Objects.equals(this.globalSecondaryIndexInfos, that.globalSecondaryIndexInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableInfo, localSecondaryIndexInfos, globalSecondaryIndexInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunTimeInfo {\n");
        sb.append("    tableInfo: ").append(toIndentedString(tableInfo)).append("\n");
        sb.append("    localSecondaryIndexInfos: ").append(toIndentedString(localSecondaryIndexInfos)).append("\n");
        sb.append("    globalSecondaryIndexInfos: ").append(toIndentedString(globalSecondaryIndexInfos)).append("\n");
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
