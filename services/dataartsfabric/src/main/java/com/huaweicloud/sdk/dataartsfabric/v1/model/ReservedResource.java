package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 通用预留资源
 */
public class ReservedResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apu")

    private ResourceDef apu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dpu")

    private ResourceDef dpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mu")

    private ResourceDemand mu;

    public ReservedResource withApu(ResourceDef apu) {
        this.apu = apu;
        return this;
    }

    public ReservedResource withApu(Consumer<ResourceDef> apuSetter) {
        if (this.apu == null) {
            this.apu = new ResourceDef();
            apuSetter.accept(this.apu);
        }

        return this;
    }

    /**
     * Get apu
     * @return apu
     */
    public ResourceDef getApu() {
        return apu;
    }

    public void setApu(ResourceDef apu) {
        this.apu = apu;
    }

    public ReservedResource withDpu(ResourceDef dpu) {
        this.dpu = dpu;
        return this;
    }

    public ReservedResource withDpu(Consumer<ResourceDef> dpuSetter) {
        if (this.dpu == null) {
            this.dpu = new ResourceDef();
            dpuSetter.accept(this.dpu);
        }

        return this;
    }

    /**
     * Get dpu
     * @return dpu
     */
    public ResourceDef getDpu() {
        return dpu;
    }

    public void setDpu(ResourceDef dpu) {
        this.dpu = dpu;
    }

    public ReservedResource withMu(ResourceDemand mu) {
        this.mu = mu;
        return this;
    }

    public ReservedResource withMu(Consumer<ResourceDemand> muSetter) {
        if (this.mu == null) {
            this.mu = new ResourceDemand();
            muSetter.accept(this.mu);
        }

        return this;
    }

    /**
     * Get mu
     * @return mu
     */
    public ResourceDemand getMu() {
        return mu;
    }

    public void setMu(ResourceDemand mu) {
        this.mu = mu;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReservedResource that = (ReservedResource) obj;
        return Objects.equals(this.apu, that.apu) && Objects.equals(this.dpu, that.dpu)
            && Objects.equals(this.mu, that.mu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apu, dpu, mu);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReservedResource {\n");
        sb.append("    apu: ").append(toIndentedString(apu)).append("\n");
        sb.append("    dpu: ").append(toIndentedString(dpu)).append("\n");
        sb.append("    mu: ").append(toIndentedString(mu)).append("\n");
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
