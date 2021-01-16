package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 应用请求次数TOP_n统计信息
 */
public class AppReqCountDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_name")
    
    private String appName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="req_count")
    
    private Integer reqCount;

    public AppReqCountDetail withAppId(String appId) {
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

    public AppReqCountDetail withAppName(String appName) {
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

    public AppReqCountDetail withReqCount(Integer reqCount) {
        this.reqCount = reqCount;
        return this;
    }

    


    /**
     * 请求总次数
     * @return reqCount
     */
    public Integer getReqCount() {
        return reqCount;
    }

    public void setReqCount(Integer reqCount) {
        this.reqCount = reqCount;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppReqCountDetail appReqCountDetail = (AppReqCountDetail) o;
        return Objects.equals(this.appId, appReqCountDetail.appId) &&
            Objects.equals(this.appName, appReqCountDetail.appName) &&
            Objects.equals(this.reqCount, appReqCountDetail.reqCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(appId, appName, reqCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppReqCountDetail {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    reqCount: ").append(toIndentedString(reqCount)).append("\n");
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

