package com.huaweicloud.sdk.dgc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowConnectionRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="connection_name")
    
    private String connectionName;

    public ShowConnectionRequest withConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }

    


    /**
     * Get connectionName
     * @return connectionName
     */
    public String getConnectionName() {
        return connectionName;
    }

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowConnectionRequest showConnectionRequest = (ShowConnectionRequest) o;
        return Objects.equals(this.connectionName, showConnectionRequest.connectionName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(connectionName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowConnectionRequest {\n");
        sb.append("    connectionName: ").append(toIndentedString(connectionName)).append("\n");
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

