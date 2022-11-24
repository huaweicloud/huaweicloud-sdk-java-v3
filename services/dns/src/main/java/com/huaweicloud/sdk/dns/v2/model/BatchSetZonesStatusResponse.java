package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchSetZonesStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zones")

    private List<ZoneData> zones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Metedata metadata;

    public BatchSetZonesStatusResponse withZones(List<ZoneData> zones) {
        this.zones = zones;
        return this;
    }

    public BatchSetZonesStatusResponse addZonesItem(ZoneData zonesItem) {
        if (this.zones == null) {
            this.zones = new ArrayList<>();
        }
        this.zones.add(zonesItem);
        return this;
    }

    public BatchSetZonesStatusResponse withZones(Consumer<List<ZoneData>> zonesSetter) {
        if (this.zones == null) {
            this.zones = new ArrayList<>();
        }
        zonesSetter.accept(this.zones);
        return this;
    }

    /**
     * 待删除zone类型，当前仅支持 public 或 private
     * @return zones
     */
    public List<ZoneData> getZones() {
        return zones;
    }

    public void setZones(List<ZoneData> zones) {
        this.zones = zones;
    }

    public BatchSetZonesStatusResponse withMetadata(Metedata metadata) {
        this.metadata = metadata;
        return this;
    }

    public BatchSetZonesStatusResponse withMetadata(Consumer<Metedata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new Metedata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public Metedata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metedata metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchSetZonesStatusResponse batchSetZonesStatusResponse = (BatchSetZonesStatusResponse) o;
        return Objects.equals(this.zones, batchSetZonesStatusResponse.zones)
            && Objects.equals(this.metadata, batchSetZonesStatusResponse.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zones, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchSetZonesStatusResponse {\n");
        sb.append("    zones: ").append(toIndentedString(zones)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
