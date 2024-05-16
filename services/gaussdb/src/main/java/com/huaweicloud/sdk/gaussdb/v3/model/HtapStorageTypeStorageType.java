package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HtapStorageTypeStorageType
 */
public class HtapStorageTypeStorageType {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_status")

    private Map<String, String> azStatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_volume_size")

    private Integer minVolumeSize;

    public HtapStorageTypeStorageType withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 存储介质名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HtapStorageTypeStorageType withAzStatus(Map<String, String> azStatus) {
        this.azStatus = azStatus;
        return this;
    }

    public HtapStorageTypeStorageType putAzStatusItem(String key, String azStatusItem) {
        if (this.azStatus == null) {
            this.azStatus = new HashMap<>();
        }
        this.azStatus.put(key, azStatusItem);
        return this;
    }

    public HtapStorageTypeStorageType withAzStatus(Consumer<Map<String, String>> azStatusSetter) {
        if (this.azStatus == null) {
            this.azStatus = new HashMap<>();
        }
        azStatusSetter.accept(this.azStatus);
        return this;
    }

    /**
     * 可支持可用区信息。
     * @return azStatus
     */
    public Map<String, String> getAzStatus() {
        return azStatus;
    }

    public void setAzStatus(Map<String, String> azStatus) {
        this.azStatus = azStatus;
    }

    public HtapStorageTypeStorageType withMinVolumeSize(Integer minVolumeSize) {
        this.minVolumeSize = minVolumeSize;
        return this;
    }

    /**
     * 最小可提供磁盘大小。
     * @return minVolumeSize
     */
    public Integer getMinVolumeSize() {
        return minVolumeSize;
    }

    public void setMinVolumeSize(Integer minVolumeSize) {
        this.minVolumeSize = minVolumeSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HtapStorageTypeStorageType that = (HtapStorageTypeStorageType) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.azStatus, that.azStatus)
            && Objects.equals(this.minVolumeSize, that.minVolumeSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, azStatus, minVolumeSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HtapStorageTypeStorageType {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    azStatus: ").append(toIndentedString(azStatus)).append("\n");
        sb.append("    minVolumeSize: ").append(toIndentedString(minVolumeSize)).append("\n");
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
