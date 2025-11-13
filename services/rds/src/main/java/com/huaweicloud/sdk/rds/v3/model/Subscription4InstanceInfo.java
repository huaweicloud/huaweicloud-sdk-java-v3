package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 本地订阅信息。
 */
public class Subscription4InstanceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publication_instance_id")

    private String publicationInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publication_instance_name")

    private String publicationInstanceName;

    public Subscription4InstanceInfo withPublicationInstanceId(String publicationInstanceId) {
        this.publicationInstanceId = publicationInstanceId;
        return this;
    }

    /**
     * 发布服务器来源为云上实例时的发布实例id。
     * @return publicationInstanceId
     */
    public String getPublicationInstanceId() {
        return publicationInstanceId;
    }

    public void setPublicationInstanceId(String publicationInstanceId) {
        this.publicationInstanceId = publicationInstanceId;
    }

    public Subscription4InstanceInfo withPublicationInstanceName(String publicationInstanceName) {
        this.publicationInstanceName = publicationInstanceName;
        return this;
    }

    /**
     * 发布服务器名称。
     * @return publicationInstanceName
     */
    public String getPublicationInstanceName() {
        return publicationInstanceName;
    }

    public void setPublicationInstanceName(String publicationInstanceName) {
        this.publicationInstanceName = publicationInstanceName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Subscription4InstanceInfo that = (Subscription4InstanceInfo) obj;
        return Objects.equals(this.publicationInstanceId, that.publicationInstanceId)
            && Objects.equals(this.publicationInstanceName, that.publicationInstanceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicationInstanceId, publicationInstanceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Subscription4InstanceInfo {\n");
        sb.append("    publicationInstanceId: ").append(toIndentedString(publicationInstanceId)).append("\n");
        sb.append("    publicationInstanceName: ").append(toIndentedString(publicationInstanceName)).append("\n");
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
