package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作台统计信息，只读。
 */
public class StatisticInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "atomic_index")

    private StatisticSchema atomicIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "derivative_index")

    private StatisticSchema derivativeIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compound_metric")

    private StatisticSchema compoundMetric;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_index")

    private StatisticSchema bizIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension")

    private StatisticSchema dimension;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_group")

    private StatisticSchema conditionGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_condition")

    private StatisticSchema timeCondition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common_condition")

    private StatisticSchema commonCondition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension_logic_table")

    private StatisticSchema dimensionLogicTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fact_logic_table")

    private StatisticSchema factLogicTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregation_logic_table")

    private StatisticSchema aggregationLogicTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_standard")

    private StatisticSchema dataStandard;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_model")

    private StatisticSchema tableModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lookup_table")

    private StatisticSchema lookupTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pending_review")

    private Integer pendingReview;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "my_applications")

    private Integer myApplications;

    public StatisticInfo withAtomicIndex(StatisticSchema atomicIndex) {
        this.atomicIndex = atomicIndex;
        return this;
    }

    public StatisticInfo withAtomicIndex(Consumer<StatisticSchema> atomicIndexSetter) {
        if (this.atomicIndex == null) {
            this.atomicIndex = new StatisticSchema();
            atomicIndexSetter.accept(this.atomicIndex);
        }

        return this;
    }

    /**
     * Get atomicIndex
     * @return atomicIndex
     */
    public StatisticSchema getAtomicIndex() {
        return atomicIndex;
    }

    public void setAtomicIndex(StatisticSchema atomicIndex) {
        this.atomicIndex = atomicIndex;
    }

    public StatisticInfo withDerivativeIndex(StatisticSchema derivativeIndex) {
        this.derivativeIndex = derivativeIndex;
        return this;
    }

    public StatisticInfo withDerivativeIndex(Consumer<StatisticSchema> derivativeIndexSetter) {
        if (this.derivativeIndex == null) {
            this.derivativeIndex = new StatisticSchema();
            derivativeIndexSetter.accept(this.derivativeIndex);
        }

        return this;
    }

    /**
     * Get derivativeIndex
     * @return derivativeIndex
     */
    public StatisticSchema getDerivativeIndex() {
        return derivativeIndex;
    }

    public void setDerivativeIndex(StatisticSchema derivativeIndex) {
        this.derivativeIndex = derivativeIndex;
    }

    public StatisticInfo withCompoundMetric(StatisticSchema compoundMetric) {
        this.compoundMetric = compoundMetric;
        return this;
    }

    public StatisticInfo withCompoundMetric(Consumer<StatisticSchema> compoundMetricSetter) {
        if (this.compoundMetric == null) {
            this.compoundMetric = new StatisticSchema();
            compoundMetricSetter.accept(this.compoundMetric);
        }

        return this;
    }

    /**
     * Get compoundMetric
     * @return compoundMetric
     */
    public StatisticSchema getCompoundMetric() {
        return compoundMetric;
    }

    public void setCompoundMetric(StatisticSchema compoundMetric) {
        this.compoundMetric = compoundMetric;
    }

    public StatisticInfo withBizIndex(StatisticSchema bizIndex) {
        this.bizIndex = bizIndex;
        return this;
    }

    public StatisticInfo withBizIndex(Consumer<StatisticSchema> bizIndexSetter) {
        if (this.bizIndex == null) {
            this.bizIndex = new StatisticSchema();
            bizIndexSetter.accept(this.bizIndex);
        }

        return this;
    }

    /**
     * Get bizIndex
     * @return bizIndex
     */
    public StatisticSchema getBizIndex() {
        return bizIndex;
    }

    public void setBizIndex(StatisticSchema bizIndex) {
        this.bizIndex = bizIndex;
    }

    public StatisticInfo withDimension(StatisticSchema dimension) {
        this.dimension = dimension;
        return this;
    }

    public StatisticInfo withDimension(Consumer<StatisticSchema> dimensionSetter) {
        if (this.dimension == null) {
            this.dimension = new StatisticSchema();
            dimensionSetter.accept(this.dimension);
        }

        return this;
    }

    /**
     * Get dimension
     * @return dimension
     */
    public StatisticSchema getDimension() {
        return dimension;
    }

    public void setDimension(StatisticSchema dimension) {
        this.dimension = dimension;
    }

    public StatisticInfo withConditionGroup(StatisticSchema conditionGroup) {
        this.conditionGroup = conditionGroup;
        return this;
    }

    public StatisticInfo withConditionGroup(Consumer<StatisticSchema> conditionGroupSetter) {
        if (this.conditionGroup == null) {
            this.conditionGroup = new StatisticSchema();
            conditionGroupSetter.accept(this.conditionGroup);
        }

        return this;
    }

    /**
     * Get conditionGroup
     * @return conditionGroup
     */
    public StatisticSchema getConditionGroup() {
        return conditionGroup;
    }

    public void setConditionGroup(StatisticSchema conditionGroup) {
        this.conditionGroup = conditionGroup;
    }

    public StatisticInfo withTimeCondition(StatisticSchema timeCondition) {
        this.timeCondition = timeCondition;
        return this;
    }

    public StatisticInfo withTimeCondition(Consumer<StatisticSchema> timeConditionSetter) {
        if (this.timeCondition == null) {
            this.timeCondition = new StatisticSchema();
            timeConditionSetter.accept(this.timeCondition);
        }

        return this;
    }

    /**
     * Get timeCondition
     * @return timeCondition
     */
    public StatisticSchema getTimeCondition() {
        return timeCondition;
    }

    public void setTimeCondition(StatisticSchema timeCondition) {
        this.timeCondition = timeCondition;
    }

    public StatisticInfo withCommonCondition(StatisticSchema commonCondition) {
        this.commonCondition = commonCondition;
        return this;
    }

    public StatisticInfo withCommonCondition(Consumer<StatisticSchema> commonConditionSetter) {
        if (this.commonCondition == null) {
            this.commonCondition = new StatisticSchema();
            commonConditionSetter.accept(this.commonCondition);
        }

        return this;
    }

    /**
     * Get commonCondition
     * @return commonCondition
     */
    public StatisticSchema getCommonCondition() {
        return commonCondition;
    }

    public void setCommonCondition(StatisticSchema commonCondition) {
        this.commonCondition = commonCondition;
    }

    public StatisticInfo withDimensionLogicTable(StatisticSchema dimensionLogicTable) {
        this.dimensionLogicTable = dimensionLogicTable;
        return this;
    }

    public StatisticInfo withDimensionLogicTable(Consumer<StatisticSchema> dimensionLogicTableSetter) {
        if (this.dimensionLogicTable == null) {
            this.dimensionLogicTable = new StatisticSchema();
            dimensionLogicTableSetter.accept(this.dimensionLogicTable);
        }

        return this;
    }

    /**
     * Get dimensionLogicTable
     * @return dimensionLogicTable
     */
    public StatisticSchema getDimensionLogicTable() {
        return dimensionLogicTable;
    }

    public void setDimensionLogicTable(StatisticSchema dimensionLogicTable) {
        this.dimensionLogicTable = dimensionLogicTable;
    }

    public StatisticInfo withFactLogicTable(StatisticSchema factLogicTable) {
        this.factLogicTable = factLogicTable;
        return this;
    }

    public StatisticInfo withFactLogicTable(Consumer<StatisticSchema> factLogicTableSetter) {
        if (this.factLogicTable == null) {
            this.factLogicTable = new StatisticSchema();
            factLogicTableSetter.accept(this.factLogicTable);
        }

        return this;
    }

    /**
     * Get factLogicTable
     * @return factLogicTable
     */
    public StatisticSchema getFactLogicTable() {
        return factLogicTable;
    }

    public void setFactLogicTable(StatisticSchema factLogicTable) {
        this.factLogicTable = factLogicTable;
    }

    public StatisticInfo withAggregationLogicTable(StatisticSchema aggregationLogicTable) {
        this.aggregationLogicTable = aggregationLogicTable;
        return this;
    }

    public StatisticInfo withAggregationLogicTable(Consumer<StatisticSchema> aggregationLogicTableSetter) {
        if (this.aggregationLogicTable == null) {
            this.aggregationLogicTable = new StatisticSchema();
            aggregationLogicTableSetter.accept(this.aggregationLogicTable);
        }

        return this;
    }

    /**
     * Get aggregationLogicTable
     * @return aggregationLogicTable
     */
    public StatisticSchema getAggregationLogicTable() {
        return aggregationLogicTable;
    }

    public void setAggregationLogicTable(StatisticSchema aggregationLogicTable) {
        this.aggregationLogicTable = aggregationLogicTable;
    }

    public StatisticInfo withDataStandard(StatisticSchema dataStandard) {
        this.dataStandard = dataStandard;
        return this;
    }

    public StatisticInfo withDataStandard(Consumer<StatisticSchema> dataStandardSetter) {
        if (this.dataStandard == null) {
            this.dataStandard = new StatisticSchema();
            dataStandardSetter.accept(this.dataStandard);
        }

        return this;
    }

    /**
     * Get dataStandard
     * @return dataStandard
     */
    public StatisticSchema getDataStandard() {
        return dataStandard;
    }

    public void setDataStandard(StatisticSchema dataStandard) {
        this.dataStandard = dataStandard;
    }

    public StatisticInfo withTableModel(StatisticSchema tableModel) {
        this.tableModel = tableModel;
        return this;
    }

    public StatisticInfo withTableModel(Consumer<StatisticSchema> tableModelSetter) {
        if (this.tableModel == null) {
            this.tableModel = new StatisticSchema();
            tableModelSetter.accept(this.tableModel);
        }

        return this;
    }

    /**
     * Get tableModel
     * @return tableModel
     */
    public StatisticSchema getTableModel() {
        return tableModel;
    }

    public void setTableModel(StatisticSchema tableModel) {
        this.tableModel = tableModel;
    }

    public StatisticInfo withLookupTable(StatisticSchema lookupTable) {
        this.lookupTable = lookupTable;
        return this;
    }

    public StatisticInfo withLookupTable(Consumer<StatisticSchema> lookupTableSetter) {
        if (this.lookupTable == null) {
            this.lookupTable = new StatisticSchema();
            lookupTableSetter.accept(this.lookupTable);
        }

        return this;
    }

    /**
     * Get lookupTable
     * @return lookupTable
     */
    public StatisticSchema getLookupTable() {
        return lookupTable;
    }

    public void setLookupTable(StatisticSchema lookupTable) {
        this.lookupTable = lookupTable;
    }

    public StatisticInfo withPendingReview(Integer pendingReview) {
        this.pendingReview = pendingReview;
        return this;
    }

    /**
     * 待我审核。
     * @return pendingReview
     */
    public Integer getPendingReview() {
        return pendingReview;
    }

    public void setPendingReview(Integer pendingReview) {
        this.pendingReview = pendingReview;
    }

    public StatisticInfo withMyApplications(Integer myApplications) {
        this.myApplications = myApplications;
        return this;
    }

    /**
     * 我的申请。
     * @return myApplications
     */
    public Integer getMyApplications() {
        return myApplications;
    }

    public void setMyApplications(Integer myApplications) {
        this.myApplications = myApplications;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StatisticInfo that = (StatisticInfo) obj;
        return Objects.equals(this.atomicIndex, that.atomicIndex)
            && Objects.equals(this.derivativeIndex, that.derivativeIndex)
            && Objects.equals(this.compoundMetric, that.compoundMetric) && Objects.equals(this.bizIndex, that.bizIndex)
            && Objects.equals(this.dimension, that.dimension)
            && Objects.equals(this.conditionGroup, that.conditionGroup)
            && Objects.equals(this.timeCondition, that.timeCondition)
            && Objects.equals(this.commonCondition, that.commonCondition)
            && Objects.equals(this.dimensionLogicTable, that.dimensionLogicTable)
            && Objects.equals(this.factLogicTable, that.factLogicTable)
            && Objects.equals(this.aggregationLogicTable, that.aggregationLogicTable)
            && Objects.equals(this.dataStandard, that.dataStandard) && Objects.equals(this.tableModel, that.tableModel)
            && Objects.equals(this.lookupTable, that.lookupTable)
            && Objects.equals(this.pendingReview, that.pendingReview)
            && Objects.equals(this.myApplications, that.myApplications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(atomicIndex,
            derivativeIndex,
            compoundMetric,
            bizIndex,
            dimension,
            conditionGroup,
            timeCondition,
            commonCondition,
            dimensionLogicTable,
            factLogicTable,
            aggregationLogicTable,
            dataStandard,
            tableModel,
            lookupTable,
            pendingReview,
            myApplications);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatisticInfo {\n");
        sb.append("    atomicIndex: ").append(toIndentedString(atomicIndex)).append("\n");
        sb.append("    derivativeIndex: ").append(toIndentedString(derivativeIndex)).append("\n");
        sb.append("    compoundMetric: ").append(toIndentedString(compoundMetric)).append("\n");
        sb.append("    bizIndex: ").append(toIndentedString(bizIndex)).append("\n");
        sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
        sb.append("    conditionGroup: ").append(toIndentedString(conditionGroup)).append("\n");
        sb.append("    timeCondition: ").append(toIndentedString(timeCondition)).append("\n");
        sb.append("    commonCondition: ").append(toIndentedString(commonCondition)).append("\n");
        sb.append("    dimensionLogicTable: ").append(toIndentedString(dimensionLogicTable)).append("\n");
        sb.append("    factLogicTable: ").append(toIndentedString(factLogicTable)).append("\n");
        sb.append("    aggregationLogicTable: ").append(toIndentedString(aggregationLogicTable)).append("\n");
        sb.append("    dataStandard: ").append(toIndentedString(dataStandard)).append("\n");
        sb.append("    tableModel: ").append(toIndentedString(tableModel)).append("\n");
        sb.append("    lookupTable: ").append(toIndentedString(lookupTable)).append("\n");
        sb.append("    pendingReview: ").append(toIndentedString(pendingReview)).append("\n");
        sb.append("    myApplications: ").append(toIndentedString(myApplications)).append("\n");
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
