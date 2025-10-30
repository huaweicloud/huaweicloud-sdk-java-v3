package com.huaweicloud.sdk.cloudpond.v2.model;

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
public class ListSaleCyclesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sale_cycles")

    private List<SaleCycleOption> saleCycles = null;

    public ListSaleCyclesResponse withSaleCycles(List<SaleCycleOption> saleCycles) {
        this.saleCycles = saleCycles;
        return this;
    }

    public ListSaleCyclesResponse addSaleCyclesItem(SaleCycleOption saleCyclesItem) {
        if (this.saleCycles == null) {
            this.saleCycles = new ArrayList<>();
        }
        this.saleCycles.add(saleCyclesItem);
        return this;
    }

    public ListSaleCyclesResponse withSaleCycles(Consumer<List<SaleCycleOption>> saleCyclesSetter) {
        if (this.saleCycles == null) {
            this.saleCycles = new ArrayList<>();
        }
        saleCyclesSetter.accept(this.saleCycles);
        return this;
    }

    /**
     * Get saleCycles
     * @return saleCycles
     */
    public List<SaleCycleOption> getSaleCycles() {
        return saleCycles;
    }

    public void setSaleCycles(List<SaleCycleOption> saleCycles) {
        this.saleCycles = saleCycles;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSaleCyclesResponse that = (ListSaleCyclesResponse) obj;
        return Objects.equals(this.saleCycles, that.saleCycles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saleCycles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSaleCyclesResponse {\n");
        sb.append("    saleCycles: ").append(toIndentedString(saleCycles)).append("\n");
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
