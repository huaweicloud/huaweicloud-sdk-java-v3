package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 内容对比详情信息体。
 */
public class ContentDiffDetailVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_key_value")

    private List<String> sourceKeyValue = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_key_value")

    private List<String> targetKeyValue = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_select_sql")

    private String sourceSelectSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_select_sql")

    private String targetSelectSql;

    public ContentDiffDetailVO withSourceKeyValue(List<String> sourceKeyValue) {
        this.sourceKeyValue = sourceKeyValue;
        return this;
    }

    public ContentDiffDetailVO addSourceKeyValueItem(String sourceKeyValueItem) {
        if (this.sourceKeyValue == null) {
            this.sourceKeyValue = new ArrayList<>();
        }
        this.sourceKeyValue.add(sourceKeyValueItem);
        return this;
    }

    public ContentDiffDetailVO withSourceKeyValue(Consumer<List<String>> sourceKeyValueSetter) {
        if (this.sourceKeyValue == null) {
            this.sourceKeyValue = new ArrayList<>();
        }
        sourceKeyValueSetter.accept(this.sourceKeyValue);
        return this;
    }

    /**
     * 源库KEY值。
     * @return sourceKeyValue
     */
    public List<String> getSourceKeyValue() {
        return sourceKeyValue;
    }

    public void setSourceKeyValue(List<String> sourceKeyValue) {
        this.sourceKeyValue = sourceKeyValue;
    }

    public ContentDiffDetailVO withTargetKeyValue(List<String> targetKeyValue) {
        this.targetKeyValue = targetKeyValue;
        return this;
    }

    public ContentDiffDetailVO addTargetKeyValueItem(String targetKeyValueItem) {
        if (this.targetKeyValue == null) {
            this.targetKeyValue = new ArrayList<>();
        }
        this.targetKeyValue.add(targetKeyValueItem);
        return this;
    }

    public ContentDiffDetailVO withTargetKeyValue(Consumer<List<String>> targetKeyValueSetter) {
        if (this.targetKeyValue == null) {
            this.targetKeyValue = new ArrayList<>();
        }
        targetKeyValueSetter.accept(this.targetKeyValue);
        return this;
    }

    /**
     * 目标库KEY值。
     * @return targetKeyValue
     */
    public List<String> getTargetKeyValue() {
        return targetKeyValue;
    }

    public void setTargetKeyValue(List<String> targetKeyValue) {
        this.targetKeyValue = targetKeyValue;
    }

    public ContentDiffDetailVO withSourceSelectSql(String sourceSelectSql) {
        this.sourceSelectSql = sourceSelectSql;
        return this;
    }

    /**
     * 查询源库SQL。
     * @return sourceSelectSql
     */
    public String getSourceSelectSql() {
        return sourceSelectSql;
    }

    public void setSourceSelectSql(String sourceSelectSql) {
        this.sourceSelectSql = sourceSelectSql;
    }

    public ContentDiffDetailVO withTargetSelectSql(String targetSelectSql) {
        this.targetSelectSql = targetSelectSql;
        return this;
    }

    /**
     * 查询目标库SQL。
     * @return targetSelectSql
     */
    public String getTargetSelectSql() {
        return targetSelectSql;
    }

    public void setTargetSelectSql(String targetSelectSql) {
        this.targetSelectSql = targetSelectSql;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContentDiffDetailVO that = (ContentDiffDetailVO) obj;
        return Objects.equals(this.sourceKeyValue, that.sourceKeyValue)
            && Objects.equals(this.targetKeyValue, that.targetKeyValue)
            && Objects.equals(this.sourceSelectSql, that.sourceSelectSql)
            && Objects.equals(this.targetSelectSql, that.targetSelectSql);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceKeyValue, targetKeyValue, sourceSelectSql, targetSelectSql);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentDiffDetailVO {\n");
        sb.append("    sourceKeyValue: ").append(toIndentedString(sourceKeyValue)).append("\n");
        sb.append("    targetKeyValue: ").append(toIndentedString(targetKeyValue)).append("\n");
        sb.append("    sourceSelectSql: ").append(toIndentedString(sourceSelectSql)).append("\n");
        sb.append("    targetSelectSql: ").append(toIndentedString(targetSelectSql)).append("\n");
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
