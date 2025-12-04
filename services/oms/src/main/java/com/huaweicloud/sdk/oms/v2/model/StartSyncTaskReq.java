package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 启动同步任务body体
 */
public class StartSyncTaskReq {

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

    public StartSyncTaskReq withSrcAk(String srcAk) {
        this.srcAk = srcAk;
        return this;
    }

    /**
     * 源端节点AK（最大长度100个字符）。URL列表迁移任务不需要填写此参数。
     * @return srcAk
     */
    public String getSrcAk() {
        return srcAk;
    }

    public void setSrcAk(String srcAk) {
        this.srcAk = srcAk;
    }

    public StartSyncTaskReq withSrcSk(String srcSk) {
        this.srcSk = srcSk;
        return this;
    }

    /**
     * 源端节点SK（最大长度100个字符）。URL列表迁移任务不需要填写此参数。
     * @return srcSk
     */
    public String getSrcSk() {
        return srcSk;
    }

    public void setSrcSk(String srcSk) {
        this.srcSk = srcSk;
    }

    public StartSyncTaskReq withDstAk(String dstAk) {
        this.dstAk = dstAk;
        return this;
    }

    /**
     * 目的端节点AK（最大长度100个字符）。
     * @return dstAk
     */
    public String getDstAk() {
        return dstAk;
    }

    public void setDstAk(String dstAk) {
        this.dstAk = dstAk;
    }

    public StartSyncTaskReq withDstSk(String dstSk) {
        this.dstSk = dstSk;
        return this;
    }

    /**
     * 目的端节点SK（最大长度100个字符）。
     * @return dstSk
     */
    public String getDstSk() {
        return dstSk;
    }

    public void setDstSk(String dstSk) {
        this.dstSk = dstSk;
    }

    public StartSyncTaskReq withSourceCdnAuthenticationKey(String sourceCdnAuthenticationKey) {
        this.sourceCdnAuthenticationKey = sourceCdnAuthenticationKey;
        return this;
    }

    /**
     * CDN鉴权密钥。
     * @return sourceCdnAuthenticationKey
     */
    public String getSourceCdnAuthenticationKey() {
        return sourceCdnAuthenticationKey;
    }

    public void setSourceCdnAuthenticationKey(String sourceCdnAuthenticationKey) {
        this.sourceCdnAuthenticationKey = sourceCdnAuthenticationKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartSyncTaskReq that = (StartSyncTaskReq) obj;
        return Objects.equals(this.srcAk, that.srcAk) && Objects.equals(this.srcSk, that.srcSk)
            && Objects.equals(this.dstAk, that.dstAk) && Objects.equals(this.dstSk, that.dstSk)
            && Objects.equals(this.sourceCdnAuthenticationKey, that.sourceCdnAuthenticationKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(srcAk, srcSk, dstAk, dstSk, sourceCdnAuthenticationKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartSyncTaskReq {\n");
        sb.append("    srcAk: ").append(toIndentedString(srcAk)).append("\n");
        sb.append("    srcSk: ").append(toIndentedString(srcSk)).append("\n");
        sb.append("    dstAk: ").append(toIndentedString(dstAk)).append("\n");
        sb.append("    dstSk: ").append(toIndentedString(dstSk)).append("\n");
        sb.append("    sourceCdnAuthenticationKey: ").append(toIndentedString(sourceCdnAuthenticationKey)).append("\n");
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
