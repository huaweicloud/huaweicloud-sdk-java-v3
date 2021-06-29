package com.huaweicloud.sdk.vod.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowAssetCipherResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="asset_id")
    
    private String assetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edk")
    
    private String edk;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dk")
    
    private String dk;

    public ShowAssetCipherResponse withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    


    /**
     * 媒资ID。
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    

    public ShowAssetCipherResponse withEdk(String edk) {
        this.edk = edk;
        return this;
    }

    


    /**
     * 密钥密文。
     * @return edk
     */
    public String getEdk() {
        return edk;
    }

    public void setEdk(String edk) {
        this.edk = edk;
    }

    

    public ShowAssetCipherResponse withDk(String dk) {
        this.dk = dk;
        return this;
    }

    


    /**
     * 密钥明文。
     * @return dk
     */
    public String getDk() {
        return dk;
    }

    public void setDk(String dk) {
        this.dk = dk;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAssetCipherResponse showAssetCipherResponse = (ShowAssetCipherResponse) o;
        return Objects.equals(this.assetId, showAssetCipherResponse.assetId) &&
            Objects.equals(this.edk, showAssetCipherResponse.edk) &&
            Objects.equals(this.dk, showAssetCipherResponse.dk);
    }
    @Override
    public int hashCode() {
        return Objects.hash(assetId, edk, dk);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAssetCipherResponse {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    edk: ").append(toIndentedString(edk)).append("\n");
        sb.append("    dk: ").append(toIndentedString(dk)).append("\n");
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

