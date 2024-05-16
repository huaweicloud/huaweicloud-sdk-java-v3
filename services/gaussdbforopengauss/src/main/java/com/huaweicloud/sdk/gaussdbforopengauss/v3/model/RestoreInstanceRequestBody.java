package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RestoreInstanceRequestBody
 */
public class RestoreInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private RecoveryBackupSource source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target")

    private RecoveryBackupTarget target;

    public RestoreInstanceRequestBody withSource(RecoveryBackupSource source) {
        this.source = source;
        return this;
    }

    public RestoreInstanceRequestBody withSource(Consumer<RecoveryBackupSource> sourceSetter) {
        if (this.source == null) {
            this.source = new RecoveryBackupSource();
            sourceSetter.accept(this.source);
        }

        return this;
    }

    /**
     * Get source
     * @return source
     */
    public RecoveryBackupSource getSource() {
        return source;
    }

    public void setSource(RecoveryBackupSource source) {
        this.source = source;
    }

    public RestoreInstanceRequestBody withTarget(RecoveryBackupTarget target) {
        this.target = target;
        return this;
    }

    public RestoreInstanceRequestBody withTarget(Consumer<RecoveryBackupTarget> targetSetter) {
        if (this.target == null) {
            this.target = new RecoveryBackupTarget();
            targetSetter.accept(this.target);
        }

        return this;
    }

    /**
     * Get target
     * @return target
     */
    public RecoveryBackupTarget getTarget() {
        return target;
    }

    public void setTarget(RecoveryBackupTarget target) {
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
        RestoreInstanceRequestBody that = (RestoreInstanceRequestBody) obj;
        return Objects.equals(this.source, that.source) && Objects.equals(this.target, that.target);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, target);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreInstanceRequestBody {\n");
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
