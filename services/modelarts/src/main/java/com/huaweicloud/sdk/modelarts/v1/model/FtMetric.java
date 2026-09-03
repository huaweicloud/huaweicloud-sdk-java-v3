package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 训练指标结构体
 */
public class FtMetric {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_cn")

    private String nameCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "des_en")

    private String desEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "des_cn")

    private String desCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private String group;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_by")

    private List<String> groupBy = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x_axis")

    private String xAxis;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private Object data;

    public FtMetric withNameCn(String nameCn) {
        this.nameCn = nameCn;
        return this;
    }

    /**
     * 指标中文名称，如 训练指标、准确率，前端用作图例或列名
     * @return nameCn
     */
    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public FtMetric withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 指标英文名称，如 train_loss、val_accuracy，前端用作图例或列名
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public FtMetric withDesEn(String desEn) {
        this.desEn = desEn;
        return this;
    }

    /**
     * 指标中文解释，如 训练指标，前端用作针对指标进行释义
     * @return desEn
     */
    public String getDesEn() {
        return desEn;
    }

    public void setDesEn(String desEn) {
        this.desEn = desEn;
    }

    public FtMetric withDesCn(String desCn) {
        this.desCn = desCn;
        return this;
    }

    /**
     * 指标英文解释，如 train loss，前端用作针对指标进行释义
     * @return desCn
     */
    public String getDesCn() {
        return desCn;
    }

    public void setDesCn(String desCn) {
        this.desCn = desCn;
    }

    public FtMetric withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 指标绘图类型，可选 line（折线图）或 pie（饼图）、tabel（表格）、scalar（单值），可扩展 image 等
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FtMetric withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * 逻辑分组，如 training、validation、test，可扩展，用于前端分栏或过滤
     * @return group
     */
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public FtMetric withGroupBy(List<String> groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    public FtMetric addGroupByItem(String groupByItem) {
        if (this.groupBy == null) {
            this.groupBy = new ArrayList<>();
        }
        this.groupBy.add(groupByItem);
        return this;
    }

    public FtMetric withGroupBy(Consumer<List<String>> groupBySetter) {
        if (this.groupBy == null) {
            this.groupBy = new ArrayList<>();
        }
        groupBySetter.accept(this.groupBy);
        return this;
    }

    /**
     * 指定哪些数据点字段用于分组生成多个系列（如 [\"layer\",\"feature\"]）
     * @return groupBy
     */
    public List<String> getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(List<String> groupBy) {
        this.groupBy = groupBy;
    }

    public FtMetric withXAxis(String xAxis) {
        this.xAxis = xAxis;
        return this;
    }

    /**
     * 明确指定用作 X 轴的数据点字段名（如 \"step\"、\"epoch\"、\"timestamp\"）
     * @return xAxis
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x_axis")
    public String getXAxis() {
        return xAxis;
    }

    public void setXAxis(String xAxis) {
        this.xAxis = xAxis;
    }

    public FtMetric withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public FtMetric addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public FtMetric withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 逻辑分组，如 表面loss，用于前端分组或过滤
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public FtMetric withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 单位，如 %、samples/sec，仅用于展示
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public FtMetric withData(Object data) {
        this.data = data;
        return this;
    }

    /**
     * 数据点数组，严格按时间/步序升序排列
     * @return data
     */
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FtMetric that = (FtMetric) obj;
        return Objects.equals(this.nameCn, that.nameCn) && Objects.equals(this.nameEn, that.nameEn)
            && Objects.equals(this.desEn, that.desEn) && Objects.equals(this.desCn, that.desCn)
            && Objects.equals(this.type, that.type) && Objects.equals(this.group, that.group)
            && Objects.equals(this.groupBy, that.groupBy) && Objects.equals(this.xAxis, that.xAxis)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.unit, that.unit)
            && Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameCn, nameEn, desEn, desCn, type, group, groupBy, xAxis, tags, unit, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FtMetric {\n");
        sb.append("    nameCn: ").append(toIndentedString(nameCn)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    desEn: ").append(toIndentedString(desEn)).append("\n");
        sb.append("    desCn: ").append(toIndentedString(desCn)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
        sb.append("    xAxis: ").append(toIndentedString(xAxis)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
