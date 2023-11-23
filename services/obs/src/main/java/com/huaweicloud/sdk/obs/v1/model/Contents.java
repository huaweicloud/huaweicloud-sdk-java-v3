package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 对象的元数据信息。 
 */
@JacksonXmlRootElement(localName = "Contents")
public class Contents {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Owner")

    @JacksonXmlProperty(localName = "Owner")

    private Owner owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ETag")

    @JacksonXmlProperty(localName = "ETag")

    private String etag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Type")

    @JacksonXmlProperty(localName = "Type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Key")

    @JacksonXmlProperty(localName = "Key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "LastModified")

    @JacksonXmlProperty(localName = "LastModified")

    private String lastModified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Size")

    @JacksonXmlProperty(localName = "Size")

    private String size;

    /**
     * 对象的存储类型。 
     */
    public static final class StorageClassEnum {

        /**
         * Enum STANDARD for value: "STANDARD"
         */
        public static final StorageClassEnum STANDARD = new StorageClassEnum("STANDARD");

        /**
         * Enum WARM for value: "WARM"
         */
        public static final StorageClassEnum WARM = new StorageClassEnum("WARM");

        /**
         * Enum COLD for value: "COLD"
         */
        public static final StorageClassEnum COLD = new StorageClassEnum("COLD");

        private static final Map<String, StorageClassEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StorageClassEnum> createStaticFields() {
            Map<String, StorageClassEnum> map = new HashMap<>();
            map.put("STANDARD", STANDARD);
            map.put("WARM", WARM);
            map.put("COLD", COLD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StorageClassEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StorageClassEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StorageClassEnum(value));
        }

        public static StorageClassEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StorageClassEnum) {
                return this.value.equals(((StorageClassEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "StorageClass")

    @JacksonXmlProperty(localName = "StorageClass")

    private StorageClassEnum storageClass;

    public Contents withOwner(Owner owner) {
        this.owner = owner;
        return this;
    }

    public Contents withOwner(Consumer<Owner> ownerSetter) {
        if (this.owner == null) {
            this.owner = new Owner();
            ownerSetter.accept(this.owner);
        }

        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Contents withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * 对象的base64编码的128位MD5摘要。ETag是对象内容的唯一标识，可以通过该值识别对象内容是否有变化。比如上传对象时ETag为A，下载对象时ETag为B，则说明对象内容发生了变化。实际的ETag是对象的哈希值。ETag只反映变化的内容，而不是其元数据。上传的对象或拷贝操作创建的对象，通过MD5加密后都有唯一的ETag。（当对象是服务端加密的对象时，ETag值不是对象的MD5值，而是通过服务端加密计算出的唯一标识。） 
     * @return etag
     */
    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public Contents withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 对象类型，非Normal对象时返回。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Contents withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 对象名。 
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Contents withLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * 对象最近一次被修改的时间（UTC时间）。 
     * @return lastModified
     */
    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public Contents withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * 对象的字节数。 
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Contents withStorageClass(StorageClassEnum storageClass) {
        this.storageClass = storageClass;
        return this;
    }

    /**
     * 对象的存储类型。 
     * @return storageClass
     */
    public StorageClassEnum getStorageClass() {
        return storageClass;
    }

    public void setStorageClass(StorageClassEnum storageClass) {
        this.storageClass = storageClass;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Contents that = (Contents) obj;
        return Objects.equals(this.owner, that.owner) && Objects.equals(this.etag, that.etag)
            && Objects.equals(this.type, that.type) && Objects.equals(this.key, that.key)
            && Objects.equals(this.lastModified, that.lastModified) && Objects.equals(this.size, that.size)
            && Objects.equals(this.storageClass, that.storageClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, etag, type, key, lastModified, size, storageClass);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Contents {\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    storageClass: ").append(toIndentedString(storageClass)).append("\n");
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
