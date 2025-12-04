package com.huaweicloud.sdk.asm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Metric
 */
public class Metric {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aom")

    private List<Aom> aom = null;

    public Metric withAom(List<Aom> aom) {
        this.aom = aom;
        return this;
    }

    public Metric addAomItem(Aom aomItem) {
        if (this.aom == null) {
            this.aom = new ArrayList<>();
        }
        this.aom.add(aomItem);
        return this;
    }

    public Metric withAom(Consumer<List<Aom>> aomSetter) {
        if (this.aom == null) {
            this.aom = new ArrayList<>();
        }
        aomSetter.accept(this.aom);
        return this;
    }

    /**
     * AOM实例配置。
     * @return aom
     */
    public List<Aom> getAom() {
        return aom;
    }

    public void setAom(List<Aom> aom) {
        this.aom = aom;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Metric that = (Metric) obj;
        return Objects.equals(this.aom, that.aom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aom);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Metric {\n");
        sb.append("    aom: ").append(toIndentedString(aom)).append("\n");
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
