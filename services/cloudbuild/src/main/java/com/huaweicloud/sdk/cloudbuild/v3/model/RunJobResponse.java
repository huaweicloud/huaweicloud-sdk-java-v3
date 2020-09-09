package com.huaweicloud.sdk.cloudbuild.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class RunJobResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="octopus_job_name")
    
    private String octopusJobName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="actual_build_number")
    
    private String actualBuildNumber;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="daily_build_number")
    
    private String dailyBuildNumber;

    public RunJobResponse withOctopusJobName(String octopusJobName) {
        this.octopusJobName = octopusJobName;
        return this;
    }

    


    /**
     * 临时任务名称
     * @return octopusJobName
     */
    public String getOctopusJobName() {
        return octopusJobName;
    }

    public void setOctopusJobName(String octopusJobName) {
        this.octopusJobName = octopusJobName;
    }

    public RunJobResponse withActualBuildNumber(String actualBuildNumber) {
        this.actualBuildNumber = actualBuildNumber;
        return this;
    }

    


    /**
     * 实际构建次数
     * @return actualBuildNumber
     */
    public String getActualBuildNumber() {
        return actualBuildNumber;
    }

    public void setActualBuildNumber(String actualBuildNumber) {
        this.actualBuildNumber = actualBuildNumber;
    }

    public RunJobResponse withDailyBuildNumber(String dailyBuildNumber) {
        this.dailyBuildNumber = dailyBuildNumber;
        return this;
    }

    


    /**
     * 构建每日编号
     * @return dailyBuildNumber
     */
    public String getDailyBuildNumber() {
        return dailyBuildNumber;
    }

    public void setDailyBuildNumber(String dailyBuildNumber) {
        this.dailyBuildNumber = dailyBuildNumber;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunJobResponse runJobResponse = (RunJobResponse) o;
        return Objects.equals(this.octopusJobName, runJobResponse.octopusJobName) &&
            Objects.equals(this.actualBuildNumber, runJobResponse.actualBuildNumber) &&
            Objects.equals(this.dailyBuildNumber, runJobResponse.dailyBuildNumber);
    }
    @Override
    public int hashCode() {
        return Objects.hash(octopusJobName, actualBuildNumber, dailyBuildNumber);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunJobResponse {\n");
        sb.append("    octopusJobName: ").append(toIndentedString(octopusJobName)).append("\n");
        sb.append("    actualBuildNumber: ").append(toIndentedString(actualBuildNumber)).append("\n");
        sb.append("    dailyBuildNumber: ").append(toIndentedString(dailyBuildNumber)).append("\n");
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

