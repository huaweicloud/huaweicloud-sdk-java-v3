package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用于在Kubernetes中标识一个拥有者对象，它提供了足够的信息来识别和关联资源之间的所有权关系
 */
public class OwnerReference {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private String uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "controller")

    private Boolean controller;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blockOwnerDeletion")

    private Boolean blockOwnerDeletion;

    public OwnerReference withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * 标识引用对象的API版本
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public OwnerReference withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * 引用对象的类型
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public OwnerReference withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 引用对象的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OwnerReference withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * 引用对象的uid
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public OwnerReference withController(Boolean controller) {
        this.controller = controller;
        return this;
    }

    /**
     * 如果为true，表示该引用指向管理该资源的控制器
     * @return controller
     */
    public Boolean getController() {
        return controller;
    }

    public void setController(Boolean controller) {
        this.controller = controller;
    }

    public OwnerReference withBlockOwnerDeletion(Boolean blockOwnerDeletion) {
        this.blockOwnerDeletion = blockOwnerDeletion;
        return this;
    }

    /**
     * 当为true且拥有者有名为\"foregroundDeletion\"的finalizer 时，会阻止拥有者被删除，直到这个引用被移除
     * @return blockOwnerDeletion
     */
    public Boolean getBlockOwnerDeletion() {
        return blockOwnerDeletion;
    }

    public void setBlockOwnerDeletion(Boolean blockOwnerDeletion) {
        this.blockOwnerDeletion = blockOwnerDeletion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OwnerReference that = (OwnerReference) obj;
        return Objects.equals(this.apiVersion, that.apiVersion) && Objects.equals(this.kind, that.kind)
            && Objects.equals(this.name, that.name) && Objects.equals(this.uid, that.uid)
            && Objects.equals(this.controller, that.controller)
            && Objects.equals(this.blockOwnerDeletion, that.blockOwnerDeletion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, name, uid, controller, blockOwnerDeletion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OwnerReference {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    controller: ").append(toIndentedString(controller)).append("\n");
        sb.append("    blockOwnerDeletion: ").append(toIndentedString(blockOwnerDeletion)).append("\n");
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
