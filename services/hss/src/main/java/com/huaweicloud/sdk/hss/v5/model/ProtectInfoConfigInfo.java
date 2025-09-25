package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 防护配置信息
 */
public class ProtectInfoConfigInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "un_upgrade_agent_host_num")

    private Integer unUpgradeAgentHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_upgrade_agent_enable")

    private Boolean autoUpgradeAgentEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_open_auto_upgrade_agent_rate")

    private Float userOpenAutoUpgradeAgentRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "un_open_ransomware_policy_host_num")

    private Integer unOpenRansomwarePolicyHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_be_optimized_ransomware_policy_host_num")

    private Integer toBeOptimizedRansomwarePolicyHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_open_ransomware_backup_rate")

    private Float userOpenRansomwareBackupRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "un_open_two_factor_login_host_num")

    private Integer unOpenTwoFactorLoginHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_open_two_factor_login_rate")

    private Float userOpenTwoFactorLoginRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "un_virus_kill_host_num")

    private Integer unVirusKillHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virus_kill_host_num")

    private Integer virusKillHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "malware_collect_enable")

    private Boolean malwareCollectEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_open_malware_collect_rate")

    private Float userOpenMalwareCollectRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_image_scan_freq")

    private Float containerImageScanFreq;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_image_scan_freq_beat_rate")

    private Float containerImageScanFreqBeatRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_open_config_num")

    private Integer needOpenConfigNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_image_scan_total_num")

    private Long containerImageScanTotalNum;

    public ProtectInfoConfigInfo withUnUpgradeAgentHostNum(Integer unUpgradeAgentHostNum) {
        this.unUpgradeAgentHostNum = unUpgradeAgentHostNum;
        return this;
    }

    /**
     * **参数解释**: 未升级agent的主机数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return unUpgradeAgentHostNum
     */
    public Integer getUnUpgradeAgentHostNum() {
        return unUpgradeAgentHostNum;
    }

    public void setUnUpgradeAgentHostNum(Integer unUpgradeAgentHostNum) {
        this.unUpgradeAgentHostNum = unUpgradeAgentHostNum;
    }

    public ProtectInfoConfigInfo withAutoUpgradeAgentEnable(Boolean autoUpgradeAgentEnable) {
        this.autoUpgradeAgentEnable = autoUpgradeAgentEnable;
        return this;
    }

    /**
     * **参数解释**: 是否开启自动升级 **取值范围**:   - true：是。   - false：否。 
     * @return autoUpgradeAgentEnable
     */
    public Boolean getAutoUpgradeAgentEnable() {
        return autoUpgradeAgentEnable;
    }

    public void setAutoUpgradeAgentEnable(Boolean autoUpgradeAgentEnable) {
        this.autoUpgradeAgentEnable = autoUpgradeAgentEnable;
    }

    public ProtectInfoConfigInfo withUserOpenAutoUpgradeAgentRate(Float userOpenAutoUpgradeAgentRate) {
        this.userOpenAutoUpgradeAgentRate = userOpenAutoUpgradeAgentRate;
        return this;
    }

    /**
     * **参数解释**: 开启自动升级的用户率 **取值范围**: 最小值0，最大值1 
     * minimum: 0
     * maximum: 1
     * @return userOpenAutoUpgradeAgentRate
     */
    public Float getUserOpenAutoUpgradeAgentRate() {
        return userOpenAutoUpgradeAgentRate;
    }

    public void setUserOpenAutoUpgradeAgentRate(Float userOpenAutoUpgradeAgentRate) {
        this.userOpenAutoUpgradeAgentRate = userOpenAutoUpgradeAgentRate;
    }

    public ProtectInfoConfigInfo withUnOpenRansomwarePolicyHostNum(Integer unOpenRansomwarePolicyHostNum) {
        this.unOpenRansomwarePolicyHostNum = unOpenRansomwarePolicyHostNum;
        return this;
    }

    /**
     * **参数解释**: 未开启勒索策略的主机数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return unOpenRansomwarePolicyHostNum
     */
    public Integer getUnOpenRansomwarePolicyHostNum() {
        return unOpenRansomwarePolicyHostNum;
    }

    public void setUnOpenRansomwarePolicyHostNum(Integer unOpenRansomwarePolicyHostNum) {
        this.unOpenRansomwarePolicyHostNum = unOpenRansomwarePolicyHostNum;
    }

    public ProtectInfoConfigInfo withToBeOptimizedRansomwarePolicyHostNum(
        Integer toBeOptimizedRansomwarePolicyHostNum) {
        this.toBeOptimizedRansomwarePolicyHostNum = toBeOptimizedRansomwarePolicyHostNum;
        return this;
    }

    /**
     * **参数解释**: 未待开启（待优化）勒索病毒防护的主机数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return toBeOptimizedRansomwarePolicyHostNum
     */
    public Integer getToBeOptimizedRansomwarePolicyHostNum() {
        return toBeOptimizedRansomwarePolicyHostNum;
    }

    public void setToBeOptimizedRansomwarePolicyHostNum(Integer toBeOptimizedRansomwarePolicyHostNum) {
        this.toBeOptimizedRansomwarePolicyHostNum = toBeOptimizedRansomwarePolicyHostNum;
    }

    public ProtectInfoConfigInfo withUserOpenRansomwareBackupRate(Float userOpenRansomwareBackupRate) {
        this.userOpenRansomwareBackupRate = userOpenRansomwareBackupRate;
        return this;
    }

    /**
     * **参数解释**: 开启勒索备份的用户率 **取值范围**: 最小值0，最大值1 
     * minimum: 0
     * maximum: 1
     * @return userOpenRansomwareBackupRate
     */
    public Float getUserOpenRansomwareBackupRate() {
        return userOpenRansomwareBackupRate;
    }

    public void setUserOpenRansomwareBackupRate(Float userOpenRansomwareBackupRate) {
        this.userOpenRansomwareBackupRate = userOpenRansomwareBackupRate;
    }

    public ProtectInfoConfigInfo withUnOpenTwoFactorLoginHostNum(Integer unOpenTwoFactorLoginHostNum) {
        this.unOpenTwoFactorLoginHostNum = unOpenTwoFactorLoginHostNum;
        return this;
    }

    /**
     * **参数解释**: 未开启双因子的主机数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return unOpenTwoFactorLoginHostNum
     */
    public Integer getUnOpenTwoFactorLoginHostNum() {
        return unOpenTwoFactorLoginHostNum;
    }

    public void setUnOpenTwoFactorLoginHostNum(Integer unOpenTwoFactorLoginHostNum) {
        this.unOpenTwoFactorLoginHostNum = unOpenTwoFactorLoginHostNum;
    }

    public ProtectInfoConfigInfo withUserOpenTwoFactorLoginRate(Float userOpenTwoFactorLoginRate) {
        this.userOpenTwoFactorLoginRate = userOpenTwoFactorLoginRate;
        return this;
    }

    /**
     * **参数解释**: 开启双因子的用户率 **取值范围**: 最小值0，最大值1 
     * minimum: 0
     * maximum: 1
     * @return userOpenTwoFactorLoginRate
     */
    public Float getUserOpenTwoFactorLoginRate() {
        return userOpenTwoFactorLoginRate;
    }

    public void setUserOpenTwoFactorLoginRate(Float userOpenTwoFactorLoginRate) {
        this.userOpenTwoFactorLoginRate = userOpenTwoFactorLoginRate;
    }

    public ProtectInfoConfigInfo withUnVirusKillHostNum(Integer unVirusKillHostNum) {
        this.unVirusKillHostNum = unVirusKillHostNum;
        return this;
    }

    /**
     * **参数解释**: 未执行病毒查杀的主机数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return unVirusKillHostNum
     */
    public Integer getUnVirusKillHostNum() {
        return unVirusKillHostNum;
    }

    public void setUnVirusKillHostNum(Integer unVirusKillHostNum) {
        this.unVirusKillHostNum = unVirusKillHostNum;
    }

    public ProtectInfoConfigInfo withVirusKillHostNum(Integer virusKillHostNum) {
        this.virusKillHostNum = virusKillHostNum;
        return this;
    }

    /**
     * **参数解释**: 执行过病毒查杀的主机数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return virusKillHostNum
     */
    public Integer getVirusKillHostNum() {
        return virusKillHostNum;
    }

    public void setVirusKillHostNum(Integer virusKillHostNum) {
        this.virusKillHostNum = virusKillHostNum;
    }

    public ProtectInfoConfigInfo withMalwareCollectEnable(Boolean malwareCollectEnable) {
        this.malwareCollectEnable = malwareCollectEnable;
        return this;
    }

    /**
     * **参数解释**: 是否开启云查 **取值范围**:   - true：是。   - false：否。 
     * @return malwareCollectEnable
     */
    public Boolean getMalwareCollectEnable() {
        return malwareCollectEnable;
    }

    public void setMalwareCollectEnable(Boolean malwareCollectEnable) {
        this.malwareCollectEnable = malwareCollectEnable;
    }

    public ProtectInfoConfigInfo withUserOpenMalwareCollectRate(Float userOpenMalwareCollectRate) {
        this.userOpenMalwareCollectRate = userOpenMalwareCollectRate;
        return this;
    }

    /**
     * **参数解释**: 开启云查的用户率 **取值范围**: 最小值0，最大值1 
     * minimum: 0
     * maximum: 1
     * @return userOpenMalwareCollectRate
     */
    public Float getUserOpenMalwareCollectRate() {
        return userOpenMalwareCollectRate;
    }

    public void setUserOpenMalwareCollectRate(Float userOpenMalwareCollectRate) {
        this.userOpenMalwareCollectRate = userOpenMalwareCollectRate;
    }

    public ProtectInfoConfigInfo withContainerImageScanFreq(Float containerImageScanFreq) {
        this.containerImageScanFreq = containerImageScanFreq;
        return this;
    }

    /**
     * **参数解释**: 容器镜像扫描频率 **取值范围**: 最小值0，最大值128 
     * minimum: 0
     * maximum: 128
     * @return containerImageScanFreq
     */
    public Float getContainerImageScanFreq() {
        return containerImageScanFreq;
    }

    public void setContainerImageScanFreq(Float containerImageScanFreq) {
        this.containerImageScanFreq = containerImageScanFreq;
    }

    public ProtectInfoConfigInfo withContainerImageScanFreqBeatRate(Float containerImageScanFreqBeatRate) {
        this.containerImageScanFreqBeatRate = containerImageScanFreqBeatRate;
        return this;
    }

    /**
     * **参数解释**: 容器镜像扫描频率击败的用户率 **取值范围**: 最小值0，最大值1 
     * minimum: 0
     * maximum: 1
     * @return containerImageScanFreqBeatRate
     */
    public Float getContainerImageScanFreqBeatRate() {
        return containerImageScanFreqBeatRate;
    }

    public void setContainerImageScanFreqBeatRate(Float containerImageScanFreqBeatRate) {
        this.containerImageScanFreqBeatRate = containerImageScanFreqBeatRate;
    }

    public ProtectInfoConfigInfo withNeedOpenConfigNum(Integer needOpenConfigNum) {
        this.needOpenConfigNum = needOpenConfigNum;
        return this;
    }

    /**
     * **参数解释**: 用户开启的配置数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return needOpenConfigNum
     */
    public Integer getNeedOpenConfigNum() {
        return needOpenConfigNum;
    }

    public void setNeedOpenConfigNum(Integer needOpenConfigNum) {
        this.needOpenConfigNum = needOpenConfigNum;
    }

    public ProtectInfoConfigInfo withContainerImageScanTotalNum(Long containerImageScanTotalNum) {
        this.containerImageScanTotalNum = containerImageScanTotalNum;
        return this;
    }

    /**
     * **参数解释**: 扫描的镜像数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return containerImageScanTotalNum
     */
    public Long getContainerImageScanTotalNum() {
        return containerImageScanTotalNum;
    }

    public void setContainerImageScanTotalNum(Long containerImageScanTotalNum) {
        this.containerImageScanTotalNum = containerImageScanTotalNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProtectInfoConfigInfo that = (ProtectInfoConfigInfo) obj;
        return Objects.equals(this.unUpgradeAgentHostNum, that.unUpgradeAgentHostNum)
            && Objects.equals(this.autoUpgradeAgentEnable, that.autoUpgradeAgentEnable)
            && Objects.equals(this.userOpenAutoUpgradeAgentRate, that.userOpenAutoUpgradeAgentRate)
            && Objects.equals(this.unOpenRansomwarePolicyHostNum, that.unOpenRansomwarePolicyHostNum)
            && Objects.equals(this.toBeOptimizedRansomwarePolicyHostNum, that.toBeOptimizedRansomwarePolicyHostNum)
            && Objects.equals(this.userOpenRansomwareBackupRate, that.userOpenRansomwareBackupRate)
            && Objects.equals(this.unOpenTwoFactorLoginHostNum, that.unOpenTwoFactorLoginHostNum)
            && Objects.equals(this.userOpenTwoFactorLoginRate, that.userOpenTwoFactorLoginRate)
            && Objects.equals(this.unVirusKillHostNum, that.unVirusKillHostNum)
            && Objects.equals(this.virusKillHostNum, that.virusKillHostNum)
            && Objects.equals(this.malwareCollectEnable, that.malwareCollectEnable)
            && Objects.equals(this.userOpenMalwareCollectRate, that.userOpenMalwareCollectRate)
            && Objects.equals(this.containerImageScanFreq, that.containerImageScanFreq)
            && Objects.equals(this.containerImageScanFreqBeatRate, that.containerImageScanFreqBeatRate)
            && Objects.equals(this.needOpenConfigNum, that.needOpenConfigNum)
            && Objects.equals(this.containerImageScanTotalNum, that.containerImageScanTotalNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unUpgradeAgentHostNum,
            autoUpgradeAgentEnable,
            userOpenAutoUpgradeAgentRate,
            unOpenRansomwarePolicyHostNum,
            toBeOptimizedRansomwarePolicyHostNum,
            userOpenRansomwareBackupRate,
            unOpenTwoFactorLoginHostNum,
            userOpenTwoFactorLoginRate,
            unVirusKillHostNum,
            virusKillHostNum,
            malwareCollectEnable,
            userOpenMalwareCollectRate,
            containerImageScanFreq,
            containerImageScanFreqBeatRate,
            needOpenConfigNum,
            containerImageScanTotalNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectInfoConfigInfo {\n");
        sb.append("    unUpgradeAgentHostNum: ").append(toIndentedString(unUpgradeAgentHostNum)).append("\n");
        sb.append("    autoUpgradeAgentEnable: ").append(toIndentedString(autoUpgradeAgentEnable)).append("\n");
        sb.append("    userOpenAutoUpgradeAgentRate: ")
            .append(toIndentedString(userOpenAutoUpgradeAgentRate))
            .append("\n");
        sb.append("    unOpenRansomwarePolicyHostNum: ")
            .append(toIndentedString(unOpenRansomwarePolicyHostNum))
            .append("\n");
        sb.append("    toBeOptimizedRansomwarePolicyHostNum: ")
            .append(toIndentedString(toBeOptimizedRansomwarePolicyHostNum))
            .append("\n");
        sb.append("    userOpenRansomwareBackupRate: ")
            .append(toIndentedString(userOpenRansomwareBackupRate))
            .append("\n");
        sb.append("    unOpenTwoFactorLoginHostNum: ")
            .append(toIndentedString(unOpenTwoFactorLoginHostNum))
            .append("\n");
        sb.append("    userOpenTwoFactorLoginRate: ").append(toIndentedString(userOpenTwoFactorLoginRate)).append("\n");
        sb.append("    unVirusKillHostNum: ").append(toIndentedString(unVirusKillHostNum)).append("\n");
        sb.append("    virusKillHostNum: ").append(toIndentedString(virusKillHostNum)).append("\n");
        sb.append("    malwareCollectEnable: ").append(toIndentedString(malwareCollectEnable)).append("\n");
        sb.append("    userOpenMalwareCollectRate: ").append(toIndentedString(userOpenMalwareCollectRate)).append("\n");
        sb.append("    containerImageScanFreq: ").append(toIndentedString(containerImageScanFreq)).append("\n");
        sb.append("    containerImageScanFreqBeatRate: ")
            .append(toIndentedString(containerImageScanFreqBeatRate))
            .append("\n");
        sb.append("    needOpenConfigNum: ").append(toIndentedString(needOpenConfigNum)).append("\n");
        sb.append("    containerImageScanTotalNum: ").append(toIndentedString(containerImageScanTotalNum)).append("\n");
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
