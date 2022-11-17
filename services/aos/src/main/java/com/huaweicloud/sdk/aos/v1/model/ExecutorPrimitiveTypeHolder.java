package com.huaweicloud.sdk.aos.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ExecutorPrimitiveTypeHolder
 */
public class ExecutorPrimitiveTypeHolder  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="executor")
    
    
    private String executor;

    public ExecutorPrimitiveTypeHolder withExecutor(String executor) {
        this.executor = executor;
        return this;
    }

    


    /**
     * 执行操作者的名字，将用做未来的审计工作
     * @return executor
     */
    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecutorPrimitiveTypeHolder executorPrimitiveTypeHolder = (ExecutorPrimitiveTypeHolder) o;
        return Objects.equals(this.executor, executorPrimitiveTypeHolder.executor);
    }
    @Override
    public int hashCode() {
        return Objects.hash(executor);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecutorPrimitiveTypeHolder {\n");
        sb.append("    executor: ").append(toIndentedString(executor)).append("\n");
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

