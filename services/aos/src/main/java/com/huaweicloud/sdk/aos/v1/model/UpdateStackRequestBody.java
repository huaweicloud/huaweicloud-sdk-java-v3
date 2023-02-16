package com.huaweicloud.sdk.aos.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aos.v1.model.Agency;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * update-stack request
 */
public class UpdateStackRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stack_id")
    
    
    private String stackId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_deletion_protection")
    
    
    private Boolean enableDeletionProtection;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_auto_rollback")
    
    
    private Boolean enableAutoRollback;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="agencies")
    
    
    private List<Agency> agencies = null;
    
    public UpdateStackRequestBody withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    


    /**
     * 资源栈Id
     * @return stackId
     */
    public String getStackId() {
        return stackId;
    }

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    

    public UpdateStackRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 资源栈的描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public UpdateStackRequestBody withEnableDeletionProtection(Boolean enableDeletionProtection) {
        this.enableDeletionProtection = enableDeletionProtection;
        return this;
    }

    


    /**
     * 是否开启删除保护
     * @return enableDeletionProtection
     */
    public Boolean getEnableDeletionProtection() {
        return enableDeletionProtection;
    }

    public void setEnableDeletionProtection(Boolean enableDeletionProtection) {
        this.enableDeletionProtection = enableDeletionProtection;
    }

    

    public UpdateStackRequestBody withEnableAutoRollback(Boolean enableAutoRollback) {
        this.enableAutoRollback = enableAutoRollback;
        return this;
    }

    


    /**
     * 是否开启自动回滚
     * @return enableAutoRollback
     */
    public Boolean getEnableAutoRollback() {
        return enableAutoRollback;
    }

    public void setEnableAutoRollback(Boolean enableAutoRollback) {
        this.enableAutoRollback = enableAutoRollback;
    }

    

    public UpdateStackRequestBody withAgencies(List<Agency> agencies) {
        this.agencies = agencies;
        return this;
    }

    
    public UpdateStackRequestBody addAgenciesItem(Agency agenciesItem) {
        if(this.agencies == null) {
            this.agencies = new ArrayList<>();
        }
        this.agencies.add(agenciesItem);
        return this;
    }

    public UpdateStackRequestBody withAgencies(Consumer<List<Agency>> agenciesSetter) {
        if(this.agencies == null) {
            this.agencies = new ArrayList<>();
        }
        agenciesSetter.accept(this.agencies);
        return this;
    }

    /**
     * 委托列表
     * @return agencies
     */
    public List<Agency> getAgencies() {
        return agencies;
    }

    public void setAgencies(List<Agency> agencies) {
        this.agencies = agencies;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateStackRequestBody updateStackRequestBody = (UpdateStackRequestBody) o;
        return Objects.equals(this.stackId, updateStackRequestBody.stackId) &&
            Objects.equals(this.description, updateStackRequestBody.description) &&
            Objects.equals(this.enableDeletionProtection, updateStackRequestBody.enableDeletionProtection) &&
            Objects.equals(this.enableAutoRollback, updateStackRequestBody.enableAutoRollback) &&
            Objects.equals(this.agencies, updateStackRequestBody.agencies);
    }
    @Override
    public int hashCode() {
        return Objects.hash(stackId, description, enableDeletionProtection, enableAutoRollback, agencies);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateStackRequestBody {\n");
        sb.append("    stackId: ").append(toIndentedString(stackId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enableDeletionProtection: ").append(toIndentedString(enableDeletionProtection)).append("\n");
        sb.append("    enableAutoRollback: ").append(toIndentedString(enableAutoRollback)).append("\n");
        sb.append("    agencies: ").append(toIndentedString(agencies)).append("\n");
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

