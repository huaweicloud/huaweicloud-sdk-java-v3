package com.huaweicloud.sdk.dc.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dc.v3.model.DirectconnectDict;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListDirectConnectResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="direct_connects")
    
    private List<DirectconnectDict> directConnects = null;
    
    public ListDirectConnectResponse withDirectConnects(List<DirectconnectDict> directConnects) {
        this.directConnects = directConnects;
        return this;
    }

    
    public ListDirectConnectResponse addDirectConnectsItem(DirectconnectDict directConnectsItem) {
        if (this.directConnects == null) {
            this.directConnects = new ArrayList<>();
        }
        this.directConnects.add(directConnectsItem);
        return this;
    }

    public ListDirectConnectResponse withDirectConnects(Consumer<List<DirectconnectDict>> directConnectsSetter) {
        if(this.directConnects == null ){
            this.directConnects = new ArrayList<>();
        }
        directConnectsSetter.accept(this.directConnects);
        return this;
    }

    /**
     * direct_connects对象
     * @return directConnects
     */
    public List<DirectconnectDict> getDirectConnects() {
        return directConnects;
    }

    public void setDirectConnects(List<DirectconnectDict> directConnects) {
        this.directConnects = directConnects;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDirectConnectResponse listDirectConnectResponse = (ListDirectConnectResponse) o;
        return Objects.equals(this.directConnects, listDirectConnectResponse.directConnects);
    }
    @Override
    public int hashCode() {
        return Objects.hash(directConnects);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDirectConnectResponse {\n");
        sb.append("    directConnects: ").append(toIndentedString(directConnects)).append("\n");
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

