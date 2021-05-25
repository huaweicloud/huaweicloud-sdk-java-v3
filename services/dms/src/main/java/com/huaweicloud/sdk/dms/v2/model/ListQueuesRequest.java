package com.huaweicloud.sdk.dms.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListQueuesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="include_deadletter")
    
    private Boolean includeDeadletter;

    public ListQueuesRequest withIncludeDeadletter(Boolean includeDeadletter) {
        this.includeDeadletter = includeDeadletter;
        return this;
    }

    


    /**
     * 是否包含死信信息。  支持的值如下：  - true：包含死信消息。 - false：不包含死信消息。  默认值为：false。  Kafka队列没有死信功能，该参数对于Kafka队列无效。
     * @return includeDeadletter
     */
    public Boolean getIncludeDeadletter() {
        return includeDeadletter;
    }

    public void setIncludeDeadletter(Boolean includeDeadletter) {
        this.includeDeadletter = includeDeadletter;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListQueuesRequest listQueuesRequest = (ListQueuesRequest) o;
        return Objects.equals(this.includeDeadletter, listQueuesRequest.includeDeadletter);
    }
    @Override
    public int hashCode() {
        return Objects.hash(includeDeadletter);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQueuesRequest {\n");
        sb.append("    includeDeadletter: ").append(toIndentedString(includeDeadletter)).append("\n");
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

