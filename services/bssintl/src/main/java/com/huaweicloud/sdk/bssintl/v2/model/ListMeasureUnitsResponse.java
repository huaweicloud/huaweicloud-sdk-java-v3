package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListMeasureUnitsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_units")

    private List<MeasureUnitRest> measureUnits = null;

    public ListMeasureUnitsResponse withMeasureUnits(List<MeasureUnitRest> measureUnits) {
        this.measureUnits = measureUnits;
        return this;
    }

    public ListMeasureUnitsResponse addMeasureUnitsItem(MeasureUnitRest measureUnitsItem) {
        if (this.measureUnits == null) {
            this.measureUnits = new ArrayList<>();
        }
        this.measureUnits.add(measureUnitsItem);
        return this;
    }

    public ListMeasureUnitsResponse withMeasureUnits(Consumer<List<MeasureUnitRest>> measureUnitsSetter) {
        if (this.measureUnits == null) {
            this.measureUnits = new ArrayList<>();
        }
        measureUnitsSetter.accept(this.measureUnits);
        return this;
    }

    /** |参数名称：度量信息| |参数约束以及描述：度量信息|
     * 
     * @return measureUnits */
    public List<MeasureUnitRest> getMeasureUnits() {
        return measureUnits;
    }

    public void setMeasureUnits(List<MeasureUnitRest> measureUnits) {
        this.measureUnits = measureUnits;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMeasureUnitsResponse listMeasureUnitsResponse = (ListMeasureUnitsResponse) o;
        return Objects.equals(this.measureUnits, listMeasureUnitsResponse.measureUnits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(measureUnits);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMeasureUnitsResponse {\n");
        sb.append("    measureUnits: ").append(toIndentedString(measureUnits)).append("\n");
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
