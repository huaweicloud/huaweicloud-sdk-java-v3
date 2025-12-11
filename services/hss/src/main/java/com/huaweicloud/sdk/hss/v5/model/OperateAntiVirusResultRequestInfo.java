package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 处置病毒扫描结果
 */
public class OperateAntiVirusResultRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_type")

    private String operateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memo")

    private String memo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_results")

    private List<OperateResultRequestInfo> operateResults = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_white_rules")

    private List<AntiVirusEventWhiteRuleListRequestInfo> eventWhiteRules = null;

    public OperateAntiVirusResultRequestInfo withOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * 处理方式，包含如下:   - mark_as_handled：手动处理   - ignore：忽略   - add_to_alarm_whitelist：加入告警白名单   - manual_isolate_and_kill：隔离文件   - unhandle：取消手动处理   - do_not_ignore：取消忽略   - remove_from_alarm_whitelist：删除告警白名单   - do_not_isolate_or_kill：取消隔离文件
     * @return operateType
     */
    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public OperateAntiVirusResultRequestInfo withMemo(String memo) {
        this.memo = memo;
        return this;
    }

    /**
     * **参数解释** 备注信息 **取值范围** 字符长度0-512位 
     * @return memo
     */
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public OperateAntiVirusResultRequestInfo withOperateResults(List<OperateResultRequestInfo> operateResults) {
        this.operateResults = operateResults;
        return this;
    }

    public OperateAntiVirusResultRequestInfo addOperateResultsItem(OperateResultRequestInfo operateResultsItem) {
        if (this.operateResults == null) {
            this.operateResults = new ArrayList<>();
        }
        this.operateResults.add(operateResultsItem);
        return this;
    }

    public OperateAntiVirusResultRequestInfo withOperateResults(
        Consumer<List<OperateResultRequestInfo>> operateResultsSetter) {
        if (this.operateResults == null) {
            this.operateResults = new ArrayList<>();
        }
        operateResultsSetter.accept(this.operateResults);
        return this;
    }

    /**
     * 处置的结果列表
     * @return operateResults
     */
    public List<OperateResultRequestInfo> getOperateResults() {
        return operateResults;
    }

    public void setOperateResults(List<OperateResultRequestInfo> operateResults) {
        this.operateResults = operateResults;
    }

    public OperateAntiVirusResultRequestInfo withEventWhiteRules(
        List<AntiVirusEventWhiteRuleListRequestInfo> eventWhiteRules) {
        this.eventWhiteRules = eventWhiteRules;
        return this;
    }

    public OperateAntiVirusResultRequestInfo addEventWhiteRulesItem(
        AntiVirusEventWhiteRuleListRequestInfo eventWhiteRulesItem) {
        if (this.eventWhiteRules == null) {
            this.eventWhiteRules = new ArrayList<>();
        }
        this.eventWhiteRules.add(eventWhiteRulesItem);
        return this;
    }

    public OperateAntiVirusResultRequestInfo withEventWhiteRules(
        Consumer<List<AntiVirusEventWhiteRuleListRequestInfo>> eventWhiteRulesSetter) {
        if (this.eventWhiteRules == null) {
            this.eventWhiteRules = new ArrayList<>();
        }
        eventWhiteRulesSetter.accept(this.eventWhiteRules);
        return this;
    }

    /**
     * 新增告警白名单规则列表
     * @return eventWhiteRules
     */
    public List<AntiVirusEventWhiteRuleListRequestInfo> getEventWhiteRules() {
        return eventWhiteRules;
    }

    public void setEventWhiteRules(List<AntiVirusEventWhiteRuleListRequestInfo> eventWhiteRules) {
        this.eventWhiteRules = eventWhiteRules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OperateAntiVirusResultRequestInfo that = (OperateAntiVirusResultRequestInfo) obj;
        return Objects.equals(this.operateType, that.operateType) && Objects.equals(this.memo, that.memo)
            && Objects.equals(this.operateResults, that.operateResults)
            && Objects.equals(this.eventWhiteRules, that.eventWhiteRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operateType, memo, operateResults, eventWhiteRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperateAntiVirusResultRequestInfo {\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
        sb.append("    operateResults: ").append(toIndentedString(operateResults)).append("\n");
        sb.append("    eventWhiteRules: ").append(toIndentedString(eventWhiteRules)).append("\n");
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
