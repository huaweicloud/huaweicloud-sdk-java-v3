package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SubmitDiagnoseJobReq
 */
public class SubmitDiagnoseJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private Map<String, String> params = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    public SubmitDiagnoseJobReq withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 任务类型，例如 ecs诊断任务 1，rds诊断任务 2
     * minimum: 1
     * maximum: 4
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public SubmitDiagnoseJobReq withParams(Map<String, String> params) {
        this.params = params;
        return this;
    }

    public SubmitDiagnoseJobReq putParamsItem(String key, String paramsItem) {
        if (this.params == null) {
            this.params = new HashMap<>();
        }
        this.params.put(key, paramsItem);
        return this;
    }

    public SubmitDiagnoseJobReq withParams(Consumer<Map<String, String>> paramsSetter) {
        if (this.params == null) {
            this.params = new HashMap<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 类型对应的特有参数，例如ecs需要传eip,rds 需要传输instanceId
     * @return params
     */
    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    public SubmitDiagnoseJobReq withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 节点id
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubmitDiagnoseJobReq submitDiagnoseJobReq = (SubmitDiagnoseJobReq) o;
        return Objects.equals(this.type, submitDiagnoseJobReq.type)
            && Objects.equals(this.params, submitDiagnoseJobReq.params)
            && Objects.equals(this.regionId, submitDiagnoseJobReq.regionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, params, regionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubmitDiagnoseJobReq {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
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
