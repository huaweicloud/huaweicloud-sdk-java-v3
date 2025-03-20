package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;

/**
 * 用户数据静态加密设置。非必填项，默认不启用静态加密。
 */
public class SseSpecification {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")
    @BsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sse_type")
    @BsonProperty(value = "sse_type")

    private String sseType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sse_algorithm")
    @BsonProperty(value = "sse_algorithm")

    private String sseAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmk_id")
    @BsonProperty(value = "cmk_id")

    private String cmkId;

    public SseSpecification withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 启用静态加密。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public SseSpecification withSseType(String sseType) {
        this.sseType = sseType;
        return this;
    }

    /**
     * 加密类型，支持SSE-KMS-S和SSE-KMS-C。
     * @return sseType
     */
    public String getSseType() {
        return sseType;
    }

    public void setSseType(String sseType) {
        this.sseType = sseType;
    }

    public SseSpecification withSseAlgorithm(String sseAlgorithm) {
        this.sseAlgorithm = sseAlgorithm;
        return this;
    }

    /**
     * 加密算法，支持AES256_GCM。
     * @return sseAlgorithm
     */
    public String getSseAlgorithm() {
        return sseAlgorithm;
    }

    public void setSseAlgorithm(String sseAlgorithm) {
        this.sseAlgorithm = sseAlgorithm;
    }

    public SseSpecification withCmkId(String cmkId) {
        this.cmkId = cmkId;
        return this;
    }

    /**
     * KMS中的用户主密钥ID。非必填项，仅当加密类型是SSE-KMS-C时需要填写该字段。
     * @return cmkId
     */
    public String getCmkId() {
        return cmkId;
    }

    public void setCmkId(String cmkId) {
        this.cmkId = cmkId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SseSpecification that = (SseSpecification) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.sseType, that.sseType)
            && Objects.equals(this.sseAlgorithm, that.sseAlgorithm) && Objects.equals(this.cmkId, that.cmkId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, sseType, sseAlgorithm, cmkId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SseSpecification {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    sseType: ").append(toIndentedString(sseType)).append("\n");
        sb.append("    sseAlgorithm: ").append(toIndentedString(sseAlgorithm)).append("\n");
        sb.append("    cmkId: ").append(toIndentedString(cmkId)).append("\n");
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
