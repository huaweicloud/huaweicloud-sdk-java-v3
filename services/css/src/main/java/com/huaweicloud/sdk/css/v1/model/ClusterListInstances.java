package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点对象。
 */
public class ClusterListInstances {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specCode")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "azCode")

    private String azCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private ClusterVolumeRsp volume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceId")

    private String resourceId;

    public ClusterListInstances withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 节点状态值。  - 100：创建中。 - 200：可用。 - 303：不可用，如创建失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ClusterListInstances withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 当前节点的类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ClusterListInstances withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClusterListInstances withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名字。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClusterListInstances withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 节点规格名称。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public ClusterListInstances withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    /**
     * 节点所属AZ信息。
     * @return azCode
     */
    public String getAzCode() {
        return azCode;
    }

    public void setAzCode(String azCode) {
        this.azCode = azCode;
    }

    public ClusterListInstances withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 实例ip信息。
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ClusterListInstances withVolume(ClusterVolumeRsp volume) {
        this.volume = volume;
        return this;
    }

    public ClusterListInstances withVolume(Consumer<ClusterVolumeRsp> volumeSetter) {
        if (this.volume == null) {
            this.volume = new ClusterVolumeRsp();
            volumeSetter.accept(this.volume);
        }

        return this;
    }

    /**
     * Get volume
     * @return volume
     */
    public ClusterVolumeRsp getVolume() {
        return volume;
    }

    public void setVolume(ClusterVolumeRsp volume) {
        this.volume = volume;
    }

    public ClusterListInstances withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 该实例对应的资源Id。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterListInstances that = (ClusterListInstances) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.type, that.type)
            && Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.specCode, that.specCode) && Objects.equals(this.azCode, that.azCode)
            && Objects.equals(this.ip, that.ip) && Objects.equals(this.volume, that.volume)
            && Objects.equals(this.resourceId, that.resourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, type, id, name, specCode, azCode, ip, volume, resourceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterListInstances {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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
