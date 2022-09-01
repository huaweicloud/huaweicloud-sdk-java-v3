package com.huaweicloud.sdk.iotedge.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class BatchConfirmConfigsNewResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ids")
    
    @JacksonXmlProperty(localName = "ids")
    
    private Object ids;

    public BatchConfirmConfigsNewResponse withIds(Object ids) {
        this.ids = ids;
        return this;
    }

    


    /**
     * 已确认的配置项id
     * @return ids
     */
    public Object getIds() {
        return ids;
    }

    public void setIds(Object ids) {
        this.ids = ids;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchConfirmConfigsNewResponse batchConfirmConfigsNewResponse = (BatchConfirmConfigsNewResponse) o;
        return Objects.equals(this.ids, batchConfirmConfigsNewResponse.ids);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ids);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchConfirmConfigsNewResponse {\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

