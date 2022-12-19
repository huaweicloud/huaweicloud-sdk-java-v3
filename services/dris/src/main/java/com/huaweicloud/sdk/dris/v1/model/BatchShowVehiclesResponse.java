package com.huaweicloud.sdk.dris.v1.model;

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
public class BatchShowVehiclesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vehicles")

    private List<VehicleDTO> vehicles = null;

    public BatchShowVehiclesResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * **参数说明**：返回车辆的总体数量。
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public BatchShowVehiclesResponse withVehicles(List<VehicleDTO> vehicles) {
        this.vehicles = vehicles;
        return this;
    }

    public BatchShowVehiclesResponse addVehiclesItem(VehicleDTO vehiclesItem) {
        if (this.vehicles == null) {
            this.vehicles = new ArrayList<>();
        }
        this.vehicles.add(vehiclesItem);
        return this;
    }

    public BatchShowVehiclesResponse withVehicles(Consumer<List<VehicleDTO>> vehiclesSetter) {
        if (this.vehicles == null) {
            this.vehicles = new ArrayList<>();
        }
        vehiclesSetter.accept(this.vehicles);
        return this;
    }

    /**
     * **参数说明**：数据列表。
     * @return vehicles
     */
    public List<VehicleDTO> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<VehicleDTO> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchShowVehiclesResponse batchShowVehiclesResponse = (BatchShowVehiclesResponse) o;
        return Objects.equals(this.count, batchShowVehiclesResponse.count)
            && Objects.equals(this.vehicles, batchShowVehiclesResponse.vehicles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, vehicles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchShowVehiclesResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    vehicles: ").append(toIndentedString(vehicles)).append("\n");
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
