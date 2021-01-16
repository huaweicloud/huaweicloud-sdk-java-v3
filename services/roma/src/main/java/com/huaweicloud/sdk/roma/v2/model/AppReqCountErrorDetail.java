package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 应用请求错误次数TOP_n统计信息列表
 */
public class AppReqCountErrorDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_name")
    
    private String appName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="req_count_error")
    
    private Integer reqCountError;

    public AppReqCountErrorDetail withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * 调用应用编号
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public AppReqCountErrorDetail withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    


    /**
     * 应用名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public AppReqCountErrorDetail withReqCountError(Integer reqCountError) {
        this.reqCountError = reqCountError;
        return this;
    }

    


    /**
     * 请求错误次数
     * @return reqCountError
     */
    public Integer getReqCountError() {
        return reqCountError;
    }

    public void setReqCountError(Integer reqCountError) {
        this.reqCountError = reqCountError;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppReqCountErrorDetail appReqCountErrorDetail = (AppReqCountErrorDetail) o;
        return Objects.equals(this.appId, appReqCountErrorDetail.appId) &&
            Objects.equals(this.appName, appReqCountErrorDetail.appName) &&
            Objects.equals(this.reqCountError, appReqCountErrorDetail.reqCountError);
    }
    @Override
    public int hashCode() {
        return Objects.hash(appId, appName, reqCountError);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppReqCountErrorDetail {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    reqCountError: ").append(toIndentedString(reqCountError)).append("\n");
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

