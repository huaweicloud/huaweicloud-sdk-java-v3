package com.huaweicloud.sdk.ges.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowMetadata2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrypted")

    private Boolean encrypted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_key_name")

    private String masterKeyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_key_id")

    private String masterKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ges_metadata")

    private ShowMetadataRespGesMetadata gesMetadata;

    public ShowMetadata2Response withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * 元数据是否加密
     * @return encrypted
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    public ShowMetadata2Response withMasterKeyName(String masterKeyName) {
        this.masterKeyName = masterKeyName;
        return this;
    }

    /**
     * 秘钥名称
     * @return masterKeyName
     */
    public String getMasterKeyName() {
        return masterKeyName;
    }

    public void setMasterKeyName(String masterKeyName) {
        this.masterKeyName = masterKeyName;
    }

    public ShowMetadata2Response withMasterKeyId(String masterKeyId) {
        this.masterKeyId = masterKeyId;
        return this;
    }

    /**
     * 秘钥id
     * @return masterKeyId
     */
    public String getMasterKeyId() {
        return masterKeyId;
    }

    public void setMasterKeyId(String masterKeyId) {
        this.masterKeyId = masterKeyId;
    }

    public ShowMetadata2Response withGesMetadata(ShowMetadataRespGesMetadata gesMetadata) {
        this.gesMetadata = gesMetadata;
        return this;
    }

    public ShowMetadata2Response withGesMetadata(Consumer<ShowMetadataRespGesMetadata> gesMetadataSetter) {
        if (this.gesMetadata == null) {
            this.gesMetadata = new ShowMetadataRespGesMetadata();
            gesMetadataSetter.accept(this.gesMetadata);
        }

        return this;
    }

    /**
     * Get gesMetadata
     * @return gesMetadata
     */
    public ShowMetadataRespGesMetadata getGesMetadata() {
        return gesMetadata;
    }

    public void setGesMetadata(ShowMetadataRespGesMetadata gesMetadata) {
        this.gesMetadata = gesMetadata;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMetadata2Response that = (ShowMetadata2Response) obj;
        return Objects.equals(this.encrypted, that.encrypted) && Objects.equals(this.masterKeyName, that.masterKeyName)
            && Objects.equals(this.masterKeyId, that.masterKeyId) && Objects.equals(this.gesMetadata, that.gesMetadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encrypted, masterKeyName, masterKeyId, gesMetadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMetadata2Response {\n");
        sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
        sb.append("    masterKeyName: ").append(toIndentedString(masterKeyName)).append("\n");
        sb.append("    masterKeyId: ").append(toIndentedString(masterKeyId)).append("\n");
        sb.append("    gesMetadata: ").append(toIndentedString(gesMetadata)).append("\n");
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
