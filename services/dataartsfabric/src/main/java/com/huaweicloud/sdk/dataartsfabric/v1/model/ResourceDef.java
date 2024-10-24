package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResourceDef
 */
public class ResourceDef {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "warm_up_num")

    private Integer warmUpNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_num")

    private Integer maxNum;

    public ResourceDef withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 资源规格编码,从查询规格列表ListSpecs接口获取
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public ResourceDef withWarmUpNum(Integer warmUpNum) {
        this.warmUpNum = warmUpNum;
        return this;
    }

    /**
     * 预热资源量
     * minimum: 1
     * maximum: 1000
     * @return warmUpNum
     */
    public Integer getWarmUpNum() {
        return warmUpNum;
    }

    public void setWarmUpNum(Integer warmUpNum) {
        this.warmUpNum = warmUpNum;
    }

    public ResourceDef withMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
        return this;
    }

    /**
     * 最大资源量，不填默认为预热资源量，即不使用弹性资源
     * minimum: 1
     * maximum: 1000
     * @return maxNum
     */
    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceDef that = (ResourceDef) obj;
        return Objects.equals(this.specCode, that.specCode) && Objects.equals(this.warmUpNum, that.warmUpNum)
            && Objects.equals(this.maxNum, that.maxNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specCode, warmUpNum, maxNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceDef {\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    warmUpNum: ").append(toIndentedString(warmUpNum)).append("\n");
        sb.append("    maxNum: ").append(toIndentedString(maxNum)).append("\n");
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
