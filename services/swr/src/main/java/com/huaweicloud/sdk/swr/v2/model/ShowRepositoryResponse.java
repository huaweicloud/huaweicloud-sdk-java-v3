package com.huaweicloud.sdk.swr.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowRepositoryResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private Long id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ns_id")
    
    private Long nsId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="category")
    
    private String category;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="creator_id")
    
    private String creatorId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="creator_name")
    
    private String creatorName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Long size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_public")
    
    private Boolean isPublic;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="num_images")
    
    private Long numImages;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="num_download")
    
    private Integer numDownload;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path")
    
    private String path;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="internal_path")
    
    private String internalPath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created")
    
    private String created;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated")
    
    private String updated;

    public ShowRepositoryResponse withId(Long id) {
        this.id = id;
        return this;
    }

    


    /**
     * 仓库编号
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShowRepositoryResponse withNsId(Long nsId) {
        this.nsId = nsId;
        return this;
    }

    


    /**
     * 命名空间编号
     * @return nsId
     */
    public Long getNsId() {
        return nsId;
    }

    public void setNsId(Long nsId) {
        this.nsId = nsId;
    }

    public ShowRepositoryResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 仓库名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowRepositoryResponse withCategory(String category) {
        this.category = category;
        return this;
    }

    


    /**
     * 仓库类型（计划改造，每个镜像会有多个lable标示）
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ShowRepositoryResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 仓库描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowRepositoryResponse withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    


    /**
     * 仓库创建者id
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public ShowRepositoryResponse withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    


    /**
     * 仓库创建者
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public ShowRepositoryResponse withSize(Long size) {
        this.size = size;
        return this;
    }

    


    /**
     * 仓库大小 
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public ShowRepositoryResponse withIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }

    


    /**
     * 仓库是否为公共仓库，值为true或false
     * @return isPublic
     */
    public Boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public ShowRepositoryResponse withNumImages(Long numImages) {
        this.numImages = numImages;
        return this;
    }

    


    /**
     * 仓库中镜像个数，0 ~ 9223372036854775807
     * @return numImages
     */
    public Long getNumImages() {
        return numImages;
    }

    public void setNumImages(Long numImages) {
        this.numImages = numImages;
    }

    public ShowRepositoryResponse withNumDownload(Integer numDownload) {
        this.numDownload = numDownload;
        return this;
    }

    


    /**
     * 仓库下载次数
     * @return numDownload
     */
    public Integer getNumDownload() {
        return numDownload;
    }

    public void setNumDownload(Integer numDownload) {
        this.numDownload = numDownload;
    }

    public ShowRepositoryResponse withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * 仓库logo图片的URL，URL格式。（暂时未用）
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ShowRepositoryResponse withPath(String path) {
        this.path = path;
        return this;
    }

    


    /**
     * 镜像pull路径，格式为 swr.cn-north-1.myhuaweicloud.com/namespace/repository
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ShowRepositoryResponse withInternalPath(String internalPath) {
        this.internalPath = internalPath;
        return this;
    }

    


    /**
     * 镜像pull路径，格式为 10.125.0.198:20202/namespace/repository
     * @return internalPath
     */
    public String getInternalPath() {
        return internalPath;
    }

    public void setInternalPath(String internalPath) {
        this.internalPath = internalPath;
    }

    public ShowRepositoryResponse withCreated(String created) {
        this.created = created;
        return this;
    }

    


    /**
     * 仓库创建时间，UTC日期格式，时间为UTC标准时间，用户需要根据本地时间计算偏移量；如东8区需要+8:00
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ShowRepositoryResponse withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    


    /**
     * 仓库更新时间，UTC日期格式，时间为UTC标准时间，用户需要根据本地时间计算偏移量；如东8区需要+8:00
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowRepositoryResponse showRepositoryResponse = (ShowRepositoryResponse) o;
        return Objects.equals(this.id, showRepositoryResponse.id) &&
            Objects.equals(this.nsId, showRepositoryResponse.nsId) &&
            Objects.equals(this.name, showRepositoryResponse.name) &&
            Objects.equals(this.category, showRepositoryResponse.category) &&
            Objects.equals(this.description, showRepositoryResponse.description) &&
            Objects.equals(this.creatorId, showRepositoryResponse.creatorId) &&
            Objects.equals(this.creatorName, showRepositoryResponse.creatorName) &&
            Objects.equals(this.size, showRepositoryResponse.size) &&
            Objects.equals(this.isPublic, showRepositoryResponse.isPublic) &&
            Objects.equals(this.numImages, showRepositoryResponse.numImages) &&
            Objects.equals(this.numDownload, showRepositoryResponse.numDownload) &&
            Objects.equals(this.url, showRepositoryResponse.url) &&
            Objects.equals(this.path, showRepositoryResponse.path) &&
            Objects.equals(this.internalPath, showRepositoryResponse.internalPath) &&
            Objects.equals(this.created, showRepositoryResponse.created) &&
            Objects.equals(this.updated, showRepositoryResponse.updated);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, nsId, name, category, description, creatorId, creatorName, size, isPublic, numImages, numDownload, url, path, internalPath, created, updated);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRepositoryResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nsId: ").append(toIndentedString(nsId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
        sb.append("    numImages: ").append(toIndentedString(numImages)).append("\n");
        sb.append("    numDownload: ").append(toIndentedString(numDownload)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    internalPath: ").append(toIndentedString(internalPath)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

