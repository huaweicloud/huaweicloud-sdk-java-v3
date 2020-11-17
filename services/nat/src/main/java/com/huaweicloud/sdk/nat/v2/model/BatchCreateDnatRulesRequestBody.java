package com.huaweicloud.sdk.nat.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.nat.v2.model.CreateNatGatewayDnatOption;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class BatchCreateDnatRulesRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dnat_rules")
    
    private List<CreateNatGatewayDnatOption> dnatRules = new ArrayList<>();
    
    public BatchCreateDnatRulesRequestBody withDnatRules(List<CreateNatGatewayDnatOption> dnatRules) {
        this.dnatRules = dnatRules;
        return this;
    }

    
    public BatchCreateDnatRulesRequestBody addDnatRulesItem(CreateNatGatewayDnatOption dnatRulesItem) {
        this.dnatRules.add(dnatRulesItem);
        return this;
    }

    public BatchCreateDnatRulesRequestBody withDnatRules(Consumer<List<CreateNatGatewayDnatOption>> dnatRulesSetter) {
        if(this.dnatRules == null ){
            this.dnatRules = new ArrayList<>();
        }
        dnatRulesSetter.accept(this.dnatRules);
        return this;
    }

    /**
     * DNAT规则批量创建对象的请求体。
     * @return dnatRules
     */
    public List<CreateNatGatewayDnatOption> getDnatRules() {
        return dnatRules;
    }

    public void setDnatRules(List<CreateNatGatewayDnatOption> dnatRules) {
        this.dnatRules = dnatRules;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchCreateDnatRulesRequestBody batchCreateDnatRulesRequestBody = (BatchCreateDnatRulesRequestBody) o;
        return Objects.equals(this.dnatRules, batchCreateDnatRulesRequestBody.dnatRules);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dnatRules);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateDnatRulesRequestBody {\n");
        sb.append("    dnatRules: ").append(toIndentedString(dnatRules)).append("\n");
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

