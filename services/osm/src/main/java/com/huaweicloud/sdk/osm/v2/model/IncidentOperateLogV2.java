package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * IncidentOperateLogV2
 */
public class IncidentOperateLogV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="incident_log_id")
    
    private String incidentLogId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="incident_id")
    
    private String incidentId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operate_type")
    
    private Integer operateType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operator_type")
    
    private Integer operatorType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operator_id")
    
    private String operatorId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operator_name")
    
    private String operatorName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operate_desc")
    
    private String operateDesc;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operate_time")
    
    private String operateTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timestamp_operate_time")
    
    private OffsetDateTime timestampOperateTime;

    public IncidentOperateLogV2 withIncidentLogId(String incidentLogId) {
        this.incidentLogId = incidentLogId;
        return this;
    }

    


    /**
     * 工单日志id
     * @return incidentLogId
     */
    public String getIncidentLogId() {
        return incidentLogId;
    }

    public void setIncidentLogId(String incidentLogId) {
        this.incidentLogId = incidentLogId;
    }

    

    public IncidentOperateLogV2 withIncidentId(String incidentId) {
        this.incidentId = incidentId;
        return this;
    }

    


    /**
     * 工单id
     * @return incidentId
     */
    public String getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    

    public IncidentOperateLogV2 withOperateType(Integer operateType) {
        this.operateType = operateType;
        return this;
    }

    


    /**
     * 操作类型
     * minimum: 0
     * maximum: 65535
     * @return operateType
     */
    public Integer getOperateType() {
        return operateType;
    }

    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
    }

    

    public IncidentOperateLogV2 withOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
        return this;
    }

    


    /**
     * 操作员类型
     * minimum: 0
     * maximum: 3
     * @return operatorType
     */
    public Integer getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    

    public IncidentOperateLogV2 withOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }

    


    /**
     * 操作员id
     * @return operatorId
     */
    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    

    public IncidentOperateLogV2 withOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }

    


    /**
     * 操作员名称
     * @return operatorName
     */
    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    

    public IncidentOperateLogV2 withOperateDesc(String operateDesc) {
        this.operateDesc = operateDesc;
        return this;
    }

    


    /**
     * 操作描述
     * @return operateDesc
     */
    public String getOperateDesc() {
        return operateDesc;
    }

    public void setOperateDesc(String operateDesc) {
        this.operateDesc = operateDesc;
    }

    

    public IncidentOperateLogV2 withOperateTime(String operateTime) {
        this.operateTime = operateTime;
        return this;
    }

    


    /**
     * 操作时间
     * @return operateTime
     */
    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    

    public IncidentOperateLogV2 withTimestampOperateTime(OffsetDateTime timestampOperateTime) {
        this.timestampOperateTime = timestampOperateTime;
        return this;
    }

    


    /**
     * 工单操作时间
     * @return timestampOperateTime
     */
    public OffsetDateTime getTimestampOperateTime() {
        return timestampOperateTime;
    }

    public void setTimestampOperateTime(OffsetDateTime timestampOperateTime) {
        this.timestampOperateTime = timestampOperateTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IncidentOperateLogV2 incidentOperateLogV2 = (IncidentOperateLogV2) o;
        return Objects.equals(this.incidentLogId, incidentOperateLogV2.incidentLogId) &&
            Objects.equals(this.incidentId, incidentOperateLogV2.incidentId) &&
            Objects.equals(this.operateType, incidentOperateLogV2.operateType) &&
            Objects.equals(this.operatorType, incidentOperateLogV2.operatorType) &&
            Objects.equals(this.operatorId, incidentOperateLogV2.operatorId) &&
            Objects.equals(this.operatorName, incidentOperateLogV2.operatorName) &&
            Objects.equals(this.operateDesc, incidentOperateLogV2.operateDesc) &&
            Objects.equals(this.operateTime, incidentOperateLogV2.operateTime) &&
            Objects.equals(this.timestampOperateTime, incidentOperateLogV2.timestampOperateTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(incidentLogId, incidentId, operateType, operatorType, operatorId, operatorName, operateDesc, operateTime, timestampOperateTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IncidentOperateLogV2 {\n");
        sb.append("    incidentLogId: ").append(toIndentedString(incidentLogId)).append("\n");
        sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    operatorType: ").append(toIndentedString(operatorType)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    operatorName: ").append(toIndentedString(operatorName)).append("\n");
        sb.append("    operateDesc: ").append(toIndentedString(operateDesc)).append("\n");
        sb.append("    operateTime: ").append(toIndentedString(operateTime)).append("\n");
        sb.append("    timestampOperateTime: ").append(toIndentedString(timestampOperateTime)).append("\n");
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

