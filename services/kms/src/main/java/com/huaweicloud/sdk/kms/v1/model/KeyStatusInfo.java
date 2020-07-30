package com.huaweicloud.sdk.kms.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * KeyStatusInfo
 */
public class KeyStatusInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_id")
    
    private String keyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_state")
    
    private String keyState;

    public KeyStatusInfo withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    


    /**
     * 密钥ID
     * @return keyId
     */
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public KeyStatusInfo withKeyState(String keyState) {
        this.keyState = keyState;
        return this;
    }

    


    /**
     * 密钥状态： - 2为启用状态 - 3为禁用状态 - 4为计划删除状态 - 5为等待导入状态 - 7为冻结状态
     * @return keyState
     */
    public String getKeyState() {
        return keyState;
    }

    public void setKeyState(String keyState) {
        this.keyState = keyState;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeyStatusInfo keyStatusInfo = (KeyStatusInfo) o;
        return Objects.equals(this.keyId, keyStatusInfo.keyId) &&
            Objects.equals(this.keyState, keyStatusInfo.keyState);
    }
    @Override
    public int hashCode() {
        return Objects.hash(keyId, keyState);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeyStatusInfo {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    keyState: ").append(toIndentedString(keyState)).append("\n");
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

