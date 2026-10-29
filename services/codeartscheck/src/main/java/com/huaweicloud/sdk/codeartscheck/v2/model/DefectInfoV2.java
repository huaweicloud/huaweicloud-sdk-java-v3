package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DefectInfoV2
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
    @JsonProperty(value = "defect_owner")

    private String defectOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_system_tags")

    private String ruleSystemTags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

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
     * **参数解释：** MergeKey，问题ID。 **取值范围：** 不涉及。
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
     * **参数解释：** 废弃字段。 **取值范围：** 不涉及。
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
     * **参数解释：** 问题状态。 **取值范围：** - 0：待处理。 - 1：已解决。 - 2：已忽略。 [- 3：重新打开（需打开忽略审核开关）。](tag:fcs,hcs,hcs_sm,hcs_site,hcs_sitesm) [- 4：待审核（需打开忽略审核开关）。](tag:fcs,hcs,hcs_sm,hcs_site,hcs_sitesm)
     * @return defectStatus
     */
    public String getDefectStatus() {
        return defectStatus;
    }

    public void setDefectStatus(String defectStatus) {
        this.defectStatus = defectStatus;
    }

    public DefectInfoV2 withDefectOwner(String defectOwner) {
        this.defectOwner = defectOwner;
        return this;
    }

    /**
     * **参数解释：** 问题责任人。 **取值范围：** 不涉及。
     * @return defectOwner
     */
    public String getDefectOwner() {
        return defectOwner;
    }

    public void setDefectOwner(String defectOwner) {
        this.defectOwner = defectOwner;
    }

    public DefectInfoV2 withRuleSystemTags(String ruleSystemTags) {
        this.ruleSystemTags = ruleSystemTags;
        return this;
    }

    /**
     * **参数解释：** 标签，多个标签用逗号隔开。 **取值范围：** 不涉及。
     * @return ruleSystemTags
     */
    public String getRuleSystemTags() {
        return ruleSystemTags;
    }

    public void setRuleSystemTags(String ruleSystemTags) {
        this.ruleSystemTags = ruleSystemTags;
    }

    public DefectInfoV2 withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * **参数解释：** 规则ID。 **取值范围：** 不涉及。
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public DefectInfoV2 withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * **参数解释：** 规则名称。 **取值范围：** 不涉及。
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
     * **参数解释：** 问题所在文件行号。 **取值范围：** 不涉及。
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
     * **参数解释：** 问题详细描述。 **取值范围：** 不涉及。
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
     * **参数解释：** 问题级别。 **取值范围：** - 0：致命。 - 1：严重。 - 2：一般。 - 3：提示。
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
     * **参数解释：** 问题文件路径。 **取值范围：** 不涉及。
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
     * **参数解释：** 问题发现时间。使用UTC时间，格式为yyyy-MM-ddTHH:mm:ssZ。例如：2020-09-25T12:05:00Z。 **取值范围：** 不涉及。
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
     * **参数解释：** 废弃字段。 **取值范围：** 不涉及。
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
     * **参数解释：** 代码片段内容。
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
     * **参数解释：** 调用链信息。
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
            && Objects.equals(this.defectOwner, that.defectOwner)
            && Objects.equals(this.ruleSystemTags, that.ruleSystemTags) && Objects.equals(this.ruleId, that.ruleId)
            && Objects.equals(this.ruleName, that.ruleName) && Objects.equals(this.lineNumber, that.lineNumber)
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
            defectOwner,
            ruleSystemTags,
            ruleId,
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
        sb.append("    defectOwner: ").append(toIndentedString(defectOwner)).append("\n");
        sb.append("    ruleSystemTags: ").append(toIndentedString(ruleSystemTags)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
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
