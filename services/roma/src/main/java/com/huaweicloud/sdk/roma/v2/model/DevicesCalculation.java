package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * DevicesCalculation
 */
public class DevicesCalculation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "normal_devices")

    private Calculation normalDevices;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_devices")

    private Calculation gatewayDevices;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subsets_devices")

    private Calculation subsetsDevices;

    public DevicesCalculation withNormalDevices(Calculation normalDevices) {
        this.normalDevices = normalDevices;
        return this;
    }

    public DevicesCalculation withNormalDevices(Consumer<Calculation> normalDevicesSetter) {
        if (this.normalDevices == null) {
            this.normalDevices = new Calculation();
            normalDevicesSetter.accept(this.normalDevices);
        }

        return this;
    }

    /**
     * Get normalDevices
     * @return normalDevices
     */
    public Calculation getNormalDevices() {
        return normalDevices;
    }

    public void setNormalDevices(Calculation normalDevices) {
        this.normalDevices = normalDevices;
    }

    public DevicesCalculation withGatewayDevices(Calculation gatewayDevices) {
        this.gatewayDevices = gatewayDevices;
        return this;
    }

    public DevicesCalculation withGatewayDevices(Consumer<Calculation> gatewayDevicesSetter) {
        if (this.gatewayDevices == null) {
            this.gatewayDevices = new Calculation();
            gatewayDevicesSetter.accept(this.gatewayDevices);
        }

        return this;
    }

    /**
     * Get gatewayDevices
     * @return gatewayDevices
     */
    public Calculation getGatewayDevices() {
        return gatewayDevices;
    }

    public void setGatewayDevices(Calculation gatewayDevices) {
        this.gatewayDevices = gatewayDevices;
    }

    public DevicesCalculation withSubsetsDevices(Calculation subsetsDevices) {
        this.subsetsDevices = subsetsDevices;
        return this;
    }

    public DevicesCalculation withSubsetsDevices(Consumer<Calculation> subsetsDevicesSetter) {
        if (this.subsetsDevices == null) {
            this.subsetsDevices = new Calculation();
            subsetsDevicesSetter.accept(this.subsetsDevices);
        }

        return this;
    }

    /**
     * Get subsetsDevices
     * @return subsetsDevices
     */
    public Calculation getSubsetsDevices() {
        return subsetsDevices;
    }

    public void setSubsetsDevices(Calculation subsetsDevices) {
        this.subsetsDevices = subsetsDevices;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DevicesCalculation devicesCalculation = (DevicesCalculation) o;
        return Objects.equals(this.normalDevices, devicesCalculation.normalDevices)
            && Objects.equals(this.gatewayDevices, devicesCalculation.gatewayDevices)
            && Objects.equals(this.subsetsDevices, devicesCalculation.subsetsDevices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(normalDevices, gatewayDevices, subsetsDevices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DevicesCalculation {\n");
        sb.append("    normalDevices: ").append(toIndentedString(normalDevices)).append("\n");
        sb.append("    gatewayDevices: ").append(toIndentedString(gatewayDevices)).append("\n");
        sb.append("    subsetsDevices: ").append(toIndentedString(subsetsDevices)).append("\n");
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
