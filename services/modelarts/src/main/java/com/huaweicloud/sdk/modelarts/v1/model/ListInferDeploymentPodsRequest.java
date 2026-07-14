package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListInferDeploymentPodsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment_name")

    private String deploymentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private List<String> status = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_name")

    private String podName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_id")

    private String podId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_node_ip")

    private String podNodeIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_node_name")

    private String podNodeName;

    public ListInferDeploymentPodsRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 服务ID，在[创建服务](CreateInferService.xml)时即可在返回体中获取，也可通过[查询服务列表](ListInferServices.xml)获取当前用户拥有的服务，其中service_id字段即为服务ID。 **约束限制：** 不涉及。 **取值范围：** 服务ID。 **默认取值：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListInferDeploymentPodsRequest withDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
        return this;
    }

    /**
     * **参数解释：** 部署名称，在创建部署时即可在返回体中获取，也可通过[查询服务部署列表](ListInferDeployments.xml)获取当前用户拥有的部署，其name字段即为部署名称。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return deploymentName
     */
    public String getDeploymentName() {
        return deploymentName;
    }

    public void setDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
    }

    public ListInferDeploymentPodsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 服务实例名字，可以为all，为all时去查询所有的服务实例。 **约束限制：** 不涉及。 **取值范围：** 服务实例名字。 **默认取值：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListInferDeploymentPodsRequest withStatus(List<String> status) {
        this.status = status;
        return this;
    }

    public ListInferDeploymentPodsRequest addStatusItem(String statusItem) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        this.status.add(statusItem);
        return this;
    }

    public ListInferDeploymentPodsRequest withStatus(Consumer<List<String>> statusSetter) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        statusSetter.accept(this.status);
        return this;
    }

    /**
     * **参数解释：** pod状态，一次支持多种状态筛选，多种状态以\",\"连接，不能存在空格。默认不过滤。取值范围有7种RUNNING（运行中）、PENDING（未就绪）、SUCCEEDED（成功）、FAILED（失败）、ABNORMAL（异常）、UNKNOWN（未知）、DELETED（已删除）。 **约束限制：** 不涉及。
     * @return status
     */
    public List<String> getStatus() {
        return status;
    }

    public void setStatus(List<String> status) {
        this.status = status;
    }

    public ListInferDeploymentPodsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 指定每一页返回的最大条目数。 **约束限制：** 不涉及。 **取值范围：** [1,500] **默认取值：** 10。
     * minimum: 1
     * maximum: 500
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListInferDeploymentPodsRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 分页列表的起始页。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 0。
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ListInferDeploymentPodsRequest withPodName(String podName) {
        this.podName = podName;
        return this;
    }

    /**
     * **参数解释：** pod名字。 **取值范围：** 不涉及。
     * @return podName
     */
    public String getPodName() {
        return podName;
    }

    public void setPodName(String podName) {
        this.podName = podName;
    }

    public ListInferDeploymentPodsRequest withPodId(String podId) {
        this.podId = podId;
        return this;
    }

    /**
     * **参数解释：** pod ID。 **取值范围：** 不涉及。
     * @return podId
     */
    public String getPodId() {
        return podId;
    }

    public void setPodId(String podId) {
        this.podId = podId;
    }

    public ListInferDeploymentPodsRequest withPodNodeIp(String podNodeIp) {
        this.podNodeIp = podNodeIp;
        return this;
    }

    /**
     * **参数解释：** pod节点IP地址。 **取值范围：** 不涉及。
     * @return podNodeIp
     */
    public String getPodNodeIp() {
        return podNodeIp;
    }

    public void setPodNodeIp(String podNodeIp) {
        this.podNodeIp = podNodeIp;
    }

    public ListInferDeploymentPodsRequest withPodNodeName(String podNodeName) {
        this.podNodeName = podNodeName;
        return this;
    }

    /**
     * **参数解释：** pod节点名称。 **取值范围：** 不涉及。
     * @return podNodeName
     */
    public String getPodNodeName() {
        return podNodeName;
    }

    public void setPodNodeName(String podNodeName) {
        this.podNodeName = podNodeName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInferDeploymentPodsRequest that = (ListInferDeploymentPodsRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.deploymentName, that.deploymentName)
            && Objects.equals(this.name, that.name) && Objects.equals(this.status, that.status)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.podName, that.podName) && Objects.equals(this.podId, that.podId)
            && Objects.equals(this.podNodeIp, that.podNodeIp) && Objects.equals(this.podNodeName, that.podNodeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, deploymentName, name, status, limit, offset, podName, podId, podNodeIp, podNodeName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInferDeploymentPodsRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    deploymentName: ").append(toIndentedString(deploymentName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
        sb.append("    podId: ").append(toIndentedString(podId)).append("\n");
        sb.append("    podNodeIp: ").append(toIndentedString(podNodeIp)).append("\n");
        sb.append("    podNodeName: ").append(toIndentedString(podNodeName)).append("\n");
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
