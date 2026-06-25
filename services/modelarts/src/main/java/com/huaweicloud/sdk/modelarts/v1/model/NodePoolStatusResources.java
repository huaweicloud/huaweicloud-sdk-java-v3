package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：节点池中不同状态的资源量。
 */
public class NodePoolStatusResources {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creating")

    private PoolResourceFlavorCount creating;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available")

    private PoolResourceFlavorCount available;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal")

    private PoolResourceFlavorCount abnormal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleting")

    private PoolResourceFlavorCount deleting;

    public NodePoolStatusResources withCreating(PoolResourceFlavorCount creating) {
        this.creating = creating;
        return this;
    }

    public NodePoolStatusResources withCreating(Consumer<PoolResourceFlavorCount> creatingSetter) {
        if (this.creating == null) {
            this.creating = new PoolResourceFlavorCount();
            creatingSetter.accept(this.creating);
        }

        return this;
    }

    /**
     * Get creating
     * @return creating
     */
    public PoolResourceFlavorCount getCreating() {
        return creating;
    }

    public void setCreating(PoolResourceFlavorCount creating) {
        this.creating = creating;
    }

    public NodePoolStatusResources withAvailable(PoolResourceFlavorCount available) {
        this.available = available;
        return this;
    }

    public NodePoolStatusResources withAvailable(Consumer<PoolResourceFlavorCount> availableSetter) {
        if (this.available == null) {
            this.available = new PoolResourceFlavorCount();
            availableSetter.accept(this.available);
        }

        return this;
    }

    /**
     * Get available
     * @return available
     */
    public PoolResourceFlavorCount getAvailable() {
        return available;
    }

    public void setAvailable(PoolResourceFlavorCount available) {
        this.available = available;
    }

    public NodePoolStatusResources withAbnormal(PoolResourceFlavorCount abnormal) {
        this.abnormal = abnormal;
        return this;
    }

    public NodePoolStatusResources withAbnormal(Consumer<PoolResourceFlavorCount> abnormalSetter) {
        if (this.abnormal == null) {
            this.abnormal = new PoolResourceFlavorCount();
            abnormalSetter.accept(this.abnormal);
        }

        return this;
    }

    /**
     * Get abnormal
     * @return abnormal
     */
    public PoolResourceFlavorCount getAbnormal() {
        return abnormal;
    }

    public void setAbnormal(PoolResourceFlavorCount abnormal) {
        this.abnormal = abnormal;
    }

    public NodePoolStatusResources withDeleting(PoolResourceFlavorCount deleting) {
        this.deleting = deleting;
        return this;
    }

    public NodePoolStatusResources withDeleting(Consumer<PoolResourceFlavorCount> deletingSetter) {
        if (this.deleting == null) {
            this.deleting = new PoolResourceFlavorCount();
            deletingSetter.accept(this.deleting);
        }

        return this;
    }

    /**
     * Get deleting
     * @return deleting
     */
    public PoolResourceFlavorCount getDeleting() {
        return deleting;
    }

    public void setDeleting(PoolResourceFlavorCount deleting) {
        this.deleting = deleting;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodePoolStatusResources that = (NodePoolStatusResources) obj;
        return Objects.equals(this.creating, that.creating) && Objects.equals(this.available, that.available)
            && Objects.equals(this.abnormal, that.abnormal) && Objects.equals(this.deleting, that.deleting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creating, available, abnormal, deleting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodePoolStatusResources {\n");
        sb.append("    creating: ").append(toIndentedString(creating)).append("\n");
        sb.append("    available: ").append(toIndentedString(available)).append("\n");
        sb.append("    abnormal: ").append(toIndentedString(abnormal)).append("\n");
        sb.append("    deleting: ").append(toIndentedString(deleting)).append("\n");
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
