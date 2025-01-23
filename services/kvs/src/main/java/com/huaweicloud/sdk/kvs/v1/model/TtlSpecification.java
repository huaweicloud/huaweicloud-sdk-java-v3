package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;

/**
 * TTL设置。非必填项，默认不启用TTL。
 */
public class TtlSpecification {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")
    @BsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_after_seconds")
    @BsonProperty(value = "expire_after_seconds")

    private Integer expireAfterSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_name")
    @BsonProperty(value = "field_name")

    private String fieldName;

    public TtlSpecification withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * TTL开关
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public TtlSpecification withExpireAfterSeconds(Integer expireAfterSeconds) {
        this.expireAfterSeconds = expireAfterSeconds;
        return this;
    }

    /**
     * 生存时间，以秒为单位
     * @return expireAfterSeconds
     */
    public Integer getExpireAfterSeconds() {
        return expireAfterSeconds;
    }

    public void setExpireAfterSeconds(Integer expireAfterSeconds) {
        this.expireAfterSeconds = expireAfterSeconds;
    }

    public TtlSpecification withFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * 文档中记录TTL过期时间的字段名，字段值为UTC时间，单位秒
     * @return fieldName
     */
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TtlSpecification that = (TtlSpecification) obj;
        return Objects.equals(this.enable, that.enable)
            && Objects.equals(this.expireAfterSeconds, that.expireAfterSeconds)
            && Objects.equals(this.fieldName, that.fieldName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, expireAfterSeconds, fieldName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TtlSpecification {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    expireAfterSeconds: ").append(toIndentedString(expireAfterSeconds)).append("\n");
        sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
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
