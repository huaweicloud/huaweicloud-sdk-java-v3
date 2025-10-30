package com.huaweicloud.sdk.cloudpond.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 存储池
 */
public class StoragePoolV2 {

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

    private String storageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StoragePoolStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assigned_size")

    private Integer assignedSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_info")

    private ProductInfo productInfo;

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
    @JsonProperty(value = "parent_id")

    private String parentId;

    public StoragePoolV2 withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 存储池ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StoragePoolV2 withName(String name) {
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

    public StoragePoolV2 withEdgeSiteId(String edgeSiteId) {
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

    public StoragePoolV2 withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * 存储类型
     * @return storageType
     */
    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public StoragePoolV2 withStatus(StoragePoolStatus status) {
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

    public StoragePoolV2 withAssignedSize(Integer assignedSize) {
        this.assignedSize = assignedSize;
        return this;
    }

    /**
     * 存储池大小。 当前已购买的存储容量。
     * @return assignedSize
     */
    public Integer getAssignedSize() {
        return assignedSize;
    }

    public void setAssignedSize(Integer assignedSize) {
        this.assignedSize = assignedSize;
    }

    public StoragePoolV2 withProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
        return this;
    }

    public StoragePoolV2 withProductInfo(Consumer<ProductInfo> productInfoSetter) {
        if (this.productInfo == null) {
            this.productInfo = new ProductInfo();
            productInfoSetter.accept(this.productInfo);
        }

        return this;
    }

    /**
     * Get productInfo
     * @return productInfo
     */
    public ProductInfo getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }

    public StoragePoolV2 withCapacity(Integer capacity) {
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

    public StoragePoolV2 withMarketOptions(MarketOptions marketOptions) {
        this.marketOptions = marketOptions;
        return this;
    }

    public StoragePoolV2 withMarketOptions(Consumer<MarketOptions> marketOptionsSetter) {
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

    public StoragePoolV2 withCreatedAt(OffsetDateTime createdAt) {
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

    public StoragePoolV2 withUpdatedAt(OffsetDateTime updatedAt) {
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

    public StoragePoolV2 withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 扩容场景预生成存储池关联的存储池ID
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StoragePoolV2 that = (StoragePoolV2) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.edgeSiteId, that.edgeSiteId) && Objects.equals(this.storageType, that.storageType)
            && Objects.equals(this.status, that.status) && Objects.equals(this.assignedSize, that.assignedSize)
            && Objects.equals(this.productInfo, that.productInfo) && Objects.equals(this.capacity, that.capacity)
            && Objects.equals(this.marketOptions, that.marketOptions) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.parentId, that.parentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            edgeSiteId,
            storageType,
            status,
            assignedSize,
            productInfo,
            capacity,
            marketOptions,
            createdAt,
            updatedAt,
            parentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StoragePoolV2 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    edgeSiteId: ").append(toIndentedString(edgeSiteId)).append("\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    assignedSize: ").append(toIndentedString(assignedSize)).append("\n");
        sb.append("    productInfo: ").append(toIndentedString(productInfo)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    marketOptions: ").append(toIndentedString(marketOptions)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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
