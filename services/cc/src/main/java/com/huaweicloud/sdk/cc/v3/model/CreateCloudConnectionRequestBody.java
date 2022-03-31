package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 创建云连接实例的请求体。 */
public class CreateCloudConnectionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_connection")

    private CreateCloudConnection cloudConnection;

    public CreateCloudConnectionRequestBody withCloudConnection(CreateCloudConnection cloudConnection) {
        this.cloudConnection = cloudConnection;
        return this;
    }

    public CreateCloudConnectionRequestBody withCloudConnection(Consumer<CreateCloudConnection> cloudConnectionSetter) {
        if (this.cloudConnection == null) {
            this.cloudConnection = new CreateCloudConnection();
            cloudConnectionSetter.accept(this.cloudConnection);
        }

        return this;
    }

    /** Get cloudConnection
     * 
     * @return cloudConnection */
    public CreateCloudConnection getCloudConnection() {
        return cloudConnection;
    }

    public void setCloudConnection(CreateCloudConnection cloudConnection) {
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
        CreateCloudConnectionRequestBody createCloudConnectionRequestBody = (CreateCloudConnectionRequestBody) o;
        return Objects.equals(this.cloudConnection, createCloudConnectionRequestBody.cloudConnection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudConnection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCloudConnectionRequestBody {\n");
        sb.append("    cloudConnection: ").append(toIndentedString(cloudConnection)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
