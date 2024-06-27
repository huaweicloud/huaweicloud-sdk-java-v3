package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConditionInstance
 */
public class ConditionInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditionIndex")

    private Integer conditionIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditionMap")

    private Map<String, List<String>> conditionMap = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "depParamMap")

    private Map<String, DepParamInstance> depParamMap = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statementIndex")

    private Integer statementIndex;

    public ConditionInstance withConditionIndex(Integer conditionIndex) {
        this.conditionIndex = conditionIndex;
        return this;
    }

    /**
     * 条件索引，用于标识当前处理的是哪个条件
     * @return conditionIndex
     */
    public Integer getConditionIndex() {
        return conditionIndex;
    }

    public void setConditionIndex(Integer conditionIndex) {
        this.conditionIndex = conditionIndex;
    }

    public ConditionInstance withConditionMap(Map<String, List<String>> conditionMap) {
        this.conditionMap = conditionMap;
        return this;
    }

    public ConditionInstance putConditionMapItem(String key, List<String> conditionMapItem) {
        if (this.conditionMap == null) {
            this.conditionMap = new HashMap<>();
        }
        this.conditionMap.put(key, conditionMapItem);
        return this;
    }

    public ConditionInstance withConditionMap(Consumer<Map<String, List<String>>> conditionMapSetter) {
        if (this.conditionMap == null) {
            this.conditionMap = new HashMap<>();
        }
        conditionMapSetter.accept(this.conditionMap);
        return this;
    }

    /**
     * 条件映射，键为整数，值为字符串列表，用于存储各个条件的信息
     * @return conditionMap
     */
    public Map<String, List<String>> getConditionMap() {
        return conditionMap;
    }

    public void setConditionMap(Map<String, List<String>> conditionMap) {
        this.conditionMap = conditionMap;
    }

    public ConditionInstance withDepParamMap(Map<String, DepParamInstance> depParamMap) {
        this.depParamMap = depParamMap;
        return this;
    }

    public ConditionInstance putDepParamMapItem(String key, DepParamInstance depParamMapItem) {
        if (this.depParamMap == null) {
            this.depParamMap = new HashMap<>();
        }
        this.depParamMap.put(key, depParamMapItem);
        return this;
    }

    public ConditionInstance withDepParamMap(Consumer<Map<String, DepParamInstance>> depParamMapSetter) {
        if (this.depParamMap == null) {
            this.depParamMap = new HashMap<>();
        }
        depParamMapSetter.accept(this.depParamMap);
        return this;
    }

    /**
     * 依赖参数实例的映射
     * @return depParamMap
     */
    public Map<String, DepParamInstance> getDepParamMap() {
        return depParamMap;
    }

    public void setDepParamMap(Map<String, DepParamInstance> depParamMap) {
        this.depParamMap = depParamMap;
    }

    public ConditionInstance withStatementIndex(Integer statementIndex) {
        this.statementIndex = statementIndex;
        return this;
    }

    /**
     * 声明索引，用于标识当前处理的是哪个声明
     * @return statementIndex
     */
    public Integer getStatementIndex() {
        return statementIndex;
    }

    public void setStatementIndex(Integer statementIndex) {
        this.statementIndex = statementIndex;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConditionInstance that = (ConditionInstance) obj;
        return Objects.equals(this.conditionIndex, that.conditionIndex)
            && Objects.equals(this.conditionMap, that.conditionMap)
            && Objects.equals(this.depParamMap, that.depParamMap)
            && Objects.equals(this.statementIndex, that.statementIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conditionIndex, conditionMap, depParamMap, statementIndex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConditionInstance {\n");
        sb.append("    conditionIndex: ").append(toIndentedString(conditionIndex)).append("\n");
        sb.append("    conditionMap: ").append(toIndentedString(conditionMap)).append("\n");
        sb.append("    depParamMap: ").append(toIndentedString(depParamMap)).append("\n");
        sb.append("    statementIndex: ").append(toIndentedString(statementIndex)).append("\n");
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
