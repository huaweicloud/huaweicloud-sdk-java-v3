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

    private Integer antiTamperingNum;

    public ShowRaspProtectStatisticsResponse withProtectHostNum(Long protectHostNum) {
        this.protectHostNum = protectHostNum;
        return this;
    }

    /**
     * **参数解释** 当前项目（或指定企业项目）下已添加应用防护的云服务器总数，统计范围为所有已启用RASP防护的主机 **取值范围** 取值0-为该项目下云服务器总数量（无上限，实际受账号资源配额限制） 
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

    public ShowRaspProtectStatisticsResponse withAntiTamperingNum(Integer antiTamperingNum) {
        this.antiTamperingNum = antiTamperingNum;
        return this;
    }

    /**
     * **参数解释** 近7天内当前项目（或指定企业项目）下RASP防护成功拦截的篡改类攻击总数，与功能介绍中'近七天微服务RASP攻击数量'对应 **取值范围** 取值0-无上限（实际受攻击频次限制） 
     * minimum: 0
     * maximum: 9223372036854775807
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
