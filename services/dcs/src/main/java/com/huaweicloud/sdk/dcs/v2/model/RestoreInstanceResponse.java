package com.huaweicloud.sdk.dcs.v2.model;




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
public class RestoreInstanceResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="restore_id")
    
    private String restoreId;

    public RestoreInstanceResponse withRestoreId(String restoreId) {
        this.restoreId = restoreId;
        return this;
    }

    


    /**
     * 恢复记录ID。
     * @return restoreId
     */
    public String getRestoreId() {
        return restoreId;
    }

    public void setRestoreId(String restoreId) {
        this.restoreId = restoreId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestoreInstanceResponse restoreInstanceResponse = (RestoreInstanceResponse) o;
        return Objects.equals(this.restoreId, restoreInstanceResponse.restoreId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(restoreId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreInstanceResponse {\n");
        sb.append("    restoreId: ").append(toIndentedString(restoreId)).append("\n");
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

