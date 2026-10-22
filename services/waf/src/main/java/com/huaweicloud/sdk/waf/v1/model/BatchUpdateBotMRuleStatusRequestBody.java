package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量更新规则启用状态的请求体
 */
public class BatchUpdateBotMRuleStatusRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_ids")

    private List<Integer> ruleIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    public BatchUpdateBotMRuleStatusRequestBody withRuleIds(List<Integer> ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }

    public BatchUpdateBotMRuleStatusRequestBody addRuleIdsItem(Integer ruleIdsItem) {
        if (this.ruleIds == null) {
            this.ruleIds = new ArrayList<>();
        }
        this.ruleIds.add(ruleIdsItem);
        return this;
    }

    public BatchUpdateBotMRuleStatusRequestBody withRuleIds(Consumer<List<Integer>> ruleIdsSetter) {
        if (this.ruleIds == null) {
            this.ruleIds = new ArrayList<>();
        }
        ruleIdsSetter.accept(this.ruleIds);
        return this;
    }

    /**
     * 批量更新的规则ID
     * @return ruleIds
     */
    public List<Integer> getRuleIds() {
        return ruleIds;
    }

    public void setRuleIds(List<Integer> ruleIds) {
        this.ruleIds = ruleIds;
    }

    public BatchUpdateBotMRuleStatusRequestBody withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 批量更新的启用状态
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateBotMRuleStatusRequestBody that = (BatchUpdateBotMRuleStatusRequestBody) obj;
        return Objects.equals(this.ruleIds, that.ruleIds) && Objects.equals(this.enable, that.enable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleIds, enable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateBotMRuleStatusRequestBody {\n");
        sb.append("    ruleIds: ").append(toIndentedString(ruleIds)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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
