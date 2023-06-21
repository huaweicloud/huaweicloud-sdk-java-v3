package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CatalogLevelVOList
 */
public class CatalogLevelVOList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "levels")

    private List<CatalogLevelVO> levels = null;

    public CatalogLevelVOList withLevels(List<CatalogLevelVO> levels) {
        this.levels = levels;
        return this;
    }

    public CatalogLevelVOList addLevelsItem(CatalogLevelVO levelsItem) {
        if (this.levels == null) {
            this.levels = new ArrayList<>();
        }
        this.levels.add(levelsItem);
        return this;
    }

    public CatalogLevelVOList withLevels(Consumer<List<CatalogLevelVO>> levelsSetter) {
        if (this.levels == null) {
            this.levels = new ArrayList<>();
        }
        levelsSetter.accept(this.levels);
        return this;
    }

    /**
     * 主题层级信息
     * @return levels
     */
    public List<CatalogLevelVO> getLevels() {
        return levels;
    }

    public void setLevels(List<CatalogLevelVO> levels) {
        this.levels = levels;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CatalogLevelVOList catalogLevelVOList = (CatalogLevelVOList) o;
        return Objects.equals(this.levels, catalogLevelVOList.levels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(levels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogLevelVOList {\n");
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
