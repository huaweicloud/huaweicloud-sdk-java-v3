package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ArtifactHashCode
 */
public class ArtifactHashCode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hash_type")

    private String hashType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hash_value")

    private String hashValue;

    public ArtifactHashCode withHashType(String hashType) {
        this.hashType = hashType;
        return this;
    }

    /**
     * **参数解释**： 哈希算法。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return hashType
     */
    public String getHashType() {
        return hashType;
    }

    public void setHashType(String hashType) {
        this.hashType = hashType;
    }

    public ArtifactHashCode withHashValue(String hashValue) {
        this.hashValue = hashValue;
        return this;
    }

    /**
     * **参数解释**： 哈希值。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return hashValue
     */
    public String getHashValue() {
        return hashValue;
    }

    public void setHashValue(String hashValue) {
        this.hashValue = hashValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ArtifactHashCode that = (ArtifactHashCode) obj;
        return Objects.equals(this.hashType, that.hashType) && Objects.equals(this.hashValue, that.hashValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hashType, hashValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArtifactHashCode {\n");
        sb.append("    hashType: ").append(toIndentedString(hashType)).append("\n");
        sb.append("    hashValue: ").append(toIndentedString(hashValue)).append("\n");
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
