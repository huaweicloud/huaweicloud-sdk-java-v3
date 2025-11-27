package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateClusterPolicyInstanceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterid")

    private String clusterid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UCSConstraintRequest body;

    public CreateClusterPolicyInstanceRequest withClusterid(String clusterid) {
        this.clusterid = clusterid;
        return this;
    }

    /**
     * 集群id
     * @return clusterid
     */
    public String getClusterid() {
        return clusterid;
    }

    public void setClusterid(String clusterid) {
        this.clusterid = clusterid;
    }

    public CreateClusterPolicyInstanceRequest withBody(UCSConstraintRequest body) {
        this.body = body;
        return this;
    }

    public CreateClusterPolicyInstanceRequest withBody(Consumer<UCSConstraintRequest> bodySetter) {
        if (this.body == null) {
            this.body = new UCSConstraintRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UCSConstraintRequest getBody() {
        return body;
    }

    public void setBody(UCSConstraintRequest body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateClusterPolicyInstanceRequest that = (CreateClusterPolicyInstanceRequest) obj;
        return Objects.equals(this.clusterid, that.clusterid) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterid, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterPolicyInstanceRequest {\n");
        sb.append("    clusterid: ").append(toIndentedString(clusterid)).append("\n");
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
