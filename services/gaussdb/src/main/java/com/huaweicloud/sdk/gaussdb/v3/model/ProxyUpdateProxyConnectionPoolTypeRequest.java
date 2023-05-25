package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * proxy更新连接池请求体。
 */
public class ProxyUpdateProxyConnectionPoolTypeRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="connection_pool_type")
    

    private String connectionPoolType;

    public ProxyUpdateProxyConnectionPoolTypeRequest withConnectionPoolType(String connectionPoolType) {
        this.connectionPoolType = connectionPoolType;
        return this;
    }

    


    /**
     * 连接池类型。CLOSED：关闭连接池；SESSION：开启会话级连接池
     * @return connectionPoolType
     */
    public String getConnectionPoolType() {
        return connectionPoolType;
    }

    public void setConnectionPoolType(String connectionPoolType) {
        this.connectionPoolType = connectionPoolType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProxyUpdateProxyConnectionPoolTypeRequest proxyUpdateProxyConnectionPoolTypeRequest = (ProxyUpdateProxyConnectionPoolTypeRequest) o;
        return Objects.equals(this.connectionPoolType, proxyUpdateProxyConnectionPoolTypeRequest.connectionPoolType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(connectionPoolType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProxyUpdateProxyConnectionPoolTypeRequest {\n");
        sb.append("    connectionPoolType: ").append(toIndentedString(connectionPoolType)).append("\n");
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

