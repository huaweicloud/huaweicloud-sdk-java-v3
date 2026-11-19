package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_host_num")

    private Integer vaultHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rasp_host_num")

    private Integer raspHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wtp_host_num")

    private Integer wtpHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "two_factor_host_num")

    private Integer twoFactorHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isolated_file_num")

    private Integer isolatedFileNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_two_factor_host_num")

    private Integer supportTwoFactorHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_process_host_num")

    private Integer appProcessHostNum;

    public ShowStatisticsResponse withVaultHostNum(Integer vaultHostNum) {
        this.vaultHostNum = vaultHostNum;
        return this;
    }

    /**
     * **参数解释**: 勒索病毒防护开启主机数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return vaultHostNum
     */
    public Integer getVaultHostNum() {
        return vaultHostNum;
    }

    public void setVaultHostNum(Integer vaultHostNum) {
        this.vaultHostNum = vaultHostNum;
    }

    public ShowStatisticsResponse withRaspHostNum(Integer raspHostNum) {
        this.raspHostNum = raspHostNum;
        return this;
    }

    /**
     * **参数解释**: 应用防护开启主机数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return raspHostNum
     */
    public Integer getRaspHostNum() {
        return raspHostNum;
    }

    public void setRaspHostNum(Integer raspHostNum) {
        this.raspHostNum = raspHostNum;
    }

    public ShowStatisticsResponse withWtpHostNum(Integer wtpHostNum) {
        this.wtpHostNum = wtpHostNum;
        return this;
    }

    /**
     * **参数解释**: 网页防篡改开启主机数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return wtpHostNum
     */
    public Integer getWtpHostNum() {
        return wtpHostNum;
    }

    public void setWtpHostNum(Integer wtpHostNum) {
        this.wtpHostNum = wtpHostNum;
    }

    public ShowStatisticsResponse withTwoFactorHostNum(Integer twoFactorHostNum) {
        this.twoFactorHostNum = twoFactorHostNum;
        return this;
    }

    /**
     * **参数解释**: 双因子认证开启主机数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return twoFactorHostNum
     */
    public Integer getTwoFactorHostNum() {
        return twoFactorHostNum;
    }

    public void setTwoFactorHostNum(Integer twoFactorHostNum) {
        this.twoFactorHostNum = twoFactorHostNum;
    }

    public ShowStatisticsResponse withIsolatedFileNum(Integer isolatedFileNum) {
        this.isolatedFileNum = isolatedFileNum;
        return this;
    }

    /**
     * **参数解释**: 隔离文件数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return isolatedFileNum
     */
    public Integer getIsolatedFileNum() {
        return isolatedFileNum;
    }

    public void setIsolatedFileNum(Integer isolatedFileNum) {
        this.isolatedFileNum = isolatedFileNum;
    }

    public ShowStatisticsResponse withSupportTwoFactorHostNum(Integer supportTwoFactorHostNum) {
        this.supportTwoFactorHostNum = supportTwoFactorHostNum;
        return this;
    }

    /**
     * **参数解释**: 支持开启双因子的主机数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return supportTwoFactorHostNum
     */
    public Integer getSupportTwoFactorHostNum() {
        return supportTwoFactorHostNum;
    }

    public void setSupportTwoFactorHostNum(Integer supportTwoFactorHostNum) {
        this.supportTwoFactorHostNum = supportTwoFactorHostNum;
    }

    public ShowStatisticsResponse withAppProcessHostNum(Integer appProcessHostNum) {
        this.appProcessHostNum = appProcessHostNum;
        return this;
    }

    /**
     * **参数解释**: 开启应用进程的主机数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return appProcessHostNum
     */
    public Integer getAppProcessHostNum() {
        return appProcessHostNum;
    }

    public void setAppProcessHostNum(Integer appProcessHostNum) {
        this.appProcessHostNum = appProcessHostNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStatisticsResponse that = (ShowStatisticsResponse) obj;
        return Objects.equals(this.vaultHostNum, that.vaultHostNum)
            && Objects.equals(this.raspHostNum, that.raspHostNum) && Objects.equals(this.wtpHostNum, that.wtpHostNum)
            && Objects.equals(this.twoFactorHostNum, that.twoFactorHostNum)
            && Objects.equals(this.isolatedFileNum, that.isolatedFileNum)
            && Objects.equals(this.supportTwoFactorHostNum, that.supportTwoFactorHostNum)
            && Objects.equals(this.appProcessHostNum, that.appProcessHostNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vaultHostNum,
            raspHostNum,
            wtpHostNum,
            twoFactorHostNum,
            isolatedFileNum,
            supportTwoFactorHostNum,
            appProcessHostNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStatisticsResponse {\n");
        sb.append("    vaultHostNum: ").append(toIndentedString(vaultHostNum)).append("\n");
        sb.append("    raspHostNum: ").append(toIndentedString(raspHostNum)).append("\n");
        sb.append("    wtpHostNum: ").append(toIndentedString(wtpHostNum)).append("\n");
        sb.append("    twoFactorHostNum: ").append(toIndentedString(twoFactorHostNum)).append("\n");
        sb.append("    isolatedFileNum: ").append(toIndentedString(isolatedFileNum)).append("\n");
        sb.append("    supportTwoFactorHostNum: ").append(toIndentedString(supportTwoFactorHostNum)).append("\n");
        sb.append("    appProcessHostNum: ").append(toIndentedString(appProcessHostNum)).append("\n");
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
