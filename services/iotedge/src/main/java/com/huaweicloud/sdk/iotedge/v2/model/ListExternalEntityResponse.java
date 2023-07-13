package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListExternalEntityResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "externals")

    private List<ExternalEntityRespDTO> externals = null;

    public ListExternalEntityResponse withExternals(List<ExternalEntityRespDTO> externals) {
        this.externals = externals;
        return this;
    }

    public ListExternalEntityResponse addExternalsItem(ExternalEntityRespDTO externalsItem) {
        if (this.externals == null) {
            this.externals = new ArrayList<>();
        }
        this.externals.add(externalsItem);
        return this;
    }

    public ListExternalEntityResponse withExternals(Consumer<List<ExternalEntityRespDTO>> externalsSetter) {
        if (this.externals == null) {
            this.externals = new ArrayList<>();
        }
        externalsSetter.accept(this.externals);
        return this;
    }

    /**
     * 外部实体列表
     * @return externals
     */
    public List<ExternalEntityRespDTO> getExternals() {
        return externals;
    }

    public void setExternals(List<ExternalEntityRespDTO> externals) {
        this.externals = externals;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListExternalEntityResponse that = (ListExternalEntityResponse) obj;
        return Objects.equals(this.externals, that.externals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(externals);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListExternalEntityResponse {\n");
        sb.append("    externals: ").append(toIndentedString(externals)).append("\n");
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
