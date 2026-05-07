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
public class ListCustomRuleConfigDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hash_type")

    private String hashType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_block")

    private Integer autoBlock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_all_host")

    private Boolean isAllHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_type")

    private String ruleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_values")

    private List<String> ruleValues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_ids")

    private List<String> agentIds = null;

    public ListCustomRuleConfigDetailResponse withRuleId(String ruleId) {
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

    public ListCustomRuleConfigDetailResponse withHashType(String hashType) {
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

    public ListCustomRuleConfigDetailResponse withAutoBlock(Integer autoBlock) {
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

    public ListCustomRuleConfigDetailResponse withIsAllHost(Boolean isAllHost) {
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

    public ListCustomRuleConfigDetailResponse withRuleType(String ruleType) {
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

    public ListCustomRuleConfigDetailResponse withRuleValues(List<String> ruleValues) {
        this.ruleValues = ruleValues;
        return this;
    }

    public ListCustomRuleConfigDetailResponse addRuleValuesItem(String ruleValuesItem) {
        if (this.ruleValues == null) {
            this.ruleValues = new ArrayList<>();
        }
        this.ruleValues.add(ruleValuesItem);
        return this;
    }

    public ListCustomRuleConfigDetailResponse withRuleValues(Consumer<List<String>> ruleValuesSetter) {
        if (this.ruleValues == null) {
            this.ruleValues = new ArrayList<>();
        }
        ruleValuesSetter.accept(this.ruleValues);
        return this;
    }

    /**
     * **参数解释**： 规则集列表 **取值范围**: 1-1000个规则值 
     * @return ruleValues
     */
    public List<String> getRuleValues() {
        return ruleValues;
    }

    public void setRuleValues(List<String> ruleValues) {
        this.ruleValues = ruleValues;
    }

    public ListCustomRuleConfigDetailResponse withAgentIds(List<String> agentIds) {
        this.agentIds = agentIds;
        return this;
    }

    public ListCustomRuleConfigDetailResponse addAgentIdsItem(String agentIdsItem) {
        if (this.agentIds == null) {
            this.agentIds = new ArrayList<>();
        }
        this.agentIds.add(agentIdsItem);
        return this;
    }

    public ListCustomRuleConfigDetailResponse withAgentIds(Consumer<List<String>> agentIdsSetter) {
        if (this.agentIds == null) {
            this.agentIds = new ArrayList<>();
        }
        agentIdsSetter.accept(this.agentIds);
        return this;
    }

    /**
     * **参数解释**: agent列表 **取值范围**: 字符长度1-64位 
     * @return agentIds
     */
    public List<String> getAgentIds() {
        return agentIds;
    }

    public void setAgentIds(List<String> agentIds) {
        this.agentIds = agentIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCustomRuleConfigDetailResponse that = (ListCustomRuleConfigDetailResponse) obj;
        return Objects.equals(this.ruleId, that.ruleId) && Objects.equals(this.hashType, that.hashType)
            && Objects.equals(this.autoBlock, that.autoBlock) && Objects.equals(this.isAllHost, that.isAllHost)
            && Objects.equals(this.ruleType, that.ruleType) && Objects.equals(this.ruleValues, that.ruleValues)
            && Objects.equals(this.agentIds, that.agentIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleId, hashType, autoBlock, isAllHost, ruleType, ruleValues, agentIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomRuleConfigDetailResponse {\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    hashType: ").append(toIndentedString(hashType)).append("\n");
        sb.append("    autoBlock: ").append(toIndentedString(autoBlock)).append("\n");
        sb.append("    isAllHost: ").append(toIndentedString(isAllHost)).append("\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
        sb.append("    ruleValues: ").append(toIndentedString(ruleValues)).append("\n");
        sb.append("    agentIds: ").append(toIndentedString(agentIds)).append("\n");
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
