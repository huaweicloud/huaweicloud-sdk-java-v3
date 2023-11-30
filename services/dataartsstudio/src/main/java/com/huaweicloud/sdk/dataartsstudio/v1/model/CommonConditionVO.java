package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CommonConditionVO
 */
public class CommonConditionVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_ids")

    private List<String> fieldIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_names")

    private List<String> fieldNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cal_exp")

    private String calExp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cal_fn_ids")

    private List<Long> calFnIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "front_configs")

    private String frontConfigs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    public CommonConditionVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CommonConditionVO withFieldIds(List<String> fieldIds) {
        this.fieldIds = fieldIds;
        return this;
    }

    public CommonConditionVO addFieldIdsItem(String fieldIdsItem) {
        if (this.fieldIds == null) {
            this.fieldIds = new ArrayList<>();
        }
        this.fieldIds.add(fieldIdsItem);
        return this;
    }

    public CommonConditionVO withFieldIds(Consumer<List<String>> fieldIdsSetter) {
        if (this.fieldIds == null) {
            this.fieldIds = new ArrayList<>();
        }
        fieldIdsSetter.accept(this.fieldIds);
        return this;
    }

    /**
     * 字段id信息， 格式：table_id.field_id
     * @return fieldIds
     */
    public List<String> getFieldIds() {
        return fieldIds;
    }

    public void setFieldIds(List<String> fieldIds) {
        this.fieldIds = fieldIds;
    }

    public CommonConditionVO withFieldNames(List<String> fieldNames) {
        this.fieldNames = fieldNames;
        return this;
    }

    public CommonConditionVO addFieldNamesItem(String fieldNamesItem) {
        if (this.fieldNames == null) {
            this.fieldNames = new ArrayList<>();
        }
        this.fieldNames.add(fieldNamesItem);
        return this;
    }

    public CommonConditionVO withFieldNames(Consumer<List<String>> fieldNamesSetter) {
        if (this.fieldNames == null) {
            this.fieldNames = new ArrayList<>();
        }
        fieldNamesSetter.accept(this.fieldNames);
        return this;
    }

    /**
     * 字段名称信息， 格式：表名称.字段名称
     * @return fieldNames
     */
    public List<String> getFieldNames() {
        return fieldNames;
    }

    public void setFieldNames(List<String> fieldNames) {
        this.fieldNames = fieldNames;
    }

    public CommonConditionVO withCalExp(String calExp) {
        this.calExp = calExp;
        return this;
    }

    /**
     * 计算表达式
     * @return calExp
     */
    public String getCalExp() {
        return calExp;
    }

    public void setCalExp(String calExp) {
        this.calExp = calExp;
    }

    public CommonConditionVO withCalFnIds(List<Long> calFnIds) {
        this.calFnIds = calFnIds;
        return this;
    }

    public CommonConditionVO addCalFnIdsItem(Long calFnIdsItem) {
        if (this.calFnIds == null) {
            this.calFnIds = new ArrayList<>();
        }
        this.calFnIds.add(calFnIdsItem);
        return this;
    }

    public CommonConditionVO withCalFnIds(Consumer<List<Long>> calFnIdsSetter) {
        if (this.calFnIds == null) {
            this.calFnIds = new ArrayList<>();
        }
        calFnIdsSetter.accept(this.calFnIds);
        return this;
    }

    /**
     * 计算表达式id
     * @return calFnIds
     */
    public List<Long> getCalFnIds() {
        return calFnIds;
    }

    public void setCalFnIds(List<Long> calFnIds) {
        this.calFnIds = calFnIds;
    }

    public CommonConditionVO withFrontConfigs(String frontConfigs) {
        this.frontConfigs = frontConfigs;
        return this;
    }

    /**
     * 前端表达式配置，用于前端数据恢复
     * @return frontConfigs
     */
    public String getFrontConfigs() {
        return frontConfigs;
    }

    public void setFrontConfigs(String frontConfigs) {
        this.frontConfigs = frontConfigs;
    }

    public CommonConditionVO withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommonConditionVO that = (CommonConditionVO) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.fieldIds, that.fieldIds)
            && Objects.equals(this.fieldNames, that.fieldNames) && Objects.equals(this.calExp, that.calExp)
            && Objects.equals(this.calFnIds, that.calFnIds) && Objects.equals(this.frontConfigs, that.frontConfigs)
            && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, fieldIds, fieldNames, calExp, calFnIds, frontConfigs, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommonConditionVO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    fieldIds: ").append(toIndentedString(fieldIds)).append("\n");
        sb.append("    fieldNames: ").append(toIndentedString(fieldNames)).append("\n");
        sb.append("    calExp: ").append(toIndentedString(calExp)).append("\n");
        sb.append("    calFnIds: ").append(toIndentedString(calFnIds)).append("\n");
        sb.append("    frontConfigs: ").append(toIndentedString(frontConfigs)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
