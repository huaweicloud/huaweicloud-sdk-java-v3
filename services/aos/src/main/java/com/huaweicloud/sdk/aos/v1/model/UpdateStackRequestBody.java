package com.huaweicloud.sdk.aos.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aos.v1.model.AgenciesPrimitiveTypeHolder;
import com.huaweicloud.sdk.aos.v1.model.Agency;
import com.huaweicloud.sdk.aos.v1.model.EnableAutoRollbackPrimitiveTypeHolder;
import com.huaweicloud.sdk.aos.v1.model.EnableDeletionProtectionPrimitiveTypeHolder;
import com.huaweicloud.sdk.aos.v1.model.StackDescriptionPrimitiveTypeHolder;
import com.huaweicloud.sdk.aos.v1.model.StackIdPrimitiveTypeHolder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UpdateStackRequestBody
 */
public class UpdateStackRequestBody  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stack_id")
    

    private String stackId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_deletion_protection")
    

    private Boolean enableDeletionProtection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_auto_rollback")
    

    private Boolean enableAutoRollback;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="agencies")
    
    private List<Agency> agencies = null;
    
    public UpdateStackRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 资源栈的描述。可用于客户识别自己的资源栈。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public UpdateStackRequestBody withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    


    /**
     * 资源栈（stack）的唯一Id。  此Id由资源编排服务在生成资源栈的时候生成，为UUID。  由于资源栈名仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的资源栈，删除，再重新创建一个同名资源栈。  对于团队并行开发，用户可能希望确保，当前我操作的资源栈就是我认为的那个，而不是其他队友删除后创建的同名资源栈。因此，使用ID就可以做到强匹配。  资源编排服务保证每次创建的资源栈所对应的ID都不相同，更新不会影响ID。如果给与的stack_id和当前资源栈的ID不一致，则返回400
     * @return stackId
     */
    public String getStackId() {
        return stackId;
    }

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    

    public UpdateStackRequestBody withEnableDeletionProtection(Boolean enableDeletionProtection) {
        this.enableDeletionProtection = enableDeletionProtection;
        return this;
    }

    


    /**
     * 删除保护的标识位，如果不传默认为false，即默认不开启资源栈删除保护（删除保护开启后资源栈不允许被删除）  *在UpdateStack API中，若该参数未在RequestBody中给予，则不会对资源栈的删除保护属性进行更新*
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
     * 自动回滚的标识位，如果不传默认为false，即默认不开启资源栈自动回滚（自动回滚开启后，如果部署失败，则会自动回滚，并返回上一个稳定状态）  *在UpdateStack API中，若该参数未在RequestBody中给予，则不会对资源栈的自动回滚属性进行更新*
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
     * 委托授权的信息。
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
        return Objects.equals(this.description, updateStackRequestBody.description) &&
            Objects.equals(this.stackId, updateStackRequestBody.stackId) &&
            Objects.equals(this.enableDeletionProtection, updateStackRequestBody.enableDeletionProtection) &&
            Objects.equals(this.enableAutoRollback, updateStackRequestBody.enableAutoRollback) &&
            Objects.equals(this.agencies, updateStackRequestBody.agencies);
    }
    @Override
    public int hashCode() {
        return Objects.hash(description, stackId, enableDeletionProtection, enableAutoRollback, agencies);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateStackRequestBody {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    stackId: ").append(toIndentedString(stackId)).append("\n");
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

