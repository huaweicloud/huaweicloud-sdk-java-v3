package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListRegistryStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_num")

    private Integer failNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_num")

    private Integer successNum;

    public ListRegistryStatisticsResponse withFailNum(Integer failNum) {
        this.failNum = failNum;
        return this;
    }

    /**
     * **参数解释**： 接入异常数量 **取值范围**： 0-100 
     * minimum: 0
     * maximum: 100
     * @return failNum
     */
    public Integer getFailNum() {
        return failNum;
    }

    public void setFailNum(Integer failNum) {
        this.failNum = failNum;
    }

    public ListRegistryStatisticsResponse withSuccessNum(Integer successNum) {
        this.successNum = successNum;
        return this;
    }

    /**
     * **参数解释**： 接入成功数量 **取值范围**： 0-100 
     * minimum: 0
     * maximum: 100
     * @return successNum
     */
    public Integer getSuccessNum() {
        return successNum;
    }

    public void setSuccessNum(Integer successNum) {
        this.successNum = successNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRegistryStatisticsResponse that = (ListRegistryStatisticsResponse) obj;
        return Objects.equals(this.failNum, that.failNum) && Objects.equals(this.successNum, that.successNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(failNum, successNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRegistryStatisticsResponse {\n");
        sb.append("    failNum: ").append(toIndentedString(failNum)).append("\n");
        sb.append("    successNum: ").append(toIndentedString(successNum)).append("\n");
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
