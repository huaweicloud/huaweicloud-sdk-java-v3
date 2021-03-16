package com.huaweicloud.sdk.dcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowBigkeyScanTaskDetailsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bigkey_id")
    
    private String bigkeyId;

    public ShowBigkeyScanTaskDetailsRequest withInstanceId(String instanceId) {
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

    

    public ShowBigkeyScanTaskDetailsRequest withBigkeyId(String bigkeyId) {
        this.bigkeyId = bigkeyId;
        return this;
    }

    


    /**
     * Get bigkeyId
     * @return bigkeyId
     */
    public String getBigkeyId() {
        return bigkeyId;
    }

    public void setBigkeyId(String bigkeyId) {
        this.bigkeyId = bigkeyId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowBigkeyScanTaskDetailsRequest showBigkeyScanTaskDetailsRequest = (ShowBigkeyScanTaskDetailsRequest) o;
        return Objects.equals(this.instanceId, showBigkeyScanTaskDetailsRequest.instanceId) &&
            Objects.equals(this.bigkeyId, showBigkeyScanTaskDetailsRequest.bigkeyId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, bigkeyId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBigkeyScanTaskDetailsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    bigkeyId: ").append(toIndentedString(bigkeyId)).append("\n");
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

