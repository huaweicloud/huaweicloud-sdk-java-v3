package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDefaultSecurityCheckPolicyDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_details")

    private List<SecurityCheckPolicyDetailInfoResponseInfo> checkDetails = null;

    public ShowDefaultSecurityCheckPolicyDetailsResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * **参数解释** 检查项列表总数 **取值范围** 取值0-2147483647
     * minimum: 0
     * maximum: 2147483647
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public ShowDefaultSecurityCheckPolicyDetailsResponse withCheckDetails(
        List<SecurityCheckPolicyDetailInfoResponseInfo> checkDetails) {
        this.checkDetails = checkDetails;
        return this;
    }

    public ShowDefaultSecurityCheckPolicyDetailsResponse addCheckDetailsItem(
        SecurityCheckPolicyDetailInfoResponseInfo checkDetailsItem) {
        if (this.checkDetails == null) {
            this.checkDetails = new ArrayList<>();
        }
        this.checkDetails.add(checkDetailsItem);
        return this;
    }

    public ShowDefaultSecurityCheckPolicyDetailsResponse withCheckDetails(
        Consumer<List<SecurityCheckPolicyDetailInfoResponseInfo>> checkDetailsSetter) {
        if (this.checkDetails == null) {
            this.checkDetails = new ArrayList<>();
        }
        checkDetailsSetter.accept(this.checkDetails);
        return this;
    }

    /**
     * **参数解释** 检查项列表
     * @return checkDetails
     */
    public List<SecurityCheckPolicyDetailInfoResponseInfo> getCheckDetails() {
        return checkDetails;
    }

    public void setCheckDetails(List<SecurityCheckPolicyDetailInfoResponseInfo> checkDetails) {
        this.checkDetails = checkDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDefaultSecurityCheckPolicyDetailsResponse that = (ShowDefaultSecurityCheckPolicyDetailsResponse) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.checkDetails, that.checkDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, checkDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDefaultSecurityCheckPolicyDetailsResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    checkDetails: ").append(toIndentedString(checkDetails)).append("\n");
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
