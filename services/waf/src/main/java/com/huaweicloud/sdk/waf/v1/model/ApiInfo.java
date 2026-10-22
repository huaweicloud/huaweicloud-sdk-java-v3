package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * API信息
 */
public class ApiInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private String sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_secret")

    private String sourceSecret;

    public ApiInfo withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * API签名状态（0：禁用，1：启用）
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ApiInfo withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 访问密钥ID
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public ApiInfo withSourceSecret(String sourceSecret) {
        this.sourceSecret = sourceSecret;
        return this;
    }

    /**
     * 秘密访问密钥
     * @return sourceSecret
     */
    public String getSourceSecret() {
        return sourceSecret;
    }

    public void setSourceSecret(String sourceSecret) {
        this.sourceSecret = sourceSecret;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApiInfo that = (ApiInfo) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.sourceId, that.sourceId)
            && Objects.equals(this.sourceSecret, that.sourceSecret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, sourceId, sourceSecret);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiInfo {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    sourceSecret: ").append(toIndentedString(sourceSecret)).append("\n");
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
