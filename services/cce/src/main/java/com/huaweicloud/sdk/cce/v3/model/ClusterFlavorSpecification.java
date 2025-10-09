package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 集群可售卖规格详情
 */
public class ClusterFlavorSpecification {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeCapacity")

    private Integer nodeCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availableMasterFlavors")

    private List<MasterFlavorSpec> availableMasterFlavors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isSoldOut")

    private Boolean isSoldOut;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isSupportMultiAZ")

    private Boolean isSupportMultiAZ;

    public ClusterFlavorSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 规格名称 **取值范围**： - cce.s1.small: 小规模单控制节点CCE集群（最大50节点） - cce.s1.medium: 中等规模单控制节点CCE集群（最大200节点） - cce.s2.small: 小规模三控制节点CCE集群（最大50节点） - cce.s2.medium: 中等规模三控制节点CCE集群（最大200节点） - cce.s2.large: 大规模三控制节点CCE集群（最大1000节点） - cce.s2.xlarge: 超大规模三控制节点CCE集群（最大2000节点） [- cce.s3.small: 小规模五控制节点CCE集群（最大50节点）](tag:hcs,hcs_sm) [- cce.s3.medium: 中等规模五控制节点CCE集群（最大200节点）](tag:hcs,hcs_sm) [- cce.s3.large: 大规模五控制节点CCE集群（最大1000节点）](tag:hcs,hcs_sm) [- cce.s3.xlarge: 超大规模五控制节点CCE集群（最大2000节点）](tag:hcs,hcs_sm)  [专属云特殊规格如下：](tag:hws,hws_hk,hcs,hcs_sm) [- cce.dec.s1.small: 小规模单控制节点的专属云CCE集群（最大50节点）](tag:hws,hws_hk) [- cce.dec.s1.medium: 中等规模单控制节点的专属云CCE集群（最大200节点）](tag:hws,hws_hk) [- cce.dec.s1.large: 大规模单控制节点的专属云CCE集群（最大1000节点）](tag:hws,hws_hk) [- cce.dec.s1.xlarge: 超大规模单控制节点的专属云CCE集群（最大2000节点）](tag:hws,hws_hk) [- cce.dec.s2.small: 小规模三控制节点的专属云CCE集群（最大50节点）](tag:hws,hws_hk) [- cce.dec.s2.medium: 中等规模三控制节点的专属云CCE集群（最大200节点）](tag:hws,hws_hk) [- cce.dec.s2.large: 大规模三控制节点的专属云CCE集群（最大1000节点）](tag:hws,hws_hk) [- cce.dec.s2.xlarge: 超大规模三控制节点的专属云CCE集群（最大2000节点）](tag:hws,hws_hk) [- cce.dec.s3.small: 小规模五控制节点的专属云CCE集群（最大50节点）](tag:hcs,hcs_sm) [- cce.dec.s3.medium: 中等规模五控制节点的专属云CCE集群（最大200节点）](tag:hcs,hcs_sm) [- cce.dec.s3.large: 大规模五控制节点的专属云CCE集群（最大1000节点）](tag:hcs,hcs_sm) [- cce.dec.s3.xlarge: 超大规模五控制节点的专属云CCE集群（最大2000节点）](tag:hcs,hcs_sm)
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClusterFlavorSpecification withNodeCapacity(Integer nodeCapacity) {
        this.nodeCapacity = nodeCapacity;
        return this;
    }

    /**
     * **参数解释**： 集群节点规模 **取值范围**： - 50: 最大支持50节点 - 200: 最大支持200节点 - 100: 最大支持1000节点 - 2000: 最大支持2000节点
     * @return nodeCapacity
     */
    public Integer getNodeCapacity() {
        return nodeCapacity;
    }

    public void setNodeCapacity(Integer nodeCapacity) {
        this.nodeCapacity = nodeCapacity;
    }

    public ClusterFlavorSpecification withAvailableMasterFlavors(List<MasterFlavorSpec> availableMasterFlavors) {
        this.availableMasterFlavors = availableMasterFlavors;
        return this;
    }

    public ClusterFlavorSpecification addAvailableMasterFlavorsItem(MasterFlavorSpec availableMasterFlavorsItem) {
        if (this.availableMasterFlavors == null) {
            this.availableMasterFlavors = new ArrayList<>();
        }
        this.availableMasterFlavors.add(availableMasterFlavorsItem);
        return this;
    }

    public ClusterFlavorSpecification withAvailableMasterFlavors(
        Consumer<List<MasterFlavorSpec>> availableMasterFlavorsSetter) {
        if (this.availableMasterFlavors == null) {
            this.availableMasterFlavors = new ArrayList<>();
        }
        availableMasterFlavorsSetter.accept(this.availableMasterFlavors);
        return this;
    }

    /**
     * **参数解释**： 控制节点详情
     * @return availableMasterFlavors
     */
    public List<MasterFlavorSpec> getAvailableMasterFlavors() {
        return availableMasterFlavors;
    }

    public void setAvailableMasterFlavors(List<MasterFlavorSpec> availableMasterFlavors) {
        this.availableMasterFlavors = availableMasterFlavors;
    }

    public ClusterFlavorSpecification withIsSoldOut(Boolean isSoldOut) {
        this.isSoldOut = isSoldOut;
        return this;
    }

    /**
     * **参数解释**： 集群规格是否售罄 **取值范围**： 不涉及
     * @return isSoldOut
     */
    public Boolean getIsSoldOut() {
        return isSoldOut;
    }

    public void setIsSoldOut(Boolean isSoldOut) {
        this.isSoldOut = isSoldOut;
    }

    public ClusterFlavorSpecification withIsSupportMultiAZ(Boolean isSupportMultiAZ) {
        this.isSupportMultiAZ = isSupportMultiAZ;
        return this;
    }

    /**
     * **参数解释**： 是否支持控制节点多可用区分布 **取值范围**： 不涉及
     * @return isSupportMultiAZ
     */
    public Boolean getIsSupportMultiAZ() {
        return isSupportMultiAZ;
    }

    public void setIsSupportMultiAZ(Boolean isSupportMultiAZ) {
        this.isSupportMultiAZ = isSupportMultiAZ;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterFlavorSpecification that = (ClusterFlavorSpecification) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.nodeCapacity, that.nodeCapacity)
            && Objects.equals(this.availableMasterFlavors, that.availableMasterFlavors)
            && Objects.equals(this.isSoldOut, that.isSoldOut)
            && Objects.equals(this.isSupportMultiAZ, that.isSupportMultiAZ);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nodeCapacity, availableMasterFlavors, isSoldOut, isSupportMultiAZ);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterFlavorSpecification {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeCapacity: ").append(toIndentedString(nodeCapacity)).append("\n");
        sb.append("    availableMasterFlavors: ").append(toIndentedString(availableMasterFlavors)).append("\n");
        sb.append("    isSoldOut: ").append(toIndentedString(isSoldOut)).append("\n");
        sb.append("    isSupportMultiAZ: ").append(toIndentedString(isSupportMultiAZ)).append("\n");
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
