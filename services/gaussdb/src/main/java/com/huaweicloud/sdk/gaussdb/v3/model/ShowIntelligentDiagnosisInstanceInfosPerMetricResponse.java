package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class ShowIntelligentDiagnosisInstanceInfosPerMetricResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_infos")

    private List<InstanceInfoForDiagnosis> instanceInfos = null;

    public ShowIntelligentDiagnosisInstanceInfosPerMetricResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 当前指标的异常实例总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ShowIntelligentDiagnosisInstanceInfosPerMetricResponse withInstanceInfos(
        List<InstanceInfoForDiagnosis> instanceInfos) {
        this.instanceInfos = instanceInfos;
        return this;
    }

    public ShowIntelligentDiagnosisInstanceInfosPerMetricResponse addInstanceInfosItem(
        InstanceInfoForDiagnosis instanceInfosItem) {
        if (this.instanceInfos == null) {
            this.instanceInfos = new ArrayList<>();
        }
        this.instanceInfos.add(instanceInfosItem);
        return this;
    }

    public ShowIntelligentDiagnosisInstanceInfosPerMetricResponse withInstanceInfos(
        Consumer<List<InstanceInfoForDiagnosis>> instanceInfosSetter) {
        if (this.instanceInfos == null) {
            this.instanceInfos = new ArrayList<>();
        }
        instanceInfosSetter.accept(this.instanceInfos);
        return this;
    }

    /**
     * 异常实例信息。
     * @return instanceInfos
     */
    public List<InstanceInfoForDiagnosis> getInstanceInfos() {
        return instanceInfos;
    }

    public void setInstanceInfos(List<InstanceInfoForDiagnosis> instanceInfos) {
        this.instanceInfos = instanceInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowIntelligentDiagnosisInstanceInfosPerMetricResponse that =
            (ShowIntelligentDiagnosisInstanceInfosPerMetricResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.instanceInfos, that.instanceInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, instanceInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIntelligentDiagnosisInstanceInfosPerMetricResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    instanceInfos: ").append(toIndentedString(instanceInfos)).append("\n");
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
