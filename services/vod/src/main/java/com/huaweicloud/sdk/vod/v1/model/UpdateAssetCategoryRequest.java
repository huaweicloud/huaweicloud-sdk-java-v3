package com.huaweicloud.sdk.vod.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vod.v1.model.UpdateCategoryReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateAssetCategoryRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Authorization")
    
    private String authorization;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Sdk-Date")
    
    private String xSdkDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateCategoryReq body;

    public UpdateAssetCategoryRequest withAuthorization(String authorization) {
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

    

    public UpdateAssetCategoryRequest withXSdkDate(String xSdkDate) {
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

    

    public UpdateAssetCategoryRequest withBody(UpdateCategoryReq body) {
        this.body = body;
        return this;
    }

    public UpdateAssetCategoryRequest withBody(Consumer<UpdateCategoryReq> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateCategoryReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateCategoryReq getBody() {
        return body;
    }

    public void setBody(UpdateCategoryReq body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAssetCategoryRequest updateAssetCategoryRequest = (UpdateAssetCategoryRequest) o;
        return Objects.equals(this.authorization, updateAssetCategoryRequest.authorization) &&
            Objects.equals(this.xSdkDate, updateAssetCategoryRequest.xSdkDate) &&
            Objects.equals(this.body, updateAssetCategoryRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(authorization, xSdkDate, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAssetCategoryRequest {\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    xSdkDate: ").append(toIndentedString(xSdkDate)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

