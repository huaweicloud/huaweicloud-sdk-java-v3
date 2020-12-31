package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.drs.v3.model.CompareTaskListResult;
import com.huaweicloud.sdk.drs.v3.model.ContentCompareResult;
import com.huaweicloud.sdk.drs.v3.model.LineCompareResult;
import com.huaweicloud.sdk.drs.v3.model.ObjectCompareResult;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class QueryCompareResultResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    private String jobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="object_level_compare_results")
    
    private ObjectCompareResult objectLevelCompareResults = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="line_compare_results")
    
    private LineCompareResult lineCompareResults = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content_compare_results")
    
    private ContentCompareResult contentCompareResults = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="compare_task_list_results")
    
    private CompareTaskListResult compareTaskListResults = null;

    public QueryCompareResultResp withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 任务id。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public QueryCompareResultResp withObjectLevelCompareResults(ObjectCompareResult objectLevelCompareResults) {
        this.objectLevelCompareResults = objectLevelCompareResults;
        return this;
    }

    public QueryCompareResultResp withObjectLevelCompareResults(Consumer<ObjectCompareResult> objectLevelCompareResultsSetter) {
        if(this.objectLevelCompareResults == null ){
            this.objectLevelCompareResults = new ObjectCompareResult();
            objectLevelCompareResultsSetter.accept(this.objectLevelCompareResults);
        }
        
        return this;
    }


    /**
     * Get objectLevelCompareResults
     * @return objectLevelCompareResults
     */
    public ObjectCompareResult getObjectLevelCompareResults() {
        return objectLevelCompareResults;
    }

    public void setObjectLevelCompareResults(ObjectCompareResult objectLevelCompareResults) {
        this.objectLevelCompareResults = objectLevelCompareResults;
    }

    public QueryCompareResultResp withLineCompareResults(LineCompareResult lineCompareResults) {
        this.lineCompareResults = lineCompareResults;
        return this;
    }

    public QueryCompareResultResp withLineCompareResults(Consumer<LineCompareResult> lineCompareResultsSetter) {
        if(this.lineCompareResults == null ){
            this.lineCompareResults = new LineCompareResult();
            lineCompareResultsSetter.accept(this.lineCompareResults);
        }
        
        return this;
    }


    /**
     * Get lineCompareResults
     * @return lineCompareResults
     */
    public LineCompareResult getLineCompareResults() {
        return lineCompareResults;
    }

    public void setLineCompareResults(LineCompareResult lineCompareResults) {
        this.lineCompareResults = lineCompareResults;
    }

    public QueryCompareResultResp withContentCompareResults(ContentCompareResult contentCompareResults) {
        this.contentCompareResults = contentCompareResults;
        return this;
    }

    public QueryCompareResultResp withContentCompareResults(Consumer<ContentCompareResult> contentCompareResultsSetter) {
        if(this.contentCompareResults == null ){
            this.contentCompareResults = new ContentCompareResult();
            contentCompareResultsSetter.accept(this.contentCompareResults);
        }
        
        return this;
    }


    /**
     * Get contentCompareResults
     * @return contentCompareResults
     */
    public ContentCompareResult getContentCompareResults() {
        return contentCompareResults;
    }

    public void setContentCompareResults(ContentCompareResult contentCompareResults) {
        this.contentCompareResults = contentCompareResults;
    }

    public QueryCompareResultResp withCompareTaskListResults(CompareTaskListResult compareTaskListResults) {
        this.compareTaskListResults = compareTaskListResults;
        return this;
    }

    public QueryCompareResultResp withCompareTaskListResults(Consumer<CompareTaskListResult> compareTaskListResultsSetter) {
        if(this.compareTaskListResults == null ){
            this.compareTaskListResults = new CompareTaskListResult();
            compareTaskListResultsSetter.accept(this.compareTaskListResults);
        }
        
        return this;
    }


    /**
     * Get compareTaskListResults
     * @return compareTaskListResults
     */
    public CompareTaskListResult getCompareTaskListResults() {
        return compareTaskListResults;
    }

    public void setCompareTaskListResults(CompareTaskListResult compareTaskListResults) {
        this.compareTaskListResults = compareTaskListResults;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryCompareResultResp queryCompareResultResp = (QueryCompareResultResp) o;
        return Objects.equals(this.jobId, queryCompareResultResp.jobId) &&
            Objects.equals(this.objectLevelCompareResults, queryCompareResultResp.objectLevelCompareResults) &&
            Objects.equals(this.lineCompareResults, queryCompareResultResp.lineCompareResults) &&
            Objects.equals(this.contentCompareResults, queryCompareResultResp.contentCompareResults) &&
            Objects.equals(this.compareTaskListResults, queryCompareResultResp.compareTaskListResults);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobId, objectLevelCompareResults, lineCompareResults, contentCompareResults, compareTaskListResults);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryCompareResultResp {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    objectLevelCompareResults: ").append(toIndentedString(objectLevelCompareResults)).append("\n");
        sb.append("    lineCompareResults: ").append(toIndentedString(lineCompareResults)).append("\n");
        sb.append("    contentCompareResults: ").append(toIndentedString(contentCompareResults)).append("\n");
        sb.append("    compareTaskListResults: ").append(toIndentedString(compareTaskListResults)).append("\n");
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

