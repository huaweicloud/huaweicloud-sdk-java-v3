package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 自定义字段
 */
public class IssueCustomField {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field")

    private String customField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private String options;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker_ids")

    private List<Integer> trackerIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    public IssueCustomField withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 自定义字段
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IssueCustomField withCustomField(String customField) {
        this.customField = customField;
        return this;
    }

    /**
     * 自定义字段
     * @return customField
     */
    public String getCustomField() {
        return customField;
    }

    public void setCustomField(String customField) {
        this.customField = customField;
    }

    public IssueCustomField withOptions(String options) {
        this.options = options;
        return this;
    }

    /**
     * 自定义字段的可选值，多个值以英文逗号区分
     * @return options
     */
    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public IssueCustomField withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 自定义字段类型， textArea 多行文本，只能包含汉字、英文大小写字母、数字、下划线和连接符，不能超过500字符； text 单行文本， 只能包含汉字、英文大小写字母、数字、下划线和连接符，不能超过500字符； select 下拉框，只能包含汉字、英文大小写字母、数字、下划线和连接符，每个选项最大长度40个字符，最多可定义60个选项； number 数字，取值范围由用户创建自定义字段时设置； date 日期 精确到年月日， time_date 日期 精确到时分秒， 长整型时间戳； checkbox 多选框，只能包含汉字、英文大小写字母、数字、下划线和连接符，每个选项最大长度40个字符，最多可定义60个选项； radio 单选框，只能包含汉字、英文大小写字母、数字、下划线和连接符，每个选项最大长度40个字符，最多可定义60个选项；
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public IssueCustomField withTrackerIds(List<Integer> trackerIds) {
        this.trackerIds = trackerIds;
        return this;
    }

    public IssueCustomField addTrackerIdsItem(Integer trackerIdsItem) {
        if (this.trackerIds == null) {
            this.trackerIds = new ArrayList<>();
        }
        this.trackerIds.add(trackerIdsItem);
        return this;
    }

    public IssueCustomField withTrackerIds(Consumer<List<Integer>> trackerIdsSetter) {
        if (this.trackerIds == null) {
            this.trackerIds = new ArrayList<>();
        }
        trackerIdsSetter.accept(this.trackerIds);
        return this;
    }

    /**
     * 自定义字段支持的工作项类型 2任务/Task,3缺陷/Bug,5Epic,6Feature,7Story
     * @return trackerIds
     */
    public List<Integer> getTrackerIds() {
        return trackerIds;
    }

    public void setTrackerIds(List<Integer> trackerIds) {
        this.trackerIds = trackerIds;
    }

    public IssueCustomField withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 自定义字段创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssueCustomField issueCustomField = (IssueCustomField) o;
        return Objects.equals(this.name, issueCustomField.name)
            && Objects.equals(this.customField, issueCustomField.customField)
            && Objects.equals(this.options, issueCustomField.options)
            && Objects.equals(this.type, issueCustomField.type)
            && Objects.equals(this.trackerIds, issueCustomField.trackerIds)
            && Objects.equals(this.createTime, issueCustomField.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, customField, options, type, trackerIds, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueCustomField {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    customField: ").append(toIndentedString(customField)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    trackerIds: ").append(toIndentedString(trackerIds)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
