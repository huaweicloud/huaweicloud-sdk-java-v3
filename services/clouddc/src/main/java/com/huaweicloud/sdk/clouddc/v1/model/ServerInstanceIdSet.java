package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实例ID集合
 */
public class ServerInstanceIdSet {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id_set")

    private List<String> instanceIdSet = null;

    public ServerInstanceIdSet withInstanceIdSet(List<String> instanceIdSet) {
        this.instanceIdSet = instanceIdSet;
        return this;
    }

    public ServerInstanceIdSet addInstanceIdSetItem(String instanceIdSetItem) {
        if (this.instanceIdSet == null) {
            this.instanceIdSet = new ArrayList<>();
        }
        this.instanceIdSet.add(instanceIdSetItem);
        return this;
    }

    public ServerInstanceIdSet withInstanceIdSet(Consumer<List<String>> instanceIdSetSetter) {
        if (this.instanceIdSet == null) {
            this.instanceIdSet = new ArrayList<>();
        }
        instanceIdSetSetter.accept(this.instanceIdSet);
        return this;
    }

    /**
     * instance id set
     * @return instanceIdSet
     */
    public List<String> getInstanceIdSet() {
        return instanceIdSet;
    }

    public void setInstanceIdSet(List<String> instanceIdSet) {
        this.instanceIdSet = instanceIdSet;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerInstanceIdSet that = (ServerInstanceIdSet) obj;
        return Objects.equals(this.instanceIdSet, that.instanceIdSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceIdSet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerInstanceIdSet {\n");
        sb.append("    instanceIdSet: ").append(toIndentedString(instanceIdSet)).append("\n");
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
