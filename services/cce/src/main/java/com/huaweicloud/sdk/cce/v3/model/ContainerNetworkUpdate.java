package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ContainerNetworkUpdate
 */
public class ContainerNetworkUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidrs")

    private List<ContainerCIDR> cidrs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "containercidrs")

    private List<String> containercidrs = null;

    public ContainerNetworkUpdate withCidrs(List<ContainerCIDR> cidrs) {
        this.cidrs = cidrs;
        return this;
    }

    public ContainerNetworkUpdate addCidrsItem(ContainerCIDR cidrsItem) {
        if (this.cidrs == null) {
            this.cidrs = new ArrayList<>();
        }
        this.cidrs.add(cidrsItem);
        return this;
    }

    public ContainerNetworkUpdate withCidrs(Consumer<List<ContainerCIDR>> cidrsSetter) {
        if (this.cidrs == null) {
            this.cidrs = new ArrayList<>();
        }
        cidrsSetter.accept(this.cidrs);
        return this;
    }

    /**
     * 容器网络网段列表。1.21及新版本集群，当集群网络类型为vpc-router时，支持增量添加容器网段，最多配置20个。  此参数在集群更新后不可更改，请谨慎选择。
     * @return cidrs
     */
    public List<ContainerCIDR> getCidrs() {
        return cidrs;
    }

    public void setCidrs(List<ContainerCIDR> cidrs) {
        this.cidrs = cidrs;
    }

    public ContainerNetworkUpdate withContainercidrs(List<String> containercidrs) {
        this.containercidrs = containercidrs;
        return this;
    }

    public ContainerNetworkUpdate addContainercidrsItem(String containercidrsItem) {
        if (this.containercidrs == null) {
            this.containercidrs = new ArrayList<>();
        }
        this.containercidrs.add(containercidrsItem);
        return this;
    }

    public ContainerNetworkUpdate withContainercidrs(Consumer<List<String>> containercidrsSetter) {
        if (this.containercidrs == null) {
            this.containercidrs = new ArrayList<>();
        }
        containercidrsSetter.accept(this.containercidrs);
        return this;
    }

    /**
     * **参数解释：** 容器网络网段列表。当集群网络类型为vpc-router时，支持添加或删除容器网段。支持的集群版本如下： - v1.28.15-r60及以上版本 - v1.29.15-r20及以上版本 - v1.30.14-r20及以上版本 - v1.31.10-r20及以上版本 - v1.32.6-r20及以上版本 - v1.33.5-r10及以上版本  支持修改集群容器网段的顺序，顺序在前的容器网段优先被使用。 **约束限制：** - 最多支持配置20个子网。 - 填写为空时，该字段不生效。  **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return containercidrs
     */
    public List<String> getContainercidrs() {
        return containercidrs;
    }

    public void setContainercidrs(List<String> containercidrs) {
        this.containercidrs = containercidrs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContainerNetworkUpdate that = (ContainerNetworkUpdate) obj;
        return Objects.equals(this.cidrs, that.cidrs) && Objects.equals(this.containercidrs, that.containercidrs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cidrs, containercidrs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerNetworkUpdate {\n");
        sb.append("    cidrs: ").append(toIndentedString(cidrs)).append("\n");
        sb.append("    containercidrs: ").append(toIndentedString(containercidrs)).append("\n");
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
