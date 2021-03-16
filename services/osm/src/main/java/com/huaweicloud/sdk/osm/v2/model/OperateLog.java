package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * OperateLog
 */
public class OperateLog  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="oper")
    
    private String oper;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operate_time")
    
    private String operateTime;

    public OperateLog withOper(String oper) {
        this.oper = oper;
        return this;
    }

    


    /**
     * 操作指令
     * @return oper
     */
    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    

    public OperateLog withOperateTime(String operateTime) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OperateLog operateLog = (OperateLog) o;
        return Objects.equals(this.oper, operateLog.oper) &&
            Objects.equals(this.operateTime, operateLog.operateTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(oper, operateTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperateLog {\n");
        sb.append("    oper: ").append(toIndentedString(oper)).append("\n");
        sb.append("    operateTime: ").append(toIndentedString(operateTime)).append("\n");
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

