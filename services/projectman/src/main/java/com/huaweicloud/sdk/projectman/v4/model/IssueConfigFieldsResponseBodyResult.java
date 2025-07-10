package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询结果
 */
public class IssueConfigFieldsResponseBodyResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_fields")

    private List<IssueConfigFieldsResponseBodyResultConfigFields> configFields = null;

    public IssueConfigFieldsResponseBodyResult withConfigFields(
        List<IssueConfigFieldsResponseBodyResultConfigFields> configFields) {
        this.configFields = configFields;
        return this;
    }

    public IssueConfigFieldsResponseBodyResult addConfigFieldsItem(
        IssueConfigFieldsResponseBodyResultConfigFields configFieldsItem) {
        if (this.configFields == null) {
            this.configFields = new ArrayList<>();
        }
        this.configFields.add(configFieldsItem);
        return this;
    }

    public IssueConfigFieldsResponseBodyResult withConfigFields(
        Consumer<List<IssueConfigFieldsResponseBodyResultConfigFields>> configFieldsSetter) {
        if (this.configFields == null) {
            this.configFields = new ArrayList<>();
        }
        configFieldsSetter.accept(this.configFields);
        return this;
    }

    /**
     * 字段配置
     * @return configFields
     */
    public List<IssueConfigFieldsResponseBodyResultConfigFields> getConfigFields() {
        return configFields;
    }

    public void setConfigFields(List<IssueConfigFieldsResponseBodyResultConfigFields> configFields) {
        this.configFields = configFields;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IssueConfigFieldsResponseBodyResult that = (IssueConfigFieldsResponseBodyResult) obj;
        return Objects.equals(this.configFields, that.configFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueConfigFieldsResponseBodyResult {\n");
        sb.append("    configFields: ").append(toIndentedString(configFields)).append("\n");
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
