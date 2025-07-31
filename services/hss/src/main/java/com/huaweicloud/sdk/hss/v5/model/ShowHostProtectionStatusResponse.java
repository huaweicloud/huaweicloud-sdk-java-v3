package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowHostProtectionStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no_risk")

    private Integer noRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk")

    private Integer risk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no_protect")

    private Integer noProtect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    public ShowHostProtectionStatusResponse withNoRisk(Integer noRisk) {
        this.noRisk = noRisk;
        return this;
    }

    /**
     * 无风险的主机数
     * @return noRisk
     */
    public Integer getNoRisk() {
        return noRisk;
    }

    public void setNoRisk(Integer noRisk) {
        this.noRisk = noRisk;
    }

    public ShowHostProtectionStatusResponse withRisk(Integer risk) {
        this.risk = risk;
        return this;
    }

    /**
     * 有风险的主机数
     * @return risk
     */
    public Integer getRisk() {
        return risk;
    }

    public void setRisk(Integer risk) {
        this.risk = risk;
    }

    public ShowHostProtectionStatusResponse withNoProtect(Integer noProtect) {
        this.noProtect = noProtect;
        return this;
    }

    /**
     * 未防护的主机数
     * @return noProtect
     */
    public Integer getNoProtect() {
        return noProtect;
    }

    public void setNoProtect(Integer noProtect) {
        this.noProtect = noProtect;
    }

    public ShowHostProtectionStatusResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 主机总数
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowHostProtectionStatusResponse that = (ShowHostProtectionStatusResponse) obj;
        return Objects.equals(this.noRisk, that.noRisk) && Objects.equals(this.risk, that.risk)
            && Objects.equals(this.noProtect, that.noProtect) && Objects.equals(this.totalNum, that.totalNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noRisk, risk, noProtect, totalNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHostProtectionStatusResponse {\n");
        sb.append("    noRisk: ").append(toIndentedString(noRisk)).append("\n");
        sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
        sb.append("    noProtect: ").append(toIndentedString(noProtect)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
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
