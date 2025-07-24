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
 * 查询实例应答
 */
public class QueryInstanceResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_interfaces")

    private List<NetworkInterface> networkInterfaces = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private Image image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private InstanceState state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Map<String, String> metadata = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    private String userData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "launched_at")

    private String launchedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private ErrorStatus error;

    public QueryInstanceResponseBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * UUID（Universally Unique Identifier）是一个 128 位的数字，通常以 32 个十六进制数字的形式表示，分为 5 组，用连字符分隔。具体格式如下：  xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx 其中：  每个 x 是一个十六进制数字（0-9 或 a-f）。 5 组的长度分别是：8 位、4 位、4 位、4 位 和 12 位。 为了匹配这种格式的 UUID，可以使用以下正则表达式：  regex ^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public QueryInstanceResponseBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * instance name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QueryInstanceResponseBody withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * VPC ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public QueryInstanceResponseBody withNetworkInterfaces(List<NetworkInterface> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
        return this;
    }

    public QueryInstanceResponseBody addNetworkInterfacesItem(NetworkInterface networkInterfacesItem) {
        if (this.networkInterfaces == null) {
            this.networkInterfaces = new ArrayList<>();
        }
        this.networkInterfaces.add(networkInterfacesItem);
        return this;
    }

    public QueryInstanceResponseBody withNetworkInterfaces(Consumer<List<NetworkInterface>> networkInterfacesSetter) {
        if (this.networkInterfaces == null) {
            this.networkInterfaces = new ArrayList<>();
        }
        networkInterfacesSetter.accept(this.networkInterfaces);
        return this;
    }

    /**
     * 指定裸机实例的网卡信息。  约束：  一个裸机实例最多挂载2个网卡，参数中第一个网卡会作为裸机实例的主网卡。若用户指定了多组网卡参数，需保证各组参数都属于同一VPC。
     * @return networkInterfaces
     */
    public List<NetworkInterface> getNetworkInterfaces() {
        return networkInterfaces;
    }

    public void setNetworkInterfaces(List<NetworkInterface> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
    }

    public QueryInstanceResponseBody withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public QueryInstanceResponseBody addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public QueryInstanceResponseBody withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public QueryInstanceResponseBody withImage(Image image) {
        this.image = image;
        return this;
    }

    public QueryInstanceResponseBody withImage(Consumer<Image> imageSetter) {
        if (this.image == null) {
            this.image = new Image();
            imageSetter.accept(this.image);
        }

        return this;
    }

    /**
     * Get image
     * @return image
     */
    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public QueryInstanceResponseBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 云服务器描述信息，默认为空字符串。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public QueryInstanceResponseBody withState(InstanceState state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    public InstanceState getState() {
        return state;
    }

    public void setState(InstanceState state) {
        this.state = state;
    }

    public QueryInstanceResponseBody withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public QueryInstanceResponseBody putMetadataItem(String key, String metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, metadataItem);
        return this;
    }

    public QueryInstanceResponseBody withMetadata(Consumer<Map<String, String>> metadataSetter) {
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

    public QueryInstanceResponseBody withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * 创建实例过程中待注入实例自定义数据。支持注入文本、文本文件。   说明： user_data的值为base64编码之后的内容。 注入内容（编码之前的内容）最大长度为32K。
     * @return userData
     */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public QueryInstanceResponseBody withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * UUID（Universally Unique Identifier）是一个 128 位的数字，通常以 32 个十六进制数字的形式表示，分为 5 组，用连字符分隔。具体格式如下：  xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx 其中：  每个 x 是一个十六进制数字（0-9 或 a-f）。 5 组的长度分别是：8 位、4 位、4 位、4 位 和 12 位。 为了匹配这种格式的 UUID，可以使用以下正则表达式：  regex ^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public QueryInstanceResponseBody withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public QueryInstanceResponseBody withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public QueryInstanceResponseBody withLaunchedAt(String launchedAt) {
        this.launchedAt = launchedAt;
        return this;
    }

    /**
     * 启动时间
     * @return launchedAt
     */
    public String getLaunchedAt() {
        return launchedAt;
    }

    public void setLaunchedAt(String launchedAt) {
        this.launchedAt = launchedAt;
    }

    public QueryInstanceResponseBody withError(ErrorStatus error) {
        this.error = error;
        return this;
    }

    public QueryInstanceResponseBody withError(Consumer<ErrorStatus> errorSetter) {
        if (this.error == null) {
            this.error = new ErrorStatus();
            errorSetter.accept(this.error);
        }

        return this;
    }

    /**
     * Get error
     * @return error
     */
    public ErrorStatus getError() {
        return error;
    }

    public void setError(ErrorStatus error) {
        this.error = error;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryInstanceResponseBody that = (QueryInstanceResponseBody) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.networkInterfaces, that.networkInterfaces)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.image, that.image)
            && Objects.equals(this.description, that.description) && Objects.equals(this.state, that.state)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.userData, that.userData)
            && Objects.equals(this.serverId, that.serverId) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.launchedAt, that.launchedAt)
            && Objects.equals(this.error, that.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            vpcId,
            networkInterfaces,
            tags,
            image,
            description,
            state,
            metadata,
            userData,
            serverId,
            createdAt,
            updatedAt,
            launchedAt,
            error);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryInstanceResponseBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    networkInterfaces: ").append(toIndentedString(networkInterfaces)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    launchedAt: ").append(toIndentedString(launchedAt)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
