package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteDictionaryRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dict_id")
    
    private String dictId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;

    public DeleteDictionaryRequest withDictId(String dictId) {
        this.dictId = dictId;
        return this;
    }

    


    /**
     * Get dictId
     * @return dictId
     */
    public String getDictId() {
        return dictId;
    }

    public void setDictId(String dictId) {
        this.dictId = dictId;
    }

    

    public DeleteDictionaryRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * Get instanceId
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteDictionaryRequest deleteDictionaryRequest = (DeleteDictionaryRequest) o;
        return Objects.equals(this.dictId, deleteDictionaryRequest.dictId) &&
            Objects.equals(this.instanceId, deleteDictionaryRequest.instanceId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dictId, instanceId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDictionaryRequest {\n");
        sb.append("    dictId: ").append(toIndentedString(dictId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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

