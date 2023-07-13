package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * absolute数据结构说明
 */
public class Absolute {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxTotalInstances")

    private Integer maxTotalInstances;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxTotalCores")

    private Integer maxTotalCores;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxTotalRAMSize")

    private Integer maxTotalRAMSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxTotalKeypairs")

    private Integer maxTotalKeypairs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxServerMeta")

    private Integer maxServerMeta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxPersonality")

    private Integer maxPersonality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxPersonalitySize")

    private Integer maxPersonalitySize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxServerGroups")

    private Integer maxServerGroups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxServerGroupMembers")

    private Integer maxServerGroupMembers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalServerGroupsUsed")

    private Integer totalServerGroupsUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxSecurityGroups")

    private Integer maxSecurityGroups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxSecurityGroupRules")

    private Integer maxSecurityGroupRules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxTotalFloatingIps")

    private Integer maxTotalFloatingIps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxImageMeta")

    private Integer maxImageMeta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalInstancesUsed")

    private Integer totalInstancesUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalCoresUsed")

    private Integer totalCoresUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalRAMUsed")

    private Integer totalRAMUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalSecurityGroupsUsed")

    private Integer totalSecurityGroupsUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalFloatingIpsUsed")

    private Integer totalFloatingIpsUsed;

    public Absolute withMaxTotalInstances(Integer maxTotalInstances) {
        this.maxTotalInstances = maxTotalInstances;
        return this;
    }

    /**
     * 裸金属服务器最大申请数量
     * @return maxTotalInstances
     */
    public Integer getMaxTotalInstances() {
        return maxTotalInstances;
    }

    public void setMaxTotalInstances(Integer maxTotalInstances) {
        this.maxTotalInstances = maxTotalInstances;
    }

    public Absolute withMaxTotalCores(Integer maxTotalCores) {
        this.maxTotalCores = maxTotalCores;
        return this;
    }

    /**
     * CPU核数最大申请数量
     * @return maxTotalCores
     */
    public Integer getMaxTotalCores() {
        return maxTotalCores;
    }

    public void setMaxTotalCores(Integer maxTotalCores) {
        this.maxTotalCores = maxTotalCores;
    }

    public Absolute withMaxTotalRAMSize(Integer maxTotalRAMSize) {
        this.maxTotalRAMSize = maxTotalRAMSize;
        return this;
    }

    /**
     * 内存最大申请容量（单位：MB）
     * @return maxTotalRAMSize
     */
    public Integer getMaxTotalRAMSize() {
        return maxTotalRAMSize;
    }

    public void setMaxTotalRAMSize(Integer maxTotalRAMSize) {
        this.maxTotalRAMSize = maxTotalRAMSize;
    }

    public Absolute withMaxTotalKeypairs(Integer maxTotalKeypairs) {
        this.maxTotalKeypairs = maxTotalKeypairs;
        return this;
    }

    /**
     * 可以申请的SSH密钥对最大数量
     * @return maxTotalKeypairs
     */
    public Integer getMaxTotalKeypairs() {
        return maxTotalKeypairs;
    }

    public void setMaxTotalKeypairs(Integer maxTotalKeypairs) {
        this.maxTotalKeypairs = maxTotalKeypairs;
    }

    public Absolute withMaxServerMeta(Integer maxServerMeta) {
        this.maxServerMeta = maxServerMeta;
        return this;
    }

    /**
     * 可输入元数据的最大长度
     * @return maxServerMeta
     */
    public Integer getMaxServerMeta() {
        return maxServerMeta;
    }

    public void setMaxServerMeta(Integer maxServerMeta) {
        this.maxServerMeta = maxServerMeta;
    }

    public Absolute withMaxPersonality(Integer maxPersonality) {
        this.maxPersonality = maxPersonality;
        return this;
    }

    /**
     * 可注入文件的最大个数
     * @return maxPersonality
     */
    public Integer getMaxPersonality() {
        return maxPersonality;
    }

    public void setMaxPersonality(Integer maxPersonality) {
        this.maxPersonality = maxPersonality;
    }

    public Absolute withMaxPersonalitySize(Integer maxPersonalitySize) {
        this.maxPersonalitySize = maxPersonalitySize;
        return this;
    }

    /**
     * 注入文件内容的最大长度（单位：Byte）
     * @return maxPersonalitySize
     */
    public Integer getMaxPersonalitySize() {
        return maxPersonalitySize;
    }

    public void setMaxPersonalitySize(Integer maxPersonalitySize) {
        this.maxPersonalitySize = maxPersonalitySize;
    }

    public Absolute withMaxServerGroups(Integer maxServerGroups) {
        this.maxServerGroups = maxServerGroups;
        return this;
    }

    /**
     * 服务器组的最大个数
     * @return maxServerGroups
     */
    public Integer getMaxServerGroups() {
        return maxServerGroups;
    }

    public void setMaxServerGroups(Integer maxServerGroups) {
        this.maxServerGroups = maxServerGroups;
    }

    public Absolute withMaxServerGroupMembers(Integer maxServerGroupMembers) {
        this.maxServerGroupMembers = maxServerGroupMembers;
        return this;
    }

    /**
     * 服务器组中的最大裸金属服务器数。
     * @return maxServerGroupMembers
     */
    public Integer getMaxServerGroupMembers() {
        return maxServerGroupMembers;
    }

    public void setMaxServerGroupMembers(Integer maxServerGroupMembers) {
        this.maxServerGroupMembers = maxServerGroupMembers;
    }

    public Absolute withTotalServerGroupsUsed(Integer totalServerGroupsUsed) {
        this.totalServerGroupsUsed = totalServerGroupsUsed;
        return this;
    }

    /**
     * 已使用的服务器组个数
     * @return totalServerGroupsUsed
     */
    public Integer getTotalServerGroupsUsed() {
        return totalServerGroupsUsed;
    }

    public void setTotalServerGroupsUsed(Integer totalServerGroupsUsed) {
        this.totalServerGroupsUsed = totalServerGroupsUsed;
    }

    public Absolute withMaxSecurityGroups(Integer maxSecurityGroups) {
        this.maxSecurityGroups = maxSecurityGroups;
        return this;
    }

    /**
     * 安全组最大使用个数。 说明：具体配额限制请以VPC配额限制为准。
     * @return maxSecurityGroups
     */
    public Integer getMaxSecurityGroups() {
        return maxSecurityGroups;
    }

    public void setMaxSecurityGroups(Integer maxSecurityGroups) {
        this.maxSecurityGroups = maxSecurityGroups;
    }

    public Absolute withMaxSecurityGroupRules(Integer maxSecurityGroupRules) {
        this.maxSecurityGroupRules = maxSecurityGroupRules;
        return this;
    }

    /**
     * 安全组中安全组规则最大的配置个数。 说明：具体配额限制请以VPC配额限制为准。
     * @return maxSecurityGroupRules
     */
    public Integer getMaxSecurityGroupRules() {
        return maxSecurityGroupRules;
    }

    public void setMaxSecurityGroupRules(Integer maxSecurityGroupRules) {
        this.maxSecurityGroupRules = maxSecurityGroupRules;
    }

    public Absolute withMaxTotalFloatingIps(Integer maxTotalFloatingIps) {
        this.maxTotalFloatingIps = maxTotalFloatingIps;
        return this;
    }

    /**
     * 最大的浮动IP使用个数
     * @return maxTotalFloatingIps
     */
    public Integer getMaxTotalFloatingIps() {
        return maxTotalFloatingIps;
    }

    public void setMaxTotalFloatingIps(Integer maxTotalFloatingIps) {
        this.maxTotalFloatingIps = maxTotalFloatingIps;
    }

    public Absolute withMaxImageMeta(Integer maxImageMeta) {
        this.maxImageMeta = maxImageMeta;
        return this;
    }

    /**
     * 镜像元数据最大的长度
     * @return maxImageMeta
     */
    public Integer getMaxImageMeta() {
        return maxImageMeta;
    }

    public void setMaxImageMeta(Integer maxImageMeta) {
        this.maxImageMeta = maxImageMeta;
    }

    public Absolute withTotalInstancesUsed(Integer totalInstancesUsed) {
        this.totalInstancesUsed = totalInstancesUsed;
        return this;
    }

    /**
     * 当前裸金属服务器使用个数
     * @return totalInstancesUsed
     */
    public Integer getTotalInstancesUsed() {
        return totalInstancesUsed;
    }

    public void setTotalInstancesUsed(Integer totalInstancesUsed) {
        this.totalInstancesUsed = totalInstancesUsed;
    }

    public Absolute withTotalCoresUsed(Integer totalCoresUsed) {
        this.totalCoresUsed = totalCoresUsed;
        return this;
    }

    /**
     * 当前已使用CPU核数
     * @return totalCoresUsed
     */
    public Integer getTotalCoresUsed() {
        return totalCoresUsed;
    }

    public void setTotalCoresUsed(Integer totalCoresUsed) {
        this.totalCoresUsed = totalCoresUsed;
    }

    public Absolute withTotalRAMUsed(Integer totalRAMUsed) {
        this.totalRAMUsed = totalRAMUsed;
        return this;
    }

    /**
     * 当前内存使用容量（单位：MB）
     * @return totalRAMUsed
     */
    public Integer getTotalRAMUsed() {
        return totalRAMUsed;
    }

    public void setTotalRAMUsed(Integer totalRAMUsed) {
        this.totalRAMUsed = totalRAMUsed;
    }

    public Absolute withTotalSecurityGroupsUsed(Integer totalSecurityGroupsUsed) {
        this.totalSecurityGroupsUsed = totalSecurityGroupsUsed;
        return this;
    }

    /**
     * 当前安全组使用个数
     * @return totalSecurityGroupsUsed
     */
    public Integer getTotalSecurityGroupsUsed() {
        return totalSecurityGroupsUsed;
    }

    public void setTotalSecurityGroupsUsed(Integer totalSecurityGroupsUsed) {
        this.totalSecurityGroupsUsed = totalSecurityGroupsUsed;
    }

    public Absolute withTotalFloatingIpsUsed(Integer totalFloatingIpsUsed) {
        this.totalFloatingIpsUsed = totalFloatingIpsUsed;
        return this;
    }

    /**
     * 当前浮动IP使用个数
     * @return totalFloatingIpsUsed
     */
    public Integer getTotalFloatingIpsUsed() {
        return totalFloatingIpsUsed;
    }

    public void setTotalFloatingIpsUsed(Integer totalFloatingIpsUsed) {
        this.totalFloatingIpsUsed = totalFloatingIpsUsed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Absolute that = (Absolute) obj;
        return Objects.equals(this.maxTotalInstances, that.maxTotalInstances)
            && Objects.equals(this.maxTotalCores, that.maxTotalCores)
            && Objects.equals(this.maxTotalRAMSize, that.maxTotalRAMSize)
            && Objects.equals(this.maxTotalKeypairs, that.maxTotalKeypairs)
            && Objects.equals(this.maxServerMeta, that.maxServerMeta)
            && Objects.equals(this.maxPersonality, that.maxPersonality)
            && Objects.equals(this.maxPersonalitySize, that.maxPersonalitySize)
            && Objects.equals(this.maxServerGroups, that.maxServerGroups)
            && Objects.equals(this.maxServerGroupMembers, that.maxServerGroupMembers)
            && Objects.equals(this.totalServerGroupsUsed, that.totalServerGroupsUsed)
            && Objects.equals(this.maxSecurityGroups, that.maxSecurityGroups)
            && Objects.equals(this.maxSecurityGroupRules, that.maxSecurityGroupRules)
            && Objects.equals(this.maxTotalFloatingIps, that.maxTotalFloatingIps)
            && Objects.equals(this.maxImageMeta, that.maxImageMeta)
            && Objects.equals(this.totalInstancesUsed, that.totalInstancesUsed)
            && Objects.equals(this.totalCoresUsed, that.totalCoresUsed)
            && Objects.equals(this.totalRAMUsed, that.totalRAMUsed)
            && Objects.equals(this.totalSecurityGroupsUsed, that.totalSecurityGroupsUsed)
            && Objects.equals(this.totalFloatingIpsUsed, that.totalFloatingIpsUsed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxTotalInstances,
            maxTotalCores,
            maxTotalRAMSize,
            maxTotalKeypairs,
            maxServerMeta,
            maxPersonality,
            maxPersonalitySize,
            maxServerGroups,
            maxServerGroupMembers,
            totalServerGroupsUsed,
            maxSecurityGroups,
            maxSecurityGroupRules,
            maxTotalFloatingIps,
            maxImageMeta,
            totalInstancesUsed,
            totalCoresUsed,
            totalRAMUsed,
            totalSecurityGroupsUsed,
            totalFloatingIpsUsed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Absolute {\n");
        sb.append("    maxTotalInstances: ").append(toIndentedString(maxTotalInstances)).append("\n");
        sb.append("    maxTotalCores: ").append(toIndentedString(maxTotalCores)).append("\n");
        sb.append("    maxTotalRAMSize: ").append(toIndentedString(maxTotalRAMSize)).append("\n");
        sb.append("    maxTotalKeypairs: ").append(toIndentedString(maxTotalKeypairs)).append("\n");
        sb.append("    maxServerMeta: ").append(toIndentedString(maxServerMeta)).append("\n");
        sb.append("    maxPersonality: ").append(toIndentedString(maxPersonality)).append("\n");
        sb.append("    maxPersonalitySize: ").append(toIndentedString(maxPersonalitySize)).append("\n");
        sb.append("    maxServerGroups: ").append(toIndentedString(maxServerGroups)).append("\n");
        sb.append("    maxServerGroupMembers: ").append(toIndentedString(maxServerGroupMembers)).append("\n");
        sb.append("    totalServerGroupsUsed: ").append(toIndentedString(totalServerGroupsUsed)).append("\n");
        sb.append("    maxSecurityGroups: ").append(toIndentedString(maxSecurityGroups)).append("\n");
        sb.append("    maxSecurityGroupRules: ").append(toIndentedString(maxSecurityGroupRules)).append("\n");
        sb.append("    maxTotalFloatingIps: ").append(toIndentedString(maxTotalFloatingIps)).append("\n");
        sb.append("    maxImageMeta: ").append(toIndentedString(maxImageMeta)).append("\n");
        sb.append("    totalInstancesUsed: ").append(toIndentedString(totalInstancesUsed)).append("\n");
        sb.append("    totalCoresUsed: ").append(toIndentedString(totalCoresUsed)).append("\n");
        sb.append("    totalRAMUsed: ").append(toIndentedString(totalRAMUsed)).append("\n");
        sb.append("    totalSecurityGroupsUsed: ").append(toIndentedString(totalSecurityGroupsUsed)).append("\n");
        sb.append("    totalFloatingIpsUsed: ").append(toIndentedString(totalFloatingIpsUsed)).append("\n");
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
