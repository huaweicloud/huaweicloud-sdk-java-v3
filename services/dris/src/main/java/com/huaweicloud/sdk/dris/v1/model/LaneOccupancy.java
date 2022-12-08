package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 分车道统计的占有率
 */
public class LaneOccupancy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lane_id")

    private Integer laneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "space_occupancy")

    private Double spaceOccupancy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_occupancy")

    private Double timeOccupancy;

    public LaneOccupancy withLaneId(Integer laneId) {
        this.laneId = laneId;
        return this;
    }

    /**
     * **参数说明**：车道编号。车道从左到右，从0开始编号
     * minimum: 0
     * maximum: 8
     * @return laneId
     */
    public Integer getLaneId() {
        return laneId;
    }

    public void setLaneId(Integer laneId) {
        this.laneId = laneId;
    }

    public LaneOccupancy withSpaceOccupancy(Double spaceOccupancy) {
        this.spaceOccupancy = spaceOccupancy;
        return this;
    }

    /**
     * **参数说明**：车道的空间占有率。
     * minimum: 0
     * maximum: 1
     * @return spaceOccupancy
     */
    public Double getSpaceOccupancy() {
        return spaceOccupancy;
    }

    public void setSpaceOccupancy(Double spaceOccupancy) {
        this.spaceOccupancy = spaceOccupancy;
    }

    public LaneOccupancy withTimeOccupancy(Double timeOccupancy) {
        this.timeOccupancy = timeOccupancy;
        return this;
    }

    /**
     * **参数说明**：车道的时间占有率。
     * minimum: 0
     * maximum: 1
     * @return timeOccupancy
     */
    public Double getTimeOccupancy() {
        return timeOccupancy;
    }

    public void setTimeOccupancy(Double timeOccupancy) {
        this.timeOccupancy = timeOccupancy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LaneOccupancy laneOccupancy = (LaneOccupancy) o;
        return Objects.equals(this.laneId, laneOccupancy.laneId)
            && Objects.equals(this.spaceOccupancy, laneOccupancy.spaceOccupancy)
            && Objects.equals(this.timeOccupancy, laneOccupancy.timeOccupancy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(laneId, spaceOccupancy, timeOccupancy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LaneOccupancy {\n");
        sb.append("    laneId: ").append(toIndentedString(laneId)).append("\n");
        sb.append("    spaceOccupancy: ").append(toIndentedString(spaceOccupancy)).append("\n");
        sb.append("    timeOccupancy: ").append(toIndentedString(timeOccupancy)).append("\n");
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
