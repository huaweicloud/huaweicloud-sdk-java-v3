package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Single2Ha */
public class Single2Ha {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "single_to_ha")

    private Single2HaObject singleToHa;

    public Single2Ha withSingleToHa(Single2HaObject singleToHa) {
        this.singleToHa = singleToHa;
        return this;
    }

    public Single2Ha withSingleToHa(Consumer<Single2HaObject> singleToHaSetter) {
        if (this.singleToHa == null) {
            this.singleToHa = new Single2HaObject();
            singleToHaSetter.accept(this.singleToHa);
        }

        return this;
    }

    /** Get singleToHa
     * 
     * @return singleToHa */
    public Single2HaObject getSingleToHa() {
        return singleToHa;
    }

    public void setSingleToHa(Single2HaObject singleToHa) {
        this.singleToHa = singleToHa;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Single2Ha single2Ha = (Single2Ha) o;
        return Objects.equals(this.singleToHa, single2Ha.singleToHa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(singleToHa);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Single2Ha {\n");
        sb.append("    singleToHa: ").append(toIndentedString(singleToHa)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
