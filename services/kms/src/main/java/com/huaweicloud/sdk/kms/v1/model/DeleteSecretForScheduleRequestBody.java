package com.huaweicloud.sdk.kms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DeleteSecretForScheduleRequestBody
 */
public class DeleteSecretForScheduleRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="recovery_window_in_days")
    
    private Integer recoveryWindowInDays;

    public DeleteSecretForScheduleRequestBody withRecoveryWindowInDays(Integer recoveryWindowInDays) {
        this.recoveryWindowInDays = recoveryWindowInDays;
        return this;
    }

    


    /**
     * 创建定时删除凭据的任务，且指定可恢复的天数。  约束：7~30。  默认值：30。 
     * minimum: 7
     * maximum: 30
     * @return recoveryWindowInDays
     */
    public Integer getRecoveryWindowInDays() {
        return recoveryWindowInDays;
    }

    public void setRecoveryWindowInDays(Integer recoveryWindowInDays) {
        this.recoveryWindowInDays = recoveryWindowInDays;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteSecretForScheduleRequestBody deleteSecretForScheduleRequestBody = (DeleteSecretForScheduleRequestBody) o;
        return Objects.equals(this.recoveryWindowInDays, deleteSecretForScheduleRequestBody.recoveryWindowInDays);
    }
    @Override
    public int hashCode() {
        return Objects.hash(recoveryWindowInDays);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteSecretForScheduleRequestBody {\n");
        sb.append("    recoveryWindowInDays: ").append(toIndentedString(recoveryWindowInDays)).append("\n");
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

