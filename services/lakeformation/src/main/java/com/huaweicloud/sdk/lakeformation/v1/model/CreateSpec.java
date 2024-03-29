package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateSpec
 */
public class CreateSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stride_num")

    private Integer strideNum;

    public CreateSpec withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 商品ID。由系统自动生成，如OFFI8XXXXXXXXXXXXXXXX4。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public CreateSpec withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 规格编码。由系统自动生成，例如lakeformation.unit.basic.qps。
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
     * 步数。QPS为每秒最大请求数步长，最小为5，步长为1。
     * minimum: 0
     * maximum: 2147483647
     * @return strideNum
     */
    public Integer getStrideNum() {
        return strideNum;
    }

    public void setStrideNum(Integer strideNum) {
        this.strideNum = strideNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSpec that = (CreateSpec) obj;
        return Objects.equals(this.productId, that.productId) && Objects.equals(this.specCode, that.specCode)
            && Objects.equals(this.strideNum, that.strideNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, specCode, strideNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSpec {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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
