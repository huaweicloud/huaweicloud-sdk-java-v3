package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CheckPermissionInput body
 */
public class CheckPermissionInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_request")

    private List<AccessRequest> accessRequest = null;

    public CheckPermissionInput withAccessRequest(List<AccessRequest> accessRequest) {
        this.accessRequest = accessRequest;
        return this;
    }

    public CheckPermissionInput addAccessRequestItem(AccessRequest accessRequestItem) {
        if (this.accessRequest == null) {
            this.accessRequest = new ArrayList<>();
        }
        this.accessRequest.add(accessRequestItem);
        return this;
    }

    public CheckPermissionInput withAccessRequest(Consumer<List<AccessRequest>> accessRequestSetter) {
        if (this.accessRequest == null) {
            this.accessRequest = new ArrayList<>();
        }
        accessRequestSetter.accept(this.accessRequest);
        return this;
    }

    /**
     * 主体信息
     * @return accessRequest
     */
    public List<AccessRequest> getAccessRequest() {
        return accessRequest;
    }

    public void setAccessRequest(List<AccessRequest> accessRequest) {
        this.accessRequest = accessRequest;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckPermissionInput that = (CheckPermissionInput) obj;
        return Objects.equals(this.accessRequest, that.accessRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessRequest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckPermissionInput {\n");
        sb.append("    accessRequest: ").append(toIndentedString(accessRequest)).append("\n");
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
