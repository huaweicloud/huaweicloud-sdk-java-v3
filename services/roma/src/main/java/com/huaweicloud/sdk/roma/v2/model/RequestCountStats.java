package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RequestCountStats
 */
public class RequestCountStats  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="req_count")
    
    private Integer reqCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="req_count2xx")
    
    private Integer reqCount2xx;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="req_count4xx")
    
    private Integer reqCount4xx;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="req_count5xx")
    
    private Integer reqCount5xx;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="req_count_error")
    
    private Integer reqCountError;

    public RequestCountStats withReqCount(Integer reqCount) {
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

    

    public RequestCountStats withReqCount2xx(Integer reqCount2xx) {
        this.reqCount2xx = reqCount2xx;
        return this;
    }

    


    /**
     * 2xx响应码总次数
     * @return reqCount2xx
     */
    public Integer getReqCount2xx() {
        return reqCount2xx;
    }

    public void setReqCount2xx(Integer reqCount2xx) {
        this.reqCount2xx = reqCount2xx;
    }

    

    public RequestCountStats withReqCount4xx(Integer reqCount4xx) {
        this.reqCount4xx = reqCount4xx;
        return this;
    }

    


    /**
     * 4xx响应码总次数
     * @return reqCount4xx
     */
    public Integer getReqCount4xx() {
        return reqCount4xx;
    }

    public void setReqCount4xx(Integer reqCount4xx) {
        this.reqCount4xx = reqCount4xx;
    }

    

    public RequestCountStats withReqCount5xx(Integer reqCount5xx) {
        this.reqCount5xx = reqCount5xx;
        return this;
    }

    


    /**
     * 5xx响应码总次数
     * @return reqCount5xx
     */
    public Integer getReqCount5xx() {
        return reqCount5xx;
    }

    public void setReqCount5xx(Integer reqCount5xx) {
        this.reqCount5xx = reqCount5xx;
    }

    

    public RequestCountStats withReqCountError(Integer reqCountError) {
        this.reqCountError = reqCountError;
        return this;
    }

    


    /**
     * 错误次数
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
        RequestCountStats requestCountStats = (RequestCountStats) o;
        return Objects.equals(this.reqCount, requestCountStats.reqCount) &&
            Objects.equals(this.reqCount2xx, requestCountStats.reqCount2xx) &&
            Objects.equals(this.reqCount4xx, requestCountStats.reqCount4xx) &&
            Objects.equals(this.reqCount5xx, requestCountStats.reqCount5xx) &&
            Objects.equals(this.reqCountError, requestCountStats.reqCountError);
    }
    @Override
    public int hashCode() {
        return Objects.hash(reqCount, reqCount2xx, reqCount4xx, reqCount5xx, reqCountError);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RequestCountStats {\n");
        sb.append("    reqCount: ").append(toIndentedString(reqCount)).append("\n");
        sb.append("    reqCount2xx: ").append(toIndentedString(reqCount2xx)).append("\n");
        sb.append("    reqCount4xx: ").append(toIndentedString(reqCount4xx)).append("\n");
        sb.append("    reqCount5xx: ").append(toIndentedString(reqCount5xx)).append("\n");
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

