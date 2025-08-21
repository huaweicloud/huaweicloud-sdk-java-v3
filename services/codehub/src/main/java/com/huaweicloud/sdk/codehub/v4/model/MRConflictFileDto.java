package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 冲突文件详情
 */
public class MRConflictFileDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_path")

    private String oldPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_path")

    private String newPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blob_icon")

    private String blobIcon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blob_path")

    private String blobPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conflict_type")

    private String conflictType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_path")

    private String contentPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sections")

    private List<ConflictSectionDto> sections = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    public MRConflictFileDto withOldPath(String oldPath) {
        this.oldPath = oldPath;
        return this;
    }

    /**
     * **参数解释：** 旧文件名称。
     * @return oldPath
     */
    public String getOldPath() {
        return oldPath;
    }

    public void setOldPath(String oldPath) {
        this.oldPath = oldPath;
    }

    public MRConflictFileDto withNewPath(String newPath) {
        this.newPath = newPath;
        return this;
    }

    /**
     * **参数解释：** 新文件名称。
     * @return newPath
     */
    public String getNewPath() {
        return newPath;
    }

    public void setNewPath(String newPath) {
        this.newPath = newPath;
    }

    public MRConflictFileDto withBlobIcon(String blobIcon) {
        this.blobIcon = blobIcon;
        return this;
    }

    /**
     * blob_icon
     * @return blobIcon
     */
    public String getBlobIcon() {
        return blobIcon;
    }

    public void setBlobIcon(String blobIcon) {
        this.blobIcon = blobIcon;
    }

    public MRConflictFileDto withBlobPath(String blobPath) {
        this.blobPath = blobPath;
        return this;
    }

    /**
     * blob 路径
     * @return blobPath
     */
    public String getBlobPath() {
        return blobPath;
    }

    public void setBlobPath(String blobPath) {
        this.blobPath = blobPath;
    }

    public MRConflictFileDto withConflictType(String conflictType) {
        this.conflictType = conflictType;
        return this;
    }

    /**
     * 冲突类型
     * @return conflictType
     */
    public String getConflictType() {
        return conflictType;
    }

    public void setConflictType(String conflictType) {
        this.conflictType = conflictType;
    }

    public MRConflictFileDto withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MRConflictFileDto withContentPath(String contentPath) {
        this.contentPath = contentPath;
        return this;
    }

    /**
     * 内容路径
     * @return contentPath
     */
    public String getContentPath() {
        return contentPath;
    }

    public void setContentPath(String contentPath) {
        this.contentPath = contentPath;
    }

    public MRConflictFileDto withSections(List<ConflictSectionDto> sections) {
        this.sections = sections;
        return this;
    }

    public MRConflictFileDto addSectionsItem(ConflictSectionDto sectionsItem) {
        if (this.sections == null) {
            this.sections = new ArrayList<>();
        }
        this.sections.add(sectionsItem);
        return this;
    }

    public MRConflictFileDto withSections(Consumer<List<ConflictSectionDto>> sectionsSetter) {
        if (this.sections == null) {
            this.sections = new ArrayList<>();
        }
        sectionsSetter.accept(this.sections);
        return this;
    }

    /**
     * 片段
     * @return sections
     */
    public List<ConflictSectionDto> getSections() {
        return sections;
    }

    public void setSections(List<ConflictSectionDto> sections) {
        this.sections = sections;
    }

    public MRConflictFileDto withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MRConflictFileDto withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 错误信息
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MRConflictFileDto that = (MRConflictFileDto) obj;
        return Objects.equals(this.oldPath, that.oldPath) && Objects.equals(this.newPath, that.newPath)
            && Objects.equals(this.blobIcon, that.blobIcon) && Objects.equals(this.blobPath, that.blobPath)
            && Objects.equals(this.conflictType, that.conflictType) && Objects.equals(this.content, that.content)
            && Objects.equals(this.contentPath, that.contentPath) && Objects.equals(this.sections, that.sections)
            && Objects.equals(this.type, that.type) && Objects.equals(this.errorMessage, that.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oldPath,
            newPath,
            blobIcon,
            blobPath,
            conflictType,
            content,
            contentPath,
            sections,
            type,
            errorMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MRConflictFileDto {\n");
        sb.append("    oldPath: ").append(toIndentedString(oldPath)).append("\n");
        sb.append("    newPath: ").append(toIndentedString(newPath)).append("\n");
        sb.append("    blobIcon: ").append(toIndentedString(blobIcon)).append("\n");
        sb.append("    blobPath: ").append(toIndentedString(blobPath)).append("\n");
        sb.append("    conflictType: ").append(toIndentedString(conflictType)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    contentPath: ").append(toIndentedString(contentPath)).append("\n");
        sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
