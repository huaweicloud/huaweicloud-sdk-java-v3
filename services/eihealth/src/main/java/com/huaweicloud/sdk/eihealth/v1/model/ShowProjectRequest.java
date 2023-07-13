package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowProjectRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Bucket-Name")

    private String xBucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Namespace-Name")

    private String xNamespaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_id")

    private String eihealthProjectId;

    public ShowProjectRequest withXBucketName(String xBucketName) {
        this.xBucketName = xBucketName;
        return this;
    }

    /**
     * X-Bucket-Name
     * @return xBucketName
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Bucket-Name")
    public String getXBucketName() {
        return xBucketName;
    }

    public void setXBucketName(String xBucketName) {
        this.xBucketName = xBucketName;
    }

    public ShowProjectRequest withXNamespaceName(String xNamespaceName) {
        this.xNamespaceName = xNamespaceName;
        return this;
    }

    /**
     * X-Namespace
     * @return xNamespaceName
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Namespace-Name")
    public String getXNamespaceName() {
        return xNamespaceName;
    }

    public void setXNamespaceName(String xNamespaceName) {
        this.xNamespaceName = xNamespaceName;
    }

    public ShowProjectRequest withEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
        return this;
    }

    /**
     * 医疗智能体平台项目ID，您可以在EIHealth平台单击所需的项目名称，进入项目设置页面查看。
     * @return eihealthProjectId
     */
    public String getEihealthProjectId() {
        return eihealthProjectId;
    }

    public void setEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowProjectRequest that = (ShowProjectRequest) obj;
        return Objects.equals(this.xBucketName, that.xBucketName)
            && Objects.equals(this.xNamespaceName, that.xNamespaceName)
            && Objects.equals(this.eihealthProjectId, that.eihealthProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xBucketName, xNamespaceName, eihealthProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectRequest {\n");
        sb.append("    xBucketName: ").append(toIndentedString(xBucketName)).append("\n");
        sb.append("    xNamespaceName: ").append(toIndentedString(xNamespaceName)).append("\n");
        sb.append("    eihealthProjectId: ").append(toIndentedString(eihealthProjectId)).append("\n");
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
