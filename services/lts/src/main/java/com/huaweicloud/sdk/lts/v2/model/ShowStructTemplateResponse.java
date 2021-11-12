package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowStructTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "demoFields")

    private List<StructFieldInfoReturn> demoFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tagFields")

    private List<TagFieldsInfo> tagFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "demoLog")

    private String demoLog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "demoLabel")

    private String demoLabel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logGroupId")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule")

    private ShowStructTemplateRule rule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_info")

    private ShowStructTemplateclusterInfo clusterInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logStreamId")

    private String logStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectId")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templateName")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regex")

    private String regex;

    public ShowStructTemplateResponse withDemoFields(List<StructFieldInfoReturn> demoFields) {
        this.demoFields = demoFields;
        return this;
    }

    public ShowStructTemplateResponse addDemoFieldsItem(StructFieldInfoReturn demoFieldsItem) {
        if (this.demoFields == null) {
            this.demoFields = new ArrayList<>();
        }
        this.demoFields.add(demoFieldsItem);
        return this;
    }

    public ShowStructTemplateResponse withDemoFields(Consumer<List<StructFieldInfoReturn>> demoFieldsSetter) {
        if (this.demoFields == null) {
            this.demoFields = new ArrayList<>();
        }
        demoFieldsSetter.accept(this.demoFields);
        return this;
    }

    /** 结构化字段
     * 
     * @return demoFields */
    public List<StructFieldInfoReturn> getDemoFields() {
        return demoFields;
    }

    public void setDemoFields(List<StructFieldInfoReturn> demoFields) {
        this.demoFields = demoFields;
    }

    public ShowStructTemplateResponse withTagFields(List<TagFieldsInfo> tagFields) {
        this.tagFields = tagFields;
        return this;
    }

    public ShowStructTemplateResponse addTagFieldsItem(TagFieldsInfo tagFieldsItem) {
        if (this.tagFields == null) {
            this.tagFields = new ArrayList<>();
        }
        this.tagFields.add(tagFieldsItem);
        return this;
    }

    public ShowStructTemplateResponse withTagFields(Consumer<List<TagFieldsInfo>> tagFieldsSetter) {
        if (this.tagFields == null) {
            this.tagFields = new ArrayList<>();
        }
        tagFieldsSetter.accept(this.tagFields);
        return this;
    }

    /** 关键词详细信息
     * 
     * @return tagFields */
    public List<TagFieldsInfo> getTagFields() {
        return tagFields;
    }

    public void setTagFields(List<TagFieldsInfo> tagFields) {
        this.tagFields = tagFields;
    }

    public ShowStructTemplateResponse withDemoLog(String demoLog) {
        this.demoLog = demoLog;
        return this;
    }

    /** 示例日志
     * 
     * @return demoLog */
    public String getDemoLog() {
        return demoLog;
    }

    public void setDemoLog(String demoLog) {
        this.demoLog = demoLog;
    }

    public ShowStructTemplateResponse withDemoLabel(String demoLabel) {
        this.demoLabel = demoLabel;
        return this;
    }

    /** 测试
     * 
     * @return demoLabel */
    public String getDemoLabel() {
        return demoLabel;
    }

    public void setDemoLabel(String demoLabel) {
        this.demoLabel = demoLabel;
    }

    public ShowStructTemplateResponse withId(String id) {
        this.id = id;
        return this;
    }

    /** id
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowStructTemplateResponse withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /** 日志组ID
     * 
     * @return logGroupId */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public ShowStructTemplateResponse withRule(ShowStructTemplateRule rule) {
        this.rule = rule;
        return this;
    }

    public ShowStructTemplateResponse withRule(Consumer<ShowStructTemplateRule> ruleSetter) {
        if (this.rule == null) {
            this.rule = new ShowStructTemplateRule();
            ruleSetter.accept(this.rule);
        }

        return this;
    }

    /** 结构化方式
     * 
     * @return rule */
    public ShowStructTemplateRule getRule() {
        return rule;
    }

    public void setRule(ShowStructTemplateRule rule) {
        this.rule = rule;
    }

    public ShowStructTemplateResponse withClusterInfo(ShowStructTemplateclusterInfo clusterInfo) {
        this.clusterInfo = clusterInfo;
        return this;
    }

    public ShowStructTemplateResponse withClusterInfo(Consumer<ShowStructTemplateclusterInfo> clusterInfoSetter) {
        if (this.clusterInfo == null) {
            this.clusterInfo = new ShowStructTemplateclusterInfo();
            clusterInfoSetter.accept(this.clusterInfo);
        }

        return this;
    }

    /** kafka信息
     * 
     * @return clusterInfo */
    public ShowStructTemplateclusterInfo getClusterInfo() {
        return clusterInfo;
    }

    public void setClusterInfo(ShowStructTemplateclusterInfo clusterInfo) {
        this.clusterInfo = clusterInfo;
    }

    public ShowStructTemplateResponse withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    /** 日志流ID
     * 
     * @return logStreamId */
    public String getLogStreamId() {
        return logStreamId;
    }

    public void setLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
    }

    public ShowStructTemplateResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** 项目ID
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowStructTemplateResponse withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /** 测试
     * 
     * @return templateName */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public ShowStructTemplateResponse withRegex(String regex) {
        this.regex = regex;
        return this;
    }

    /** 为了兼容前台数据格式
     * 
     * @return regex */
    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowStructTemplateResponse showStructTemplateResponse = (ShowStructTemplateResponse) o;
        return Objects.equals(this.demoFields, showStructTemplateResponse.demoFields)
            && Objects.equals(this.tagFields, showStructTemplateResponse.tagFields)
            && Objects.equals(this.demoLog, showStructTemplateResponse.demoLog)
            && Objects.equals(this.demoLabel, showStructTemplateResponse.demoLabel)
            && Objects.equals(this.id, showStructTemplateResponse.id)
            && Objects.equals(this.logGroupId, showStructTemplateResponse.logGroupId)
            && Objects.equals(this.rule, showStructTemplateResponse.rule)
            && Objects.equals(this.clusterInfo, showStructTemplateResponse.clusterInfo)
            && Objects.equals(this.logStreamId, showStructTemplateResponse.logStreamId)
            && Objects.equals(this.projectId, showStructTemplateResponse.projectId)
            && Objects.equals(this.templateName, showStructTemplateResponse.templateName)
            && Objects.equals(this.regex, showStructTemplateResponse.regex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(demoFields,
            tagFields,
            demoLog,
            demoLabel,
            id,
            logGroupId,
            rule,
            clusterInfo,
            logStreamId,
            projectId,
            templateName,
            regex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStructTemplateResponse {\n");
        sb.append("    demoFields: ").append(toIndentedString(demoFields)).append("\n");
        sb.append("    tagFields: ").append(toIndentedString(tagFields)).append("\n");
        sb.append("    demoLog: ").append(toIndentedString(demoLog)).append("\n");
        sb.append("    demoLabel: ").append(toIndentedString(demoLabel)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
        sb.append("    clusterInfo: ").append(toIndentedString(clusterInfo)).append("\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
