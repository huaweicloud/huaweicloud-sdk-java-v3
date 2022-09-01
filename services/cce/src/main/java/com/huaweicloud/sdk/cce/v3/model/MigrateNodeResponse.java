package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class MigrateNodeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    @JacksonXmlProperty(localName = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    @JacksonXmlProperty(localName = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    @JacksonXmlProperty(localName = "spec")

    private MigrateNodesSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private TaskStatus status;

    public MigrateNodeResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * API版本，固定值“v3”。
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public MigrateNodeResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * API类型，固定值“MigrateNodesTask”。
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public MigrateNodeResponse withSpec(MigrateNodesSpec spec) {
        this.spec = spec;
        return this;
    }

    public MigrateNodeResponse withSpec(Consumer<MigrateNodesSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new MigrateNodesSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public MigrateNodesSpec getSpec() {
        return spec;
    }

    public void setSpec(MigrateNodesSpec spec) {
        this.spec = spec;
    }

    public MigrateNodeResponse withStatus(TaskStatus status) {
        this.status = status;
        return this;
    }

    public MigrateNodeResponse withStatus(Consumer<TaskStatus> statusSetter) {
        if (this.status == null) {
            this.status = new TaskStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MigrateNodeResponse migrateNodeResponse = (MigrateNodeResponse) o;
        return Objects.equals(this.apiVersion, migrateNodeResponse.apiVersion)
            && Objects.equals(this.kind, migrateNodeResponse.kind)
            && Objects.equals(this.spec, migrateNodeResponse.spec)
            && Objects.equals(this.status, migrateNodeResponse.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, spec, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrateNodeResponse {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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
