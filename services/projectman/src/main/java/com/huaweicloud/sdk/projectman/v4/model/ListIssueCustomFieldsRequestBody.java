package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询Scrum工作项的自定义字段，custom_fields和names的相关自定义字段都返回
 */
public class ListIssueCustomFieldsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_fields")

    private List<String> customFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "names")

    private List<String> names = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "included_not_in_use")

    private Boolean includedNotInUse;

    public ListIssueCustomFieldsRequestBody withCustomFields(List<String> customFields) {
        this.customFields = customFields;
        return this;
    }

    public ListIssueCustomFieldsRequestBody addCustomFieldsItem(String customFieldsItem) {
        if (this.customFields == null) {
            this.customFields = new ArrayList<>();
        }
        this.customFields.add(customFieldsItem);
        return this;
    }

    public ListIssueCustomFieldsRequestBody withCustomFields(Consumer<List<String>> customFieldsSetter) {
        if (this.customFields == null) {
            this.customFields = new ArrayList<>();
        }
        customFieldsSetter.accept(this.customFields);
        return this;
    }

    /**
     * 自定义字段
     * @return customFields
     */
    public List<String> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<String> customFields) {
        this.customFields = customFields;
    }

    public ListIssueCustomFieldsRequestBody withNames(List<String> names) {
        this.names = names;
        return this;
    }

    public ListIssueCustomFieldsRequestBody addNamesItem(String namesItem) {
        if (this.names == null) {
            this.names = new ArrayList<>();
        }
        this.names.add(namesItem);
        return this;
    }

    public ListIssueCustomFieldsRequestBody withNames(Consumer<List<String>> namesSetter) {
        if (this.names == null) {
            this.names = new ArrayList<>();
        }
        namesSetter.accept(this.names);
        return this;
    }

    /**
     * 自定义字段页面显示的含义
     * @return names
     */
    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public ListIssueCustomFieldsRequestBody withIncludedNotInUse(Boolean includedNotInUse) {
        this.includedNotInUse = includedNotInUse;
        return this;
    }

    /**
     * 查询结果是否包括未使用的自定义字段，默认仅查询使用中的自定义字段，设为true时查询项目中所有自定义字段
     * @return includedNotInUse
     */
    public Boolean getIncludedNotInUse() {
        return includedNotInUse;
    }

    public void setIncludedNotInUse(Boolean includedNotInUse) {
        this.includedNotInUse = includedNotInUse;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListIssueCustomFieldsRequestBody listIssueCustomFieldsRequestBody = (ListIssueCustomFieldsRequestBody) o;
        return Objects.equals(this.customFields, listIssueCustomFieldsRequestBody.customFields)
            && Objects.equals(this.names, listIssueCustomFieldsRequestBody.names)
            && Objects.equals(this.includedNotInUse, listIssueCustomFieldsRequestBody.includedNotInUse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customFields, names, includedNotInUse);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIssueCustomFieldsRequestBody {\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    includedNotInUse: ").append(toIndentedString(includedNotInUse)).append("\n");
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
