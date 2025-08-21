package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResolveConflictFileDto
 */
public class ResolveConflictFileDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_path")

    private String oldPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_path")

    private String newPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sections")

    private Object sections;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    public ResolveConflictFileDto withOldPath(String oldPath) {
        this.oldPath = oldPath;
        return this;
    }

    /**
     * **参数解释：** 旧文件路径    
     * @return oldPath
     */
    public String getOldPath() {
        return oldPath;
    }

    public void setOldPath(String oldPath) {
        this.oldPath = oldPath;
    }

    public ResolveConflictFileDto withNewPath(String newPath) {
        this.newPath = newPath;
        return this;
    }

    /**
     * **参数解释：** 新文件路径    
     * @return newPath
     */
    public String getNewPath() {
        return newPath;
    }

    public void setNewPath(String newPath) {
        this.newPath = newPath;
    }

    public ResolveConflictFileDto withSections(Object sections) {
        this.sections = sections;
        return this;
    }

    /**
     * **参数解释：** 只有选择接受不同分支选项的时候才需要    
     * @return sections
     */
    public Object getSections() {
        return sections;
    }

    public void setSections(Object sections) {
        this.sections = sections;
    }

    public ResolveConflictFileDto withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * **参数解释：** 只有在线编辑冲突文件的时候才需要，内容即为文件内容    
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResolveConflictFileDto that = (ResolveConflictFileDto) obj;
        return Objects.equals(this.oldPath, that.oldPath) && Objects.equals(this.newPath, that.newPath)
            && Objects.equals(this.sections, that.sections) && Objects.equals(this.content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oldPath, newPath, sections, content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResolveConflictFileDto {\n");
        sb.append("    oldPath: ").append(toIndentedString(oldPath)).append("\n");
        sb.append("    newPath: ").append(toIndentedString(newPath)).append("\n");
        sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
