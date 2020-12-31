package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.drs.v3.model.ObjectCompareResultDetails;
import com.huaweicloud.sdk.drs.v3.model.ObjectCompareResultOverview;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class ObjectCompareResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="compare_task_id")
    
    private String compareTaskId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="object_compare_overview")
    
    private List<ObjectCompareResultOverview> objectCompareOverview = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="object_compare_details")
    
    private Map<String, List<ObjectCompareResultDetails>> objectCompareDetails = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_msg")
    
    private String errorMsg;

    public ObjectCompareResult withCompareTaskId(String compareTaskId) {
        this.compareTaskId = compareTaskId;
        return this;
    }

    


    /**
     * 对象级对比任务的id。
     * @return compareTaskId
     */
    public String getCompareTaskId() {
        return compareTaskId;
    }

    public void setCompareTaskId(String compareTaskId) {
        this.compareTaskId = compareTaskId;
    }

    public ObjectCompareResult withObjectCompareOverview(List<ObjectCompareResultOverview> objectCompareOverview) {
        this.objectCompareOverview = objectCompareOverview;
        return this;
    }

    
    public ObjectCompareResult addObjectCompareOverviewItem(ObjectCompareResultOverview objectCompareOverviewItem) {
        if (this.objectCompareOverview == null) {
            this.objectCompareOverview = new ArrayList<>();
        }
        this.objectCompareOverview.add(objectCompareOverviewItem);
        return this;
    }

    public ObjectCompareResult withObjectCompareOverview(Consumer<List<ObjectCompareResultOverview>> objectCompareOverviewSetter) {
        if(this.objectCompareOverview == null ){
            this.objectCompareOverview = new ArrayList<>();
        }
        objectCompareOverviewSetter.accept(this.objectCompareOverview);
        return this;
    }

    /**
     * 对象对比结果概览。
     * @return objectCompareOverview
     */
    public List<ObjectCompareResultOverview> getObjectCompareOverview() {
        return objectCompareOverview;
    }

    public void setObjectCompareOverview(List<ObjectCompareResultOverview> objectCompareOverview) {
        this.objectCompareOverview = objectCompareOverview;
    }

    public ObjectCompareResult withObjectCompareDetails(Map<String, List<ObjectCompareResultDetails>> objectCompareDetails) {
        this.objectCompareDetails = objectCompareDetails;
        return this;
    }

    

    public ObjectCompareResult putObjectCompareDetailsItem(String key, List<ObjectCompareResultDetails> objectCompareDetailsItem) {
         if (this.objectCompareDetails == null) {
            this.objectCompareDetails = new HashMap<>();
         }
        this.objectCompareDetails.put(key, objectCompareDetailsItem);
        return this;
    }

    public ObjectCompareResult withObjectCompareDetails(Consumer<Map<String, List<ObjectCompareResultDetails>>> objectCompareDetailsSetter) {
        if(this.objectCompareDetails == null ){
            this.objectCompareDetails = new HashMap<>();
        }
        objectCompareDetailsSetter.accept(this.objectCompareDetails);
        return this;
    }
    /**
     * 对象对比结果详情。KEY值为对象对比结果概览中的对象类型。
     * @return objectCompareDetails
     */
    public Map<String, List<ObjectCompareResultDetails>> getObjectCompareDetails() {
        return objectCompareDetails;
    }

    public void setObjectCompareDetails(Map<String, List<ObjectCompareResultDetails>> objectCompareDetails) {
        this.objectCompareDetails = objectCompareDetails;
    }

    public ObjectCompareResult withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * 错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ObjectCompareResult withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    


    /**
     * 错误信息。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ObjectCompareResult objectCompareResult = (ObjectCompareResult) o;
        return Objects.equals(this.compareTaskId, objectCompareResult.compareTaskId) &&
            Objects.equals(this.objectCompareOverview, objectCompareResult.objectCompareOverview) &&
            Objects.equals(this.objectCompareDetails, objectCompareResult.objectCompareDetails) &&
            Objects.equals(this.errorCode, objectCompareResult.errorCode) &&
            Objects.equals(this.errorMsg, objectCompareResult.errorMsg);
    }
    @Override
    public int hashCode() {
        return Objects.hash(compareTaskId, objectCompareOverview, objectCompareDetails, errorCode, errorMsg);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObjectCompareResult {\n");
        sb.append("    compareTaskId: ").append(toIndentedString(compareTaskId)).append("\n");
        sb.append("    objectCompareOverview: ").append(toIndentedString(objectCompareOverview)).append("\n");
        sb.append("    objectCompareDetails: ").append(toIndentedString(objectCompareDetails)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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

