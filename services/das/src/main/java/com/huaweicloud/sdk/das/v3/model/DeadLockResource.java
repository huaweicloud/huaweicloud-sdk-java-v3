package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 死锁资源信息
 */
public class DeadLockResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_label")

    private String lockLabel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_id")

    private String dbId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_name")

    private String indexName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_object_id")

    private String associatedObjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_name")

    private String objectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_mode")

    private String lockMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_list")

    private List<DeadLockObject> ownerList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waiter_list")

    private List<DeadLockObject> waiterList = null;

    public DeadLockResource withLockLabel(String lockLabel) {
        this.lockLabel = lockLabel;
        return this;
    }

    /**
     * 死锁标签（keylock、objectlock、ridlock、pagelock、compilelock）
     * @return lockLabel
     */
    public String getLockLabel() {
        return lockLabel;
    }

    public void setLockLabel(String lockLabel) {
        this.lockLabel = lockLabel;
    }

    public DeadLockResource withDbId(String dbId) {
        this.dbId = dbId;
        return this;
    }

    /**
     * 数据库ID
     * @return dbId
     */
    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    public DeadLockResource withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据库名称
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public DeadLockResource withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * 索引名（仅keylock展示）
     * @return indexName
     */
    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public DeadLockResource withAssociatedObjectId(String associatedObjectId) {
        this.associatedObjectId = associatedObjectId;
        return this;
    }

    /**
     * 关联对象ID
     * @return associatedObjectId
     */
    public String getAssociatedObjectId() {
        return associatedObjectId;
    }

    public void setAssociatedObjectId(String associatedObjectId) {
        this.associatedObjectId = associatedObjectId;
    }

    public DeadLockResource withObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }

    /**
     * 对象名称，死锁名称
     * @return objectName
     */
    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public DeadLockResource withLockMode(String lockMode) {
        this.lockMode = lockMode;
        return this;
    }

    /**
     * 锁模式
     * @return lockMode
     */
    public String getLockMode() {
        return lockMode;
    }

    public void setLockMode(String lockMode) {
        this.lockMode = lockMode;
    }

    public DeadLockResource withOwnerList(List<DeadLockObject> ownerList) {
        this.ownerList = ownerList;
        return this;
    }

    public DeadLockResource addOwnerListItem(DeadLockObject ownerListItem) {
        if (this.ownerList == null) {
            this.ownerList = new ArrayList<>();
        }
        this.ownerList.add(ownerListItem);
        return this;
    }

    public DeadLockResource withOwnerList(Consumer<List<DeadLockObject>> ownerListSetter) {
        if (this.ownerList == null) {
            this.ownerList = new ArrayList<>();
        }
        ownerListSetter.accept(this.ownerList);
        return this;
    }

    /**
     * 持有者列表
     * @return ownerList
     */
    public List<DeadLockObject> getOwnerList() {
        return ownerList;
    }

    public void setOwnerList(List<DeadLockObject> ownerList) {
        this.ownerList = ownerList;
    }

    public DeadLockResource withWaiterList(List<DeadLockObject> waiterList) {
        this.waiterList = waiterList;
        return this;
    }

    public DeadLockResource addWaiterListItem(DeadLockObject waiterListItem) {
        if (this.waiterList == null) {
            this.waiterList = new ArrayList<>();
        }
        this.waiterList.add(waiterListItem);
        return this;
    }

    public DeadLockResource withWaiterList(Consumer<List<DeadLockObject>> waiterListSetter) {
        if (this.waiterList == null) {
            this.waiterList = new ArrayList<>();
        }
        waiterListSetter.accept(this.waiterList);
        return this;
    }

    /**
     * 等待者列表
     * @return waiterList
     */
    public List<DeadLockObject> getWaiterList() {
        return waiterList;
    }

    public void setWaiterList(List<DeadLockObject> waiterList) {
        this.waiterList = waiterList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeadLockResource that = (DeadLockResource) obj;
        return Objects.equals(this.lockLabel, that.lockLabel) && Objects.equals(this.dbId, that.dbId)
            && Objects.equals(this.dbName, that.dbName) && Objects.equals(this.indexName, that.indexName)
            && Objects.equals(this.associatedObjectId, that.associatedObjectId)
            && Objects.equals(this.objectName, that.objectName) && Objects.equals(this.lockMode, that.lockMode)
            && Objects.equals(this.ownerList, that.ownerList) && Objects.equals(this.waiterList, that.waiterList);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(lockLabel, dbId, dbName, indexName, associatedObjectId, objectName, lockMode, ownerList, waiterList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeadLockResource {\n");
        sb.append("    lockLabel: ").append(toIndentedString(lockLabel)).append("\n");
        sb.append("    dbId: ").append(toIndentedString(dbId)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    indexName: ").append(toIndentedString(indexName)).append("\n");
        sb.append("    associatedObjectId: ").append(toIndentedString(associatedObjectId)).append("\n");
        sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
        sb.append("    lockMode: ").append(toIndentedString(lockMode)).append("\n");
        sb.append("    ownerList: ").append(toIndentedString(ownerList)).append("\n");
        sb.append("    waiterList: ").append(toIndentedString(waiterList)).append("\n");
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
