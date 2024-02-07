package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 表面离散点坐标集生成请求体
 */
public class RunSurfacePointsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x_coord_list")

    private List<Float> xCoordList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "y_coord_list")

    private List<Float> yCoordList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "z_coord_list")

    private List<Float> zCoordList = null;

    public RunSurfacePointsReq withXCoordList(List<Float> xCoordList) {
        this.xCoordList = xCoordList;
        return this;
    }

    public RunSurfacePointsReq addXCoordListItem(Float xCoordListItem) {
        if (this.xCoordList == null) {
            this.xCoordList = new ArrayList<>();
        }
        this.xCoordList.add(xCoordListItem);
        return this;
    }

    public RunSurfacePointsReq withXCoordList(Consumer<List<Float>> xCoordListSetter) {
        if (this.xCoordList == null) {
            this.xCoordList = new ArrayList<>();
        }
        xCoordListSetter.accept(this.xCoordList);
        return this;
    }

    /**
     * x坐标集
     * @return xCoordList
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x_coord_list")
    public List<Float> getXCoordList() {
        return xCoordList;
    }

    public void setXCoordList(List<Float> xCoordList) {
        this.xCoordList = xCoordList;
    }

    public RunSurfacePointsReq withYCoordList(List<Float> yCoordList) {
        this.yCoordList = yCoordList;
        return this;
    }

    public RunSurfacePointsReq addYCoordListItem(Float yCoordListItem) {
        if (this.yCoordList == null) {
            this.yCoordList = new ArrayList<>();
        }
        this.yCoordList.add(yCoordListItem);
        return this;
    }

    public RunSurfacePointsReq withYCoordList(Consumer<List<Float>> yCoordListSetter) {
        if (this.yCoordList == null) {
            this.yCoordList = new ArrayList<>();
        }
        yCoordListSetter.accept(this.yCoordList);
        return this;
    }

    /**
     * y坐标集
     * @return yCoordList
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "y_coord_list")
    public List<Float> getYCoordList() {
        return yCoordList;
    }

    public void setYCoordList(List<Float> yCoordList) {
        this.yCoordList = yCoordList;
    }

    public RunSurfacePointsReq withZCoordList(List<Float> zCoordList) {
        this.zCoordList = zCoordList;
        return this;
    }

    public RunSurfacePointsReq addZCoordListItem(Float zCoordListItem) {
        if (this.zCoordList == null) {
            this.zCoordList = new ArrayList<>();
        }
        this.zCoordList.add(zCoordListItem);
        return this;
    }

    public RunSurfacePointsReq withZCoordList(Consumer<List<Float>> zCoordListSetter) {
        if (this.zCoordList == null) {
            this.zCoordList = new ArrayList<>();
        }
        zCoordListSetter.accept(this.zCoordList);
        return this;
    }

    /**
     * z坐标集
     * @return zCoordList
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "z_coord_list")
    public List<Float> getZCoordList() {
        return zCoordList;
    }

    public void setZCoordList(List<Float> zCoordList) {
        this.zCoordList = zCoordList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RunSurfacePointsReq that = (RunSurfacePointsReq) obj;
        return Objects.equals(this.xCoordList, that.xCoordList) && Objects.equals(this.yCoordList, that.yCoordList)
            && Objects.equals(this.zCoordList, that.zCoordList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCoordList, yCoordList, zCoordList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunSurfacePointsReq {\n");
        sb.append("    xCoordList: ").append(toIndentedString(xCoordList)).append("\n");
        sb.append("    yCoordList: ").append(toIndentedString(yCoordList)).append("\n");
        sb.append("    zCoordList: ").append(toIndentedString(zCoordList)).append("\n");
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
