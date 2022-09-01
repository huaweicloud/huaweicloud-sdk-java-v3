package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 创建复制对请求体数据结构
 */
public class CreateReplicationRequestParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_id")

    @JacksonXmlProperty(localName = "server_group_id")

    private String serverGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_id")

    @JacksonXmlProperty(localName = "volume_id")

    private String volumeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    @JacksonXmlProperty(localName = "cluster_id")

    private String clusterId;

    public CreateReplicationRequestParams withServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }

    /**
     * 保护组的ID。
     * @return serverGroupId
     */
    public String getServerGroupId() {
        return serverGroupId;
    }

    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    public CreateReplicationRequestParams withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * 生产站点卷的ID。
     * @return volumeId
     */
    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public CreateReplicationRequestParams withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 指定复制对的名称，最大支持长度为64个字节。只包含中文字符、英文字母（a～ｚ、Ａ～Ｚ）、数字（０~９）、小数点（．）、下划线（_）、中划线（-）。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateReplicationRequestParams withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 指定复制对的描述，最大支持长度为64个字节，不能包含左尖括号（<）或右尖括号（>）。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateReplicationRequestParams withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 专属分布式存储池ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateReplicationRequestParams createReplicationRequestParams = (CreateReplicationRequestParams) o;
        return Objects.equals(this.serverGroupId, createReplicationRequestParams.serverGroupId)
            && Objects.equals(this.volumeId, createReplicationRequestParams.volumeId)
            && Objects.equals(this.name, createReplicationRequestParams.name)
            && Objects.equals(this.description, createReplicationRequestParams.description)
            && Objects.equals(this.clusterId, createReplicationRequestParams.clusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverGroupId, volumeId, name, description, clusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateReplicationRequestParams {\n");
        sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
        sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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
