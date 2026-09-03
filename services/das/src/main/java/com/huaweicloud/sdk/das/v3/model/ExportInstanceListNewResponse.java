package com.huaweicloud.sdk.das.v3.model;

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
public class ExportInstanceListNewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_infos")

    private List<ExportInstanceInfo> instanceInfos = null;

    public ExportInstanceListNewResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 导出的实例总数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ExportInstanceListNewResponse withInstanceInfos(List<ExportInstanceInfo> instanceInfos) {
        this.instanceInfos = instanceInfos;
        return this;
    }

    public ExportInstanceListNewResponse addInstanceInfosItem(ExportInstanceInfo instanceInfosItem) {
        if (this.instanceInfos == null) {
            this.instanceInfos = new ArrayList<>();
        }
        this.instanceInfos.add(instanceInfosItem);
        return this;
    }

    public ExportInstanceListNewResponse withInstanceInfos(Consumer<List<ExportInstanceInfo>> instanceInfosSetter) {
        if (this.instanceInfos == null) {
            this.instanceInfos = new ArrayList<>();
        }
        instanceInfosSetter.accept(this.instanceInfos);
        return this;
    }

    /**
     * 实例信息列表
     * @return instanceInfos
     */
    public List<ExportInstanceInfo> getInstanceInfos() {
        return instanceInfos;
    }

    public void setInstanceInfos(List<ExportInstanceInfo> instanceInfos) {
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
        ExportInstanceListNewResponse that = (ExportInstanceListNewResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.instanceInfos, that.instanceInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, instanceInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportInstanceListNewResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
