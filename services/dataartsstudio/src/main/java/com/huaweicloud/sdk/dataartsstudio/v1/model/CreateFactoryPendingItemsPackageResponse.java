package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateFactoryPendingItemsPackageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_name")

    private String packageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_package_id")

    private String releasePackageId;

    public CreateFactoryPendingItemsPackageResponse withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * 发布包名称
     * @return packageName
     */
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public CreateFactoryPendingItemsPackageResponse withReleasePackageId(String releasePackageId) {
        this.releasePackageId = releasePackageId;
        return this;
    }

    /**
     * 发布包ID
     * @return releasePackageId
     */
    public String getReleasePackageId() {
        return releasePackageId;
    }

    public void setReleasePackageId(String releasePackageId) {
        this.releasePackageId = releasePackageId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateFactoryPendingItemsPackageResponse that = (CreateFactoryPendingItemsPackageResponse) obj;
        return Objects.equals(this.packageName, that.packageName)
            && Objects.equals(this.releasePackageId, that.releasePackageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageName, releasePackageId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFactoryPendingItemsPackageResponse {\n");
        sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
        sb.append("    releasePackageId: ").append(toIndentedString(releasePackageId)).append("\n");
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
