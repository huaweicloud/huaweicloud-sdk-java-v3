package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * InitialStackDescriptionPrimitiveTypeHolder
 */
public class InitialStackDescriptionPrimitiveTypeHolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initial_stack_description")

    private String initialStackDescription;

    public InitialStackDescriptionPrimitiveTypeHolder withInitialStackDescription(String initialStackDescription) {
        this.initialStackDescription = initialStackDescription;
        return this;
    }

    /**
     * 初始化资源栈描述。可用于客户识别被资源栈集所管理的资源栈。  资源栈集下的资源栈仅在创建时统一使用该描述。客户想要更新初始化资源栈描述，可以通过UpdateStackSet API。  后续更新资源栈集描述将不会同步更新已管理的资源栈描述。
     * @return initialStackDescription
     */
    public String getInitialStackDescription() {
        return initialStackDescription;
    }

    public void setInitialStackDescription(String initialStackDescription) {
        this.initialStackDescription = initialStackDescription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InitialStackDescriptionPrimitiveTypeHolder that = (InitialStackDescriptionPrimitiveTypeHolder) obj;
        return Objects.equals(this.initialStackDescription, that.initialStackDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(initialStackDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InitialStackDescriptionPrimitiveTypeHolder {\n");
        sb.append("    initialStackDescription: ").append(toIndentedString(initialStackDescription)).append("\n");
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
