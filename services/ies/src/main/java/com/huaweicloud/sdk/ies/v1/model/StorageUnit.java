package com.huaweicloud.sdk.ies.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 存储单元
 */
public class StorageUnit {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_type")

    private StorageType storageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private Integer capacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gears")

    private List<Integer> gears = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_type")

    private String flavorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public StorageUnit withStorageType(StorageType storageType) {
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

    public StorageUnit withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * 存储池大小，单位：TB。
     * minimum: 1
     * @return capacity
     */
    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public StorageUnit withGears(List<Integer> gears) {
        this.gears = gears;
        return this;
    }

    public StorageUnit addGearsItem(Integer gearsItem) {
        if (this.gears == null) {
            this.gears = new ArrayList<>();
        }
        this.gears.add(gearsItem);
        return this;
    }

    public StorageUnit withGears(Consumer<List<Integer>> gearsSetter) {
        if (this.gears == null) {
            this.gears = new ArrayList<>();
        }
        gearsSetter.accept(this.gears);
        return this;
    }

    /**
     * 存储池销售档位
     * @return gears
     */
    public List<Integer> getGears() {
        return gears;
    }

    public void setGears(List<Integer> gears) {
        this.gears = gears;
    }

    public StorageUnit withFlavorType(String flavorType) {
        this.flavorType = flavorType;
        return this;
    }

    /**
     * 规格类型。例如：highio-4T
     * @return flavorType
     */
    public String getFlavorType() {
        return flavorType;
    }

    public void setFlavorType(String flavorType) {
        this.flavorType = flavorType;
    }

    public StorageUnit withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 存储节点台数。
     * minimum: 1
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StorageUnit that = (StorageUnit) obj;
        return Objects.equals(this.storageType, that.storageType) && Objects.equals(this.capacity, that.capacity)
            && Objects.equals(this.gears, that.gears) && Objects.equals(this.flavorType, that.flavorType)
            && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageType, capacity, gears, flavorType, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StorageUnit {\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    gears: ").append(toIndentedString(gears)).append("\n");
        sb.append("    flavorType: ").append(toIndentedString(flavorType)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
