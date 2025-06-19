package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ExecuteJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "octopus_job_name")

    private String octopusJobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actual_build_number")

    private String actualBuildNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "daily_build_number")

    private String dailyBuildNumber;

    public ExecuteJobResponse withOctopusJobName(String octopusJobName) {
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

    public ExecuteJobResponse withActualBuildNumber(String actualBuildNumber) {
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

    public ExecuteJobResponse withDailyBuildNumber(String dailyBuildNumber) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteJobResponse that = (ExecuteJobResponse) obj;
        return Objects.equals(this.octopusJobName, that.octopusJobName)
            && Objects.equals(this.actualBuildNumber, that.actualBuildNumber)
            && Objects.equals(this.dailyBuildNumber, that.dailyBuildNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(octopusJobName, actualBuildNumber, dailyBuildNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteJobResponse {\n");
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
