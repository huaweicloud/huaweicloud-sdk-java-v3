package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class RegisterV2TenantImageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

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
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility")

    private String visibility;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public RegisterV2TenantImageResponse withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * **参数解释**：镜像ID。 **约束限制**：不涉及。 **取值范围**：长度为32~36的英文字符、数字和中划线的组合。 
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public RegisterV2TenantImageResponse withCategory(V2ImageCategory category) {
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

    public RegisterV2TenantImageResponse withImageRegistry(String imageRegistry) {
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

    public RegisterV2TenantImageResponse withImageNamespace(String imageNamespace) {
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

    public RegisterV2TenantImageResponse withImageName(String imageName) {
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

    public RegisterV2TenantImageResponse withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * **参数解释**：可见性。 **取值范围**：   - PRIVATE：私有。用户自己创建的。   - PUBLIC：公共。查询所有公共的，包括其他用户创建的。 
     * @return visibility
     */
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public RegisterV2TenantImageResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RegisterV2TenantImageResponse that = (RegisterV2TenantImageResponse) obj;
        return Objects.equals(this.imageId, that.imageId) && Objects.equals(this.category, that.category)
            && Objects.equals(this.imageRegistry, that.imageRegistry)
            && Objects.equals(this.imageNamespace, that.imageNamespace)
            && Objects.equals(this.imageName, that.imageName) && Objects.equals(this.visibility, that.visibility)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId, category, imageRegistry, imageNamespace, imageName, visibility, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegisterV2TenantImageResponse {\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    imageRegistry: ").append(toIndentedString(imageRegistry)).append("\n");
        sb.append("    imageNamespace: ").append(toIndentedString(imageNamespace)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
