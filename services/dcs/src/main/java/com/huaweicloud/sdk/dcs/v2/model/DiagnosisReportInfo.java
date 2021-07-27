package com.huaweicloud.sdk.dcs.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DiagnosisReportInfo
 */
public class DiagnosisReportInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="report_id")
    
    private String reportId;
    /**
     * 诊断任务状态
     */
    public static final class StatusEnum {

        
        /**
         * Enum DIAGNOSING for value: "diagnosing"
         */
        public static final StatusEnum DIAGNOSING = new StatusEnum("diagnosing");
        
        /**
         * Enum FINISHED for value: "finished"
         */
        public static final StatusEnum FINISHED = new StatusEnum("finished");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("diagnosing", DIAGNOSING);
            map.put("finished", FINISHED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private StatusEnum status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="begin_time")
    
    private String beginTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private String createdAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_num")
    
    private Integer nodeNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="abnormal_item_sum")
    
    private Integer abnormalItemSum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="failed_item_sum")
    
    private Integer failedItemSum;

    public DiagnosisReportInfo withReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }

    


    /**
     * 诊断报告ID
     * @return reportId
     */
    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    

    public DiagnosisReportInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 诊断任务状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public DiagnosisReportInfo withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    


    /**
     * 诊断时间段的开始时间。格式为：2017-03-31T12:24:46.297Z
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    

    public DiagnosisReportInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 诊断时间段的结束时间。格式为：2017-03-31T12:24:46.297Z
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    

    public DiagnosisReportInfo withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * 诊断报告创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    

    public DiagnosisReportInfo withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    


    /**
     * 参与诊断的节点个数
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    

    public DiagnosisReportInfo withAbnormalItemSum(Integer abnormalItemSum) {
        this.abnormalItemSum = abnormalItemSum;
        return this;
    }

    


    /**
     * 诊断结果为异常的诊断项总数
     * @return abnormalItemSum
     */
    public Integer getAbnormalItemSum() {
        return abnormalItemSum;
    }

    public void setAbnormalItemSum(Integer abnormalItemSum) {
        this.abnormalItemSum = abnormalItemSum;
    }

    

    public DiagnosisReportInfo withFailedItemSum(Integer failedItemSum) {
        this.failedItemSum = failedItemSum;
        return this;
    }

    


    /**
     * 诊断失败的诊断项总数
     * @return failedItemSum
     */
    public Integer getFailedItemSum() {
        return failedItemSum;
    }

    public void setFailedItemSum(Integer failedItemSum) {
        this.failedItemSum = failedItemSum;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiagnosisReportInfo diagnosisReportInfo = (DiagnosisReportInfo) o;
        return Objects.equals(this.reportId, diagnosisReportInfo.reportId) &&
            Objects.equals(this.status, diagnosisReportInfo.status) &&
            Objects.equals(this.beginTime, diagnosisReportInfo.beginTime) &&
            Objects.equals(this.endTime, diagnosisReportInfo.endTime) &&
            Objects.equals(this.createdAt, diagnosisReportInfo.createdAt) &&
            Objects.equals(this.nodeNum, diagnosisReportInfo.nodeNum) &&
            Objects.equals(this.abnormalItemSum, diagnosisReportInfo.abnormalItemSum) &&
            Objects.equals(this.failedItemSum, diagnosisReportInfo.failedItemSum);
    }
    @Override
    public int hashCode() {
        return Objects.hash(reportId, status, beginTime, endTime, createdAt, nodeNum, abnormalItemSum, failedItemSum);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiagnosisReportInfo {\n");
        sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    abnormalItemSum: ").append(toIndentedString(abnormalItemSum)).append("\n");
        sb.append("    failedItemSum: ").append(toIndentedString(failedItemSum)).append("\n");
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

