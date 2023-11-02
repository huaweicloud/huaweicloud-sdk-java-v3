package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateModelReq
 */
public class CreateModelReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private ModelType type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file")

    private ModelFile file;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shareable")

    private Boolean shareable;

    public CreateModelReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模型名称，取值范围：[5,32]，允许大小写字母、数字、下划线(_)、中划线(-)和空格,只能以字母开头
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateModelReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 模型描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateModelReq withType(ModelType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public ModelType getType() {
        return type;
    }

    public void setType(ModelType type) {
        this.type = type;
    }

    public CreateModelReq withFile(ModelFile file) {
        this.file = file;
        return this;
    }

    public CreateModelReq withFile(Consumer<ModelFile> fileSetter) {
        if (this.file == null) {
            this.file = new ModelFile();
            fileSetter.accept(this.file);
        }

        return this;
    }

    /**
     * Get file
     * @return file
     */
    public ModelFile getFile() {
        return file;
    }

    public void setFile(ModelFile file) {
        this.file = file;
    }

    public CreateModelReq withShareable(Boolean shareable) {
        this.shareable = shareable;
        return this;
    }

    /**
     * 是否打开组织共享
     * @return shareable
     */
    public Boolean getShareable() {
        return shareable;
    }

    public void setShareable(Boolean shareable) {
        this.shareable = shareable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateModelReq that = (CreateModelReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.type, that.type) && Objects.equals(this.file, that.file)
            && Objects.equals(this.shareable, that.shareable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, type, file, shareable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateModelReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    file: ").append(toIndentedString(file)).append("\n");
        sb.append("    shareable: ").append(toIndentedString(shareable)).append("\n");
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
