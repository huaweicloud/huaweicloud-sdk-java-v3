package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * FrontLine
 */
public class FrontLine {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "point_list")

    private List<FrontPoint> pointList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_by")

    private String groupBy;

    public FrontLine withPointList(List<FrontPoint> pointList) {
        this.pointList = pointList;
        return this;
    }

    public FrontLine addPointListItem(FrontPoint pointListItem) {
        if (this.pointList == null) {
            this.pointList = new ArrayList<>();
        }
        this.pointList.add(pointListItem);
        return this;
    }

    public FrontLine withPointList(Consumer<List<FrontPoint>> pointListSetter) {
        if (this.pointList == null) {
            this.pointList = new ArrayList<>();
        }
        pointListSetter.accept(this.pointList);
        return this;
    }

    /**
     * 趋势图数据
     * @return pointList
     */
    public List<FrontPoint> getPointList() {
        return pointList;
    }

    public void setPointList(List<FrontPoint> pointList) {
        this.pointList = pointList;
    }

    public FrontLine withGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /**
     * 分组名
     * @return groupBy
     */
    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FrontLine that = (FrontLine) obj;
        return Objects.equals(this.pointList, that.pointList) && Objects.equals(this.groupBy, that.groupBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointList, groupBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FrontLine {\n");
        sb.append("    pointList: ").append(toIndentedString(pointList)).append("\n");
        sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
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
