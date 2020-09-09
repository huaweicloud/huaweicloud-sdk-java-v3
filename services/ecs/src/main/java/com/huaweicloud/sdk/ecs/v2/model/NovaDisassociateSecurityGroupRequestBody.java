package com.huaweicloud.sdk.ecs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.NovaRemoveSecurityGroupOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class NovaDisassociateSecurityGroupRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="removeSecurityGroup")
    
    private NovaRemoveSecurityGroupOption removeSecurityGroup = null;

    public NovaDisassociateSecurityGroupRequestBody withRemoveSecurityGroup(NovaRemoveSecurityGroupOption removeSecurityGroup) {
        this.removeSecurityGroup = removeSecurityGroup;
        return this;
    }

    public NovaDisassociateSecurityGroupRequestBody withRemoveSecurityGroup(Consumer<NovaRemoveSecurityGroupOption> removeSecurityGroupSetter) {
        if(this.removeSecurityGroup == null ){
            this.removeSecurityGroup = new NovaRemoveSecurityGroupOption();
            removeSecurityGroupSetter.accept(this.removeSecurityGroup);
        }
        
        return this;
    }


    /**
     * Get removeSecurityGroup
     * @return removeSecurityGroup
     */
    public NovaRemoveSecurityGroupOption getRemoveSecurityGroup() {
        return removeSecurityGroup;
    }

    public void setRemoveSecurityGroup(NovaRemoveSecurityGroupOption removeSecurityGroup) {
        this.removeSecurityGroup = removeSecurityGroup;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaDisassociateSecurityGroupRequestBody novaDisassociateSecurityGroupRequestBody = (NovaDisassociateSecurityGroupRequestBody) o;
        return Objects.equals(this.removeSecurityGroup, novaDisassociateSecurityGroupRequestBody.removeSecurityGroup);
    }
    @Override
    public int hashCode() {
        return Objects.hash(removeSecurityGroup);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaDisassociateSecurityGroupRequestBody {\n");
        sb.append("    removeSecurityGroup: ").append(toIndentedString(removeSecurityGroup)).append("\n");
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

