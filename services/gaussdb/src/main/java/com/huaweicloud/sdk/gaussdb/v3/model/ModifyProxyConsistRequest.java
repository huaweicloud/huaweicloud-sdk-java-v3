package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 修改代理一致性请求体
 */
public class ModifyProxyConsistRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="session_consistence")
    
    
    private String sessionConsistence;

    public ModifyProxyConsistRequest withSessionConsistence(String sessionConsistence) {
        this.sessionConsistence = sessionConsistence;
        return this;
    }

    


    /**
     * 会话一致性。 - 取值\"true\"时表示会话一致性开启。 - 取值\"false\"时表示会话一致性关闭。
     * @return sessionConsistence
     */
    public String getSessionConsistence() {
        return sessionConsistence;
    }

    public void setSessionConsistence(String sessionConsistence) {
        this.sessionConsistence = sessionConsistence;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyProxyConsistRequest modifyProxyConsistRequest = (ModifyProxyConsistRequest) o;
        return Objects.equals(this.sessionConsistence, modifyProxyConsistRequest.sessionConsistence);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sessionConsistence);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyProxyConsistRequest {\n");
        sb.append("    sessionConsistence: ").append(toIndentedString(sessionConsistence)).append("\n");
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

