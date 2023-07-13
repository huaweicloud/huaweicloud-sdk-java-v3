package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * **参数说明**：不同车辆类型的流量统计。
 */
public class ModelFlow {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vehicle_class")

    private Integer vehicleClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow")

    private Integer flow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average_speed")

    private BigDecimal averageSpeed;

    public ModelFlow withVehicleClass(Integer vehicleClass) {
        this.vehicleClass = vehicleClass;
        return this;
    }

    /**
     * **参数说明**：车辆类型。参考[车辆基本类型](https://support.huaweicloud.com/api-v2x/v2x_04_0162.html)。
     * minimum: 0
     * maximum: 2000
     * @return vehicleClass
     */
    public Integer getVehicleClass() {
        return vehicleClass;
    }

    public void setVehicleClass(Integer vehicleClass) {
        this.vehicleClass = vehicleClass;
    }

    public ModelFlow withFlow(Integer flow) {
        this.flow = flow;
        return this;
    }

    /**
     * **参数说明**：统计周期内的车辆数。
     * minimum: 0
     * maximum: 100000000
     * @return flow
     */
    public Integer getFlow() {
        return flow;
    }

    public void setFlow(Integer flow) {
        this.flow = flow;
    }

    public ModelFlow withAverageSpeed(BigDecimal averageSpeed) {
        this.averageSpeed = averageSpeed;
        return this;
    }

    /**
     * **参数说明**：车辆平均速度，单位km/h。
     * minimum: 0
     * maximum: 1E+3
     * @return averageSpeed
     */
    public BigDecimal getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(BigDecimal averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModelFlow that = (ModelFlow) obj;
        return Objects.equals(this.vehicleClass, that.vehicleClass) && Objects.equals(this.flow, that.flow)
            && Objects.equals(this.averageSpeed, that.averageSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleClass, flow, averageSpeed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelFlow {\n");
        sb.append("    vehicleClass: ").append(toIndentedString(vehicleClass)).append("\n");
        sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
        sb.append("    averageSpeed: ").append(toIndentedString(averageSpeed)).append("\n");
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
