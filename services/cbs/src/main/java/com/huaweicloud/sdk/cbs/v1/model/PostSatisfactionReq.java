package com.huaweicloud.sdk.cbs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class PostSatisfactionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "degree")

    private Integer degree;

    public PostSatisfactionReq withDegree(Integer degree) {
        this.degree = degree;
        return this;
    }

    /**
     * 满意度评分，当前仅支持二级评分，1表示满意，-1表示不满意。
     * minimum: -1
     * maximum: 1
     * @return degree
     */
    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PostSatisfactionReq that = (PostSatisfactionReq) obj;
        return Objects.equals(this.degree, that.degree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(degree);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostSatisfactionReq {\n");
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
