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
public class BatchShowTrafficControllersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_controller_devices")

    private List<TrafficControllerDTO> trafficControllerDevices = null;

    public BatchShowTrafficControllersResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * **参数说明**：返回信号机设备的总体数量。
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

    public BatchShowTrafficControllersResponse withTrafficControllerDevices(
        List<TrafficControllerDTO> trafficControllerDevices) {
        this.trafficControllerDevices = trafficControllerDevices;
        return this;
    }

    public BatchShowTrafficControllersResponse addTrafficControllerDevicesItem(
        TrafficControllerDTO trafficControllerDevicesItem) {
        if (this.trafficControllerDevices == null) {
            this.trafficControllerDevices = new ArrayList<>();
        }
        this.trafficControllerDevices.add(trafficControllerDevicesItem);
        return this;
    }

    public BatchShowTrafficControllersResponse withTrafficControllerDevices(
        Consumer<List<TrafficControllerDTO>> trafficControllerDevicesSetter) {
        if (this.trafficControllerDevices == null) {
            this.trafficControllerDevices = new ArrayList<>();
        }
        trafficControllerDevicesSetter.accept(this.trafficControllerDevices);
        return this;
    }

    /**
     * **参数说明**：数据列表。
     * @return trafficControllerDevices
     */
    public List<TrafficControllerDTO> getTrafficControllerDevices() {
        return trafficControllerDevices;
    }

    public void setTrafficControllerDevices(List<TrafficControllerDTO> trafficControllerDevices) {
        this.trafficControllerDevices = trafficControllerDevices;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchShowTrafficControllersResponse batchShowTrafficControllersResponse =
            (BatchShowTrafficControllersResponse) o;
        return Objects.equals(this.count, batchShowTrafficControllersResponse.count) && Objects
            .equals(this.trafficControllerDevices, batchShowTrafficControllersResponse.trafficControllerDevices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, trafficControllerDevices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchShowTrafficControllersResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    trafficControllerDevices: ").append(toIndentedString(trafficControllerDevices)).append("\n");
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
