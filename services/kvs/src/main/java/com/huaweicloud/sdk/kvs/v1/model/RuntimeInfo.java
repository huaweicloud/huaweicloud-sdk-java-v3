package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RuntimeInfo
 */
public class RuntimeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "TableInfo")
    @BsonProperty(value = "TableInfo")

    private TableInfo tableInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Local2ndIndexesInfo")
    @BsonProperty(value = "Local2ndIndexesInfo")

    private List<LsiIndexInfo> local2ndIndexesInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Global2ndIndexesInfo")
    @BsonProperty(value = "Global2ndIndexesInfo")

    private List<GsiIndexInfo> global2ndIndexesInfo = null;

    public RuntimeInfo withTableInfo(TableInfo tableInfo) {
        this.tableInfo = tableInfo;
        return this;
    }

    public RuntimeInfo withTableInfo(Consumer<TableInfo> tableInfoSetter) {
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

    public RuntimeInfo withLocal2ndIndexesInfo(List<LsiIndexInfo> local2ndIndexesInfo) {
        this.local2ndIndexesInfo = local2ndIndexesInfo;
        return this;
    }

    public RuntimeInfo addLocal2ndIndexesInfoItem(LsiIndexInfo local2ndIndexesInfoItem) {
        if (this.local2ndIndexesInfo == null) {
            this.local2ndIndexesInfo = new ArrayList<>();
        }
        this.local2ndIndexesInfo.add(local2ndIndexesInfoItem);
        return this;
    }

    public RuntimeInfo withLocal2ndIndexesInfo(Consumer<List<LsiIndexInfo>> local2ndIndexesInfoSetter) {
        if (this.local2ndIndexesInfo == null) {
            this.local2ndIndexesInfo = new ArrayList<>();
        }
        local2ndIndexesInfoSetter.accept(this.local2ndIndexesInfo);
        return this;
    }

    /**
     * Get local2ndIndexesInfo
     * @return local2ndIndexesInfo
     */
    public List<LsiIndexInfo> getLocal2ndIndexesInfo() {
        return local2ndIndexesInfo;
    }

    public void setLocal2ndIndexesInfo(List<LsiIndexInfo> local2ndIndexesInfo) {
        this.local2ndIndexesInfo = local2ndIndexesInfo;
    }

    public RuntimeInfo withGlobal2ndIndexesInfo(List<GsiIndexInfo> global2ndIndexesInfo) {
        this.global2ndIndexesInfo = global2ndIndexesInfo;
        return this;
    }

    public RuntimeInfo addGlobal2ndIndexesInfoItem(GsiIndexInfo global2ndIndexesInfoItem) {
        if (this.global2ndIndexesInfo == null) {
            this.global2ndIndexesInfo = new ArrayList<>();
        }
        this.global2ndIndexesInfo.add(global2ndIndexesInfoItem);
        return this;
    }

    public RuntimeInfo withGlobal2ndIndexesInfo(Consumer<List<GsiIndexInfo>> global2ndIndexesInfoSetter) {
        if (this.global2ndIndexesInfo == null) {
            this.global2ndIndexesInfo = new ArrayList<>();
        }
        global2ndIndexesInfoSetter.accept(this.global2ndIndexesInfo);
        return this;
    }

    /**
     * Get global2ndIndexesInfo
     * @return global2ndIndexesInfo
     */
    public List<GsiIndexInfo> getGlobal2ndIndexesInfo() {
        return global2ndIndexesInfo;
    }

    public void setGlobal2ndIndexesInfo(List<GsiIndexInfo> global2ndIndexesInfo) {
        this.global2ndIndexesInfo = global2ndIndexesInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RuntimeInfo that = (RuntimeInfo) obj;
        return Objects.equals(this.tableInfo, that.tableInfo)
            && Objects.equals(this.local2ndIndexesInfo, that.local2ndIndexesInfo)
            && Objects.equals(this.global2ndIndexesInfo, that.global2ndIndexesInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableInfo, local2ndIndexesInfo, global2ndIndexesInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuntimeInfo {\n");
        sb.append("    tableInfo: ").append(toIndentedString(tableInfo)).append("\n");
        sb.append("    local2ndIndexesInfo: ").append(toIndentedString(local2ndIndexesInfo)).append("\n");
        sb.append("    global2ndIndexesInfo: ").append(toIndentedString(global2ndIndexesInfo)).append("\n");
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
