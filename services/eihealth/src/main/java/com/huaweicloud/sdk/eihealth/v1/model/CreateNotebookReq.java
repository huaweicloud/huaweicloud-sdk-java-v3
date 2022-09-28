package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建notebook请求体
 */
public class CreateNotebookReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storages")

    private List<NotebookStorage> storages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private FlavorInfo flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private NotebookImage image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public CreateNotebookReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息，取值范围[0,1024]
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateNotebookReq withStorages(List<NotebookStorage> storages) {
        this.storages = storages;
        return this;
    }

    public CreateNotebookReq addStoragesItem(NotebookStorage storagesItem) {
        if (this.storages == null) {
            this.storages = new ArrayList<>();
        }
        this.storages.add(storagesItem);
        return this;
    }

    public CreateNotebookReq withStorages(Consumer<List<NotebookStorage>> storagesSetter) {
        if (this.storages == null) {
            this.storages = new ArrayList<>();
        }
        storagesSetter.accept(this.storages);
        return this;
    }

    /**
     * 挂载信息
     * @return storages
     */
    public List<NotebookStorage> getStorages() {
        return storages;
    }

    public void setStorages(List<NotebookStorage> storages) {
        this.storages = storages;
    }

    public CreateNotebookReq withFlavor(FlavorInfo flavor) {
        this.flavor = flavor;
        return this;
    }

    public CreateNotebookReq withFlavor(Consumer<FlavorInfo> flavorSetter) {
        if (this.flavor == null) {
            this.flavor = new FlavorInfo();
            flavorSetter.accept(this.flavor);
        }

        return this;
    }

    /**
     * Get flavor
     * @return flavor
     */
    public FlavorInfo getFlavor() {
        return flavor;
    }

    public void setFlavor(FlavorInfo flavor) {
        this.flavor = flavor;
    }

    public CreateNotebookReq withImage(NotebookImage image) {
        this.image = image;
        return this;
    }

    public CreateNotebookReq withImage(Consumer<NotebookImage> imageSetter) {
        if (this.image == null) {
            this.image = new NotebookImage();
            imageSetter.accept(this.image);
        }

        return this;
    }

    /**
     * Get image
     * @return image
     */
    public NotebookImage getImage() {
        return image;
    }

    public void setImage(NotebookImage image) {
        this.image = image;
    }

    public CreateNotebookReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * notebook名称，取值范围[1,63],仅支持小写字母、数字、中划线(-),开始只能是小写字母，结束只能是小写字母或数字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateNotebookReq createNotebookReq = (CreateNotebookReq) o;
        return Objects.equals(this.description, createNotebookReq.description)
            && Objects.equals(this.storages, createNotebookReq.storages)
            && Objects.equals(this.flavor, createNotebookReq.flavor)
            && Objects.equals(this.image, createNotebookReq.image) && Objects.equals(this.name, createNotebookReq.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, storages, flavor, image, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNotebookReq {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    storages: ").append(toIndentedString(storages)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
