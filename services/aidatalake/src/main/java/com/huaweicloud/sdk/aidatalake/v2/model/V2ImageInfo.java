package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * V2ImageInfo
 */
public class V2ImageInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private V2ImageCategory category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_registry")

    private String imageRegistry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_namespace")

    private String imageNamespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_count")

    private Integer versionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility")

    private String visibility;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instruction")

    private String instruction;

    public V2ImageInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：镜像ID。 **取值范围**：长度为32~36的英文字符、数字和中划线的组合。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public V2ImageInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * **参数解释**：镜像名。 **取值范围**：由中文字符、英文字母、数字、中划线和下划线组成，长度0~128个字符。 
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public V2ImageInfo withCategory(V2ImageCategory category) {
        this.category = category;
        return this;
    }

    /**
     * Get category
     * @return category
     */
    public V2ImageCategory getCategory() {
        return category;
    }

    public void setCategory(V2ImageCategory category) {
        this.category = category;
    }

    public V2ImageInfo withImageRegistry(String imageRegistry) {
        this.imageRegistry = imageRegistry;
        return this;
    }

    /**
     * **参数解释**：镜像域名。 **取值范围**：支持英文字母、数字、小数点及连字符，长度0~255个字符。 
     * @return imageRegistry
     */
    public String getImageRegistry() {
        return imageRegistry;
    }

    public void setImageRegistry(String imageRegistry) {
        this.imageRegistry = imageRegistry;
    }

    public V2ImageInfo withImageNamespace(String imageNamespace) {
        this.imageNamespace = imageNamespace;
        return this;
    }

    /**
     * **参数解释**：镜像命名空间。 **取值范围**：由英文字母、数字、中划线和下划线组成，长度0~64个字符。 
     * @return imageNamespace
     */
    public String getImageNamespace() {
        return imageNamespace;
    }

    public void setImageNamespace(String imageNamespace) {
        this.imageNamespace = imageNamespace;
    }

    public V2ImageInfo withVersionCount(Integer versionCount) {
        this.versionCount = versionCount;
        return this;
    }

    /**
     * **参数解释**：镜像版本数量。 **取值范围**：大于等于0。 
     * @return versionCount
     */
    public Integer getVersionCount() {
        return versionCount;
    }

    public void setVersionCount(Integer versionCount) {
        this.versionCount = versionCount;
    }

    public V2ImageInfo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**：资源创建时间。 **取值范围**：ISO 8601格式，yyyy-MM-dd'T'HH:mm:ss.SSSZ，UTC时间。 
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public V2ImageInfo withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**：资源更新时间。 **取值范围**：ISO 8601格式，yyyy-MM-dd'T'HH:mm:ss.SSSZ，UTC时间。 
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public V2ImageInfo withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * **参数解释**：可见性。 **取值范围**：   - PRIVATE：私有，用户自己创建的。   - PUBLIC：公共，查询所有公共的，包括其他用户创建的。 
     * @return visibility
     */
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public V2ImageInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：镜像的描述。 **取值范围**：支持中文字符、英文字母、数字及常用符号（不允许输入感叹号、小于号、大于号、等号、与号、双引号、单引号），长度0~2000个字符。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public V2ImageInfo withInstruction(String instruction) {
        this.instruction = instruction;
        return this;
    }

    /**
     * **参数解释**：公共镜像使用说明。 **取值范围**：支持中文字符、英文字母、数字及常用符号，长度0~20000个字符。 
     * @return instruction
     */
    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        V2ImageInfo that = (V2ImageInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.imageName, that.imageName)
            && Objects.equals(this.category, that.category) && Objects.equals(this.imageRegistry, that.imageRegistry)
            && Objects.equals(this.imageNamespace, that.imageNamespace)
            && Objects.equals(this.versionCount, that.versionCount) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.visibility, that.visibility)
            && Objects.equals(this.description, that.description) && Objects.equals(this.instruction, that.instruction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            imageName,
            category,
            imageRegistry,
            imageNamespace,
            versionCount,
            createTime,
            updateTime,
            visibility,
            description,
            instruction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V2ImageInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    imageRegistry: ").append(toIndentedString(imageRegistry)).append("\n");
        sb.append("    imageNamespace: ").append(toIndentedString(imageNamespace)).append("\n");
        sb.append("    versionCount: ").append(toIndentedString(versionCount)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
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
