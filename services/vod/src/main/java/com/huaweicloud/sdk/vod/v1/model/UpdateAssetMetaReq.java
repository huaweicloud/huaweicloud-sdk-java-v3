package com.huaweicloud.sdk.vod.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="folder_name")
    
    private String folderName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="custom_metadata")
    
    private Map<String, Object> customMetadata = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="privilege")
    
    private String privilege;

    public UpdateAssetMetaReq withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    


    /**
     * 媒体ID<br/> 
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
     * 媒体标题<br/> 
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
     * 视频描述<br/> 
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
     * 媒资分类id<br/> 
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
     * 视频标签<br/> 
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    

    public UpdateAssetMetaReq withFolderName(String folderName) {
        this.folderName = folderName;
        return this;
    }

    


    /**
     * 媒资所在文件夹id
     * @return folderName
     */
    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    

    public UpdateAssetMetaReq withCustomMetadata(Map<String, Object> customMetadata) {
        this.customMetadata = customMetadata;
        return this;
    }

    

    public UpdateAssetMetaReq putCustomMetadataItem(String key, Object customMetadataItem) {
        if(this.customMetadata == null) {
            this.customMetadata = new HashMap<>();
        }
        this.customMetadata.put(key, customMetadataItem);
        return this;
    }

    public UpdateAssetMetaReq withCustomMetadata(Consumer<Map<String, Object>> customMetadataSetter) {
        if(this.customMetadata == null) {
            this.customMetadata = new HashMap<>();
        }
        customMetadataSetter.accept(this.customMetadata);
        return this;
    }
    /**
     * 自定义元数据<br/> 
     * @return customMetadata
     */
    public Map<String, Object> getCustomMetadata() {
        return customMetadata;
    }

    public void setCustomMetadata(Map<String, Object> customMetadata) {
        this.customMetadata = customMetadata;
    }

    

    public UpdateAssetMetaReq withPrivilege(String privilege) {
        this.privilege = privilege;
        return this;
    }

    


    /**
     * 权限<br/> 
     * @return privilege
     */
    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
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
            Objects.equals(this.tags, updateAssetMetaReq.tags) &&
            Objects.equals(this.folderName, updateAssetMetaReq.folderName) &&
            Objects.equals(this.customMetadata, updateAssetMetaReq.customMetadata) &&
            Objects.equals(this.privilege, updateAssetMetaReq.privilege);
    }
    @Override
    public int hashCode() {
        return Objects.hash(assetId, title, description, categoryId, tags, folderName, customMetadata, privilege);
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
        sb.append("    folderName: ").append(toIndentedString(folderName)).append("\n");
        sb.append("    customMetadata: ").append(toIndentedString(customMetadata)).append("\n");
        sb.append("    privilege: ").append(toIndentedString(privilege)).append("\n");
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

