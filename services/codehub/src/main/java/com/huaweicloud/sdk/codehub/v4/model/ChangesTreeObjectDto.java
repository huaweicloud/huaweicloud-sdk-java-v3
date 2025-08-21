package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ChangesTreeObjectDto
 */
public class ChangesTreeObjectDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private String fileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diff")

    private ChangesTreeObjectDiffDto diff;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<ChangesTreeObjectDto> items = null;

    public ChangesTreeObjectDto withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * **参数解释：** 变更文件名。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ChangesTreeObjectDto withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * **参数解释：** 文件层级。
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public ChangesTreeObjectDto withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * **参数解释：** 文件路径。
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public ChangesTreeObjectDto withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * **参数解释：** 文件类型。
     * @return fileType
     */
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public ChangesTreeObjectDto withDiff(ChangesTreeObjectDiffDto diff) {
        this.diff = diff;
        return this;
    }

    public ChangesTreeObjectDto withDiff(Consumer<ChangesTreeObjectDiffDto> diffSetter) {
        if (this.diff == null) {
            this.diff = new ChangesTreeObjectDiffDto();
            diffSetter.accept(this.diff);
        }

        return this;
    }

    /**
     * Get diff
     * @return diff
     */
    public ChangesTreeObjectDiffDto getDiff() {
        return diff;
    }

    public void setDiff(ChangesTreeObjectDiffDto diff) {
        this.diff = diff;
    }

    public ChangesTreeObjectDto withItems(List<ChangesTreeObjectDto> items) {
        this.items = items;
        return this;
    }

    public ChangesTreeObjectDto addItemsItem(ChangesTreeObjectDto itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ChangesTreeObjectDto withItems(Consumer<List<ChangesTreeObjectDto>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * **参数解释：** 子文件变更。
     * @return items
     */
    public List<ChangesTreeObjectDto> getItems() {
        return items;
    }

    public void setItems(List<ChangesTreeObjectDto> items) {
        this.items = items;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangesTreeObjectDto that = (ChangesTreeObjectDto) obj;
        return Objects.equals(this.title, that.title) && Objects.equals(this.level, that.level)
            && Objects.equals(this.filePath, that.filePath) && Objects.equals(this.fileType, that.fileType)
            && Objects.equals(this.diff, that.diff) && Objects.equals(this.items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, level, filePath, fileType, diff, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangesTreeObjectDto {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    diff: ").append(toIndentedString(diff)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
