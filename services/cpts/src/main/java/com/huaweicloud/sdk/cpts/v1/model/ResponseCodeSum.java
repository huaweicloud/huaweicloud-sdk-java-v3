package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResponseCodeSum
 */
public class ResponseCodeSum {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum1xx")

    private Integer sum1xx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum2xx")

    private Integer sum2xx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum3xx")

    private Integer sum3xx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum4xx")

    private Integer sum4xx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sum5xx")

    private Integer sum5xx;

    public ResponseCodeSum withSum1xx(Integer sum1xx) {
        this.sum1xx = sum1xx;
        return this;
    }

    /**
     * 1xx请求数
     * @return sum1xx
     */
    public Integer getSum1xx() {
        return sum1xx;
    }

    public void setSum1xx(Integer sum1xx) {
        this.sum1xx = sum1xx;
    }

    public ResponseCodeSum withSum2xx(Integer sum2xx) {
        this.sum2xx = sum2xx;
        return this;
    }

    /**
     * 2xx请求数
     * @return sum2xx
     */
    public Integer getSum2xx() {
        return sum2xx;
    }

    public void setSum2xx(Integer sum2xx) {
        this.sum2xx = sum2xx;
    }

    public ResponseCodeSum withSum3xx(Integer sum3xx) {
        this.sum3xx = sum3xx;
        return this;
    }

    /**
     * 3xx请求数
     * @return sum3xx
     */
    public Integer getSum3xx() {
        return sum3xx;
    }

    public void setSum3xx(Integer sum3xx) {
        this.sum3xx = sum3xx;
    }

    public ResponseCodeSum withSum4xx(Integer sum4xx) {
        this.sum4xx = sum4xx;
        return this;
    }

    /**
     * 4xx请求数
     * @return sum4xx
     */
    public Integer getSum4xx() {
        return sum4xx;
    }

    public void setSum4xx(Integer sum4xx) {
        this.sum4xx = sum4xx;
    }

    public ResponseCodeSum withSum5xx(Integer sum5xx) {
        this.sum5xx = sum5xx;
        return this;
    }

    /**
     * 5xx请求数
     * @return sum5xx
     */
    public Integer getSum5xx() {
        return sum5xx;
    }

    public void setSum5xx(Integer sum5xx) {
        this.sum5xx = sum5xx;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponseCodeSum responseCodeSum = (ResponseCodeSum) o;
        return Objects.equals(this.sum1xx, responseCodeSum.sum1xx)
            && Objects.equals(this.sum2xx, responseCodeSum.sum2xx)
            && Objects.equals(this.sum3xx, responseCodeSum.sum3xx)
            && Objects.equals(this.sum4xx, responseCodeSum.sum4xx)
            && Objects.equals(this.sum5xx, responseCodeSum.sum5xx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sum1xx, sum2xx, sum3xx, sum4xx, sum5xx);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseCodeSum {\n");
        sb.append("    sum1xx: ").append(toIndentedString(sum1xx)).append("\n");
        sb.append("    sum2xx: ").append(toIndentedString(sum2xx)).append("\n");
        sb.append("    sum3xx: ").append(toIndentedString(sum3xx)).append("\n");
        sb.append("    sum4xx: ").append(toIndentedString(sum4xx)).append("\n");
        sb.append("    sum5xx: ").append(toIndentedString(sum5xx)).append("\n");
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
