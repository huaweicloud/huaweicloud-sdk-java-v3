package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实例批量备份请求
 */
public class InstanceBatchBackupReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_ids")

    private List<String> instanceIds = null;

    public InstanceBatchBackupReq withInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public InstanceBatchBackupReq addInstanceIdsItem(String instanceIdsItem) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        this.instanceIds.add(instanceIdsItem);
        return this;
    }

    public InstanceBatchBackupReq withInstanceIds(Consumer<List<String>> instanceIdsSetter) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        instanceIdsSetter.accept(this.instanceIds);
        return this;
    }

    /**
     * 实例列表
     * @return instanceIds
     */
    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceBatchBackupReq that = (InstanceBatchBackupReq) obj;
        return Objects.equals(this.instanceIds, that.instanceIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceBatchBackupReq {\n");
        sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
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
