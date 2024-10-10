package com.huaweicloud.sdk.aad.v2.model;

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
public class ListWafQpsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "curve")

    private List<Point> curve = null;

    public ListWafQpsResponse withCurve(List<Point> curve) {
        this.curve = curve;
        return this;
    }

    public ListWafQpsResponse addCurveItem(Point curveItem) {
        if (this.curve == null) {
            this.curve = new ArrayList<>();
        }
        this.curve.add(curveItem);
        return this;
    }

    public ListWafQpsResponse withCurve(Consumer<List<Point>> curveSetter) {
        if (this.curve == null) {
            this.curve = new ArrayList<>();
        }
        curveSetter.accept(this.curve);
        return this;
    }

    /**
     * curve
     * @return curve
     */
    public List<Point> getCurve() {
        return curve;
    }

    public void setCurve(List<Point> curve) {
        this.curve = curve;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWafQpsResponse that = (ListWafQpsResponse) obj;
        return Objects.equals(this.curve, that.curve);
    }

    @Override
    public int hashCode() {
        return Objects.hash(curve);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWafQpsResponse {\n");
        sb.append("    curve: ").append(toIndentedString(curve)).append("\n");
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
