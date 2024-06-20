package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 预调配模板设备资源详情结构体。
 */
public class DeviceResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_name")

    private ParameterRef deviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private ParameterRef nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private Object productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagRef> tags = null;

    public DeviceResource withDeviceName(ParameterRef deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    public DeviceResource withDeviceName(Consumer<ParameterRef> deviceNameSetter) {
        if (this.deviceName == null) {
            this.deviceName = new ParameterRef();
            deviceNameSetter.accept(this.deviceName);
        }

        return this;
    }

    /**
     * Get deviceName
     * @return deviceName
     */
    public ParameterRef getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(ParameterRef deviceName) {
        this.deviceName = deviceName;
    }

    public DeviceResource withNodeId(ParameterRef nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public DeviceResource withNodeId(Consumer<ParameterRef> nodeIdSetter) {
        if (this.nodeId == null) {
            this.nodeId = new ParameterRef();
            nodeIdSetter.accept(this.nodeId);
        }

        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    public ParameterRef getNodeId() {
        return nodeId;
    }

    public void setNodeId(ParameterRef nodeId) {
        this.nodeId = nodeId;
    }

    public DeviceResource withProductId(Object productId) {
        this.productId = productId;
        return this;
    }

    /**
     * **参数说明**：设备所属的产品id，可以是一个明确的静态字符串id，也可以是动态的模板参数引用 - 明确的静态字符串：\"642bf260f2f9030e44210d8d\"。**取值范围**：长度不超过36，只允许字母、数字、下划线（_）、连接符（-）的组合。\" - 参数引用: {\"ref\" : \"iotda::certificate::country\"}
     * @return productId
     */
    public Object getProductId() {
        return productId;
    }

    public void setProductId(Object productId) {
        this.productId = productId;
    }

    public DeviceResource withTags(List<TagRef> tags) {
        this.tags = tags;
        return this;
    }

    public DeviceResource addTagsItem(TagRef tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public DeviceResource withTags(Consumer<List<TagRef>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数说明**：设备绑定的标签列表
     * @return tags
     */
    public List<TagRef> getTags() {
        return tags;
    }

    public void setTags(List<TagRef> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeviceResource that = (DeviceResource) obj;
        return Objects.equals(this.deviceName, that.deviceName) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.productId, that.productId) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceName, nodeId, productId, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceResource {\n");
        sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
