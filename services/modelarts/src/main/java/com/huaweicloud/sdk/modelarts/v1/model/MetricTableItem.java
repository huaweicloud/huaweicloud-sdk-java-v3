package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * MetricTableItem
 */
public class MetricTableItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allocated")

    private Allocated allocated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private Capacity capacity;

    public MetricTableItem withAllocated(Allocated allocated) {
        this.allocated = allocated;
        return this;
    }

    public MetricTableItem withAllocated(Consumer<Allocated> allocatedSetter) {
        if (this.allocated == null) {
            this.allocated = new Allocated();
            allocatedSetter.accept(this.allocated);
        }

        return this;
    }

    /**
     * Get allocated
     * @return allocated
     */
    public Allocated getAllocated() {
        return allocated;
    }

    public void setAllocated(Allocated allocated) {
        this.allocated = allocated;
    }

    public MetricTableItem withCapacity(Capacity capacity) {
        this.capacity = capacity;
        return this;
    }

    public MetricTableItem withCapacity(Consumer<Capacity> capacitySetter) {
        if (this.capacity == null) {
            this.capacity = new Capacity();
            capacitySetter.accept(this.capacity);
        }

        return this;
    }

    /**
     * Get capacity
     * @return capacity
     */
    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
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
        MetricTableItem that = (MetricTableItem) obj;
        return Objects.equals(this.allocated, that.allocated) && Objects.equals(this.capacity, that.capacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allocated, capacity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricTableItem {\n");
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
