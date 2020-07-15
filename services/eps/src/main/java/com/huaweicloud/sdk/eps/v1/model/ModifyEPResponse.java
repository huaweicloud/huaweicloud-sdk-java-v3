package com.huaweicloud.sdk.eps.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eps.v1.model.EpDetail;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ModifyEPResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project")
    
    private EpDetail enterpriseProject = null;

    public ModifyEPResponse withEnterpriseProject(EpDetail enterpriseProject) {
        this.enterpriseProject = enterpriseProject;
        return this;
    }

    public ModifyEPResponse withEnterpriseProject(Consumer<EpDetail> enterpriseProjectSetter) {
        if(this.enterpriseProject == null ){
            this.enterpriseProject = new EpDetail();
            enterpriseProjectSetter.accept(this.enterpriseProject);
        }
        
        return this;
    }


    /**
     * Get enterpriseProject
     * @return enterpriseProject
     */
    public EpDetail getEnterpriseProject() {
        return enterpriseProject;
    }

    public void setEnterpriseProject(EpDetail enterpriseProject) {
        this.enterpriseProject = enterpriseProject;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyEPResponse modifyEPResponse = (ModifyEPResponse) o;
        return Objects.equals(this.enterpriseProject, modifyEPResponse.enterpriseProject);
    }
    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProject);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyEPResponse {\n");
        sb.append("    enterpriseProject: ").append(toIndentedString(enterpriseProject)).append("\n");
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

