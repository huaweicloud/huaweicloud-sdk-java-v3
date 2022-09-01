package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateCloudPersistentVolumeClaimsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    @JacksonXmlProperty(localName = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Cluster-ID")

    @JacksonXmlProperty(localName = "X-Cluster-ID")

    private String xClusterID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private PersistentVolumeClaim body;

    public CreateCloudPersistentVolumeClaimsRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Namespace是对一组资源和对象的抽象集合，用来将系统内部的对象划分为不同的项目组或用户组。以小写字母开头，由小写字母、数字、中划线（-）组成，且不能以中划线（-）结尾。  使用namespace有如下约束：  - 用户自定义的namespace，使用前必须先[创建Namespace](cce_02_0050.xml)  - 系统自带的namespace：default  - 不能使用kube-system与kube-public 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public CreateCloudPersistentVolumeClaimsRequest withXClusterID(String xClusterID) {
        this.xClusterID = xClusterID;
        return this;
    }

    /**
     * 集群ID，使用**https://Endpoint/uri**这种URL格式时必须指定此参数。获取方式请参见[如何获取接口URI中参数](cce_02_0271.xml)。 
     * @return xClusterID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Cluster-ID")
    public String getXClusterID() {
        return xClusterID;
    }

    public void setXClusterID(String xClusterID) {
        this.xClusterID = xClusterID;
    }

    public CreateCloudPersistentVolumeClaimsRequest withBody(PersistentVolumeClaim body) {
        this.body = body;
        return this;
    }

    public CreateCloudPersistentVolumeClaimsRequest withBody(Consumer<PersistentVolumeClaim> bodySetter) {
        if (this.body == null) {
            this.body = new PersistentVolumeClaim();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public PersistentVolumeClaim getBody() {
        return body;
    }

    public void setBody(PersistentVolumeClaim body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCloudPersistentVolumeClaimsRequest createCloudPersistentVolumeClaimsRequest =
            (CreateCloudPersistentVolumeClaimsRequest) o;
        return Objects.equals(this.namespace, createCloudPersistentVolumeClaimsRequest.namespace)
            && Objects.equals(this.xClusterID, createCloudPersistentVolumeClaimsRequest.xClusterID)
            && Objects.equals(this.body, createCloudPersistentVolumeClaimsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, xClusterID, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCloudPersistentVolumeClaimsRequest {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    xClusterID: ").append(toIndentedString(xClusterID)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
