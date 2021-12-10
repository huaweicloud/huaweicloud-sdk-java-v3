package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 秒级监控修改请求
 */
public class TaurusModifyInstanceMonitorRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="period")
    
    
    private String period;

    public TaurusModifyInstanceMonitorRequestBody withPeriod(String period) {
        this.period = period;
        return this;
    }

    


    /**
     * 采集周期。  取值： 0表示实例秒级监控关闭； 1表示实例秒级监控开启，采集周期为1s； 5表示实例秒级监控开启，采集周期为5s。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaurusModifyInstanceMonitorRequestBody taurusModifyInstanceMonitorRequestBody = (TaurusModifyInstanceMonitorRequestBody) o;
        return Objects.equals(this.period, taurusModifyInstanceMonitorRequestBody.period);
    }
    @Override
    public int hashCode() {
        return Objects.hash(period);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaurusModifyInstanceMonitorRequestBody {\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
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

