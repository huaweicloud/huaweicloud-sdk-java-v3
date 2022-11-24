package com.huaweicloud.sdk.iotedge.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.ExternalEntityRespDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListExternalEntityResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="externals")
    
    
    private List<ExternalEntityRespDTO> externals = null;
    
    public ListExternalEntityResponse withExternals(List<ExternalEntityRespDTO> externals) {
        this.externals = externals;
        return this;
    }

    
    public ListExternalEntityResponse addExternalsItem(ExternalEntityRespDTO externalsItem) {
        if(this.externals == null) {
            this.externals = new ArrayList<>();
        }
        this.externals.add(externalsItem);
        return this;
    }

    public ListExternalEntityResponse withExternals(Consumer<List<ExternalEntityRespDTO>> externalsSetter) {
        if(this.externals == null) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListExternalEntityResponse listExternalEntityResponse = (ListExternalEntityResponse) o;
        return Objects.equals(this.externals, listExternalEntityResponse.externals);
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

