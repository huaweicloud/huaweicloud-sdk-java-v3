package com.huaweicloud.sdk.aos.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * StackNamePrimitiveTypeHolder
 */
public class StackNamePrimitiveTypeHolder  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stack_name")
    
    
    private String stackName;

    public StackNamePrimitiveTypeHolder withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    


    /**
     * 用户希望生成的资源栈的名字。此名字在domain_id+区域+project_id下应唯一，可以使用中文、大小写英文、数字、下划线、中划线。首字符需为中文或者英文，区分大小写。
     * @return stackName
     */
    public String getStackName() {
        return stackName;
    }

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StackNamePrimitiveTypeHolder stackNamePrimitiveTypeHolder = (StackNamePrimitiveTypeHolder) o;
        return Objects.equals(this.stackName, stackNamePrimitiveTypeHolder.stackName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(stackName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StackNamePrimitiveTypeHolder {\n");
        sb.append("    stackName: ").append(toIndentedString(stackName)).append("\n");
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

