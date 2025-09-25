package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ReduceDnRequestBody
 */
public class ReduceDnRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contraction_num")

    private Integer contractionNum;

    public ReduceDnRequestBody withContractionNum(Integer contractionNum) {
        this.contractionNum = contractionNum;
        return this;
    }

    /**
     * **参数解释**: 缩容分片数量。 **约束限制**: 缩容分片数量需要大于0且集群至少保留一个分片。 **取值范围**: 大于0的正整数。 **默认取值**: 不涉及。
     * @return contractionNum
     */
    public Integer getContractionNum() {
        return contractionNum;
    }

    public void setContractionNum(Integer contractionNum) {
        this.contractionNum = contractionNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReduceDnRequestBody that = (ReduceDnRequestBody) obj;
        return Objects.equals(this.contractionNum, that.contractionNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contractionNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReduceDnRequestBody {\n");
        sb.append("    contractionNum: ").append(toIndentedString(contractionNum)).append("\n");
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
