package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实例准备请求
 */
public class InstanceBatchPrepareReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_ids")

    private List<String> instanceIds = null;

    public InstanceBatchPrepareReq withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户id
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public InstanceBatchPrepareReq withInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public InstanceBatchPrepareReq addInstanceIdsItem(String instanceIdsItem) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        this.instanceIds.add(instanceIdsItem);
        return this;
    }

    public InstanceBatchPrepareReq withInstanceIds(Consumer<List<String>> instanceIdsSetter) {
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
        InstanceBatchPrepareReq that = (InstanceBatchPrepareReq) obj;
        return Objects.equals(this.userId, that.userId) && Objects.equals(this.instanceIds, that.instanceIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, instanceIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceBatchPrepareReq {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
