package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * The accessory of the artifact
 */
public class Accessory {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact_id")

    private Long artifactId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject_artifact_id")

    private Long subjectArtifactId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "digest")

    private String digest;

    /**
     * 附件的类型
     */
    public static final class TypeEnum {

        /**
         * Enum SIGNATURE_COSIGN for value: "signature.cosign"
         */
        public static final TypeEnum SIGNATURE_COSIGN = new TypeEnum("signature.cosign");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("signature.cosign", SIGNATURE_COSIGN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    public Accessory withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 附件ID
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Accessory withArtifactId(Long artifactId) {
        this.artifactId = artifactId;
        return this;
    }

    /**
     * 附件制品ID
     * @return artifactId
     */
    public Long getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(Long artifactId) {
        this.artifactId = artifactId;
    }

    public Accessory withSubjectArtifactId(Long subjectArtifactId) {
        this.subjectArtifactId = subjectArtifactId;
        return this;
    }

    /**
     * 附件所属制品ID.
     * @return subjectArtifactId
     */
    public Long getSubjectArtifactId() {
        return subjectArtifactId;
    }

    public void setSubjectArtifactId(Long subjectArtifactId) {
        this.subjectArtifactId = subjectArtifactId;
    }

    public Accessory withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 附件的大小
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Accessory withDigest(String digest) {
        this.digest = digest;
        return this;
    }

    /**
     * 附件的sha256值
     * @return digest
     */
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public Accessory withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 附件的类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Accessory withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 附件的创建时间
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Accessory that = (Accessory) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.artifactId, that.artifactId)
            && Objects.equals(this.subjectArtifactId, that.subjectArtifactId) && Objects.equals(this.size, that.size)
            && Objects.equals(this.digest, that.digest) && Objects.equals(this.type, that.type)
            && Objects.equals(this.createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, artifactId, subjectArtifactId, size, digest, type, createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Accessory {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    artifactId: ").append(toIndentedString(artifactId)).append("\n");
        sb.append("    subjectArtifactId: ").append(toIndentedString(subjectArtifactId)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
