package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * SubtaskcaseOverstockDto
 */
public class SubtaskcaseOverstockDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_time")

    private OffsetDateTime dataTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_type")

    private String executorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location_id")

    private String locationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtaskcase_overstock_count")

    private Integer subtaskcaseOverstockCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_service_id")

    private String testServiceId;

    public SubtaskcaseOverstockDto withDataTime(OffsetDateTime dataTime) {
        this.dataTime = dataTime;
        return this;
    }

    /**
     * 查询时间
     * @return dataTime
     */
    public OffsetDateTime getDataTime() {
        return dataTime;
    }

    public void setDataTime(OffsetDateTime dataTime) {
        this.dataTime = dataTime;
    }

    public SubtaskcaseOverstockDto withExecutorType(String executorType) {
        this.executorType = executorType;
        return this;
    }

    /**
     * 执行机类型
     * @return executorType
     */
    public String getExecutorType() {
        return executorType;
    }

    public void setExecutorType(String executorType) {
        this.executorType = executorType;
    }

    public SubtaskcaseOverstockDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * UUID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SubtaskcaseOverstockDto withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 执行机标签
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public SubtaskcaseOverstockDto withLocationId(String locationId) {
        this.locationId = locationId;
        return this;
    }

    /**
     * 执行机所属区域
     * @return locationId
     */
    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public SubtaskcaseOverstockDto withSubtaskcaseOverstockCount(Integer subtaskcaseOverstockCount) {
        this.subtaskcaseOverstockCount = subtaskcaseOverstockCount;
        return this;
    }

    /**
     * 积压数量
     * @return subtaskcaseOverstockCount
     */
    public Integer getSubtaskcaseOverstockCount() {
        return subtaskcaseOverstockCount;
    }

    public void setSubtaskcaseOverstockCount(Integer subtaskcaseOverstockCount) {
        this.subtaskcaseOverstockCount = subtaskcaseOverstockCount;
    }

    public SubtaskcaseOverstockDto withTestServiceId(String testServiceId) {
        this.testServiceId = testServiceId;
        return this;
    }

    /**
     * 服务ID
     * @return testServiceId
     */
    public String getTestServiceId() {
        return testServiceId;
    }

    public void setTestServiceId(String testServiceId) {
        this.testServiceId = testServiceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubtaskcaseOverstockDto that = (SubtaskcaseOverstockDto) obj;
        return Objects.equals(this.dataTime, that.dataTime) && Objects.equals(this.executorType, that.executorType)
            && Objects.equals(this.id, that.id) && Objects.equals(this.label, that.label)
            && Objects.equals(this.locationId, that.locationId)
            && Objects.equals(this.subtaskcaseOverstockCount, that.subtaskcaseOverstockCount)
            && Objects.equals(this.testServiceId, that.testServiceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataTime, executorType, id, label, locationId, subtaskcaseOverstockCount, testServiceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubtaskcaseOverstockDto {\n");
        sb.append("    dataTime: ").append(toIndentedString(dataTime)).append("\n");
        sb.append("    executorType: ").append(toIndentedString(executorType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
        sb.append("    subtaskcaseOverstockCount: ").append(toIndentedString(subtaskcaseOverstockCount)).append("\n");
        sb.append("    testServiceId: ").append(toIndentedString(testServiceId)).append("\n");
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
