package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShrinkClusterReq
 */
public class ShrinkClusterReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shrink")

    private List<ShrinkNodeReq> shrink = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_type")

    private String operationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_load_check")

    private Boolean clusterLoadCheck;

    public ShrinkClusterReq withShrink(List<ShrinkNodeReq> shrink) {
        this.shrink = shrink;
        return this;
    }

    public ShrinkClusterReq addShrinkItem(ShrinkNodeReq shrinkItem) {
        if (this.shrink == null) {
            this.shrink = new ArrayList<>();
        }
        this.shrink.add(shrinkItem);
        return this;
    }

    public ShrinkClusterReq withShrink(Consumer<List<ShrinkNodeReq>> shrinkSetter) {
        if (this.shrink == null) {
            this.shrink = new ArrayList<>();
        }
        shrinkSetter.accept(this.shrink);
        return this;
    }

    /**
     * 需要缩容的节点类型和数量集合。
     * @return shrink
     */
    public List<ShrinkNodeReq> getShrink() {
        return shrink;
    }

    public void setShrink(List<ShrinkNodeReq> shrink) {
        this.shrink = shrink;
    }

    public ShrinkClusterReq withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * 委托名称，委托给CSS服务，允许CSS调用您的其他云服务。
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public ShrinkClusterReq withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * 操作类型。
     * @return operationType
     */
    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public ShrinkClusterReq withClusterLoadCheck(Boolean clusterLoadCheck) {
        this.clusterLoadCheck = clusterLoadCheck;
        return this;
    }

    /**
     * 是否需要检查集群负载。
     * @return clusterLoadCheck
     */
    public Boolean getClusterLoadCheck() {
        return clusterLoadCheck;
    }

    public void setClusterLoadCheck(Boolean clusterLoadCheck) {
        this.clusterLoadCheck = clusterLoadCheck;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShrinkClusterReq that = (ShrinkClusterReq) obj;
        return Objects.equals(this.shrink, that.shrink) && Objects.equals(this.agencyName, that.agencyName)
            && Objects.equals(this.operationType, that.operationType)
            && Objects.equals(this.clusterLoadCheck, that.clusterLoadCheck);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shrink, agencyName, operationType, clusterLoadCheck);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShrinkClusterReq {\n");
        sb.append("    shrink: ").append(toIndentedString(shrink)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    clusterLoadCheck: ").append(toIndentedString(clusterLoadCheck)).append("\n");
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
