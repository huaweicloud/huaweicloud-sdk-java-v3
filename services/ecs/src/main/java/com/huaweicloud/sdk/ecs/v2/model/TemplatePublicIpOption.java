package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * TemplatePublicIpOption
 */
public class TemplatePublicIpOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_type")

    private String publicipType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private String chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private TemplateBandwidthOption bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_on_termination")

    private Boolean deleteOnTermination;

    public TemplatePublicIpOption withPublicipType(String publicipType) {
        this.publicipType = publicipType;
        return this;
    }

    /**
     * 弹性公网IP类型
     * @return publicipType
     */
    public String getPublicipType() {
        return publicipType;
    }

    public void setPublicipType(String publicipType) {
        this.publicipType = publicipType;
    }

    public TemplatePublicIpOption withChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 弹性公网IP计费类型
     * @return chargingMode
     */
    public String getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
    }

    public TemplatePublicIpOption withBandwidth(TemplateBandwidthOption bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public TemplatePublicIpOption withBandwidth(Consumer<TemplateBandwidthOption> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new TemplateBandwidthOption();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /**
     * Get bandwidth
     * @return bandwidth
     */
    public TemplateBandwidthOption getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(TemplateBandwidthOption bandwidth) {
        this.bandwidth = bandwidth;
    }

    public TemplatePublicIpOption withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * EIP是否随实例一同释放
     * @return deleteOnTermination
     */
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
    }

    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TemplatePublicIpOption that = (TemplatePublicIpOption) obj;
        return Objects.equals(this.publicipType, that.publicipType)
            && Objects.equals(this.chargingMode, that.chargingMode) && Objects.equals(this.bandwidth, that.bandwidth)
            && Objects.equals(this.deleteOnTermination, that.deleteOnTermination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicipType, chargingMode, bandwidth, deleteOnTermination);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplatePublicIpOption {\n");
        sb.append("    publicipType: ").append(toIndentedString(publicipType)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    deleteOnTermination: ").append(toIndentedString(deleteOnTermination)).append("\n");
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
