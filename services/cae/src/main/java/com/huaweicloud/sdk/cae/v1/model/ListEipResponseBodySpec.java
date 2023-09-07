package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 出入网公网IP信息。
 */
public class ListEipResponseBodySpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "egress")

    private ListEipResponseBodySpecEgress egress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingress")

    private ListEipResponseBodySpecIngress ingress;

    public ListEipResponseBodySpec withEgress(ListEipResponseBodySpecEgress egress) {
        this.egress = egress;
        return this;
    }

    public ListEipResponseBodySpec withEgress(Consumer<ListEipResponseBodySpecEgress> egressSetter) {
        if (this.egress == null) {
            this.egress = new ListEipResponseBodySpecEgress();
            egressSetter.accept(this.egress);
        }

        return this;
    }

    /**
     * Get egress
     * @return egress
     */
    public ListEipResponseBodySpecEgress getEgress() {
        return egress;
    }

    public void setEgress(ListEipResponseBodySpecEgress egress) {
        this.egress = egress;
    }

    public ListEipResponseBodySpec withIngress(ListEipResponseBodySpecIngress ingress) {
        this.ingress = ingress;
        return this;
    }

    public ListEipResponseBodySpec withIngress(Consumer<ListEipResponseBodySpecIngress> ingressSetter) {
        if (this.ingress == null) {
            this.ingress = new ListEipResponseBodySpecIngress();
            ingressSetter.accept(this.ingress);
        }

        return this;
    }

    /**
     * Get ingress
     * @return ingress
     */
    public ListEipResponseBodySpecIngress getIngress() {
        return ingress;
    }

    public void setIngress(ListEipResponseBodySpecIngress ingress) {
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
        ListEipResponseBodySpec that = (ListEipResponseBodySpec) obj;
        return Objects.equals(this.egress, that.egress) && Objects.equals(this.ingress, that.ingress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(egress, ingress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEipResponseBodySpec {\n");
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
