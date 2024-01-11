package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询可恢复库的响应信息
 */
public class RestoreDatabaseInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_time")

    private Long restoreTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_fast_restore")

    private Boolean isFastRestore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private List<RestoreDatabaseInfo> databases = null;

    public RestoreDatabaseInstance withRestoreTime(Long restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }

    /**
     * 恢复时间
     * @return restoreTime
     */
    public Long getRestoreTime() {
        return restoreTime;
    }

    public void setRestoreTime(Long restoreTime) {
        this.restoreTime = restoreTime;
    }

    public RestoreDatabaseInstance withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public RestoreDatabaseInstance withIsFastRestore(Boolean isFastRestore) {
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

    public RestoreDatabaseInstance withDatabases(List<RestoreDatabaseInfo> databases) {
        this.databases = databases;
        return this;
    }

    public RestoreDatabaseInstance addDatabasesItem(RestoreDatabaseInfo databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public RestoreDatabaseInstance withDatabases(Consumer<List<RestoreDatabaseInfo>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 库信息
     * @return databases
     */
    public List<RestoreDatabaseInfo> getDatabases() {
        return databases;
    }

    public void setDatabases(List<RestoreDatabaseInfo> databases) {
        this.databases = databases;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestoreDatabaseInstance that = (RestoreDatabaseInstance) obj;
        return Objects.equals(this.restoreTime, that.restoreTime) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.isFastRestore, that.isFastRestore) && Objects.equals(this.databases, that.databases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restoreTime, instanceId, isFastRestore, databases);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreDatabaseInstance {\n");
        sb.append("    restoreTime: ").append(toIndentedString(restoreTime)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    isFastRestore: ").append(toIndentedString(isFastRestore)).append("\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
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
