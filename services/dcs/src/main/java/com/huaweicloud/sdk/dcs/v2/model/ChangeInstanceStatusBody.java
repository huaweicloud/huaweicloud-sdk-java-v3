package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 重启、清空实例数据的请求体 */
public class ChangeInstanceStatusBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<String> instances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    public ChangeInstanceStatusBody withInstances(List<String> instances) {
        this.instances = instances;
        return this;
    }

    public ChangeInstanceStatusBody addInstancesItem(String instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ChangeInstanceStatusBody withInstances(Consumer<List<String>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /** 实例的ID列表。
     * 
     * @return instances */
    public List<String> getInstances() {
        return instances;
    }

    public void setInstances(List<String> instances) {
        this.instances = instances;
    }

    public ChangeInstanceStatusBody withAction(String action) {
        this.action = action;
        return this;
    }

    /** 对实例的操作： restart: 强制重启 soft_restart: 软重启，只重启进程 flush: 清空数据 > 当前版本，只有Redis 4.0和Redis 5.0实例支持清空数据功能，即flush操作。
     * 
     * @return action */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeInstanceStatusBody changeInstanceStatusBody = (ChangeInstanceStatusBody) o;
        return Objects.equals(this.instances, changeInstanceStatusBody.instances)
            && Objects.equals(this.action, changeInstanceStatusBody.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instances, action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeInstanceStatusBody {\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
