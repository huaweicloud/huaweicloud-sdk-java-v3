package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class ListApiQuantitiesV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_num")

    private Integer instanceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nums_on_release")

    private Integer numsOnRelease;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nums_off_release")

    private Integer numsOffRelease;

    public ListApiQuantitiesV2Response withInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
        return this;
    }

    /** API总个数
     * 
     * @return instanceNum */
    public Integer getInstanceNum() {
        return instanceNum;
    }

    public void setInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
    }

    public ListApiQuantitiesV2Response withNumsOnRelease(Integer numsOnRelease) {
        this.numsOnRelease = numsOnRelease;
        return this;
    }

    /** 已发布到release环境的API个数
     * 
     * @return numsOnRelease */
    public Integer getNumsOnRelease() {
        return numsOnRelease;
    }

    public void setNumsOnRelease(Integer numsOnRelease) {
        this.numsOnRelease = numsOnRelease;
    }

    public ListApiQuantitiesV2Response withNumsOffRelease(Integer numsOffRelease) {
        this.numsOffRelease = numsOffRelease;
        return this;
    }

    /** 未发布到release环境的API个数
     * 
     * @return numsOffRelease */
    public Integer getNumsOffRelease() {
        return numsOffRelease;
    }

    public void setNumsOffRelease(Integer numsOffRelease) {
        this.numsOffRelease = numsOffRelease;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListApiQuantitiesV2Response listApiQuantitiesV2Response = (ListApiQuantitiesV2Response) o;
        return Objects.equals(this.instanceNum, listApiQuantitiesV2Response.instanceNum)
            && Objects.equals(this.numsOnRelease, listApiQuantitiesV2Response.numsOnRelease)
            && Objects.equals(this.numsOffRelease, listApiQuantitiesV2Response.numsOffRelease);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceNum, numsOnRelease, numsOffRelease);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApiQuantitiesV2Response {\n");
        sb.append("    instanceNum: ").append(toIndentedString(instanceNum)).append("\n");
        sb.append("    numsOnRelease: ").append(toIndentedString(numsOnRelease)).append("\n");
        sb.append("    numsOffRelease: ").append(toIndentedString(numsOffRelease)).append("\n");
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
