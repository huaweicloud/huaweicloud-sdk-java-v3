package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListCustomRuleConfigResponse
 */
public class ListCustomRuleConfigResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_num")

    private Integer hostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_status")

    private Integer ruleStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_type")

    private String ruleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_block")

    private Integer autoBlock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hash_type")

    private String hashType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_all_host")

    private Boolean isAllHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    public ListCustomRuleConfigResponse withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * **参数解释**： 规则ID **取值范围**： 字符长度1-36位 
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public ListCustomRuleConfigResponse withHostNum(Integer hostNum) {
        this.hostNum = hostNum;
        return this;
    }

    /**
     * **参数解释**: 防护主机数量。 **取值范围**: 最小值1，最大值2000000 
     * minimum: 0
     * maximum: 2000000
     * @return hostNum
     */
    public Integer getHostNum() {
        return hostNum;
    }

    public void setHostNum(Integer hostNum) {
        this.hostNum = hostNum;
    }

    public ListCustomRuleConfigResponse withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * **参数解释**： 规则名称 **取值范围**： 字符长度1-64位 
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public ListCustomRuleConfigResponse withRuleStatus(Integer ruleStatus) {
        this.ruleStatus = ruleStatus;
        return this;
    }

    /**
     * **参数解释**： 规则状态 **取值范围**: - 0：停用 - 1：启用 
     * @return ruleStatus
     */
    public Integer getRuleStatus() {
        return ruleStatus;
    }

    public void setRuleStatus(Integer ruleStatus) {
        this.ruleStatus = ruleStatus;
    }

    public ListCustomRuleConfigResponse withRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * **参数解释**： 规则类型 **取值范围**： - black_hash：黑hash 
     * @return ruleType
     */
    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public ListCustomRuleConfigResponse withAutoBlock(Integer autoBlock) {
        this.autoBlock = autoBlock;
        return this;
    }

    /**
     * **参数解释**： 是否自动阻断告警 **取值范围**： - 0：不自动阻断告警 - 1：自动阻断告警 
     * @return autoBlock
     */
    public Integer getAutoBlock() {
        return autoBlock;
    }

    public void setAutoBlock(Integer autoBlock) {
        this.autoBlock = autoBlock;
    }

    public ListCustomRuleConfigResponse withHashType(String hashType) {
        this.hashType = hashType;
        return this;
    }

    /**
     * **参数解释**： hash类型 **取值范围**： - SHA-256：sha256sum - MD5：md5sum - SHA-1：sha1sum 
     * @return hashType
     */
    public String getHashType() {
        return hashType;
    }

    public void setHashType(String hashType) {
        this.hashType = hashType;
    }

    public ListCustomRuleConfigResponse withIsAllHost(Boolean isAllHost) {
        this.isAllHost = isAllHost;
        return this;
    }

    /**
     * **参数解释**: 是否选择所有主机 **取值范围**: - true：是 - false：否 
     * @return isAllHost
     */
    public Boolean getIsAllHost() {
        return isAllHost;
    }

    public void setIsAllHost(Boolean isAllHost) {
        this.isAllHost = isAllHost;
    }

    public ListCustomRuleConfigResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**： 创建时间 **取值范围**： 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ListCustomRuleConfigResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**： 创建时间 **取值范围**： 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCustomRuleConfigResponse that = (ListCustomRuleConfigResponse) obj;
        return Objects.equals(this.ruleId, that.ruleId) && Objects.equals(this.hostNum, that.hostNum)
            && Objects.equals(this.ruleName, that.ruleName) && Objects.equals(this.ruleStatus, that.ruleStatus)
            && Objects.equals(this.ruleType, that.ruleType) && Objects.equals(this.autoBlock, that.autoBlock)
            && Objects.equals(this.hashType, that.hashType) && Objects.equals(this.isAllHost, that.isAllHost)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleId,
            hostNum,
            ruleName,
            ruleStatus,
            ruleType,
            autoBlock,
            hashType,
            isAllHost,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomRuleConfigResponse {\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    ruleStatus: ").append(toIndentedString(ruleStatus)).append("\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
        sb.append("    autoBlock: ").append(toIndentedString(autoBlock)).append("\n");
        sb.append("    hashType: ").append(toIndentedString(hashType)).append("\n");
        sb.append("    isAllHost: ").append(toIndentedString(isAllHost)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
