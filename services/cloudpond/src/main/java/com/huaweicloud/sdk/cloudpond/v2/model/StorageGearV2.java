package com.huaweicloud.sdk.cloudpond.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * StorageGear接口返回层对象模型
 */
public class StorageGearV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gear")

    private Integer gear;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_type")

    private String storageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_info")

    private ProductInfo productInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_code")

    private String zoneCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sale_cycles")

    private List<SaleCycle> saleCycles = null;

    public StorageGearV2 withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 存储档位ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StorageGearV2 withGear(Integer gear) {
        this.gear = gear;
        return this;
    }

    /**
     * 存储阶梯值, 如：35TB
     * @return gear
     */
    public Integer getGear() {
        return gear;
    }

    public void setGear(Integer gear) {
        this.gear = gear;
    }

    public StorageGearV2 withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * 存储类型. SAS:高IO,SSD:超高IO [VS_SMALL_CAP,VS_MEDIUM_CAP,VS_LARGE_CAP 视图存储](tag:cmcc)
     * @return storageType
     */
    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public StorageGearV2 withProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
        return this;
    }

    public StorageGearV2 withProductInfo(Consumer<ProductInfo> productInfoSetter) {
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

    public StorageGearV2 withZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
        return this;
    }

    /**
     * 部署地区
     * @return zoneCode
     */
    public String getZoneCode() {
        return zoneCode;
    }

    public void setZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
    }

    public StorageGearV2 withSaleCycles(List<SaleCycle> saleCycles) {
        this.saleCycles = saleCycles;
        return this;
    }

    public StorageGearV2 addSaleCyclesItem(SaleCycle saleCyclesItem) {
        if (this.saleCycles == null) {
            this.saleCycles = new ArrayList<>();
        }
        this.saleCycles.add(saleCyclesItem);
        return this;
    }

    public StorageGearV2 withSaleCycles(Consumer<List<SaleCycle>> saleCyclesSetter) {
        if (this.saleCycles == null) {
            this.saleCycles = new ArrayList<>();
        }
        saleCyclesSetter.accept(this.saleCycles);
        return this;
    }

    /**
     * Get saleCycles
     * @return saleCycles
     */
    public List<SaleCycle> getSaleCycles() {
        return saleCycles;
    }

    public void setSaleCycles(List<SaleCycle> saleCycles) {
        this.saleCycles = saleCycles;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StorageGearV2 that = (StorageGearV2) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.gear, that.gear)
            && Objects.equals(this.storageType, that.storageType) && Objects.equals(this.productInfo, that.productInfo)
            && Objects.equals(this.zoneCode, that.zoneCode) && Objects.equals(this.saleCycles, that.saleCycles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, gear, storageType, productInfo, zoneCode, saleCycles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StorageGearV2 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    gear: ").append(toIndentedString(gear)).append("\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    productInfo: ").append(toIndentedString(productInfo)).append("\n");
        sb.append("    zoneCode: ").append(toIndentedString(zoneCode)).append("\n");
        sb.append("    saleCycles: ").append(toIndentedString(saleCycles)).append("\n");
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
