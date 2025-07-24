package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实例placement，指定服务器策略。不指定placement，按min_count、max_count从空闲服务器中选择。
 */
public class RunInstancesOptionsPlacement {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id_set")

    private List<String> serverIdSet = null;

    public RunInstancesOptionsPlacement withServerIdSet(List<String> serverIdSet) {
        this.serverIdSet = serverIdSet;
        return this;
    }

    public RunInstancesOptionsPlacement addServerIdSetItem(String serverIdSetItem) {
        if (this.serverIdSet == null) {
            this.serverIdSet = new ArrayList<>();
        }
        this.serverIdSet.add(serverIdSetItem);
        return this;
    }

    public RunInstancesOptionsPlacement withServerIdSet(Consumer<List<String>> serverIdSetSetter) {
        if (this.serverIdSet == null) {
            this.serverIdSet = new ArrayList<>();
        }
        serverIdSetSetter.accept(this.serverIdSet);
        return this;
    }

    /**
     * 指定服务器
     * @return serverIdSet
     */
    public List<String> getServerIdSet() {
        return serverIdSet;
    }

    public void setServerIdSet(List<String> serverIdSet) {
        this.serverIdSet = serverIdSet;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RunInstancesOptionsPlacement that = (RunInstancesOptionsPlacement) obj;
        return Objects.equals(this.serverIdSet, that.serverIdSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverIdSet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunInstancesOptionsPlacement {\n");
        sb.append("    serverIdSet: ").append(toIndentedString(serverIdSet)).append("\n");
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
