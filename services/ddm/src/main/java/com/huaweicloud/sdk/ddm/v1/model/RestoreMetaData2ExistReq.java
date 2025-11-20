package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RestoreMetaData2ExistReq
 */
public class RestoreMetaData2ExistReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private Object source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target")

    private Object target;

    public RestoreMetaData2ExistReq withSource(Object source) {
        this.source = source;
        return this;
    }

    /**
     * metadata恢复源。
     * @return source
     */
    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public RestoreMetaData2ExistReq withTarget(Object target) {
        this.target = target;
        return this;
    }

    /**
     * metadata恢复目标。
     * @return target
     */
    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
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
