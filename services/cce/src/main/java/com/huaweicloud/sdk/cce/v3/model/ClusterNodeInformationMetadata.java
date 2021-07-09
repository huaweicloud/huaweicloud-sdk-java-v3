package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class ClusterNodeInformationMetadata  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;

    public ClusterNodeInformationMetadata withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 节点名称  > 修改节点名称后，弹性云服务器名称（虚拟机名称）会同步修改。 > > 命名规则：以小写字母开头，由小写字母、数字、中划线(-)组成，长度范围1-56位，且不能以中划线(-)结尾。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterNodeInformationMetadata clusterNodeInformationMetadata = (ClusterNodeInformationMetadata) o;
        return Objects.equals(this.name, clusterNodeInformationMetadata.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterNodeInformationMetadata {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

