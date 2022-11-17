package com.huaweicloud.sdk.aos.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * EnableAutoRollbackPrimitiveTypeHolder
 */
public class EnableAutoRollbackPrimitiveTypeHolder  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_auto_rollback")
    
    
    private Boolean enableAutoRollback;

    public EnableAutoRollbackPrimitiveTypeHolder withEnableAutoRollback(Boolean enableAutoRollback) {
        this.enableAutoRollback = enableAutoRollback;
        return this;
    }

    


    /**
     * 自动回滚的标识位，如果不传默认为false，即默认不开启资源栈自动回滚（自动回滚开启后，如果部署失败，则会自动回滚，并返回上一个稳定状态）
     * @return enableAutoRollback
     */
    public Boolean getEnableAutoRollback() {
        return enableAutoRollback;
    }

    public void setEnableAutoRollback(Boolean enableAutoRollback) {
        this.enableAutoRollback = enableAutoRollback;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnableAutoRollbackPrimitiveTypeHolder enableAutoRollbackPrimitiveTypeHolder = (EnableAutoRollbackPrimitiveTypeHolder) o;
        return Objects.equals(this.enableAutoRollback, enableAutoRollbackPrimitiveTypeHolder.enableAutoRollback);
    }
    @Override
    public int hashCode() {
        return Objects.hash(enableAutoRollback);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnableAutoRollbackPrimitiveTypeHolder {\n");
        sb.append("    enableAutoRollback: ").append(toIndentedString(enableAutoRollback)).append("\n");
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

