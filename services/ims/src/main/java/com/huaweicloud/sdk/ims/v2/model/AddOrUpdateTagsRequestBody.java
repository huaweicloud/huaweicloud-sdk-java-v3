package com.huaweicloud.sdk.ims.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ims.v2.model.ResourceTag;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 请求参数
 */
public class AddOrUpdateTagsRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_id")
    
    private String imageId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tag")
    
    private String tag;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_tag")
    
    private ResourceTag imageTag = null;

    public AddOrUpdateTagsRequestBody withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    


    /**
     * 镜像ID。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public AddOrUpdateTagsRequestBody withTag(String tag) {
        this.tag = tag;
        return this;
    }

    


    /**
     * 标签数据。 tag和image_tag只能使用一个。
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public AddOrUpdateTagsRequestBody withImageTag(ResourceTag imageTag) {
        this.imageTag = imageTag;
        return this;
    }

    public AddOrUpdateTagsRequestBody withImageTag(Consumer<ResourceTag> imageTagSetter) {
        if(this.imageTag == null ){
            this.imageTag = new ResourceTag();
        }
        imageTagSetter.accept(this.imageTag);
        return this;
    }


    /**
     * Get imageTag
     * @return imageTag
     */
    public ResourceTag getImageTag() {
        return imageTag;
    }

    public void setImageTag(ResourceTag imageTag) {
        this.imageTag = imageTag;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddOrUpdateTagsRequestBody addOrUpdateTagsRequestBody = (AddOrUpdateTagsRequestBody) o;
        return Objects.equals(this.imageId, addOrUpdateTagsRequestBody.imageId) &&
            Objects.equals(this.tag, addOrUpdateTagsRequestBody.tag) &&
            Objects.equals(this.imageTag, addOrUpdateTagsRequestBody.imageTag);
    }
    @Override
    public int hashCode() {
        return Objects.hash(imageId, tag, imageTag);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddOrUpdateTagsRequestBody {\n");
            sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
            sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
            sb.append("    imageTag: ").append(toIndentedString(imageTag)).append("\n");
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

