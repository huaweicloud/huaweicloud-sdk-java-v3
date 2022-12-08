package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 重启节点请求体
 */
public class RestartNodeRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="delay")
    
    
    private Boolean delay;

    public RestartNodeRequest withDelay(Boolean delay) {
        this.delay = delay;
        return this;
    }

    


    /**
     * 实例节点是否延迟重启。默认false，立即重启。  - true: 延迟重启，实例节点将在运维时间窗内自动重启。 - false: 立即重启。
     * @return delay
     */
    public Boolean getDelay() {
        return delay;
    }

    public void setDelay(Boolean delay) {
        this.delay = delay;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestartNodeRequest restartNodeRequest = (RestartNodeRequest) o;
        return Objects.equals(this.delay, restartNodeRequest.delay);
    }
    @Override
    public int hashCode() {
        return Objects.hash(delay);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestartNodeRequest {\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
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

