package com.huaweicloud.sdk.aad.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreatePolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_id")

    private String packageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clean_threshold")

    private Integer cleanThreshold;

    public CreatePolicyResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 策略id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreatePolicyResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 策略名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreatePolicyResponse withPackageId(String packageId) {
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

    public CreatePolicyResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreatePolicyResponse withCleanThreshold(Integer cleanThreshold) {
        this.cleanThreshold = cleanThreshold;
        return this;
    }

    /**
     * 清洗阈值
     * minimum: 100
     * maximum: 1000
     * @return cleanThreshold
     */
    public Integer getCleanThreshold() {
        return cleanThreshold;
    }

    public void setCleanThreshold(Integer cleanThreshold) {
        this.cleanThreshold = cleanThreshold;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePolicyResponse that = (CreatePolicyResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.packageId, that.packageId) && Objects.equals(this.description, that.description)
            && Objects.equals(this.cleanThreshold, that.cleanThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, packageId, description, cleanThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePolicyResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    cleanThreshold: ").append(toIndentedString(cleanThreshold)).append("\n");
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
