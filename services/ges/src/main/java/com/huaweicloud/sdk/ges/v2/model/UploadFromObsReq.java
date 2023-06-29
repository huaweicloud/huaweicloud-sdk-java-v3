package com.huaweicloud.sdk.ges.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 从OBS导入元数据请求体
 */
public class UploadFromObsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata_path")

    private String metadataPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encryption")

    private UploadFromObsReqEncryption encryption;

    public UploadFromObsReq withMetadataPath(String metadataPath) {
        this.metadataPath = metadataPath;
        return this;
    }

    /**
     * 元数据存储地址。
     * @return metadataPath
     */
    public String getMetadataPath() {
        return metadataPath;
    }

    public void setMetadataPath(String metadataPath) {
        this.metadataPath = metadataPath;
    }

    public UploadFromObsReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 元数据的名字。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UploadFromObsReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 对元数据的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UploadFromObsReq withEncryption(UploadFromObsReqEncryption encryption) {
        this.encryption = encryption;
        return this;
    }

    public UploadFromObsReq withEncryption(Consumer<UploadFromObsReqEncryption> encryptionSetter) {
        if (this.encryption == null) {
            this.encryption = new UploadFromObsReqEncryption();
            encryptionSetter.accept(this.encryption);
        }

        return this;
    }

    /**
     * Get encryption
     * @return encryption
     */
    public UploadFromObsReqEncryption getEncryption() {
        return encryption;
    }

    public void setEncryption(UploadFromObsReqEncryption encryption) {
        this.encryption = encryption;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UploadFromObsReq that = (UploadFromObsReq) obj;
        return Objects.equals(this.metadataPath, that.metadataPath) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.encryption, that.encryption);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadataPath, name, description, encryption);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadFromObsReq {\n");
        sb.append("    metadataPath: ").append(toIndentedString(metadataPath)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    encryption: ").append(toIndentedString(encryption)).append("\n");
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
