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
public class BatchDeleteZonesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zones")

    private List<ZoneData> zones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Metadata metadata;

    public BatchDeleteZonesResponse withZones(List<ZoneData> zones) {
        this.zones = zones;
        return this;
    }

    public BatchDeleteZonesResponse addZonesItem(ZoneData zonesItem) {
        if (this.zones == null) {
            this.zones = new ArrayList<>();
        }
        this.zones.add(zonesItem);
        return this;
    }

    public BatchDeleteZonesResponse withZones(Consumer<List<ZoneData>> zonesSetter) {
        if (this.zones == null) {
            this.zones = new ArrayList<>();
        }
        zonesSetter.accept(this.zones);
        return this;
    }

    /**
     * 删除zone的列表响应。
     * @return zones
     */
    public List<ZoneData> getZones() {
        return zones;
    }

    public void setZones(List<ZoneData> zones) {
        this.zones = zones;
    }

    public BatchDeleteZonesResponse withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public BatchDeleteZonesResponse withMetadata(Consumer<Metadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new Metadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteZonesResponse that = (BatchDeleteZonesResponse) obj;
        return Objects.equals(this.zones, that.zones) && Objects.equals(this.metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zones, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteZonesResponse {\n");
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
