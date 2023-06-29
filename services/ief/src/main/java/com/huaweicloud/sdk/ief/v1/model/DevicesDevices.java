package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 终端设备信息
 */
public class DevicesDevices {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "added")

    private DevicesDevicesAdded added;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "removed")

    private List<String> removed = null;

    public DevicesDevices withAdded(DevicesDevicesAdded added) {
        this.added = added;
        return this;
    }

    public DevicesDevices withAdded(Consumer<DevicesDevicesAdded> addedSetter) {
        if (this.added == null) {
            this.added = new DevicesDevicesAdded();
            addedSetter.accept(this.added);
        }

        return this;
    }

    /**
     * Get added
     * @return added
     */
    public DevicesDevicesAdded getAdded() {
        return added;
    }

    public void setAdded(DevicesDevicesAdded added) {
        this.added = added;
    }

    public DevicesDevices withRemoved(List<String> removed) {
        this.removed = removed;
        return this;
    }

    public DevicesDevices addRemovedItem(String removedItem) {
        if (this.removed == null) {
            this.removed = new ArrayList<>();
        }
        this.removed.add(removedItem);
        return this;
    }

    public DevicesDevices withRemoved(Consumer<List<String>> removedSetter) {
        if (this.removed == null) {
            this.removed = new ArrayList<>();
        }
        removedSetter.accept(this.removed);
        return this;
    }

    /**
     * 要解绑的终端设备ID
     * @return removed
     */
    public List<String> getRemoved() {
        return removed;
    }

    public void setRemoved(List<String> removed) {
        this.removed = removed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DevicesDevices that = (DevicesDevices) obj;
        return Objects.equals(this.added, that.added) && Objects.equals(this.removed, that.removed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(added, removed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DevicesDevices {\n");
        sb.append("    added: ").append(toIndentedString(added)).append("\n");
        sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
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
