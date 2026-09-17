package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EngineDistributionInfo对象
 */
public class EngineDistributionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_infos")

    private List<DistributionInstanceInfo> instanceInfos = null;

    public EngineDistributionInfo withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 数据库类型
     * @return engineType
     */
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public EngineDistributionInfo withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public EngineDistributionInfo withInstanceInfos(List<DistributionInstanceInfo> instanceInfos) {
        this.instanceInfos = instanceInfos;
        return this;
    }

    public EngineDistributionInfo addInstanceInfosItem(DistributionInstanceInfo instanceInfosItem) {
        if (this.instanceInfos == null) {
            this.instanceInfos = new ArrayList<>();
        }
        this.instanceInfos.add(instanceInfosItem);
        return this;
    }

    public EngineDistributionInfo withInstanceInfos(Consumer<List<DistributionInstanceInfo>> instanceInfosSetter) {
        if (this.instanceInfos == null) {
            this.instanceInfos = new ArrayList<>();
        }
        instanceInfosSetter.accept(this.instanceInfos);
        return this;
    }

    /**
     * 实例信息
     * @return instanceInfos
     */
    public List<DistributionInstanceInfo> getInstanceInfos() {
        return instanceInfos;
    }

    public void setInstanceInfos(List<DistributionInstanceInfo> instanceInfos) {
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
        EngineDistributionInfo that = (EngineDistributionInfo) obj;
        return Objects.equals(this.engineType, that.engineType) && Objects.equals(this.total, that.total)
            && Objects.equals(this.instanceInfos, that.instanceInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineType, total, instanceInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EngineDistributionInfo {\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
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
