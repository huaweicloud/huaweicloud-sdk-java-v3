package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 作业模式设置数据传输对象
 */
public class IsapJobModeSettingDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_overtime_interval")

    private Integer batchOvertimeInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_overtime_unit")

    private IsapTimeUnit batchOvertimeUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_frequency_interval")

    private Integer batchFrequencyInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_frequency_unit")

    private IsapTimeUnit batchFrequencyUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "streaming_state_ttl_interval")

    private Integer streamingStateTtlInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "streaming_state_ttl_unit")

    private IsapTimeUnit streamingStateTtlUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "streaming_checkpoint_ttl_interval")

    private Integer streamingCheckpointTtlInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "streaming_checkpoint_ttl_unit")

    private IsapTimeUnit streamingCheckpointTtlUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "streaming_startup_mode")

    private IsapJobStartupModeEnum streamingStartupMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_overtime_strategy_interval")

    private Integer batchOvertimeStrategyInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_overtime_strategy_unit")

    private IsapTimeUnit batchOvertimeStrategyUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_delay_interval")

    private Integer searchDelayInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_delay_unit")

    private IsapTimeUnit searchDelayUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_frequency_interval")

    private Integer searchFrequencyInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_frequency_unit")

    private IsapTimeUnit searchFrequencyUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_overtime_interval")

    private Integer searchOvertimeInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_overtime_unit")

    private IsapTimeUnit searchOvertimeUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_period_interval")

    private Integer searchPeriodInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_period_unit")

    private IsapTimeUnit searchPeriodUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_table_id")

    private String searchTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_table_name")

    private String searchTableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_not_null_policy")

    private IsapJobFieldNotNullPolicy fieldNotNullPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dss_id")

    private Long dssId;

    public IsapJobModeSettingDto withBatchOvertimeInterval(Integer batchOvertimeInterval) {
        this.batchOvertimeInterval = batchOvertimeInterval;
        return this;
    }

    /**
     * 整型间隔时长
     * minimum: 0
     * maximum: 2147483630
     * @return batchOvertimeInterval
     */
    public Integer getBatchOvertimeInterval() {
        return batchOvertimeInterval;
    }

    public void setBatchOvertimeInterval(Integer batchOvertimeInterval) {
        this.batchOvertimeInterval = batchOvertimeInterval;
    }

    public IsapJobModeSettingDto withBatchOvertimeUnit(IsapTimeUnit batchOvertimeUnit) {
        this.batchOvertimeUnit = batchOvertimeUnit;
        return this;
    }

    /**
     * Get batchOvertimeUnit
     * @return batchOvertimeUnit
     */
    public IsapTimeUnit getBatchOvertimeUnit() {
        return batchOvertimeUnit;
    }

    public void setBatchOvertimeUnit(IsapTimeUnit batchOvertimeUnit) {
        this.batchOvertimeUnit = batchOvertimeUnit;
    }

    public IsapJobModeSettingDto withBatchFrequencyInterval(Integer batchFrequencyInterval) {
        this.batchFrequencyInterval = batchFrequencyInterval;
        return this;
    }

    /**
     * 整型间隔时长
     * minimum: 0
     * maximum: 2147483630
     * @return batchFrequencyInterval
     */
    public Integer getBatchFrequencyInterval() {
        return batchFrequencyInterval;
    }

    public void setBatchFrequencyInterval(Integer batchFrequencyInterval) {
        this.batchFrequencyInterval = batchFrequencyInterval;
    }

    public IsapJobModeSettingDto withBatchFrequencyUnit(IsapTimeUnit batchFrequencyUnit) {
        this.batchFrequencyUnit = batchFrequencyUnit;
        return this;
    }

    /**
     * Get batchFrequencyUnit
     * @return batchFrequencyUnit
     */
    public IsapTimeUnit getBatchFrequencyUnit() {
        return batchFrequencyUnit;
    }

    public void setBatchFrequencyUnit(IsapTimeUnit batchFrequencyUnit) {
        this.batchFrequencyUnit = batchFrequencyUnit;
    }

    public IsapJobModeSettingDto withStreamingStateTtlInterval(Integer streamingStateTtlInterval) {
        this.streamingStateTtlInterval = streamingStateTtlInterval;
        return this;
    }

    /**
     * 整型间隔时长
     * minimum: 0
     * maximum: 2147483630
     * @return streamingStateTtlInterval
     */
    public Integer getStreamingStateTtlInterval() {
        return streamingStateTtlInterval;
    }

    public void setStreamingStateTtlInterval(Integer streamingStateTtlInterval) {
        this.streamingStateTtlInterval = streamingStateTtlInterval;
    }

    public IsapJobModeSettingDto withStreamingStateTtlUnit(IsapTimeUnit streamingStateTtlUnit) {
        this.streamingStateTtlUnit = streamingStateTtlUnit;
        return this;
    }

    /**
     * Get streamingStateTtlUnit
     * @return streamingStateTtlUnit
     */
    public IsapTimeUnit getStreamingStateTtlUnit() {
        return streamingStateTtlUnit;
    }

    public void setStreamingStateTtlUnit(IsapTimeUnit streamingStateTtlUnit) {
        this.streamingStateTtlUnit = streamingStateTtlUnit;
    }

    public IsapJobModeSettingDto withStreamingCheckpointTtlInterval(Integer streamingCheckpointTtlInterval) {
        this.streamingCheckpointTtlInterval = streamingCheckpointTtlInterval;
        return this;
    }

    /**
     * 整型间隔时长
     * minimum: 0
     * maximum: 2147483630
     * @return streamingCheckpointTtlInterval
     */
    public Integer getStreamingCheckpointTtlInterval() {
        return streamingCheckpointTtlInterval;
    }

    public void setStreamingCheckpointTtlInterval(Integer streamingCheckpointTtlInterval) {
        this.streamingCheckpointTtlInterval = streamingCheckpointTtlInterval;
    }

    public IsapJobModeSettingDto withStreamingCheckpointTtlUnit(IsapTimeUnit streamingCheckpointTtlUnit) {
        this.streamingCheckpointTtlUnit = streamingCheckpointTtlUnit;
        return this;
    }

    /**
     * Get streamingCheckpointTtlUnit
     * @return streamingCheckpointTtlUnit
     */
    public IsapTimeUnit getStreamingCheckpointTtlUnit() {
        return streamingCheckpointTtlUnit;
    }

    public void setStreamingCheckpointTtlUnit(IsapTimeUnit streamingCheckpointTtlUnit) {
        this.streamingCheckpointTtlUnit = streamingCheckpointTtlUnit;
    }

    public IsapJobModeSettingDto withStreamingStartupMode(IsapJobStartupModeEnum streamingStartupMode) {
        this.streamingStartupMode = streamingStartupMode;
        return this;
    }

    /**
     * Get streamingStartupMode
     * @return streamingStartupMode
     */
    public IsapJobStartupModeEnum getStreamingStartupMode() {
        return streamingStartupMode;
    }

    public void setStreamingStartupMode(IsapJobStartupModeEnum streamingStartupMode) {
        this.streamingStartupMode = streamingStartupMode;
    }

    public IsapJobModeSettingDto withBatchOvertimeStrategyInterval(Integer batchOvertimeStrategyInterval) {
        this.batchOvertimeStrategyInterval = batchOvertimeStrategyInterval;
        return this;
    }

    /**
     * 整型间隔时长
     * minimum: 0
     * maximum: 2147483630
     * @return batchOvertimeStrategyInterval
     */
    public Integer getBatchOvertimeStrategyInterval() {
        return batchOvertimeStrategyInterval;
    }

    public void setBatchOvertimeStrategyInterval(Integer batchOvertimeStrategyInterval) {
        this.batchOvertimeStrategyInterval = batchOvertimeStrategyInterval;
    }

    public IsapJobModeSettingDto withBatchOvertimeStrategyUnit(IsapTimeUnit batchOvertimeStrategyUnit) {
        this.batchOvertimeStrategyUnit = batchOvertimeStrategyUnit;
        return this;
    }

    /**
     * Get batchOvertimeStrategyUnit
     * @return batchOvertimeStrategyUnit
     */
    public IsapTimeUnit getBatchOvertimeStrategyUnit() {
        return batchOvertimeStrategyUnit;
    }

    public void setBatchOvertimeStrategyUnit(IsapTimeUnit batchOvertimeStrategyUnit) {
        this.batchOvertimeStrategyUnit = batchOvertimeStrategyUnit;
    }

    public IsapJobModeSettingDto withSearchDelayInterval(Integer searchDelayInterval) {
        this.searchDelayInterval = searchDelayInterval;
        return this;
    }

    /**
     * 整型间隔时长
     * minimum: 0
     * maximum: 2147483630
     * @return searchDelayInterval
     */
    public Integer getSearchDelayInterval() {
        return searchDelayInterval;
    }

    public void setSearchDelayInterval(Integer searchDelayInterval) {
        this.searchDelayInterval = searchDelayInterval;
    }

    public IsapJobModeSettingDto withSearchDelayUnit(IsapTimeUnit searchDelayUnit) {
        this.searchDelayUnit = searchDelayUnit;
        return this;
    }

    /**
     * Get searchDelayUnit
     * @return searchDelayUnit
     */
    public IsapTimeUnit getSearchDelayUnit() {
        return searchDelayUnit;
    }

    public void setSearchDelayUnit(IsapTimeUnit searchDelayUnit) {
        this.searchDelayUnit = searchDelayUnit;
    }

    public IsapJobModeSettingDto withSearchFrequencyInterval(Integer searchFrequencyInterval) {
        this.searchFrequencyInterval = searchFrequencyInterval;
        return this;
    }

    /**
     * 整型间隔时长
     * minimum: 0
     * maximum: 2147483630
     * @return searchFrequencyInterval
     */
    public Integer getSearchFrequencyInterval() {
        return searchFrequencyInterval;
    }

    public void setSearchFrequencyInterval(Integer searchFrequencyInterval) {
        this.searchFrequencyInterval = searchFrequencyInterval;
    }

    public IsapJobModeSettingDto withSearchFrequencyUnit(IsapTimeUnit searchFrequencyUnit) {
        this.searchFrequencyUnit = searchFrequencyUnit;
        return this;
    }

    /**
     * Get searchFrequencyUnit
     * @return searchFrequencyUnit
     */
    public IsapTimeUnit getSearchFrequencyUnit() {
        return searchFrequencyUnit;
    }

    public void setSearchFrequencyUnit(IsapTimeUnit searchFrequencyUnit) {
        this.searchFrequencyUnit = searchFrequencyUnit;
    }

    public IsapJobModeSettingDto withSearchOvertimeInterval(Integer searchOvertimeInterval) {
        this.searchOvertimeInterval = searchOvertimeInterval;
        return this;
    }

    /**
     * 整型间隔时长
     * minimum: 0
     * maximum: 2147483630
     * @return searchOvertimeInterval
     */
    public Integer getSearchOvertimeInterval() {
        return searchOvertimeInterval;
    }

    public void setSearchOvertimeInterval(Integer searchOvertimeInterval) {
        this.searchOvertimeInterval = searchOvertimeInterval;
    }

    public IsapJobModeSettingDto withSearchOvertimeUnit(IsapTimeUnit searchOvertimeUnit) {
        this.searchOvertimeUnit = searchOvertimeUnit;
        return this;
    }

    /**
     * Get searchOvertimeUnit
     * @return searchOvertimeUnit
     */
    public IsapTimeUnit getSearchOvertimeUnit() {
        return searchOvertimeUnit;
    }

    public void setSearchOvertimeUnit(IsapTimeUnit searchOvertimeUnit) {
        this.searchOvertimeUnit = searchOvertimeUnit;
    }

    public IsapJobModeSettingDto withSearchPeriodInterval(Integer searchPeriodInterval) {
        this.searchPeriodInterval = searchPeriodInterval;
        return this;
    }

    /**
     * 整型间隔时长
     * minimum: 0
     * maximum: 2147483630
     * @return searchPeriodInterval
     */
    public Integer getSearchPeriodInterval() {
        return searchPeriodInterval;
    }

    public void setSearchPeriodInterval(Integer searchPeriodInterval) {
        this.searchPeriodInterval = searchPeriodInterval;
    }

    public IsapJobModeSettingDto withSearchPeriodUnit(IsapTimeUnit searchPeriodUnit) {
        this.searchPeriodUnit = searchPeriodUnit;
        return this;
    }

    /**
     * Get searchPeriodUnit
     * @return searchPeriodUnit
     */
    public IsapTimeUnit getSearchPeriodUnit() {
        return searchPeriodUnit;
    }

    public void setSearchPeriodUnit(IsapTimeUnit searchPeriodUnit) {
        this.searchPeriodUnit = searchPeriodUnit;
    }

    public IsapJobModeSettingDto withSearchTableId(String searchTableId) {
        this.searchTableId = searchTableId;
        return this;
    }

    /**
     * UUID
     * @return searchTableId
     */
    public String getSearchTableId() {
        return searchTableId;
    }

    public void setSearchTableId(String searchTableId) {
        this.searchTableId = searchTableId;
    }

    public IsapJobModeSettingDto withSearchTableName(String searchTableName) {
        this.searchTableName = searchTableName;
        return this;
    }

    /**
     * 表名称
     * @return searchTableName
     */
    public String getSearchTableName() {
        return searchTableName;
    }

    public void setSearchTableName(String searchTableName) {
        this.searchTableName = searchTableName;
    }

    public IsapJobModeSettingDto withFieldNotNullPolicy(IsapJobFieldNotNullPolicy fieldNotNullPolicy) {
        this.fieldNotNullPolicy = fieldNotNullPolicy;
        return this;
    }

    /**
     * Get fieldNotNullPolicy
     * @return fieldNotNullPolicy
     */
    public IsapJobFieldNotNullPolicy getFieldNotNullPolicy() {
        return fieldNotNullPolicy;
    }

    public void setFieldNotNullPolicy(IsapJobFieldNotNullPolicy fieldNotNullPolicy) {
        this.fieldNotNullPolicy = fieldNotNullPolicy;
    }

    public IsapJobModeSettingDto withDssId(Long dssId) {
        this.dssId = dssId;
        return this;
    }

    /**
     * 长整型间隔时长
     * minimum: 0
     * maximum: 9223372036854775800
     * @return dssId
     */
    public Long getDssId() {
        return dssId;
    }

    public void setDssId(Long dssId) {
        this.dssId = dssId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IsapJobModeSettingDto that = (IsapJobModeSettingDto) obj;
        return Objects.equals(this.batchOvertimeInterval, that.batchOvertimeInterval)
            && Objects.equals(this.batchOvertimeUnit, that.batchOvertimeUnit)
            && Objects.equals(this.batchFrequencyInterval, that.batchFrequencyInterval)
            && Objects.equals(this.batchFrequencyUnit, that.batchFrequencyUnit)
            && Objects.equals(this.streamingStateTtlInterval, that.streamingStateTtlInterval)
            && Objects.equals(this.streamingStateTtlUnit, that.streamingStateTtlUnit)
            && Objects.equals(this.streamingCheckpointTtlInterval, that.streamingCheckpointTtlInterval)
            && Objects.equals(this.streamingCheckpointTtlUnit, that.streamingCheckpointTtlUnit)
            && Objects.equals(this.streamingStartupMode, that.streamingStartupMode)
            && Objects.equals(this.batchOvertimeStrategyInterval, that.batchOvertimeStrategyInterval)
            && Objects.equals(this.batchOvertimeStrategyUnit, that.batchOvertimeStrategyUnit)
            && Objects.equals(this.searchDelayInterval, that.searchDelayInterval)
            && Objects.equals(this.searchDelayUnit, that.searchDelayUnit)
            && Objects.equals(this.searchFrequencyInterval, that.searchFrequencyInterval)
            && Objects.equals(this.searchFrequencyUnit, that.searchFrequencyUnit)
            && Objects.equals(this.searchOvertimeInterval, that.searchOvertimeInterval)
            && Objects.equals(this.searchOvertimeUnit, that.searchOvertimeUnit)
            && Objects.equals(this.searchPeriodInterval, that.searchPeriodInterval)
            && Objects.equals(this.searchPeriodUnit, that.searchPeriodUnit)
            && Objects.equals(this.searchTableId, that.searchTableId)
            && Objects.equals(this.searchTableName, that.searchTableName)
            && Objects.equals(this.fieldNotNullPolicy, that.fieldNotNullPolicy)
            && Objects.equals(this.dssId, that.dssId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchOvertimeInterval,
            batchOvertimeUnit,
            batchFrequencyInterval,
            batchFrequencyUnit,
            streamingStateTtlInterval,
            streamingStateTtlUnit,
            streamingCheckpointTtlInterval,
            streamingCheckpointTtlUnit,
            streamingStartupMode,
            batchOvertimeStrategyInterval,
            batchOvertimeStrategyUnit,
            searchDelayInterval,
            searchDelayUnit,
            searchFrequencyInterval,
            searchFrequencyUnit,
            searchOvertimeInterval,
            searchOvertimeUnit,
            searchPeriodInterval,
            searchPeriodUnit,
            searchTableId,
            searchTableName,
            fieldNotNullPolicy,
            dssId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IsapJobModeSettingDto {\n");
        sb.append("    batchOvertimeInterval: ").append(toIndentedString(batchOvertimeInterval)).append("\n");
        sb.append("    batchOvertimeUnit: ").append(toIndentedString(batchOvertimeUnit)).append("\n");
        sb.append("    batchFrequencyInterval: ").append(toIndentedString(batchFrequencyInterval)).append("\n");
        sb.append("    batchFrequencyUnit: ").append(toIndentedString(batchFrequencyUnit)).append("\n");
        sb.append("    streamingStateTtlInterval: ").append(toIndentedString(streamingStateTtlInterval)).append("\n");
        sb.append("    streamingStateTtlUnit: ").append(toIndentedString(streamingStateTtlUnit)).append("\n");
        sb.append("    streamingCheckpointTtlInterval: ")
            .append(toIndentedString(streamingCheckpointTtlInterval))
            .append("\n");
        sb.append("    streamingCheckpointTtlUnit: ").append(toIndentedString(streamingCheckpointTtlUnit)).append("\n");
        sb.append("    streamingStartupMode: ").append(toIndentedString(streamingStartupMode)).append("\n");
        sb.append("    batchOvertimeStrategyInterval: ")
            .append(toIndentedString(batchOvertimeStrategyInterval))
            .append("\n");
        sb.append("    batchOvertimeStrategyUnit: ").append(toIndentedString(batchOvertimeStrategyUnit)).append("\n");
        sb.append("    searchDelayInterval: ").append(toIndentedString(searchDelayInterval)).append("\n");
        sb.append("    searchDelayUnit: ").append(toIndentedString(searchDelayUnit)).append("\n");
        sb.append("    searchFrequencyInterval: ").append(toIndentedString(searchFrequencyInterval)).append("\n");
        sb.append("    searchFrequencyUnit: ").append(toIndentedString(searchFrequencyUnit)).append("\n");
        sb.append("    searchOvertimeInterval: ").append(toIndentedString(searchOvertimeInterval)).append("\n");
        sb.append("    searchOvertimeUnit: ").append(toIndentedString(searchOvertimeUnit)).append("\n");
        sb.append("    searchPeriodInterval: ").append(toIndentedString(searchPeriodInterval)).append("\n");
        sb.append("    searchPeriodUnit: ").append(toIndentedString(searchPeriodUnit)).append("\n");
        sb.append("    searchTableId: ").append(toIndentedString(searchTableId)).append("\n");
        sb.append("    searchTableName: ").append(toIndentedString(searchTableName)).append("\n");
        sb.append("    fieldNotNullPolicy: ").append(toIndentedString(fieldNotNullPolicy)).append("\n");
        sb.append("    dssId: ").append(toIndentedString(dssId)).append("\n");
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
