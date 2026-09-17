package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDdsSlowLogTrendResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "points")

    private List<SlowLogPoint> points = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private Long interval;

    public ShowDdsSlowLogTrendResponse withPoints(List<SlowLogPoint> points) {
        this.points = points;
        return this;
    }

    public ShowDdsSlowLogTrendResponse addPointsItem(SlowLogPoint pointsItem) {
        if (this.points == null) {
            this.points = new ArrayList<>();
        }
        this.points.add(pointsItem);
        return this;
    }

    public ShowDdsSlowLogTrendResponse withPoints(Consumer<List<SlowLogPoint>> pointsSetter) {
        if (this.points == null) {
            this.points = new ArrayList<>();
        }
        pointsSetter.accept(this.points);
        return this;
    }

    /**
     * 慢日志趋势数量列表
     * @return points
     */
    public List<SlowLogPoint> getPoints() {
        return points;
    }

    public void setPoints(List<SlowLogPoint> points) {
        this.points = points;
    }

    public ShowDdsSlowLogTrendResponse withInterval(Long interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 时间间隔
     * @return interval
     */
    public Long getInterval() {
        return interval;
    }

    public void setInterval(Long interval) {
        this.interval = interval;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDdsSlowLogTrendResponse that = (ShowDdsSlowLogTrendResponse) obj;
        return Objects.equals(this.points, that.points) && Objects.equals(this.interval, that.interval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points, interval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDdsSlowLogTrendResponse {\n");
        sb.append("    points: ").append(toIndentedString(points)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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
