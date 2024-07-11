package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 扩展伸缩组配置，承载区别于默认伸缩组的差异化配置
 */
public class ExtensionScaleGroupSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az")

    private String az;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacityReservationSpecification")

    private CapacityReservationSpecification capacityReservationSpecification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autoscaling")

    private ScaleGroupAutoscaling autoscaling;

    public ExtensionScaleGroupSpec withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * 节点规格
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public ExtensionScaleGroupSpec withAz(String az) {
        this.az = az;
        return this;
    }

    /**
     * 节点可用区，未指定或者为空则以默认伸缩组中配置为准
     * @return az
     */
    public String getAz() {
        return az;
    }

    public void setAz(String az) {
        this.az = az;
    }

    public ExtensionScaleGroupSpec withCapacityReservationSpecification(
        CapacityReservationSpecification capacityReservationSpecification) {
        this.capacityReservationSpecification = capacityReservationSpecification;
        return this;
    }

    public ExtensionScaleGroupSpec withCapacityReservationSpecification(
        Consumer<CapacityReservationSpecification> capacityReservationSpecificationSetter) {
        if (this.capacityReservationSpecification == null) {
            this.capacityReservationSpecification = new CapacityReservationSpecification();
            capacityReservationSpecificationSetter.accept(this.capacityReservationSpecification);
        }

        return this;
    }

    /**
     * Get capacityReservationSpecification
     * @return capacityReservationSpecification
     */
    public CapacityReservationSpecification getCapacityReservationSpecification() {
        return capacityReservationSpecification;
    }

    public void setCapacityReservationSpecification(CapacityReservationSpecification capacityReservationSpecification) {
        this.capacityReservationSpecification = capacityReservationSpecification;
    }

    public ExtensionScaleGroupSpec withAutoscaling(ScaleGroupAutoscaling autoscaling) {
        this.autoscaling = autoscaling;
        return this;
    }

    public ExtensionScaleGroupSpec withAutoscaling(Consumer<ScaleGroupAutoscaling> autoscalingSetter) {
        if (this.autoscaling == null) {
            this.autoscaling = new ScaleGroupAutoscaling();
            autoscalingSetter.accept(this.autoscaling);
        }

        return this;
    }

    /**
     * Get autoscaling
     * @return autoscaling
     */
    public ScaleGroupAutoscaling getAutoscaling() {
        return autoscaling;
    }

    public void setAutoscaling(ScaleGroupAutoscaling autoscaling) {
        this.autoscaling = autoscaling;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtensionScaleGroupSpec that = (ExtensionScaleGroupSpec) obj;
        return Objects.equals(this.flavor, that.flavor) && Objects.equals(this.az, that.az)
            && Objects.equals(this.capacityReservationSpecification, that.capacityReservationSpecification)
            && Objects.equals(this.autoscaling, that.autoscaling);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, az, capacityReservationSpecification, autoscaling);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionScaleGroupSpec {\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    az: ").append(toIndentedString(az)).append("\n");
        sb.append("    capacityReservationSpecification: ")
            .append(toIndentedString(capacityReservationSpecification))
            .append("\n");
        sb.append("    autoscaling: ").append(toIndentedString(autoscaling)).append("\n");
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
