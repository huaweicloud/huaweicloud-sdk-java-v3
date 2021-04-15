package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.AppQuotaAppBinding;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class AssociateAppsForAppQuotaResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="applies")
    
    private List<AppQuotaAppBinding> applies = null;
    
    public AssociateAppsForAppQuotaResponse withApplies(List<AppQuotaAppBinding> applies) {
        this.applies = applies;
        return this;
    }

    
    public AssociateAppsForAppQuotaResponse addAppliesItem(AppQuotaAppBinding appliesItem) {
        if(this.applies == null) {
            this.applies = new ArrayList<>();
        }
        this.applies.add(appliesItem);
        return this;
    }

    public AssociateAppsForAppQuotaResponse withApplies(Consumer<List<AppQuotaAppBinding>> appliesSetter) {
        if(this.applies == null) {
            this.applies = new ArrayList<>();
        }
        appliesSetter.accept(this.applies);
        return this;
    }

    /**
     * 客户端应用与客户端配额绑定列表
     * @return applies
     */
    public List<AppQuotaAppBinding> getApplies() {
        return applies;
    }

    public void setApplies(List<AppQuotaAppBinding> applies) {
        this.applies = applies;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssociateAppsForAppQuotaResponse associateAppsForAppQuotaResponse = (AssociateAppsForAppQuotaResponse) o;
        return Objects.equals(this.applies, associateAppsForAppQuotaResponse.applies);
    }
    @Override
    public int hashCode() {
        return Objects.hash(applies);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateAppsForAppQuotaResponse {\n");
        sb.append("    applies: ").append(toIndentedString(applies)).append("\n");
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

