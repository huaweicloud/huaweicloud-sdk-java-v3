package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * StyleExtraMetaAdditionalProperties1
 */
public class StyleExtraMetaAdditionalProperties1 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_component")

    private String matchComponent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files")

    private List<String> files = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classified_tags")

    private Map<String, List<String>> classifiedTags = null;

    public StyleExtraMetaAdditionalProperties1 withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 算法类型枚举，\"CREATE\"还是\"CLASSIFY\"
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public StyleExtraMetaAdditionalProperties1 withMatchComponent(String matchComponent) {
        this.matchComponent = matchComponent;
        return this;
    }

    /**
     * 算法输出所匹配的组件名
     * @return matchComponent
     */
    public String getMatchComponent() {
        return matchComponent;
    }

    public void setMatchComponent(String matchComponent) {
        this.matchComponent = matchComponent;
    }

    public StyleExtraMetaAdditionalProperties1 withFiles(List<String> files) {
        this.files = files;
        return this;
    }

    public StyleExtraMetaAdditionalProperties1 addFilesItem(String filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    public StyleExtraMetaAdditionalProperties1 withFiles(Consumer<List<String>> filesSetter) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        filesSetter.accept(this.files);
        return this;
    }

    /**
     * 算法输出的文件名列表
     * @return files
     */
    public List<String> getFiles() {
        return files;
    }

    public void setFiles(List<String> files) {
        this.files = files;
    }

    public StyleExtraMetaAdditionalProperties1 withClassifiedTags(Map<String, List<String>> classifiedTags) {
        this.classifiedTags = classifiedTags;
        return this;
    }

    public StyleExtraMetaAdditionalProperties1 putClassifiedTagsItem(String key, List<String> classifiedTagsItem) {
        if (this.classifiedTags == null) {
            this.classifiedTags = new HashMap<>();
        }
        this.classifiedTags.put(key, classifiedTagsItem);
        return this;
    }

    public StyleExtraMetaAdditionalProperties1 withClassifiedTags(
        Consumer<Map<String, List<String>>> classifiedTagsSetter) {
        if (this.classifiedTags == null) {
            this.classifiedTags = new HashMap<>();
        }
        classifiedTagsSetter.accept(this.classifiedTags);
        return this;
    }

    /**
     * 分类算法的标签列表
     * @return classifiedTags
     */
    public Map<String, List<String>> getClassifiedTags() {
        return classifiedTags;
    }

    public void setClassifiedTags(Map<String, List<String>> classifiedTags) {
        this.classifiedTags = classifiedTags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StyleExtraMetaAdditionalProperties1 that = (StyleExtraMetaAdditionalProperties1) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.matchComponent, that.matchComponent)
            && Objects.equals(this.files, that.files) && Objects.equals(this.classifiedTags, that.classifiedTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, matchComponent, files, classifiedTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StyleExtraMetaAdditionalProperties1 {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    matchComponent: ").append(toIndentedString(matchComponent)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
        sb.append("    classifiedTags: ").append(toIndentedString(classifiedTags)).append("\n");
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
