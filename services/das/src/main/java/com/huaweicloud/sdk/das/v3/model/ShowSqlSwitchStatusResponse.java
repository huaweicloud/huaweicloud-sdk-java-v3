package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class ShowSqlSwitchStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_days")

    private Long retentionDays;

    public ShowSqlSwitchStatusResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 开关状态。取值： Enabled：已开启， Disabled：已关闭， Switching：开关切换中
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowSqlSwitchStatusResponse withRetentionDays(Long retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    /** SQL数据保存天数。
     * 
     * @return retentionDays */
    public Long getRetentionDays() {
        return retentionDays;
    }

    public void setRetentionDays(Long retentionDays) {
        this.retentionDays = retentionDays;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSqlSwitchStatusResponse showSqlSwitchStatusResponse = (ShowSqlSwitchStatusResponse) o;
        return Objects.equals(this.status, showSqlSwitchStatusResponse.status)
            && Objects.equals(this.retentionDays, showSqlSwitchStatusResponse.retentionDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, retentionDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSqlSwitchStatusResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
