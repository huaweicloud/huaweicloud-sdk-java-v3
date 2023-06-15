package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 应用启动参数
 */
public class EnvExecutionBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private List<DynamicConfigInfo> params = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_id")

    private String recordId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_source")

    private String triggerSource;

    public EnvExecutionBody withParams(List<DynamicConfigInfo> params) {
        this.params = params;
        return this;
    }

    public EnvExecutionBody addParamsItem(DynamicConfigInfo paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public EnvExecutionBody withParams(Consumer<List<DynamicConfigInfo>> paramsSetter) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 部署应用时传递的参数
     * @return params
     */
    public List<DynamicConfigInfo> getParams() {
        return params;
    }

    public void setParams(List<DynamicConfigInfo> params) {
        this.params = params;
    }

    public EnvExecutionBody withRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    /**
     * 应用的部署id，可通过record_id回滚至之前的部署状态。选中应用历史部署记录，在URL中获取
     * @return recordId
     */
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public EnvExecutionBody withTriggerSource(String triggerSource) {
        this.triggerSource = triggerSource;
        return this;
    }

    /**
     * 限制触发来源,0不限制任何部署请求来源,1时只允许通过流水线触发部署
     * @return triggerSource
     */
    public String getTriggerSource() {
        return triggerSource;
    }

    public void setTriggerSource(String triggerSource) {
        this.triggerSource = triggerSource;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnvExecutionBody envExecutionBody = (EnvExecutionBody) o;
        return Objects.equals(this.params, envExecutionBody.params)
            && Objects.equals(this.recordId, envExecutionBody.recordId)
            && Objects.equals(this.triggerSource, envExecutionBody.triggerSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(params, recordId, triggerSource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvExecutionBody {\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
        sb.append("    triggerSource: ").append(toIndentedString(triggerSource)).append("\n");
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
