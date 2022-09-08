package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class MigrateSubNetworkInterfaceOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_network_interfaces")

    private List<Map<String, String>> subNetworkInterfaces = null;

    public MigrateSubNetworkInterfaceOption withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 目的宿主网卡ID
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public MigrateSubNetworkInterfaceOption withSubNetworkInterfaces(List<Map<String, String>> subNetworkInterfaces) {
        this.subNetworkInterfaces = subNetworkInterfaces;
        return this;
    }

    public MigrateSubNetworkInterfaceOption addSubNetworkInterfacesItem(Map<String, String> subNetworkInterfacesItem) {
        if (this.subNetworkInterfaces == null) {
            this.subNetworkInterfaces = new ArrayList<>();
        }
        this.subNetworkInterfaces.add(subNetworkInterfacesItem);
        return this;
    }

    public MigrateSubNetworkInterfaceOption withSubNetworkInterfaces(
        Consumer<List<Map<String, String>>> subNetworkInterfacesSetter) {
        if (this.subNetworkInterfaces == null) {
            this.subNetworkInterfaces = new ArrayList<>();
        }
        subNetworkInterfacesSetter.accept(this.subNetworkInterfaces);
        return this;
    }

    /**
     * 待迁移辅助弹性网卡列表
     * @return subNetworkInterfaces
     */
    public List<Map<String, String>> getSubNetworkInterfaces() {
        return subNetworkInterfaces;
    }

    public void setSubNetworkInterfaces(List<Map<String, String>> subNetworkInterfaces) {
        this.subNetworkInterfaces = subNetworkInterfaces;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MigrateSubNetworkInterfaceOption migrateSubNetworkInterfaceOption = (MigrateSubNetworkInterfaceOption) o;
        return Objects.equals(this.parentId, migrateSubNetworkInterfaceOption.parentId)
            && Objects.equals(this.subNetworkInterfaces, migrateSubNetworkInterfaceOption.subNetworkInterfaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentId, subNetworkInterfaces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrateSubNetworkInterfaceOption {\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    subNetworkInterfaces: ").append(toIndentedString(subNetworkInterfaces)).append("\n");
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
