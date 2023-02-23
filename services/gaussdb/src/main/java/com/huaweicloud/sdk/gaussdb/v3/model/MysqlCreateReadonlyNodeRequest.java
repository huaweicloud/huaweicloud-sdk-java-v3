package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 只读节点信息
 */
public class MysqlCreateReadonlyNodeRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="priorities")
    
    private List<Integer> priorities = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_auto_pay")
    

    private String isAutoPay;

    public MysqlCreateReadonlyNodeRequest withPriorities(List<Integer> priorities) {
        this.priorities = priorities;
        return this;
    }

    
    public MysqlCreateReadonlyNodeRequest addPrioritiesItem(Integer prioritiesItem) {
        if(this.priorities == null) {
            this.priorities = new ArrayList<>();
        }
        this.priorities.add(prioritiesItem);
        return this;
    }

    public MysqlCreateReadonlyNodeRequest withPriorities(Consumer<List<Integer>> prioritiesSetter) {
        if(this.priorities == null) {
            this.priorities = new ArrayList<>();
        }
        prioritiesSetter.accept(this.priorities);
        return this;
    }

    /**
     * 指定创建的只读节点故障倒换优先级。  故障倒换优先级的取值范围为1~16，数字越小，优先级越大，即故障倒换时，主节点会优先倒换到优先级高的备节点上，优先级相同的备节点选为主节点的概率相同。最多支持9个备节点设置故障倒换优先级，超过9个的备节点优先级默认为-1，表示不会参与倒换。可通过修改节点的故障倒换优先级来进行调整。
     * @return priorities
     */
    public List<Integer> getPriorities() {
        return priorities;
    }

    public void setPriorities(List<Integer> priorities) {
        this.priorities = priorities;
    }

    

    public MysqlCreateReadonlyNodeRequest withIsAutoPay(String isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    


    /**
     * 创建包周期时可指定，表示是否自动从客户的账户中支付，此字段不影响自动续订的支付方式。  - true，为自动支付，默认该方式。 - false，为手动支付。
     * @return isAutoPay
     */
    public String getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(String isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MysqlCreateReadonlyNodeRequest mysqlCreateReadonlyNodeRequest = (MysqlCreateReadonlyNodeRequest) o;
        return Objects.equals(this.priorities, mysqlCreateReadonlyNodeRequest.priorities) &&
            Objects.equals(this.isAutoPay, mysqlCreateReadonlyNodeRequest.isAutoPay);
    }
    @Override
    public int hashCode() {
        return Objects.hash(priorities, isAutoPay);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlCreateReadonlyNodeRequest {\n");
        sb.append("    priorities: ").append(toIndentedString(priorities)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
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

