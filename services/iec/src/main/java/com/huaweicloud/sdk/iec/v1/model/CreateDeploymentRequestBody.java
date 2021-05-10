package com.huaweicloud.sdk.iec.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iec.v1.model.EdgeCloudOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建部署计划请求体
 */
public class CreateDeploymentRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edgecloud")
    
    private EdgeCloudOption edgecloud;

    public CreateDeploymentRequestBody withEdgecloud(EdgeCloudOption edgecloud) {
        this.edgecloud = edgecloud;
        return this;
    }

    public CreateDeploymentRequestBody withEdgecloud(Consumer<EdgeCloudOption> edgecloudSetter) {
        if(this.edgecloud == null ){
            this.edgecloud = new EdgeCloudOption();
            edgecloudSetter.accept(this.edgecloud);
        }
        
        return this;
    }


    /**
     * Get edgecloud
     * @return edgecloud
     */
    public EdgeCloudOption getEdgecloud() {
        return edgecloud;
    }

    public void setEdgecloud(EdgeCloudOption edgecloud) {
        this.edgecloud = edgecloud;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDeploymentRequestBody createDeploymentRequestBody = (CreateDeploymentRequestBody) o;
        return Objects.equals(this.edgecloud, createDeploymentRequestBody.edgecloud);
    }
    @Override
    public int hashCode() {
        return Objects.hash(edgecloud);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDeploymentRequestBody {\n");
        sb.append("    edgecloud: ").append(toIndentedString(edgecloud)).append("\n");
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

