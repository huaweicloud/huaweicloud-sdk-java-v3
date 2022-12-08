package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 车道拥堵信息。
 */
public class CongestionLanesInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "laneid")

    private Integer laneid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "length")

    private Integer length;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_point")

    private Position3D startPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_point")

    private Position3D endPoint;

    public CongestionLanesInfo withLaneid(Integer laneid) {
        this.laneid = laneid;
        return this;
    }

    /**
     * **参数说明**：车道号。
     * minimum: 0
     * maximum: 100
     * @return laneid
     */
    public Integer getLaneid() {
        return laneid;
    }

    public void setLaneid(Integer laneid) {
        this.laneid = laneid;
    }

    public CongestionLanesInfo withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * **参数说明**：拥堵级别。  **取值范围**：  - 1：拥堵级别低，速度[25, 30) 单位：km/h  - 2：拥堵级别中，速度[15，25) 单位：km/h  - 3：拥堵级别高，速度[0, 15) 单位：km/h
     * minimum: 0
     * maximum: 3
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public CongestionLanesInfo withLength(Integer length) {
        this.length = length;
        return this;
    }

    /**
     * **参数说明**：拥堵长度，单位为米（m）。
     * minimum: 0
     * maximum: 1000
     * @return length
     */
    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public CongestionLanesInfo withStartPoint(Position3D startPoint) {
        this.startPoint = startPoint;
        return this;
    }

    public CongestionLanesInfo withStartPoint(Consumer<Position3D> startPointSetter) {
        if (this.startPoint == null) {
            this.startPoint = new Position3D();
            startPointSetter.accept(this.startPoint);
        }

        return this;
    }

    /**
     * Get startPoint
     * @return startPoint
     */
    public Position3D getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Position3D startPoint) {
        this.startPoint = startPoint;
    }

    public CongestionLanesInfo withEndPoint(Position3D endPoint) {
        this.endPoint = endPoint;
        return this;
    }

    public CongestionLanesInfo withEndPoint(Consumer<Position3D> endPointSetter) {
        if (this.endPoint == null) {
            this.endPoint = new Position3D();
            endPointSetter.accept(this.endPoint);
        }

        return this;
    }

    /**
     * Get endPoint
     * @return endPoint
     */
    public Position3D getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Position3D endPoint) {
        this.endPoint = endPoint;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CongestionLanesInfo congestionLanesInfo = (CongestionLanesInfo) o;
        return Objects.equals(this.laneid, congestionLanesInfo.laneid)
            && Objects.equals(this.level, congestionLanesInfo.level)
            && Objects.equals(this.length, congestionLanesInfo.length)
            && Objects.equals(this.startPoint, congestionLanesInfo.startPoint)
            && Objects.equals(this.endPoint, congestionLanesInfo.endPoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(laneid, level, length, startPoint, endPoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CongestionLanesInfo {\n");
        sb.append("    laneid: ").append(toIndentedString(laneid)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    length: ").append(toIndentedString(length)).append("\n");
        sb.append("    startPoint: ").append(toIndentedString(startPoint)).append("\n");
        sb.append("    endPoint: ").append(toIndentedString(endPoint)).append("\n");
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
