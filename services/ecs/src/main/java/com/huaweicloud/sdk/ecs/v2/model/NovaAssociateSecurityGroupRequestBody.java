package com.huaweicloud.sdk.ecs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.NovaAddSecurityGroupOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class NovaAssociateSecurityGroupRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="addSecurityGroup")
    
    private NovaAddSecurityGroupOption addSecurityGroup;

    public NovaAssociateSecurityGroupRequestBody withAddSecurityGroup(NovaAddSecurityGroupOption addSecurityGroup) {
        this.addSecurityGroup = addSecurityGroup;
        return this;
    }

    public NovaAssociateSecurityGroupRequestBody withAddSecurityGroup(Consumer<NovaAddSecurityGroupOption> addSecurityGroupSetter) {
        if(this.addSecurityGroup == null ){
            this.addSecurityGroup = new NovaAddSecurityGroupOption();
            addSecurityGroupSetter.accept(this.addSecurityGroup);
        }
        
        return this;
    }


    /**
     * Get addSecurityGroup
     * @return addSecurityGroup
     */
    public NovaAddSecurityGroupOption getAddSecurityGroup() {
        return addSecurityGroup;
    }

    public void setAddSecurityGroup(NovaAddSecurityGroupOption addSecurityGroup) {
        this.addSecurityGroup = addSecurityGroup;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaAssociateSecurityGroupRequestBody novaAssociateSecurityGroupRequestBody = (NovaAssociateSecurityGroupRequestBody) o;
        return Objects.equals(this.addSecurityGroup, novaAssociateSecurityGroupRequestBody.addSecurityGroup);
    }
    @Override
    public int hashCode() {
        return Objects.hash(addSecurityGroup);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaAssociateSecurityGroupRequestBody {\n");
        sb.append("    addSecurityGroup: ").append(toIndentedString(addSecurityGroup)).append("\n");
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

