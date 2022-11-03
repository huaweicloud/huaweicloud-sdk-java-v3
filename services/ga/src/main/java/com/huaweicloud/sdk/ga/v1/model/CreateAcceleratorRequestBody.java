package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * create Accelerator request
 */
public class CreateAcceleratorRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accelerator")

    private CreateAcceleratorOption accelerator;

    public CreateAcceleratorRequestBody withAccelerator(CreateAcceleratorOption accelerator) {
        this.accelerator = accelerator;
        return this;
    }

    public CreateAcceleratorRequestBody withAccelerator(Consumer<CreateAcceleratorOption> acceleratorSetter) {
        if (this.accelerator == null) {
            this.accelerator = new CreateAcceleratorOption();
            acceleratorSetter.accept(this.accelerator);
        }

        return this;
    }

    /**
     * Get accelerator
     * @return accelerator
     */
    public CreateAcceleratorOption getAccelerator() {
        return accelerator;
    }

    public void setAccelerator(CreateAcceleratorOption accelerator) {
        this.accelerator = accelerator;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAcceleratorRequestBody createAcceleratorRequestBody = (CreateAcceleratorRequestBody) o;
        return Objects.equals(this.accelerator, createAcceleratorRequestBody.accelerator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accelerator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAcceleratorRequestBody {\n");
        sb.append("    accelerator: ").append(toIndentedString(accelerator)).append("\n");
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
