package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class DebugLiveDataApiV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="test_status_code")
    
    private String testStatusCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="test_request")
    
    private String testRequest;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="test_used_time")
    
    private Integer testUsedTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="test_operator")
    
    private String testOperator;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="test_response")
    
    private String testResponse;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="test_method")
    
    private String testMethod;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="test_id")
    
    private Integer testId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="test_date")
    
    private OffsetDateTime testDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ld_api_id")
    
    private String ldApiId;

    public DebugLiveDataApiV2Response withTestStatusCode(String testStatusCode) {
        this.testStatusCode = testStatusCode;
        return this;
    }

    


    /**
     * 测试返回的状态码
     * @return testStatusCode
     */
    public String getTestStatusCode() {
        return testStatusCode;
    }

    public void setTestStatusCode(String testStatusCode) {
        this.testStatusCode = testStatusCode;
    }

    

    public DebugLiveDataApiV2Response withTestRequest(String testRequest) {
        this.testRequest = testRequest;
        return this;
    }

    


    /**
     * 测试的请求内容
     * @return testRequest
     */
    public String getTestRequest() {
        return testRequest;
    }

    public void setTestRequest(String testRequest) {
        this.testRequest = testRequest;
    }

    

    public DebugLiveDataApiV2Response withTestUsedTime(Integer testUsedTime) {
        this.testUsedTime = testUsedTime;
        return this;
    }

    


    /**
     * 测试耗时
     * @return testUsedTime
     */
    public Integer getTestUsedTime() {
        return testUsedTime;
    }

    public void setTestUsedTime(Integer testUsedTime) {
        this.testUsedTime = testUsedTime;
    }

    

    public DebugLiveDataApiV2Response withTestOperator(String testOperator) {
        this.testOperator = testOperator;
        return this;
    }

    


    /**
     * 测试者的项目编号
     * @return testOperator
     */
    public String getTestOperator() {
        return testOperator;
    }

    public void setTestOperator(String testOperator) {
        this.testOperator = testOperator;
    }

    

    public DebugLiveDataApiV2Response withTestResponse(String testResponse) {
        this.testResponse = testResponse;
        return this;
    }

    


    /**
     * 测试的响应内容
     * @return testResponse
     */
    public String getTestResponse() {
        return testResponse;
    }

    public void setTestResponse(String testResponse) {
        this.testResponse = testResponse;
    }

    

    public DebugLiveDataApiV2Response withTestMethod(String testMethod) {
        this.testMethod = testMethod;
        return this;
    }

    


    /**
     * 测试的请求方法
     * @return testMethod
     */
    public String getTestMethod() {
        return testMethod;
    }

    public void setTestMethod(String testMethod) {
        this.testMethod = testMethod;
    }

    

    public DebugLiveDataApiV2Response withTestId(Integer testId) {
        this.testId = testId;
        return this;
    }

    


    /**
     * 测试编号
     * @return testId
     */
    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    

    public DebugLiveDataApiV2Response withTestDate(OffsetDateTime testDate) {
        this.testDate = testDate;
        return this;
    }

    


    /**
     * 测试时间
     * @return testDate
     */
    public OffsetDateTime getTestDate() {
        return testDate;
    }

    public void setTestDate(OffsetDateTime testDate) {
        this.testDate = testDate;
    }

    

    public DebugLiveDataApiV2Response withLdApiId(String ldApiId) {
        this.ldApiId = ldApiId;
        return this;
    }

    


    /**
     * 后端API编号
     * @return ldApiId
     */
    public String getLdApiId() {
        return ldApiId;
    }

    public void setLdApiId(String ldApiId) {
        this.ldApiId = ldApiId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DebugLiveDataApiV2Response debugLiveDataApiV2Response = (DebugLiveDataApiV2Response) o;
        return Objects.equals(this.testStatusCode, debugLiveDataApiV2Response.testStatusCode) &&
            Objects.equals(this.testRequest, debugLiveDataApiV2Response.testRequest) &&
            Objects.equals(this.testUsedTime, debugLiveDataApiV2Response.testUsedTime) &&
            Objects.equals(this.testOperator, debugLiveDataApiV2Response.testOperator) &&
            Objects.equals(this.testResponse, debugLiveDataApiV2Response.testResponse) &&
            Objects.equals(this.testMethod, debugLiveDataApiV2Response.testMethod) &&
            Objects.equals(this.testId, debugLiveDataApiV2Response.testId) &&
            Objects.equals(this.testDate, debugLiveDataApiV2Response.testDate) &&
            Objects.equals(this.ldApiId, debugLiveDataApiV2Response.ldApiId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(testStatusCode, testRequest, testUsedTime, testOperator, testResponse, testMethod, testId, testDate, ldApiId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DebugLiveDataApiV2Response {\n");
        sb.append("    testStatusCode: ").append(toIndentedString(testStatusCode)).append("\n");
        sb.append("    testRequest: ").append(toIndentedString(testRequest)).append("\n");
        sb.append("    testUsedTime: ").append(toIndentedString(testUsedTime)).append("\n");
        sb.append("    testOperator: ").append(toIndentedString(testOperator)).append("\n");
        sb.append("    testResponse: ").append(toIndentedString(testResponse)).append("\n");
        sb.append("    testMethod: ").append(toIndentedString(testMethod)).append("\n");
        sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
        sb.append("    testDate: ").append(toIndentedString(testDate)).append("\n");
        sb.append("    ldApiId: ").append(toIndentedString(ldApiId)).append("\n");
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

