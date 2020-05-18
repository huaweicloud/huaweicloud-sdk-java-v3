package com.huaweicloud.sdk.dds.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * ResizeInstanceVolumeOption
 */
public class ResizeInstanceVolumeOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;

    public ResizeInstanceVolumeOption withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    


    /**
     * 角色组ID。 - 对于集群实例，该参数为shard组ID。 - 对于副本集实例，不传该参数。 - 对于副本集和单节点实例，不传该参数。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ResizeInstanceVolumeOption withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 待扩容到的磁盘容量。取值为10的整数倍，并且大于当前磁盘容量。 - 对于集群实例，表示扩容到的单个shard组的磁盘容量。取值范围：10GB~2000GB。 - 对于副本集实例，表示扩容到的实例的磁盘容量，取值范围：10GB~2000GB。 - 对于单节点实例，表示扩容到的实例的磁盘容量，取值范围：10GB~1000GB。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResizeInstanceVolumeOption resizeInstanceVolumeOption = (ResizeInstanceVolumeOption) o;
        return Objects.equals(this.groupId, resizeInstanceVolumeOption.groupId) &&
            Objects.equals(this.size, resizeInstanceVolumeOption.size);
    }
    @Override
    public int hashCode() {
        return Objects.hash(groupId, size);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeInstanceVolumeOption {\n");
            sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
            sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

