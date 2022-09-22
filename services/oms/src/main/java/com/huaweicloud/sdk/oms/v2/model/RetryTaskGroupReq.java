package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 重试迁移任务组请求参数
 */
public class RetryTaskGroupReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_ak")

    private String srcAk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_sk")

    private String srcSk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_ak")

    private String dstAk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_sk")

    private String dstSk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_cdn_authentication_key")

    private String sourceCdnAuthenticationKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrate_failed_object")

    private Boolean migrateFailedObject;

    public RetryTaskGroupReq withSrcAk(String srcAk) {
        this.srcAk = srcAk;
        return this;
    }

    /**
     * 源端ak（最大长度100个字符）
     * @return srcAk
     */
    public String getSrcAk() {
        return srcAk;
    }

    public void setSrcAk(String srcAk) {
        this.srcAk = srcAk;
    }

    public RetryTaskGroupReq withSrcSk(String srcSk) {
        this.srcSk = srcSk;
        return this;
    }

    /**
     * 源端sk（最大长度100个字符）
     * @return srcSk
     */
    public String getSrcSk() {
        return srcSk;
    }

    public void setSrcSk(String srcSk) {
        this.srcSk = srcSk;
    }

    public RetryTaskGroupReq withDstAk(String dstAk) {
        this.dstAk = dstAk;
        return this;
    }

    /**
     * 目的端ak（最大长度100个字符）
     * @return dstAk
     */
    public String getDstAk() {
        return dstAk;
    }

    public void setDstAk(String dstAk) {
        this.dstAk = dstAk;
    }

    public RetryTaskGroupReq withDstSk(String dstSk) {
        this.dstSk = dstSk;
        return this;
    }

    /**
     * 目的端sk（最大长度100个字符）
     * @return dstSk
     */
    public String getDstSk() {
        return dstSk;
    }

    public void setDstSk(String dstSk) {
        this.dstSk = dstSk;
    }

    public RetryTaskGroupReq withSourceCdnAuthenticationKey(String sourceCdnAuthenticationKey) {
        this.sourceCdnAuthenticationKey = sourceCdnAuthenticationKey;
        return this;
    }

    /**
     * cdn鉴权秘钥
     * @return sourceCdnAuthenticationKey
     */
    public String getSourceCdnAuthenticationKey() {
        return sourceCdnAuthenticationKey;
    }

    public void setSourceCdnAuthenticationKey(String sourceCdnAuthenticationKey) {
        this.sourceCdnAuthenticationKey = sourceCdnAuthenticationKey;
    }

    public RetryTaskGroupReq withMigrateFailedObject(Boolean migrateFailedObject) {
        this.migrateFailedObject = migrateFailedObject;
        return this;
    }

    /**
     * 失败任务重试方式，标识是否为全量重新迁移，默认false（全量重新迁移）。 值为true时表示只重传失败对象。 值为空或者为false时表示全量重新迁移（默认跳过目的端已迁移对象）。
     * @return migrateFailedObject
     */
    public Boolean getMigrateFailedObject() {
        return migrateFailedObject;
    }

    public void setMigrateFailedObject(Boolean migrateFailedObject) {
        this.migrateFailedObject = migrateFailedObject;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RetryTaskGroupReq retryTaskGroupReq = (RetryTaskGroupReq) o;
        return Objects.equals(this.srcAk, retryTaskGroupReq.srcAk)
            && Objects.equals(this.srcSk, retryTaskGroupReq.srcSk)
            && Objects.equals(this.dstAk, retryTaskGroupReq.dstAk)
            && Objects.equals(this.dstSk, retryTaskGroupReq.dstSk)
            && Objects.equals(this.sourceCdnAuthenticationKey, retryTaskGroupReq.sourceCdnAuthenticationKey)
            && Objects.equals(this.migrateFailedObject, retryTaskGroupReq.migrateFailedObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(srcAk, srcSk, dstAk, dstSk, sourceCdnAuthenticationKey, migrateFailedObject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetryTaskGroupReq {\n");
        sb.append("    srcAk: ").append(toIndentedString(srcAk)).append("\n");
        sb.append("    srcSk: ").append(toIndentedString(srcSk)).append("\n");
        sb.append("    dstAk: ").append(toIndentedString(dstAk)).append("\n");
        sb.append("    dstSk: ").append(toIndentedString(dstSk)).append("\n");
        sb.append("    sourceCdnAuthenticationKey: ").append(toIndentedString(sourceCdnAuthenticationKey)).append("\n");
        sb.append("    migrateFailedObject: ").append(toIndentedString(migrateFailedObject)).append("\n");
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
