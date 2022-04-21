package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TpsBrokens
 */
public class TpsBrokens {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average")

    private List<Double> average = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tps")

    private List<Double> tps = null;

    public TpsBrokens withAverage(List<Double> average) {
        this.average = average;
        return this;
    }

    public TpsBrokens addAverageItem(Double averageItem) {
        if (this.average == null) {
            this.average = new ArrayList<>();
        }
        this.average.add(averageItem);
        return this;
    }

    public TpsBrokens withAverage(Consumer<List<Double>> averageSetter) {
        if (this.average == null) {
            this.average = new ArrayList<>();
        }
        averageSetter.accept(this.average);
        return this;
    }

    /**
     * 平均响应时间
     * @return average
     */
    public List<Double> getAverage() {
        return average;
    }

    public void setAverage(List<Double> average) {
        this.average = average;
    }

    public TpsBrokens withTps(List<Double> tps) {
        this.tps = tps;
        return this;
    }

    public TpsBrokens addTpsItem(Double tpsItem) {
        if (this.tps == null) {
            this.tps = new ArrayList<>();
        }
        this.tps.add(tpsItem);
        return this;
    }

    public TpsBrokens withTps(Consumer<List<Double>> tpsSetter) {
        if (this.tps == null) {
            this.tps = new ArrayList<>();
        }
        tpsSetter.accept(this.tps);
        return this;
    }

    /**
     * tps
     * @return tps
     */
    public List<Double> getTps() {
        return tps;
    }

    public void setTps(List<Double> tps) {
        this.tps = tps;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TpsBrokens tpsBrokens = (TpsBrokens) o;
        return Objects.equals(this.average, tpsBrokens.average) && Objects.equals(this.tps, tpsBrokens.tps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(average, tps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TpsBrokens {\n");
        sb.append("    average: ").append(toIndentedString(average)).append("\n");
        sb.append("    tps: ").append(toIndentedString(tps)).append("\n");
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
