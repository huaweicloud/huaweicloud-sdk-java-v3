package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 备份详情列表。
 */
public class Backup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private Datastore datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Double size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_tables")

    private List<QueryDatabaseTableInfo> databaseTables = null;

    public Backup withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 备份ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Backup withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 备份描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Backup withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 备份所属的实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public Backup withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 备份所属的实例名称。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public Backup withDatastore(Datastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public Backup withDatastore(Consumer<Datastore> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new Datastore();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public Datastore getDatastore() {
        return datastore;
    }

    public void setDatastore(Datastore datastore) {
        this.datastore = datastore;
    }

    public Backup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 备份名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Backup withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * - 取值为“Auto”，表示自动全量备份。 - 取值为“Manual”，表示手动全量备份。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Backup withSize(Double size) {
        this.size = size;
        return this;
    }

    /**
     * 备份大小，单位：KB。
     * @return size
     */
    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Backup withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 备份状态。取值： - BUILDING：备份中。 - COMPLETED：备份完成。 - FAILED：备份失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Backup withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 备份开始时间，为yyyy-mm-ddThh:mm:ssZ字符串格式，T指某个时间的开始，Z指时区偏移量。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public Backup withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 备份结束时间，为yyyy-mm-ddThh:mm:ssZ字符串格式，T指某个时间的开始，Z指时区偏移量。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Backup withDatabaseTables(List<QueryDatabaseTableInfo> databaseTables) {
        this.databaseTables = databaseTables;
        return this;
    }

    public Backup addDatabaseTablesItem(QueryDatabaseTableInfo databaseTablesItem) {
        if (this.databaseTables == null) {
            this.databaseTables = new ArrayList<>();
        }
        this.databaseTables.add(databaseTablesItem);
        return this;
    }

    public Backup withDatabaseTables(Consumer<List<QueryDatabaseTableInfo>> databaseTablesSetter) {
        if (this.databaseTables == null) {
            this.databaseTables = new ArrayList<>();
        }
        databaseTablesSetter.accept(this.databaseTables);
        return this;
    }

    /**
     * 备份里的库表信息 - 实例级查询时该字段为空，可忽略 - 库表级查询时该字段非空（存在库表级备份的话）
     * @return databaseTables
     */
    public List<QueryDatabaseTableInfo> getDatabaseTables() {
        return databaseTables;
    }

    public void setDatabaseTables(List<QueryDatabaseTableInfo> databaseTables) {
        this.databaseTables = databaseTables;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Backup that = (Backup) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.description, that.description)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.datastore, that.datastore) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.size, that.size)
            && Objects.equals(this.status, that.status) && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.databaseTables, that.databaseTables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            description,
            instanceId,
            instanceName,
            datastore,
            name,
            type,
            size,
            status,
            beginTime,
            endTime,
            databaseTables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Backup {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    databaseTables: ").append(toIndentedString(databaseTables)).append("\n");
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
