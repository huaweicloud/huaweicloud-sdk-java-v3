package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class PersistentVolumeClaimStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessModes")

    private List<String> accessModes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private String capacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private String phase;

    public PersistentVolumeClaimStatus withAccessModes(List<String> accessModes) {
        this.accessModes = accessModes;
        return this;
    }

    public PersistentVolumeClaimStatus addAccessModesItem(String accessModesItem) {
        if (this.accessModes == null) {
            this.accessModes = new ArrayList<>();
        }
        this.accessModes.add(accessModesItem);
        return this;
    }

    public PersistentVolumeClaimStatus withAccessModes(Consumer<List<String>> accessModesSetter) {
        if (this.accessModes == null) {
            this.accessModes = new ArrayList<>();
        }
        accessModesSetter.accept(this.accessModes);
        return this;
    }

    /**
     * 显示volume实际具有的访问模式。
     * @return accessModes
     */
    public List<String> getAccessModes() {
        return accessModes;
    }

    public void setAccessModes(List<String> accessModes) {
        this.accessModes = accessModes;
    }

    public PersistentVolumeClaimStatus withCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * 底层卷的实际资源
     * @return capacity
     */
    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public PersistentVolumeClaimStatus withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * PersistentVolumeClaim当前所处的状态
     * @return phase
     */
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PersistentVolumeClaimStatus persistentVolumeClaimStatus = (PersistentVolumeClaimStatus) o;
        return Objects.equals(this.accessModes, persistentVolumeClaimStatus.accessModes)
            && Objects.equals(this.capacity, persistentVolumeClaimStatus.capacity)
            && Objects.equals(this.phase, persistentVolumeClaimStatus.phase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessModes, capacity, phase);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersistentVolumeClaimStatus {\n");
        sb.append("    accessModes: ").append(toIndentedString(accessModes)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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
