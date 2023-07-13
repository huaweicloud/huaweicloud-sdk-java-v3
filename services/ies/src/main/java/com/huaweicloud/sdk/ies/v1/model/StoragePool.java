package com.huaweicloud.sdk.ies.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 存储池
 */
public class StoragePool {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_site_id")

    private String edgeSiteId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_type")

    private StorageType storageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StoragePoolStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assigned_size")

    private Integer assignedSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private Integer capacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "market_options")

    private MarketOptions marketOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effected_at")

    private OffsetDateTime effectedAt;

    public StoragePool withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 机柜ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StoragePool withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 存储池名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StoragePool withEdgeSiteId(String edgeSiteId) {
        this.edgeSiteId = edgeSiteId;
        return this;
    }

    /**
     * 边缘小站ID
     * @return edgeSiteId
     */
    public String getEdgeSiteId() {
        return edgeSiteId;
    }

    public void setEdgeSiteId(String edgeSiteId) {
        this.edgeSiteId = edgeSiteId;
    }

    public StoragePool withStorageType(StorageType storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * Get storageType
     * @return storageType
     */
    public StorageType getStorageType() {
        return storageType;
    }

    public void setStorageType(StorageType storageType) {
        this.storageType = storageType;
    }

    public StoragePool withStatus(StoragePoolStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public StoragePoolStatus getStatus() {
        return status;
    }

    public void setStatus(StoragePoolStatus status) {
        this.status = status;
    }

    public StoragePool withAssignedSize(Integer assignedSize) {
        this.assignedSize = assignedSize;
        return this;
    }

    /**
     * 存储池大小。 当前购买的存储容量。
     * @return assignedSize
     */
    public Integer getAssignedSize() {
        return assignedSize;
    }

    public void setAssignedSize(Integer assignedSize) {
        this.assignedSize = assignedSize;
    }

    public StoragePool withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 资源规格编码
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public StoragePool withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * 总容量
     * @return capacity
     */
    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public StoragePool withMarketOptions(MarketOptions marketOptions) {
        this.marketOptions = marketOptions;
        return this;
    }

    public StoragePool withMarketOptions(Consumer<MarketOptions> marketOptionsSetter) {
        if (this.marketOptions == null) {
            this.marketOptions = new MarketOptions();
            marketOptionsSetter.accept(this.marketOptions);
        }

        return this;
    }

    /**
     * Get marketOptions
     * @return marketOptions
     */
    public MarketOptions getMarketOptions() {
        return marketOptions;
    }

    public void setMarketOptions(MarketOptions marketOptions) {
        this.marketOptions = marketOptions;
    }

    public StoragePool withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public StoragePool withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public StoragePool withEffectedAt(OffsetDateTime effectedAt) {
        this.effectedAt = effectedAt;
        return this;
    }

    /**
     * 生效时间
     * @return effectedAt
     */
    public OffsetDateTime getEffectedAt() {
        return effectedAt;
    }

    public void setEffectedAt(OffsetDateTime effectedAt) {
        this.effectedAt = effectedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StoragePool that = (StoragePool) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.edgeSiteId, that.edgeSiteId) && Objects.equals(this.storageType, that.storageType)
            && Objects.equals(this.status, that.status) && Objects.equals(this.assignedSize, that.assignedSize)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.capacity, that.capacity) && Objects.equals(this.marketOptions, that.marketOptions)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.effectedAt, that.effectedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            edgeSiteId,
            storageType,
            status,
            assignedSize,
            resourceSpecCode,
            capacity,
            marketOptions,
            createdAt,
            updatedAt,
            effectedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StoragePool {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    edgeSiteId: ").append(toIndentedString(edgeSiteId)).append("\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    assignedSize: ").append(toIndentedString(assignedSize)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    marketOptions: ").append(toIndentedString(marketOptions)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    effectedAt: ").append(toIndentedString(effectedAt)).append("\n");
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
