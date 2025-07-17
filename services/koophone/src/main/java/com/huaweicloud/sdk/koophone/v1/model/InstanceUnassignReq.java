package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 云机取消分配用户请求
 */
public class InstanceUnassignReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_instances")

    private List<UserInstanceInfo> userInstances = null;

    public InstanceUnassignReq withUserInstances(List<UserInstanceInfo> userInstances) {
        this.userInstances = userInstances;
        return this;
    }

    public InstanceUnassignReq addUserInstancesItem(UserInstanceInfo userInstancesItem) {
        if (this.userInstances == null) {
            this.userInstances = new ArrayList<>();
        }
        this.userInstances.add(userInstancesItem);
        return this;
    }

    public InstanceUnassignReq withUserInstances(Consumer<List<UserInstanceInfo>> userInstancesSetter) {
        if (this.userInstances == null) {
            this.userInstances = new ArrayList<>();
        }
        userInstancesSetter.accept(this.userInstances);
        return this;
    }

    /**
     * Get userInstances
     * @return userInstances
     */
    public List<UserInstanceInfo> getUserInstances() {
        return userInstances;
    }

    public void setUserInstances(List<UserInstanceInfo> userInstances) {
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
        InstanceUnassignReq that = (InstanceUnassignReq) obj;
        return Objects.equals(this.userInstances, that.userInstances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userInstances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceUnassignReq {\n");
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
