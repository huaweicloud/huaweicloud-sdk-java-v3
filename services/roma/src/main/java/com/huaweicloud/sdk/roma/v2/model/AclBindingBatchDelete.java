package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AclBindingBatchDelete
 */
public class AclBindingBatchDelete  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="acl_bindings")
    
    private List<String> aclBindings = null;
    
    public AclBindingBatchDelete withAclBindings(List<String> aclBindings) {
        this.aclBindings = aclBindings;
        return this;
    }

    
    public AclBindingBatchDelete addAclBindingsItem(String aclBindingsItem) {
        if (this.aclBindings == null) {
            this.aclBindings = new ArrayList<>();
        }
        this.aclBindings.add(aclBindingsItem);
        return this;
    }

    public AclBindingBatchDelete withAclBindings(Consumer<List<String>> aclBindingsSetter) {
        if(this.aclBindings == null ){
            this.aclBindings = new ArrayList<>();
        }
        aclBindingsSetter.accept(this.aclBindings);
        return this;
    }

    /**
     * 需要解除绑定的API和ACL绑定关系ID列表
     * @return aclBindings
     */
    public List<String> getAclBindings() {
        return aclBindings;
    }

    public void setAclBindings(List<String> aclBindings) {
        this.aclBindings = aclBindings;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AclBindingBatchDelete aclBindingBatchDelete = (AclBindingBatchDelete) o;
        return Objects.equals(this.aclBindings, aclBindingBatchDelete.aclBindings);
    }
    @Override
    public int hashCode() {
        return Objects.hash(aclBindings);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AclBindingBatchDelete {\n");
        sb.append("    aclBindings: ").append(toIndentedString(aclBindings)).append("\n");
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

