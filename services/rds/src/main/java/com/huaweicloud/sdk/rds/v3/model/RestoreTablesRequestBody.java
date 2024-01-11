package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RestoreTablesRequestBody
 */
public class RestoreTablesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restoreTime")

    private Long restoreTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restoreTables")

    private List<RestoreDatabasesInfo> restoreTables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_fast_restore")

    private Boolean isFastRestore;

    public RestoreTablesRequestBody withRestoreTime(Long restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }

    /**
     * 恢复时间戳
     * @return restoreTime
     */
    public Long getRestoreTime() {
        return restoreTime;
    }

    public void setRestoreTime(Long restoreTime) {
        this.restoreTime = restoreTime;
    }

    public RestoreTablesRequestBody withRestoreTables(List<RestoreDatabasesInfo> restoreTables) {
        this.restoreTables = restoreTables;
        return this;
    }

    public RestoreTablesRequestBody addRestoreTablesItem(RestoreDatabasesInfo restoreTablesItem) {
        if (this.restoreTables == null) {
            this.restoreTables = new ArrayList<>();
        }
        this.restoreTables.add(restoreTablesItem);
        return this;
    }

    public RestoreTablesRequestBody withRestoreTables(Consumer<List<RestoreDatabasesInfo>> restoreTablesSetter) {
        if (this.restoreTables == null) {
            this.restoreTables = new ArrayList<>();
        }
        restoreTablesSetter.accept(this.restoreTables);
        return this;
    }

    /**
     * 表信息
     * @return restoreTables
     */
    public List<RestoreDatabasesInfo> getRestoreTables() {
        return restoreTables;
    }

    public void setRestoreTables(List<RestoreDatabasesInfo> restoreTables) {
        this.restoreTables = restoreTables;
    }

    public RestoreTablesRequestBody withIsFastRestore(Boolean isFastRestore) {
        this.isFastRestore = isFastRestore;
        return this;
    }

    /**
     * 是否使用极速恢复，可先根据”获取实例是否能使用极速恢复“接口判断本次恢复是否能使用极速恢复。 如果实例使用了XA事务，采用极速恢复的方式会导致恢复失败！
     * @return isFastRestore
     */
    public Boolean getIsFastRestore() {
        return isFastRestore;
    }

    public void setIsFastRestore(Boolean isFastRestore) {
        this.isFastRestore = isFastRestore;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestoreTablesRequestBody that = (RestoreTablesRequestBody) obj;
        return Objects.equals(this.restoreTime, that.restoreTime)
            && Objects.equals(this.restoreTables, that.restoreTables)
            && Objects.equals(this.isFastRestore, that.isFastRestore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restoreTime, restoreTables, isFastRestore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreTablesRequestBody {\n");
        sb.append("    restoreTime: ").append(toIndentedString(restoreTime)).append("\n");
        sb.append("    restoreTables: ").append(toIndentedString(restoreTables)).append("\n");
        sb.append("    isFastRestore: ").append(toIndentedString(isFastRestore)).append("\n");
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
