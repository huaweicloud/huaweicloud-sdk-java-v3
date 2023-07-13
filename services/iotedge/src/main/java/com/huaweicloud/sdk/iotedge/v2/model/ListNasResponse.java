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
public class ListNasResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nas")

    private List<QueryNaBriefResponseDTO> nas = null;

    public ListNasResponse withNas(List<QueryNaBriefResponseDTO> nas) {
        this.nas = nas;
        return this;
    }

    public ListNasResponse addNasItem(QueryNaBriefResponseDTO nasItem) {
        if (this.nas == null) {
            this.nas = new ArrayList<>();
        }
        this.nas.add(nasItem);
        return this;
    }

    public ListNasResponse withNas(Consumer<List<QueryNaBriefResponseDTO>> nasSetter) {
        if (this.nas == null) {
            this.nas = new ArrayList<>();
        }
        nasSetter.accept(this.nas);
        return this;
    }

    /**
     * 北向NA列表
     * @return nas
     */
    public List<QueryNaBriefResponseDTO> getNas() {
        return nas;
    }

    public void setNas(List<QueryNaBriefResponseDTO> nas) {
        this.nas = nas;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNasResponse that = (ListNasResponse) obj;
        return Objects.equals(this.nas, that.nas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNasResponse {\n");
        sb.append("    nas: ").append(toIndentedString(nas)).append("\n");
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
