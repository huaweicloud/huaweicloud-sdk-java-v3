package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新虚拟接口对等体参数
 */
public class UpdateVifPeer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_ep_group")

    private List<String> remoteEpGroup = null;

    public UpdateVifPeer withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * VIF对等体名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateVifPeer withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * VIF对等体名字描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateVifPeer withRemoteEpGroup(List<String> remoteEpGroup) {
        this.remoteEpGroup = remoteEpGroup;
        return this;
    }

    public UpdateVifPeer addRemoteEpGroupItem(String remoteEpGroupItem) {
        if (this.remoteEpGroup == null) {
            this.remoteEpGroup = new ArrayList<>();
        }
        this.remoteEpGroup.add(remoteEpGroupItem);
        return this;
    }

    public UpdateVifPeer withRemoteEpGroup(Consumer<List<String>> remoteEpGroupSetter) {
        if (this.remoteEpGroup == null) {
            this.remoteEpGroup = new ArrayList<>();
        }
        remoteEpGroupSetter.accept(this.remoteEpGroup);
        return this;
    }

    /**
     * 远端子网列表，记录用户侧的cidrs
     * @return remoteEpGroup
     */
    public List<String> getRemoteEpGroup() {
        return remoteEpGroup;
    }

    public void setRemoteEpGroup(List<String> remoteEpGroup) {
        this.remoteEpGroup = remoteEpGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateVifPeer that = (UpdateVifPeer) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.remoteEpGroup, that.remoteEpGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, remoteEpGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVifPeer {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    remoteEpGroup: ").append(toIndentedString(remoteEpGroup)).append("\n");
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
