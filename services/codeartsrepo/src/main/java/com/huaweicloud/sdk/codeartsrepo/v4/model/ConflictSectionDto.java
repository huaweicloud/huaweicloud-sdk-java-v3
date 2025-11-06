package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConflictSectionDto
 */
public class ConflictSectionDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conflict")

    private Boolean conflict;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lines")

    private List<ConflictSectionLineDto> lines = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public ConflictSectionDto withConflict(Boolean conflict) {
        this.conflict = conflict;
        return this;
    }

    /**
     * 是否冲突
     * @return conflict
     */
    public Boolean getConflict() {
        return conflict;
    }

    public void setConflict(Boolean conflict) {
        this.conflict = conflict;
    }

    public ConflictSectionDto withLines(List<ConflictSectionLineDto> lines) {
        this.lines = lines;
        return this;
    }

    public ConflictSectionDto addLinesItem(ConflictSectionLineDto linesItem) {
        if (this.lines == null) {
            this.lines = new ArrayList<>();
        }
        this.lines.add(linesItem);
        return this;
    }

    public ConflictSectionDto withLines(Consumer<List<ConflictSectionLineDto>> linesSetter) {
        if (this.lines == null) {
            this.lines = new ArrayList<>();
        }
        linesSetter.accept(this.lines);
        return this;
    }

    /**
     * 冲突行列表
     * @return lines
     */
    public List<ConflictSectionLineDto> getLines() {
        return lines;
    }

    public void setLines(List<ConflictSectionLineDto> lines) {
        this.lines = lines;
    }

    public ConflictSectionDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConflictSectionDto that = (ConflictSectionDto) obj;
        return Objects.equals(this.conflict, that.conflict) && Objects.equals(this.lines, that.lines)
            && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conflict, lines, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConflictSectionDto {\n");
        sb.append("    conflict: ").append(toIndentedString(conflict)).append("\n");
        sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
