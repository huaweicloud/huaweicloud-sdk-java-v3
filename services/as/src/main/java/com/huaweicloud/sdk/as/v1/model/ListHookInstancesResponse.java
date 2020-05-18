package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.InstanceHangingInfos;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListHookInstancesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_hanging_info")
    
    private List<InstanceHangingInfos> instanceHangingInfo = null;
    
    public ListHookInstancesResponse withInstanceHangingInfo(List<InstanceHangingInfos> instanceHangingInfo) {
        this.instanceHangingInfo = instanceHangingInfo;
        return this;
    }

    
    public ListHookInstancesResponse addInstanceHangingInfoItem(InstanceHangingInfos instanceHangingInfoItem) {
        if (this.instanceHangingInfo == null) {
            this.instanceHangingInfo = new ArrayList<>();
        }
        this.instanceHangingInfo.add(instanceHangingInfoItem);
        return this;
    }

    public ListHookInstancesResponse withInstanceHangingInfo(Consumer<List<InstanceHangingInfos>> instanceHangingInfoSetter) {
        if(this.instanceHangingInfo == null ){
            this.instanceHangingInfo = new ArrayList<>();
        }
        instanceHangingInfoSetter.accept(this.instanceHangingInfo);
        return this;
    }

    /**
     * 伸缩实例生命周期挂钩列表。
     * @return instanceHangingInfo
     */
    public List<InstanceHangingInfos> getInstanceHangingInfo() {
        return instanceHangingInfo;
    }

    public void setInstanceHangingInfo(List<InstanceHangingInfos> instanceHangingInfo) {
        this.instanceHangingInfo = instanceHangingInfo;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListHookInstancesResponse listHookInstancesResponse = (ListHookInstancesResponse) o;
        return Objects.equals(this.instanceHangingInfo, listHookInstancesResponse.instanceHangingInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceHangingInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHookInstancesResponse {\n");
            sb.append("    instanceHangingInfo: ").append(toIndentedString(instanceHangingInfo)).append("\n");
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

