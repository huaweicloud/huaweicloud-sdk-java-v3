package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 内容对比详情信息体。
 */
public class CompareJobContentDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_key_value")

    private List<String> sourceKeyValue = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_key_value")

    private List<String> targetKeyValue = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "select_sql")

    private String selectSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_select_sql")

    private String targetSelectSql;

    public CompareJobContentDetailInfo withSourceKeyValue(List<String> sourceKeyValue) {
        this.sourceKeyValue = sourceKeyValue;
        return this;
    }

    public CompareJobContentDetailInfo addSourceKeyValueItem(String sourceKeyValueItem) {
        if (this.sourceKeyValue == null) {
            this.sourceKeyValue = new ArrayList<>();
        }
        this.sourceKeyValue.add(sourceKeyValueItem);
        return this;
    }

    public CompareJobContentDetailInfo withSourceKeyValue(Consumer<List<String>> sourceKeyValueSetter) {
        if (this.sourceKeyValue == null) {
            this.sourceKeyValue = new ArrayList<>();
        }
        sourceKeyValueSetter.accept(this.sourceKeyValue);
        return this;
    }

    /**
     * 源库KEY值列表。
     * @return sourceKeyValue
     */
    public List<String> getSourceKeyValue() {
        return sourceKeyValue;
    }

    public void setSourceKeyValue(List<String> sourceKeyValue) {
        this.sourceKeyValue = sourceKeyValue;
    }

    public CompareJobContentDetailInfo withTargetKeyValue(List<String> targetKeyValue) {
        this.targetKeyValue = targetKeyValue;
        return this;
    }

    public CompareJobContentDetailInfo addTargetKeyValueItem(String targetKeyValueItem) {
        if (this.targetKeyValue == null) {
            this.targetKeyValue = new ArrayList<>();
        }
        this.targetKeyValue.add(targetKeyValueItem);
        return this;
    }

    public CompareJobContentDetailInfo withTargetKeyValue(Consumer<List<String>> targetKeyValueSetter) {
        if (this.targetKeyValue == null) {
            this.targetKeyValue = new ArrayList<>();
        }
        targetKeyValueSetter.accept(this.targetKeyValue);
        return this;
    }

    /**
     * 目标库KEY值列表。
     * @return targetKeyValue
     */
    public List<String> getTargetKeyValue() {
        return targetKeyValue;
    }

    public void setTargetKeyValue(List<String> targetKeyValue) {
        this.targetKeyValue = targetKeyValue;
    }

    public CompareJobContentDetailInfo withSelectSql(String selectSql) {
        this.selectSql = selectSql;
        return this;
    }

    /**
     * 查询源库的SQL。
     * @return selectSql
     */
    public String getSelectSql() {
        return selectSql;
    }

    public void setSelectSql(String selectSql) {
        this.selectSql = selectSql;
    }

    public CompareJobContentDetailInfo withTargetSelectSql(String targetSelectSql) {
        this.targetSelectSql = targetSelectSql;
        return this;
    }

    /**
     * 查询目标库的SQL。
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
        CompareJobContentDetailInfo that = (CompareJobContentDetailInfo) obj;
        return Objects.equals(this.sourceKeyValue, that.sourceKeyValue)
            && Objects.equals(this.targetKeyValue, that.targetKeyValue)
            && Objects.equals(this.selectSql, that.selectSql)
            && Objects.equals(this.targetSelectSql, that.targetSelectSql);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceKeyValue, targetKeyValue, selectSql, targetSelectSql);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareJobContentDetailInfo {\n");
        sb.append("    sourceKeyValue: ").append(toIndentedString(sourceKeyValue)).append("\n");
        sb.append("    targetKeyValue: ").append(toIndentedString(targetKeyValue)).append("\n");
        sb.append("    selectSql: ").append(toIndentedString(selectSql)).append("\n");
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
