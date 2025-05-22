package com.huaweicloud.sdk.aad.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdatePackageNameRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_id")

    private String packageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdatePackageNameRequestBody body;

    public UpdatePackageNameRequest withPackageId(String packageId) {
        this.packageId = packageId;
        return this;
    }

    /**
     * 实例id
     * @return packageId
     */
    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public UpdatePackageNameRequest withBody(UpdatePackageNameRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdatePackageNameRequest withBody(Consumer<UpdatePackageNameRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdatePackageNameRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdatePackageNameRequestBody getBody() {
        return body;
    }

    public void setBody(UpdatePackageNameRequestBody body) {
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
        UpdatePackageNameRequest that = (UpdatePackageNameRequest) obj;
        return Objects.equals(this.packageId, that.packageId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePackageNameRequest {\n");
        sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
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
