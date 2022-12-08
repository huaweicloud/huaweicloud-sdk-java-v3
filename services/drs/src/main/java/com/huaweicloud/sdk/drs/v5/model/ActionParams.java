package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 操作任务动作参数。
 */
public class ActionParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoints")

    private List<JobEndpointInfo> endpoints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "precheck_mode")

    private String precheckMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skip_precheck_info")

    private SkipPreCheckInfo skipPrecheckInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pause_mode")

    private String pauseMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_task_param")

    private CompareTaskParams compareTaskParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_sync_re_edit")

    private Boolean isSyncReEdit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_delete")

    private Boolean forceDelete;

    public ActionParams withEndpoints(List<JobEndpointInfo> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public ActionParams addEndpointsItem(JobEndpointInfo endpointsItem) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        this.endpoints.add(endpointsItem);
        return this;
    }

    public ActionParams withEndpoints(Consumer<List<JobEndpointInfo>> endpointsSetter) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        endpointsSetter.accept(this.endpoints);
        return this;
    }

    /**
     * 测试连接数据库信息。
     * @return endpoints
     */
    public List<JobEndpointInfo> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<JobEndpointInfo> endpoints) {
        this.endpoints = endpoints;
    }

    public ActionParams withPrecheckMode(String precheckMode) {
        this.precheckMode = precheckMode;
        return this;
    }

    /**
     * 预检查模式。
     * @return precheckMode
     */
    public String getPrecheckMode() {
        return precheckMode;
    }

    public void setPrecheckMode(String precheckMode) {
        this.precheckMode = precheckMode;
    }

    public ActionParams withSkipPrecheckInfo(SkipPreCheckInfo skipPrecheckInfo) {
        this.skipPrecheckInfo = skipPrecheckInfo;
        return this;
    }

    public ActionParams withSkipPrecheckInfo(Consumer<SkipPreCheckInfo> skipPrecheckInfoSetter) {
        if (this.skipPrecheckInfo == null) {
            this.skipPrecheckInfo = new SkipPreCheckInfo();
            skipPrecheckInfoSetter.accept(this.skipPrecheckInfo);
        }

        return this;
    }

    /**
     * Get skipPrecheckInfo
     * @return skipPrecheckInfo
     */
    public SkipPreCheckInfo getSkipPrecheckInfo() {
        return skipPrecheckInfo;
    }

    public void setSkipPrecheckInfo(SkipPreCheckInfo skipPrecheckInfo) {
        this.skipPrecheckInfo = skipPrecheckInfo;
    }

    public ActionParams withPauseMode(String pauseMode) {
        this.pauseMode = pauseMode;
        return this;
    }

    /**
     * 任务暂停模式。
     * @return pauseMode
     */
    public String getPauseMode() {
        return pauseMode;
    }

    public void setPauseMode(String pauseMode) {
        this.pauseMode = pauseMode;
    }

    public ActionParams withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 任务定时启动时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ActionParams withCompareTaskParam(CompareTaskParams compareTaskParam) {
        this.compareTaskParam = compareTaskParam;
        return this;
    }

    public ActionParams withCompareTaskParam(Consumer<CompareTaskParams> compareTaskParamSetter) {
        if (this.compareTaskParam == null) {
            this.compareTaskParam = new CompareTaskParams();
            compareTaskParamSetter.accept(this.compareTaskParam);
        }

        return this;
    }

    /**
     * Get compareTaskParam
     * @return compareTaskParam
     */
    public CompareTaskParams getCompareTaskParam() {
        return compareTaskParam;
    }

    public void setCompareTaskParam(CompareTaskParams compareTaskParam) {
        this.compareTaskParam = compareTaskParam;
    }

    public ActionParams withIsSyncReEdit(Boolean isSyncReEdit) {
        this.isSyncReEdit = isSyncReEdit;
        return this;
    }

    /**
     * 再编辑任务启动时取值true。
     * @return isSyncReEdit
     */
    public Boolean getIsSyncReEdit() {
        return isSyncReEdit;
    }

    public void setIsSyncReEdit(Boolean isSyncReEdit) {
        this.isSyncReEdit = isSyncReEdit;
    }

    public ActionParams withForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
        return this;
    }

    /**
     * 强制结束任务时取值true。
     * @return forceDelete
     */
    public Boolean getForceDelete() {
        return forceDelete;
    }

    public void setForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionParams actionParams = (ActionParams) o;
        return Objects.equals(this.endpoints, actionParams.endpoints)
            && Objects.equals(this.precheckMode, actionParams.precheckMode)
            && Objects.equals(this.skipPrecheckInfo, actionParams.skipPrecheckInfo)
            && Objects.equals(this.pauseMode, actionParams.pauseMode)
            && Objects.equals(this.startTime, actionParams.startTime)
            && Objects.equals(this.compareTaskParam, actionParams.compareTaskParam)
            && Objects.equals(this.isSyncReEdit, actionParams.isSyncReEdit)
            && Objects.equals(this.forceDelete, actionParams.forceDelete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoints,
            precheckMode,
            skipPrecheckInfo,
            pauseMode,
            startTime,
            compareTaskParam,
            isSyncReEdit,
            forceDelete);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionParams {\n");
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
        sb.append("    precheckMode: ").append(toIndentedString(precheckMode)).append("\n");
        sb.append("    skipPrecheckInfo: ").append(toIndentedString(skipPrecheckInfo)).append("\n");
        sb.append("    pauseMode: ").append(toIndentedString(pauseMode)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    compareTaskParam: ").append(toIndentedString(compareTaskParam)).append("\n");
        sb.append("    isSyncReEdit: ").append(toIndentedString(isSyncReEdit)).append("\n");
        sb.append("    forceDelete: ").append(toIndentedString(forceDelete)).append("\n");
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
