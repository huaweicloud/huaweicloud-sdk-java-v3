package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListApiVersionDetailV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    private String versionId;

    public ListApiVersionDetailV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 实例ID
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListApiVersionDetailV2Request withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /** API版本的编号
     * 
     * @return versionId */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListApiVersionDetailV2Request listApiVersionDetailV2Request = (ListApiVersionDetailV2Request) o;
        return Objects.equals(this.instanceId, listApiVersionDetailV2Request.instanceId)
            && Objects.equals(this.versionId, listApiVersionDetailV2Request.versionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, versionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApiVersionDetailV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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
