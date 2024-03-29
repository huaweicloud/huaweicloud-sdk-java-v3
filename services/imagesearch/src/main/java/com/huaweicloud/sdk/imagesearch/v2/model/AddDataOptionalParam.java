package com.huaweicloud.sdk.imagesearch.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 添加数据的可选参数，其中每个参数仅对部分服务类型生效，具体可参见服务类型说明。
 */
public class AddDataOptionalParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "do_det")

    private Boolean doDet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "box")

    private String box;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "do_cls")

    private Boolean doCls;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private Integer category;

    public AddDataOptionalParam withDoDet(Boolean doDet) {
        this.doDet = doDet;
        return this;
    }

    /**
     * 是否进行目标检测，默认为true。
     * @return doDet
     */
    public Boolean getDoDet() {
        return doDet;
    }

    public void setDoDet(Boolean doDet) {
        this.doDet = doDet;
    }

    public AddDataOptionalParam withBox(String box) {
        this.box = box;
        return this;
    }

    /**
     * 目标矩形框坐标，如给定则不进行目标检测，直接使用该box作为目标。格式为“x1,y1,x2,y2”（无空格），x1/y1为目标左上角坐标，x2/y2为目标右下角坐标，具体要求如下： - 0 <= x1 < x2 <= width，默认要求x2-x1 >= 15，具体可参考服务类型说明。 - 0 <= y1 < y2 <= height，默认要求y2-y1 >= 15，具体可参考服务类型说明。
     * @return box
     */
    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public AddDataOptionalParam withDoCls(Boolean doCls) {
        this.doCls = doCls;
        return this;
    }

    /**
     * 是否进行对象分类，默认为true。
     * @return doCls
     */
    public Boolean getDoCls() {
        return doCls;
    }

    public void setDoCls(Boolean doCls) {
        this.doCls = doCls;
    }

    public AddDataOptionalParam withCategory(Integer category) {
        this.category = category;
        return this;
    }

    /**
     * 对象类目，如给定则不进行对象分类，直接使用该category作为类目。具体类目信息可参见对应的服务类型说明。
     * @return category
     */
    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddDataOptionalParam that = (AddDataOptionalParam) obj;
        return Objects.equals(this.doDet, that.doDet) && Objects.equals(this.box, that.box)
            && Objects.equals(this.doCls, that.doCls) && Objects.equals(this.category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doDet, box, doCls, category);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddDataOptionalParam {\n");
        sb.append("    doDet: ").append(toIndentedString(doDet)).append("\n");
        sb.append("    box: ").append(toIndentedString(box)).append("\n");
        sb.append("    doCls: ").append(toIndentedString(doCls)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
