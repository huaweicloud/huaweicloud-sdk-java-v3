package com.huaweicloud.sdk.ges.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 元数据是否加密
 */
public class UploadFromObsReqEncryption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable")
    
    
    private Boolean enable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="master_key_id")
    
    
    private String masterKeyId;

    public UploadFromObsReqEncryption withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    


    /**
     * 是否启动加密特性。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    

    public UploadFromObsReqEncryption withMasterKeyId(String masterKeyId) {
        this.masterKeyId = masterKeyId;
        return this;
    }

    


    /**
     * 对应的project下，华为云数据加密服务创建的用户主密钥ID。
     * @return masterKeyId
     */
    public String getMasterKeyId() {
        return masterKeyId;
    }

    public void setMasterKeyId(String masterKeyId) {
        this.masterKeyId = masterKeyId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadFromObsReqEncryption uploadFromObsReqEncryption = (UploadFromObsReqEncryption) o;
        return Objects.equals(this.enable, uploadFromObsReqEncryption.enable) &&
            Objects.equals(this.masterKeyId, uploadFromObsReqEncryption.masterKeyId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(enable, masterKeyId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadFromObsReqEncryption {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    masterKeyId: ").append(toIndentedString(masterKeyId)).append("\n");
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

