package com.huaweicloud.sdk.bssintl.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CustomerErrorDetail
 */
public class CustomerErrorDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_msg")
    
    private String errorMsg;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;

    public CustomerErrorDetail withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * |参数名称：返回码。具体请参见表 未命名。注意，这个时候的状态码全部是200| |参数约束及描述：返回码。具体请参见表 未命名。注意，这个时候的状态码全部是200|
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    

    public CustomerErrorDetail withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    


    /**
     * |参数名称：返回码的描述信息。| |参数约束及描述：返回码的描述信息。|
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    

    public CustomerErrorDetail withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * |参数名称：标示ID。该接口对应的是customerId。| |参数约束及描述：标示ID。该接口对应的是customerId。|
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomerErrorDetail customerErrorDetail = (CustomerErrorDetail) o;
        return Objects.equals(this.errorCode, customerErrorDetail.errorCode) &&
            Objects.equals(this.errorMsg, customerErrorDetail.errorMsg) &&
            Objects.equals(this.id, customerErrorDetail.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(errorCode, errorMsg, id);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerErrorDetail {\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

