package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateClusterGroupAssociatedRulesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clustergroupid")

    private String clustergroupid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateAssociatedRulesRequest body;

    public UpdateClusterGroupAssociatedRulesRequest withClustergroupid(String clustergroupid) {
        this.clustergroupid = clustergroupid;
        return this;
    }

    /**
     * 容器舰队ID
     * @return clustergroupid
     */
    public String getClustergroupid() {
        return clustergroupid;
    }

    public void setClustergroupid(String clustergroupid) {
        this.clustergroupid = clustergroupid;
    }

    public UpdateClusterGroupAssociatedRulesRequest withBody(UpdateAssociatedRulesRequest body) {
        this.body = body;
        return this;
    }

    public UpdateClusterGroupAssociatedRulesRequest withBody(Consumer<UpdateAssociatedRulesRequest> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateAssociatedRulesRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateAssociatedRulesRequest getBody() {
        return body;
    }

    public void setBody(UpdateAssociatedRulesRequest body) {
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
        UpdateClusterGroupAssociatedRulesRequest that = (UpdateClusterGroupAssociatedRulesRequest) obj;
        return Objects.equals(this.clustergroupid, that.clustergroupid) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clustergroupid, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateClusterGroupAssociatedRulesRequest {\n");
        sb.append("    clustergroupid: ").append(toIndentedString(clustergroupid)).append("\n");
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
