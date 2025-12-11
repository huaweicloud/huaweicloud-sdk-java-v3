package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class SwitchGaussMySqlConfigurationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_group_name")

    private String paramGroupName;

    public SwitchGaussMySqlConfigurationResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**：  应用参数模板的任务ID。  **取值范围**：  不涉及。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public SwitchGaussMySqlConfigurationResponse withParamGroupName(String paramGroupName) {
        this.paramGroupName = paramGroupName;
        return this;
    }

    /**
     * **参数解释**：  参数模板的名称。  **取值范围**：  支持Default-TaurusDB V2.0和用户自定义参数模板，其中Default-TaurusDB V2.0表示TaurusDB系统默认参数模板。
     * @return paramGroupName
     */
    public String getParamGroupName() {
        return paramGroupName;
    }

    public void setParamGroupName(String paramGroupName) {
        this.paramGroupName = paramGroupName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchGaussMySqlConfigurationResponse that = (SwitchGaussMySqlConfigurationResponse) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.paramGroupName, that.paramGroupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, paramGroupName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchGaussMySqlConfigurationResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    paramGroupName: ").append(toIndentedString(paramGroupName)).append("\n");
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
