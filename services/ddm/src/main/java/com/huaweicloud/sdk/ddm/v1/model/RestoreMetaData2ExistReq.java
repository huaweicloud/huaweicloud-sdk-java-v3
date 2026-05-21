package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RestoreMetaData2ExistReq
 */
public class RestoreMetaData2ExistReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private RestoreMetaDataSource source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target")

    private RestoreMetaDataTarget target;

    public RestoreMetaData2ExistReq withSource(RestoreMetaDataSource source) {
        this.source = source;
        return this;
    }

    public RestoreMetaData2ExistReq withSource(Consumer<RestoreMetaDataSource> sourceSetter) {
        if (this.source == null) {
            this.source = new RestoreMetaDataSource();
            sourceSetter.accept(this.source);
        }

        return this;
    }

    /**
     * Get source
     * @return source
     */
    public RestoreMetaDataSource getSource() {
        return source;
    }

    public void setSource(RestoreMetaDataSource source) {
        this.source = source;
    }

    public RestoreMetaData2ExistReq withTarget(RestoreMetaDataTarget target) {
        this.target = target;
        return this;
    }

    public RestoreMetaData2ExistReq withTarget(Consumer<RestoreMetaDataTarget> targetSetter) {
        if (this.target == null) {
            this.target = new RestoreMetaDataTarget();
            targetSetter.accept(this.target);
        }

        return this;
    }

    /**
     * Get target
     * @return target
     */
    public RestoreMetaDataTarget getTarget() {
        return target;
    }

    public void setTarget(RestoreMetaDataTarget target) {
        this.target = target;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestoreMetaData2ExistReq that = (RestoreMetaData2ExistReq) obj;
        return Objects.equals(this.source, that.source) && Objects.equals(this.target, that.target);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, target);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreMetaData2ExistReq {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
