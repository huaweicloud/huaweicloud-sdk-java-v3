package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询指标Hit结果请求体。
 */
public class BatchSearchMetricHitsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_ids")

    private List<String> metricIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_ids")

    private List<String> workspaceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private List<Map<String, String>> params = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interactive_params")

    private List<Map<String, String>> interactiveParams = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_ids")

    private List<String> fieldIds = null;

    public BatchSearchMetricHitsRequestBody withMetricIds(List<String> metricIds) {
        this.metricIds = metricIds;
        return this;
    }

    public BatchSearchMetricHitsRequestBody addMetricIdsItem(String metricIdsItem) {
        if (this.metricIds == null) {
            this.metricIds = new ArrayList<>();
        }
        this.metricIds.add(metricIdsItem);
        return this;
    }

    public BatchSearchMetricHitsRequestBody withMetricIds(Consumer<List<String>> metricIdsSetter) {
        if (this.metricIds == null) {
            this.metricIds = new ArrayList<>();
        }
        metricIdsSetter.accept(this.metricIds);
        return this;
    }

    /**
     * 待查询的指标Id列表，可参照附录中指标信息说明获取已有指标信息。
     * @return metricIds
     */
    public List<String> getMetricIds() {
        return metricIds;
    }

    public void setMetricIds(List<String> metricIds) {
        this.metricIds = metricIds;
    }

    public BatchSearchMetricHitsRequestBody withWorkspaceIds(List<String> workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }

    public BatchSearchMetricHitsRequestBody addWorkspaceIdsItem(String workspaceIdsItem) {
        if (this.workspaceIds == null) {
            this.workspaceIds = new ArrayList<>();
        }
        this.workspaceIds.add(workspaceIdsItem);
        return this;
    }

    public BatchSearchMetricHitsRequestBody withWorkspaceIds(Consumer<List<String>> workspaceIdsSetter) {
        if (this.workspaceIds == null) {
            this.workspaceIds = new ArrayList<>();
        }
        workspaceIdsSetter.accept(this.workspaceIds);
        return this;
    }

    /**
     * 工作空间列表，当指标支持获取多工作空间数据时填写。
     * @return workspaceIds
     */
    public List<String> getWorkspaceIds() {
        return workspaceIds;
    }

    public void setWorkspaceIds(List<String> workspaceIds) {
        this.workspaceIds = workspaceIds;
    }

    public BatchSearchMetricHitsRequestBody withParams(List<Map<String, String>> params) {
        this.params = params;
        return this;
    }

    public BatchSearchMetricHitsRequestBody addParamsItem(Map<String, String> paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public BatchSearchMetricHitsRequestBody withParams(Consumer<List<Map<String, String>>> paramsSetter) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 待查询指标的参数列表，列表内每个元素为<String, String>的K-V形式，元素数量必须与metric_ids列表相同，具体填写方式请参照附录。
     * @return params
     */
    public List<Map<String, String>> getParams() {
        return params;
    }

    public void setParams(List<Map<String, String>> params) {
        this.params = params;
    }

    public BatchSearchMetricHitsRequestBody withInteractiveParams(List<Map<String, String>> interactiveParams) {
        this.interactiveParams = interactiveParams;
        return this;
    }

    public BatchSearchMetricHitsRequestBody addInteractiveParamsItem(Map<String, String> interactiveParamsItem) {
        if (this.interactiveParams == null) {
            this.interactiveParams = new ArrayList<>();
        }
        this.interactiveParams.add(interactiveParamsItem);
        return this;
    }

    public BatchSearchMetricHitsRequestBody withInteractiveParams(
        Consumer<List<Map<String, String>>> interactiveParamsSetter) {
        if (this.interactiveParams == null) {
            this.interactiveParams = new ArrayList<>();
        }
        interactiveParamsSetter.accept(this.interactiveParams);
        return this;
    }

    /**
     * 交互式参数查询，当指标支持交互式参数时，填写<String, String>的K-V形式的参数列表，具体填写方式请参照附录。
     * @return interactiveParams
     */
    public List<Map<String, String>> getInteractiveParams() {
        return interactiveParams;
    }

    public void setInteractiveParams(List<Map<String, String>> interactiveParams) {
        this.interactiveParams = interactiveParams;
    }

    public BatchSearchMetricHitsRequestBody withFieldIds(List<String> fieldIds) {
        this.fieldIds = fieldIds;
        return this;
    }

    public BatchSearchMetricHitsRequestBody addFieldIdsItem(String fieldIdsItem) {
        if (this.fieldIds == null) {
            this.fieldIds = new ArrayList<>();
        }
        this.fieldIds.add(fieldIdsItem);
        return this;
    }

    public BatchSearchMetricHitsRequestBody withFieldIds(Consumer<List<String>> fieldIdsSetter) {
        if (this.fieldIds == null) {
            this.fieldIds = new ArrayList<>();
        }
        fieldIdsSetter.accept(this.fieldIds);
        return this;
    }

    /**
     * 指标卡片ID列表
     * @return fieldIds
     */
    public List<String> getFieldIds() {
        return fieldIds;
    }

    public void setFieldIds(List<String> fieldIds) {
        this.fieldIds = fieldIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchSearchMetricHitsRequestBody that = (BatchSearchMetricHitsRequestBody) obj;
        return Objects.equals(this.metricIds, that.metricIds) && Objects.equals(this.workspaceIds, that.workspaceIds)
            && Objects.equals(this.params, that.params)
            && Objects.equals(this.interactiveParams, that.interactiveParams)
            && Objects.equals(this.fieldIds, that.fieldIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricIds, workspaceIds, params, interactiveParams, fieldIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchSearchMetricHitsRequestBody {\n");
        sb.append("    metricIds: ").append(toIndentedString(metricIds)).append("\n");
        sb.append("    workspaceIds: ").append(toIndentedString(workspaceIds)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    interactiveParams: ").append(toIndentedString(interactiveParams)).append("\n");
        sb.append("    fieldIds: ").append(toIndentedString(fieldIds)).append("\n");
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
