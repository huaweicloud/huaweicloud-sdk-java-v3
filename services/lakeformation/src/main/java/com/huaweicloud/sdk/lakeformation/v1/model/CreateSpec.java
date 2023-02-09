package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateSpec
 */
public class CreateSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stride_num")

    private Integer strideNum;

    public CreateSpec withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 规格编码
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public CreateSpec withStrideNum(Integer strideNum) {
        this.strideNum = strideNum;
        return this;
    }

    /**
     * 步数
     * @return strideNum
     */
    public Integer getStrideNum() {
        return strideNum;
    }

    public void setStrideNum(Integer strideNum) {
        this.strideNum = strideNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSpec createSpec = (CreateSpec) o;
        return Objects.equals(this.specCode, createSpec.specCode)
            && Objects.equals(this.strideNum, createSpec.strideNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specCode, strideNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSpec {\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    strideNum: ").append(toIndentedString(strideNum)).append("\n");
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
