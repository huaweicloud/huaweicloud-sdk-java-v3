package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Curve
 */
public class Curve {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in")

    private Float in;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "out")

    private Float out;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Integer time;

    public Curve withIn(Float in) {
        this.in = in;
        return this;
    }

    /**
     * 入带宽
     * @return in
     */
    public Float getIn() {
        return in;
    }

    public void setIn(Float in) {
        this.in = in;
    }

    public Curve withOut(Float out) {
        this.out = out;
        return this;
    }

    /**
     * 出带宽
     * @return out
     */
    public Float getOut() {
        return out;
    }

    public void setOut(Float out) {
        this.out = out;
    }

    public Curve withTime(Integer time) {
        this.time = time;
        return this;
    }

    /**
     * 时间戳
     * @return time
     */
    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Curve that = (Curve) obj;
        return Objects.equals(this.in, that.in) && Objects.equals(this.out, that.out)
            && Objects.equals(this.time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(in, out, time);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Curve {\n");
        sb.append("    in: ").append(toIndentedString(in)).append("\n");
        sb.append("    out: ").append(toIndentedString(out)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
