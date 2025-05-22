package com.huaweicloud.sdk.aad.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_id")

    private String packageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clean_threshold")

    private Integer cleanThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pop_policy")

    private PopPolicy popPolicy;

    public ShowPolicyResponse withId(String id) {
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

    public ShowPolicyResponse withPackageId(String packageId) {
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

    public ShowPolicyResponse withName(String name) {
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

    public ShowPolicyResponse withCleanThreshold(Integer cleanThreshold) {
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

    public ShowPolicyResponse withPopPolicy(PopPolicy popPolicy) {
        this.popPolicy = popPolicy;
        return this;
    }

    public ShowPolicyResponse withPopPolicy(Consumer<PopPolicy> popPolicySetter) {
        if (this.popPolicy == null) {
            this.popPolicy = new PopPolicy();
            popPolicySetter.accept(this.popPolicy);
        }

        return this;
    }

    /**
     * Get popPolicy
     * @return popPolicy
     */
    public PopPolicy getPopPolicy() {
        return popPolicy;
    }

    public void setPopPolicy(PopPolicy popPolicy) {
        this.popPolicy = popPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPolicyResponse that = (ShowPolicyResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.packageId, that.packageId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.cleanThreshold, that.cleanThreshold)
            && Objects.equals(this.popPolicy, that.popPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, packageId, name, cleanThreshold, popPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPolicyResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    cleanThreshold: ").append(toIndentedString(cleanThreshold)).append("\n");
        sb.append("    popPolicy: ").append(toIndentedString(popPolicy)).append("\n");
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
