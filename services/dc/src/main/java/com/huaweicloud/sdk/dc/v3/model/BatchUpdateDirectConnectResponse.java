package com.huaweicloud.sdk.dc.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dc.v3.model.DirectconnectDict;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class BatchUpdateDirectConnectResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="direct_connect")
    
    private DirectconnectDict directConnect = null;

    public BatchUpdateDirectConnectResponse withDirectConnect(DirectconnectDict directConnect) {
        this.directConnect = directConnect;
        return this;
    }

    public BatchUpdateDirectConnectResponse withDirectConnect(Consumer<DirectconnectDict> directConnectSetter) {
        if(this.directConnect == null ){
            this.directConnect = new DirectconnectDict();
            directConnectSetter.accept(this.directConnect);
        }
        
        return this;
    }


    /**
     * Get directConnect
     * @return directConnect
     */
    public DirectconnectDict getDirectConnect() {
        return directConnect;
    }

    public void setDirectConnect(DirectconnectDict directConnect) {
        this.directConnect = directConnect;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchUpdateDirectConnectResponse batchUpdateDirectConnectResponse = (BatchUpdateDirectConnectResponse) o;
        return Objects.equals(this.directConnect, batchUpdateDirectConnectResponse.directConnect);
    }
    @Override
    public int hashCode() {
        return Objects.hash(directConnect);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateDirectConnectResponse {\n");
        sb.append("    directConnect: ").append(toIndentedString(directConnect)).append("\n");
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

