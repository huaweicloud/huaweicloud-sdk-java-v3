package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 直接创建订阅时需要的参数。
 */
public class CreateSubscription4InstanceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publication_id")

    private String publicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publication_name")

    private String publicationName;

    public CreateSubscription4InstanceInfo withPublicationId(String publicationId) {
        this.publicationId = publicationId;
        return this;
    }

    /**
     * 直接创建订阅时，服务器来源为云上实例的发布id。
     * @return publicationId
     */
    public String getPublicationId() {
        return publicationId;
    }

    public void setPublicationId(String publicationId) {
        this.publicationId = publicationId;
    }

    public CreateSubscription4InstanceInfo withPublicationName(String publicationName) {
        this.publicationName = publicationName;
        return this;
    }

    /**
     * 直接创建订阅时，服务器来源为云上实例的发布名称。
     * @return publicationName
     */
    public String getPublicationName() {
        return publicationName;
    }

    public void setPublicationName(String publicationName) {
        this.publicationName = publicationName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSubscription4InstanceInfo that = (CreateSubscription4InstanceInfo) obj;
        return Objects.equals(this.publicationId, that.publicationId)
            && Objects.equals(this.publicationName, that.publicationName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicationId, publicationName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSubscription4InstanceInfo {\n");
        sb.append("    publicationId: ").append(toIndentedString(publicationId)).append("\n");
        sb.append("    publicationName: ").append(toIndentedString(publicationName)).append("\n");
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
