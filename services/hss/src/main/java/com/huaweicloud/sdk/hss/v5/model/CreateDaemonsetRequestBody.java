package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateDaemonsetRequestBody
 */
public class CreateDaemonsetRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_upgrade")

    private Boolean autoUpgrade;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_info")

    private List<RuntimeRequestBody> runtimeInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_info")

    private CreateDaemonsetRequestBodyScheduleInfo scheduleInfo;

    public CreateDaemonsetRequestBody withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名称
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public CreateDaemonsetRequestBody withAutoUpgrade(Boolean autoUpgrade) {
        this.autoUpgrade = autoUpgrade;
        return this;
    }

    /**
     * 开启agent自动升级
     * @return autoUpgrade
     */
    public Boolean getAutoUpgrade() {
        return autoUpgrade;
    }

    public void setAutoUpgrade(Boolean autoUpgrade) {
        this.autoUpgrade = autoUpgrade;
    }

    public CreateDaemonsetRequestBody withRuntimeInfo(List<RuntimeRequestBody> runtimeInfo) {
        this.runtimeInfo = runtimeInfo;
        return this;
    }

    public CreateDaemonsetRequestBody addRuntimeInfoItem(RuntimeRequestBody runtimeInfoItem) {
        if (this.runtimeInfo == null) {
            this.runtimeInfo = new ArrayList<>();
        }
        this.runtimeInfo.add(runtimeInfoItem);
        return this;
    }

    public CreateDaemonsetRequestBody withRuntimeInfo(Consumer<List<RuntimeRequestBody>> runtimeInfoSetter) {
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

    public CreateDaemonsetRequestBody withScheduleInfo(CreateDaemonsetRequestBodyScheduleInfo scheduleInfo) {
        this.scheduleInfo = scheduleInfo;
        return this;
    }

    public CreateDaemonsetRequestBody withScheduleInfo(
        Consumer<CreateDaemonsetRequestBodyScheduleInfo> scheduleInfoSetter) {
        if (this.scheduleInfo == null) {
            this.scheduleInfo = new CreateDaemonsetRequestBodyScheduleInfo();
            scheduleInfoSetter.accept(this.scheduleInfo);
        }

        return this;
    }

    /**
     * Get scheduleInfo
     * @return scheduleInfo
     */
    public CreateDaemonsetRequestBodyScheduleInfo getScheduleInfo() {
        return scheduleInfo;
    }

    public void setScheduleInfo(CreateDaemonsetRequestBodyScheduleInfo scheduleInfo) {
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
        CreateDaemonsetRequestBody that = (CreateDaemonsetRequestBody) obj;
        return Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.autoUpgrade, that.autoUpgrade)
            && Objects.equals(this.runtimeInfo, that.runtimeInfo)
            && Objects.equals(this.scheduleInfo, that.scheduleInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterName, autoUpgrade, runtimeInfo, scheduleInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDaemonsetRequestBody {\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    autoUpgrade: ").append(toIndentedString(autoUpgrade)).append("\n");
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
