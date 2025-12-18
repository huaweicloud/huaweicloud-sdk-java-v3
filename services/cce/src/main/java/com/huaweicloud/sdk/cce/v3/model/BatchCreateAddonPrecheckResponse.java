package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchCreateAddonPrecheckResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private AddonCheckSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private AddonCheckStatus status;

    public BatchCreateAddonPrecheckResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * **参数解释：** API类型 **约束限制：** 该值不可修改 **取值范围：** 固定值\"AddonCheck\" **默认取值：** AddonCheck 
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public BatchCreateAddonPrecheckResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * **参数解释：** API版本 **约束限制：** 该值不可修改 **取值范围：** 固定值\"v3\" **默认取值：** v3 
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public BatchCreateAddonPrecheckResponse withSpec(AddonCheckSpec spec) {
        this.spec = spec;
        return this;
    }

    public BatchCreateAddonPrecheckResponse withSpec(Consumer<AddonCheckSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new AddonCheckSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public AddonCheckSpec getSpec() {
        return spec;
    }

    public void setSpec(AddonCheckSpec spec) {
        this.spec = spec;
    }

    public BatchCreateAddonPrecheckResponse withStatus(AddonCheckStatus status) {
        this.status = status;
        return this;
    }

    public BatchCreateAddonPrecheckResponse withStatus(Consumer<AddonCheckStatus> statusSetter) {
        if (this.status == null) {
            this.status = new AddonCheckStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public AddonCheckStatus getStatus() {
        return status;
    }

    public void setStatus(AddonCheckStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateAddonPrecheckResponse that = (BatchCreateAddonPrecheckResponse) obj;
        return Objects.equals(this.kind, that.kind) && Objects.equals(this.apiVersion, that.apiVersion)
            && Objects.equals(this.spec, that.spec) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, apiVersion, spec, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateAddonPrecheckResponse {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
