package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据库对象采集请求体
 */
public class QuerySelectObjectInfoReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_names")

    private List<String> dbNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_refresh")

    private String isRefresh;

    public QuerySelectObjectInfoReq withDbNames(List<String> dbNames) {
        this.dbNames = dbNames;
        return this;
    }

    public QuerySelectObjectInfoReq addDbNamesItem(String dbNamesItem) {
        if (this.dbNames == null) {
            this.dbNames = new ArrayList<>();
        }
        this.dbNames.add(dbNamesItem);
        return this;
    }

    public QuerySelectObjectInfoReq withDbNames(Consumer<List<String>> dbNamesSetter) {
        if (this.dbNames == null) {
            this.dbNames = new ArrayList<>();
        }
        dbNamesSetter.accept(this.dbNames);
        return this;
    }

    /**
     * 查询指定库的信息。
     * @return dbNames
     */
    public List<String> getDbNames() {
        return dbNames;
    }

    public void setDbNames(List<String> dbNames) {
        this.dbNames = dbNames;
    }

    public QuerySelectObjectInfoReq withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 查询对象信息类型，取值： - source：查询源库对象信息。 - modified：查询已选择的（已同步的和未下发的）对象信息。 - synchronized：查询已同步的（已下发的）对象信息 ， 使用场景在任务处于全量中或者增量中。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public QuerySelectObjectInfoReq withIsRefresh(String isRefresh) {
        this.isRefresh = isRefresh;
        return this;
    }

    /**
     * 是否强制刷新。取值： - true：是，表示从源库重新查询。 - false：否，表示从已缓存中数据查询。
     * @return isRefresh
     */
    public String getIsRefresh() {
        return isRefresh;
    }

    public void setIsRefresh(String isRefresh) {
        this.isRefresh = isRefresh;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QuerySelectObjectInfoReq that = (QuerySelectObjectInfoReq) obj;
        return Objects.equals(this.dbNames, that.dbNames) && Objects.equals(this.type, that.type)
            && Objects.equals(this.isRefresh, that.isRefresh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbNames, type, isRefresh);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuerySelectObjectInfoReq {\n");
        sb.append("    dbNames: ").append(toIndentedString(dbNames)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    isRefresh: ").append(toIndentedString(isRefresh)).append("\n");
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
