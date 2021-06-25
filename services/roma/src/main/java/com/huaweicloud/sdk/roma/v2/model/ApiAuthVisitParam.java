package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ApiAuthVisitParam
 */
public class ApiAuthVisitParam  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="api_id")
    
    private String apiId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="visit_param")
    
    private String visitParam;

    public ApiAuthVisitParam withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    


    /**
     * 需要授权的API编号
     * @return apiId
     */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    

    public ApiAuthVisitParam withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * 需要授权的APP编号
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    

    public ApiAuthVisitParam withVisitParam(String visitParam) {
        this.visitParam = visitParam;
        return this;
    }

    


    /**
     * 访问参数  支持英文、数字、下划线和中划线，多个参数以英文格式下的逗号隔开，单个参数须以英文或数字结尾且不能重复，且单个参数长度不超过255个字符。
     * @return visitParam
     */
    public String getVisitParam() {
        return visitParam;
    }

    public void setVisitParam(String visitParam) {
        this.visitParam = visitParam;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiAuthVisitParam apiAuthVisitParam = (ApiAuthVisitParam) o;
        return Objects.equals(this.apiId, apiAuthVisitParam.apiId) &&
            Objects.equals(this.appId, apiAuthVisitParam.appId) &&
            Objects.equals(this.visitParam, apiAuthVisitParam.visitParam);
    }
    @Override
    public int hashCode() {
        return Objects.hash(apiId, appId, visitParam);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiAuthVisitParam {\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    visitParam: ").append(toIndentedString(visitParam)).append("\n");
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

