package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DataLayerVOList
 */
public class DataLayerVOList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "levels")

    private List<DataLayerVO> levels = null;

    public DataLayerVOList withLevels(List<DataLayerVO> levels) {
        this.levels = levels;
        return this;
    }

    public DataLayerVOList addLevelsItem(DataLayerVO levelsItem) {
        if (this.levels == null) {
            this.levels = new ArrayList<>();
        }
        this.levels.add(levelsItem);
        return this;
    }

    public DataLayerVOList withLevels(Consumer<List<DataLayerVO>> levelsSetter) {
        if (this.levels == null) {
            this.levels = new ArrayList<>();
        }
        levelsSetter.accept(this.levels);
        return this;
    }

    /**
     * 数仓分层数组。
     * @return levels
     */
    public List<DataLayerVO> getLevels() {
        return levels;
    }

    public void setLevels(List<DataLayerVO> levels) {
        this.levels = levels;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataLayerVOList that = (DataLayerVOList) obj;
        return Objects.equals(this.levels, that.levels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(levels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataLayerVOList {\n");
        sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
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
