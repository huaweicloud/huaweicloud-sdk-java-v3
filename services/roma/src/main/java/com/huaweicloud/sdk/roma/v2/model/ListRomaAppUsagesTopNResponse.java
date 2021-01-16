package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.AppInputThroughputDetail;
import com.huaweicloud.sdk.roma.v2.model.AppOutputThroughputDetail;
import com.huaweicloud.sdk.roma.v2.model.AppReqCountDetail;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListRomaAppUsagesTopNResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="code")
    
    private String code;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="msg")
    
    private String msg;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private Long startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private Long endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_req_count")
    
    private List<AppReqCountDetail> appReqCount = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_input_throughput")
    
    private List<AppInputThroughputDetail> appInputThroughput = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_output_throughput")
    
    private List<AppOutputThroughputDetail> appOutputThroughput = null;
    
    public ListRomaAppUsagesTopNResponse withCode(String code) {
        this.code = code;
        return this;
    }

    


    /**
     * 响应码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ListRomaAppUsagesTopNResponse withMsg(String msg) {
        this.msg = msg;
        return this;
    }

    


    /**
     * 返回消息
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ListRomaAppUsagesTopNResponse withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 统计起始时间UTC的时间戳
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListRomaAppUsagesTopNResponse withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 统计结束时间UTC的时间戳
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListRomaAppUsagesTopNResponse withAppReqCount(List<AppReqCountDetail> appReqCount) {
        this.appReqCount = appReqCount;
        return this;
    }

    
    public ListRomaAppUsagesTopNResponse addAppReqCountItem(AppReqCountDetail appReqCountItem) {
        if (this.appReqCount == null) {
            this.appReqCount = new ArrayList<>();
        }
        this.appReqCount.add(appReqCountItem);
        return this;
    }

    public ListRomaAppUsagesTopNResponse withAppReqCount(Consumer<List<AppReqCountDetail>> appReqCountSetter) {
        if(this.appReqCount == null ){
            this.appReqCount = new ArrayList<>();
        }
        appReqCountSetter.accept(this.appReqCount);
        return this;
    }

    /**
     * API被应用请求次数TOP_n统计信息列表
     * @return appReqCount
     */
    public List<AppReqCountDetail> getAppReqCount() {
        return appReqCount;
    }

    public void setAppReqCount(List<AppReqCountDetail> appReqCount) {
        this.appReqCount = appReqCount;
    }

    public ListRomaAppUsagesTopNResponse withAppInputThroughput(List<AppInputThroughputDetail> appInputThroughput) {
        this.appInputThroughput = appInputThroughput;
        return this;
    }

    
    public ListRomaAppUsagesTopNResponse addAppInputThroughputItem(AppInputThroughputDetail appInputThroughputItem) {
        if (this.appInputThroughput == null) {
            this.appInputThroughput = new ArrayList<>();
        }
        this.appInputThroughput.add(appInputThroughputItem);
        return this;
    }

    public ListRomaAppUsagesTopNResponse withAppInputThroughput(Consumer<List<AppInputThroughputDetail>> appInputThroughputSetter) {
        if(this.appInputThroughput == null ){
            this.appInputThroughput = new ArrayList<>();
        }
        appInputThroughputSetter.accept(this.appInputThroughput);
        return this;
    }

    /**
     * API被应用请求上行吞吐量TOP_n统计信息列表
     * @return appInputThroughput
     */
    public List<AppInputThroughputDetail> getAppInputThroughput() {
        return appInputThroughput;
    }

    public void setAppInputThroughput(List<AppInputThroughputDetail> appInputThroughput) {
        this.appInputThroughput = appInputThroughput;
    }

    public ListRomaAppUsagesTopNResponse withAppOutputThroughput(List<AppOutputThroughputDetail> appOutputThroughput) {
        this.appOutputThroughput = appOutputThroughput;
        return this;
    }

    
    public ListRomaAppUsagesTopNResponse addAppOutputThroughputItem(AppOutputThroughputDetail appOutputThroughputItem) {
        if (this.appOutputThroughput == null) {
            this.appOutputThroughput = new ArrayList<>();
        }
        this.appOutputThroughput.add(appOutputThroughputItem);
        return this;
    }

    public ListRomaAppUsagesTopNResponse withAppOutputThroughput(Consumer<List<AppOutputThroughputDetail>> appOutputThroughputSetter) {
        if(this.appOutputThroughput == null ){
            this.appOutputThroughput = new ArrayList<>();
        }
        appOutputThroughputSetter.accept(this.appOutputThroughput);
        return this;
    }

    /**
     * API被应用请求下行吞吐量TOP_n统计信息列表
     * @return appOutputThroughput
     */
    public List<AppOutputThroughputDetail> getAppOutputThroughput() {
        return appOutputThroughput;
    }

    public void setAppOutputThroughput(List<AppOutputThroughputDetail> appOutputThroughput) {
        this.appOutputThroughput = appOutputThroughput;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRomaAppUsagesTopNResponse listRomaAppUsagesTopNResponse = (ListRomaAppUsagesTopNResponse) o;
        return Objects.equals(this.code, listRomaAppUsagesTopNResponse.code) &&
            Objects.equals(this.msg, listRomaAppUsagesTopNResponse.msg) &&
            Objects.equals(this.startTime, listRomaAppUsagesTopNResponse.startTime) &&
            Objects.equals(this.endTime, listRomaAppUsagesTopNResponse.endTime) &&
            Objects.equals(this.appReqCount, listRomaAppUsagesTopNResponse.appReqCount) &&
            Objects.equals(this.appInputThroughput, listRomaAppUsagesTopNResponse.appInputThroughput) &&
            Objects.equals(this.appOutputThroughput, listRomaAppUsagesTopNResponse.appOutputThroughput);
    }
    @Override
    public int hashCode() {
        return Objects.hash(code, msg, startTime, endTime, appReqCount, appInputThroughput, appOutputThroughput);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRomaAppUsagesTopNResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    appReqCount: ").append(toIndentedString(appReqCount)).append("\n");
        sb.append("    appInputThroughput: ").append(toIndentedString(appInputThroughput)).append("\n");
        sb.append("    appOutputThroughput: ").append(toIndentedString(appOutputThroughput)).append("\n");
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

