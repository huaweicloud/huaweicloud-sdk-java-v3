package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 云机分配用户请求
 */
public class InstanceAssignReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_instances")

    private List<InstanceAssignReqUserInstances> userInstances = null;

    public InstanceAssignReq withUserInstances(List<InstanceAssignReqUserInstances> userInstances) {
        this.userInstances = userInstances;
        return this;
    }

    public InstanceAssignReq addUserInstancesItem(InstanceAssignReqUserInstances userInstancesItem) {
        if (this.userInstances == null) {
            this.userInstances = new ArrayList<>();
        }
        this.userInstances.add(userInstancesItem);
        return this;
    }

    public InstanceAssignReq withUserInstances(Consumer<List<InstanceAssignReqUserInstances>> userInstancesSetter) {
        if (this.userInstances == null) {
            this.userInstances = new ArrayList<>();
        }
        userInstancesSetter.accept(this.userInstances);
        return this;
    }

    /**
     * 用户实例绑定关系
     * @return userInstances
     */
    public List<InstanceAssignReqUserInstances> getUserInstances() {
        return userInstances;
    }

    public void setUserInstances(List<InstanceAssignReqUserInstances> userInstances) {
        this.userInstances = userInstances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceAssignReq that = (InstanceAssignReq) obj;
        return Objects.equals(this.userInstances, that.userInstances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userInstances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceAssignReq {\n");
        sb.append("    userInstances: ").append(toIndentedString(userInstances)).append("\n");
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
