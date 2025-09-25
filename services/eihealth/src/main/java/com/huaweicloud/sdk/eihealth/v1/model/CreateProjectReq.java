package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建项目请求体
 */
public class CreateProjectReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_core")

    private Boolean isCore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_new_bucket")

    private Boolean isNewBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_tenant")

    private String storageTenant;

    public CreateProjectReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 项目描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateProjectReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 项目名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateProjectReq withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public CreateProjectReq addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateProjectReq withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public CreateProjectReq withIsCore(Boolean isCore) {
        this.isCore = isCore;
        return this;
    }

    /**
     * 是否核心项目
     * @return isCore
     */
    public Boolean getIsCore() {
        return isCore;
    }

    public void setIsCore(Boolean isCore) {
        this.isCore = isCore;
    }

    public CreateProjectReq withIsNewBucket(Boolean isNewBucket) {
        this.isNewBucket = isNewBucket;
        return this;
    }

    /**
     * 是否新桶, 仅气象支持该字段
     * @return isNewBucket
     */
    public Boolean getIsNewBucket() {
        return isNewBucket;
    }

    public void setIsNewBucket(Boolean isNewBucket) {
        this.isNewBucket = isNewBucket;
    }

    public CreateProjectReq withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * 桶名, 仅气象支持该字段
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public CreateProjectReq withStorageTenant(String storageTenant) {
        this.storageTenant = storageTenant;
        return this;
    }

    /**
     * **参数解释**： 空间桶来源租户，TERMINATE表示最终租户桶。 **约束限制**： 不涉及 **取值范围**： * TERMINATE： 最终租户桶。 * RESOURCE： 资源租户桶。 **默认取值**： TERMINATE 
     * @return storageTenant
     */
    public String getStorageTenant() {
        return storageTenant;
    }

    public void setStorageTenant(String storageTenant) {
        this.storageTenant = storageTenant;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateProjectReq that = (CreateProjectReq) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.name, that.name)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.isCore, that.isCore)
            && Objects.equals(this.isNewBucket, that.isNewBucket) && Objects.equals(this.bucketName, that.bucketName)
            && Objects.equals(this.storageTenant, that.storageTenant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, name, tags, isCore, isNewBucket, bucketName, storageTenant);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateProjectReq {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    isCore: ").append(toIndentedString(isCore)).append("\n");
        sb.append("    isNewBucket: ").append(toIndentedString(isNewBucket)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    storageTenant: ").append(toIndentedString(storageTenant)).append("\n");
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
