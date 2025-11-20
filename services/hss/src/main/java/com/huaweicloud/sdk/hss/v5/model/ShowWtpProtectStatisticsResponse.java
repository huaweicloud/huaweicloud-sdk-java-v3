package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowWtpProtectStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_host_num")

    private Integer protectHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_success_host_num")

    private Integer protectSuccessHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_fail_host_num")

    private Integer protectFailHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "anti_tampering_num")

    private Integer antiTamperingNum;

    public ShowWtpProtectStatisticsResponse withProtectHostNum(Integer protectHostNum) {
        this.protectHostNum = protectHostNum;
        return this;
    }

    /**
     * **参数解释**: 防护服务器总数，包含防护状态是防护中、部分防护、防护暂停、防护失败、防护中断和开启中共6种状态的服务器总数 **取值范围**: 最小值0，最大值1000000 
     * minimum: 0
     * maximum: 1000000
     * @return protectHostNum
     */
    public Integer getProtectHostNum() {
        return protectHostNum;
    }

    public void setProtectHostNum(Integer protectHostNum) {
        this.protectHostNum = protectHostNum;
    }

    public ShowWtpProtectStatisticsResponse withProtectSuccessHostNum(Integer protectSuccessHostNum) {
        this.protectSuccessHostNum = protectSuccessHostNum;
        return this;
    }

    /**
     * **参数解释**: 防护状态为防护中的服务器总数 **取值范围**: 最小值0，最大值1000000 
     * minimum: 0
     * maximum: 1000000
     * @return protectSuccessHostNum
     */
    public Integer getProtectSuccessHostNum() {
        return protectSuccessHostNum;
    }

    public void setProtectSuccessHostNum(Integer protectSuccessHostNum) {
        this.protectSuccessHostNum = protectSuccessHostNum;
    }

    public ShowWtpProtectStatisticsResponse withProtectFailHostNum(Integer protectFailHostNum) {
        this.protectFailHostNum = protectFailHostNum;
        return this;
    }

    /**
     * **参数解释**: 防护状态为防护失败的服务器总数 **取值范围**: 最小值0，最大值1000000 
     * minimum: 0
     * maximum: 1000000
     * @return protectFailHostNum
     */
    public Integer getProtectFailHostNum() {
        return protectFailHostNum;
    }

    public void setProtectFailHostNum(Integer protectFailHostNum) {
        this.protectFailHostNum = protectFailHostNum;
    }

    public ShowWtpProtectStatisticsResponse withAntiTamperingNum(Integer antiTamperingNum) {
        this.antiTamperingNum = antiTamperingNum;
        return this;
    }

    /**
     * **参数解释**: 近168小时防护事件数 **取值范围**: 最小值0，最大值50000000 
     * minimum: 0
     * maximum: 50000000
     * @return antiTamperingNum
     */
    public Integer getAntiTamperingNum() {
        return antiTamperingNum;
    }

    public void setAntiTamperingNum(Integer antiTamperingNum) {
        this.antiTamperingNum = antiTamperingNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowWtpProtectStatisticsResponse that = (ShowWtpProtectStatisticsResponse) obj;
        return Objects.equals(this.protectHostNum, that.protectHostNum)
            && Objects.equals(this.protectSuccessHostNum, that.protectSuccessHostNum)
            && Objects.equals(this.protectFailHostNum, that.protectFailHostNum)
            && Objects.equals(this.antiTamperingNum, that.antiTamperingNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectHostNum, protectSuccessHostNum, protectFailHostNum, antiTamperingNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWtpProtectStatisticsResponse {\n");
        sb.append("    protectHostNum: ").append(toIndentedString(protectHostNum)).append("\n");
        sb.append("    protectSuccessHostNum: ").append(toIndentedString(protectSuccessHostNum)).append("\n");
        sb.append("    protectFailHostNum: ").append(toIndentedString(protectFailHostNum)).append("\n");
        sb.append("    antiTamperingNum: ").append(toIndentedString(antiTamperingNum)).append("\n");
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
