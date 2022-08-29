package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowEventDataRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim.0")

    private String dim0;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim.1")

    private String dim1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim.2")

    private String dim2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim.3")

    private String dim3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private Long from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private Long to;

    public ShowEventDataRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 指标命名空间，如：弹性云服务器的命名空间为SYS.ECS，文档数据库的命名空间为SYS.DDS，各服务的命名空间可查看：“[服务命名空间](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ShowEventDataRequest withDim0(String dim0) {
        this.dim0 = dim0;
        return this;
    }

    /**
     * 指标的第一层维度，目前最大支持4个维度，维度编号从0开始；维度格式为dim.0=key,value，如mongodb_cluster_id,4270ff17-aba3-4138-89fa-820594c39755；key为指标的维度信息，如：文档数据库服务，则第一层维度为mongodb_cluster_id，value为文档数据库实例ID；各服务资源的指标维度名称可查看：“[服务指标维度](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
     * @return dim0
     */
    public String getDim0() {
        return dim0;
    }

    public void setDim0(String dim0) {
        this.dim0 = dim0;
    }

    public ShowEventDataRequest withDim1(String dim1) {
        this.dim1 = dim1;
        return this;
    }

    /**
     * 指标的第二层维度，目前最大支持4个维度，维度编号从0开始；维度格式为dim.1=key,value，如mongos_instance_id,c65d39d7-185c-4616-9aca-ad65703b15f9；key为指标的维度信息，如：文档数据库服务，则第二层维度为mongos_instance_id，value为文档数据库集群实例下的mongos节点ID；各资源的指标维度名称可查看：“[服务指标维度](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
     * @return dim1
     */
    public String getDim1() {
        return dim1;
    }

    public void setDim1(String dim1) {
        this.dim1 = dim1;
    }

    public ShowEventDataRequest withDim2(String dim2) {
        this.dim2 = dim2;
        return this;
    }

    /**
     * 指标的第三层维度，目前最大支持4个维度，维度编号从0开始；维度格式为dim.2=key,value，如mongod_primary_instance_id,5f9498e9-36f8-4317-9ea1-ebe28cba99b4；key为指标的维度信息，如：文档数据库服务，则第三层维度为mongod_primary_instance_id，value为文档数据库实例下的主节点ID；各资源的指标维度名称可查看：“[服务指标维度](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
     * @return dim2
     */
    public String getDim2() {
        return dim2;
    }

    public void setDim2(String dim2) {
        this.dim2 = dim2;
    }

    public ShowEventDataRequest withDim3(String dim3) {
        this.dim3 = dim3;
        return this;
    }

    /**
     * 指标的第四层维度，目前最大支持4个维度，维度编号从0开始；维度格式为dim.3=key,value，如mongod_secondary_instance_id,b46fa2c7-aac6-4ae3-9337-f4ea97f885cb；key为指标的维度信息，如：文档数据库服务，则第四层维度为mongod_secondary_instance_id，value为文档数据库实例下的备节点ID；各资源的指标维度名称可查看：“[服务指标维度](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
     * @return dim3
     */
    public String getDim3() {
        return dim3;
    }

    public void setDim3(String dim3) {
        this.dim3 = dim3;
    }

    public ShowEventDataRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 事件类型，只允许字母、下划线、中划线，字母开头，长度不超过64，如instance_host_info。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowEventDataRequest withFrom(Long from) {
        this.from = from;
        return this;
    }

    /**
     * 查询数据起始时间，UNIX时间戳，单位毫秒；如：1607146998177。
     * @return from
     */
    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public ShowEventDataRequest withTo(Long to) {
        this.to = to;
        return this;
    }

    /**
     * 查询数据截止时间UNIX时间戳，单位毫秒。from必须小于to；如：1607150598177。
     * @return to
     */
    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowEventDataRequest showEventDataRequest = (ShowEventDataRequest) o;
        return Objects.equals(this.namespace, showEventDataRequest.namespace)
            && Objects.equals(this.dim0, showEventDataRequest.dim0)
            && Objects.equals(this.dim1, showEventDataRequest.dim1)
            && Objects.equals(this.dim2, showEventDataRequest.dim2)
            && Objects.equals(this.dim3, showEventDataRequest.dim3)
            && Objects.equals(this.type, showEventDataRequest.type)
            && Objects.equals(this.from, showEventDataRequest.from) && Objects.equals(this.to, showEventDataRequest.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, dim0, dim1, dim2, dim3, type, from, to);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEventDataRequest {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    dim0: ").append(toIndentedString(dim0)).append("\n");
        sb.append("    dim1: ").append(toIndentedString(dim1)).append("\n");
        sb.append("    dim2: ").append(toIndentedString(dim2)).append("\n");
        sb.append("    dim3: ").append(toIndentedString(dim3)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
