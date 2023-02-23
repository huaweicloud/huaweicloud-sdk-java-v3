package com.huaweicloud.sdk.gaussdb.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowSqlFilterControlResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="switch_status")
    

    private String switchStatus;

    public ShowSqlFilterControlResponse withSwitchStatus(String switchStatus) {
        this.switchStatus = switchStatus;
        return this;
    }

    


    /**
     * sql限流开关状态。  取值：  - ON：已开启 - OFF：已关闭
     * @return switchStatus
     */
    public String getSwitchStatus() {
        return switchStatus;
    }

    public void setSwitchStatus(String switchStatus) {
        this.switchStatus = switchStatus;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSqlFilterControlResponse showSqlFilterControlResponse = (ShowSqlFilterControlResponse) o;
        return Objects.equals(this.switchStatus, showSqlFilterControlResponse.switchStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(switchStatus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSqlFilterControlResponse {\n");
        sb.append("    switchStatus: ").append(toIndentedString(switchStatus)).append("\n");
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

