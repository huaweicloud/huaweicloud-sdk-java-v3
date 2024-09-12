package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量删除点位表配置请求结构体
 */
public class DeleteDcPointsReqDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "points")

    private List<String> points = null;

    public DeleteDcPointsReqDTO withPoints(List<String> points) {
        this.points = points;
        return this;
    }

    public DeleteDcPointsReqDTO addPointsItem(String pointsItem) {
        if (this.points == null) {
            this.points = new ArrayList<>();
        }
        this.points.add(pointsItem);
        return this;
    }

    public DeleteDcPointsReqDTO withPoints(Consumer<List<String>> pointsSetter) {
        if (this.points == null) {
            this.points = new ArrayList<>();
        }
        pointsSetter.accept(this.points);
        return this;
    }

    /**
     * Get points
     * @return points
     */
    public List<String> getPoints() {
        return points;
    }

    public void setPoints(List<String> points) {
        this.points = points;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteDcPointsReqDTO that = (DeleteDcPointsReqDTO) obj;
        return Objects.equals(this.points, that.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDcPointsReqDTO {\n");
        sb.append("    points: ").append(toIndentedString(points)).append("\n");
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
