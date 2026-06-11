package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 回收备份实例信息。
 */
public class RecycleInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_type")

    private String productType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_store")

    private RecycleDatastore dataStore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_type")

    private String chargeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    private String backupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted_at")

    private String deletedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retained_until")

    private String retainedUntil;

    public RecycleInstance withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 实例ID。 **取值范围：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RecycleInstance withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 实例名称。 **取值范围：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RecycleInstance withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * **参数解释：** 实例类型。 **取值范围：** - 取值为“Cluster”，表示GeminiDB Cassandra、GeminiDB Influx、GeminiDB Redis Proxy经典部署模式集群实例类型。 - 取值为“CloudNativeCluster”，表示GeminiDB Cassandra、GeminiDB Influx、GeminiDB Redis云原生部署模式集群实例类型。 - 取值为“RedisCluster”，表示GeminiDB Redis Cluster经典部署模式集群实例类型。 - 取值为“Replication”，表示GeminiDB Redis经典部署模式主备实例类型。 - 取值为“InfluxdbSingle”，表示GeminiDB Influx经典部署模式单节点实例类型。 - 取值为“ReplicaSet”，表示GeminiDB Mongo副本集实例类型。
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public RecycleInstance withProductType(String productType) {
        this.productType = productType;
        return this;
    }

    /**
     * **参数解释：** 产品类型。 **取值范围：** GeminiDB Redis云原生部署模式集群涉及此字段，取值：   -  Standard 标准型   -  Capacity 容量型
     * @return productType
     */
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public RecycleInstance withDataStore(RecycleDatastore dataStore) {
        this.dataStore = dataStore;
        return this;
    }

    public RecycleInstance withDataStore(Consumer<RecycleDatastore> dataStoreSetter) {
        if (this.dataStore == null) {
            this.dataStore = new RecycleDatastore();
            dataStoreSetter.accept(this.dataStore);
        }

        return this;
    }

    /**
     * Get dataStore
     * @return dataStore
     */
    public RecycleDatastore getDataStore() {
        return dataStore;
    }

    public void setDataStore(RecycleDatastore dataStore) {
        this.dataStore = dataStore;
    }

    public RecycleInstance withChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }

    /**
     * **参数解释：** 计费方式。 **取值范围：** - prePaid：预付费，即包年/包月。 - postPaid：后付费，即按需付费。
     * @return chargeType
     */
    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public RecycleInstance withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释：** 企业项目ID，取值为“0”，表示为default企业项目 **取值范围：** 不涉及。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public RecycleInstance withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * **参数解释：** 备份ID。 **取值范围：** 不涉及。
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public RecycleInstance withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 实例创建时间。 **取值范围：** 不涉及。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public RecycleInstance withDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
        return this;
    }

    /**
     * **参数解释：** 实例删除时间。 **取值范围：** 不涉及。
     * @return deletedAt
     */
    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    public RecycleInstance withRetainedUntil(String retainedUntil) {
        this.retainedUntil = retainedUntil;
        return this;
    }

    /**
     * **参数解释：** 回收备份保留截止时间。 **取值范围：** 不涉及。
     * @return retainedUntil
     */
    public String getRetainedUntil() {
        return retainedUntil;
    }

    public void setRetainedUntil(String retainedUntil) {
        this.retainedUntil = retainedUntil;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecycleInstance that = (RecycleInstance) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.mode, that.mode) && Objects.equals(this.productType, that.productType)
            && Objects.equals(this.dataStore, that.dataStore) && Objects.equals(this.chargeType, that.chargeType)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.backupId, that.backupId) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.deletedAt, that.deletedAt) && Objects.equals(this.retainedUntil, that.retainedUntil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            mode,
            productType,
            dataStore,
            chargeType,
            enterpriseProjectId,
            backupId,
            createdAt,
            deletedAt,
            retainedUntil);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecycleInstance {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
        sb.append("    dataStore: ").append(toIndentedString(dataStore)).append("\n");
        sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
        sb.append("    retainedUntil: ").append(toIndentedString(retainedUntil)).append("\n");
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
