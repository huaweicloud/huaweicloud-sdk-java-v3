package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 集群拓扑实例环信息。 **取值范围**： 不涉及。
 */
public class TopoRingInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_info_lists")

    private List<TopoInstanceInfo> instanceInfoLists = null;

    public TopoRingInfo withInstanceInfoLists(List<TopoInstanceInfo> instanceInfoLists) {
        this.instanceInfoLists = instanceInfoLists;
        return this;
    }

    public TopoRingInfo addInstanceInfoListsItem(TopoInstanceInfo instanceInfoListsItem) {
        if (this.instanceInfoLists == null) {
            this.instanceInfoLists = new ArrayList<>();
        }
        this.instanceInfoLists.add(instanceInfoListsItem);
        return this;
    }

    public TopoRingInfo withInstanceInfoLists(Consumer<List<TopoInstanceInfo>> instanceInfoListsSetter) {
        if (this.instanceInfoLists == null) {
            this.instanceInfoLists = new ArrayList<>();
        }
        instanceInfoListsSetter.accept(this.instanceInfoLists);
        return this;
    }

    /**
     * **参数解释**： 集群实例列表信息。 **取值范围**： 不涉及。
     * @return instanceInfoLists
     */
    public List<TopoInstanceInfo> getInstanceInfoLists() {
        return instanceInfoLists;
    }

    public void setInstanceInfoLists(List<TopoInstanceInfo> instanceInfoLists) {
        this.instanceInfoLists = instanceInfoLists;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TopoRingInfo that = (TopoRingInfo) obj;
        return Objects.equals(this.instanceInfoLists, that.instanceInfoLists);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceInfoLists);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopoRingInfo {\n");
        sb.append("    instanceInfoLists: ").append(toIndentedString(instanceInfoLists)).append("\n");
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
