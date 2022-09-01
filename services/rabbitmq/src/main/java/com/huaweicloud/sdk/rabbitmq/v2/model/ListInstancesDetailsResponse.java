package com.huaweicloud.sdk.rabbitmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListInstancesDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    @JacksonXmlProperty(localName = "instances")

    private List<ShowInstanceResp> instances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_num")

    @JacksonXmlProperty(localName = "instance_num")

    private Integer instanceNum;

    public ListInstancesDetailsResponse withInstances(List<ShowInstanceResp> instances) {
        this.instances = instances;
        return this;
    }

    public ListInstancesDetailsResponse addInstancesItem(ShowInstanceResp instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ListInstancesDetailsResponse withInstances(Consumer<List<ShowInstanceResp>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * 实例列表。
     * @return instances
     */
    public List<ShowInstanceResp> getInstances() {
        return instances;
    }

    public void setInstances(List<ShowInstanceResp> instances) {
        this.instances = instances;
    }

    public ListInstancesDetailsResponse withInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
        return this;
    }

    /**
     * 实例个数。
     * @return instanceNum
     */
    public Integer getInstanceNum() {
        return instanceNum;
    }

    public void setInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstancesDetailsResponse listInstancesDetailsResponse = (ListInstancesDetailsResponse) o;
        return Objects.equals(this.instances, listInstancesDetailsResponse.instances)
            && Objects.equals(this.instanceNum, listInstancesDetailsResponse.instanceNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instances, instanceNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesDetailsResponse {\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    instanceNum: ").append(toIndentedString(instanceNum)).append("\n");
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
