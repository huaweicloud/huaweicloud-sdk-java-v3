package com.huaweicloud.sdk.vod.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteAssetsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Authorization")
    
    private String authorization;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Sdk-Date")
    
    private String xSdkDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="asset_id")
    
    private List<String> assetId = null;
    
    public DeleteAssetsRequest withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    


    /**
     * 使用AK/SK方式认证时必选，携带的鉴权信息。 
     * @return authorization
     */
    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    

    public DeleteAssetsRequest withXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
        return this;
    }

    


    /**
     * 使用AK/SK方式认证时必选，请求的发生时间。 
     * @return xSdkDate
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Sdk-Date")
    public String getXSdkDate() {
        return xSdkDate;
    }

    public void setXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
    }

    

    public DeleteAssetsRequest withAssetId(List<String> assetId) {
        this.assetId = assetId;
        return this;
    }

    
    public DeleteAssetsRequest addAssetIdItem(String assetIdItem) {
        if(this.assetId == null) {
            this.assetId = new ArrayList<>();
        }
        this.assetId.add(assetIdItem);
        return this;
    }

    public DeleteAssetsRequest withAssetId(Consumer<List<String>> assetIdSetter) {
        if(this.assetId == null) {
            this.assetId = new ArrayList<>();
        }
        assetIdSetter.accept(this.assetId);
        return this;
    }

    /**
     * 媒资ID，支持一次删除多个媒资，批量删除时以逗号分隔。
     * @return assetId
     */
    public List<String> getAssetId() {
        return assetId;
    }

    public void setAssetId(List<String> assetId) {
        this.assetId = assetId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteAssetsRequest deleteAssetsRequest = (DeleteAssetsRequest) o;
        return Objects.equals(this.authorization, deleteAssetsRequest.authorization) &&
            Objects.equals(this.xSdkDate, deleteAssetsRequest.xSdkDate) &&
            Objects.equals(this.assetId, deleteAssetsRequest.assetId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(authorization, xSdkDate, assetId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAssetsRequest {\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    xSdkDate: ").append(toIndentedString(xSdkDate)).append("\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
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

