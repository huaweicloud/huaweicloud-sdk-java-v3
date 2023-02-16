package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EvaluateRequestReq
 */
public class EvaluateRequestReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "degree")

    private Integer degree;

    public EvaluateRequestReq withDegree(Integer degree) {
        this.degree = degree;
        return this;
    }

    /**
     * 评价结果
     * minimum: -65535
     * maximum: 65535
     * @return degree
     */
    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EvaluateRequestReq evaluateRequestReq = (EvaluateRequestReq) o;
        return Objects.equals(this.degree, evaluateRequestReq.degree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(degree);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluateRequestReq {\n");
        sb.append("    degree: ").append(toIndentedString(degree)).append("\n");
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
