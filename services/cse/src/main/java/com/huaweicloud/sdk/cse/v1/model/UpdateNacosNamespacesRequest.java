package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class UpdateNacosNamespacesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-engine-id")

    private String xEngineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Enterprise-Project-ID")

    private String xEnterpriseProjectID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespaceShowName")

    private String namespaceShowName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespaceDesc")

    private String namespaceDesc;

    public UpdateNacosNamespacesRequest withXEngineId(String xEngineId) {
        this.xEngineId = xEngineId;
        return this;
    }

    /**
     * 微服务引擎的实例ID
     * @return xEngineId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-engine-id")
    public String getXEngineId() {
        return xEngineId;
    }

    public void setXEngineId(String xEngineId) {
        this.xEngineId = xEngineId;
    }

    public UpdateNacosNamespacesRequest withXEnterpriseProjectID(String xEnterpriseProjectID) {
        this.xEnterpriseProjectID = xEnterpriseProjectID;
        return this;
    }

    /**
     * 企业项目ID
     * @return xEnterpriseProjectID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Enterprise-Project-ID")
    public String getXEnterpriseProjectID() {
        return xEnterpriseProjectID;
    }

    public void setXEnterpriseProjectID(String xEnterpriseProjectID) {
        this.xEnterpriseProjectID = xEnterpriseProjectID;
    }

    public UpdateNacosNamespacesRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 命名空间ID
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public UpdateNacosNamespacesRequest withNamespaceShowName(String namespaceShowName) {
        this.namespaceShowName = namespaceShowName;
        return this;
    }

    /**
     * 命名空间名，支持非@、#、$、%、^、&、*，不超过128个字符。
     * @return namespaceShowName
     */
    public String getNamespaceShowName() {
        return namespaceShowName;
    }

    public void setNamespaceShowName(String namespaceShowName) {
        this.namespaceShowName = namespaceShowName;
    }

    public UpdateNacosNamespacesRequest withNamespaceDesc(String namespaceDesc) {
        this.namespaceDesc = namespaceDesc;
        return this;
    }

    /**
     * 命名空间描述，不超过256个字符。
     * @return namespaceDesc
     */
    public String getNamespaceDesc() {
        return namespaceDesc;
    }

    public void setNamespaceDesc(String namespaceDesc) {
        this.namespaceDesc = namespaceDesc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateNacosNamespacesRequest that = (UpdateNacosNamespacesRequest) obj;
        return Objects.equals(this.xEngineId, that.xEngineId)
            && Objects.equals(this.xEnterpriseProjectID, that.xEnterpriseProjectID)
            && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.namespaceShowName, that.namespaceShowName)
            && Objects.equals(this.namespaceDesc, that.namespaceDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xEngineId, xEnterpriseProjectID, namespace, namespaceShowName, namespaceDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNacosNamespacesRequest {\n");
        sb.append("    xEngineId: ").append(toIndentedString(xEngineId)).append("\n");
        sb.append("    xEnterpriseProjectID: ").append(toIndentedString(xEnterpriseProjectID)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    namespaceShowName: ").append(toIndentedString(namespaceShowName)).append("\n");
        sb.append("    namespaceDesc: ").append(toIndentedString(namespaceDesc)).append("\n");
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
