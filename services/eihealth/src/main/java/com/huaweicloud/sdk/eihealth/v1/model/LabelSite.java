package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 靶点分子设计标记位点
 */
public class LabelSite {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    private List<Integer> index = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private List<String> name = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coordinate")

    private List<List<Float>> coordinate = null;

    public LabelSite withIndex(List<Integer> index) {
        this.index = index;
        return this;
    }

    public LabelSite addIndexItem(Integer indexItem) {
        if (this.index == null) {
            this.index = new ArrayList<>();
        }
        this.index.add(indexItem);
        return this;
    }

    public LabelSite withIndex(Consumer<List<Integer>> indexSetter) {
        if (this.index == null) {
            this.index = new ArrayList<>();
        }
        indexSetter.accept(this.index);
        return this;
    }

    /**
     * 索引
     * @return index
     */
    public List<Integer> getIndex() {
        return index;
    }

    public void setIndex(List<Integer> index) {
        this.index = index;
    }

    public LabelSite withName(List<String> name) {
        this.name = name;
        return this;
    }

    public LabelSite addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public LabelSite withName(Consumer<List<String>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * 标记位点名称
     * @return name
     */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public LabelSite withCoordinate(List<List<Float>> coordinate) {
        this.coordinate = coordinate;
        return this;
    }

    public LabelSite addCoordinateItem(List<Float> coordinateItem) {
        if (this.coordinate == null) {
            this.coordinate = new ArrayList<>();
        }
        this.coordinate.add(coordinateItem);
        return this;
    }

    public LabelSite withCoordinate(Consumer<List<List<Float>>> coordinateSetter) {
        if (this.coordinate == null) {
            this.coordinate = new ArrayList<>();
        }
        coordinateSetter.accept(this.coordinate);
        return this;
    }

    /**
     * 位点三维坐标集
     * @return coordinate
     */
    public List<List<Float>> getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(List<List<Float>> coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LabelSite that = (LabelSite) obj;
        return Objects.equals(this.index, that.index) && Objects.equals(this.name, that.name)
            && Objects.equals(this.coordinate, that.coordinate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, name, coordinate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabelSite {\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    coordinate: ").append(toIndentedString(coordinate)).append("\n");
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
