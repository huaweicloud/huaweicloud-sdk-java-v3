package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * InstanceEngineDistributionListEngineDistribution
 */
public class InstanceEngineDistributionListEngineDistribution {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_type")

    private String datastoreType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_infos")

    private List<InstanceEngineDistributionListInstanceInfos> instanceInfos = null;

    public InstanceEngineDistributionListEngineDistribution withDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    /**
     * 数据库类型
     * @return datastoreType
     */
    public String getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
    }

    public InstanceEngineDistributionListEngineDistribution withTotal(Integer total) {
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

    public InstanceEngineDistributionListEngineDistribution withInstanceInfos(
        List<InstanceEngineDistributionListInstanceInfos> instanceInfos) {
        this.instanceInfos = instanceInfos;
        return this;
    }

    public InstanceEngineDistributionListEngineDistribution addInstanceInfosItem(
        InstanceEngineDistributionListInstanceInfos instanceInfosItem) {
        if (this.instanceInfos == null) {
            this.instanceInfos = new ArrayList<>();
        }
        this.instanceInfos.add(instanceInfosItem);
        return this;
    }

    public InstanceEngineDistributionListEngineDistribution withInstanceInfos(
        Consumer<List<InstanceEngineDistributionListInstanceInfos>> instanceInfosSetter) {
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
    public List<InstanceEngineDistributionListInstanceInfos> getInstanceInfos() {
        return instanceInfos;
    }

    public void setInstanceInfos(List<InstanceEngineDistributionListInstanceInfos> instanceInfos) {
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
        InstanceEngineDistributionListEngineDistribution that = (InstanceEngineDistributionListEngineDistribution) obj;
        return Objects.equals(this.datastoreType, that.datastoreType) && Objects.equals(this.total, that.total)
            && Objects.equals(this.instanceInfos, that.instanceInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastoreType, total, instanceInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceEngineDistributionListEngineDistribution {\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
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
