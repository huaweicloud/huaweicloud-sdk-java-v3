package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class StartTaskGroupReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_ak")

    private String srcAk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_sk")

    private String srcSk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_string")

    private String connectionString;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "json_auth_file")

    private String jsonAuthFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_ak")

    private String dstAk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_sk")

    private String dstSk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_cdn_authentication_key")

    private String sourceCdnAuthenticationKey;

    public StartTaskGroupReq withSrcAk(String srcAk) {
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

    public StartTaskGroupReq withSrcSk(String srcSk) {
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

    public StartTaskGroupReq withConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * 连接字符串，用于微软云Blob鉴权
     * @return connectionString
     */
    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public StartTaskGroupReq withJsonAuthFile(String jsonAuthFile) {
        this.jsonAuthFile = jsonAuthFile;
        return this;
    }

    /**
     * 用于谷歌云Cloud Storage鉴权
     * @return jsonAuthFile
     */
    public String getJsonAuthFile() {
        return jsonAuthFile;
    }

    public void setJsonAuthFile(String jsonAuthFile) {
        this.jsonAuthFile = jsonAuthFile;
    }

    public StartTaskGroupReq withDstAk(String dstAk) {
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

    public StartTaskGroupReq withDstSk(String dstSk) {
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

    public StartTaskGroupReq withSourceCdnAuthenticationKey(String sourceCdnAuthenticationKey) {
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
        StartTaskGroupReq that = (StartTaskGroupReq) obj;
        return Objects.equals(this.srcAk, that.srcAk) && Objects.equals(this.srcSk, that.srcSk)
            && Objects.equals(this.connectionString, that.connectionString)
            && Objects.equals(this.jsonAuthFile, that.jsonAuthFile) && Objects.equals(this.dstAk, that.dstAk)
            && Objects.equals(this.dstSk, that.dstSk)
            && Objects.equals(this.sourceCdnAuthenticationKey, that.sourceCdnAuthenticationKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(srcAk, srcSk, connectionString, jsonAuthFile, dstAk, dstSk, sourceCdnAuthenticationKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartTaskGroupReq {\n");
        sb.append("    srcAk: ").append(toIndentedString(srcAk)).append("\n");
        sb.append("    srcSk: ").append(toIndentedString(srcSk)).append("\n");
        sb.append("    connectionString: ").append(toIndentedString(connectionString)).append("\n");
        sb.append("    jsonAuthFile: ").append(toIndentedString(jsonAuthFile)).append("\n");
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
