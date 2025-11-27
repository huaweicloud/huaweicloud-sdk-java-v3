package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResourceSummary 表示成员集群中的资源汇总。
 */
public class ResourceSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allocatable")

    private Map<String, Object> allocatable = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allocating")

    private Map<String, Object> allocating = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allocated")

    private Map<String, Object> allocated = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private Map<String, Object> capacity = null;

    public ResourceSummary withAllocatable(Map<String, Object> allocatable) {
        this.allocatable = allocatable;
        return this;
    }

    public ResourceSummary putAllocatableItem(String key, Object allocatableItem) {
        if (this.allocatable == null) {
            this.allocatable = new HashMap<>();
        }
        this.allocatable.put(key, allocatableItem);
        return this;
    }

    public ResourceSummary withAllocatable(Consumer<Map<String, Object>> allocatableSetter) {
        if (this.allocatable == null) {
            this.allocatable = new HashMap<>();
        }
        allocatableSetter.accept(this.allocatable);
        return this;
    }

    /**
     * 可分配的资源
     * @return allocatable
     */
    public Map<String, Object> getAllocatable() {
        return allocatable;
    }

    public void setAllocatable(Map<String, Object> allocatable) {
        this.allocatable = allocatable;
    }

    public ResourceSummary withAllocating(Map<String, Object> allocating) {
        this.allocating = allocating;
        return this;
    }

    public ResourceSummary putAllocatingItem(String key, Object allocatingItem) {
        if (this.allocating == null) {
            this.allocating = new HashMap<>();
        }
        this.allocating.put(key, allocatingItem);
        return this;
    }

    public ResourceSummary withAllocating(Consumer<Map<String, Object>> allocatingSetter) {
        if (this.allocating == null) {
            this.allocating = new HashMap<>();
        }
        allocatingSetter.accept(this.allocating);
        return this;
    }

    /**
     * 分配中的资源
     * @return allocating
     */
    public Map<String, Object> getAllocating() {
        return allocating;
    }

    public void setAllocating(Map<String, Object> allocating) {
        this.allocating = allocating;
    }

    public ResourceSummary withAllocated(Map<String, Object> allocated) {
        this.allocated = allocated;
        return this;
    }

    public ResourceSummary putAllocatedItem(String key, Object allocatedItem) {
        if (this.allocated == null) {
            this.allocated = new HashMap<>();
        }
        this.allocated.put(key, allocatedItem);
        return this;
    }

    public ResourceSummary withAllocated(Consumer<Map<String, Object>> allocatedSetter) {
        if (this.allocated == null) {
            this.allocated = new HashMap<>();
        }
        allocatedSetter.accept(this.allocated);
        return this;
    }

    /**
     * 已分配的资源
     * @return allocated
     */
    public Map<String, Object> getAllocated() {
        return allocated;
    }

    public void setAllocated(Map<String, Object> allocated) {
        this.allocated = allocated;
    }

    public ResourceSummary withCapacity(Map<String, Object> capacity) {
        this.capacity = capacity;
        return this;
    }

    public ResourceSummary putCapacityItem(String key, Object capacityItem) {
        if (this.capacity == null) {
            this.capacity = new HashMap<>();
        }
        this.capacity.put(key, capacityItem);
        return this;
    }

    public ResourceSummary withCapacity(Consumer<Map<String, Object>> capacitySetter) {
        if (this.capacity == null) {
            this.capacity = new HashMap<>();
        }
        capacitySetter.accept(this.capacity);
        return this;
    }

    /**
     * 资源总量
     * @return capacity
     */
    public Map<String, Object> getCapacity() {
        return capacity;
    }

    public void setCapacity(Map<String, Object> capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceSummary that = (ResourceSummary) obj;
        return Objects.equals(this.allocatable, that.allocatable) && Objects.equals(this.allocating, that.allocating)
            && Objects.equals(this.allocated, that.allocated) && Objects.equals(this.capacity, that.capacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allocatable, allocating, allocated, capacity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceSummary {\n");
        sb.append("    allocatable: ").append(toIndentedString(allocatable)).append("\n");
        sb.append("    allocating: ").append(toIndentedString(allocating)).append("\n");
        sb.append("    allocated: ").append(toIndentedString(allocated)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
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
