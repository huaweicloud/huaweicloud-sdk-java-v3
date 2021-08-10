package com.huaweicloud.sdk.live.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** HttpCode */
public class HttpCode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private Integer code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proportion")

    private Double proportion;

    public HttpCode withCode(Integer code) {
        this.code = code;
        return this;
    }

    /** 状态码 minimum: 0 maximum: 2147483647
     * 
     * @return code */
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public HttpCode withCount(Integer count) {
        this.count = count;
        return this;
    }

    /** 状态码出现次数 minimum: 0 maximum: 2147483647
     * 
     * @return count */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public HttpCode withProportion(Double proportion) {
        this.proportion = proportion;
        return this;
    }

    /** 状态码在对应时间点中的占比，保留4位小数。 minimum: 0 maximum: 1
     * 
     * @return proportion */
    public Double getProportion() {
        return proportion;
    }

    public void setProportion(Double proportion) {
        this.proportion = proportion;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HttpCode httpCode = (HttpCode) o;
        return Objects.equals(this.code, httpCode.code) && Objects.equals(this.count, httpCode.count)
            && Objects.equals(this.proportion, httpCode.proportion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, count, proportion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpCode {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    proportion: ").append(toIndentedString(proportion)).append("\n");
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
