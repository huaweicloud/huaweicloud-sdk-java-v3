package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 缺陷信息
 */
public class DefectInfoV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defect_id")

    private String defectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defect_checker_name")

    private String defectCheckerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defect_status")

    private String defectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_system_tags")

    private String ruleSystemTags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_number")

    private String lineNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defect_content")

    private String defectContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defect_level")

    private String defectLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_key")

    private String issueKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fragment")

    private List<DefectFragmentV2> fragment = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "events")

    private List<DefectEvents> events = null;

    public DefectInfoV2 withDefectId(String defectId) {
        this.defectId = defectId;
        return this;
    }

    /**
     * 缺陷的id
     * @return defectId
     */
    public String getDefectId() {
        return defectId;
    }

    public void setDefectId(String defectId) {
        this.defectId = defectId;
    }

    public DefectInfoV2 withDefectCheckerName(String defectCheckerName) {
        this.defectCheckerName = defectCheckerName;
        return this;
    }

    /**
     * 缺陷对应检查项的名称
     * @return defectCheckerName
     */
    public String getDefectCheckerName() {
        return defectCheckerName;
    }

    public void setDefectCheckerName(String defectCheckerName) {
        this.defectCheckerName = defectCheckerName;
    }

    public DefectInfoV2 withDefectStatus(String defectStatus) {
        this.defectStatus = defectStatus;
        return this;
    }

    /**
     * 缺陷的状态0为解决 1已解决 2已忽略
     * @return defectStatus
     */
    public String getDefectStatus() {
        return defectStatus;
    }

    public void setDefectStatus(String defectStatus) {
        this.defectStatus = defectStatus;
    }

    public DefectInfoV2 withRuleSystemTags(String ruleSystemTags) {
        this.ruleSystemTags = ruleSystemTags;
        return this;
    }

    /**
     * 规则标签,多个标签用逗号隔开
     * @return ruleSystemTags
     */
    public String getRuleSystemTags() {
        return ruleSystemTags;
    }

    public void setRuleSystemTags(String ruleSystemTags) {
        this.ruleSystemTags = ruleSystemTags;
    }

    public DefectInfoV2 withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 规则名
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public DefectInfoV2 withLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
        return this;
    }

    /**
     * 缺陷所在文件行号
     * @return lineNumber
     */
    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public DefectInfoV2 withDefectContent(String defectContent) {
        this.defectContent = defectContent;
        return this;
    }

    /**
     * 缺陷描述
     * @return defectContent
     */
    public String getDefectContent() {
        return defectContent;
    }

    public void setDefectContent(String defectContent) {
        this.defectContent = defectContent;
    }

    public DefectInfoV2 withDefectLevel(String defectLevel) {
        this.defectLevel = defectLevel;
        return this;
    }

    /**
     * 缺陷等级，0致命，1严重，2一般，3提示
     * @return defectLevel
     */
    public String getDefectLevel() {
        return defectLevel;
    }

    public void setDefectLevel(String defectLevel) {
        this.defectLevel = defectLevel;
    }

    public DefectInfoV2 withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * 缺陷文件路径
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public DefectInfoV2 withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public DefectInfoV2 withIssueKey(String issueKey) {
        this.issueKey = issueKey;
        return this;
    }

    /**
     * 问题唯一标识
     * @return issueKey
     */
    public String getIssueKey() {
        return issueKey;
    }

    public void setIssueKey(String issueKey) {
        this.issueKey = issueKey;
    }

    public DefectInfoV2 withFragment(List<DefectFragmentV2> fragment) {
        this.fragment = fragment;
        return this;
    }

    public DefectInfoV2 addFragmentItem(DefectFragmentV2 fragmentItem) {
        if (this.fragment == null) {
            this.fragment = new ArrayList<>();
        }
        this.fragment.add(fragmentItem);
        return this;
    }

    public DefectInfoV2 withFragment(Consumer<List<DefectFragmentV2>> fragmentSetter) {
        if (this.fragment == null) {
            this.fragment = new ArrayList<>();
        }
        fragmentSetter.accept(this.fragment);
        return this;
    }

    /**
     * 缺陷代码片段详情
     * @return fragment
     */
    public List<DefectFragmentV2> getFragment() {
        return fragment;
    }

    public void setFragment(List<DefectFragmentV2> fragment) {
        this.fragment = fragment;
    }

    public DefectInfoV2 withEvents(List<DefectEvents> events) {
        this.events = events;
        return this;
    }

    public DefectInfoV2 addEventsItem(DefectEvents eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    public DefectInfoV2 withEvents(Consumer<List<DefectEvents>> eventsSetter) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        eventsSetter.accept(this.events);
        return this;
    }

    /**
     * 调用链信息
     * @return events
     */
    public List<DefectEvents> getEvents() {
        return events;
    }

    public void setEvents(List<DefectEvents> events) {
        this.events = events;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DefectInfoV2 that = (DefectInfoV2) obj;
        return Objects.equals(this.defectId, that.defectId)
            && Objects.equals(this.defectCheckerName, that.defectCheckerName)
            && Objects.equals(this.defectStatus, that.defectStatus)
            && Objects.equals(this.ruleSystemTags, that.ruleSystemTags) && Objects.equals(this.ruleName, that.ruleName)
            && Objects.equals(this.lineNumber, that.lineNumber)
            && Objects.equals(this.defectContent, that.defectContent)
            && Objects.equals(this.defectLevel, that.defectLevel) && Objects.equals(this.filePath, that.filePath)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.issueKey, that.issueKey)
            && Objects.equals(this.fragment, that.fragment) && Objects.equals(this.events, that.events);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defectId,
            defectCheckerName,
            defectStatus,
            ruleSystemTags,
            ruleName,
            lineNumber,
            defectContent,
            defectLevel,
            filePath,
            createdAt,
            issueKey,
            fragment,
            events);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DefectInfoV2 {\n");
        sb.append("    defectId: ").append(toIndentedString(defectId)).append("\n");
        sb.append("    defectCheckerName: ").append(toIndentedString(defectCheckerName)).append("\n");
        sb.append("    defectStatus: ").append(toIndentedString(defectStatus)).append("\n");
        sb.append("    ruleSystemTags: ").append(toIndentedString(ruleSystemTags)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
        sb.append("    defectContent: ").append(toIndentedString(defectContent)).append("\n");
        sb.append("    defectLevel: ").append(toIndentedString(defectLevel)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    issueKey: ").append(toIndentedString(issueKey)).append("\n");
        sb.append("    fragment: ").append(toIndentedString(fragment)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
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
