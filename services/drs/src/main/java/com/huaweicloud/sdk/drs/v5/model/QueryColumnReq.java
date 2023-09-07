package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 是否从源库获取最新的列信息
 */
public class QueryColumnReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_force_refresh")

    private Boolean isForceRefresh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_object_infos")

    private List<SelectDbTableObjectInfo> dbObjectInfos = null;

    public QueryColumnReq withIsForceRefresh(Boolean isForceRefresh) {
        this.isForceRefresh = isForceRefresh;
        return this;
    }

    /**
     * 是否从Node获取最新的列信息
     * @return isForceRefresh
     */
    public Boolean getIsForceRefresh() {
        return isForceRefresh;
    }

    public void setIsForceRefresh(Boolean isForceRefresh) {
        this.isForceRefresh = isForceRefresh;
    }

    public QueryColumnReq withDbObjectInfos(List<SelectDbTableObjectInfo> dbObjectInfos) {
        this.dbObjectInfos = dbObjectInfos;
        return this;
    }

    public QueryColumnReq addDbObjectInfosItem(SelectDbTableObjectInfo dbObjectInfosItem) {
        if (this.dbObjectInfos == null) {
            this.dbObjectInfos = new ArrayList<>();
        }
        this.dbObjectInfos.add(dbObjectInfosItem);
        return this;
    }

    public QueryColumnReq withDbObjectInfos(Consumer<List<SelectDbTableObjectInfo>> dbObjectInfosSetter) {
        if (this.dbObjectInfos == null) {
            this.dbObjectInfos = new ArrayList<>();
        }
        dbObjectInfosSetter.accept(this.dbObjectInfos);
        return this;
    }

    /**
     * 指定数据库表信息
     * @return dbObjectInfos
     */
    public List<SelectDbTableObjectInfo> getDbObjectInfos() {
        return dbObjectInfos;
    }

    public void setDbObjectInfos(List<SelectDbTableObjectInfo> dbObjectInfos) {
        this.dbObjectInfos = dbObjectInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryColumnReq that = (QueryColumnReq) obj;
        return Objects.equals(this.isForceRefresh, that.isForceRefresh)
            && Objects.equals(this.dbObjectInfos, that.dbObjectInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isForceRefresh, dbObjectInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryColumnReq {\n");
        sb.append("    isForceRefresh: ").append(toIndentedString(isForceRefresh)).append("\n");
        sb.append("    dbObjectInfos: ").append(toIndentedString(dbObjectInfos)).append("\n");
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
