package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 根据不同的任务，显示不同的内容。
 */
public class GetJobInfoResponseBodyJobEntities {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance")

    private GetJobInfoResponseBodyJobEntitiesInstance instance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_ids")

    private List<String> resourceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private GetJobInfoResponseBodyJobEntitiesVolume volume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_strategy")

    private String switchStrategy;

    public GetJobInfoResponseBodyJobEntities withInstance(GetJobInfoResponseBodyJobEntitiesInstance instance) {
        this.instance = instance;
        return this;
    }

    public GetJobInfoResponseBodyJobEntities withInstance(
        Consumer<GetJobInfoResponseBodyJobEntitiesInstance> instanceSetter) {
        if (this.instance == null) {
            this.instance = new GetJobInfoResponseBodyJobEntitiesInstance();
            instanceSetter.accept(this.instance);
        }

        return this;
    }

    /**
     * Get instance
     * @return instance
     */
    public GetJobInfoResponseBodyJobEntitiesInstance getInstance() {
        return instance;
    }

    public void setInstance(GetJobInfoResponseBodyJobEntitiesInstance instance) {
        this.instance = instance;
    }

    public GetJobInfoResponseBodyJobEntities withResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    public GetJobInfoResponseBodyJobEntities addResourceIdsItem(String resourceIdsItem) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        this.resourceIds.add(resourceIdsItem);
        return this;
    }

    public GetJobInfoResponseBodyJobEntities withResourceIds(Consumer<List<String>> resourceIdsSetter) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        resourceIdsSetter.accept(this.resourceIds);
        return this;
    }

    /**
     * 创建实例，单转主备，创建只读实例，调整实例容量任务时等任务时返回。
     * @return resourceIds
     */
    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    public GetJobInfoResponseBodyJobEntities withVolume(GetJobInfoResponseBodyJobEntitiesVolume volume) {
        this.volume = volume;
        return this;
    }

    public GetJobInfoResponseBodyJobEntities withVolume(
        Consumer<GetJobInfoResponseBodyJobEntitiesVolume> volumeSetter) {
        if (this.volume == null) {
            this.volume = new GetJobInfoResponseBodyJobEntitiesVolume();
            volumeSetter.accept(this.volume);
        }

        return this;
    }

    /**
     * Get volume
     * @return volume
     */
    public GetJobInfoResponseBodyJobEntitiesVolume getVolume() {
        return volume;
    }

    public void setVolume(GetJobInfoResponseBodyJobEntitiesVolume volume) {
        this.volume = volume;
    }

    public GetJobInfoResponseBodyJobEntities withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 绑定/解绑弹性IP，开启远程连接等任务时返回。
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public GetJobInfoResponseBodyJobEntities withSwitchStrategy(String switchStrategy) {
        this.switchStrategy = switchStrategy;
        return this;
    }

    /**
     * 主备倒换任务时返回。
     * @return switchStrategy
     */
    public String getSwitchStrategy() {
        return switchStrategy;
    }

    public void setSwitchStrategy(String switchStrategy) {
        this.switchStrategy = switchStrategy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetJobInfoResponseBodyJobEntities that = (GetJobInfoResponseBodyJobEntities) obj;
        return Objects.equals(this.instance, that.instance) && Objects.equals(this.resourceIds, that.resourceIds)
            && Objects.equals(this.volume, that.volume) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.switchStrategy, that.switchStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instance, resourceIds, volume, publicIp, switchStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetJobInfoResponseBodyJobEntities {\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
        sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    switchStrategy: ").append(toIndentedString(switchStrategy)).append("\n");
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
