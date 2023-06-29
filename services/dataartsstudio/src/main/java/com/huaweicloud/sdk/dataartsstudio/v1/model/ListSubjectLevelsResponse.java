package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ListSubjectLevelsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "levels")

    private List<CatalogLevelVO> levels = null;

    public ListSubjectLevelsResponse withLevels(List<CatalogLevelVO> levels) {
        this.levels = levels;
        return this;
    }

    public ListSubjectLevelsResponse addLevelsItem(CatalogLevelVO levelsItem) {
        if (this.levels == null) {
            this.levels = new ArrayList<>();
        }
        this.levels.add(levelsItem);
        return this;
    }

    public ListSubjectLevelsResponse withLevels(Consumer<List<CatalogLevelVO>> levelsSetter) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSubjectLevelsResponse that = (ListSubjectLevelsResponse) obj;
        return Objects.equals(this.levels, that.levels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(levels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubjectLevelsResponse {\n");
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
