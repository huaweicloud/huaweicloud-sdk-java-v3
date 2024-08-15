package com.huaweicloud.sdk.cloudpond.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 机柜
 */
public class Rack {

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
    @JsonProperty(value = "rack_category_id")

    private String rackCategoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rack_type")

    private String rackType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private RackStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_assigned_size")

    private Integer storageAssignedSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rack_sn_no")

    private String rackSnNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rack_location_no")

    private String rackLocationNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effected_at")

    private OffsetDateTime effectedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "market_options")

    private MarketOptions marketOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compute_unit")

    private List<ComputeSpec> computeUnit = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_unit")

    private StorageUnit storageUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rack_info")

    private RackInfo rackInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_info")

    private ProductInfo productInfo;

    public Rack withId(String id) {
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

    public Rack withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 机柜名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rack withEdgeSiteId(String edgeSiteId) {
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

    public Rack withRackCategoryId(String rackCategoryId) {
        this.rackCategoryId = rackCategoryId;
        return this;
    }

    /**
     * 机柜目录ID
     * @return rackCategoryId
     */
    public String getRackCategoryId() {
        return rackCategoryId;
    }

    public void setRackCategoryId(String rackCategoryId) {
        this.rackCategoryId = rackCategoryId;
    }

    public Rack withRackType(String rackType) {
        this.rackType = rackType;
        return this;
    }

    /**
     * 机柜类型
     * @return rackType
     */
    public String getRackType() {
        return rackType;
    }

    public void setRackType(String rackType) {
        this.rackType = rackType;
    }

    public Rack withStatus(RackStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public RackStatus getStatus() {
        return status;
    }

    public void setStatus(RackStatus status) {
        this.status = status;
    }

    public Rack withStorageAssignedSize(Integer storageAssignedSize) {
        this.storageAssignedSize = storageAssignedSize;
        return this;
    }

    /**
     * 已分配存储容量
     * @return storageAssignedSize
     */
    public Integer getStorageAssignedSize() {
        return storageAssignedSize;
    }

    public void setStorageAssignedSize(Integer storageAssignedSize) {
        this.storageAssignedSize = storageAssignedSize;
    }

    public Rack withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 机柜描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Rack withRackSnNo(String rackSnNo) {
        this.rackSnNo = rackSnNo;
        return this;
    }

    /**
     * 机柜SN号
     * @return rackSnNo
     */
    public String getRackSnNo() {
        return rackSnNo;
    }

    public void setRackSnNo(String rackSnNo) {
        this.rackSnNo = rackSnNo;
    }

    public Rack withRackLocationNo(String rackLocationNo) {
        this.rackLocationNo = rackLocationNo;
        return this;
    }

    /**
     * 机柜位置号
     * @return rackLocationNo
     */
    public String getRackLocationNo() {
        return rackLocationNo;
    }

    public void setRackLocationNo(String rackLocationNo) {
        this.rackLocationNo = rackLocationNo;
    }

    public Rack withCreatedAt(OffsetDateTime createdAt) {
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

    public Rack withUpdatedAt(OffsetDateTime updatedAt) {
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

    public Rack withEffectedAt(OffsetDateTime effectedAt) {
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

    public Rack withMarketOptions(MarketOptions marketOptions) {
        this.marketOptions = marketOptions;
        return this;
    }

    public Rack withMarketOptions(Consumer<MarketOptions> marketOptionsSetter) {
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

    public Rack withComputeUnit(List<ComputeSpec> computeUnit) {
        this.computeUnit = computeUnit;
        return this;
    }

    public Rack addComputeUnitItem(ComputeSpec computeUnitItem) {
        if (this.computeUnit == null) {
            this.computeUnit = new ArrayList<>();
        }
        this.computeUnit.add(computeUnitItem);
        return this;
    }

    public Rack withComputeUnit(Consumer<List<ComputeSpec>> computeUnitSetter) {
        if (this.computeUnit == null) {
            this.computeUnit = new ArrayList<>();
        }
        computeUnitSetter.accept(this.computeUnit);
        return this;
    }

    /**
     * 计算单元信息
     * @return computeUnit
     */
    public List<ComputeSpec> getComputeUnit() {
        return computeUnit;
    }

    public void setComputeUnit(List<ComputeSpec> computeUnit) {
        this.computeUnit = computeUnit;
    }

    public Rack withStorageUnit(StorageUnit storageUnit) {
        this.storageUnit = storageUnit;
        return this;
    }

    public Rack withStorageUnit(Consumer<StorageUnit> storageUnitSetter) {
        if (this.storageUnit == null) {
            this.storageUnit = new StorageUnit();
            storageUnitSetter.accept(this.storageUnit);
        }

        return this;
    }

    /**
     * Get storageUnit
     * @return storageUnit
     */
    public StorageUnit getStorageUnit() {
        return storageUnit;
    }

    public void setStorageUnit(StorageUnit storageUnit) {
        this.storageUnit = storageUnit;
    }

    public Rack withRackInfo(RackInfo rackInfo) {
        this.rackInfo = rackInfo;
        return this;
    }

    public Rack withRackInfo(Consumer<RackInfo> rackInfoSetter) {
        if (this.rackInfo == null) {
            this.rackInfo = new RackInfo();
            rackInfoSetter.accept(this.rackInfo);
        }

        return this;
    }

    /**
     * Get rackInfo
     * @return rackInfo
     */
    public RackInfo getRackInfo() {
        return rackInfo;
    }

    public void setRackInfo(RackInfo rackInfo) {
        this.rackInfo = rackInfo;
    }

    public Rack withProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
        return this;
    }

    public Rack withProductInfo(Consumer<ProductInfo> productInfoSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Rack that = (Rack) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.edgeSiteId, that.edgeSiteId)
            && Objects.equals(this.rackCategoryId, that.rackCategoryId) && Objects.equals(this.rackType, that.rackType)
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.storageAssignedSize, that.storageAssignedSize)
            && Objects.equals(this.description, that.description) && Objects.equals(this.rackSnNo, that.rackSnNo)
            && Objects.equals(this.rackLocationNo, that.rackLocationNo)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.effectedAt, that.effectedAt)
            && Objects.equals(this.marketOptions, that.marketOptions)
            && Objects.equals(this.computeUnit, that.computeUnit) && Objects.equals(this.storageUnit, that.storageUnit)
            && Objects.equals(this.rackInfo, that.rackInfo) && Objects.equals(this.productInfo, that.productInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            edgeSiteId,
            rackCategoryId,
            rackType,
            status,
            storageAssignedSize,
            description,
            rackSnNo,
            rackLocationNo,
            createdAt,
            updatedAt,
            effectedAt,
            marketOptions,
            computeUnit,
            storageUnit,
            rackInfo,
            productInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Rack {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    edgeSiteId: ").append(toIndentedString(edgeSiteId)).append("\n");
        sb.append("    rackCategoryId: ").append(toIndentedString(rackCategoryId)).append("\n");
        sb.append("    rackType: ").append(toIndentedString(rackType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    storageAssignedSize: ").append(toIndentedString(storageAssignedSize)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    rackSnNo: ").append(toIndentedString(rackSnNo)).append("\n");
        sb.append("    rackLocationNo: ").append(toIndentedString(rackLocationNo)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    effectedAt: ").append(toIndentedString(effectedAt)).append("\n");
        sb.append("    marketOptions: ").append(toIndentedString(marketOptions)).append("\n");
        sb.append("    computeUnit: ").append(toIndentedString(computeUnit)).append("\n");
        sb.append("    storageUnit: ").append(toIndentedString(storageUnit)).append("\n");
        sb.append("    rackInfo: ").append(toIndentedString(rackInfo)).append("\n");
        sb.append("    productInfo: ").append(toIndentedString(productInfo)).append("\n");
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
