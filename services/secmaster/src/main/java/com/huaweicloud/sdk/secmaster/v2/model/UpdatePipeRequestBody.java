package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdatePipeRequestBody
 */
public class UpdatePipeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipe_alias")

    private String pipeAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory")

    private String directory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private PipeCategory category;

    public UpdatePipeRequestBody withPipeAlias(String pipeAlias) {
        this.pipeAlias = pipeAlias;
        return this;
    }

    /**
     * 管道别名
     * @return pipeAlias
     */
    public String getPipeAlias() {
        return pipeAlias;
    }

    public void setPipeAlias(String pipeAlias) {
        this.pipeAlias = pipeAlias;
    }

    public UpdatePipeRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 管道描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdatePipeRequestBody withDirectory(String directory) {
        this.directory = directory;
        return this;
    }

    /**
     * directory 目录分组
     * @return directory
     */
    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public UpdatePipeRequestBody withCategory(PipeCategory category) {
        this.category = category;
        return this;
    }

    /**
     * Get category
     * @return category
     */
    public PipeCategory getCategory() {
        return category;
    }

    public void setCategory(PipeCategory category) {
        this.category = category;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePipeRequestBody that = (UpdatePipeRequestBody) obj;
        return Objects.equals(this.pipeAlias, that.pipeAlias) && Objects.equals(this.description, that.description)
            && Objects.equals(this.directory, that.directory) && Objects.equals(this.category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pipeAlias, description, directory, category);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePipeRequestBody {\n");
        sb.append("    pipeAlias: ").append(toIndentedString(pipeAlias)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
