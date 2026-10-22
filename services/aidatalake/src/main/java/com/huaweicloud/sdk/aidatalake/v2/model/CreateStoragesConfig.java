package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：存储资源配置（创建时）。
 */
public class CreateStoragesConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files")

    private List<CreateFileStorageConfig> files = null;

    public CreateStoragesConfig withFiles(List<CreateFileStorageConfig> files) {
        this.files = files;
        return this;
    }

    public CreateStoragesConfig addFilesItem(CreateFileStorageConfig filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    public CreateStoragesConfig withFiles(Consumer<List<CreateFileStorageConfig>> filesSetter) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        filesSetter.accept(this.files);
        return this;
    }

    /**
     * **参数解释**：文件存储配置。 **约束限制**：最多10个文件存储配置。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return files
     */
    public List<CreateFileStorageConfig> getFiles() {
        return files;
    }

    public void setFiles(List<CreateFileStorageConfig> files) {
        this.files = files;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateStoragesConfig that = (CreateStoragesConfig) obj;
        return Objects.equals(this.files, that.files);
    }

    @Override
    public int hashCode() {
        return Objects.hash(files);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateStoragesConfig {\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
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
