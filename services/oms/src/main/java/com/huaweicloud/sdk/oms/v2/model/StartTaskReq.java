package com.huaweicloud.sdk.oms.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class StartTaskReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="src_ak")
    
    private String srcAk;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="src_sk")
    
    private String srcSk;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dst_ak")
    
    private String dstAk;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dst_sk")
    
    private String dstSk;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_cdn_authentication_key")
    
    private String sourceCdnAuthenticationKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="migrate_failed_object")
    
    private Boolean migrateFailedObject = false;

    public StartTaskReq withSrcAk(String srcAk) {
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

    public StartTaskReq withSrcSk(String srcSk) {
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

    public StartTaskReq withDstAk(String dstAk) {
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

    public StartTaskReq withDstSk(String dstSk) {
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

    public StartTaskReq withSourceCdnAuthenticationKey(String sourceCdnAuthenticationKey) {
        this.sourceCdnAuthenticationKey = sourceCdnAuthenticationKey;
        return this;
    }

    


    /**
     * CDN鉴权秘钥。
     * @return sourceCdnAuthenticationKey
     */
    public String getSourceCdnAuthenticationKey() {
        return sourceCdnAuthenticationKey;
    }

    public void setSourceCdnAuthenticationKey(String sourceCdnAuthenticationKey) {
        this.sourceCdnAuthenticationKey = sourceCdnAuthenticationKey;
    }

    public StartTaskReq withMigrateFailedObject(Boolean migrateFailedObject) {
        this.migrateFailedObject = migrateFailedObject;
        return this;
    }

    


    /**
     * 迁移类型，标识是否为全量迁移，默认false（全量迁移）。 值为true时表示只重传失败对象。 值为空或者为false时表示全量迁移。
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
        StartTaskReq startTaskReq = (StartTaskReq) o;
        return Objects.equals(this.srcAk, startTaskReq.srcAk) &&
            Objects.equals(this.srcSk, startTaskReq.srcSk) &&
            Objects.equals(this.dstAk, startTaskReq.dstAk) &&
            Objects.equals(this.dstSk, startTaskReq.dstSk) &&
            Objects.equals(this.sourceCdnAuthenticationKey, startTaskReq.sourceCdnAuthenticationKey) &&
            Objects.equals(this.migrateFailedObject, startTaskReq.migrateFailedObject);
    }
    @Override
    public int hashCode() {
        return Objects.hash(srcAk, srcSk, dstAk, dstSk, sourceCdnAuthenticationKey, migrateFailedObject);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartTaskReq {\n");
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

