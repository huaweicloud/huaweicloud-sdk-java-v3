package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.drs.v3.model.QueryFlowCompareDataResp;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 灾备初始化对象详情
 */
public class QueryStructDetailResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    private String jobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_message")
    
    private String errorMessage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="struct_detail")
    
    private QueryFlowCompareDataResp structDetail = null;

    public QueryStructDetailResp withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 任务ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public QueryStructDetailResp withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * 错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public QueryStructDetailResp withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    


    /**
     * 错误信息
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public QueryStructDetailResp withStructDetail(QueryFlowCompareDataResp structDetail) {
        this.structDetail = structDetail;
        return this;
    }

    public QueryStructDetailResp withStructDetail(Consumer<QueryFlowCompareDataResp> structDetailSetter) {
        if(this.structDetail == null ){
            this.structDetail = new QueryFlowCompareDataResp();
            structDetailSetter.accept(this.structDetail);
        }
        
        return this;
    }


    /**
     * Get structDetail
     * @return structDetail
     */
    public QueryFlowCompareDataResp getStructDetail() {
        return structDetail;
    }

    public void setStructDetail(QueryFlowCompareDataResp structDetail) {
        this.structDetail = structDetail;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryStructDetailResp queryStructDetailResp = (QueryStructDetailResp) o;
        return Objects.equals(this.jobId, queryStructDetailResp.jobId) &&
            Objects.equals(this.errorCode, queryStructDetailResp.errorCode) &&
            Objects.equals(this.errorMessage, queryStructDetailResp.errorMessage) &&
            Objects.equals(this.structDetail, queryStructDetailResp.structDetail);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobId, errorCode, errorMessage, structDetail);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryStructDetailResp {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    structDetail: ").append(toIndentedString(structDetail)).append("\n");
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

