package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BigKeysInfoResponseBody
 */
public class BigKeysInfoResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_id")

    private Integer dbId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_type")

    private String keyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_name")

    private String keyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_size")

    private Integer keySize;

    public BigKeysInfoResponseBody withDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }

    /**
     * 大Key所在的DB。
     * @return dbId
     */
    public Integer getDbId() {
        return dbId;
    }

    public void setDbId(Integer dbId) {
        this.dbId = dbId;
    }

    public BigKeysInfoResponseBody withKeyType(String keyType) {
        this.keyType = keyType;
        return this;
    }

    /**
     * 大Key类型。
     * @return keyType
     */
    public String getKeyType() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    public BigKeysInfoResponseBody withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * 大Key名。
     * @return keyName
     */
    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public BigKeysInfoResponseBody withKeySize(Integer keySize) {
        this.keySize = keySize;
        return this;
    }

    /**
     * 大Key的长度。
     * @return keySize
     */
    public Integer getKeySize() {
        return keySize;
    }

    public void setKeySize(Integer keySize) {
        this.keySize = keySize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BigKeysInfoResponseBody that = (BigKeysInfoResponseBody) obj;
        return Objects.equals(this.dbId, that.dbId) && Objects.equals(this.keyType, that.keyType)
            && Objects.equals(this.keyName, that.keyName) && Objects.equals(this.keySize, that.keySize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbId, keyType, keyName, keySize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BigKeysInfoResponseBody {\n");
        sb.append("    dbId: ").append(toIndentedString(dbId)).append("\n");
        sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
        sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
        sb.append("    keySize: ").append(toIndentedString(keySize)).append("\n");
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
