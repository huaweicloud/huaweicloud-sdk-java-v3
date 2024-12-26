package com.huaweicloud.sdk.metastudio.v1.model;

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
public class ListSmartLiveRuleCommandsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_commands")

    private List<RuleCommand> ruleCommands = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListSmartLiveRuleCommandsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 数字人直播任务互动规则未确认命令总数。
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListSmartLiveRuleCommandsResponse withRuleCommands(List<RuleCommand> ruleCommands) {
        this.ruleCommands = ruleCommands;
        return this;
    }

    public ListSmartLiveRuleCommandsResponse addRuleCommandsItem(RuleCommand ruleCommandsItem) {
        if (this.ruleCommands == null) {
            this.ruleCommands = new ArrayList<>();
        }
        this.ruleCommands.add(ruleCommandsItem);
        return this;
    }

    public ListSmartLiveRuleCommandsResponse withRuleCommands(Consumer<List<RuleCommand>> ruleCommandsSetter) {
        if (this.ruleCommands == null) {
            this.ruleCommands = new ArrayList<>();
        }
        ruleCommandsSetter.accept(this.ruleCommands);
        return this;
    }

    /**
     * 数字人互动规则命令列表。
     * @return ruleCommands
     */
    public List<RuleCommand> getRuleCommands() {
        return ruleCommands;
    }

    public void setRuleCommands(List<RuleCommand> ruleCommands) {
        this.ruleCommands = ruleCommands;
    }

    public ListSmartLiveRuleCommandsResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSmartLiveRuleCommandsResponse that = (ListSmartLiveRuleCommandsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.ruleCommands, that.ruleCommands)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, ruleCommands, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSmartLiveRuleCommandsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    ruleCommands: ").append(toIndentedString(ruleCommands)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
