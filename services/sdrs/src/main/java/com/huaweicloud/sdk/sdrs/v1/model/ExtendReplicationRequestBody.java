package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 复制对扩容请求体
 */
public class ExtendReplicationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend-replication")

    private ExtendReplicationRequestParams extendReplication;

    public ExtendReplicationRequestBody withExtendReplication(ExtendReplicationRequestParams extendReplication) {
        this.extendReplication = extendReplication;
        return this;
    }

    public ExtendReplicationRequestBody withExtendReplication(
        Consumer<ExtendReplicationRequestParams> extendReplicationSetter) {
        if (this.extendReplication == null) {
            this.extendReplication = new ExtendReplicationRequestParams();
            extendReplicationSetter.accept(this.extendReplication);
        }

        return this;
    }

    /**
     * Get extendReplication
     * @return extendReplication
     */
    public ExtendReplicationRequestParams getExtendReplication() {
        return extendReplication;
    }

    public void setExtendReplication(ExtendReplicationRequestParams extendReplication) {
        this.extendReplication = extendReplication;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtendReplicationRequestBody that = (ExtendReplicationRequestBody) obj;
        return Objects.equals(this.extendReplication, that.extendReplication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extendReplication);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtendReplicationRequestBody {\n");
        sb.append("    extendReplication: ").append(toIndentedString(extendReplication)).append("\n");
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
