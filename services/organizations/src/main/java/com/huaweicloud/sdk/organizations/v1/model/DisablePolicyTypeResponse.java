package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class DisablePolicyTypeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root")

    private RootDto root;

    public DisablePolicyTypeResponse withRoot(RootDto root) {
        this.root = root;
        return this;
    }

    public DisablePolicyTypeResponse withRoot(Consumer<RootDto> rootSetter) {
        if (this.root == null) {
            this.root = new RootDto();
            rootSetter.accept(this.root);
        }

        return this;
    }

    /**
     * Get root
     * @return root
     */
    public RootDto getRoot() {
        return root;
    }

    public void setRoot(RootDto root) {
        this.root = root;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DisablePolicyTypeResponse that = (DisablePolicyTypeResponse) obj;
        return Objects.equals(this.root, that.root);
    }

    @Override
    public int hashCode() {
        return Objects.hash(root);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisablePolicyTypeResponse {\n");
        sb.append("    root: ").append(toIndentedString(root)).append("\n");
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
