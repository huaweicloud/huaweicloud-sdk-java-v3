package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SubPicLayoutInfo
 */
public class SubPicLayoutInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "left")

    private Integer left;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top")

    private Integer top;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xSize")

    private Integer xSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ySize")

    private Integer ySize;

    public SubPicLayoutInfo withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 多画面信息。
     * minimum: 1
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SubPicLayoutInfo withLeft(Integer left) {
        this.left = left;
        return this;
    }

    /**
     * 子画面从左到右的索引。
     * minimum: 1
     * @return left
     */
    public Integer getLeft() {
        return left;
    }

    public void setLeft(Integer left) {
        this.left = left;
    }

    public SubPicLayoutInfo withTop(Integer top) {
        this.top = top;
        return this;
    }

    /**
     * 子画面从上到下的索引。
     * minimum: 1
     * @return top
     */
    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    public SubPicLayoutInfo withXSize(Integer xSize) {
        this.xSize = xSize;
        return this;
    }

    /**
     * 子画面横向尺寸。
     * minimum: 1
     * @return xSize
     */
    public Integer getXSize() {
        return xSize;
    }

    public void setXSize(Integer xSize) {
        this.xSize = xSize;
    }

    public SubPicLayoutInfo withYSize(Integer ySize) {
        this.ySize = ySize;
        return this;
    }

    /**
     * 子画面横向尺寸。
     * minimum: 1
     * @return ySize
     */
    public Integer getYSize() {
        return ySize;
    }

    public void setYSize(Integer ySize) {
        this.ySize = ySize;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubPicLayoutInfo subPicLayoutInfo = (SubPicLayoutInfo) o;
        return Objects.equals(this.id, subPicLayoutInfo.id) && Objects.equals(this.left, subPicLayoutInfo.left)
            && Objects.equals(this.top, subPicLayoutInfo.top) && Objects.equals(this.xSize, subPicLayoutInfo.xSize)
            && Objects.equals(this.ySize, subPicLayoutInfo.ySize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, left, top, xSize, ySize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubPicLayoutInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    left: ").append(toIndentedString(left)).append("\n");
        sb.append("    top: ").append(toIndentedString(top)).append("\n");
        sb.append("    xSize: ").append(toIndentedString(xSize)).append("\n");
        sb.append("    ySize: ").append(toIndentedString(ySize)).append("\n");
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
