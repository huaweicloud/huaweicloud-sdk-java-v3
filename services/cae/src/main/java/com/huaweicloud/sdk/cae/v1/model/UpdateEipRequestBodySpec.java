package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改出入网公网IP带宽信息。
 */
public class UpdateEipRequestBodySpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "egress")

    private UpdateEipRequestBodySpecEgress egress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingress")

    private UpdateEipRequestBodySpecIngress ingress;

    public UpdateEipRequestBodySpec withEgress(UpdateEipRequestBodySpecEgress egress) {
        this.egress = egress;
        return this;
    }

    public UpdateEipRequestBodySpec withEgress(Consumer<UpdateEipRequestBodySpecEgress> egressSetter) {
        if (this.egress == null) {
            this.egress = new UpdateEipRequestBodySpecEgress();
            egressSetter.accept(this.egress);
        }

        return this;
    }

    /**
     * Get egress
     * @return egress
     */
    public UpdateEipRequestBodySpecEgress getEgress() {
        return egress;
    }

    public void setEgress(UpdateEipRequestBodySpecEgress egress) {
        this.egress = egress;
    }

    public UpdateEipRequestBodySpec withIngress(UpdateEipRequestBodySpecIngress ingress) {
        this.ingress = ingress;
        return this;
    }

    public UpdateEipRequestBodySpec withIngress(Consumer<UpdateEipRequestBodySpecIngress> ingressSetter) {
        if (this.ingress == null) {
            this.ingress = new UpdateEipRequestBodySpecIngress();
            ingressSetter.accept(this.ingress);
        }

        return this;
    }

    /**
     * Get ingress
     * @return ingress
     */
    public UpdateEipRequestBodySpecIngress getIngress() {
        return ingress;
    }

    public void setIngress(UpdateEipRequestBodySpecIngress ingress) {
        this.ingress = ingress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateEipRequestBodySpec that = (UpdateEipRequestBodySpec) obj;
        return Objects.equals(this.egress, that.egress) && Objects.equals(this.ingress, that.ingress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(egress, ingress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEipRequestBodySpec {\n");
        sb.append("    egress: ").append(toIndentedString(egress)).append("\n");
        sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
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
