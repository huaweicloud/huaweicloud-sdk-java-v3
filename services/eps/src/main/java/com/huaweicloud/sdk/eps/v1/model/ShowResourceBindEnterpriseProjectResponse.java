package com.huaweicloud.sdk.eps.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eps.v1.model.Errors;
import com.huaweicloud.sdk.eps.v1.model.Resources;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowResourceBindEnterpriseProjectResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resources")
    
    private List<Resources> resources = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="errors")
    
    private List<Errors> errors = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;

    public ShowResourceBindEnterpriseProjectResponse withResources(List<Resources> resources) {
        this.resources = resources;
        return this;
    }

    
    public ShowResourceBindEnterpriseProjectResponse addResourcesItem(Resources resourcesItem) {
        if(this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ShowResourceBindEnterpriseProjectResponse withResources(Consumer<List<Resources>> resourcesSetter) {
        if(this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 资源列表
     * @return resources
     */
    public List<Resources> getResources() {
        return resources;
    }

    public void setResources(List<Resources> resources) {
        this.resources = resources;
    }

    

    public ShowResourceBindEnterpriseProjectResponse withErrors(List<Errors> errors) {
        this.errors = errors;
        return this;
    }

    
    public ShowResourceBindEnterpriseProjectResponse addErrorsItem(Errors errorsItem) {
        if(this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(errorsItem);
        return this;
    }

    public ShowResourceBindEnterpriseProjectResponse withErrors(Consumer<List<Errors>> errorsSetter) {
        if(this.errors == null) {
            this.errors = new ArrayList<>();
        }
        errorsSetter.accept(this.errors);
        return this;
    }

    /**
     * 查询失败的企业项目下的资源
     * @return errors
     */
    public List<Errors> getErrors() {
        return errors;
    }

    public void setErrors(List<Errors> errors) {
        this.errors = errors;
    }

    

    public ShowResourceBindEnterpriseProjectResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 企业项目下的资源总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowResourceBindEnterpriseProjectResponse showResourceBindEnterpriseProjectResponse = (ShowResourceBindEnterpriseProjectResponse) o;
        return Objects.equals(this.resources, showResourceBindEnterpriseProjectResponse.resources) &&
            Objects.equals(this.errors, showResourceBindEnterpriseProjectResponse.errors) &&
            Objects.equals(this.totalCount, showResourceBindEnterpriseProjectResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resources, errors, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourceBindEnterpriseProjectResponse {\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

