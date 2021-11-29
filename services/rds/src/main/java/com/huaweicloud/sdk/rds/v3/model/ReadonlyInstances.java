package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** ReadonlyInstances */
public class ReadonlyInstances {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zones")

    private List<AvailableZone> availableZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_num")

    private Integer cpuNum;

    public ReadonlyInstances withId(String id) {
        this.id = id;
        return this;
    }

    /** 只读实例ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ReadonlyInstances withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 只读实例状态。
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ReadonlyInstances withName(String name) {
        this.name = name;
        return this;
    }

    /** 只读实例名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReadonlyInstances withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /** 只读实例读写分离权重。
     * 
     * @return weight */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public ReadonlyInstances withAvailableZones(List<AvailableZone> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    public ReadonlyInstances addAvailableZonesItem(AvailableZone availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public ReadonlyInstances withAvailableZones(Consumer<List<AvailableZone>> availableZonesSetter) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /** 可用区信息。
     * 
     * @return availableZones */
    public List<AvailableZone> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<AvailableZone> availableZones) {
        this.availableZones = availableZones;
    }

    public ReadonlyInstances withCpuNum(Integer cpuNum) {
        this.cpuNum = cpuNum;
        return this;
    }

    /** 只读实例CPU个数。
     * 
     * @return cpuNum */
    public Integer getCpuNum() {
        return cpuNum;
    }

    public void setCpuNum(Integer cpuNum) {
        this.cpuNum = cpuNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReadonlyInstances readonlyInstances = (ReadonlyInstances) o;
        return Objects.equals(this.id, readonlyInstances.id) && Objects.equals(this.status, readonlyInstances.status)
            && Objects.equals(this.name, readonlyInstances.name)
            && Objects.equals(this.weight, readonlyInstances.weight)
            && Objects.equals(this.availableZones, readonlyInstances.availableZones)
            && Objects.equals(this.cpuNum, readonlyInstances.cpuNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, name, weight, availableZones, cpuNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReadonlyInstances {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
        sb.append("    cpuNum: ").append(toIndentedString(cpuNum)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
