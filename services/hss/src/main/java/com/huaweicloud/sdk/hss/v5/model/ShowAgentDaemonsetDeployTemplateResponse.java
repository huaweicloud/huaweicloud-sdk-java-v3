package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAgentDaemonsetDeployTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default")

    private Boolean isDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_info")

    private List<RuntimeRequestBody> runtimeInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_info")

    private DeployTemplateInfoScheduleInfo scheduleInfo;

    public ShowAgentDaemonsetDeployTemplateResponse withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * 是否默认模板
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public ShowAgentDaemonsetDeployTemplateResponse withRuntimeInfo(List<RuntimeRequestBody> runtimeInfo) {
        this.runtimeInfo = runtimeInfo;
        return this;
    }

    public ShowAgentDaemonsetDeployTemplateResponse addRuntimeInfoItem(RuntimeRequestBody runtimeInfoItem) {
        if (this.runtimeInfo == null) {
            this.runtimeInfo = new ArrayList<>();
        }
        this.runtimeInfo.add(runtimeInfoItem);
        return this;
    }

    public ShowAgentDaemonsetDeployTemplateResponse withRuntimeInfo(
        Consumer<List<RuntimeRequestBody>> runtimeInfoSetter) {
        if (this.runtimeInfo == null) {
            this.runtimeInfo = new ArrayList<>();
        }
        runtimeInfoSetter.accept(this.runtimeInfo);
        return this;
    }

    /**
     * 容器运行时配置
     * @return runtimeInfo
     */
    public List<RuntimeRequestBody> getRuntimeInfo() {
        return runtimeInfo;
    }

    public void setRuntimeInfo(List<RuntimeRequestBody> runtimeInfo) {
        this.runtimeInfo = runtimeInfo;
    }

    public ShowAgentDaemonsetDeployTemplateResponse withScheduleInfo(DeployTemplateInfoScheduleInfo scheduleInfo) {
        this.scheduleInfo = scheduleInfo;
        return this;
    }

    public ShowAgentDaemonsetDeployTemplateResponse withScheduleInfo(
        Consumer<DeployTemplateInfoScheduleInfo> scheduleInfoSetter) {
        if (this.scheduleInfo == null) {
            this.scheduleInfo = new DeployTemplateInfoScheduleInfo();
            scheduleInfoSetter.accept(this.scheduleInfo);
        }

        return this;
    }

    /**
     * Get scheduleInfo
     * @return scheduleInfo
     */
    public DeployTemplateInfoScheduleInfo getScheduleInfo() {
        return scheduleInfo;
    }

    public void setScheduleInfo(DeployTemplateInfoScheduleInfo scheduleInfo) {
        this.scheduleInfo = scheduleInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAgentDaemonsetDeployTemplateResponse that = (ShowAgentDaemonsetDeployTemplateResponse) obj;
        return Objects.equals(this.isDefault, that.isDefault) && Objects.equals(this.runtimeInfo, that.runtimeInfo)
            && Objects.equals(this.scheduleInfo, that.scheduleInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isDefault, runtimeInfo, scheduleInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAgentDaemonsetDeployTemplateResponse {\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    runtimeInfo: ").append(toIndentedString(runtimeInfo)).append("\n");
        sb.append("    scheduleInfo: ").append(toIndentedString(scheduleInfo)).append("\n");
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
