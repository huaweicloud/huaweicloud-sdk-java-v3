package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ManagedOperationTypeHolder
 */
public class ManagedOperationTypeHolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_operation")

    private ManagedOperation managedOperation;

    public ManagedOperationTypeHolder withManagedOperation(ManagedOperation managedOperation) {
        this.managedOperation = managedOperation;
        return this;
    }

    public ManagedOperationTypeHolder withManagedOperation(Consumer<ManagedOperation> managedOperationSetter) {
        if (this.managedOperation == null) {
            this.managedOperation = new ManagedOperation();
            managedOperationSetter.accept(this.managedOperation);
        }

        return this;
    }

    /**
     * Get managedOperation
     * @return managedOperation
     */
    public ManagedOperation getManagedOperation() {
        return managedOperation;
    }

    public void setManagedOperation(ManagedOperation managedOperation) {
        this.managedOperation = managedOperation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ManagedOperationTypeHolder that = (ManagedOperationTypeHolder) obj;
        return Objects.equals(this.managedOperation, that.managedOperation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(managedOperation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ManagedOperationTypeHolder {\n");
        sb.append("    managedOperation: ").append(toIndentedString(managedOperation)).append("\n");
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
