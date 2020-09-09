package com.huaweicloud.sdk.kafka.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UpdateSinkTaskQuotaReq
 */
public class UpdateSinkTaskQuotaReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sink_max_tasks")
    
    private String sinkMaxTasks;

    public UpdateSinkTaskQuotaReq withSinkMaxTasks(String sinkMaxTasks) {
        this.sinkMaxTasks = sinkMaxTasks;
        return this;
    }

    


    /**
     * 转储任务的总个数。 
     * @return sinkMaxTasks
     */
    public String getSinkMaxTasks() {
        return sinkMaxTasks;
    }

    public void setSinkMaxTasks(String sinkMaxTasks) {
        this.sinkMaxTasks = sinkMaxTasks;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateSinkTaskQuotaReq updateSinkTaskQuotaReq = (UpdateSinkTaskQuotaReq) o;
        return Objects.equals(this.sinkMaxTasks, updateSinkTaskQuotaReq.sinkMaxTasks);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sinkMaxTasks);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSinkTaskQuotaReq {\n");
        sb.append("    sinkMaxTasks: ").append(toIndentedString(sinkMaxTasks)).append("\n");
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

