package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建实例请求参数
 */
public class RunInstancesOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_interfaces")

    private List<RunInstancesOptionsNetworkInterfaces> networkInterfaces = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Map<String, String> metadata = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "placement")

    private RunInstancesOptionsPlacement placement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_count")

    private Integer minCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_count")

    private Integer maxCount;

    public RunInstancesOptions withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 设置实例主机名称。取值范围：只能由中文字符、英文字母（a~z，A~Z）、数字（0~9）、下划线（_）、中划线（-）、点（.）组成，且长度为[1-63]个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RunInstancesOptions withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 镜像ID
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public RunInstancesOptions withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 创建网卡所属的 VPC ID，可通过 VPC API 查询：https://support.huaweicloud.com/api-vpc/vpc_api01_0003.html。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public RunInstancesOptions withNetworkInterfaces(List<RunInstancesOptionsNetworkInterfaces> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
        return this;
    }

    public RunInstancesOptions addNetworkInterfacesItem(RunInstancesOptionsNetworkInterfaces networkInterfacesItem) {
        if (this.networkInterfaces == null) {
            this.networkInterfaces = new ArrayList<>();
        }
        this.networkInterfaces.add(networkInterfacesItem);
        return this;
    }

    public RunInstancesOptions withNetworkInterfaces(
        Consumer<List<RunInstancesOptionsNetworkInterfaces>> networkInterfacesSetter) {
        if (this.networkInterfaces == null) {
            this.networkInterfaces = new ArrayList<>();
        }
        networkInterfacesSetter.accept(this.networkInterfaces);
        return this;
    }

    /**
     * 指定裸机实例的网卡信息。  约束： 一个裸机实例最多挂载2个网卡，参数中第一个网卡会作为裸机实例的主网卡。若用户指定了多组网卡参数，需保证各组参数都属于同一VPC。
     * @return networkInterfaces
     */
    public List<RunInstancesOptionsNetworkInterfaces> getNetworkInterfaces() {
        return networkInterfaces;
    }

    public void setNetworkInterfaces(List<RunInstancesOptionsNetworkInterfaces> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
    }

    public RunInstancesOptions withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 设置实例的管理员账户初始登录密码，其中，Linux管理员账户为root，Windows管理员账户为Administrator。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RunInstancesOptions withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public RunInstancesOptions putMetadataItem(String key, String metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, metadataItem);
        return this;
    }

    public RunInstancesOptions withMetadata(Consumer<Map<String, String>> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        metadataSetter.accept(this.metadata);
        return this;
    }

    /**
     * 创建裸机实例的元数据。  可以通过元数据自定义键值对。   说明： 如果元数据中包含了敏感数据，您应当采取适当的措施来保护敏感数据，比如限制访问范围、加密等。 最多可注入10对键值（Key/Value）。 主键（Key）只能由大写字母（A-Z）、小写字母（a-z）、数字（0-9）、中划线（-）、下划线（_）、冒号（:）、空格（ ）和小数点（.）组成，长度为[1-255]个字符。     值（value）最大长度为255个字符。
     * @return metadata
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public RunInstancesOptions withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 裸机实例的描述信息，默认为空字符串。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RunInstancesOptions withPlacement(RunInstancesOptionsPlacement placement) {
        this.placement = placement;
        return this;
    }

    public RunInstancesOptions withPlacement(Consumer<RunInstancesOptionsPlacement> placementSetter) {
        if (this.placement == null) {
            this.placement = new RunInstancesOptionsPlacement();
            placementSetter.accept(this.placement);
        }

        return this;
    }

    /**
     * Get placement
     * @return placement
     */
    public RunInstancesOptionsPlacement getPlacement() {
        return placement;
    }

    public void setPlacement(RunInstancesOptionsPlacement placement) {
        this.placement = placement;
    }

    public RunInstancesOptions withMinCount(Integer minCount) {
        this.minCount = minCount;
        return this;
    }

    /**
     * 必须成功启动的最小实例数量。如果无法满足此数量，整个请求失败（不会启动任何实例）。
     * maximum: 100
     * @return minCount
     */
    public Integer getMinCount() {
        return minCount;
    }

    public void setMinCount(Integer minCount) {
        this.minCount = minCount;
    }

    public RunInstancesOptions withMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    /**
     * 允许启动的最大实例数量。尝试启动最多该数量的实例，但实际启动数可能介于 min_count 和 max_count 之间
     * maximum: 100
     * @return maxCount
     */
    public Integer getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RunInstancesOptions that = (RunInstancesOptions) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.networkInterfaces, that.networkInterfaces)
            && Objects.equals(this.password, that.password) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.description, that.description) && Objects.equals(this.placement, that.placement)
            && Objects.equals(this.minCount, that.minCount) && Objects.equals(this.maxCount, that.maxCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            imageId,
            vpcId,
            networkInterfaces,
            password,
            metadata,
            description,
            placement,
            minCount,
            maxCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunInstancesOptions {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    networkInterfaces: ").append(toIndentedString(networkInterfaces)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    placement: ").append(toIndentedString(placement)).append("\n");
        sb.append("    minCount: ").append(toIndentedString(minCount)).append("\n");
        sb.append("    maxCount: ").append(toIndentedString(maxCount)).append("\n");
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
