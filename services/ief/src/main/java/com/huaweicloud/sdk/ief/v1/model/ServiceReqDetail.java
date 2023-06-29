package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 服务详情
 */
public class ServiceReqDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_data")

    private SvcMetadata metaData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private SvcSpec spec;

    public ServiceReqDetail withMetaData(SvcMetadata metaData) {
        this.metaData = metaData;
        return this;
    }

    public ServiceReqDetail withMetaData(Consumer<SvcMetadata> metaDataSetter) {
        if (this.metaData == null) {
            this.metaData = new SvcMetadata();
            metaDataSetter.accept(this.metaData);
        }

        return this;
    }

    /**
     * Get metaData
     * @return metaData
     */
    public SvcMetadata getMetaData() {
        return metaData;
    }

    public void setMetaData(SvcMetadata metaData) {
        this.metaData = metaData;
    }

    public ServiceReqDetail withSpec(SvcSpec spec) {
        this.spec = spec;
        return this;
    }

    public ServiceReqDetail withSpec(Consumer<SvcSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new SvcSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public SvcSpec getSpec() {
        return spec;
    }

    public void setSpec(SvcSpec spec) {
        this.spec = spec;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServiceReqDetail that = (ServiceReqDetail) obj;
        return Objects.equals(this.metaData, that.metaData) && Objects.equals(this.spec, that.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metaData, spec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceReqDetail {\n");
        sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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
