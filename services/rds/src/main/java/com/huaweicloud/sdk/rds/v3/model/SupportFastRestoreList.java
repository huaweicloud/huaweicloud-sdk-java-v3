package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SupportFastRestoreList
 */
public class SupportFastRestoreList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_fast_table_restore")

    private Boolean isSupportFastTableRestore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_fast_database_restore")

    private Boolean isSupportFastDatabaseRestore;

    public SupportFastRestoreList withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public SupportFastRestoreList withIsSupportFastTableRestore(Boolean isSupportFastTableRestore) {
        this.isSupportFastTableRestore = isSupportFastTableRestore;
        return this;
    }

    /**
     * 表级恢复是否支持极速恢复。
     * @return isSupportFastTableRestore
     */
    public Boolean getIsSupportFastTableRestore() {
        return isSupportFastTableRestore;
    }

    public void setIsSupportFastTableRestore(Boolean isSupportFastTableRestore) {
        this.isSupportFastTableRestore = isSupportFastTableRestore;
    }

    public SupportFastRestoreList withIsSupportFastDatabaseRestore(Boolean isSupportFastDatabaseRestore) {
        this.isSupportFastDatabaseRestore = isSupportFastDatabaseRestore;
        return this;
    }

    /**
     * 库级恢复是否支持极速恢复。
     * @return isSupportFastDatabaseRestore
     */
    public Boolean getIsSupportFastDatabaseRestore() {
        return isSupportFastDatabaseRestore;
    }

    public void setIsSupportFastDatabaseRestore(Boolean isSupportFastDatabaseRestore) {
        this.isSupportFastDatabaseRestore = isSupportFastDatabaseRestore;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SupportFastRestoreList that = (SupportFastRestoreList) obj;
        return Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.isSupportFastTableRestore, that.isSupportFastTableRestore)
            && Objects.equals(this.isSupportFastDatabaseRestore, that.isSupportFastDatabaseRestore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, isSupportFastTableRestore, isSupportFastDatabaseRestore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupportFastRestoreList {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    isSupportFastTableRestore: ").append(toIndentedString(isSupportFastTableRestore)).append("\n");
        sb.append("    isSupportFastDatabaseRestore: ")
            .append(toIndentedString(isSupportFastDatabaseRestore))
            .append("\n");
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
