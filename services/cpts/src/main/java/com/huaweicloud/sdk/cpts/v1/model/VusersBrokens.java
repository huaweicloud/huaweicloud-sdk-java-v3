package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VusersBrokens
 */
public class VusersBrokens {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vusers")

    private List<Double> vusers = null;

    public VusersBrokens withVusers(List<Double> vusers) {
        this.vusers = vusers;
        return this;
    }

    public VusersBrokens addVusersItem(Double vusersItem) {
        if (this.vusers == null) {
            this.vusers = new ArrayList<>();
        }
        this.vusers.add(vusersItem);
        return this;
    }

    public VusersBrokens withVusers(Consumer<List<Double>> vusersSetter) {
        if (this.vusers == null) {
            this.vusers = new ArrayList<>();
        }
        vusersSetter.accept(this.vusers);
        return this;
    }

    /**
     * vusers
     * @return vusers
     */
    public List<Double> getVusers() {
        return vusers;
    }

    public void setVusers(List<Double> vusers) {
        this.vusers = vusers;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VusersBrokens vusersBrokens = (VusersBrokens) o;
        return Objects.equals(this.vusers, vusersBrokens.vusers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vusers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VusersBrokens {\n");
        sb.append("    vusers: ").append(toIndentedString(vusers)).append("\n");
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
