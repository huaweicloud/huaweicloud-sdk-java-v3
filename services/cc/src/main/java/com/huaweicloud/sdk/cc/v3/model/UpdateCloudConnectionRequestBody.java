package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新云连接实例的请求体。
 */
public class UpdateCloudConnectionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_connection")

    @JacksonXmlProperty(localName = "cloud_connection")

    private UpdateCloudConnection cloudConnection;

    public UpdateCloudConnectionRequestBody withCloudConnection(UpdateCloudConnection cloudConnection) {
        this.cloudConnection = cloudConnection;
        return this;
    }

    public UpdateCloudConnectionRequestBody withCloudConnection(Consumer<UpdateCloudConnection> cloudConnectionSetter) {
        if (this.cloudConnection == null) {
            this.cloudConnection = new UpdateCloudConnection();
            cloudConnectionSetter.accept(this.cloudConnection);
        }

        return this;
    }

    /**
     * Get cloudConnection
     * @return cloudConnection
     */
    public UpdateCloudConnection getCloudConnection() {
        return cloudConnection;
    }

    public void setCloudConnection(UpdateCloudConnection cloudConnection) {
        this.cloudConnection = cloudConnection;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateCloudConnectionRequestBody updateCloudConnectionRequestBody = (UpdateCloudConnectionRequestBody) o;
        return Objects.equals(this.cloudConnection, updateCloudConnectionRequestBody.cloudConnection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudConnection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCloudConnectionRequestBody {\n");
        sb.append("    cloudConnection: ").append(toIndentedString(cloudConnection)).append("\n");
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
