package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateHealthReportTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_success")

    private Boolean createSuccess;

    public CreateHealthReportTaskResponse withCreateSuccess(Boolean createSuccess) {
        this.createSuccess = createSuccess;
        return this;
    }

    /**
     * 诊断任务创建是否成功
     * @return createSuccess
     */
    public Boolean getCreateSuccess() {
        return createSuccess;
    }

    public void setCreateSuccess(Boolean createSuccess) {
        this.createSuccess = createSuccess;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateHealthReportTaskResponse that = (CreateHealthReportTaskResponse) obj;
        return Objects.equals(this.createSuccess, that.createSuccess);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createSuccess);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateHealthReportTaskResponse {\n");
        sb.append("    createSuccess: ").append(toIndentedString(createSuccess)).append("\n");
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
