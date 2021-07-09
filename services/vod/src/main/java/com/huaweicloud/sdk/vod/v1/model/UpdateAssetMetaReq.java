package com.huaweicloud.sdk.vod.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UpdateAssetMetaReq
 */
public class UpdateAssetMetaReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="asset_id")
    
    private String assetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="title")
    
    private String title;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="category_id")
    
    private Integer categoryId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private String tags;

    public UpdateAssetMetaReq withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    


    /**
     * 媒资ID。
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    

    public UpdateAssetMetaReq withTitle(String title) {
        this.title = title;
        return this;
    }

    


    /**
     * 媒资标题，长度不超过128个字节，UTF-8编码。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    

    public UpdateAssetMetaReq withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 媒资描述，长度不超过1024个字节。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public UpdateAssetMetaReq withCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    


    /**
     * 媒资分类id。
     * @return categoryId
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    

    public UpdateAssetMetaReq withTags(String tags) {
        this.tags = tags;
        return this;
    }

    


    /**
     * 媒资标签。  单个标签不超过16个字节，最多不超过16个标签。  多个用逗号分隔，UTF-8编码。
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAssetMetaReq updateAssetMetaReq = (UpdateAssetMetaReq) o;
        return Objects.equals(this.assetId, updateAssetMetaReq.assetId) &&
            Objects.equals(this.title, updateAssetMetaReq.title) &&
            Objects.equals(this.description, updateAssetMetaReq.description) &&
            Objects.equals(this.categoryId, updateAssetMetaReq.categoryId) &&
            Objects.equals(this.tags, updateAssetMetaReq.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(assetId, title, description, categoryId, tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAssetMetaReq {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

