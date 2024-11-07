package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;

/**
 * TtlOptions
 */
public class TtlOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl_switch")
    @BsonProperty(value = "ttl_switch")

    private Boolean ttlSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_after_seconds")
    @BsonProperty(value = "expire_after_seconds")

    private Integer expireAfterSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl_field_name")
    @BsonProperty(value = "ttl_field_name")

    private String ttlFieldName;

    public TtlOptions withTtlSwitch(Boolean ttlSwitch) {
        this.ttlSwitch = ttlSwitch;
        return this;
    }

    /**
     * TTL开关
     * @return ttlSwitch
     */
    public Boolean getTtlSwitch() {
        return ttlSwitch;
    }

    public void setTtlSwitch(Boolean ttlSwitch) {
        this.ttlSwitch = ttlSwitch;
    }

    public TtlOptions withExpireAfterSeconds(Integer expireAfterSeconds) {
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

    public TtlOptions withTtlFieldName(String ttlFieldName) {
        this.ttlFieldName = ttlFieldName;
        return this;
    }

    /**
     * 文档中记录TTL过期时间的字段名，字段值为UTC时间，单位秒
     * @return ttlFieldName
     */
    public String getTtlFieldName() {
        return ttlFieldName;
    }

    public void setTtlFieldName(String ttlFieldName) {
        this.ttlFieldName = ttlFieldName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TtlOptions that = (TtlOptions) obj;
        return Objects.equals(this.ttlSwitch, that.ttlSwitch)
            && Objects.equals(this.expireAfterSeconds, that.expireAfterSeconds)
            && Objects.equals(this.ttlFieldName, that.ttlFieldName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ttlSwitch, expireAfterSeconds, ttlFieldName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TtlOptions {\n");
        sb.append("    ttlSwitch: ").append(toIndentedString(ttlSwitch)).append("\n");
        sb.append("    expireAfterSeconds: ").append(toIndentedString(expireAfterSeconds)).append("\n");
        sb.append("    ttlFieldName: ").append(toIndentedString(ttlFieldName)).append("\n");
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
