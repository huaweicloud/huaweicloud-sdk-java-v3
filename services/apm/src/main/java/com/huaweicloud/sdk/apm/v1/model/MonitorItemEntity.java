package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MonitorItemEntity
 */
public class MonitorItemEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_id")

    private Integer categoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collector_name")

    private String collectorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_in_total")

    private Boolean showInTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitor_item_id")

    private Long monitorItemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disabled")

    private Boolean disabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collector_id")

    private Integer collectorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private Integer sequence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collect_interval")

    private Integer collectInterval;

    public MonitorItemEntity withCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * Get categoryId
     * @return categoryId
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public MonitorItemEntity withCollectorName(String collectorName) {
        this.collectorName = collectorName;
        return this;
    }

    /**
     * Get collectorName
     * @return collectorName
     */
    public String getCollectorName() {
        return collectorName;
    }

    public void setCollectorName(String collectorName) {
        this.collectorName = collectorName;
    }

    public MonitorItemEntity withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get displayName
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public MonitorItemEntity withShowInTotal(Boolean showInTotal) {
        this.showInTotal = showInTotal;
        return this;
    }

    /**
     * Get showInTotal
     * @return showInTotal
     */
    public Boolean getShowInTotal() {
        return showInTotal;
    }

    public void setShowInTotal(Boolean showInTotal) {
        this.showInTotal = showInTotal;
    }

    public MonitorItemEntity withMonitorItemId(Long monitorItemId) {
        this.monitorItemId = monitorItemId;
        return this;
    }

    /**
     * Get monitorItemId
     * @return monitorItemId
     */
    public Long getMonitorItemId() {
        return monitorItemId;
    }

    public void setMonitorItemId(Long monitorItemId) {
        this.monitorItemId = monitorItemId;
    }

    public MonitorItemEntity withDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * Get disabled
     * @return disabled
     */
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public MonitorItemEntity withCollectorId(Integer collectorId) {
        this.collectorId = collectorId;
        return this;
    }

    /**
     * Get collectorId
     * @return collectorId
     */
    public Integer getCollectorId() {
        return collectorId;
    }

    public void setCollectorId(Integer collectorId) {
        this.collectorId = collectorId;
    }

    public MonitorItemEntity withSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }

    /**
     * Get sequence
     * @return sequence
     */
    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public MonitorItemEntity withCollectInterval(Integer collectInterval) {
        this.collectInterval = collectInterval;
        return this;
    }

    /**
     * Get collectInterval
     * @return collectInterval
     */
    public Integer getCollectInterval() {
        return collectInterval;
    }

    public void setCollectInterval(Integer collectInterval) {
        this.collectInterval = collectInterval;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MonitorItemEntity monitorItemEntity = (MonitorItemEntity) o;
        return Objects.equals(this.categoryId, monitorItemEntity.categoryId)
            && Objects.equals(this.collectorName, monitorItemEntity.collectorName)
            && Objects.equals(this.displayName, monitorItemEntity.displayName)
            && Objects.equals(this.showInTotal, monitorItemEntity.showInTotal)
            && Objects.equals(this.monitorItemId, monitorItemEntity.monitorItemId)
            && Objects.equals(this.disabled, monitorItemEntity.disabled)
            && Objects.equals(this.collectorId, monitorItemEntity.collectorId)
            && Objects.equals(this.sequence, monitorItemEntity.sequence)
            && Objects.equals(this.collectInterval, monitorItemEntity.collectInterval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId,
            collectorName,
            displayName,
            showInTotal,
            monitorItemId,
            disabled,
            collectorId,
            sequence,
            collectInterval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MonitorItemEntity {\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    collectorName: ").append(toIndentedString(collectorName)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    showInTotal: ").append(toIndentedString(showInTotal)).append("\n");
        sb.append("    monitorItemId: ").append(toIndentedString(monitorItemId)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    collectorId: ").append(toIndentedString(collectorId)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
        sb.append("    collectInterval: ").append(toIndentedString(collectInterval)).append("\n");
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
