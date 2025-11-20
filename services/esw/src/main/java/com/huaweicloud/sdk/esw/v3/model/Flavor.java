package com.huaweicloud.sdk.esw.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 配额信息
 */
public class Flavor {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connections")

    private Integer connections;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private Integer bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pps")

    private Integer pps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zones")

    private List<String> availableZones = null;

    public Flavor withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * - 参数解释：ESW实例规格名称。 - 约束限制：不涉及。 - 取值范围：  - l2cg.small.ha  - l2cg.medium.ha  - l2cg.large.ha - 默认取值：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flavor withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * - 参数解释：ESW实例规格的唯一标识。 - 约束限制：不涉及。 - 取值范围：1-3。 - 默认取值：不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Flavor withConnections(Integer connections) {
        this.connections = connections;
        return this;
    }

    /**
     * - 参数解释：该规格ESW实例可承载的二层连接数量。 - 约束限制：不涉及。 - 取值范围：1、3、6。 - 默认取值：不涉及。
     * @return connections
     */
    public Integer getConnections() {
        return connections;
    }

    public void setConnections(Integer connections) {
        this.connections = connections;
    }

    public Flavor withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * - 参数解释：该规格ESW实例可承载的最大带宽。 - 约束限制：单位:Gbit/s。 - 取值范围：3、5、10。 - 默认取值：不涉及。
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Flavor withPps(Integer pps) {
        this.pps = pps;
        return this;
    }

    /**
     * - 参数解释：该规格ESW实例可承载的最大发包数。 - 约束限制：不涉及。 - 取值范围：500000、1000000、2000000。 - 默认取值：不涉及。
     * @return pps
     */
    public Integer getPps() {
        return pps;
    }

    public void setPps(Integer pps) {
        this.pps = pps;
    }

    public Flavor withAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    public Flavor addAvailableZonesItem(String availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public Flavor withAvailableZones(Consumer<List<String>> availableZonesSetter) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * - 参数解释：可选用该规格的可用区列表。 - 约束限制：不涉及。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return availableZones
     */
    public List<String> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Flavor that = (Flavor) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.id, that.id)
            && Objects.equals(this.connections, that.connections) && Objects.equals(this.bandwidth, that.bandwidth)
            && Objects.equals(this.pps, that.pps) && Objects.equals(this.availableZones, that.availableZones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, connections, bandwidth, pps, availableZones);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Flavor {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    pps: ").append(toIndentedString(pps)).append("\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
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
