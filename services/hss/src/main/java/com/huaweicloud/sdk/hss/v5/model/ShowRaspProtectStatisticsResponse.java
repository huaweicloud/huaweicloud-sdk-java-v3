package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowRaspProtectStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_host_num")

    private Long protectHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "anti_tampering_num")

    private Long antiTamperingNum;

    public ShowRaspProtectStatisticsResponse withProtectHostNum(Long protectHostNum) {
        this.protectHostNum = protectHostNum;
        return this;
    }

    /**
     * 防护主机数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return protectHostNum
     */
    public Long getProtectHostNum() {
        return protectHostNum;
    }

    public void setProtectHostNum(Long protectHostNum) {
        this.protectHostNum = protectHostNum;
    }

    public ShowRaspProtectStatisticsResponse withAntiTamperingNum(Long antiTamperingNum) {
        this.antiTamperingNum = antiTamperingNum;
        return this;
    }

    /**
     * 防御篡改攻击数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return antiTamperingNum
     */
    public Long getAntiTamperingNum() {
        return antiTamperingNum;
    }

    public void setAntiTamperingNum(Long antiTamperingNum) {
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
        ShowRaspProtectStatisticsResponse that = (ShowRaspProtectStatisticsResponse) obj;
        return Objects.equals(this.protectHostNum, that.protectHostNum)
            && Objects.equals(this.antiTamperingNum, that.antiTamperingNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectHostNum, antiTamperingNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRaspProtectStatisticsResponse {\n");
        sb.append("    protectHostNum: ").append(toIndentedString(protectHostNum)).append("\n");
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
