package com.huaweicloud.sdk.ges.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v1.model.GesMetaData;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListGraphMetadatasResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="errorMessage")
    
    
    private String errorMessage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="errorCode")
    
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="gesMetadata")
    
    
    private GesMetaData gesMetadata;

    public ListGraphMetadatasResponse withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    


    /**
     * 系统提示信息，执行成功时，字段可能为空。执行失败时，用于显示错误信息。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    

    public ListGraphMetadatasResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * 系统提示信息，执行成功时，字段可能为空。执行失败时，用于显示错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    

    public ListGraphMetadatasResponse withGesMetadata(GesMetaData gesMetadata) {
        this.gesMetadata = gesMetadata;
        return this;
    }

    public ListGraphMetadatasResponse withGesMetadata(Consumer<GesMetaData> gesMetadataSetter) {
        if(this.gesMetadata == null ){
            this.gesMetadata = new GesMetaData();
            gesMetadataSetter.accept(this.gesMetadata);
        }
        
        return this;
    }


    /**
     * Get gesMetadata
     * @return gesMetadata
     */
    public GesMetaData getGesMetadata() {
        return gesMetadata;
    }

    public void setGesMetadata(GesMetaData gesMetadata) {
        this.gesMetadata = gesMetadata;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListGraphMetadatasResponse listGraphMetadatasResponse = (ListGraphMetadatasResponse) o;
        return Objects.equals(this.errorMessage, listGraphMetadatasResponse.errorMessage) &&
            Objects.equals(this.errorCode, listGraphMetadatasResponse.errorCode) &&
            Objects.equals(this.gesMetadata, listGraphMetadatasResponse.gesMetadata);
    }
    @Override
    public int hashCode() {
        return Objects.hash(errorMessage, errorCode, gesMetadata);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGraphMetadatasResponse {\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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

