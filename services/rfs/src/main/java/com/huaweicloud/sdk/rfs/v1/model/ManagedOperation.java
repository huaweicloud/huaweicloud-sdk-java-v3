package com.huaweicloud.sdk.rfs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用于定义管理资源栈集操作的一系列属性。
 */
public class ManagedOperation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_parallel_operation")

    private Boolean enableParallelOperation;

    public ManagedOperation withEnableParallelOperation(Boolean enableParallelOperation) {
        this.enableParallelOperation = enableParallelOperation;
        return this;
    }

    /**
     * 资源栈集（stack_set）是否可以并发地创建多个资源栈集操作。该参数作为资源栈集属性，可以通过创建资源栈集API（CreateStackSet）指定，通过更新资源栈集API（UpdateStackSet）更新该参数。  该参数默认为false，资源栈集只允许以串行的方式生成并执行资源栈集操作。同一时刻，资源栈集中只会存在一个处于运行态，即QUEUE_IN_PROGRESS或OPERATION_IN_PROGRESS状态的资源栈集操作，该操作执行完成后，下一个资源栈集操作才允许被创建。  该参数如果设定为true，资源栈集允许并发地生成多个资源栈集操作，执行非冲突操作，并将冲突操作进行排队处理。当冲突操作执行完毕，资源栈集按请求顺序继续执行排队操作。当前同一资源栈集下最多允许创建10个并发的资源栈集操作。  注：冲突操作指资源栈集允许多个操作同时执行的条件下，如果超过一个以上的操作包含了同一资源栈实例，此时在该资源栈实例上的多个操作被称为冲突操作。  当资源栈集状态为OPERATION_IN_PROGRESS时，不允许用户通过更新资源栈集（UpdateStackSet）来更新该参数。  * 当前，一个资源栈集下仅允许同时最多存在10个处于运行态的资源栈集操作*
     * @return enableParallelOperation
     */
    public Boolean getEnableParallelOperation() {
        return enableParallelOperation;
    }

    public void setEnableParallelOperation(Boolean enableParallelOperation) {
        this.enableParallelOperation = enableParallelOperation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ManagedOperation that = (ManagedOperation) obj;
        return Objects.equals(this.enableParallelOperation, that.enableParallelOperation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableParallelOperation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ManagedOperation {\n");
        sb.append("    enableParallelOperation: ").append(toIndentedString(enableParallelOperation)).append("\n");
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
