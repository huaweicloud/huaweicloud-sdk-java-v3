package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 拥堵事件信息
 */
public class CongestionInfo {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "congestion_lanes_info")

    private List<CongestionLanesInfo> congestionLanesInfo = null;

    public CongestionInfo withLevel(Integer level) {
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

    public CongestionInfo withLength(Integer length) {
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

    public CongestionInfo withStartPoint(Position3D startPoint) {
        this.startPoint = startPoint;
        return this;
    }

    public CongestionInfo withStartPoint(Consumer<Position3D> startPointSetter) {
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

    public CongestionInfo withEndPoint(Position3D endPoint) {
        this.endPoint = endPoint;
        return this;
    }

    public CongestionInfo withEndPoint(Consumer<Position3D> endPointSetter) {
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

    public CongestionInfo withCongestionLanesInfo(List<CongestionLanesInfo> congestionLanesInfo) {
        this.congestionLanesInfo = congestionLanesInfo;
        return this;
    }

    public CongestionInfo addCongestionLanesInfoItem(CongestionLanesInfo congestionLanesInfoItem) {
        if (this.congestionLanesInfo == null) {
            this.congestionLanesInfo = new ArrayList<>();
        }
        this.congestionLanesInfo.add(congestionLanesInfoItem);
        return this;
    }

    public CongestionInfo withCongestionLanesInfo(Consumer<List<CongestionLanesInfo>> congestionLanesInfoSetter) {
        if (this.congestionLanesInfo == null) {
            this.congestionLanesInfo = new ArrayList<>();
        }
        congestionLanesInfoSetter.accept(this.congestionLanesInfo);
        return this;
    }

    /**
     * **参数说明**：车道拥堵信息。
     * @return congestionLanesInfo
     */
    public List<CongestionLanesInfo> getCongestionLanesInfo() {
        return congestionLanesInfo;
    }

    public void setCongestionLanesInfo(List<CongestionLanesInfo> congestionLanesInfo) {
        this.congestionLanesInfo = congestionLanesInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CongestionInfo that = (CongestionInfo) obj;
        return Objects.equals(this.level, that.level) && Objects.equals(this.length, that.length)
            && Objects.equals(this.startPoint, that.startPoint) && Objects.equals(this.endPoint, that.endPoint)
            && Objects.equals(this.congestionLanesInfo, that.congestionLanesInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(level, length, startPoint, endPoint, congestionLanesInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CongestionInfo {\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    length: ").append(toIndentedString(length)).append("\n");
        sb.append("    startPoint: ").append(toIndentedString(startPoint)).append("\n");
        sb.append("    endPoint: ").append(toIndentedString(endPoint)).append("\n");
        sb.append("    congestionLanesInfo: ").append(toIndentedString(congestionLanesInfo)).append("\n");
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
