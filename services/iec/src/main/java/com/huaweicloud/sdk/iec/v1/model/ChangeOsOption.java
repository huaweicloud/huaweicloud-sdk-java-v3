package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 切换操作系统的参数 */
public class ChangeOsOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private ChangeOsMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_name")

    private String keyName;

    public ChangeOsOption withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /** 切换系统所使用的新镜像的ID。
     * 
     * @return imageId */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ChangeOsOption withMetadata(ChangeOsMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ChangeOsOption withMetadata(Consumer<ChangeOsMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new ChangeOsMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /** Get metadata
     * 
     * @return metadata */
    public ChangeOsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(ChangeOsMetadata metadata) {
        this.metadata = metadata;
    }

    public ChangeOsOption withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /** 密钥对名称。 如果需要使用SSH密钥方式登录边缘实例，请指定已创建密钥的名称。
     * 
     * @return keyName */
    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeOsOption changeOsOption = (ChangeOsOption) o;
        return Objects.equals(this.imageId, changeOsOption.imageId)
            && Objects.equals(this.metadata, changeOsOption.metadata)
            && Objects.equals(this.keyName, changeOsOption.keyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId, metadata, keyName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeOsOption {\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
