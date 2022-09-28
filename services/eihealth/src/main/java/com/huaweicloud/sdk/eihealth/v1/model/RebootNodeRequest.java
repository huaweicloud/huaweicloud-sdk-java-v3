package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class RebootNodeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force")

    private Boolean force;

    public RebootNodeRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 计算资源id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RebootNodeRequest withForce(Boolean force) {
        this.force = force;
        return this;
    }

    /**
     * 是否强制重启，默认为false
     * @return force
     */
    public Boolean getForce() {
        return force;
    }

    public void setForce(Boolean force) {
        this.force = force;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RebootNodeRequest rebootNodeRequest = (RebootNodeRequest) o;
        return Objects.equals(this.id, rebootNodeRequest.id) && Objects.equals(this.force, rebootNodeRequest.force);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, force);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RebootNodeRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    force: ").append(toIndentedString(force)).append("\n");
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
