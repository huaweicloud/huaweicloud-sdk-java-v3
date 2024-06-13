package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 服务开通请求
 */
public class CreateProductRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cover")

    private ProductCoverInfo cover;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_list")

    private List<ProductTextInfo> textList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_list")

    private List<ProductMediaInfo> assetList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_active")

    private Boolean autoActive;

    public CreateProductRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 商品名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateProductRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 商品描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateProductRequestBody withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public CreateProductRequestBody addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateProductRequestBody withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签。单个标签16字节，多个用逗号分隔，最多50个。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public CreateProductRequestBody withCover(ProductCoverInfo cover) {
        this.cover = cover;
        return this;
    }

    public CreateProductRequestBody withCover(Consumer<ProductCoverInfo> coverSetter) {
        if (this.cover == null) {
            this.cover = new ProductCoverInfo();
            coverSetter.accept(this.cover);
        }

        return this;
    }

    /**
     * Get cover
     * @return cover
     */
    public ProductCoverInfo getCover() {
        return cover;
    }

    public void setCover(ProductCoverInfo cover) {
        this.cover = cover;
    }

    public CreateProductRequestBody withTextList(List<ProductTextInfo> textList) {
        this.textList = textList;
        return this;
    }

    public CreateProductRequestBody addTextListItem(ProductTextInfo textListItem) {
        if (this.textList == null) {
            this.textList = new ArrayList<>();
        }
        this.textList.add(textListItem);
        return this;
    }

    public CreateProductRequestBody withTextList(Consumer<List<ProductTextInfo>> textListSetter) {
        if (this.textList == null) {
            this.textList = new ArrayList<>();
        }
        textListSetter.accept(this.textList);
        return this;
    }

    /**
     * 文本列表
     * @return textList
     */
    public List<ProductTextInfo> getTextList() {
        return textList;
    }

    public void setTextList(List<ProductTextInfo> textList) {
        this.textList = textList;
    }

    public CreateProductRequestBody withAssetList(List<ProductMediaInfo> assetList) {
        this.assetList = assetList;
        return this;
    }

    public CreateProductRequestBody addAssetListItem(ProductMediaInfo assetListItem) {
        if (this.assetList == null) {
            this.assetList = new ArrayList<>();
        }
        this.assetList.add(assetListItem);
        return this;
    }

    public CreateProductRequestBody withAssetList(Consumer<List<ProductMediaInfo>> assetListSetter) {
        if (this.assetList == null) {
            this.assetList = new ArrayList<>();
        }
        assetListSetter.accept(this.assetList);
        return this;
    }

    /**
     * 素材资产列表
     * @return assetList
     */
    public List<ProductMediaInfo> getAssetList() {
        return assetList;
    }

    public void setAssetList(List<ProductMediaInfo> assetList) {
        this.assetList = assetList;
    }

    public CreateProductRequestBody withAutoActive(Boolean autoActive) {
        this.autoActive = autoActive;
        return this;
    }

    /**
     * 自动激活商品
     * @return autoActive
     */
    public Boolean getAutoActive() {
        return autoActive;
    }

    public void setAutoActive(Boolean autoActive) {
        this.autoActive = autoActive;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateProductRequestBody that = (CreateProductRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.cover, that.cover)
            && Objects.equals(this.textList, that.textList) && Objects.equals(this.assetList, that.assetList)
            && Objects.equals(this.autoActive, that.autoActive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, tags, cover, textList, assetList, autoActive);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateProductRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    cover: ").append(toIndentedString(cover)).append("\n");
        sb.append("    textList: ").append(toIndentedString(textList)).append("\n");
        sb.append("    assetList: ").append(toIndentedString(assetList)).append("\n");
        sb.append("    autoActive: ").append(toIndentedString(autoActive)).append("\n");
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
