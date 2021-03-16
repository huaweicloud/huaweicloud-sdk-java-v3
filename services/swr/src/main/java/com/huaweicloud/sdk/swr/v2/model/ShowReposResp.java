package com.huaweicloud.sdk.swr.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ShowReposResp
 */
public class ShowReposResp  {



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
    
    private Long numDownload;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private String createdAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_at")
    
    private String updatedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="logo")
    
    private String logo;


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
    @JsonProperty(value="domain_name")
    
    private String domainName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    
    private String namespace;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<String> tags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Boolean status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_range")
    
    private Long totalRange;

    public ShowReposResp withName(String name) {
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

    

    public ShowReposResp withCategory(String category) {
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

    

    public ShowReposResp withDescription(String description) {
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

    

    public ShowReposResp withSize(Long size) {
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

    

    public ShowReposResp withIsPublic(Boolean isPublic) {
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

    

    public ShowReposResp withNumImages(Long numImages) {
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

    

    public ShowReposResp withNumDownload(Long numDownload) {
        this.numDownload = numDownload;
        return this;
    }

    


    /**
     * 仓库下载次数
     * @return numDownload
     */
    public Long getNumDownload() {
        return numDownload;
    }

    public void setNumDownload(Long numDownload) {
        this.numDownload = numDownload;
    }

    

    public ShowReposResp withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * 仓库创建时间，UTC日期格式，时间为UTC标准时间，用户需要根据本地时间计算偏移量；如东8区需要+8:00
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    

    public ShowReposResp withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    


    /**
     * 仓库更新时间，UTC日期格式，时间为UTC标准时间，用户需要根据本地时间计算偏移量；如东8区需要+8:00
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    

    public ShowReposResp withLogo(String logo) {
        this.logo = logo;
        return this;
    }

    


    /**
     * 仓库logo地址（暂时未用）
     * @return logo
     */
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    

    public ShowReposResp withUrl(String url) {
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

    

    public ShowReposResp withPath(String path) {
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

    

    public ShowReposResp withInternalPath(String internalPath) {
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

    

    public ShowReposResp withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    


    /**
     * 租户名
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    

    public ShowReposResp withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    


    /**
     * 租户的命名空间名称
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    

    public ShowReposResp withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    
    public ShowReposResp addTagsItem(String tagsItem) {
        this.tags.add(tagsItem);
        return this;
    }

    public ShowReposResp withTags(Consumer<List<String>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 镜像版本列表
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    

    public ShowReposResp withStatus(Boolean status) {
        this.status = status;
        return this;
    }

    


    /**
     * 查询他人共享镜像：共享是否过期 查询我共享的镜像：默认为false,无意义
     * @return status
     */
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    

    public ShowReposResp withTotalRange(Long totalRange) {
        this.totalRange = totalRange;
        return this;
    }

    


    /**
     * 
     * @return totalRange
     */
    public Long getTotalRange() {
        return totalRange;
    }

    public void setTotalRange(Long totalRange) {
        this.totalRange = totalRange;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowReposResp showReposResp = (ShowReposResp) o;
        return Objects.equals(this.name, showReposResp.name) &&
            Objects.equals(this.category, showReposResp.category) &&
            Objects.equals(this.description, showReposResp.description) &&
            Objects.equals(this.size, showReposResp.size) &&
            Objects.equals(this.isPublic, showReposResp.isPublic) &&
            Objects.equals(this.numImages, showReposResp.numImages) &&
            Objects.equals(this.numDownload, showReposResp.numDownload) &&
            Objects.equals(this.createdAt, showReposResp.createdAt) &&
            Objects.equals(this.updatedAt, showReposResp.updatedAt) &&
            Objects.equals(this.logo, showReposResp.logo) &&
            Objects.equals(this.url, showReposResp.url) &&
            Objects.equals(this.path, showReposResp.path) &&
            Objects.equals(this.internalPath, showReposResp.internalPath) &&
            Objects.equals(this.domainName, showReposResp.domainName) &&
            Objects.equals(this.namespace, showReposResp.namespace) &&
            Objects.equals(this.tags, showReposResp.tags) &&
            Objects.equals(this.status, showReposResp.status) &&
            Objects.equals(this.totalRange, showReposResp.totalRange);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, category, description, size, isPublic, numImages, numDownload, createdAt, updatedAt, logo, url, path, internalPath, domainName, namespace, tags, status, totalRange);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowReposResp {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
        sb.append("    numImages: ").append(toIndentedString(numImages)).append("\n");
        sb.append("    numDownload: ").append(toIndentedString(numDownload)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    internalPath: ").append(toIndentedString(internalPath)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    totalRange: ").append(toIndentedString(totalRange)).append("\n");
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

