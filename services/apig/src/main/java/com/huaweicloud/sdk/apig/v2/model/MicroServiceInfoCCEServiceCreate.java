package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CCE云容器引擎Service信息，service_type为CCE_SERVICE时必填
 */
public class MicroServiceInfoCCEServiceCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    public MicroServiceInfoCCEServiceCreate withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 云容器引擎集群编号
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public MicroServiceInfoCCEServiceCreate withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 命名空间。1-63字符。只能包含小写字母、数字，以及 '-'，必须以字母开头，必须以字母数字结尾。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public MicroServiceInfoCCEServiceCreate withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Service名称。支持汉字，英文，数字，点，中划线，下划线，且只能以英文和汉字开头，1-64字符。 > 中文字符必须为UTF-8或者unicode编码。
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public MicroServiceInfoCCEServiceCreate withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Service的监听端口号。如果是多端口Service，用户需填写一个端口。
     * minimum: 1
     * maximum: 65535
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MicroServiceInfoCCEServiceCreate that = (MicroServiceInfoCCEServiceCreate) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.serviceName, that.serviceName) && Objects.equals(this.port, that.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, namespace, serviceName, port);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MicroServiceInfoCCEServiceCreate {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
